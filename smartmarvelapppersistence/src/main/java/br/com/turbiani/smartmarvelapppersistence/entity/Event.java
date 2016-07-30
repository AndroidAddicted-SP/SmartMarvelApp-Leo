package br.com.turbiani.smartmarvelapppersistence.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by lcunha on 29/07/16.
 */
public class Event extends AbstractEntity{
    private long id;
    private String title;
    private java.util.Date start;
    private java.util.Date end;
    private List<Character> characters;
    private List<Creator> creators;
    private EventSummary next;
    private EventSummary previous;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
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

    public EventSummary getNext() {
        return next;
    }

    public void setNext(EventSummary next) {
        this.next = next;
    }

    public EventSummary getPrevious() {
        return previous;
    }

    public void setPrevious(EventSummary previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (id != event.id) return false;
        if (!title.equals(event.title)) return false;
        if (!start.equals(event.start)) return false;
        return end.equals(event.end);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + title.hashCode();
        result = 31 * result + start.hashCode();
        result = 31 * result + end.hashCode();
        return result;
    }
}
