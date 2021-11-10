package service

import model.Student
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

    private var teste = StudentService()
    val s234 = Student("234", "gui","",null)

    @Test
    fun isSubscribed() {
        teste.subscribeStudent(s234)
        assertEquals(true, teste.isSubscribed("234"))
    }


}