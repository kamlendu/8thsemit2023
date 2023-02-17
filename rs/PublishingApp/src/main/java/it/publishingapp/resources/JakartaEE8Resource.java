package it.publishingapp.resources;

import ejb.PublishingBeanLocal;
import entity.Address;
import entity.Customer;
import entity.Subscription;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author 
 */
@Path("rest")
public class JakartaEE8Resource {
    @EJB 
    PublishingBeanLocal pbl;
    
     @Context
    private UriInfo context;

    public JakartaEE8Resource() {
       
    }
   
     /**
     * Retrieves representation of an instance of rest.PublishResource
     * @param firstName
     * @param lastName
     */
    
    @POST
    @Path("addcust/{firstName}/{lastName}")
    public void createCustomer(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
       pbl.createCustomer(firstName, lastName);
    }

    @PUT
    @Path("updatecust/{cid}/{firstName}/{lastName}")
    public void updateCustomer(@PathParam("cid") Integer custId, @PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        pbl.updateCustomer(custId, firstName, lastName);
    
    }

    
   @Path("deletecust/{cid}")
   @DELETE
    public void removeCustomer(@PathParam("cid") Integer custId) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      pbl.removeCustomer(custId);
    }

    @GET
    @Produces("application/json")
    public Collection<Customer> getAllCustomers() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
     return pbl.getAllCustomers();
    }

    @GET
    @Path("getcustbyid/{cid}")
    @Produces("application/json")
    public Customer getCustomerById(@PathParam("cid") Integer custId) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    return pbl.getCustomerById(custId);
    }

    @GET
    @Path("getcustbyfname/{fname}")
    @Produces("application/json")
    public Collection<Customer> getCustomerByFirstName(@PathParam("fname") String firstName) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
       
       return pbl.getCustomerByFirstName(firstName);
    
    }

    @GET
    @Path("getcustbylname/{lname}")
    @Produces("application/json")
    public Collection<Customer> getCustomerByLastName(@PathParam("lname") String lastName) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
     return pbl.getCustomerByLastName(lastName);
    }

    @POST
    @Path("addaddress/{street}/{city}/{state}/{zip}/{cid}")
    public void addAddressToCustomer(@PathParam("street") String street, @PathParam("city") String city, @PathParam("state") String state, @PathParam("zip") String zip, @PathParam("cid") Integer custId) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         pbl.addAddressToCustomer(street, city, state, zip, custId);
    
    }

    
   
    @DELETE
    @Path("rmaddress/{aid}/{cid}")
    public void removeAddressOfCustomer(@PathParam("aid") Integer aid, @PathParam("cid") Integer custId) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      pbl.removeAddressOfCustomer(aid, custId);
    }

    @GET
    @Path("getaddressesofccust/{cid}")
    @Produces("application/json")
    public Collection<Address> getAddressesOfCustomer(@PathParam("cid") Integer custId) {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      
    return pbl.getAddressesOfCustomer(custId);
    }

    
    

    @POST
    @Path("addsubs/{title}/{type}")
    public void addSubscription(@PathParam("title") String title, @PathParam("type") String type) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    pbl.addSubscription(title, type);
    
    }

    
   @DELETE
   @Path("remsubs/{sid}")
    public void removeSubscription(@PathParam("sid") Integer sid) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   pbl.removeSubscription(sid);
    
    
    }

    @POST
    @Path("addsubstocust/{cid}")
    @Consumes("application/json")
    public void addSubscriptionsToCustomer( @PathParam("cid") Integer custId, Collection<Integer> sids) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    pbl.addSubscriptionsToCustomer(custId, sids);
    
    
    }

    @POST
    @Path("remsubstocust/{cid}")
    @Consumes("application/json")
    public void removeSubscriptionsFromCustomer(@PathParam("cid") Integer custId, Collection<Integer> sids) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     
       pbl.removeSubscriptionsFromCustomer(custId, sids);
    }

    @GET
    @Path("getsubsofcust/{cid}")
    @Produces("application/json")
    public Collection<Subscription> getSubscriptionsOfCustomer(@PathParam("cid") Integer custId) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
 
       return pbl.getSubscriptionsOfCustomer(custId);
    }
}
