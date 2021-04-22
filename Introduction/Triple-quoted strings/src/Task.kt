const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}

/* trimMargin(marginPrefix: "?")
*   - trim(좌우 공백 제거) + Margin(marginPrefix의 값을 제거 후 출력 : 위에서는 #을 전부 제거) + 들여쓰기 제
*
*  trimIndent
*   - trim(좌우 공백 제거) + 모든 라인 들여쓰기 제거
 */