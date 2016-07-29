package br.com.turbiani.smartmarvelapppersistence.entity;

import java.util.*;
import java.util.Date;

/**
 * Created by lcunha on 29/07/16.
 */
public abstract class AbstractEntity {
    private String resourceURI;
    private String description;
    private java.util.Date modified;
    private List<Url> urls;
    private Image thumbnail;
    private List<Comic> commics;
    private List<Stories> storiesList;
    private List<Event> events;
    private List<Series> seriesList;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Comic> getCommics() {
        return commics;
    }

    public void setCommics(List<Comic> commics) {
        this.commics = commics;
    }

    public List<Stories> getStoriesList() {
        return storiesList;
    }

    public void setStoriesList(List<Stories> storiesList) {
        this.storiesList = storiesList;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
    }
}
