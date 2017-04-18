<xsl:stylesheet version="1.0"
	xmlns:swif="http://swift.business.process"
	xmlns:air="http://aerolineas-latinoamericana.com/soa/processes/aircraft-artifacts"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">

		<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
			<soapenv:Body>
				<swif:swift-business-processRequest>
         			<swif:input>
						<swif:eventDate><xsl:value-of select="/air:aircraftIngateEvent/eventDate" /></swif:eventDate>
						<swif:incidentsReport>
							<swif:description><xsl:value-of select="/air:aircraftIngateEvent/incidentsReport/description" /></swif:description>
							<swif:summary><xsl:value-of select="/air:aircraftIngateEvent/incidentsReport/summary" /></swif:summary>
							<swif:category><xsl:value-of select="/air:aircraftIngateEvent/incidentsReport/category" /></swif:category>
						</swif:incidentsReport>
						<swif:maintenance>
							<swif:fuelPercentage><xsl:value-of select="/air:aircraftIngateEvent/maintenance/fuelPercentage" /></swif:fuelPercentage>
							<swif:undercarriageStatus><xsl:value-of select="/air:aircraftIngateEvent/maintenance/undercarriageStatus" /></swif:undercarriageStatus>
						</swif:maintenance>
						<swif:crewPlaningChanges>
							<swif:applyChangesOnCrewMembers><xsl:value-of select="/air:aircraftIngateEvent/crewPlaningChanges/applyChangesOnCrewMembers" /></swif:applyChangesOnCrewMembers>
							<swif:totalCrewMemberRequired><xsl:value-of select="/air:aircraftIngateEvent/crewPlaningChanges/totalCrewMemberRequired" /></swif:totalCrewMemberRequired>
							<swif:changePilot><xsl:value-of select="/air:aircraftIngateEvent/crewPlaningChanges/changePilot" /></swif:changePilot>
						</swif:crewPlaningChanges>
					</swif:input>
				</swif:swift-business-processRequest>
			</soapenv:Body>
		</soapenv:Envelope>

	</xsl:template>
</xsl:stylesheet>