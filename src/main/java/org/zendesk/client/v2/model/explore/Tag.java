package org.zendesk.client.v2.model.explore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Tag {
    private Long id;
    private String name;
    private String guid;
    private String configuration;
    @JsonProperty("foreign_account_subdomain")
    private String subdomain;
    @JsonProperty("foreign_signed_url")
    private String foreignUrl;

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public String getForeignUrl() {
        return foreignUrl;
    }

    public void setForeignUrl(String foreignUrl) {
        this.foreignUrl = foreignUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id) && Objects.equals(name, tag.name) && Objects.equals(guid, tag.guid) && Objects.equals(configuration, tag.configuration) && Objects.equals(subdomain, tag.subdomain) && Objects.equals(foreignUrl, tag.foreignUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, guid, configuration, subdomain, foreignUrl);
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guid='" + guid + '\'' +
                ", subdomain='" + subdomain + '\'' +
                '}';
    }
}
