import kotlin.random.Random

/*Random Number App */
fun main(args : Array<String>){
    //Generate a random no between range of 1 to 100
    val secretNumber= Random.nextInt(1,101)
    //println(secret number)

    println("Welcome to Number Guessing Game")
    println("Try to guess a secret number between 1 and 10")

    //Input loop
    while(true) {
        println("Enter your guess number:")
        val userGuess = readLine()?.toIntOrNull()

        //CHECK IF INPUT IS A VALID NUMBER
        if (userGuess == null) {
            println("Invalid input. Please enter a number.")
            continue //skipping something
        }
            //CHECK USER INPUT
            when {
                userGuess < secretNumber -> println("Number too low,try again")
                userGuess > secretNumber -> println("Number too high,try again")
                else -> {
                    println("Hurray! You guessed correct number")
                    break //loop exits
                }
            }

        }
    println("Game over")
    }

