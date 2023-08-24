object Question04 {

    def main(args: Array[String]): Unit = {

        val accounts : List[(String, Double)] = List (
            ("1", -500.0),
            ("2", 1000.0),
            ("3", 100.0),
            ("4", -100.0)
        )

        def negativeBalance(accounts: List[(String, Double)]): List[(String, Double)] = {
            accounts.filter(_._2 < 0)
        }

        def balanceSum(accounts: List[(String, Double)]): Double = {
            accounts.map(_._2).sum
        }

        def finalBalance(accounts: List[(String, Double)]): List[(String, Double)] = {

            accounts.map {
                case (accountNumber, balance) =>
                    if (balance > 0) {
                        (accountNumber, balance * 1.05)
                    }
                    else {
                        (accountNumber, balance * 1.1)
                    }
            }
        }

        println("Accounts with negative balances : ")
        negativeBalance(accounts).foreach { case (accountNumber, balance) =>
            println(s"Account : $accountNumber , ${"%.2f".format(balance)}")    
        }

        println(s"\nTotal balance of all accounts: ${balanceSum(accounts)}")

        println(s"\nFinal balances after applying interest:")
        finalBalance(accounts).foreach { case (accountNumber, balance) =>
            println(s"Account : $accountNumber , ${"%.2f".format(balance)}")    
        }

    }
}
