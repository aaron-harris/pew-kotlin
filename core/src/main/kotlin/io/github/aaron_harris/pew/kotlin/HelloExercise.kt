package io.github.aaron_harris.pew.kotlin

/** Temporary Hello World exercise instance intended only to demonstrate intended application structure. */
object HelloExercise : Exercise<String, String> {
    override val defaultInput: String = "World"

    override fun solve(input: String): String = "Hello, $input!"
}
