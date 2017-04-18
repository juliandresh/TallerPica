<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
                xmlns:mop="http://aerolineas-latinoamericana.com/soa/mop-message/mop-rule/"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform" exclude-result-prefixes="mop #default">
    <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">

        <MOPP_REQUEST_MESSAGE>
            <skipMaintenance><xsl:value-of select="/mop:mopEvent/skipMaintenance"/></skipMaintenance>
            <fuelPercentage><xsl:value-of select="/mop:mopEvent/fuelPercentage"/></fuelPercentage>
            <undercarriageStatus><xsl:value-of select="/mop:mopEvent/undercarriage"/></undercarriageStatus>    
        </MOPP_REQUEST_MESSAGE>

    </xsl:template>
</xsl:stylesheet>