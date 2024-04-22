//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main() {
    val name = "Kotlin"
    //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
    // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
    println("Hello, " + name + "!")
    val value:Int = max(5, 3)
    println("Max value is : $value" )

    val person = Person("November", false)

    person.name = "new Name"
    person.isMarried = true

    println("person name : ${person.name}, isMarried : ${person.isMarried}")
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}