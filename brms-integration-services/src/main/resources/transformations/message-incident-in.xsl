<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:inc="http://aerolineas-latinoamericana.com/soa/processes/incidents-message/process-incidents-message/"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes="inc #default">
	<xsl:template match="/">

		<incidentReport>
			<description><xsl:value-of select="//*[local-name()='description']" /></description>
			<summary><xsl:value-of select="//*[local-name()='summary']" /></summary>
			<category><xsl:value-of select="//*[local-name()='category']" /></category>
		</incidentReport>

	</xsl:template>
</xsl:stylesheet>