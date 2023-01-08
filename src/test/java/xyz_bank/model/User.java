package xyz_bank.model;

public class User {

    public String userFirstName;
    public String userLastName;
    public String userPostCode;

    public User(String userFirstName, String userLastName, String userPostCode){
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
//
//    @Override
//    public boolean equals(Object o){
//        if(this == o) return true;
//        if (!(o instanceof User)) return false;
//        User user = (User) o;
//        return Object.equals(getUserFirstName(), user.getUserFirstName()) &&
//                Object.equals(getUserLastName(), user.getUserLastName()) &&
//                Object.equals(getUserPostCode(), user.getUserPostCode());
//    }
//    @Override
//    public int hashCode() { return Object.hash(getUserFirstName(), getUserLastName(), getUserPostCode()); }
}
