package enterprise.mtx.services.reporter;

public class ReportingWSProxy implements enterprise.mtx.services.reporter.ReportingWS {
  private String _endpoint = null;
  private enterprise.mtx.services.reporter.ReportingWS reportingWS = null;
  
  public ReportingWSProxy() {
    _initReportingWSProxy();
  }
  
  public ReportingWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initReportingWSProxy();
  }
  
  private void _initReportingWSProxy() {
    try {
      reportingWS = (new enterprise.mtx.services.reporter.ReportingWSServiceLocator()).getReportingWSPort();
      if (reportingWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)reportingWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)reportingWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (reportingWS != null)
      ((javax.xml.rpc.Stub)reportingWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public enterprise.mtx.services.reporter.ReportingWS getReportingWS() {
    if (reportingWS == null)
      _initReportingWSProxy();
    return reportingWS;
  }
  
  public enterprise.mtx.services.reporter.ReportDTO generate() throws java.rmi.RemoteException{
    if (reportingWS == null)
      _initReportingWSProxy();
    return reportingWS.generate();
  }
  
  
}