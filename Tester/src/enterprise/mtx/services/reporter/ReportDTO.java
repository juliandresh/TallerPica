/**
 * ReportDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package enterprise.mtx.services.reporter;

public class ReportDTO  implements java.io.Serializable {
    private java.lang.String[] operators;

    private java.math.BigInteger totalCost;

    private int totalMaintenanceDone;

    public ReportDTO() {
    }

    public ReportDTO(
           java.lang.String[] operators,
           java.math.BigInteger totalCost,
           int totalMaintenanceDone) {
           this.operators = operators;
           this.totalCost = totalCost;
           this.totalMaintenanceDone = totalMaintenanceDone;
    }


    /**
     * Gets the operators value for this ReportDTO.
     * 
     * @return operators
     */
    public java.lang.String[] getOperators() {
        return operators;
    }


    /**
     * Sets the operators value for this ReportDTO.
     * 
     * @param operators
     */
    public void setOperators(java.lang.String[] operators) {
        this.operators = operators;
    }

    public java.lang.String getOperators(int i) {
        return this.operators[i];
    }

    public void setOperators(int i, java.lang.String _value) {
        this.operators[i] = _value;
    }


    /**
     * Gets the totalCost value for this ReportDTO.
     * 
     * @return totalCost
     */
    public java.math.BigInteger getTotalCost() {
        return totalCost;
    }


    /**
     * Sets the totalCost value for this ReportDTO.
     * 
     * @param totalCost
     */
    public void setTotalCost(java.math.BigInteger totalCost) {
        this.totalCost = totalCost;
    }


    /**
     * Gets the totalMaintenanceDone value for this ReportDTO.
     * 
     * @return totalMaintenanceDone
     */
    public int getTotalMaintenanceDone() {
        return totalMaintenanceDone;
    }


    /**
     * Sets the totalMaintenanceDone value for this ReportDTO.
     * 
     * @param totalMaintenanceDone
     */
    public void setTotalMaintenanceDone(int totalMaintenanceDone) {
        this.totalMaintenanceDone = totalMaintenanceDone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDTO)) return false;
        ReportDTO other = (ReportDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operators==null && other.getOperators()==null) || 
             (this.operators!=null &&
              java.util.Arrays.equals(this.operators, other.getOperators()))) &&
            ((this.totalCost==null && other.getTotalCost()==null) || 
             (this.totalCost!=null &&
              this.totalCost.equals(other.getTotalCost()))) &&
            this.totalMaintenanceDone == other.getTotalMaintenanceDone();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOperators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCost() != null) {
            _hashCode += getTotalCost().hashCode();
        }
        _hashCode += getTotalMaintenanceDone();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mtx.enterprise/services/reporter", "reportDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operators");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalMaintenanceDone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalMaintenanceDone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
