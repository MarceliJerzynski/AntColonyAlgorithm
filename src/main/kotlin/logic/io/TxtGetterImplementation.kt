package logic.io

import java.io.File

class TxtGetterImplementation : TxtGetter{


    override fun getTxtData(fileName: String): List<String>
            = File(fileName).useLines { it.toList() }
}