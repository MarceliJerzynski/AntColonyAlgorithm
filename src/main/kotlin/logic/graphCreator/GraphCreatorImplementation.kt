package logic.graphCreator

import model.Edge
import model.Graph

class GraphCreatorImplementation : GraphCreator {

    override fun getGraph(txtData: List<String>): Graph {
        val amountOfVertices = txtData.size
        val array = Array(amountOfVertices){ Array(amountOfVertices) {Edge()}  }

        val indexes = mutableMapOf<Int, String>()
        val lenghtOfWord = txtData.get(0).length
        for ((index, vertex) in txtData.withIndex()) {
            indexes[index] = vertex
        }

        for((i, firstVertex) in txtData.withIndex()) {
            for((j, secondVertex) in txtData.withIndex()) {
                array[i][j].whereItLeads = j
                if (i != j) {
                    array[i][j].cost = getCost(firstVertex, secondVertex, lenghtOfWord)
                } else
                {
                    array[i][j].cost = Int.MAX_VALUE
                }

            }
        }

        return Graph(array, indexes, getHeuristics(amountOfVertices, array))
    }

    private fun getCost(firstVertex: String, secondVertex: String, lengthOfWord : Int): Int {
        for (i in 1 until lengthOfWord) {
            if (firstVertex.substring(i) == secondVertex.substring(0, (lengthOfWord - i))) {
                return i
            }
        }
        return lengthOfWord
    }

    private fun getHeuristics(amountOfVertices: Int, arrayOfEdges: Array<Array<Edge>>) : Array<Int> {
        var result = Array(amountOfVertices) {0}
        for(i in 0 until amountOfVertices) {
            for (j in 0 until amountOfVertices) {
                if (i != j) {
                    result[i] -= arrayOfEdges[i][j].cost
                    //result[i] += arrayOfCosts[j][i]
                }
            }
        }

        val minimum = result.min()
        for(i in 0 until amountOfVertices) result[i] -= minimum!! - 1

        return result
    }
}