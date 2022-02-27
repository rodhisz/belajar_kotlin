package fungsi

/**
 * fungsi dibagi menjadi 3
 * 1. jika TIDAK MEMILIKI paramater disebut prosedur
 * 2. jika MEMILIKI parameter disebut fungsi
 * 3. jika memiliki pengembalian(return) disebut method
 * */

fun main() {
    tambah(2, 3)
    LuasSegitiga(10, 5)
}

fun tambah(nomor1:Int, nomor2:Int){
    val sum = nomor1 + nomor2
    println(sum)
}

fun LuasSegitiga(tinggi:Int, alas:Int){
    val hitungluas = tinggi*alas/2
    println("luas segitiga adalah $tinggi dikali  alas $alas dibagi 2 hasilnya $hitungluas")
}

