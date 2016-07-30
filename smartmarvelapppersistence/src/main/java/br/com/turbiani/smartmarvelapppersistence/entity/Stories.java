package br.com.turbiani.smartmarvelapppersistence.entity;

import java.util.List;

/**
 * Created by lcunha on 29/07/16.
 */
public class Stories extends AbstractEntity{
    private long id;
    private String type;
    private List<Character> characters;
    private List<Creator> creators;
    private ComicSummary originalIssue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public List<Creator> getCreators() {
        return creators;
    }

    public void setCreators(List<Creator> creators) {
        this.creators = creators;
    }

    public ComicSummary getOriginalIssue() {
        return originalIssue;
    }

    public void setOriginalIssue(ComicSummary originalIssue) {
        this.originalIssue = originalIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stories stories = (Stories) o;

        if (id != stories.id) return false;
        return type.equals(stories.type);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + type.hashCode();
        return result;
    }
}
