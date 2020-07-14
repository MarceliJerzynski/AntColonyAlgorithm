package logic.io

interface TxtGetter {

    fun getTxtData(fileName: String): List<String>
}