/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author root
 */
@WebService(serviceName = "HelloService")
public class HelloService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String sayHello(@WebParam(name = "name") String txt) {
        return "Hello World of SOAP based Web Services - " + txt + " !";
    }
}
