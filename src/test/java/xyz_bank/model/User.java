package xyz_bank.model;

public class User {

    public static String userFirstName;
    public String userLastName;
    public String userPostCode;

    public User(String userFirstName, String userLastName, String userPostCode) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPostCode = userPostCode;
    }

    public  String getUserFirstName() { return userFirstName; }

    public void setUserFirstName(String userFirstName) { this.userFirstName = userFirstName; }

    public  String getUserLastName() { return userLastName; }

    public void setUserLastName(String userLastName) { this.userLastName = userLastName; }

    public  String getUserPostCode() { return userPostCode; }

    public void setUserPostCode(String userPostCode) { this.userFirstName = userPostCode; }

    @Override
    public String toString(){
        return "User{" +
                "userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userPostCode='" + userPostCode + '\'' +
                '}';
    }
}
