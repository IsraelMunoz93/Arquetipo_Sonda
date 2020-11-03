package com.sonda.cl.userRdg.config;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Clase de configuracion de datasource jdbc
 * @autor felipe.celsi
 * @date 21-09-2020
 *
 */
public class DataSource {

	
	private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

	static {
		config.setJdbcUrl(Properties.getJDBCURL());
        config.setUsername(Properties.getUSERNAME());
        config.setPassword(Properties.getPASSWORD());
        config.setMaximumPoolSize(Integer.parseInt(Properties.getMAXIMUMPOOLSIZE()));
        config.setMaxLifetime(Long.valueOf(Properties.getMAXLIFETIME()));
        config.setConnectionTimeout(Long.valueOf(Properties.getCONNECTIONTIMEOUT()));
        config.setIdleTimeout(Long.valueOf(Properties.getIDLETIMEOUT()));
        config.setMinimumIdle(Integer.parseInt(Properties.getMINIMUMIDLE()));

        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        ds = new HikariDataSource(config);
    }
 
    private DataSource() {}
 
    
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
