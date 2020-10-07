package org.zendesk.client.v2;

import org.asynchttpclient.Request;
import org.asynchttpclient.Response;

public class ZendeskResponseRateLimitException extends ZendeskResponseException {

    private static final long serialVersionUID = 1L;
    private static final String RETRY_AFTER_HEADER = "Retry-After";
    private static final long DEFAULT_RETRY_AFTER = 60L;

    private Long retryAfter = DEFAULT_RETRY_AFTER;
    private Request request;
    private Zendesk.ZendeskAsyncCompletionHandler<?> handler;

    public ZendeskResponseRateLimitException(Response resp) {
        super(resp);
        try {
            this.retryAfter = Long.valueOf(resp.getHeader(RETRY_AFTER_HEADER));
        } catch (NumberFormatException e) {
            // Ignore, use the default value already set
        }
    }

    protected ZendeskResponseRateLimitException(ZendeskResponseRateLimitException e) {
        super(e);
        this.retryAfter = e.getRetryAfter();
    }

    public ZendeskResponseRateLimitException(Response response, Request request, Zendesk.ZendeskAsyncCompletionHandler<?> handler) {
        super(response);
        this.request = request;
        this.handler = handler;
    }

    public Long getRetryAfter() {
        return retryAfter;
    }

    public Request getRequest() {
        return request;
    }

    public Zendesk.ZendeskAsyncCompletionHandler<?> getHandler() {
        return handler;
    }
}
