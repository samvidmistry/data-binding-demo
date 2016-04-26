package in.samvidinfotech.bindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by samvidmistry on 26/4/16.
 */
public class UserData extends BaseObservable {
    @Bindable
    private String mFirstName;
    @Bindable
    private String mLastName;

    public UserData(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(in.samvidinfotech.bindingdemo.BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(in.samvidinfotech.bindingdemo.BR.lastName);
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
