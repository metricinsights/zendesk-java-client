package org.zendesk.client.v2.model.explore;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Tag {
    private Long id;
    private String name;
    private String guid;
    @JsonProperty("foreign_account_subdomain")
    private String subdomain;

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

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(id, tag.id) && Objects.equals(name, tag.name) && Objects.equals(guid, tag.guid) && Objects.equals(subdomain, tag.subdomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, guid, subdomain);
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
