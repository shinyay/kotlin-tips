fun main() {
    val listInt = (1..10).toList()

    println("[Conversion]==================================")
    println("[map]: list.map { num -> \"Num: \$num\"}")
    callAction{ map(listInt) }

    println("[mapIndexes]: list.mapIndexed { index, num -> \"Index:\$index - \$num\" }")
    callAction { mapIndexed(listInt) }

    println("[mapNotNull]: list.mapNotNull { num -> if (num == null) null else \"Num: \$num\" }")
    callAction{ mapNotNull(listOf(1,null,3,null,5)) }

    println("[flatMap]: list.flatMap { num -> num }")
    callActionInt { flatMap(listOf((0..4).toList(), (5..9).toList())) }

    println("[associate]: list.associate { num -> \"Num * Num\" to num * num }")
    callActionMap { associate(listInt) }

    println("[associateWith]: list.associateWith { num -> num * num }")
    callActionMapInt { associateWith(listInt) }

    println("[Extraction]=================================")
    println("[filter]: list.filter { num -> num %2 == 0 }")
    callActionInt { filter(listInt) }

    println("[filterNot]: list.filter { num -> num %2 == 0 }")
    callActionInt { filterNot(listInt) }

    println("[groupBy]: list.groupBy { num -> if (num % 2 == 0) \"EVEN\" else \"ODD\" }")
    callActionMapIntList { groupBy(listInt) }

    println("[chunked]: list.chunked(3)")
    callActionDimensionalList { chunked(listInt) }

    println("[partition]: list.partition { num -> num % 2 == 0}")
    callActionPair { partition(listInt) }

    println("[take]: list.take(5)")
    callActionInt { take(listInt) }

    println("[takeLast]: list.takeLast(5)")
    callActionInt { takeLast(listInt) }

    println("[drop]: list.drop(3)")
    callActionInt { drop(listInt) }

    println("[single]: list.single { num: Int -> num == 5 }")
    callActionPrimitive { single(listInt) }

    println("[single]: list.singleOrNull { num: Int -> num == 11 }")
    callActionPrimitive { singleOrNull(listInt) }

    println("[max]: list.max()}")
    callActionPrimitive { max(listInt) }

    println("[min]: list.min()}")
    callActionPrimitive { min(listInt) }

    println("[maxBy]: list.maxBy { s: String -> s.length }")
    callActionPrimitiveString { maxBy(listOf<String>("a", "ab", "abc", "abcd", "abcdef")) }

    println("[distinctBy]: list.distinctBy { s: String -> s.length }")
    callAction { distinctBy(listOf<String>("a", "ab", "abc", "aa", "bbb")) }

    println("[slice]: list.slice(1..3)")
    callAction { slice(listOf<String>("a", "ab", "abc", "aa", "bbb")) }

    println("[Sort]=================================")
    println("[sorted]: list.sorted()")
    callActionInt { sorted(arrayListOf(1,9,2,8,3,7,4,6,5)) }

    println("[sortedBy]: list.sortedBy { s -> s.length }")
    callAction { sortedBy(arrayListOf("aaa","aa","aaaa","a")) }

    println("[reversed]: list.reversed()")
    callAction { reversed(arrayListOf("c", "b", "a", "C", "B", "A")) }

    println("[Judge]=================================")
    println("[all]: list.all()")
    callActionJudge { all(arrayListOf(1,2,3,4)) }

    println("[any]: list.any()")
    callActionJudge { any(arrayListOf(1,5,7,9)) }

    println("[none]: list.none()")
    callActionJudge { none(arrayListOf(5,7,9,10)) }

    println("[Caliculation]=================================")
    println("[sum]: list.sum()")
    callActionPrimitive{ sum(arrayListOf(1,2,3,4)) }

    println("[average]: list.average()")
    callActionDouble{ average(arrayListOf(1,2,3,4)) }

    println("")
}

fun callAction(function: () -> List<String?>) {
    println(function())
    println("----------------------------------------------")
}

fun callActionInt(function: () -> List<Int>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionMap(function: () -> Map<String, Int>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionMapInt(function: () -> Map<Int, Int>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionMapIntList(function: () -> Map<String, List<Int>>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionDimensionalList(function: () -> List<List<Int>>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionPair(function: () -> Pair<List<Int>, List<Int>>) {
    println(function())
    println("--------------------------------------------")
}

fun callActionPrimitive(function: () -> Int?) {
    println(function())
    println("--------------------------------------------")
}

fun callActionDouble(function: () -> Double) {
    println(function())
    println("--------------------------------------------")
}

fun callActionPrimitiveString(function: () -> String?) {
    println(function())
    println("--------------------------------------------")
}

fun callActionJudge(function: () -> Boolean) {
    println(function())
    println("--------------------------------------------")
}

