package lFirst

class ForSolution {


    fun main() {
        val invoice: Int = 32
        val productName: String = "Apple"
        val productAmount: Int = 23;
        val isPresent: Boolean = true
        val isNotPresent: Boolean = false
        val firstCharacter: Char = 'A'
        val appleAmount: Byte = 23
        val bananaAmount: Double = 234.0;
        val myAcceptAmount = 324.435
        print(
            invoice,
            firstCharacter,
            productAmount,
            productName,
            isPresent,
            isNotPresent,
            appleAmount,
            bananaAmount,
            myAcceptAmount
        )

        
    }

    private fun print(
        invoice: Int,
        firstCharacter: Char,
        productAmount: Int,
        productName: String,
        present: Boolean,
        notPresent: Boolean,
        appleAmount: Byte,
        bananaAmount: Double,
        myAcceptAmount: Double
    ) {
        println("$invoice,$firstCharacter,$productAmount,$productName,$present,$notPresent,$appleAmount,$bananaAmount,$myAcceptAmount")
    }


}