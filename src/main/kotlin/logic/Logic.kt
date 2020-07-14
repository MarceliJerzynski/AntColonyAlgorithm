package logic

import logic.algorithm.Algorithm
import logic.graphCreator.GraphCreatorImplementation
import logic.io.TxtGetterImplementation

class Logic {

    fun run(pathToFile: String)
    {
        val txtGetter = TxtGetterImplementation()
        val graphCreator = GraphCreatorImplementation()
        val graphService = GraphService()
        val algorithm = Algorithm()

        println("Path to file: " + pathToFile)

        val txtData = txtGetter.getTxtData(pathToFile)
        val graph = graphCreator.getGraph(txtData)
        val filledGraph = graphService.getFilledWithProbabibilitesGraph(graph)
            val start = System.currentTimeMillis()
        val bestAnt = algorithm.run(filledGraph)
            val stop = System.currentTimeMillis()
            println("Time of execution: " + (stop-start)/1000 +"s")
        println("Optimum:" + (Parameters.lengthOfSequence - filledGraph.lengthOfWord+1) +
                " - amount of negative mistakes ")
        println("Our result: " + bestAnt.profit)
    }
}