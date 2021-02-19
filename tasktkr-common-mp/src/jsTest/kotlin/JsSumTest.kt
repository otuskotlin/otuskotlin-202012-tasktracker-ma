import kotlin.test.Test
import kotlin.test.assertEquals

class JsSumTest {
    @Test
    fun shouldRemoveChars(){
        val s = sum(1, 5, 4, -10)
        assertEquals(0, s)
    }
}
