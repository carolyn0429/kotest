import java.util.regex.Pattern

class PasswordValidator {
    fun isValid(password: String) = PATTERN.matcher(password).matches()

    private companion object {

        //one lowercase, one special char, one digit, min 6 character
        val PATTERN: Pattern = Pattern.compile("^(?=.*?[#?!@\\\$%^&*-])(?=.*?[a-z])(?=.*?[0-9]).{6,}\$")
    }
}