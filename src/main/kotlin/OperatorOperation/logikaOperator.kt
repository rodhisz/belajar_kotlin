package OperatorOperation

/**
 * logika Operator
 * AND (&&), OR (||), NOT(!)
 * true / false
 * */

fun main(){

    val angkaPertama = 2
    val angkaKedua = 4
    val angkaKetiga = 6

    //kondisi 1
    if ((angkaPertama < angkaKedua ) && (angkaKedua < angkaKetiga)) {
//        benar                               benar
        println("Benar")
    } else {
        println("Salah")
    }

    //kondisi 2
    if ((angkaPertama < angkaKedua ) || (angkaKedua < angkaKetiga)) {

        println("Benar")
    } else {
        println("Salah")
    }

}