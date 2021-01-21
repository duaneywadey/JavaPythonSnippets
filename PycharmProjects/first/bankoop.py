class Account:
    instance_count = 0

    @classmethod
    def increment_instance_count(cls):
        cls.instance_count += 1

    def __init__(self, accnum, name, status):
        Account.increment_instance_count()
        self.accnum = accnum
        self.name = name
        self.status = status

    def getbalance(self):
        bal = 'Account[' + self.accnum.title() + '] - ' + self.name.title() + ', current account = ' + str(self.status)
        return bal.title()

    def savingsacc(self):
        ball = 'Account[' + self.accnum.title() + '] - ' + self.name.title() + ', savings account = ' + str(self.status)
        return ball.title()

    def invest(self):
        bala = 'Account[' + self.accnum.title() + '] - ' + self.name.title() + ' , investment account = ' + str(
            self.status)
        return bala.title()

    def deposit(self, amount):
        self.status = self.status + amount

    def withdraw(self, decrease):
        if decrease > self.status:
            print('balance:', acc1.finalbalance())
            print('Withdrawal would exceed your overdraft limit')
            print('balance:', acc1.finalbalance())
        else:
            self.status = self.status - decrease
            print('balance:', acc1.finalbalance())
            print('Number of accounts: ' + str(Account.instance_count))

    def DepositAccount(self, interestRate):
        dep = 'Account[' + self.accnum.title() + '] - ' + self.name.title() + ' , Opening balance = ' + str(
            self.status) + ', Interest rate: ' + str(interestRate)
        return dep.title()

    def InvestmentAccount(self, investmentType):
        inv = 'Account[' + self.accnum.title() + '] - ' + self.name.title() + ' , Opening balance = ' + str(
            self.status) + ', Investment type: ' + investmentType
        return inv.title()


    def finalbalance(self):
        finalb = self.status
        return finalb

acc1 = Account('123', 'John', 10.05)
acc2 = Account('345', 'John', 23.55)
acc3 = Account('567', 'Phoebe', 12.45)
print(acc1.getbalance())
acc1.deposit(23.45)
acc1.withdraw(200000)
