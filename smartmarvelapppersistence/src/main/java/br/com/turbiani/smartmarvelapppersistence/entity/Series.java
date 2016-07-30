package br.com.turbiani.smartmarvelapppersistence.entity;

import java.util.List;

/**
 * Created by lcunha on 29/07/16.
 */
public class Series extends AbstractEntity{
    private long id;
    private String title;
    private int startYear;
    private int endYear;
    private String rating;
    private List<Character> characters;
    private List<Creator> creators;
    private SeriesSummary next;
    private SeriesSummary previous;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

    public SeriesSummary getNext() {
        return next;
    }

    public void setNext(SeriesSummary next) {
        this.next = next;
    }

    public SeriesSummary getPrevious() {
        return previous;
    }

    public void setPrevious(SeriesSummary previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Series series = (Series) o;

        if (id != series.id) return false;
        if (startYear != series.startYear) return false;
        if (endYear != series.endYear) return false;
        if (!title.equals(series.title)) return false;
        return rating != null ? rating.equals(series.rating) : series.rating == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + title.hashCode();
        result = 31 * result + startYear;
        result = 31 * result + endYear;
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }
}
