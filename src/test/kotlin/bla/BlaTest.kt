package bla

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BlaTest {

    @Test
    fun firstTest() {
        assertThat(message()).isEqualTo("★ Welcome to Bla ★")
    }

    @Test
    fun waouhTest() {
        val result = (0..9).filter { it > 5 }.map { it * it }.reduce { a, b -> a + b }

        assertThat(result).isEqualTo(6 * 6 + 7 * 7 + 8 * 8 + 9 * 9)
    }


}