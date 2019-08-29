fun main() {
    val listInt = (1..10).toList()

    println("map: list.map { num -> \"Num: \$num\"}")
    callAction{ map(listInt) }

    println("mapIndexes: list.mapIndexed { index, num -> \"Index:\$index - \$num\" }")
    callAction { mapIndexed(listInt) }

    println("mapNotNull: list.mapNotNull { num -> if (num == null) null else \"Num: \$num\" }")
    callAction{ mapNotNull(listOf(1,null,3,null,5)) }

}

fun callAction(function: () -> List<String?>) {
    println(function())
    println("--------------------------------------------")
}