//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.30 at 03:21:41 PM MDT 
//


package co.com.foundation.javeriana.sandbox.model.input;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.swa.sandbox.model.input package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.swa.sandbox.model.input
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightLegRequest }
     * 
     */
    public FlightLegRequest createFlightLegRequest() {
        return new FlightLegRequest();
    }

    /**
     * Create an instance of {@link FlightLegRequest.FlightIdentifier }
     * 
     */
    public FlightLegRequest.FlightIdentifier createFlightLegRequestFlightIdentifier() {
        return new FlightLegRequest.FlightIdentifier();
    }

    /**
     * Create an instance of {@link FlightLegRequest.DateRange }
     * 
     */
    public FlightLegRequest.DateRange createFlightLegRequestDateRange() {
        return new FlightLegRequest.DateRange();
    }

    /**
     * Create an instance of {@link FlightLegRequest.FlightIdentifier.FlightId }
     * 
     */
    public FlightLegRequest.FlightIdentifier.FlightId createFlightLegRequestFlightIdentifierFlightId() {
        return new FlightLegRequest.FlightIdentifier.FlightId();
    }

}
