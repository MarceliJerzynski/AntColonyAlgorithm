package logic

import model.Ant
import model.Graph
import kotlin.math.pow
import kotlin.random.Random

class AntService {


    fun createAnts(graph: Graph) : List<Ant> {
        var sumOfHeuristics = graph.heuristics.sum()
        var ants = mutableListOf<Ant>()
        for(i in 0 until Parameters.amountOfAnts) {
            ants.add(Ant(getRandomVertex(graph, sumOfHeuristics)))
        }

        return ants
    }

    private fun getRandomVertex(graph: Graph, sumOfHeuristics : Int): Int {
        var randomValue = Random.nextInt(0, sumOfHeuristics+1)
        for( j in 0 until graph.amountOfVertices) {
            if (randomValue - graph.heuristics[j] <= 0) {
                return j
            } else {
                randomValue -= graph.heuristics[j]
            }
        }
        return graph.amountOfVertices - 1
    }

    fun moveAnts(graph: Graph, ants: List<Ant>) {
        ants.parallelStream().forEach{ant -> ant.move(graph)}
    }

    fun releasePheronomes(graph: Graph, ants: List<Ant>) {
        for(ant in ants) {
            for(i in 1 until ant.path.size) {
                graph.arrayOfEdges[ant.path[i-1]][ant.path[i]].pheronomes +=
                        ant.profit.toFloat().pow(Parameters.importanceOfProfit) / ant.cost
            }
        }
    }

    fun showWhereAntsAre(graph : Graph, ants : List<Ant> ) {
        var amountOfAnts = Array(graph.amountOfVertices) {0}
        for(element in ants) {
            amountOfAnts[element.currentVertex] += 1
        }
        println("----WHERE ANTS ARE----")
        for(i in 0 until graph.amountOfVertices) {
            println (graph.indexes[i] + " : " + amountOfAnts[i])
        }
    }
}