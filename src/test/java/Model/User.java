package Model;

public class User {

    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String password1;
    public String password2;


    /*Fill User Login and Register*/
    public User(String firstName, String lastName, String username, String password1, String password2){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }




}
