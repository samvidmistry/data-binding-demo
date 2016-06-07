package in.samvidinfotech.bindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by samvidmistry on 1/6/16.
 */

public class UserData_BaseObservable extends BaseObservable {
    @Bindable
    private String mFirstName;
    @Bindable
    private String mLastName;

    public UserData_BaseObservable(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(in.samvidinfotech.bindingdemo.BR.firstName);
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(in.samvidinfotech.bindingdemo.BR.lastName);
    }
}
