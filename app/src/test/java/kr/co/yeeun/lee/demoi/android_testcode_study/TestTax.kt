package kr.co.yeeun.lee.demoi.android_testcode_study

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax { // class 단위로 class 내부 메소드 한 번에 수행 가능

    private lateinit var tax : Tax

    @Before // 테스트 초기화 전 수행
    fun setup() {
        tax = Tax()
    }

    @After // 테스트 후 수행
    fun teardown() {}

    @Test // 테스트용으로 작성
    fun calculateTaxTest() { // 테스트 이름은 누구나 목적을 파악할 수 있게 작성할 것, 테스트 코드에 한 해 백틱으로 공백이 있는 메소드 작성 가능
        val netTax = tax.calcualteTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10) // netTax가 10과 동일한지 테스트
    } // 각 테스트에서 오직 하나의 assertion만 가져야함, 상황상 그럴 수 없을 순 있지만 이것을 최대한 지키자(분할하는 방법으로)

    @Test
    fun calculateIncomeTest() {
        val netIncome = tax.calculateIncome(100.0, 0.1)
        assertThat(netIncome).isEqualTo(90)
    }

}