package co.tiagoaguiar.course.instagram

import co.tiagoaguiar.course.instagram.util.LoginValidator
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LoginValidatorTest {

    @Test
    fun isEmailValid_emailValido_retornaTrue() {
        val email = "usuario@email.com"
        val resultado = LoginValidator.isEmailValid(email)
        assertTrue(resultado)
    }

    @Test
    fun isEmailValid_emailSemArroba_retornaFalse() {
        val email = "usuarioemail.com"
        val resultado = LoginValidator.isEmailValid(email)
        assertFalse(resultado)
    }

    @Test
    fun isEmailValid_emailVazio_retornaFalse() {
        val email = ""
        val resultado = LoginValidator.isEmailValid(email)
        assertFalse(resultado)
    }

    @Test
    fun isPasswordValid_senhaComSeisOuMaisCaracteres_retornaTrue() {
        val senha = "123456"
        val resultado = LoginValidator.isPasswordValid(senha)
        assertTrue(resultado)
    }

    @Test
    fun isPasswordValid_senhaCurta_retornaFalse() {
        val senha = "123"
        val resultado = LoginValidator.isPasswordValid(senha)
        assertFalse(resultado)
    }
}
