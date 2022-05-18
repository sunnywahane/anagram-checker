import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeTrue

class AnagramCheckerTest : StringSpec() {
    init {
        "is 'a' an anagram of 'a'" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }
    }
}
