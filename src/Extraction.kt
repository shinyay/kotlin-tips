fun filter(list: List<Int>) = list.filter { num -> num %2 == 0 }

fun filterNot(list: List<Int>) = list.filterNot { num -> num %2 == 0 }

fun groupBy(list: List<Int>) = list.groupBy { num -> if (num % 2 == 0) "EVEN" else "ODD" }

fun chunked(list: List<Int>) = list.chunked(3)