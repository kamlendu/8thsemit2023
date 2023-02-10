/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.BookMaster;
import java.util.Collection;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface DataBeanLocal {
    Collection<BookMaster> getAllBooks();
    void insertBook(String bookName, String authorName, String pubName, String Synopsis);
    void updateBook(Integer bookId, String bookName, String authorName, String pubName, String Synopsis);
    void removeBook(Integer bookId);

}
