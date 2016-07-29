package br.com.turbiani.smartmarvelapppersistence.entity;

/**
 * Created by lcunha on 29/07/16.
 */
public class TextObject {
    private String language;
    private String text;
    private String type;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
