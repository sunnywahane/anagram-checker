import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.should

class AnagramCheckerTest : StringSpec() {
    init {
        "is 'a' an anagram of 'a' when comparing same characters of same case" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }

        "is 'H' an anagram of 'h' when comparing same characters having different cases" {
            AnagramChecker().match("H", "h").shouldBeTrue()
        }

        "is 'aa' is an anagram of 'a' when number of characters are different but having same characters" {
            AnagramChecker().match("aa", "a").shouldBeFalse()
        }

        "is 'a' an anagram of 'b' when comparing different characters" {
            AnagramChecker().match("a", "b").shouldBeFalse()
        }

        "is 'Sea' an anagram of 'eaS' when comparing multi-character string with its permutation" {
            AnagramChecker().match("Sea", "Sea").shouldBeTrue()
        }

    }
}
