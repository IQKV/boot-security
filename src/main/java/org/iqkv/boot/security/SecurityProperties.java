package org.iqkv.boot.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.cors.CorsConfiguration;

@ConfigurationProperties(prefix = "iqkv.security", ignoreUnknownFields = false)
public class SecurityProperties {

  private final CorsConfiguration cors = new CorsConfiguration();
  private final AuthenticationProperties authentication = new AuthenticationProperties();

  public CorsConfiguration getCors() {
    return cors;
  }

  public AuthenticationProperties getAuthentication() {
    return authentication;
  }

  public static class AuthenticationProperties {

    private final JwtProperties jwt = new JwtProperties();

    public JwtProperties getJwt() {
      return jwt;
    }

    public static class JwtProperties {
      private String base64Secret;
      private Long tokenValidityInSeconds;
      private Long tokenValidityInSecondsForRememberMe;

      public String getBase64Secret() {
        return base64Secret;
      }

      public void setBase64Secret(String base64Secret) {
        this.base64Secret = base64Secret;
      }

      public Long getTokenValidityInSeconds() {
        return tokenValidityInSeconds;
      }

      public void setTokenValidityInSeconds(Long tokenValidityInSeconds) {
        this.tokenValidityInSeconds = tokenValidityInSeconds;
      }

      public Long getTokenValidityInSecondsForRememberMe() {
        return tokenValidityInSecondsForRememberMe;
      }

      public void setTokenValidityInSecondsForRememberMe(Long tokenValidityInSecondsForRememberMe) {
        this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
      }
    }

  }
}
