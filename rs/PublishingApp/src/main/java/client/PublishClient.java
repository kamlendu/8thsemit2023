/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/JerseyClient.java to edit this template
 */
package client;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:JakartaEE8Resource [rest]<br>
 * USAGE:
 * <pre>
 *        PublishClient client = new PublishClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author root
 */
public class PublishClient {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/PublishingApp/resources";

    public PublishClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("rest");
    }

    public void addAddressToCustomer(String street, String city, String state, String zip, String cid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addaddress/{0}/{1}/{2}/{3}/{4}", new Object[]{street, city, state, zip, cid})).request().post(null);
    }

    public void removeSubscription(String sid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("remsubs/{0}", new Object[]{sid})).request().delete();
    }

    public void addSubscription(String title, String type) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addsubs/{0}/{1}", new Object[]{title, type})).request().post(null);
    }

    public void addSubscriptionsToCustomer(Object requestEntity, String cid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("addsubstocust/{0}", new Object[]{cid})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getCustomerByLastName(Class<T> responseType, String lname) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getcustbylname/{0}", new Object[]{lname}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getCustomerById(Class<T> responseType, String cid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getcustbyid/{0}", new Object[]{cid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void removeAddressOfCustomer(String aid, String cid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("rmaddress/{0}/{1}", new Object[]{aid, cid})).request().delete();
    }

    public <T> T getAllCustomers(Class<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getAddressesOfCustomer(Class<T> responseType, String cid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getaddressesofccust/{0}", new Object[]{cid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void removeSubscriptionsFromCustomer(Object requestEntity, String cid) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("remsubstocust/{0}", new Object[]{cid})).request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public <T> T getSubscriptionsOfCustomer(Class<T> responseType, String cid) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getsubsofcust/{0}", new Object[]{cid}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T getCustomerByFirstName(Class<T> responseType, String fname) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("getcustbyfname/{0}", new Object[]{fname}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
