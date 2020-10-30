import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class `Password Validator Test` : FunSpec({
    val validator = PasswordValidator()
    var input = "test123!"
    context("this block is for dynamic test") {
        test("given test123! should return valid password") {
            validator.isValid(input) shouldBe true
        }
        test("given t! should return invalid password") {
            input = "t!"
            validator.isValid(input) shouldBe false
        }
    }
})