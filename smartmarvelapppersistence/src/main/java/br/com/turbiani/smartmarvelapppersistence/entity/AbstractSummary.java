package br.com.turbiani.smartmarvelapppersistence.entity;

/**
 * Created by lcunha on 29/07/16.
 */
public abstract class AbstractSummary {
    private String resourceURI;
    private String name;

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
