package in.samvidinfotech.bindingdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import in.samvidinfotech.bindingdemo.databinding.UserViewBinding;

/**
 * Created by samvidmistry on 2/6/16.
 */

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private List<UserData> mUserDatas;

    public UserAdapter(List<UserData> userDatas) {
        mUserDatas = userDatas;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(UserViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.mBinding.setUser(mUserDatas.get(position));
        holder.mBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mUserDatas == null ? 0 : mUserDatas.size();
    }
}
