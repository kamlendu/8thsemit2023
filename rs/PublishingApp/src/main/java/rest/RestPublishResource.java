/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package rest;

import ejb.PublishingBeanLocal;
import entity.Address;
import entity.Customer;
import entity.Subscription;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author root
 */
@Path("publish")
@RequestScoped
public class RestPublishResource {
    
    @EJB PublishingBeanLocal pbl;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestPublishResource
     */
    public RestPublishResource() {
    }

    
    
    @POST
    @Path("cratecust/{fname}/{lname}")        
   public void createCustomer(@PathParam("fname") String firstName, @PathParam("lname") String lastName)
    {
        pbl.createCustomer(firstName, lastName);
    }
    
    @PUT
    @Path("updatecust/{cid}/{fname}/{lname}")  
   public void updateCustomer( @PathParam("cid") Integer custId, @PathParam("fname") String firstName,@PathParam("lname") String lastName)
    {
        pbl.updateCustomer(custId, firstName, lastName);
    }
      
    @DELETE
    @Path("deletecust/{cid}")        
   public void removeCustomer(@PathParam("cid") Integer custId){
        
        pbl.removeCustomer(custId);
        
    }
  // Customer Fetch
    
    @GET
    @Produces("application/json")        
   public Collection<Customer> getAllCustomers(){
        
        return pbl.getAllCustomers();
    }
    
    @GET
    @Path("getcustbyid/{cid}")
    @Produces("application/json")       
   public Customer getCustomerById(@PathParam("cid") Integer custId){
        
        return pbl.getCustomerById(custId);
    }
    
    @GET
    @Path("getcustbyfname/{fname}")
    @Produces("application/json") 
  public Collection<Customer>  getCustomerByFirstName(@PathParam("fname") String firstName)
    {
       return pbl.getCustomerByFirstName(firstName);
    }
    
    @GET
    @Path("getcustbylname/{lname}")
    @Produces("application/json") 
  public  Collection<Customer>  getCustomerByLastName(@PathParam("lname") String lastName)
    {
      return  pbl.getCustomerByLastName(lastName);
    }
    
    // Address
        // CRUD
    
    @POST
    @Path("addaddress/{street}/{city}/{state}/{zip}/{cid}")        
   public void addAddressToCustomer(@PathParam("street") String street, @PathParam("city") String city, @PathParam("state") String state, @PathParam("zip") String zip, @PathParam("cid") Integer custId){
        
        pbl.addAddressToCustomer(street, city, state, zip, custId);
    }
   
//    void updateAddressToCustomer( Integer aid, String street, String city, String state, String zip, Integer custId){
//        
//        pbl.updateAddressToCustomer(aid, street, city, state, zip, custId);
//    }
   @DELETE
   @Path("remaddress/{aid}/{cid}")         
  public  void removeAddressOfCustomer(@PathParam("aid") Integer aid, @PathParam("cid") Integer custId){
            
            pbl.removeAddressOfCustomer(aid, custId);
            
        }
    // Fetch
      
    @GET
    @Path("getaddressesofcust/{cid}") 
    @Produces("application/json")          
  public Collection<Address> getAddressesOfCustomer(@PathParam("cid") Integer custId){
          
          return pbl.getAddressesOfCustomer(custId);
      }
//      Collection<Address> getAddressesByCity(String city){
//          
//      }
//      Collection<Address> getAddressesByState(String state){
//          
//      }
//      Collection<Address> getAddressesByZip(String zip){
//          
//      }
//      Collection<Address> getAddresses(String city, String State){
//          
//      }
      
      // Subscription
        // CRUD
   
   @POST
   @Path("addsubs/{title}/{type}")           
   public   void addSubscription(@PathParam("title") String title, @PathParam("type") String type){
          
          pbl.addSubscription(title, type);
          
      }
//      void updateSubscription(Integer sid, String title, String type){
//          pbl.updateSubscription(sid, title, type);
//      }
   @DELETE
   @Path("remsubs/{sid}")
   public void removeSubscription(@PathParam("sid") Integer sid){
          
          pbl.removeSubscription(sid);
          
      }
   
      @POST
      @Path("addsubstocust/{cid}") 
      @Consumes("application/json")        
    public  void addSubscriptionsToCustomer(@PathParam("cid") Integer custId, Collection<Integer> sids){
         pbl.addSubscriptionsToCustomer(custId, sids);
          
      }
      
      @POST
      @Path("removesubstocust/{cid}")  
      @Consumes("application/json")           
   public   void removeSubscriptionsFromCustomer(@PathParam("cid") Integer custId, Collection<Integer> sids)
      {
          pbl.removeSubscriptionsFromCustomer(custId, sids);
      }
          
      
      
      // Fetch
      
      @GET
      @Path("getsubsofcust/{cid}")   
      @Produces("application/json")        
   public   Collection<Subscription> getSubscriptionsOfCustomer(@PathParam("cid") Integer custId){
          
          return pbl.getSubscriptionsOfCustomer(custId);
          
      }
      
      @GET
      @Path("getallsubs")  
      @Produces("application/json")        
    public  Collection<Subscription> getAllSubscriptions(){
          
        return  pbl.getAllSubscriptions();
          
      }
//      Collection<Subscription> getAllSubscriptionsByType(String type){
//          
//          
//          
//      }
//      Subscription getSubscriptionByTitle(String title){
//          
//      }
      
}
