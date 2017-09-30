//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.blob;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.base.entity.OauthAccessTokenEntity;

/**
 * OauthAccessTokenWithBLOBs [ sampledb.oauth_access_token ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class OauthAccessTokenWithBLOBs extends OauthAccessTokenEntity implements Serializable {
  /** token [ oauth_access_token.token ]. */
  private byte[] token;

  /** client_id [ oauth_access_token.client_id ]. */
  private String clientId;

  /** authentication [ oauth_access_token.authentication ]. */
  private byte[] authentication;

  /**
   * GET token [ oauth_access_token.token ].
   *
   * @return byte[]
   */
  public byte[] getToken() {
    return token;
  }

  /**
   * WITH token [ oauth_access_token.token ].
   *
   * @param token byte[]
   * @return org.github.spring.base.blob.OauthAccessTokenWithBLOBs
   */
  public OauthAccessTokenWithBLOBs withToken(byte[] token) {
    this.setToken(token);
    return this;
  }

  /**
   * SET token [ oauth_access_token.token ].
   *
   * @param token byte[]
   */
  public void setToken(byte[] token) {
    this.token = token;
  }

  /**
   * GET client_id [ oauth_access_token.client_id ].
   *
   * @return java.lang.String
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * WITH client_id [ oauth_access_token.client_id ].
   *
   * @param clientId java.lang.String
   * @return org.github.spring.base.blob.OauthAccessTokenWithBLOBs
   */
  public OauthAccessTokenWithBLOBs withClientId(String clientId) {
    this.setClientId(clientId);
    return this;
  }

  /**
   * SET client_id [ oauth_access_token.client_id ].
   *
   * @param clientId java.lang.String
   */
  public void setClientId(String clientId) {
    this.clientId = clientId == null ? null : clientId.trim();
  }

  /**
   * GET authentication [ oauth_access_token.authentication ].
   *
   * @return byte[]
   */
  public byte[] getAuthentication() {
    return authentication;
  }

  /**
   * WITH authentication [ oauth_access_token.authentication ].
   *
   * @param authentication byte[]
   * @return org.github.spring.base.blob.OauthAccessTokenWithBLOBs
   */
  public OauthAccessTokenWithBLOBs withAuthentication(byte[] authentication) {
    this.setAuthentication(authentication);
    return this;
  }

  /**
   * SET authentication [ oauth_access_token.authentication ].
   *
   * @param authentication byte[]
   */
  public void setAuthentication(byte[] authentication) {
    this.authentication = authentication;
  }
}