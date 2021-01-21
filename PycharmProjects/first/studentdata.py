import math

# 1
def double(num):
    return num * 2


def triple(num):
    return num * num * num


def square_root(num):
    return math.sqrt(num)


def is_prime(num):

    num = abs(int(num))
    if num < 2:
        return False
    if num == 2:
        return True
    if not num & 1:
        return False
    for x in range(3, int(num ** 0.5) + 1, 2):
        if num % x == 0:
            return False
    return True

def is_integer(num):
    try:
        int(num)
        return True
    except ValueError:
        return False


def is_letter(num):
    try:
        int(num)
        return False
    except ValueError:
        return True


def my_higher_order_function(num, func):
    return func(num)


print(my_higher_order_function(2, double))
print(my_higher_order_function(2, triple))
print(my_higher_order_function(16, square_root))
print(my_higher_order_function(2, is_prime))
print(my_higher_order_function(4, is_prime))
print(my_higher_order_function('2', is_integer))
print(my_higher_order_function('A', is_integer))
print(my_higher_order_function('A', is_letter))
print(my_higher_order_function('1', is_letter))
print()


# 2

def convert(aa, bb):
    return aa * bb


def curry(func, num):
    return lambda y: func(num, y)


dollars_to_sterling = curry(convert, 0.77)
print(dollars_to_sterling(5))
euro_to_sterling = curry(convert, 0.88)
print(euro_to_sterling(15))
sterling_to_dollars = curry(convert, 1.3)
print(sterling_to_dollars(7))
sterling_to_euro = curry(convert, 1.14)
print(sterling_to_euro(9))
print()


# 3
class Account:
    def __init__(self, accnum, name, status):
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
        self.status = self.status - decrease

    def finalbalance(self):
        finalb = self.status
        return finalb


acc1 = Account('123', 'John', 10.05)
acc2 = Account('345', 'John', 23.55)
acc3 = Account('567', 'Phoebe', 12.45)
print(acc1.getbalance())
print(acc2.savingsacc())
print(acc3.invest())
acc1.deposit(23.45)
acc1.withdraw(12.33)
print('balance:', acc1.finalbalance())
print()

# 4 (19.7) 209
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
        self.status = self.status - decrease

    def finalbalance(self):
        finalb = self.status
        return finalb


acc1 = Account('123', 'John', 10.05)
acc2 = Account('345', 'John', 23.55)
acc3 = Account('567', 'Phoebe', 12.45)
print(acc1.getbalance())
print(acc2.savingsacc())
print(acc3.invest())
acc1.deposit(23.45)
acc1.withdraw(12.33)
print('balance:', acc1.finalbalance())
print('Number of accounts: ' + str(Account.instance_count))
print()

# 5 (20.14) 231
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
