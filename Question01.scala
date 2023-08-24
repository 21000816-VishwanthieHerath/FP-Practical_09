import scala.io.StdIn

object Question01 {

    class Rational(number: String) {

        def rat: List[Char] = number.toList

        def neg: List[Char] = {

            val list: List[Char] = rat

            if (list.head == '-') {
                list.tail
            }
            else {
                '-' :: list
            }

        }

    }

    def main(args: Array[String]): Unit = {


        print("Enter a rational number : ")
        val number = StdIn.readLine()

        val x =  new Rational(number)

        val result = x.neg

        println("The negative is : " + result.mkString)

    }

}

