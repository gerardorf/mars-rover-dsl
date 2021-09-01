package me.gerardorf.rover

import me.gerardorf.rover.Direction.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class MarsRoverDslTest : Spek({
    describe("Mars Rover DSL"){
        context("movements"){
            it("can move forward"){
                mars move FORWARD
            }
            it("can move backwards"){
                mars move BACKWARD
            }
        }
    }
})

typealias mars = Mars

object Mars{
    infix fun move(direction: Direction) = print("I'm moving")
}

enum class Direction{
    FORWARD, BACKWARD
}