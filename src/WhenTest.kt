import Color.*
import java.util.TreeMap

fun main(){
    val developer = Developer("zero",true, "Kotlin")
    val marketer = Marketer("mark", false, Division.BRAND)

    println("developer s special skill is : ${getSpecialSkill(developer)}")
    println("developer s special skill is : ${getSpecialSkill(marketer)}")

    println("RED is ${getKoreanColorName(RED)}")

    val binaryReps = TreeMap<Char, String>()

    for(c in 'A' .. 'z'){
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for((key, value) in binaryReps){
        println("문자:${key}, 아스키코드:$value")
    }

}

fun isLetter(c: Char) = c in 'a'..'z'

enum class Color {
    RED, GREEN, BLUE,GRAY
}

fun getKoreanColorName(color: Color) = when (color) {
    RED -> "빨강"
    GREEN -> "녹색"
    BLUE -> "파랑"
    GRAY -> "회색"
}