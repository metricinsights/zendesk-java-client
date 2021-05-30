package org.zendesk.client.v2.model.explore;

import java.util.Objects;

public class Tab {
    private int id;
    private String name;
    private String configuration;

    public Tab() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tab tab = (Tab) o;
        return id == tab.id && Objects.equals(name, tab.name) && Objects.equals(configuration, tab.configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, configuration);
    }

    @Override
    public String toString() {
        return "Tab{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
