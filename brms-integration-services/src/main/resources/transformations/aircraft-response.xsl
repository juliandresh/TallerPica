<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:tns="http://swift.business.process"                
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes="tns #default">
    <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
	<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
		<soapenv:Body>
			<swift-business-processResponse>  			 
				<tns:transactionCode>
					<xsl:value-of select="/tns:transactionCode" />
				</tns:transactionCode>
			</swift-business-processResponse>
		</soapenv:Body>
	</soapenv:Envelope>
    </xsl:template>
</xsl:stylesheet>