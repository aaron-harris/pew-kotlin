package io.github.aaron_harris.pew.kotlin.cli

import com.github.ajalt.clikt.core.CliktCommand

/** A simple Hello World command demonstrating the intended Clikt application structure. */
class HelloCommand : CliktCommand() {
    override fun run() {
        echo("Hello, World!")
    }
}
