/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.BookMaster;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class DataBean implements DataBeanLocal {
    
    @PersistenceContext(unitName = "JPAPU")
    EntityManager em;
    
    

    @Override
    public Collection<BookMaster> getAllBooks() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
       Collection<BookMaster> books = em.createNamedQuery("BookMaster.findAll").getResultList();
       return books;
    }

    @Override
    public void insertBook(String bookName, String authorName, String pubName, String Synopsis) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
      BookMaster book = new BookMaster();
      book.setBookName(bookName);
      book.setAuthorName(authorName);
      book.setPublisherName(pubName);
      book.setSynopsis(Synopsis);
      
      em.persist(book);
    
    
    }

    @Override
    public void updateBook(Integer bookId, String bookName, String authorName, String pubName, String Synopsis) {
  //      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    BookMaster book = (BookMaster) em.find(BookMaster.class, bookId);
    book.setBookName(bookName);
      book.setAuthorName(authorName);
      book.setPublisherName(pubName);
      book.setSynopsis(Synopsis);
      
      em.merge(book);
    
    }

    @Override
    public void removeBook(Integer bookId) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   BookMaster book = (BookMaster) em.find(BookMaster.class, bookId);
   
   em.remove(book);
    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")




}
