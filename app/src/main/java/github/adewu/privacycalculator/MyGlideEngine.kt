package github.adewu.privacycalculator

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.request.RequestOptions
import com.zhihu.matisse.engine.ImageEngine

/**
 * Created by wuxm on 28/02/2018.
 * Email 380510218@qq.com
 */
class MyGlideEngine : ImageEngine{
    override fun loadAnimatedGifThumbnail(context: Context?, resize: Int, placeholder: Drawable?, imageView: ImageView?, uri: Uri?) {
        var requestOptions : RequestOptions = RequestOptions()
                .override(resize, resize)
                .centerCrop()
                .placeholder(placeholder)
        if (context != null && imageView != null) {
            Glide.with(context)
                    .asBitmap()
                    .load(uri)
                    .apply(requestOptions)
                    .into(imageView)
        }
    }

    override fun loadImage(context: Context?, resizeX: Int, resizeY: Int, imageView: ImageView?, uri: Uri?) {
        var requestOptions : RequestOptions = RequestOptions()
                .override(resizeX, resizeY)
                .priority(Priority.HIGH)
                .centerCrop()
        if (context != null && imageView != null) {
            Glide.with(context)
                    .asBitmap()
                    .load(uri)
                    .apply(requestOptions)
                    .into(imageView)
        }
    }

    override fun loadAnimatedGifImage(context: Context?, resizeX: Int, resizeY: Int, imageView: ImageView?, uri: Uri?) {
        var requestOptions: RequestOptions = RequestOptions()
                .override(resizeX, resizeY)
                .priority(Priority.HIGH)
                .centerCrop()
        if (context != null && imageView != null) {
            Glide.with(context)
                    .asBitmap()
                    .load(uri)
                    .apply(requestOptions)
                    .into(imageView)
        }
    }

    override fun supportAnimatedGif(): Boolean {
      return true
    }

    override fun loadThumbnail(context: Context?, resize: Int, placeholder: Drawable?, imageView: ImageView?, uri: Uri?) {
        var requestOptions : RequestOptions = RequestOptions()
                .override(resize, resize)
                .centerCrop()
                .placeholder(placeholder)
        if (context != null && imageView != null) {
            Glide.with(context)
                    .asBitmap()
                    .load(uri)
                    .apply(requestOptions)
                    .into(imageView)
        }
    }

}