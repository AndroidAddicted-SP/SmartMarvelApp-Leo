package br.com.turbiani.smartmarvelapppersistence.entity;

/**
 * Created by lcunha on 29/07/16.
 */
public class Creator {
    private int id;
    private String firstName;
    private String middleName;
    private String suffix;
    private String fullName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Creator creator = (Creator) o;

        if (id != creator.id) return false;
        return fullName.equals(creator.fullName);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fullName.hashCode();
        return result;
    }
}
