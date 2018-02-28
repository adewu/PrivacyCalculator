package github.adewu.privacycalculator

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.engine.impl.GlideEngine
import com.zhihu.matisse.filter.Filter
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.net.Uri
import android.util.Log


/**
 * Created by wuxm on 27/02/2018.
 * Email 380510218@qq.com
 */
class CalculatorController(val mContext : Context){


    private var mNumbers : String = ""


    internal fun clear() {

    }

    internal fun inputNumbers(num : String) : String{
        mNumbers  +=  num
        return mNumbers

    }

    internal fun deleteNumber(){
        //TODO:
    }

    internal fun divide(){

    }

    internal fun addDot(){

    }

    internal fun equal(){
        if (mNumbers == "123456"){
            Matisse.from(mContext as Activity)
                    .choose(MimeType.allOf())
                    .countable(true)
                    .maxSelectable(9)
                    .gridExpectedSize(mContext.getResources().getDimensionPixelSize(R.dimen.grid_expected_size))
                    .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                    .thumbnailScale(0.85f)
                    .imageEngine(MyGlideEngine())
                    .forResult(REQUEST_CODE_CHOOSE)
        }
    }

    companion object {
        internal val REQUEST_CODE_CHOOSE : Int = 100
    }


    internal fun minus(){

    }

    internal fun multiplication(){

    }

    internal fun plus(){

    }

    internal fun remainder(){

    }

    internal fun reset(){

    }
}