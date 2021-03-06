//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.footstone.AbstractEntity;

/**
 * OauthClientTokenEntity [ sampledb.oauth_client_token ].
 *
 * @author MyBatisGenerator
 * @version 2017-10-14
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class OauthClientTokenEntity extends AbstractEntity implements Serializable {
  /** token_id [ oauth_client_token.token_id ]. */
  private String tokenId;

  /** authentication_id [ oauth_client_token.authentication_id ]. */
  private String authenticationId;

  /** user_name [ oauth_client_token.user_name ]. */
  private String userName;

  /** client_id [ oauth_client_token.client_id ]. */
  private String clientId;

  /**
   * GET token_id [ oauth_client_token.token_id ].
   *
   * @return java.lang.String
   */
  public String getTokenId() {
    return tokenId;
  }

  /**
   * WITH token_id [ oauth_client_token.token_id ].
   *
   * @param tokenId java.lang.String
   * @return org.github.spring.base.entity.OauthClientTokenEntity
   */
  public OauthClientTokenEntity withTokenId(String tokenId) {
    this.setTokenId(tokenId);
    return this;
  }

  /**
   * SET token_id [ oauth_client_token.token_id ].
   *
   * @param tokenId java.lang.String
   */
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId == null ? null : tokenId.trim();
  }

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