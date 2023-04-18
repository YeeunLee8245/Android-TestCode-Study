package kr.co.yeeun.lee.demoi.android_testcode_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

//    private fun calculateTax() {    // 세금 계산 Unit Test 관련 예시(test 모듈 TestTax Class 참조)
//        val tax = Tax()
//        val netIncome = tax.calculateIncome(100.0, 0.1) // 소득: 100, 세율: 10%
//        val netTax = tax.calcualteTax(100.0, 0.1)
//
//        println(netIncome)
//        println(netTax)
//    }
}