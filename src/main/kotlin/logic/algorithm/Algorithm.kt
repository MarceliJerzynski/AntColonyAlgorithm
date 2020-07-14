package logic.algorithm

import logic.AntService
import logic.GraphService
import model.Ant
import model.Graph

class Algorithm {

    fun run(graph: Graph): Ant {
        val antsService = AntService()
        val graphService = GraphService()
        var bestAnt = Ant(0)
        for(i in 0 until Parameters.amountOfIterations) {
            print("\rProgress: " + (i.toDouble()/Parameters.amountOfIterations*100).toString() + "%")
            val ants = antsService.createAnts(graph)
            doIteration(graph, ants, antsService)
            graphService.evaporatePheronomes(graph)
            antsService.releasePheronomes(graph, ants)
            graphService.fillArrayOfProbabilities(graph)

            bestAnt = getBestAnt(bestAnt, ants)
//            if ( i == Parameters.amountOfIterations -1 ) {
//                println("Best profit: " + bestAnt.profit)
//                println("Best cost: " + bestAnt.cost)
//                println("Best path : ")
//                for(i in 0 until bestAnt.path.size-1) {
//                    print (graph.indexes[bestAnt.path[i]] +" -> ")
//                }
//                println(graph.indexes[bestAnt.path.last()])
//                println("Amount of extra cost: " + bestAnt.amountOfExtraCost)
//                println("Amount of not visited vertices: " + (graph.amountOfVertices - bestAnt.path.size))
//                return bestAnt
            }
//        }
        println("\rProgress: 100.0%")
        return bestAnt
    }

    private fun doIteration(graph: Graph, ants: List<Ant>, antsService: AntService) {
        //antsService.showWhereAntsAre(graph, ants)
        for(i in 1 until graph.amountOfVertices) {
            //to sprawia ze kazda mrowka moze zrobic max amountOfVertices -1 ruchow
            antsService.moveAnts(graph, ants) // to rusza kazda mrowka raz
         //   antsService.showWhereAntsAre(graph, ants)
        }
    }

    private fun getBestAnt(bestAnt: Ant, ants: List<Ant>): Ant {
        var betterAnt = bestAnt
        ants.forEach{ant ->
            if (ant.profit >= betterAnt.profit) {
                betterAnt = ant
            }
        }
        return betterAnt
    }

}