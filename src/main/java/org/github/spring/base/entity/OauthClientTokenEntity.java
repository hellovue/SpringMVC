//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.OauthClientTokenKey;

/**
 * OauthClientTokenEntity [ sampledb.oauth_client_token ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class OauthClientTokenEntity extends OauthClientTokenKey implements Serializable {
  /** authentication_id [ oauth_client_token.authentication_id ]. */
  private String authenticationId;

  /** user_name [ oauth_client_token.user_name ]. */
  private String userName;

  /** client_id [ oauth_client_token.client_id ]. */
  private String clientId;

  /**
   * GET authentication_id [ oauth_client_token.authentication_id ].
   *
   * @return java.lang.String
   */
  public String getAuthenticationId() {
    return authenticationId;
  }

  /**
   * WITH authentication_id [ oauth_client_token.authentication_id ].
   *
   * @param authenticationId java.lang.String
   * @return org.github.spring.base.entity.OauthClientTokenEntity
   */
  public OauthClientTokenEntity withAuthenticationId(String authenticationId) {
    this.setAuthenticationId(authenticationId);
    return this;
  }

  /**
   * SET authentication_id [ oauth_client_token.authentication_id ].
   *
   * @param authenticationId java.lang.String
   */
  public void setAuthenticationId(String authenticationId) {
    this.authenticationId = authenticationId == null ? null : authenticationId.trim();
  }

  /**
   * GET user_name [ oauth_client_token.user_name ].
   *
   * @return java.lang.String
   */
  public String getUserName() {
    return userName;
  }

  /**
   * WITH user_name [ oauth_client_token.user_name ].
   *
   * @param userName java.lang.String
   * @return org.github.spring.base.entity.OauthClientTokenEntity
   */
  public OauthClientTokenEntity withUserName(String userName) {
    this.setUserName(userName);
    return this;
  }

  /**
   * SET user_name [ oauth_client_token.user_name ].
   *
   * @param userName java.lang.String
   */
  public void setUserName(String userName) {
    this.userName = userName == null ? null : userName.trim();
  }

  /**
   * GET client_id [ oauth_client_token.client_id ].
   *
   * @return java.lang.String
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * WITH client_id [ oauth_client_token.client_id ].
   *
   * @param clientId java.lang.String
   * @return org.github.spring.base.entity.OauthClientTokenEntity
   */
  public OauthClientTokenEntity withClientId(String clientId) {
    this.setClientId(clientId);
    return this;
  }

  /**
   * SET client_id [ oauth_client_token.client_id ].
   *
   * @param clientId java.lang.String
   */
  public void setClientId(String clientId) {
    this.clientId = clientId == null ? null : clientId.trim();
  }
}