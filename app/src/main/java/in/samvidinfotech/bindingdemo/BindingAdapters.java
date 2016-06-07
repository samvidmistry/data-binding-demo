package in.samvidinfotech.bindingdemo;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by samvidmistry on 27/4/16.
 */
public class BindingAdapters {
    @BindingAdapter(value = {"imageUrl", "placeholder"}, requireAll = false)
    public static void setImage(ImageView image, String url, Drawable placeholder) {
        Glide.with(image.getContext()).load(url).placeholder(placeholder).crossFade().centerCrop().into(image);
    }
}
