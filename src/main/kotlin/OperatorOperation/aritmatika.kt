package OperatorOperation

fun main() {

    val angkaPertama = 5
    val angkaKedua = 2

    //penjumlahan
    println("Hasil penjumlahan dari $angkaPertama dan $angkaKedua adalah ${angkaPertama + angkaKedua}")

    //penjumlahan
    println("Hasil pengurangan dari $angkaPertama dan $angkaKedua adalah ${angkaPertama - angkaKedua}")

    //perkalian
    val result = angkaPertama * angkaKedua
    println("Hasil perkalian dari $angkaPertama dan $angkaKedua adalah $result")

    //pembagian
    val hasil = angkaPertama / angkaKedua.toFloat()
    println("Hasil pembagian dari $angkaPertama dan $angkaKedua adalah $hasil")

}