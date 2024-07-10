package io.github.aaron_harris.pew.kotlin

/**
 * Abstract representation of the solution to a particular programming problem.
 *
 * In order to be automatically verifiable, most publicly available problems of this sort are not explicitly
 * parametrized.  Nevertheless, most problems support and will benefit from internal parametrization (for instance, if
 * the problem is stated as "find the 42nd element of the Fibonacci sequence", then it will be beneficial to solve
 * instead "find the Nth element of the Fibonacci sequence" and then execute the solution for N=42).  Furthermore, some
 * exercises may be chained and depend on preceding problems in the same family.  Parametrization also supports
 * testability of solutions.
 *
 * Therefore, this interface allows implementors to declare any combination of input and output types ([T] and [R],
 * respectively), but also requires them to specify a [defaultInput] so that consuming code can run the solution without
 * specifying any external input.  If parametrization is not helpful for a given problem, then [T] can simply be
 * declared as [Unit].
 *
 * @param T the input type expected by the solution; will default to [defaultInput] if not provided
 * @param R the output type provided by the solution
 */
interface Exercise<T, R> {
    /** The canonical parametrization of this [Exercise]; used as the default for the [solve] method. */
    val defaultInput: T

    /**
     * Return the concrete solution to the problem encoded by this [Exercise] when it is parametrized by [input].
     *
     * If [input] is omitted, [defaultInput] is used instead.
     */
    fun solve(input: T = defaultInput): R
}
