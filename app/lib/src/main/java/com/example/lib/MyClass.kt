package com.example.lib
/* 1. crea un programa que tenga un precio de comida y un porcentaje de propina.
    e imprimir cuanto es el total a pagar
 */
fun main(){
//    println("Hola mundo")
//    //1.
//    val price : Double = 150.00
//    val porcentage : Double = 0.10
//    val tip : Double = price * porcentage
//    val total : Double = price + tip
//    println("El costo de la comida es: " + total)
//
//
//    //El portero de la discoteca verifica que una persona pueda entrar en la disco
//    //solo si es mayor de edad
    println("Pon una edad")
    val input = readlnOrNull()
    val age = input?.toIntOrNull()
//    if(age == null){
//        println("El numero que pusiste, no es un numero entero, ensertalo bien idiota!!!")
//    }
//    else if(age > 18){
//        println("Eres mayor de edad pasele")
//    }
//    else{
//        println("No puedes pasar eres menor")
//    }
//    println("La edad es: $age")

    //RANGOS !!!!!
    for (i in 1..10){
        println(i)
    }

    //ciclo for al reves
    for(i in 10 downTo 2){
        println(i)
    }

    for(i in 100 downTo 0 step 10){
        println(i)
    }

    //WHEN
    when(age){
        null -> println("Ingresa un numero valido")
        in 18..Integer.MAX_VALUE -> println("Pasele")
        else -> println("No puedes pasar mocoso")
    }

    var counter : Int = 12
    while(counter < 20){
        println("El contador es menor que 20")
        counter++
    }

    //DO WHILE -> Ejecuta primero el bloque de codigo y despues evalua la condicion
    //Operadores logicos: && ||
    //Operador arutmetico: + - * / %
    do{
        println("El contador vale menos que 30")
        counter++
    }
        while(counter < 30)


}


