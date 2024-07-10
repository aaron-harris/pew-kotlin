package io.github.aaron_harris.pew.kotlin.cli

import com.github.ajalt.clikt.core.CliktCommand
import io.github.aaron_harris.pew.kotlin.hello

/** A simple Hello World command demonstrating the intended Clikt application structure. */
class HelloCommand : CliktCommand() {
    override fun run() {
        echo(hello("World"))
    }
}
