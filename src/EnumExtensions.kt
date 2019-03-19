import java.lang.IllegalArgumentException

inline fun <reified E: Enum<E>> enumValueOfOrNull(name: String?): E? {
    return try {
        enumValueOf<E>(name!!)
    } catch (e: IllegalArgumentException) {
        null
    } catch (e: NullPointerException) {
        null
    }
}

fun main() {

}
