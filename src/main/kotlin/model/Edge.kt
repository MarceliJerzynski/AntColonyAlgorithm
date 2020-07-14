package model

class Edge {
    var cost: Int = 0
    var pheronomes: Float = Parameters.startingPheronomones
    var probability: Float = 0.0f
    var whereItLeads: Int = 0 //TODO HERE IS CHANGE

    override fun toString(): String {
        return probability.toString() //TODO HERE YOU CAN CHANGE DISPLAY OF GRAPH
    }

    fun copy() : Edge {
        val edge = Edge()
        edge.cost = this.cost
        edge.pheronomes = this.pheronomes
        edge.probability = this.probability
        return edge
    }
}