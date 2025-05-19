public class Author {
    private String middleName;
    private String lastName;

    public Author(String middleName, String lastName) {
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author other = (Author) obj;
        if (middleName != null ? !middleName.equals(other.middleName) : other.middleName != null)
            return false;
        if (lastName != null ? !lastName.equals(other.lastName) : other.lastName != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17; // стартовое число
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}