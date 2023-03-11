package lFirst

fun main(args: Array<String>) {
    val forExample = LearningPurpose().forExample()
    println(forExample)
    val s = args[0]
    val ss = args[1]
    val sss = args[2]
    println(s + " " + ss + " " + sss)
    val age = LearningPurpose().getAge()
    val name = LearningPurpose().getName()
    val surname = LearningPurpose().getSurname()
    println("name: $name,surname: $surname,age: $age")
    val message: String = "John"
    println(message)

    val name1 = DeclareVariables().getName()
    val notice = DeclareVariables().getNotice()
    println("name=$name1,notice=$notice")
}


