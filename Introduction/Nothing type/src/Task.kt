import java.lang.IllegalArgumentException

fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(null)
}

/*
* Nothing 처리를 안할 경우
* IllegalArgumentException 함수 내 $age가 null이 될 수도 있기 때문에 컴파일 자체가 안됨
*
* */