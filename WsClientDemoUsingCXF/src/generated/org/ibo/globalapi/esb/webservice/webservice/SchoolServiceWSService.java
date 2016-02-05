package org.ibo.globalapi.esb.webservice.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2013-05-12T01:02:01.574+05:30
 * Generated source version: 2.7.1
 * 
 */
@WebServiceClient(name = "SchoolServiceWSService", 
                  wsdlLocation = "http://localhost:9000/SoapContext/SoapPort?wsdl",
                  targetNamespace = "http://webservice.webservice.esb.globalapi.ibo.org/") 
public class SchoolServiceWSService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.webservice.esb.globalapi.ibo.org/", "SchoolServiceWSService");
    public final static QName SchoolServiceWSPort = new QName("http://webservice.webservice.esb.globalapi.ibo.org/", "SchoolServiceWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9000/SoapContext/SoapPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SchoolServiceWSService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9000/SoapContext/SoapPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SchoolServiceWSService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SchoolServiceWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SchoolServiceWSService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns SchoolServiceWS
     */
    @WebEndpoint(name = "SchoolServiceWSPort")
    public SchoolServiceWS getSchoolServiceWSPort() {
        return super.getPort(SchoolServiceWSPort, SchoolServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SchoolServiceWS
     */
    @WebEndpoint(name = "SchoolServiceWSPort")
    public SchoolServiceWS getSchoolServiceWSPort(WebServiceFeature... features) {
        return super.getPort(SchoolServiceWSPort, SchoolServiceWS.class, features);
    }

}