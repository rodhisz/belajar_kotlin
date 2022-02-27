package pemogramanStruktur

/**
 * do while loop
 * akan tetap melakukan sekali pengulangan walaupun tidak masuk dalam kondisi while*/

fun main() {

    var perhitungan = 4

    do {
        println("angka $perhitungan")
        perhitungan--

    } while (perhitungan >= 5)

    println("selesai, angka $perhitungan out of range")
}