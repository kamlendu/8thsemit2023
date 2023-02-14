/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package it.jpacommandapp;

import entity.BookMaster;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author root
 */
public class JPACommandApp {
    
    EntityManagerFactory emf;
    EntityManager em;
    

    public JPACommandApp() {
        
        emf = Persistence.createEntityManagerFactory("MYPU");
        em = emf.createEntityManager();
        
        
    }
    
    
    

    public static void main(String[] args) {
        JPACommandApp app = new JPACommandApp();
        //app.insertBook("The Green Lantern", "Nova Iyer", "TMH", "A Marvel Series");
       // app.updateBook(364, "The Red Lantern", "Nova Iyer", "RSP", "A Marvel");
        app.removeBook(364);
        app.getAllBooks();
    }
    
    
    
    public void getAllBooks() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
       Collection<BookMaster> books = em.createNamedQuery("BookMaster.findAll").getResultList();
       for(BookMaster b : books)
       {
           System.out.println("\nid = "+ b.getBookID()+ "  Name : "+ b.getBookName());
       }
       
    }
    
    
    public void insertBook(String bookName, String authorName, String pubName, String Synopsis) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
      BookMaster book = new BookMaster();
      book.setBookName(bookName);
      book.setAuthorName(authorName);
      book.setPublisherName(pubName);
      book.setSynopsis(Synopsis);
      
      em.getTransaction().begin();
      
      em.persist(book);
      
      em.getTransaction().commit();
    
    
    }
    
    
    public void updateBook(Integer bookId, String bookName, String authorName, String pubName, String Synopsis) {
  //      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    BookMaster book = (BookMaster) em.find(BookMaster.class, bookId);
    book.setBookName(bookName);
      book.setAuthorName(authorName);
      book.setPublisherName(pubName);
      book.setSynopsis(Synopsis);
       em.getTransaction().begin();
      
      em.merge(book);
      
      em.getTransaction().commit();
    
    }
    
    
    public void removeBook(Integer bookId) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   BookMaster book = (BookMaster) em.find(BookMaster.class, bookId);
   
   em.getTransaction().begin();
      
      em.remove(book);
      
      em.getTransaction().commit();
    
    
    }
    
}
