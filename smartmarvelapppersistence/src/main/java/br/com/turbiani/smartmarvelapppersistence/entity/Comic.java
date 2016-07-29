package br.com.turbiani.smartmarvelapppersistence.entity;

import java.util.List;

/**
 * Created by lcunha on 29/07/16.
 */
public class Comic extends AbstractEntity{
    private long id;
    private	int	digitalId;
    private	String	title;
    private	int	issueNumber;
    private	String	variantDescription;
    private	String	isbn;
    private	String	upc;
    private	String	diamondCode;
    private	String	ean;
    private	String	issn;
    private	String	format;
    private	int	pageCount;
    private List<TextObject> textObjects;
    private	List<ComicSummary> variants;
    private	List<ComicSummary> collections;
    private	List<ComicSummary> collectedIssues;
    private	List<Date> dates;
    private	List<Price>	prices;
    private	List<Image>	images;
    private	List<Creator> creators;
    private	List<Character> characters;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(int digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }

    public List<ComicSummary> getVariants() {
        return variants;
    }

    public void setVariants(List<ComicSummary> variants) {
        this.variants = variants;
    }

    public List<ComicSummary> getCollections() {
        return collections;
    }

    public void setCollections(List<ComicSummary> collections) {
        this.collections = collections;
    }

    public List<ComicSummary> getCollectedIssues() {
        return collectedIssues;
    }

    public void setCollectedIssues(List<ComicSummary> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Creator> getCreators() {
        return creators;
    }

    public void setCreators(List<Creator> creators) {
        this.creators = creators;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comic comic = (Comic) o;

        if (id != comic.id) return false;
        if (digitalId != comic.digitalId) return false;
        if (isbn != null ? !isbn.equals(comic.isbn) : comic.isbn != null) return false;
        if (upc != null ? !upc.equals(comic.upc) : comic.upc != null) return false;
        return diamondCode != null ? diamondCode.equals(comic.diamondCode) : comic.diamondCode == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + digitalId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (upc != null ? upc.hashCode() : 0);
        result = 31 * result + (diamondCode != null ? diamondCode.hashCode() : 0);
        return result;
    }
}
