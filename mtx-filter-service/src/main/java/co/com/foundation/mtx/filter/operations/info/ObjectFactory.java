//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.07 a las 04:01:49 PM COT 
//


package co.com.foundation.mtx.filter.operations.info;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.foundation.mtx.filter.operations.info package. 
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

    private final static QName _PropertyValue_QNAME = new QName("", "property-value");
    private final static QName _PropertyType_QNAME = new QName("", "property-type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.foundation.mtx.filter.operations.info
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationalCaptures }
     * 
     */
    public OperationalCaptures createOperationalCaptures() {
        return new OperationalCaptures();
    }

    /**
     * Create an instance of {@link PairRecord }
     * 
     */
    public PairRecord createPairRecord() {
        return new PairRecord();
    }

    /**
     * Create an instance of {@link ScheduledCaptures }
     * 
     */
    public ScheduledCaptures createScheduledCaptures() {
        return new ScheduledCaptures();
    }

    /**
     * Create an instance of {@link AircraftInformation }
     * 
     */
    public AircraftInformation createAircraftInformation() {
        return new AircraftInformation();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link CommonCaptures }
     * 
     */
    public CommonCaptures createCommonCaptures() {
        return new CommonCaptures();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "property-value")
    public JAXBElement<String> createPropertyValue(String value) {
        return new JAXBElement<String>(_PropertyValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "property-type")
    public JAXBElement<String> createPropertyType(String value) {
        return new JAXBElement<String>(_PropertyType_QNAME, String.class, null, value);
    }

}
