package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class View implements SearchResultEntity, Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String url;
    private String title;
    private Boolean active;
    private Date createdAt;
    private Date updatedAt;

    public View() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public View setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public View setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "View{" + "id=" + id + ", url='" + url + '\'' + ", title='" + title + '\'' + ", active=" + active + ", createdAt=" + createdAt + ", " +
                "updatedAt=" + updatedAt + '}';
    }
}
