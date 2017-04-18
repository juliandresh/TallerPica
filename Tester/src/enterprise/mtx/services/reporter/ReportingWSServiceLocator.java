/**
 * ReportingWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package enterprise.mtx.services.reporter;

public class ReportingWSServiceLocator extends org.apache.axis.client.Service implements enterprise.mtx.services.reporter.ReportingWSService {

    public ReportingWSServiceLocator() {
    }


    public ReportingWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReportingWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReportingWSPort
    private java.lang.String ReportingWSPort_address = "http://localhost:9696/mtx-reporting-service/ReportingWS";

    public java.lang.String getReportingWSPortAddress() {
        return ReportingWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReportingWSPortWSDDServiceName = "ReportingWSPort";

    public java.lang.String getReportingWSPortWSDDServiceName() {
        return ReportingWSPortWSDDServiceName;
    }

    public void setReportingWSPortWSDDServiceName(java.lang.String name) {
        ReportingWSPortWSDDServiceName = name;
    }

    public enterprise.mtx.services.reporter.ReportingWS getReportingWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReportingWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReportingWSPort(endpoint);
    }

    public enterprise.mtx.services.reporter.ReportingWS getReportingWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            enterprise.mtx.services.reporter.ReportingWSServiceSoapBindingStub _stub = new enterprise.mtx.services.reporter.ReportingWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReportingWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReportingWSPortEndpointAddress(java.lang.String address) {
        ReportingWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (enterprise.mtx.services.reporter.ReportingWS.class.isAssignableFrom(serviceEndpointInterface)) {
                enterprise.mtx.services.reporter.ReportingWSServiceSoapBindingStub _stub = new enterprise.mtx.services.reporter.ReportingWSServiceSoapBindingStub(new java.net.URL(ReportingWSPort_address), this);
                _stub.setPortName(getReportingWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReportingWSPort".equals(inputPortName)) {
            return getReportingWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mtx.enterprise/services/reporter", "ReportingWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mtx.enterprise/services/reporter", "ReportingWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReportingWSPort".equals(portName)) {
            setReportingWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
