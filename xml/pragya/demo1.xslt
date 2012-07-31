<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="html" version="1.0"/>
	<xsl:template match="/network_schema/students">
	<html><body><table border="1">
				<xsl:for-each select="root_student">
				<xsl:sort select="sname"/>
					<tr>
						  <td><xsl:value-of select="sname"/></td>
						  <td><xsl:value-of select="advisor"/></td>
					</tr>
				</xsl:for-each>
			</table></body></html>
	</xsl:template>
	<xsl:template match="text() | @*"/>
	
</xsl:stylesheet>
