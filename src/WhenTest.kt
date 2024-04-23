import Color.*

fun main(){
    val developer = Developer("zero",true, "Kotlin")
    val marketer = Marketer("mark", false, Division.BRAND)

    println("developer s special skill is : ${getSpecialSkill(developer)}")
    println("developer s special skill is : ${getSpecialSkill(marketer)}")

    println("RED is ${getKoreanColorName(RED)}")
}

enum class Color {
    RED, GREEN, BLUE,GRAY
}

fun getKoreanColorName(color: Color) = when (color) {
    RED -> "빨강"
    GREEN -> "녹색"
    BLUE -> "파랑"
    GRAY -> "회색"
}