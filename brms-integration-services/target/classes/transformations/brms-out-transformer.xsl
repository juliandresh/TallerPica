<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">

		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:brms="http://javeriana-maintenance/brms" >
			<soapenv:Body>
				<brms:evaluateRuleResponse>
					<brms:ValidarMaintenanceFact>
						<skipMaintenance>
							<xsl:value-of
								select="/org.kie.server.api.model.ServiceResponse/result/result/co.com.foundation.javeriana.domain.MaintenanceFact/skipMaintenance" />
						</skipMaintenance>
						<fuelPercentage>
							<xsl:value-of
								select="/org.kie.server.api.model.ServiceResponse/result/result/co.com.foundation.javeriana.domain.MaintenanceFact/fuelPercentage" />
						</fuelPercentage>
						<status>
							<xsl:value-of
								select="/org.kie.server.api.model.ServiceResponse/result/result/co.com.foundation.javeriana.domain.MaintenanceFact/status" />
						</status>
					</brms:ValidarMaintenanceFact>
				</brms:evaluateRuleResponse>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>