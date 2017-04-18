<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"  xmlns:fn="http://www.w3.org/2005/02/xpath-functions"
    version="1.0">
    <xsl:output method="text" encoding="ISO-8859-1" />
    <xsl:variable name="newline" select="'&#xA;'"/>
    <xsl:template match="/">
        <xsl:for-each select="incidentReport">
            <xsl:value-of select="substring(concat(//*[local-name()='description'], '                                                  '), 0, 50)" />
            <xsl:text>,</xsl:text>
            <xsl:value-of select="substring(concat(//*[local-name()='summary'], '                                                  '), 0, 50)" />
            <xsl:text>,</xsl:text>
            <xsl:value-of select="format-number(//*[local-name()='category'], '0000000000')" />
            <xsl:value-of select="$newline" />
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>