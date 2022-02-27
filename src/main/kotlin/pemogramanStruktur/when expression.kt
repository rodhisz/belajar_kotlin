package pemogramanStruktur

/**
 * salah satu percabangan dalam kotlin
 * when + readline
 * */

fun main() {

    //applikasi tebak umur

    println("saya sekarang berumur 10 tahun, 10 tahun yang akan datang saya berumur?")
    val jawaban = readLine()?.toInt()

    when(jawaban) {
        18 -> print("anda salah tebak umur")
        19 -> print("yak dikit lagi")
        20 -> print("jawaban anda benar")
        21 -> print("kelebihan dikit bro")
        else -> {
            print("aduhh jawabannya kejauhann")
        }
    }
}