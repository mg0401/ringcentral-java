package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class MessageSync extends Path {
    public MessageSync (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "message-sync", id);
    }
    public static class ListParameters
    {
        // Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
        public Long conversationId;
        public ListParameters conversationId(Long conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        // The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
        public String dateFrom;
        public ListParameters dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }
        // The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
        public String dateTo;
        public ListParameters dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }
        // Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
        public String[] direction;
        public ListParameters direction(String[] direction) {
            this.direction = direction;
            return this;
        }
        // If 'True', then the latest messages per every conversation ID are returned
        public Boolean distinctConversations;
        public ListParameters distinctConversations(Boolean distinctConversations) {
            this.distinctConversations = distinctConversations;
            return this;
        }
        // Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
        public String[] messageType;
        public ListParameters messageType(String[] messageType) {
            this.messageType = messageType;
            return this;
        }
        // Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
        public Long recordCount;
        public ListParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        // Value of syncToken property of last sync request response
        public String syncToken;
        public ListParameters syncToken(String syncToken) {
            this.syncToken = syncToken;
            return this;
        }
        // Type of message synchronization
        public String[] syncType;
        public ListParameters syncType(String[] syncType) {
            this.syncType = syncType;
            return this;
        }
    }
}
