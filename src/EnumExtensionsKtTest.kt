import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class EnumExtensionsKtTest {

    enum class Fruits {
        APPLE, PEAR, STRAWBERRY
    }

    @Test
    @DisplayName("존재하는 Enum 값 정상적으로 가져오기")
    fun enumValueOfOrNull_Ok() {
        assertEquals(enumValueOfOrNull<Fruits>("APPLE"), Fruits.APPLE)
        assertEquals(enumValueOfOrNull<Fruits>("PEAR"), Fruits.PEAR)
        assertEquals(enumValueOfOrNull<Fruits>("STRAWBERRY"), Fruits.STRAWBERRY)
    }

    @Test
    @DisplayName("존재하지 않는 Enum 값 조회시 null 리턴")
    fun enumValueOfOrNull_when_notExistName_then_returnNull() {
        assertEquals(enumValueOfOrNull<Fruits>("GRAPE"), null)
    }

    @Test
    @DisplayName("null로 Enum 값 조회시 null 리턴")
    fun enumValueOfOrNull_when_nullParam_then_returnNull() {
        assertEquals(enumValueOfOrNull<Fruits>(null), null)
    }
}
