package model

import Parameters

class Graph {

    var arrayOfEdges : Array<Array<Edge>>
    var indexes : Map<Int, String>
    var heuristics : Array<Int>
    var amountOfVertices : Int
    var lengthOfWord: Int

    constructor(arrayOfEdges: Array<Array<Edge>>, indexes : Map<Int, String>, heuristics : Array<Int>) {
        this.arrayOfEdges = arrayOfEdges
        this.indexes = indexes
        this.amountOfVertices = arrayOfEdges.size
        this.lengthOfWord = indexes[0]?.length ?: 0 //0 will be only if txt file will be empty
        this.heuristics = heuristics
//        this.heuristics = arrayOf(100, 0, 0, 0, 0)
    }

    fun showCosts() {
        println("---ARRAY OF COSTS---")
        for(i in 0..lengthOfWord+2) {
            print(" ")
        }
        indexes.forEach {
                k, v ->
            print("$v ")
        }
        println("")
        for(i in arrayOfEdges.indices) {
            print(indexes[i] + ": ")
            println(arrayOfEdges[i].contentToString())
        }
    }

    fun showHeuristics() {
        println("---HEURISTICS---")
        for( i in 0 until amountOfVertices) {
            println(indexes[i] + " : " + heuristics[i])
        }
    }
}