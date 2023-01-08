package xyz_bank.service;

import xyz_bank.model.User;

public class UserCreator {

    public static final String TESTDATA_USER_FIRSTNAME = "testdata.user.firstname";
    public static final String TESTDATA_USER_LASTNAME = "testdata.user.lastname";
    public static final String TESTDATA_USER_POSTCODE = "testdata.user.postcode";


    public static User withCredentialsFromProperty() {
        return new User(TestDataReader.getTestData(TESTDATA_USER_FIRSTNAME),
                TestDataReader.getTestData(TESTDATA_USER_LASTNAME),
                TestDataReader.getTestData(TESTDATA_USER_POSTCODE));
    }
}
