package in.samvidinfotech.bindingdemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.samvidinfotech.bindingdemo.databinding.ActivityUserListBinding;

public class UserListActivity extends AppCompatActivity {
    private ActivityUserListBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_list);

        UserData userData = new UserData("Samvid", "Mistry");
        List<UserData> userDatas = new ArrayList<>();
        userDatas.add(userData);
        userDatas.add(userData);
        userDatas.add(userData);
        userDatas.add(userData);
        userDatas.add(userData);
        userDatas.add(userData);

        mBinding.userList.setAdapter(new UserAdapter(userDatas));
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, UserListActivity.class);
        context.startActivity(starter);
    }
}
