/*
 * Copyright 2025 IQKV Foundation Team, and the original author or authors from the JHipster project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.iqkv.boot.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.cors.CorsConfiguration;

@ConfigurationProperties(prefix = "application-configuration.security", ignoreUnknownFields = false)
public class SecurityProperties {

  private String contentSecurityPolicy = "default-src 'self'; frame-src 'self' data:; script-src 'self' 'unsafe-inline' 'unsafe-eval' https://storage.googleapis.com; style-src 'self' 'unsafe-inline'; img-src 'self' data:; font-src 'self' data:";
  private final CorsConfiguration cors = new CorsConfiguration();
  private final AuthenticationProperties authentication = new AuthenticationProperties();

  public String getContentSecurityPolicy() {
    return contentSecurityPolicy;
  }

  public void setContentSecurityPolicy(String contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
  }

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
