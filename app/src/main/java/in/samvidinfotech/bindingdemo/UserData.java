package in.samvidinfotech.bindingdemo;

import android.content.Context;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by samvidmistry on 26/4/16.
 */
public class UserData implements Observable {
    private PropertyChangeRegistry mPropertyChangeRegistry;
    private String mFirstName;
    private String mLastName;
    private boolean mIsAdult = false;

    public UserData(String firstName, String lastName) {
        mFirstName = firstName;
        mLastName = lastName;
        mPropertyChangeRegistry = new PropertyChangeRegistry();
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        mPropertyChangeRegistry.notifyChange(this, in.samvidinfotech.bindingdemo.BR.firstName);
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        mPropertyChangeRegistry.notifyChange(this, in.samvidinfotech.bindingdemo.BR.lastName);
    }

    @Bindable
    public boolean isAdult() {
        return mIsAdult;
    }

    public void setAdult(boolean adult) {
        mIsAdult = adult;
        mPropertyChangeRegistry.notifyChange(this, in.samvidinfotech.bindingdemo.BR.adult);
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        mPropertyChangeRegistry.add(onPropertyChangedCallback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback onPropertyChangedCallback) {
        mPropertyChangeRegistry.remove(onPropertyChangedCallback);
    }

    public void toastCheckboxState(Context context, CheckBox checkBox) {
        Toast.makeText(context, checkBox.isChecked() + "", Toast.LENGTH_SHORT).show();
    }
}
