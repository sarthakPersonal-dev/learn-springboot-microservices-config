package com.learn.springboot.config.learnspringbootconfig.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DbConnections {

	private String prototcol;
	
	private String port;
	
	private String host;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getPrototcol() {
		return prototcol;
	}

	public void setPrototcol(String prototcol) {
		this.prototcol = prototcol;
	}


	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
