package pemogramanStruktur

/**
 * perulanagan dengan kata kunci "for" pada kotlin
 * */

fun main() {

    //mencari bilangan genap dan ganjil dari angka 0 - 100
    for (x in 0..100)
        if (x % 2 == 0){
            println("$x adalah bilangan genap")
        } else if (x % 2 != 0){
            println("$x adalah bilangan ganjil")
        }
}