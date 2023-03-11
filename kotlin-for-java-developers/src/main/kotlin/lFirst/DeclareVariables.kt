package lFirst

class DeclareVariables {
    private lateinit var name: String
    private lateinit var notice: String

    fun setName(name: String){
        this.name=name
    }
    
    fun getName(): String {
        return name
    }

    fun getNotice(): String {
        return notice
    }
}