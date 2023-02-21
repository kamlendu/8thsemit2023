
package pclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2.payara-p4
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PublishingBean", targetNamespace = "http://ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublishingBean {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Address>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAddresses", targetNamespace = "http://ejb/", className = "pclient.GetAddresses")
    @ResponseWrapper(localName = "getAddressesResponse", targetNamespace = "http://ejb/", className = "pclient.GetAddressesResponse")
    @Action(input = "http://ejb/PublishingBean/getAddressesRequest", output = "http://ejb/PublishingBean/getAddressesResponse")
    public List<Address> getAddresses(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Address>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAddressesByState", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByState")
    @ResponseWrapper(localName = "getAddressesByStateResponse", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByStateResponse")
    @Action(input = "http://ejb/PublishingBean/getAddressesByStateRequest", output = "http://ejb/PublishingBean/getAddressesByStateResponse")
    public List<Address> getAddressesByState(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Address>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAddressesByZip", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByZip")
    @ResponseWrapper(localName = "getAddressesByZipResponse", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByZipResponse")
    @Action(input = "http://ejb/PublishingBean/getAddressesByZipRequest", output = "http://ejb/PublishingBean/getAddressesByZipResponse")
    public List<Address> getAddressesByZip(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addSubscription", targetNamespace = "http://ejb/", className = "pclient.AddSubscription")
    @ResponseWrapper(localName = "addSubscriptionResponse", targetNamespace = "http://ejb/", className = "pclient.AddSubscriptionResponse")
    @Action(input = "http://ejb/PublishingBean/addSubscriptionRequest", output = "http://ejb/PublishingBean/addSubscriptionResponse")
    public void addSubscription(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateSubscription", targetNamespace = "http://ejb/", className = "pclient.UpdateSubscription")
    @ResponseWrapper(localName = "updateSubscriptionResponse", targetNamespace = "http://ejb/", className = "pclient.UpdateSubscriptionResponse")
    @Action(input = "http://ejb/PublishingBean/updateSubscriptionRequest", output = "http://ejb/PublishingBean/updateSubscriptionResponse")
    public void updateSubscription(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeSubscription", targetNamespace = "http://ejb/", className = "pclient.RemoveSubscription")
    @ResponseWrapper(localName = "removeSubscriptionResponse", targetNamespace = "http://ejb/", className = "pclient.RemoveSubscriptionResponse")
    @Action(input = "http://ejb/PublishingBean/removeSubscriptionRequest", output = "http://ejb/PublishingBean/removeSubscriptionResponse")
    public void removeSubscription(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addSubscriptionsToCustomer", targetNamespace = "http://ejb/", className = "pclient.AddSubscriptionsToCustomer")
    @ResponseWrapper(localName = "addSubscriptionsToCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.AddSubscriptionsToCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/addSubscriptionsToCustomerRequest", output = "http://ejb/PublishingBean/addSubscriptionsToCustomerResponse")
    public void addSubscriptionsToCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeSubscriptionsFromCustomer", targetNamespace = "http://ejb/", className = "pclient.RemoveSubscriptionsFromCustomer")
    @ResponseWrapper(localName = "removeSubscriptionsFromCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.RemoveSubscriptionsFromCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/removeSubscriptionsFromCustomerRequest", output = "http://ejb/PublishingBean/removeSubscriptionsFromCustomerResponse")
    public void removeSubscriptionsFromCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<Integer> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Subscription>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSubscriptionsOfCustomer", targetNamespace = "http://ejb/", className = "pclient.GetSubscriptionsOfCustomer")
    @ResponseWrapper(localName = "getSubscriptionsOfCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.GetSubscriptionsOfCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/getSubscriptionsOfCustomerRequest", output = "http://ejb/PublishingBean/getSubscriptionsOfCustomerResponse")
    public List<Subscription> getSubscriptionsOfCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<pclient.Subscription>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSubscriptions", targetNamespace = "http://ejb/", className = "pclient.GetAllSubscriptions")
    @ResponseWrapper(localName = "getAllSubscriptionsResponse", targetNamespace = "http://ejb/", className = "pclient.GetAllSubscriptionsResponse")
    @Action(input = "http://ejb/PublishingBean/getAllSubscriptionsRequest", output = "http://ejb/PublishingBean/getAllSubscriptionsResponse")
    public List<Subscription> getAllSubscriptions();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Subscription>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllSubscriptionsByType", targetNamespace = "http://ejb/", className = "pclient.GetAllSubscriptionsByType")
    @ResponseWrapper(localName = "getAllSubscriptionsByTypeResponse", targetNamespace = "http://ejb/", className = "pclient.GetAllSubscriptionsByTypeResponse")
    @Action(input = "http://ejb/PublishingBean/getAllSubscriptionsByTypeRequest", output = "http://ejb/PublishingBean/getAllSubscriptionsByTypeResponse")
    public List<Subscription> getAllSubscriptionsByType(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns pclient.Subscription
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSubscriptionByTitle", targetNamespace = "http://ejb/", className = "pclient.GetSubscriptionByTitle")
    @ResponseWrapper(localName = "getSubscriptionByTitleResponse", targetNamespace = "http://ejb/", className = "pclient.GetSubscriptionByTitleResponse")
    @Action(input = "http://ejb/PublishingBean/getSubscriptionByTitleRequest", output = "http://ejb/PublishingBean/getSubscriptionByTitleResponse")
    public Subscription getSubscriptionByTitle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "createCustomer", targetNamespace = "http://ejb/", className = "pclient.CreateCustomer")
    @ResponseWrapper(localName = "createCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.CreateCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/createCustomerRequest", output = "http://ejb/PublishingBean/createCustomerResponse")
    public void createCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://ejb/", className = "pclient.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.UpdateCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/updateCustomerRequest", output = "http://ejb/PublishingBean/updateCustomerResponse")
    public void updateCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeCustomer", targetNamespace = "http://ejb/", className = "pclient.RemoveCustomer")
    @ResponseWrapper(localName = "removeCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.RemoveCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/removeCustomerRequest", output = "http://ejb/PublishingBean/removeCustomerResponse")
    public void removeCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<pclient.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCustomers", targetNamespace = "http://ejb/", className = "pclient.GetAllCustomers")
    @ResponseWrapper(localName = "getAllCustomersResponse", targetNamespace = "http://ejb/", className = "pclient.GetAllCustomersResponse")
    @Action(input = "http://ejb/PublishingBean/getAllCustomersRequest", output = "http://ejb/PublishingBean/getAllCustomersResponse")
    public List<Customer> getAllCustomers();

    /**
     * 
     * @param arg0
     * @return
     *     returns pclient.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerById", targetNamespace = "http://ejb/", className = "pclient.GetCustomerById")
    @ResponseWrapper(localName = "getCustomerByIdResponse", targetNamespace = "http://ejb/", className = "pclient.GetCustomerByIdResponse")
    @Action(input = "http://ejb/PublishingBean/getCustomerByIdRequest", output = "http://ejb/PublishingBean/getCustomerByIdResponse")
    public Customer getCustomerById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerByFirstName", targetNamespace = "http://ejb/", className = "pclient.GetCustomerByFirstName")
    @ResponseWrapper(localName = "getCustomerByFirstNameResponse", targetNamespace = "http://ejb/", className = "pclient.GetCustomerByFirstNameResponse")
    @Action(input = "http://ejb/PublishingBean/getCustomerByFirstNameRequest", output = "http://ejb/PublishingBean/getCustomerByFirstNameResponse")
    public List<Customer> getCustomerByFirstName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerByLastName", targetNamespace = "http://ejb/", className = "pclient.GetCustomerByLastName")
    @ResponseWrapper(localName = "getCustomerByLastNameResponse", targetNamespace = "http://ejb/", className = "pclient.GetCustomerByLastNameResponse")
    @Action(input = "http://ejb/PublishingBean/getCustomerByLastNameRequest", output = "http://ejb/PublishingBean/getCustomerByLastNameResponse")
    public List<Customer> getCustomerByLastName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addAddressToCustomer", targetNamespace = "http://ejb/", className = "pclient.AddAddressToCustomer")
    @ResponseWrapper(localName = "addAddressToCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.AddAddressToCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/addAddressToCustomerRequest", output = "http://ejb/PublishingBean/addAddressToCustomerResponse")
    public void addAddressToCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Integer arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateAddressToCustomer", targetNamespace = "http://ejb/", className = "pclient.UpdateAddressToCustomer")
    @ResponseWrapper(localName = "updateAddressToCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.UpdateAddressToCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/updateAddressToCustomerRequest", output = "http://ejb/PublishingBean/updateAddressToCustomerResponse")
    public void updateAddressToCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        Integer arg5);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeAddressOfCustomer", targetNamespace = "http://ejb/", className = "pclient.RemoveAddressOfCustomer")
    @ResponseWrapper(localName = "removeAddressOfCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.RemoveAddressOfCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/removeAddressOfCustomerRequest", output = "http://ejb/PublishingBean/removeAddressOfCustomerResponse")
    public void removeAddressOfCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Address>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAddressesOfCustomer", targetNamespace = "http://ejb/", className = "pclient.GetAddressesOfCustomer")
    @ResponseWrapper(localName = "getAddressesOfCustomerResponse", targetNamespace = "http://ejb/", className = "pclient.GetAddressesOfCustomerResponse")
    @Action(input = "http://ejb/PublishingBean/getAddressesOfCustomerRequest", output = "http://ejb/PublishingBean/getAddressesOfCustomerResponse")
    public List<Address> getAddressesOfCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pclient.Address>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAddressesByCity", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByCity")
    @ResponseWrapper(localName = "getAddressesByCityResponse", targetNamespace = "http://ejb/", className = "pclient.GetAddressesByCityResponse")
    @Action(input = "http://ejb/PublishingBean/getAddressesByCityRequest", output = "http://ejb/PublishingBean/getAddressesByCityResponse")
    public List<Address> getAddressesByCity(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}