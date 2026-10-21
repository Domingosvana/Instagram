package co.tiagoaguiar.course.instagram.util

object LoginValidator {

    /**
     * Valida se a string fornecida e um e-mail valido.
     */
    fun isEmailValid(email: String): Boolean {
        if (email.isBlank()) return false
        return email.contains("@") && email.contains(".") && !email.startsWith("@") && !email.endsWith(".")
    }

    /**
     * Valida se a senha possui o tamanho minimo necessario (pelo menos 6 caracteres).
     */
    fun isPasswordValid(password: String): Boolean {
        return password.length >= 6
    }
}
