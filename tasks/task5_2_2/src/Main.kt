// Task 5.2.2: conversion of marks into grades, using a function
import kotlin.system.exitProcess

fun grader(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Error: Expecting at least one command line argument")
        exitProcess(1)
    }

    var grade: String
    for (mark in args) {
        grade = grader(mark.toInt())
        println("$mark is a $grade")
    }
}