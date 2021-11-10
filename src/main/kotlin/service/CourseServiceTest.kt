package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CourseServiceTest {

    private val teste = CourseService()
    val course = Course("INTRO-CS-1", "Introduction to Computer Science",
        9, Module("hsjs", "Introduction to Computer Science",
            "Introduction to Computer Science"))

    @Test
    fun getCourse() {
        teste.registerCourse(course)
        assertNotEquals(false, teste.getCourse("INTRO-CS-1"))
    }
}