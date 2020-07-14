package logic.graphCreator

import model.Graph

interface GraphCreator {

    fun getGraph(txtData : List<String>) : Graph
}