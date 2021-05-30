package org.zendesk.client.v2.model.explore;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaJob {
    private Status status;
    @JsonProperty("result_url")
    private String resultUrl;

    public MediaJob() {
    }

    public MediaJob(Status status, String resultUrl) {
        this.status = status;
        this.resultUrl = resultUrl;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public enum Status {
        WORKING,
        QUEUED,
        FAILED,
        COMPLETED,
        KILLED;

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }
}
