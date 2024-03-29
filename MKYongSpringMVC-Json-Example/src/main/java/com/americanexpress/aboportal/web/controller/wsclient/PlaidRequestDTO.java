package com.americanexpress.aboportal.web.controller.wsclient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class PlaidRequestDTO extends PlaidBaseResponse {

	private String clientId;
	private String secretKey;
	private String publicToken;
	private String accessToken;

	@JsonIgnore(value = false)
	@JsonProperty("access_token")
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @return the clientId
	 */
	@JsonProperty("client_id")
	public String getClientId() {
		return clientId;
	}

	/**
	 * @return the publicToken
	 */

	@JsonIgnore(value = false)
	@JsonProperty("public_token")
	public String getPublicToken() {
		return publicToken;
	}

	/**
	 * @return the secretKey
	 */
	@JsonProperty("secret")
	public String getSecretKey() {
		return secretKey;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @param clientId
	 *            the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @param publicToken
	 *            the publicToken to set
	 */
	public void setPublicToken(String publicToken) {
		this.publicToken = publicToken;
	}

	/**
	 * @param secretKey
	 *            the secretKey to set
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
