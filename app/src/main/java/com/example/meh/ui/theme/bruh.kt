package com.example.meh.ui.theme
fun main() {
    //1. Работа с преобразованием строк
    val numbers = listOf("one", "two", "three", "four")

    println(numbers) // [one, two, three, four]
    println(numbers.joinToString()) // one, two, three, four

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString) // The list of numbers: one, two, three, four
    //2. Базовая арифметика
    val a = 5
    val b = 7
    val sum = a + b
    println(sum)

    //3. Пример интерполяции строк
    val greetings = "Здравствуйте"
    val userName = "Звездный Лорд"
    println("$greetings, $userName! Какой будет ваш главный вопрос?")
    println("На который можно ответить ${40 + 2}")

    //4. Преобразованеие типов
    val s: String = "12"
    val d: Int = s.toInt()
    println(d)

    //5. Пример условных операторов
    val z = readln()
    if (z == "Hello")
        println("World")
    else
        println("Epic fail")

    println("Bye")

    //6. Пример цикла for
    for(i in 1..5) {
        println(i)
    }

    // 6. Пример цикла while
    var i = 1
    while (i < 9) {
        println(i)
        i = i + 1
    }
    println(i) // 9

    //7. Пример создания отдельной функции
    fun greet() {
        println("Привет!")
    }
    greet()

    //8. Пример работы с массивом
    val myArray = arrayOf(1, 2, 3, 4, 5)
    println(myArray[2])
}