/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author root
 */
@ServerEndpoint("/endpoint")
public class WebSocketEnd {
    
    @OnOpen
    public void OpenConnection(Session session)
    {
        try {
            session.getBasicRemote().sendText("Connection Opened by the Server");
        } catch (IOException ex) {
            Logger.getLogger(WebSocketEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @OnMessage
    public void onMessage(String message, Session session) {
        try {
            session.getBasicRemote().sendText("Server send :"+ message);
        } catch (IOException ex) {
            Logger.getLogger(WebSocketEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @OnClose
    public void closeConnection(Session session)
    {
        try {
            session.getBasicRemote().sendText("Connection Closed");
        } catch (IOException ex) {
            Logger.getLogger(WebSocketEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
