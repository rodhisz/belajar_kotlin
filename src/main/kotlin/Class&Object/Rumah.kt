package ClassAndObject

class Rumah(var tipe :String, val harga:Int, val tahunPembangunan :Int, val pemilik:String){

    //melakukan inisialisasi class rumah
    init {
        this.tipe
        this.harga
        this.tahunPembangunan
        this.pemilik
    }

    /**
     * kotlin menginginkan kita untuk selalu menggunkaan properties untuk mengakses dan set class
     * */
}


fun main() {

    val rumah = Rumah("mewah", 1000000, 2019, "musalim")

    println("rumah ${rumah.pemilik} tahun pembangunan ${rumah.tahunPembangunan} dengan harga ${rumah.harga} tipe ${rumah.tipe}")

    val toko = Rumah("menengah", 9000000, 2012, "budi")
    println("toko ${toko.pemilik} tahun pembangunan ${toko.tahunPembangunan} dengan harga ${toko.harga} tipe ${toko.tipe}")

}