
package pclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddAddressToCustomer_QNAME = new QName("http://ejb/", "addAddressToCustomer");
    private final static QName _AddAddressToCustomerResponse_QNAME = new QName("http://ejb/", "addAddressToCustomerResponse");
    private final static QName _AddSubscription_QNAME = new QName("http://ejb/", "addSubscription");
    private final static QName _AddSubscriptionResponse_QNAME = new QName("http://ejb/", "addSubscriptionResponse");
    private final static QName _AddSubscriptionsToCustomer_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomer");
    private final static QName _AddSubscriptionsToCustomerResponse_QNAME = new QName("http://ejb/", "addSubscriptionsToCustomerResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://ejb/", "createCustomer");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://ejb/", "createCustomerResponse");
    private final static QName _GetAddresses_QNAME = new QName("http://ejb/", "getAddresses");
    private final static QName _GetAddressesByCity_QNAME = new QName("http://ejb/", "getAddressesByCity");
    private final static QName _GetAddressesByCityResponse_QNAME = new QName("http://ejb/", "getAddressesByCityResponse");
    private final static QName _GetAddressesByState_QNAME = new QName("http://ejb/", "getAddressesByState");
    private final static QName _GetAddressesByStateResponse_QNAME = new QName("http://ejb/", "getAddressesByStateResponse");
    private final static QName _GetAddressesByZip_QNAME = new QName("http://ejb/", "getAddressesByZip");
    private final static QName _GetAddressesByZipResponse_QNAME = new QName("http://ejb/", "getAddressesByZipResponse");
    private final static QName _GetAddressesOfCustomer_QNAME = new QName("http://ejb/", "getAddressesOfCustomer");
    private final static QName _GetAddressesOfCustomerResponse_QNAME = new QName("http://ejb/", "getAddressesOfCustomerResponse");
    private final static QName _GetAddressesResponse_QNAME = new QName("http://ejb/", "getAddressesResponse");
    private final static QName _GetAllCustomers_QNAME = new QName("http://ejb/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://ejb/", "getAllCustomersResponse");
    private final static QName _GetAllSubscriptions_QNAME = new QName("http://ejb/", "getAllSubscriptions");
    private final static QName _GetAllSubscriptionsByType_QNAME = new QName("http://ejb/", "getAllSubscriptionsByType");
    private final static QName _GetAllSubscriptionsByTypeResponse_QNAME = new QName("http://ejb/", "getAllSubscriptionsByTypeResponse");
    private final static QName _GetAllSubscriptionsResponse_QNAME = new QName("http://ejb/", "getAllSubscriptionsResponse");
    private final static QName _GetCustomerByFirstName_QNAME = new QName("http://ejb/", "getCustomerByFirstName");
    private final static QName _GetCustomerByFirstNameResponse_QNAME = new QName("http://ejb/", "getCustomerByFirstNameResponse");
    private final static QName _GetCustomerById_QNAME = new QName("http://ejb/", "getCustomerById");
    private final static QName _GetCustomerByIdResponse_QNAME = new QName("http://ejb/", "getCustomerByIdResponse");
    private final static QName _GetCustomerByLastName_QNAME = new QName("http://ejb/", "getCustomerByLastName");
    private final static QName _GetCustomerByLastNameResponse_QNAME = new QName("http://ejb/", "getCustomerByLastNameResponse");
    private final static QName _GetSubscriptionByTitle_QNAME = new QName("http://ejb/", "getSubscriptionByTitle");
    private final static QName _GetSubscriptionByTitleResponse_QNAME = new QName("http://ejb/", "getSubscriptionByTitleResponse");
    private final static QName _GetSubscriptionsOfCustomer_QNAME = new QName("http://ejb/", "getSubscriptionsOfCustomer");
    private final static QName _GetSubscriptionsOfCustomerResponse_QNAME = new QName("http://ejb/", "getSubscriptionsOfCustomerResponse");
    private final static QName _RemoveAddressOfCustomer_QNAME = new QName("http://ejb/", "removeAddressOfCustomer");
    private final static QName _RemoveAddressOfCustomerResponse_QNAME = new QName("http://ejb/", "removeAddressOfCustomerResponse");
    private final static QName _RemoveCustomer_QNAME = new QName("http://ejb/", "removeCustomer");
    private final static QName _RemoveCustomerResponse_QNAME = new QName("http://ejb/", "removeCustomerResponse");
    private final static QName _RemoveSubscription_QNAME = new QName("http://ejb/", "removeSubscription");
    private final static QName _RemoveSubscriptionResponse_QNAME = new QName("http://ejb/", "removeSubscriptionResponse");
    private final static QName _RemoveSubscriptionsFromCustomer_QNAME = new QName("http://ejb/", "removeSubscriptionsFromCustomer");
    private final static QName _RemoveSubscriptionsFromCustomerResponse_QNAME = new QName("http://ejb/", "removeSubscriptionsFromCustomerResponse");
    private final static QName _UpdateAddressToCustomer_QNAME = new QName("http://ejb/", "updateAddressToCustomer");
    private final static QName _UpdateAddressToCustomerResponse_QNAME = new QName("http://ejb/", "updateAddressToCustomerResponse");
    private final static QName _UpdateCustomer_QNAME = new QName("http://ejb/", "updateCustomer");
    private final static QName _UpdateCustomerResponse_QNAME = new QName("http://ejb/", "updateCustomerResponse");
    private final static QName _UpdateSubscription_QNAME = new QName("http://ejb/", "updateSubscription");
    private final static QName _UpdateSubscriptionResponse_QNAME = new QName("http://ejb/", "updateSubscriptionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAddressToCustomer }
     * 
     */
    public AddAddressToCustomer createAddAddressToCustomer() {
        return new AddAddressToCustomer();
    }

    /**
     * Create an instance of {@link AddAddressToCustomerResponse }
     * 
     */
    public AddAddressToCustomerResponse createAddAddressToCustomerResponse() {
        return new AddAddressToCustomerResponse();
    }

    /**
     * Create an instance of {@link AddSubscription }
     * 
     */
    public AddSubscription createAddSubscription() {
        return new AddSubscription();
    }

    /**
     * Create an instance of {@link AddSubscriptionResponse }
     * 
     */
    public AddSubscriptionResponse createAddSubscriptionResponse() {
        return new AddSubscriptionResponse();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomer }
     * 
     */
    public AddSubscriptionsToCustomer createAddSubscriptionsToCustomer() {
        return new AddSubscriptionsToCustomer();
    }

    /**
     * Create an instance of {@link AddSubscriptionsToCustomerResponse }
     * 
     */
    public AddSubscriptionsToCustomerResponse createAddSubscriptionsToCustomerResponse() {
        return new AddSubscriptionsToCustomerResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAddresses }
     * 
     */
    public GetAddresses createGetAddresses() {
        return new GetAddresses();
    }

    /**
     * Create an instance of {@link GetAddressesByCity }
     * 
     */
    public GetAddressesByCity createGetAddressesByCity() {
        return new GetAddressesByCity();
    }

    /**
     * Create an instance of {@link GetAddressesByCityResponse }
     * 
     */
    public GetAddressesByCityResponse createGetAddressesByCityResponse() {
        return new GetAddressesByCityResponse();
    }

    /**
     * Create an instance of {@link GetAddressesByState }
     * 
     */
    public GetAddressesByState createGetAddressesByState() {
        return new GetAddressesByState();
    }

    /**
     * Create an instance of {@link GetAddressesByStateResponse }
     * 
     */
    public GetAddressesByStateResponse createGetAddressesByStateResponse() {
        return new GetAddressesByStateResponse();
    }

    /**
     * Create an instance of {@link GetAddressesByZip }
     * 
     */
    public GetAddressesByZip createGetAddressesByZip() {
        return new GetAddressesByZip();
    }

    /**
     * Create an instance of {@link GetAddressesByZipResponse }
     * 
     */
    public GetAddressesByZipResponse createGetAddressesByZipResponse() {
        return new GetAddressesByZipResponse();
    }

    /**
     * Create an instance of {@link GetAddressesOfCustomer }
     * 
     */
    public GetAddressesOfCustomer createGetAddressesOfCustomer() {
        return new GetAddressesOfCustomer();
    }

    /**
     * Create an instance of {@link GetAddressesOfCustomerResponse }
     * 
     */
    public GetAddressesOfCustomerResponse createGetAddressesOfCustomerResponse() {
        return new GetAddressesOfCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAddressesResponse }
     * 
     */
    public GetAddressesResponse createGetAddressesResponse() {
        return new GetAddressesResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link GetAllSubscriptions }
     * 
     */
    public GetAllSubscriptions createGetAllSubscriptions() {
        return new GetAllSubscriptions();
    }

    /**
     * Create an instance of {@link GetAllSubscriptionsByType }
     * 
     */
    public GetAllSubscriptionsByType createGetAllSubscriptionsByType() {
        return new GetAllSubscriptionsByType();
    }

    /**
     * Create an instance of {@link GetAllSubscriptionsByTypeResponse }
     * 
     */
    public GetAllSubscriptionsByTypeResponse createGetAllSubscriptionsByTypeResponse() {
        return new GetAllSubscriptionsByTypeResponse();
    }

    /**
     * Create an instance of {@link GetAllSubscriptionsResponse }
     * 
     */
    public GetAllSubscriptionsResponse createGetAllSubscriptionsResponse() {
        return new GetAllSubscriptionsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByFirstName }
     * 
     */
    public GetCustomerByFirstName createGetCustomerByFirstName() {
        return new GetCustomerByFirstName();
    }

    /**
     * Create an instance of {@link GetCustomerByFirstNameResponse }
     * 
     */
    public GetCustomerByFirstNameResponse createGetCustomerByFirstNameResponse() {
        return new GetCustomerByFirstNameResponse();
    }

    /**
     * Create an instance of {@link GetCustomerById }
     * 
     */
    public GetCustomerById createGetCustomerById() {
        return new GetCustomerById();
    }

    /**
     * Create an instance of {@link GetCustomerByIdResponse }
     * 
     */
    public GetCustomerByIdResponse createGetCustomerByIdResponse() {
        return new GetCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByLastName }
     * 
     */
    public GetCustomerByLastName createGetCustomerByLastName() {
        return new GetCustomerByLastName();
    }

    /**
     * Create an instance of {@link GetCustomerByLastNameResponse }
     * 
     */
    public GetCustomerByLastNameResponse createGetCustomerByLastNameResponse() {
        return new GetCustomerByLastNameResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionByTitle }
     * 
     */
    public GetSubscriptionByTitle createGetSubscriptionByTitle() {
        return new GetSubscriptionByTitle();
    }

    /**
     * Create an instance of {@link GetSubscriptionByTitleResponse }
     * 
     */
    public GetSubscriptionByTitleResponse createGetSubscriptionByTitleResponse() {
        return new GetSubscriptionByTitleResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionsOfCustomer }
     * 
     */
    public GetSubscriptionsOfCustomer createGetSubscriptionsOfCustomer() {
        return new GetSubscriptionsOfCustomer();
    }

    /**
     * Create an instance of {@link GetSubscriptionsOfCustomerResponse }
     * 
     */
    public GetSubscriptionsOfCustomerResponse createGetSubscriptionsOfCustomerResponse() {
        return new GetSubscriptionsOfCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveAddressOfCustomer }
     * 
     */
    public RemoveAddressOfCustomer createRemoveAddressOfCustomer() {
        return new RemoveAddressOfCustomer();
    }

    /**
     * Create an instance of {@link RemoveAddressOfCustomerResponse }
     * 
     */
    public RemoveAddressOfCustomerResponse createRemoveAddressOfCustomerResponse() {
        return new RemoveAddressOfCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomer }
     * 
     */
    public RemoveCustomer createRemoveCustomer() {
        return new RemoveCustomer();
    }

    /**
     * Create an instance of {@link RemoveCustomerResponse }
     * 
     */
    public RemoveCustomerResponse createRemoveCustomerResponse() {
        return new RemoveCustomerResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscription }
     * 
     */
    public RemoveSubscription createRemoveSubscription() {
        return new RemoveSubscription();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionResponse }
     * 
     */
    public RemoveSubscriptionResponse createRemoveSubscriptionResponse() {
        return new RemoveSubscriptionResponse();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsFromCustomer }
     * 
     */
    public RemoveSubscriptionsFromCustomer createRemoveSubscriptionsFromCustomer() {
        return new RemoveSubscriptionsFromCustomer();
    }

    /**
     * Create an instance of {@link RemoveSubscriptionsFromCustomerResponse }
     * 
     */
    public RemoveSubscriptionsFromCustomerResponse createRemoveSubscriptionsFromCustomerResponse() {
        return new RemoveSubscriptionsFromCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateAddressToCustomer }
     * 
     */
    public UpdateAddressToCustomer createUpdateAddressToCustomer() {
        return new UpdateAddressToCustomer();
    }

    /**
     * Create an instance of {@link UpdateAddressToCustomerResponse }
     * 
     */
    public UpdateAddressToCustomerResponse createUpdateAddressToCustomerResponse() {
        return new UpdateAddressToCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomer }
     * 
     */
    public UpdateCustomer createUpdateCustomer() {
        return new UpdateCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerResponse }
     * 
     */
    public UpdateCustomerResponse createUpdateCustomerResponse() {
        return new UpdateCustomerResponse();
    }

    /**
     * Create an instance of {@link UpdateSubscription }
     * 
     */
    public UpdateSubscription createUpdateSubscription() {
        return new UpdateSubscription();
    }

    /**
     * Create an instance of {@link UpdateSubscriptionResponse }
     * 
     */
    public UpdateSubscriptionResponse createUpdateSubscriptionResponse() {
        return new UpdateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomer")
    public JAXBElement<AddAddressToCustomer> createAddAddressToCustomer(AddAddressToCustomer value) {
        return new JAXBElement<AddAddressToCustomer>(_AddAddressToCustomer_QNAME, AddAddressToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddAddressToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addAddressToCustomerResponse")
    public JAXBElement<AddAddressToCustomerResponse> createAddAddressToCustomerResponse(AddAddressToCustomerResponse value) {
        return new JAXBElement<AddAddressToCustomerResponse>(_AddAddressToCustomerResponse_QNAME, AddAddressToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscription")
    public JAXBElement<AddSubscription> createAddSubscription(AddSubscription value) {
        return new JAXBElement<AddSubscription>(_AddSubscription_QNAME, AddSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionResponse")
    public JAXBElement<AddSubscriptionResponse> createAddSubscriptionResponse(AddSubscriptionResponse value) {
        return new JAXBElement<AddSubscriptionResponse>(_AddSubscriptionResponse_QNAME, AddSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomer")
    public JAXBElement<AddSubscriptionsToCustomer> createAddSubscriptionsToCustomer(AddSubscriptionsToCustomer value) {
        return new JAXBElement<AddSubscriptionsToCustomer>(_AddSubscriptionsToCustomer_QNAME, AddSubscriptionsToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddSubscriptionsToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addSubscriptionsToCustomerResponse")
    public JAXBElement<AddSubscriptionsToCustomerResponse> createAddSubscriptionsToCustomerResponse(AddSubscriptionsToCustomerResponse value) {
        return new JAXBElement<AddSubscriptionsToCustomerResponse>(_AddSubscriptionsToCustomerResponse_QNAME, AddSubscriptionsToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddresses }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddresses }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddresses")
    public JAXBElement<GetAddresses> createGetAddresses(GetAddresses value) {
        return new JAXBElement<GetAddresses>(_GetAddresses_QNAME, GetAddresses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCity }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCity")
    public JAXBElement<GetAddressesByCity> createGetAddressesByCity(GetAddressesByCity value) {
        return new JAXBElement<GetAddressesByCity>(_GetAddressesByCity_QNAME, GetAddressesByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByCityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByCityResponse")
    public JAXBElement<GetAddressesByCityResponse> createGetAddressesByCityResponse(GetAddressesByCityResponse value) {
        return new JAXBElement<GetAddressesByCityResponse>(_GetAddressesByCityResponse_QNAME, GetAddressesByCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByState }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByState")
    public JAXBElement<GetAddressesByState> createGetAddressesByState(GetAddressesByState value) {
        return new JAXBElement<GetAddressesByState>(_GetAddressesByState_QNAME, GetAddressesByState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByStateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByStateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByStateResponse")
    public JAXBElement<GetAddressesByStateResponse> createGetAddressesByStateResponse(GetAddressesByStateResponse value) {
        return new JAXBElement<GetAddressesByStateResponse>(_GetAddressesByStateResponse_QNAME, GetAddressesByStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByZip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByZip }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByZip")
    public JAXBElement<GetAddressesByZip> createGetAddressesByZip(GetAddressesByZip value) {
        return new JAXBElement<GetAddressesByZip>(_GetAddressesByZip_QNAME, GetAddressesByZip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesByZipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesByZipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesByZipResponse")
    public JAXBElement<GetAddressesByZipResponse> createGetAddressesByZipResponse(GetAddressesByZipResponse value) {
        return new JAXBElement<GetAddressesByZipResponse>(_GetAddressesByZipResponse_QNAME, GetAddressesByZipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesOfCustomer")
    public JAXBElement<GetAddressesOfCustomer> createGetAddressesOfCustomer(GetAddressesOfCustomer value) {
        return new JAXBElement<GetAddressesOfCustomer>(_GetAddressesOfCustomer_QNAME, GetAddressesOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesOfCustomerResponse")
    public JAXBElement<GetAddressesOfCustomerResponse> createGetAddressesOfCustomerResponse(GetAddressesOfCustomerResponse value) {
        return new JAXBElement<GetAddressesOfCustomerResponse>(_GetAddressesOfCustomerResponse_QNAME, GetAddressesOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddressesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAddressesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAddressesResponse")
    public JAXBElement<GetAddressesResponse> createGetAddressesResponse(GetAddressesResponse value) {
        return new JAXBElement<GetAddressesResponse>(_GetAddressesResponse_QNAME, GetAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<GetAllCustomers>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptions }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptions")
    public JAXBElement<GetAllSubscriptions> createGetAllSubscriptions(GetAllSubscriptions value) {
        return new JAXBElement<GetAllSubscriptions>(_GetAllSubscriptions_QNAME, GetAllSubscriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsByType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsByType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptionsByType")
    public JAXBElement<GetAllSubscriptionsByType> createGetAllSubscriptionsByType(GetAllSubscriptionsByType value) {
        return new JAXBElement<GetAllSubscriptionsByType>(_GetAllSubscriptionsByType_QNAME, GetAllSubscriptionsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsByTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsByTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptionsByTypeResponse")
    public JAXBElement<GetAllSubscriptionsByTypeResponse> createGetAllSubscriptionsByTypeResponse(GetAllSubscriptionsByTypeResponse value) {
        return new JAXBElement<GetAllSubscriptionsByTypeResponse>(_GetAllSubscriptionsByTypeResponse_QNAME, GetAllSubscriptionsByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllSubscriptionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getAllSubscriptionsResponse")
    public JAXBElement<GetAllSubscriptionsResponse> createGetAllSubscriptionsResponse(GetAllSubscriptionsResponse value) {
        return new JAXBElement<GetAllSubscriptionsResponse>(_GetAllSubscriptionsResponse_QNAME, GetAllSubscriptionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByFirstName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByFirstName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByFirstName")
    public JAXBElement<GetCustomerByFirstName> createGetCustomerByFirstName(GetCustomerByFirstName value) {
        return new JAXBElement<GetCustomerByFirstName>(_GetCustomerByFirstName_QNAME, GetCustomerByFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByFirstNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByFirstNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByFirstNameResponse")
    public JAXBElement<GetCustomerByFirstNameResponse> createGetCustomerByFirstNameResponse(GetCustomerByFirstNameResponse value) {
        return new JAXBElement<GetCustomerByFirstNameResponse>(_GetCustomerByFirstNameResponse_QNAME, GetCustomerByFirstNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerById")
    public JAXBElement<GetCustomerById> createGetCustomerById(GetCustomerById value) {
        return new JAXBElement<GetCustomerById>(_GetCustomerById_QNAME, GetCustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByIdResponse")
    public JAXBElement<GetCustomerByIdResponse> createGetCustomerByIdResponse(GetCustomerByIdResponse value) {
        return new JAXBElement<GetCustomerByIdResponse>(_GetCustomerByIdResponse_QNAME, GetCustomerByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByLastName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByLastName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByLastName")
    public JAXBElement<GetCustomerByLastName> createGetCustomerByLastName(GetCustomerByLastName value) {
        return new JAXBElement<GetCustomerByLastName>(_GetCustomerByLastName_QNAME, GetCustomerByLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByLastNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCustomerByLastNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getCustomerByLastNameResponse")
    public JAXBElement<GetCustomerByLastNameResponse> createGetCustomerByLastNameResponse(GetCustomerByLastNameResponse value) {
        return new JAXBElement<GetCustomerByLastNameResponse>(_GetCustomerByLastNameResponse_QNAME, GetCustomerByLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionByTitle")
    public JAXBElement<GetSubscriptionByTitle> createGetSubscriptionByTitle(GetSubscriptionByTitle value) {
        return new JAXBElement<GetSubscriptionByTitle>(_GetSubscriptionByTitle_QNAME, GetSubscriptionByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionByTitleResponse")
    public JAXBElement<GetSubscriptionByTitleResponse> createGetSubscriptionByTitleResponse(GetSubscriptionByTitleResponse value) {
        return new JAXBElement<GetSubscriptionByTitleResponse>(_GetSubscriptionByTitleResponse_QNAME, GetSubscriptionByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsOfCustomer")
    public JAXBElement<GetSubscriptionsOfCustomer> createGetSubscriptionsOfCustomer(GetSubscriptionsOfCustomer value) {
        return new JAXBElement<GetSubscriptionsOfCustomer>(_GetSubscriptionsOfCustomer_QNAME, GetSubscriptionsOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSubscriptionsOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getSubscriptionsOfCustomerResponse")
    public JAXBElement<GetSubscriptionsOfCustomerResponse> createGetSubscriptionsOfCustomerResponse(GetSubscriptionsOfCustomerResponse value) {
        return new JAXBElement<GetSubscriptionsOfCustomerResponse>(_GetSubscriptionsOfCustomerResponse_QNAME, GetSubscriptionsOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressOfCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressOfCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressOfCustomer")
    public JAXBElement<RemoveAddressOfCustomer> createRemoveAddressOfCustomer(RemoveAddressOfCustomer value) {
        return new JAXBElement<RemoveAddressOfCustomer>(_RemoveAddressOfCustomer_QNAME, RemoveAddressOfCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAddressOfCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveAddressOfCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeAddressOfCustomerResponse")
    public JAXBElement<RemoveAddressOfCustomerResponse> createRemoveAddressOfCustomerResponse(RemoveAddressOfCustomerResponse value) {
        return new JAXBElement<RemoveAddressOfCustomerResponse>(_RemoveAddressOfCustomerResponse_QNAME, RemoveAddressOfCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomer")
    public JAXBElement<RemoveCustomer> createRemoveCustomer(RemoveCustomer value) {
        return new JAXBElement<RemoveCustomer>(_RemoveCustomer_QNAME, RemoveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeCustomerResponse")
    public JAXBElement<RemoveCustomerResponse> createRemoveCustomerResponse(RemoveCustomerResponse value) {
        return new JAXBElement<RemoveCustomerResponse>(_RemoveCustomerResponse_QNAME, RemoveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscription")
    public JAXBElement<RemoveSubscription> createRemoveSubscription(RemoveSubscription value) {
        return new JAXBElement<RemoveSubscription>(_RemoveSubscription_QNAME, RemoveSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionResponse")
    public JAXBElement<RemoveSubscriptionResponse> createRemoveSubscriptionResponse(RemoveSubscriptionResponse value) {
        return new JAXBElement<RemoveSubscriptionResponse>(_RemoveSubscriptionResponse_QNAME, RemoveSubscriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsFromCustomer")
    public JAXBElement<RemoveSubscriptionsFromCustomer> createRemoveSubscriptionsFromCustomer(RemoveSubscriptionsFromCustomer value) {
        return new JAXBElement<RemoveSubscriptionsFromCustomer>(_RemoveSubscriptionsFromCustomer_QNAME, RemoveSubscriptionsFromCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveSubscriptionsFromCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeSubscriptionsFromCustomerResponse")
    public JAXBElement<RemoveSubscriptionsFromCustomerResponse> createRemoveSubscriptionsFromCustomerResponse(RemoveSubscriptionsFromCustomerResponse value) {
        return new JAXBElement<RemoveSubscriptionsFromCustomerResponse>(_RemoveSubscriptionsFromCustomerResponse_QNAME, RemoveSubscriptionsFromCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAddressToCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAddressToCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateAddressToCustomer")
    public JAXBElement<UpdateAddressToCustomer> createUpdateAddressToCustomer(UpdateAddressToCustomer value) {
        return new JAXBElement<UpdateAddressToCustomer>(_UpdateAddressToCustomer_QNAME, UpdateAddressToCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAddressToCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateAddressToCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateAddressToCustomerResponse")
    public JAXBElement<UpdateAddressToCustomerResponse> createUpdateAddressToCustomerResponse(UpdateAddressToCustomerResponse value) {
        return new JAXBElement<UpdateAddressToCustomerResponse>(_UpdateAddressToCustomerResponse_QNAME, UpdateAddressToCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomer")
    public JAXBElement<UpdateCustomer> createUpdateCustomer(UpdateCustomer value) {
        return new JAXBElement<UpdateCustomer>(_UpdateCustomer_QNAME, UpdateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateCustomerResponse")
    public JAXBElement<UpdateCustomerResponse> createUpdateCustomerResponse(UpdateCustomerResponse value) {
        return new JAXBElement<UpdateCustomerResponse>(_UpdateCustomerResponse_QNAME, UpdateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscription }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscription")
    public JAXBElement<UpdateSubscription> createUpdateSubscription(UpdateSubscription value) {
        return new JAXBElement<UpdateSubscription>(_UpdateSubscription_QNAME, UpdateSubscription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateSubscriptionResponse")
    public JAXBElement<UpdateSubscriptionResponse> createUpdateSubscriptionResponse(UpdateSubscriptionResponse value) {
        return new JAXBElement<UpdateSubscriptionResponse>(_UpdateSubscriptionResponse_QNAME, UpdateSubscriptionResponse.class, null, value);
    }

}
