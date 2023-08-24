import scala.io.StdIn
object Question02 {

    class Rational(number: String) {

        def rat: List[Char] = number.toList

        def convert: Float = {

            val list: List[Char] = rat
            val char: Char = '/'
            var numerator: Float = 0.0f

            if (list.head == '-') {
                numerator = list.takeWhile(_ != char).mkString.toFloat * -1.0f
            }
            else {
                numerator = list.takeWhile(_ != char).mkString.toFloat
            }

            val denominator: Float = list.dropWhile(_ != char).tail.mkString.toFloat

            numerator / denominator

        }

        def sub(number2: Float): Float = {

            convert - number2
        } 

    }

    def main(args: Array[String]): Unit = {

        // print("Enter rational number1 : ")
        // val number = StdIn.readLine()

        val x: String = "3/4"
        val y: String = "5/8"
        val z: String = "2/7"

        val numberx = new Rational(x)
        val numbery = new Rational(y)
        val numberz = new Rational(z)

        val xMinusy = numberx.sub(numbery.convert)
        val xMinusyMinuxz = xMinusy - numberz.convert

        println(s"x - y - z = $xMinusyMinuxz")

    }

}
