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

    public static class JwtProperties {
      private String base64Secret;
      private String tokenValidityInSeconds;
      private String tokenValidityInSecondsForRememberMe;

      public String getBase64Secret() {
        return base64Secret;
      }

      public void setBase64Secret(String base64Secret) {
        this.base64Secret = base64Secret;
      }

      public String getTokenValidityInSeconds() {
        return tokenValidityInSeconds;
      }

      public void setTokenValidityInSeconds(String tokenValidityInSeconds) {
        this.tokenValidityInSeconds = tokenValidityInSeconds;
      }

      public String getTokenValidityInSecondsForRememberMe() {
        return tokenValidityInSecondsForRememberMe;
      }

      public void setTokenValidityInSecondsForRememberMe(String tokenValidityInSecondsForRememberMe) {
        this.tokenValidityInSecondsForRememberMe = tokenValidityInSecondsForRememberMe;
      }
    }

  }
}
