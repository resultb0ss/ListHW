fun main() {
    var array: ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9,10)

    //Задание 1
    println("Задание 1")
    println("-------------------")
    println()

    println("Цикл: Первый элемент списка ${array[0]}")
    println("Функция: Первый элемент списка ${array.first()}")

    println()


    //Задание 2
    println("Задание 2")
    println("-------------------")
    println()

    var result = 0
    for (i in array){
        result += i
    }

    println("Цикл: Ср ариф ${result.toDouble() / array.size.toDouble()}")

    println("Функция: Ср ариф ${array.average()}")

    println()


    //Задание 3
    println("Задание 3")
    println("-------------------")
    println()

    var resultTwo = 0
    for (i in array){
        resultTwo += i
    }
    println("Цикл: Сумма элементов списка $resultTwo")
    println("Функция: Сумма элементов списка ${array.sum()}")

    println()


    //Задание 4
    println("Задание 4")
    println("-------------------")
    println()

    var resultThree = 0
    for (i in array.indices){
        resultThree += 1
    }
    println("Цикл: Количество элементов списка $resultThree")
    println("Функция: Количество элементов списка ${array.count()}")

    println()


    //Задание 5
    println("Задание 5")
    println("-------------------")
    println()

    println("Цикл: Сумма последних 2х элементов равна ${array[array.size - 1] + array[array.size - 2]}")
    println("Функция: Сумма последних 2х элементов равна ${array.takeLast(2).sum()}")
    println()


    //Задание 6
    println("Задание 6")
    println("-------------------")
    println()

    var sumInd = 0
    for (i in array.indices){
        sumInd += i
    }
    println("Цикл: Сумма индексов списка $sumInd")
    println("Функция: Сумма индексов списка ${array.indices.sum()}")



}

