public class Author {
    private String middleName;
    private String lastName;

    public Author(String middleName,String lastName){
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
