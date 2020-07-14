package logic

import Parameters
import model.Graph
import kotlin.math.pow

class GraphService {

    fun getFilledWithProbabibilitesGraph(graph: Graph) : Graph {

        fillArrayOfProbabilities(graph)

        return graph
    }

    fun evaporatePheronomes(graph: Graph) {
        for(i in 0 until graph.amountOfVertices) {
            for(j in 0 until graph.amountOfVertices) {
                graph.arrayOfEdges[i][j].pheronomes *= Parameters.ro
            }
        }
    }

    private fun getDenominator(graph: Graph, vertex: Int) : Float {
        var denominator: Float = 0.0f
            for(j in 0 until graph.amountOfVertices)
                denominator += graph.arrayOfEdges[vertex][j].pheronomes.pow(Parameters.alpha) *
                        graph.arrayOfEdges[vertex][j].cost.toFloat().pow(-Parameters.beta)
        return denominator
    }

    fun fillArrayOfProbabilities(graph: Graph) {
        for(i in 0 until graph.amountOfVertices)
            for(j in 0 until graph.amountOfVertices)
                graph.arrayOfEdges[i][j].probability =
                            (graph.arrayOfEdges[i][j].pheronomes.pow(Parameters.alpha) *
                            graph.arrayOfEdges[i][j].cost.toFloat().pow(-Parameters.beta)) /
                            getDenominator(graph, i)
    }


}