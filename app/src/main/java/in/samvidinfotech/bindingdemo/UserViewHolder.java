package in.samvidinfotech.bindingdemo;

import android.support.v7.widget.RecyclerView;

import in.samvidinfotech.bindingdemo.databinding.UserViewBinding;

/**
 * Created by samvidmistry on 2/6/16.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {
    public UserViewBinding mBinding;

    public UserViewHolder(UserViewBinding viewBinding) {
        super(viewBinding.getRoot());
        mBinding = viewBinding;
    }
}
