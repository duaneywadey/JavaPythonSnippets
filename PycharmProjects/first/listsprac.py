import random

class Chameleon():
    def __init__(self,name,age):
        self.name = name
        self.age = age
        self.introduce = 'Hello there my name is ' + name + ' ' + str(age)
        self.describe = 'Hello there ' + name + ' is responsible'

    def stayCalm(self):
        print(self.name.title() + ' is now staying in calm')

    def crawl(self):
        print(self.name.title() + ' is crawling!')
        nammee = 'Hey there ' + ' ' +  self.name
        return nammee
    def ageIncrease(self):
        ageUp =  self.name.title() + " age is now " + str(int(self.age + 100))
        return ageUp

mynewchameleon = Chameleon('Dory', 40)
anotherchameleon = Chameleon('Kris', 60)
print(mynewchameleon.introduce)
print(mynewchameleon.describe)
print(mynewchameleon.stayCalm())
print(mynewchameleon.crawl())
print(mynewchameleon.ageIncrease())
print('\n')
print(anotherchameleon.introduce)
print(anotherchameleon.describe)
print(anotherchameleon.stayCalm())
print(anotherchameleon.crawl())
print(anotherchameleon.ageIncrease())

class Newclass:
    def __init__(self, pang, edad):
        self.pang = pang
        self.edad = edad
    def showname(self):
        greet = '\nHello ' + self.pang.title() + " You're " + self.edad.title() + " years old"
        return greet

    def showedad(self):
        age = "\nYou're " + self.edad.title() + " !"
        return age

namee = Newclass('Tim', '25')
anoth = Newclass('Dan', '34')
print(namee.showname())
print(anoth.showname())
print(namee.showedad())
print(anoth.showedad())

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




class Corey:
    raiseAmount = 1.04
    numofemps = 0

    def __init__(self, first, last, pay):
        self.first = first
        self.last = last
        self.pay = pay
        Corey.numofemps+=1

    def fullname(self):
        return self.first.title() + ' ' + self.last.title()

    def applyRaise(self):
        self.pay = int(self.pay * self.raiseAmount)
        return self.pay

    @classmethod
    def setRaiseAmount(cls, amount):
        cls.raiseAmount = amount

    @classmethod
    def dashDash(cls,emp):
        first, last, pay = emp.split('-')
        return cls(first, last, pay)


Corey.setRaiseAmount(5.00)
emp1 = Corey('Corey', 'Smith', 5000)
emp2 = Corey('Auden', 'Cruz', 3000)
emp3 = Corey('Avery', 'Cruz', 3000)
emp4 = 'Cole-Hill-9000'
emp5 = 'Dave-Smith-8000'
emp6 = 'John De la Cruz-Dela Cruz-9000'
print(emp1.pay)
print(emp1.pay)
emp1.applyRaise()
print(emp1.pay)
print(emp1.__dict__)
print(Corey.numofemps)
newemp1 = Corey.dashDash(emp4)
print(newemp1.pay)
print(newemp1.first)

class boxing(object):
    def __init__(self, dateStart, origin):
        self.dateStart = dateStart
        self.origin = origin

    def intro(self):
        print('My sport started at ' + self.dateStart + ' and it came from ' + self.origin)

    def sayAny(self):
        print('Boksing')

class MMA(boxing):
    def __init__(self, dateStart, origin, style, org):
        super().__init__(dateStart, origin)
        self.style = style
        self.dateStart = '400000 BCE'

    def sayAny(self):
        print('MMA FTW')

otherguy = boxing('6000 BCE', 'France')
otherguy.sayAny()
otherguy.intro()
ivan = MMA('BC Times', 'Greece', 'Brazilian', 'UFC')
ivan.intro()

class martialArts(object):
    def __init__(self,nameofsport, originn, influences):
        self.nameofsport = nameofsport
        self.originn = originn
        self.influences = influences

    def introduce(self):
        return  self.nameofsport + 'is really a tough sport '

    def country(self):
        return self.originn + ' is where the sport originated'

    def influences(self):
        return self.influences() + 'influenced this sport'

class UFC(martialArts):
    def __init__(self,nameofsport, originn, influences, difficulty, famous):
        super().__init__(nameofsport, originn,influences)
        self.difficulty = difficulty
        self.famous = famous

    def whatUFC(self):
        if self.difficulty == 'Easy':
            return self.difficulty + 'hnggggggggggggggggggggggg'
        else:
            return self.nameofsport + ' is a tough sport that involves a lot of martial art styles and this shit is too ' + self.difficulty


    def levelD(self):
        return 'This sport is ' + self.difficulty



class AnotherClass:

    def __init__(self,name,sex,gpa):
        self.name = name
        self.sex = sex
        self.gpa = gpa
        self.data =[]
        self.lista = []

    def showData(self):
        self.data.append(self.name)
        self.data.append(self.sex)
        self.data.append(self.gpa)
        print()
        return  self.data

    def getGrade(self):
        self.lista.append(self.gpa)
        return self.lista

    def ifGrade(self):
        if self.gpa > 2.00:
            return "not on dean's list"
        return "o dean's list"

    def aveG(self):
        value = 0
        for i in self.data:
            value+=self.getGrade()
        return value // len(self.data)


a = AnotherClass('Duaney', 'Male', 1.70)
b = AnotherClass('Cole', 'Male', 2.04)
c = AnotherClass('Aila', 'Female', 2.12)
d = AnotherClass('Lea', 'Female', 1.43)
e = AnotherClass('Baldwin', 'Male', 1.13)
print(a.showData())
print(a.ifGrade())
print(b.showData())
print(b.ifGrade())
print(c.showData())
print(c.ifGrade())
print(d.showData())
print(d.ifGrade())























