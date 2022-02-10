fun main() {
/* Оценка обслуживания банка в баллах
Используем оценки от 1 до 5
*/
    val rating: Int = 4

//    1-плохо
//    2-плохо
//    3-нормально
//    4-хорошо
//    5-отлично

    //таблица истинности && and ||
    /*
    && (И) логический оператор
    true&true = true
    true&false = false
    false&true = false
    false&false = false

    || (ИЛИ) логический оператор
    true//true = true
    true//false = true
    false//true = true
    false//false = false

    !-отрицание
    true false
    false true
     */


    // два метода решения: через if & else || when


    if (rating == 1)
        println("плохо")
    else if ((rating == 2))
        println("плохо")
    else if (rating == 3)
        println("нормально")
    else if (rating == 4)
        println("хорошо")
    else if (rating == 5)
        println("отлично")

    when {
        rating == 1 || rating == 2-> println("Плохо")
        rating == 3 -> println("нормально")
        rating == 4 -> println("хорошо")
        rating == 5 -> println("отлично")
    }

}