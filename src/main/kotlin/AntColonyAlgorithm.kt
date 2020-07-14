import logic.Logic
import java.io.File


fun main() {
    Logic().run("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-ends/309/55300+30.txt")
    //calculateNegativeRandom()
    //calculateNegativeRepetitions()
    //calculatePositiveRandom()
    //calculatePositiveEnds()
}

fun calculateNegativeRandom() {
    println("-----Negative random-----")
    Parameters.lengthOfSequence = 7
    calculateNegativeRandom7()
    Parameters.lengthOfSequence = 209
    calculateNegativeRandom209()
    Parameters.lengthOfSequence = 309
    calculateNegativeRandom309()
    Parameters.lengthOfSequence = 409
    calculateNegativeRandom409()
    Parameters.lengthOfSequence = 509
    calculateNegativeRandom509()
}

fun calculateNegativeRandom7() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-random/7").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRandom209() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-random/209").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRandom309() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-random/309").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRandom409() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-random/409").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRandom509() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-random/509").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRepetitions() {
    println("-----Negative repetitions-----")

    Parameters.lengthOfSequence = 209
    calculateNegativeRepetitions209()
    Parameters.lengthOfSequence = 309
    calculateNegativeRepetitions309()
    Parameters.lengthOfSequence = 409
    calculateNegativeRepetitions409()
    Parameters.lengthOfSequence = 509
    calculateNegativeRepetitions509()
}

fun calculateNegativeRepetitions209() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-repetitions/209").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRepetitions309() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-repetitions/309").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRepetitions409() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-repetitions/409").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculateNegativeRepetitions509() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/negative-repetitions/509").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveRandom() {
    println("-----Positive random-----")

    Parameters.lengthOfSequence = 209
    calculatePositiveRandom209()
    Parameters.lengthOfSequence = 309
    calculatePositiveRandom309()
    Parameters.lengthOfSequence = 409
    calculatePositiveRandom409()
    Parameters.lengthOfSequence = 509
    calculatePositiveRandom509()
}

fun calculatePositiveRandom209() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-random/209").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveRandom309() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-random/309").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveRandom409() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-random/409").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveRandom509() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-random/509").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveEnds() {
    println("-----Positive ends-----")

    Parameters.lengthOfSequence = 209
    calculatePositiveEnds209()
    Parameters.lengthOfSequence = 309
    calculatePositiveEnds309()
    Parameters.lengthOfSequence = 409
    calculatePositiveEnds409()
    Parameters.lengthOfSequence = 509
    calculatePositiveEnds509()
}

fun calculatePositiveEnds209() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-ends/209").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveEnds309() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-ends/309").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveEnds409() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-ends/409").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}

fun calculatePositiveEnds509() {
    File("/home/jasiek/Dokumenty/Studia/Semestr 6/Biolka/projekt/positive-ends/509").walk().forEach {
        if (it.toString().takeLast(4).equals(".txt")) {
            Logic().run(it.toString())
        }
    }
}


