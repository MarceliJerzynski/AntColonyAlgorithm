package model

import kotlin.random.Random

class Ant {

    var currentVertex: Int
    var path : MutableList<Int>
    var profit : Int
    var cost: Int
    var amountOfExtraCost : Int
    var amountOfReturning : Int
    var amountOfSkippedVertices : Int

    constructor(startingVertex : Int) {
        this.currentVertex = startingVertex
        this.path = mutableListOf(startingVertex)
        this.profit = Parameters.profit
        this.cost = 0
        this.amountOfExtraCost = 0
        this.amountOfReturning = 0
        this.amountOfSkippedVertices = 0
    }

    fun move(graph : Graph) {
        var probabilityOfNotPossibleEdges : Float = 0.0f
        val edgesFromMyPosition = Array(graph.amountOfVertices) {Edge()}
        for(i in 0 until graph.amountOfVertices) {
            edgesFromMyPosition[i] = graph.arrayOfEdges[currentVertex][i].copy()
        }

//        edgesFromMyPosition.toList().parallelStream().forEach{edge ->
//            if (edge.cost + cost > Parameters.lengthOfSequence - graph.lengthOfWord ||
//                    path.contains(edge.whereItLeads)) {
//                probabilityOfNotPossibleEdges += edge.probability
//                edge.probability = 0.0f
//            }
//        }
        for(i in 0 until graph.amountOfVertices) {
//            edgesFromMyPosition[i] = graph.arrayOfEdges[currentVertex][i].copy()
            if (edgesFromMyPosition[i].cost + cost > Parameters.lengthOfSequence - graph.lengthOfWord) {
                probabilityOfNotPossibleEdges += edgesFromMyPosition[i].probability
                edgesFromMyPosition[i].probability = 0.0f

            } else
            if (path.contains(i)) {
                probabilityOfNotPossibleEdges += edgesFromMyPosition[i].probability
                edgesFromMyPosition[i].probability = 0.0f
            }
        }

        if (edgesFromMyPosition.map { it.probability }.sum() < 0.0000007) {
            return
        }

        var randomValue = Random.nextDouble(0.0, edgesFromMyPosition.map{it.probability}.sum().toDouble()).toFloat()
        for( j in 0 until graph.amountOfVertices) {
            if (randomValue - edgesFromMyPosition[j].probability <= 0) {
                addToCost(edgesFromMyPosition[j].cost)
                addtoProfit(Parameters.profit)
                ifReturning(j)
                ifCostMoreThanOne(edgesFromMyPosition[j].cost)
                setVertex(j)
                return
            } else {
                randomValue -= edgesFromMyPosition[j].probability
            }
        }
    }

    private fun addToCost(value: Int) {
        this.cost += value
    }

    private fun addtoProfit(value: Int) {
        this.profit += value
    }

    private fun ifReturning(newVertex: Int) {
        if (path.contains(newVertex)) amountOfReturning++
    }

    private fun ifCostMoreThanOne(cost: Int) {
        if (cost > 1) amountOfExtraCost += cost-1
    }

    private fun setVertex(vertex : Int) {
        currentVertex = vertex
        path.add(currentVertex)
    }
}