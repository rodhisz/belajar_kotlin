package Fungsi
/**
 * fungsi dengan parameter dan return type
 * */

fun main() {
    println(Perkalian(6, 2))

    val pembagian = Perkalian(5,2) / angkaBagi(1)
    println(pembagian)

    HelloWord()
    Nama()
}

/*membuat fungsi Perkalian dengRumah.kt return type Integer*/
fun Perkalian(angkaPertama:Int, angkaKedua:Int):Int{
    val hasil = angkaKedua * angkaPertama
    return hasil
}

/*membuat fungsi pembagian dengan return type Integer*/
fun angkaBagi(angka_bagi:Int):Int{
    return angka_bagi
}

/*membuat fungsi Helloworld tanpa parameter dan tanpa pengembalian*/
fun HelloWord(){
    print("haloo")
}

/*fungsi tanpa parameter dengan pengembalian*/
fun Nama():String{
    val nama = readLine()
    return nama.toString()
}