package ClassAndObject


//Interface classes = classes that have methods without bodies
interface InputHandler {

    fun clicked()
    fun doubleClick()
    fun singleClick()


}

class phone : InputHandler{
    override fun clicked() {
        println("clicked")
    }

    override fun doubleClick() {
        println("double Click")
    }

    override fun singleClick() {
        println("single click")
    }

}

fun main() {

    var Phone = phone()
    Phone.clicked()
    Phone.doubleClick()

}