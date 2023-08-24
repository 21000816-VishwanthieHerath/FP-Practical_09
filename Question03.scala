import scala.io.StdIn
object Question03 {

    class Account(account1: String) {

        def deposit(amount: Float): Unit = {
            println(s"$account1 deposited Rs.$amount")
        }

        def withdraw(amount: Float): Unit = {
            println(s"$account1 withdrawed Rs.$amount")
        }

        def transfer(account2: Account, amount: Float): Unit = {
            withdraw(amount)
            account2.deposit(amount)
        }

    }

    def main(args: Array[String]): Unit = {

        print("Enter the account to transfer from : ");
        val fromAccount = StdIn.readLine()

        print("Enter the account to transfer to : ");
        val toAccount = StdIn.readLine()

        print("Enter the amount to transfer : ");
        val amount = StdIn.readFloat()

        val thisAccount = new Account(fromAccount)
        val otherAccount = new Account(toAccount)

        thisAccount.transfer(otherAccount, amount)

    }

}
