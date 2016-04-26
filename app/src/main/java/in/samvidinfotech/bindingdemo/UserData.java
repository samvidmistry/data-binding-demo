package in.samvidinfotech.bindingdemo;

/**
 * Created by samvidmistry on 26/4/16.
 */
public class UserData {
    private String mFirstName;
    private String mLastName;

    public UserData(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
