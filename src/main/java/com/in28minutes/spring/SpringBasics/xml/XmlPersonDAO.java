package com.in28minutes.spring.SpringBasics.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class XmlPersonDAO {

	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmlJdbcConnection = jdbcConnection;
	}

}
