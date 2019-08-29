fun main() {
    val listInt = (1..10).toList()

    println("[map]: list.map { num -> \"Num: \$num\"}")
    callAction{ map(listInt) }

    println("[mapIndexes]: list.mapIndexed { index, num -> \"Index:\$index - \$num\" }")
    callAction { mapIndexed(listInt) }

    println("[mapNotNull]: list.mapNotNull { num -> if (num == null) null else \"Num: \$num\" }")
    callAction{ mapNotNull(listOf(1,null,3,null,5)) }

    println("[flatMap]: list.flatMap { num -> num }")
    callActionInt { flatMap(listOf((0..4).toList(), (5..9).toList())) }

}

fun callAction(function: () -> List<String?>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionInt(function: () -> List<Int>) {
    println(function())
    println("--------------------------------------------")
}