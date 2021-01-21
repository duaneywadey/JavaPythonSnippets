import random
from random import shuffle
import math
import sys



def greet_user(username):
    print('Hello ' + username.title() + "!")


greet_user('Ivan')


def book(favoritebook):
    print('My favorite book is ' + favoritebook.title())


book('Crash Course')


def learn():
    print("Today we'll be learning about Fuctions")


learn()
learn()


def addvar(name, petname):
    print("\nHi my name is " + name.title() + " and here's my pet " + petname.title())
    print(petname.title() + ' is such an adorable creature')


addvar('Ivan', 'Cody')
addvar('Andrew', 'Molly')


def cities(country, city):
    print('\n' + city.title() + ' is in ' + country.title())


cities('Philippines', 'Manila')
cities('Iceland', 'Reykjavik')
cities('Indonesia', 'Jakarta')


def nameformat(firstname, middlename, lastname):
    fullname = lastname + ", " + firstname + " " + middlename
    return fullname.title()


finalname = nameformat('Ivan Duane', 'R.', 'Dequito')
print(finalname)


def grunge(gfname, glname):
    gflname = gfname + " " + glname
    return gflname.title()


mfinalname = grunge('Kurt', 'Cobain')
print(mfinalname)


def mmname(ffname, llname, mname=""):
    if mname:
        ffullname = ffname + '' + mname + '' + llname
    else:
        ffullname = ffname + '' + llname
    return ffullname.title()


format = mmname('\n' + 'Ivan Duane', 'Dequito', ' R.')
print(format)
format = mmname('Auden', ' Smith')
print(format)


def dictperson(dfname, dlname):
    dperson = {'first': dfname,
               'last': dlname}
    return dperson


makeperson = dictperson('Duaney', 'Wadey')
print(makeperson)


def agee(png, aply, edad=''):
    tao = {'una': png,
           'dlw': aply}
    if edad:
        tao['age'] = edad
    return tao


ftao = agee('Audee', 'Audeyy', edad=19)
print(ftao)


def ath(athfname, athlname, winner=''):
    dictath = {"Athlete's first name": athfname,
               "Athelete's last name": athlname}
    if winner:
        dictath['times won'] = winner
        buopang = athfname + " " + athlname + " " + str(winner)
    else:
        buopang = athfname + " " + athlname
    return dictath


varath = ath('Kris', 'Delano', winner=5)
print(varath)


def batian(names):
    print('\nGood evening to all!')
    for tao in names:
        print('Hi ' + tao.title() + '!')


allowednames = ['Trix', 'Clifford', 'Ace']
batian(allowednames)
x = len(allowednames)
print('\nNumber of names: ' + str(x))


def songer(artist, album):
    coll = {'JB': 'Baby',
            'Cole': 'Sprouse',
            artist: album}
    return coll


makeanoth = songer('Auden', 'ocd')
print(makeanoth)


def fbuser(fbnames):
    print('Good morning to all fb users!')
    for user in fbnames:
        print('Kamusta ka? ' + user.title())


validfbnames = ['Dylan', 'Cole', 'Nathan']
fbuser(validfbnames)

unprinted_designs = ['iphone case', 'robot pendant', 'dodecahedron']
completed_models = []


def print_models(unprinted_designs, completed_models):
    while unprinted_designs:
        current_design = unprinted_designs.pop()
        print("Printing model: " + current_design)
        completed_models.append(current_design)


def show_completed_models(completed_models):
    print("\nThe following models have been printed:")
    for completed_model in completed_models:
        print(completed_model)


unprinted_designs = ['iphone case', 'robot pendant', 'dodecahedron']
completed_models = []
print_models(unprinted_designs, completed_models)
show_completed_models(completed_models)

bassguitarstohave = ['Fender', 'Rickenbacker', 'Fernandes', 'Ibanez', 'Stingray']
bassialreadyhave = []


def mustHave(bassguitarstohave, bassialreadyhave):
    while bassguitarstohave:
        startingtohave = bassguitarstohave.pop()
        print('Buyinggg.... ' + startingtohave)
        bassialreadyhave.append(startingtohave)


def showmybass(bassialreadyhave):
    print('\nI already have these basses: ')
    for pp in bassialreadyhave:
        print(pp)


mustHave(bassguitarstohave, bassialreadyhave)
showmybass(bassialreadyhave)

magicians = ['Dave', 'Josh', 'Clint', 'Avian', 'Cole', 'Kenny', 'Jameson', 'Baldwin', 'Janssen']
goodmc = []
badmc = []


def allmagicians(magicians, goodmc, badmc):
    print('\nAll magicians: ')
    for tt in magicians:
        print('\t' + tt.title())
    goodmc.append(magicians[0:4])
    badmc.append(magicians[5:8])


def showAll(goodmc, badmc):
    print('\nGood and bad magicians: ')
    print('\tGood')
    for gg in goodmc:
        print(gg)
    print('\tBad')
    for bb in badmc:
        print(bb)


allmagicians(magicians, goodmc, badmc)
showAll(goodmc, badmc)


def getany(*bass):
    print('I will buy all this bass')
    for b in bass:
        print('\t- ' + b)


getany('Fernando')
getany('RJ')
getany('Global')
getany('Fender', 'Ibanez', 'Stingray', 'Musicman', 'Mayones')


def makebass(kind, *brand):
    print('My basses are the following:')
    for br in brand:
        print('\t' + br + ' ' + kind)


makebass('Class A', 'Musicman', 'Class B', 'Fender')
makebass('Class B', 'Stingray')


def nba(team, *player):
    print('In ' + team + ', I played with the following players:')
    for p in player:
        print('\t' + '-' + p)


nba('New York Knicks', 'Cole', 'Daniel', 'Josh', 'Kris', 'Marcus')
nba('Philadelpha', 'Albert', 'James', 'Kristoffer')


def randomProfile(first, last, **userInfo):
    profile = {}
    profile['First name'] = first
    profile['Last name'] = last
    for key, value in userInfo.items():
        profile[key] = value
    return profile


def makeShawarma(size, *meat):
    print('Making a ' + str(size) + ' inch shawarma')
    for mm in meat:
        print('-' + mm)


def makeSandwich(namef, namel, **sandwichinfo):
    sandw = {}
    sandw['First name'] = namef
    sandw['Last name'] = namel
    for key, value in sandwichinfo.items():
        sandw[key] = value
    return sandw


sandwichMake = makeSandwich('Audenn', 'Samm', toppings='Onion', sauce='Ketchup', Veggies='Cucumber')
print(sandwichMake)


def translate(phrase):
    translation = ""
    for letter in phrase:
        if letter in 'AEIOUaeiou':
            gh = random.randint(10000, 100000000)
            hg = random.randint(10000, 100000000)
            translation = translation + str(gh) + str(hg) + str(gh)
        else:
            translation += letter
    return translation


def translateFil(eng):
    salin = ""
    unused = ['Hello', 'Hi', 'Haluu']
    for lett in eng:
        if lett in 'h' or 'e' or 'l' or 'l' or 'o':
            salin = salin + 'Kamusta'
        else:
            salin += lett
    return salin


def arraysprac(l1, l2):
    lista = []
    cool = ['baket', 'ba', 'pre']
    while cool:
        add = cool.pop()
        lista.append(add)
    lista.reverse()
    lista.append(l1)
    lista.append(l2)
    return lista


def allinall(numtobe, numtobee, numtobeee):
    five = numtobe * 5
    four = numtobee * 4
    three = numtobeee * 3
    allinall = five + four + three
    print("Asset= " + str(allinall))


allinall(1000, 2000, 3000)


# 1
def double(num):
    return num * 2


def triple(num):
    return num * num * num


def square_root(num):
    return math.sqrt(num)


def is_prime(num):
    '''check if integer n is a prime'''

    # make sure n is a positive integer
    num = abs(int(num))

    # 0 and 1 are not primes
    if num < 2:
        return False

    # 2 is the only even prime number
    if num == 2:
        return True

        # all other even numbers are not primes
    if not num & 1:
        return False

    # range starts with 3 and only needs to go up
    # the square root of n for all odd numbers
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
acc1.withdraw(200000)


def greetAll(ppl):
    for pp in ppl:
        print("Hello there! " + pp.title())
ppl = ['Auden', 'Oden', 'Odin']
ppl.append("Johnny")
greetAll(ppl)

def greetAll(nns):
    for n in nns:
        if n % 2 == 0:
            print(str(n) + ' even!')
        else:
            print(n)
nns = [1134,246,264,357,15,357,436,247,35,2]
greetAll(nns)

def dict(stuff):
    cashtotal = 0
    print()
    for cc in stuff.values():
        print(cc)
        cashtotal += cc
    print("Total: " + str(cashtotal))
stuff = {'Auden':1000, 'Lili':500, 'Avery': 100, 'Adelaide': 50}
dict(stuff)



registeredUsers = {
    'Albert' : {
        'Age': 24,
        'Gender': 'Male',
        'Location': 'Manila',
    },

    'Cole': {
        'Age': 18,
        'Gender': 'Male',
        'Location': 'Cavite',
    },
    'Nate': {
        'Age': 29,
        'Gender':'Male',
        'Location': 'Cebu',

    }

}


def hithere(okay):
    for k in okay:
        print(k)
hithere('hello')

userscode = {
    'Ivan': 245532,
    'Duaney': 3737,
    'Auden': 357537
}
typname = input('Enter a name: ')
if typname not in userscode:
    code = int(input('Enter a code: '))
    userscode[typname] = code
    print(userscode)
else:
    print(userscode)













