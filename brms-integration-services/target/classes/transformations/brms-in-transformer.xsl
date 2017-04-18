<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:brms="http://javeriana-maintenance/brms"
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes="#default brms">
	<xsl:template match="/">

		<batch-execution lookup="defaultKieSession">
			<insert out-identifier="message" return-object="true" entry-point="DEFAULT">
				<co.com.foundation.javeriana.domain.MaintenanceFact>
					<fuelPercentage><xsl:value-of select="/soapenv:Envelope/soapenv:Body/brms:evaluateRule/brms:ValidarMaintenanceFact/fuelPercentage" /></fuelPercentage>
					<status><xsl:value-of select="/soapenv:Envelope/soapenv:Body/brms:evaluateRule/brms:ValidarMaintenanceFact/status" /></status>
				</co.com.foundation.javeriana.domain.MaintenanceFact>
			</insert>
			<fire-all-rules />
		</batch-execution>

	</xsl:template>
</xsl:stylesheet>