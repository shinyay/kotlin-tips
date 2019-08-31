fun map(list: List<Int>) = list.map { num -> "Num: $num"}

fun mapIndexed(list: List<Int>) = list.mapIndexed { index, num -> "Index:$index - $num" }

fun mapNotNull(list: List<Int?>) = list.mapNotNull { num -> if (num == null) null else "Num: $num" }

fun flatMap(list: List<List<Int>>): List<Int> = list.flatMap { num -> num }

fun associate(list: List<Int>) = list.associate { num -> "Num * Num" to num * num }