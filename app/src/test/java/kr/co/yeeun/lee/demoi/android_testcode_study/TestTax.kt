package kr.co.yeeun.lee.demoi.android_testcode_study

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestTax { // class 단위로 class 내부 메소드 한 번에 수행 가능

    @Test // 테스트용으로 작성
    fun calculateTaxTest() { // 테스트 이름은 누구나 목적을 파악할 수 있게 작성할 것, 테스트 코드에 한 해 백틱으로 공백이 있는 메소드 작성 가능
        val tax = Tax()
        val netTax = tax.calcualteTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10) // netTax가 10과 동일한지 테스트
    }

    @Test
    fun calculateIncomeTest() {
        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }

}