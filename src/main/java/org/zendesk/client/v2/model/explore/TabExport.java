package org.zendesk.client.v2.model.explore;

public class TabExport {
    private int tabId;
    private int tagId;
    private String dashboardGuid;
    private String tagSubscriptionsUrl;
    private String format;
    private Dimension dimensions;
    private Object[] bookmarkablesStates = new Object[] {};
    private String language = "en-us";
    private Object queriesIdsToQueries = new Object();
    private Object inPlaceDataFiltersMembers = new Object();

    public TabExport() {
    }

    public TabExport(int tabId, int tagId, String dashboardGuid, String tagSubscriptionsUrl, String format, Dimension dimensions) {
        this.tabId = tabId;
        this.tagId = tagId;
        this.dashboardGuid = dashboardGuid;
        this.tagSubscriptionsUrl = tagSubscriptionsUrl;
        this.format = format;
        this.dimensions = dimensions;
    }

    public int getTabId() {
        return tabId;
    }

    public void setTabId(int tabId) {
        this.tabId = tabId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getDashboardGuid() {
        return dashboardGuid;
    }

    public void setDashboardGuid(String dashboardGuid) {
        this.dashboardGuid = dashboardGuid;
    }

    public String getTagSubscriptionsUrl() {
        return tagSubscriptionsUrl;
    }

    public void setTagSubscriptionsUrl(String tagSubscriptionsUrl) {
        this.tagSubscriptionsUrl = tagSubscriptionsUrl;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimension dimensions) {
        this.dimensions = dimensions;
    }

    public Object[] getBookmarkablesStates() {
        return bookmarkablesStates;
    }

    public void setBookmarkablesStates(Object[] bookmarkablesStates) {
        this.bookmarkablesStates = bookmarkablesStates;
    }

    public Object getQueriesIdsToQueries() {
        return queriesIdsToQueries;
    }

    public void setQueriesIdsToQueries(Object queriesIdsToQueries) {
        this.queriesIdsToQueries = queriesIdsToQueries;
    }

    public Object getInPlaceDataFiltersMembers() {
        return inPlaceDataFiltersMembers;
    }

    public void setInPlaceDataFiltersMembers(Object inPlaceDataFiltersMembers) {
        this.inPlaceDataFiltersMembers = inPlaceDataFiltersMembers;
    }

    public static class Dimension {
        private int height;
        private int width;

        public Dimension() {
        }

        public Dimension(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
