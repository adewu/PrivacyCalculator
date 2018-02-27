package github.adewu.privacycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.TextKeyListener.clear

import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    private val mCalculatorController : CalculatorController = CalculatorController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        initWidgets()
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
            tv_c.id -> mCalculatorController.clear()

            tv_0.id -> mCalculatorController.inputNumbers(0)

            tv_1.id -> mCalculatorController.inputNumbers(1)

            tv_2.id -> mCalculatorController.inputNumbers(2)

            tv_3.id -> mCalculatorController.inputNumbers(3)

            tv_4.id -> mCalculatorController.inputNumbers(4)

            tv_5.id -> mCalculatorController.inputNumbers(5)

            tv_6.id -> mCalculatorController.inputNumbers(6)

            tv_7.id -> mCalculatorController.inputNumbers(7)

            tv_8.id -> mCalculatorController.inputNumbers(8)

            tv_9.id -> mCalculatorController.inputNumbers(9)

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


}
