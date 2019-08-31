fun filter(list: List<Int>) = list.filter { num -> num %2 == 0 }

fun filterNot(list: List<Int>) = list.filterNot { num -> num %2 == 0 }

fun groupBy(list: List<Int>) = list.groupBy { num -> if (num % 2 == 0) "EVEN" else "ODD" }

fun chunked(list: List<Int>) = list.chunked(3)

fun partition(list: List<Int>) = list.partition { num -> num % 2 == 0}

fun take(list: List<Int>) = list.take(5)

fun takeLast(list: List<Int>) = list.takeLast(5)

fun drop(list: List<Int>) = list.drop(3)