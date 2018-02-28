package github.adewu.privacycalculator

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import com.zhihu.matisse.Matisse
import github.adewu.privacycalculator.CalculatorController.Companion.REQUEST_CODE_CHOOSE

import kotlinx.android.synthetic.main.activity_calculator.*
import java.security.Permission
import java.util.jar.Manifest

class CalculatorActivity : BaseActivity() {

    private val mCalculatorController : CalculatorController = CalculatorController(this)

    private val PERMISSION_CODE : Int = 99

    internal var mPermissionGranted : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        initWidgets()

        checkPermission()
    }

    private fun checkPermission() {
        val permissionArray = arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,android.Manifest.permission.READ_EXTERNAL_STORAGE)
        if (ContextCompat.checkSelfPermission(this, permissionArray[0]) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,permissionArray , PERMISSION_CODE)
        }else
            mPermissionGranted = true
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_CODE)
            mPermissionGranted = true
    }
    private fun initWidgets(){

        tv_c.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_0.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_1.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_2.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_3.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_4.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_5.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_6.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_7.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_8.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_9.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_del.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_divide.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_dot.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_equal.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_minus.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_plus.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_remainder.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_x.setOnClickListener({ v -> onViewsClick(v.id) })
        tv_reset.setOnClickListener({ v -> onViewsClick(v.id) })
    }

    private fun onViewsClick(id: Int) {
        when (id) {
            tv_c.id ->{
                mCalculatorController.clear()
                et_result.setText("")
            }

            tv_0.id -> et_result.setText(mCalculatorController.inputNumbers("0"))

            tv_1.id -> et_result.setText(mCalculatorController.inputNumbers("1"))

            tv_2.id -> et_result.setText(mCalculatorController.inputNumbers("2"))

            tv_3.id -> et_result.setText(mCalculatorController.inputNumbers("3"))

            tv_4.id -> et_result.setText(mCalculatorController.inputNumbers("4"))

            tv_5.id -> et_result.setText(mCalculatorController.inputNumbers("5"))

            tv_6.id -> et_result.setText(mCalculatorController.inputNumbers("6"))

            tv_7.id -> et_result.setText(mCalculatorController.inputNumbers("7"))

            tv_8.id -> et_result.setText(mCalculatorController.inputNumbers("8"))

            tv_9.id -> et_result.setText(mCalculatorController.inputNumbers("9"))

            tv_del.id -> mCalculatorController.deleteNumber()

            tv_divide.id -> mCalculatorController.divide()

            tv_dot.id -> mCalculatorController.addDot()

            tv_equal.id -> mCalculatorController.equal()

            tv_minus.id -> mCalculatorController.minus()

            tv_plus.id -> mCalculatorController.plus()

            tv_remainder.id -> mCalculatorController.remainder()

            tv_x.id -> mCalculatorController.multiplication()

            tv_reset.id -> mCalculatorController.reset()
        }
    }

    var mSelected: List<Uri> = emptyList()

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_CHOOSE && resultCode == Activity.RESULT_OK) {
            mSelected = Matisse.obtainResult(data)
            Log.d("Matisse", "mSelected: " + mSelected)
        }
    }

}
