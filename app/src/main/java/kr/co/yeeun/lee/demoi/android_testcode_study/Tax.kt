package kr.co.yeeun.lee.demoi.android_testcode_study

class Tax {

    fun calcualteTax(grossIncome: Double, taxRate: Double) : Double { // (소득 기반으로 계산한)세금
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome: Double, taxRate: Double) : Double { // (세금 공제한)순소득
        return grossIncome - (grossIncome * taxRate)
    }
}