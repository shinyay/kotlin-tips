fun sum(list: List<Int>) = list.sum()

fun average(list: List<Int>) = list.average()

fun reduce(list: List<Int>) = list.reduce { acc, i -> acc * i }

fun fold(list: List<Int>) = list.fold(10) { acc, i -> acc * i }