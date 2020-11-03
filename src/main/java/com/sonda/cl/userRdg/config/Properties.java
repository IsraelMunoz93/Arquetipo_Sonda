package com.sonda.cl.userRdg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

	private static String JDBCURL;
	private static String USERNAME;
	private static String PASSWORD;
	private static String MAXIMUMPOOLSIZE;
	private static String MAXLIFETIME;
	private static String CONNECTIONTIMEOUT;
	private static String IDLETIMEOUT;
	private static String MINIMUMIDLE;
	
	@Value("${spring.datasource.hikari.jdbcUrl}")
	private void setJdbcurl(String jdbcurl) {
		JDBCURL = jdbcurl;
	}

	public static String getJDBCURL() {
		return JDBCURL;
	}
	
	@Value("${spring.datasource.hikari.username}")
	private void setUsername(String username) {
		USERNAME = username;
	}

	public static String getUSERNAME() {
		return USERNAME;
	}
	
	@Value("${spring.datasource.hikari.password}")
	private void setPassword(String password) {
		PASSWORD = password;
	}

	public static String getPASSWORD() {
		return PASSWORD;
	}
	
	@Value("${spring.datasource.hikari.maximumPoolSize}")
	private void setMaximumpoolsize(String maximumPoolSize) {
		MAXIMUMPOOLSIZE = maximumPoolSize;
	}

	public static String getMAXIMUMPOOLSIZE() {
		return MAXIMUMPOOLSIZE;
	}
	
	@Value("${spring.datasource.hikari.maxLifetime}")
	private void setMaxlifetime(String maxLifetime) {
		MAXLIFETIME = maxLifetime;
	}

	public static String getMAXLIFETIME() {
		return MAXLIFETIME;
	}
	
	@Value("${spring.datasource.hikari.connectionTimeout}")
	private void setConnectiontimeout(String connectionTimeout) {
		CONNECTIONTIMEOUT = connectionTimeout;
	}

	public static String getCONNECTIONTIMEOUT() {
		return CONNECTIONTIMEOUT;
	}
	
	@Value("${spring.datasource.hikari.idleTimeout}")
	private void setIdletimeout(String idleTimeout) {
		IDLETIMEOUT = idleTimeout;
	}

	public static String getIDLETIMEOUT() {
		return IDLETIMEOUT;
	}
	
	@Value("${spring.datasource.hikari.idleTimeout}")
	private void setMinimunidle(String idleTimeout) {
		MINIMUMIDLE = idleTimeout;
	}

	public static String getMINIMUMIDLE() {
		return MINIMUMIDLE;
	}
}