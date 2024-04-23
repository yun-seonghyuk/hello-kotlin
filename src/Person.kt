sealed class Person(
    var name: String,
    var isMarried: Boolean
)

class Family(
    val familyName: String
)

class GrandFather(
    val name: String
)

class Developer(
    name: String,
    isMarried: Boolean,
    val language: String
) : Person(
    name,
    isMarried
)

class Marketer(
    name: String,
    isMarried: Boolean,
    val division: Division
) : Person(
    name,
    isMarried
)

enum class Division {
    CONTENTS, DIGITAL, BRAND
}

fun getSpecialSkill(person: Person) =
    when (person) {
        is Developer -> person.language

        is Marketer -> person.division
    }