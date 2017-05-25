package com.ringcentral.paths;

import com.ringcentral.HttpModel;

public class Token {
    public static class PostParameters implements HttpModel {
        // Must hold password value for Resource Owner Credentials flow. If client application is not authorized by the specified grant_type, response does not contain refresh_token and refresh_token_ttl attributes
        public String grant_type;
        // Optional. Access token lifetime in seconds; the possible values are from 600 sec (10 min) to 3600 sec (1 hour). The default value is 3600 sec. If the value specified exceeds the default one, the default value is set. If the value specified is less than 600 seconds, the minimum value (600 sec) is set
        public Long access_token_ttl;
        // Optional. Refresh token lifetime in seconds. The default value depends on the client application, but as usual it equals to 7 days. If the value specified exceeds the default one, the default value is applied. If client specifies refresh_token_ttl<=0, refresh token is not returned even if the corresponding grant type is supported
        public Long refresh_token_ttl;
        // Phone number linked to account or extension in account in E.164 format with or without leading "+" sign
        public String username;
        // Optional. Extension short number. If company number is specified as a username, and extension is not specified, the server will attempt to authenticate client as main company administrator
        public String extension;
        // User's password
        public String password;
        // Optional. List of API permissions to be used with access token (see Application Permissions). Can be omitted when requesting all permissions defined during the application registration phase
        public String scope;
        // Optional. Unique identifier of a client application. You can pass it in request according to pattern [a-zA-Z0-9_\-]{1,64}. Otherwise it is auto-generated by server. The value will be returned in response in both cases
        public String endpoint_id;

        public PostParameters grant_type(String grant_type) {
            this.grant_type = grant_type;
            return this;
        }

        public PostParameters access_token_ttl(Long access_token_ttl) {
            this.access_token_ttl = access_token_ttl;
            return this;
        }

        public PostParameters refresh_token_ttl(Long refresh_token_ttl) {
            this.refresh_token_ttl = refresh_token_ttl;
            return this;
        }

        public PostParameters username(String username) {
            this.username = username;
            return this;
        }

        public PostParameters extension(String extension) {
            this.extension = extension;
            return this;
        }

        public PostParameters password(String password) {
            this.password = password;
            return this;
        }

        public PostParameters scope(String scope) {
            this.scope = scope;
            return this;
        }

        public PostParameters endpoint_id(String endpoint_id) {
            this.endpoint_id = endpoint_id;
            return this;
        }
    }
}
