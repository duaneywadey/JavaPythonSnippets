import random
import math
randomList = [23, 241, 413, 264, 462, 2642, 62464]
for x in randomList:
    print(x)
    print("new num")
for a in range(1, 11):
    print(a)
    print("new num")

d = -10
while d <= 0:
    print(d)
    d += 1

# num = int(input("Enter a number: "))
# mul = num * 10
# val = num

# while num <= mul:
#   print(num)
#  num+=val

l = 0
m = 1
rndm = random.randint(1, 10000)
print(m)
while l <= rndm:
    n = l + m
    l = m
    m = n
    if n >= rndm:
        break
    print(n)

# Random numbers on 0
value = random.random()
print(value)

# Random decimal numbers
value1 = random.uniform(1, 100)
print(value1)

# Random whole numbers
value2 = random.randint(1, 1000)
print(value2)

# Random choice on greetings
greetings = ["Hello", "Kamusta", "Howdy", "Ni hao", "Hi"]
value3 = random.choice(greetings)
print(value3 + " user!")

# Random choice on colors with number of inputs
colors = ["Black", "Green", "Blue", "Yellow", "Violet", "Magenta", "Fuschia"]
results = random.choices(colors, k=10)
print(results)

# Weight function
colors = ["Black", "Green", "Blue"]
results1 = random.choices(colors, weights=[20, 20, 2], k=50)
print(results1)

# List of numbers
deck = list(range(1, 53))
print(deck)
print()

# Shuffling a list of numbers
deck1 = list(range(1, 10))
random.shuffle(deck1)
print(deck1)
print()

# Sample method
deck2 = list(range(1, 50))
lot = random.sample(deck2, k=5)
print(lot)

numinp = random.randint(1,100)
print(numinp)
if numinp % 10 == 0:
    print(str(numinp) + " is a multiple of 10")
else:
    print("It's not a multiple of 10")

#prompt = "\nTell me something, and I will repeat it back to you:"
#prompt += "\nEnter 'quit' to end the program. "
#message = ""

#while message != 'quit':
 #   message = input(prompt)
  #  print(message)

#question = "\nAre you really over 18? "
#res = ""

#while res != 'yes':
 #   res = input(question)
  #  print(res)



rndmm = random.randint(1,500)
numstart = 1
while numstart < rndmm:
    numstart+=1
    if numstart % 2 == 0:
        continue
    print(numstart)

# ".title()" is used to print an individual value from a list cleanly
cellphonebrands = ['Huawei', 'Vivo', 'Samsung', 'Apple']
print("My favorite brand of phone is " + cellphonebrands[2].title() + ".")

# ".append" is used to add an individual value
friends = ['Timothy', 'Alden', 'Ivan', 'Ramil', 'Gunther', 'Markus']
friends.append('Eilaine')
print(friends)

#".insert" is used to insert an element
friends.insert(0, "Hanna")
print(friends)
print()

#".pop" is used to remove an element using indexes
friends.pop(0)
print(friends)
print()

#".remove" is used to remove an element directly
friends.remove("Ivan")
print(friends)
print()

#".sort" is used to sort a list
friends.sort()
print(friends)
print(sorted(friends))
print()

#Working through lists
for friend in friends:
    print("\n""Hello " + friend.title())
    print("Its so nice to meet you! " + friend.title())
print("\nIts all nice to meet you guys!")

firstnames = ['James', 'Robert', 'Andrew', 'Ethan', 'Nate', 'Billy', 'Kyle', 'Aldrin', 'Kevin', 'David', 'Stephen', 'Joshua']
lastnames = ['Cruz', 'Gomez', 'Ng', 'Chua', 'Kim', 'Park', 'De la Cruz', 'Mendoza', 'Pascual', 'Ibanez', 'Villanueva', 'Ramos', 'Castro', 'Zabala']
subd = ['Charbel', 'Greenwoods', 'Sta Mesa', 'Sta. Lucia', 'Sta Ignacia', 'Country Homes', 'Sta Fe', 'Burol', 'Guevarra', 'Town and Country', 'Fulgoso st.']
city = ['Cavite', 'CamSur', 'Ilocos', 'Rizal', 'Cebu', 'Tarlac', 'La Union', 'Pangasinan', 'Pampanga', 'Bulacan', 'Cagayan', 'Nueva Ecija', 'Nueva Vizcaya', 'Manila', 'Quezon City']

for num in range(50000):
    fn = random.choice(firstnames)
    ln = random.choice(lastnames)
    s = random.choice(subd)
    c = random.choice(city)
    print(fn + " " + ln + "\n" + s + ", " + c + "\n" )

for xx in range(100):
    if xx % 13 == 0:
        print(xx)

# Making a list of numbers
numms = list(range(1,11))
print(numms)

# Making a list of even numbers using 3 parameters
even_numbers = list(range(8,80,2))
print(even_numbers)

# Adding elements and squaring them all in a list
squares = []
for sq in range(1,11):
    squares.append(sq*2*2)
print(squares)

# To print highest value from the list
squarees = []
for qs in range(1,11):
    squarees.append(qs*2*2)
print(squarees)
print(max(squarees))

# Another way to add elements
threes = [tres*10 for tres in range(1,11)]
print(threes)

# Slicing a list
snacc = ['Shawarma', 'Tacos', 'Hotdogs', 'Fries', 'Burgers','Cheesesticks']
print(snacc[:4])

guesses = 0
limitofguess = 0


ab = -10
while ab <= 0:
    print(ab)
    ab+=1
ten = random.randint(1,50)
multt = ten * 10
tenn = ten
while ten <= multt:
    print(str(tenn) + str("(" + str(ab) + ")") + "= " + str(ten))
    ten+=tenn
    ab+=1




trig = random.randint(1,10)
for g in range(1, trig+1):
    for j in range(1, g+1):
        print("$", end=" ")
    print()
spac = random.randint(1,10)
for i in range((-spac+1), spac+1):
    xx = spac-abs(i)
    print("   "*(spac-xx)+"*"*xx)

altt = random.randint(1,10)
for yy in range(altt):
    for xx in range(yy+1):
        print("#", end = " ")
    print()

# Finding a number divisible by the inputted number
hugelist = list(range(1,100))
entnum = random.randint(1,10)
resultt = list(filter(lambda x: (x % entnum == 0), hugelist))
print("The numbers that are divisible by " + str(entnum) + " are " + str(resultt))

# Converting from decimal to bin, oct and hex
dec = random.randint(1,500)
print("The decimal value of", dec, "is:")
print(bin(dec), "in binary.")
print(oct(dec), "in octal.")
print(hex(dec), "in hexadecimal.")

for xx in range (0,5):
    for yy in range (0,5-xx):
        print(" ", end=" ")
    for zz in range (0, 2*xx+1):
        print("0", end=" ")
    print(" ")
print()

for rr in range (0,5):
    for ss in range (rr-1,4):
        print("$", end=" ")
    print()

for cc in range (0,5):
    for dd in range(0,5-cc):
        print(" ", end=" ")
    for pp in range (0,cc+1):
        print("#", end= " ")
    print(" ")

for evn in range (0,501):
    if evn % 2 == 0:
        print(evn, "even ")
    else:
        print(evn)
        continue

arraydd = [
    [42,542,252],
    [426,775,353],
    [835,484,484],
    [363,34734,3737],
]
print()
print(arraydd[2][1])

for row in arraydd:
    for col in row:
        print(col)

arrayd = [
    [42,542,252],
    [426,775,353],
    [835,484,484],
    [363,34734,3737],
]
# FOR LOOP 1
rows = random.randint(1,10)
mone = rows-1
for rw in range(0, 1+mone):
    for cl in range(0, 1+mone):
        print("*", end=" ")
    print()

for ex1 in range(2000,3200):
    if ex1 % 7 == 0 and ex1 % 5 != 0:
        print(ex1, end=", ")


for ex3 in range (0,11):
    print(ex3, ex3*ex3)


qa= random.randint(1,100)
qz= random.randint(1,100)
qq= random.randint(1,100)
qw= random.randint(1,100)
print("The following lotto numbers are ", qa, qz, qq, qw)


for dv in range (1,31):
    df = 50
    qwe = df * 53 + 123 * 23 + 3141 + 414 * dv
    print("On day " + str(dv) + ", your money is equal to " + str(qwe))

nb = [1,2,3,4,5]
lm = [1,2,3,4,5]
if nb == lm:
    print('Yes')
else:
    print('No')

def practiceadd(add1,add2):
    while True:
        add1 = random.randint(1, 5)
        add2 = random.randint(1, 5)
        print(str(add1) + '+' + str(add2))
        anss = int(input('Answer: '))
        sumadd = add1 + add2
        if sumadd == anss:
            print('right!')
            continue
        elif anss!= sumadd:
            print('Its ' + str(sumadd))
            break
add1 = random.randint(1,5)
add2 = random.randint(1,5)
practiceadd(add1,add2)

while True:
    let1 = ['L', 'O', 'V', 'E']
    rd1 = random.sample(let1, len(let1))
    print(rd1)
    print(' - \tIt is symbolized by a heart. ')
    sg = input()
    if sg ==  'LOVE':
        print('congrats')
        break
    else:
        continue

emails = {'Ivan': 'ivan@gmail.com',
          'Marites': 'marites@gmail.com',
          'Cholo': 'cholo@gmail.com',
          'Teresa': 'teresa@gmail.com',
          'Vladimir': 'vladimir@gmail.com' }
while True:
    nameent  =input('Enter a name: ')
    if nameent in emails:
        print(emails[nameent] + ' is the email of ' + nameent)
        break
    else:
        print('not available')
        ask = input('Do you wanna add him?: ')
        if ask == 'y':
            nmail = nameent + 'gmail.com'
            emails[nameent] = nmail
            print('Done')
            for upd in emails.items():
                print(upd)
            break
        else:
            break

def showlist(listpers):
    for sl in listpers:
        print(sl.title())
def addlist(listpers):
    name = input('Enter a name: ')
    listpers.append(name)
    for sl in listpers:
        print(sl.title())
listpers = ['Ivan', 'Evan', 'Auden', 'Oden', 'Greg']
ch = input('CHOOSE ONE \n1.) show list\n2.) add a name')
if ch == '1':
    showlist(listpers)
else:
    addlist(listpers)


class Users:
    def __init__(self,name,DOB,gender,location):
        self.name = name
        self.DOB = DOB
        self.gender = gender
        self.location = location

    def showAllRecord(self):
        allrec = self.name.title() + '\n' + self.DOB.title() +  '\n' + self.gender.title() + '\n' + self.location.title()
        return allrec
    def showNames(self):
        allname = self.name.title()
        return allname
    def showAllDOB(self):
        alldob = self.DOB.title()
    def showAllGender(self):
        allg = self.gender.title()
    def location(self):
        loc = self.location.title()

a1 = Users('Auden', '08212000', 'Male', 'Cavite')
print('Choose one')
choose = input()
if choose == '1':
    print(a1.showNames())
elif choose == '2':
    print(a1.showAllDOB())
elif choose == '3':
    print(a1.showAllGender())
elif choose == '4':
    print(a1.location())

class car:

    def __init__(self,brand,HP,YR):
        self.brand = brand
        self.HP = HP
        self.YR = YR
    def cargobroom(self):
        return self.HP
    def stopCar(self):
        return 'stop! ' + self.brand
    def showAll(self):
        return self.brand + '\n' + self.HP + '\n' + self.YR

brinput = input('pick car: ')
hpcar = input('hp: ')
yrcar = input('car released: ')
inpcar = car(brinput, hpcar, yrcar)
if brinput == 'audi':
    print(inpcar.cargobroom())
    for hj in range(5):
        print('broom')
else:
    print(inpcar.showAll())
    print(inpcar.stopCar())


class banksamp:
    def __init__(self, user):
        self.user = user

    def balanceinq(self, balance):
        showb = "Welcomeee! " + self.user + '\n' + "Balance: " + str(balance)
        return showb

    def withdrawing(self,balance,withdraw):
        balance-=withdraw
        showw = "Thank you, you've just withdrawn " + str(withdraw) + '\n' + "Current bal: " + str(balance)
        return showw

    def deposit(self, balanceadd, deposit):
        balanceadd += deposit
        showd = "Thank you, you've just deposited " + str(deposit) + '\n' + "Current bal: " + str(balanceadd)
        return showd


logu = input('Enter acc name: ')
chc = input('What do u wanna do? (1) See balance (2) withdraw (3) deposit: ')
usser = banksamp(logu)
if chc == '1':
    print(usser.balanceinq(2000000))
elif chc == '2':
    mnybws = int(input('How much money will be deducted: '))
    print(usser.withdrawing(2000000, mnybws))
elif chc == '3':
    mnydgdg= int(input('How much money will be added: '))
    print(usser.deposit(2000000, mnydgdg))
else:
    print('error')


class Restaurant:
    def __init__(self,name,DOE,origin):
        self.name = name
        self.DOE = DOE
        self.origin = origin

    def showDetails(self):
        sd = 'FULL DETAILS ' + '\n\t' + self.name + '\n\t' + self.DOE + '\n\t' + self.origin
        return sd
    def openRes(self):
        lc = self.name + ' is now open!'
        return lc

addres = input('name: ')
doe = input('since: ')
orgg = input('where?: ')
pqpq = Restaurant(addres,doe,orgg)
print(pqpq.showDetails())
print(pqpq.openRes())
openres = ['fantas', 'johnys', 'cole']
openres.append(addres)
print('Restaurants open: ')
for ka in openres:
    print('\t' + ka.title())

dct = {'Hello' : 'Kamusta',
       'Goodmorning': 'magandang umaga',
       'Good evening': 'magandang gabi'}

greet = input()
tags = input()
if greet and tags in dct.keys():
    print(greet)
else:
    dct[greet] = tags

for abb, bb in dct.items():
    print(abb.title() + ' ' + bb.title())


fg = list(range(2,100,12))
print(fg)
fd = ["Louis", "Daniel", "Josh", "Ivan", "Elmer"]
sd = ["Musician", "Rapper", "Chef", "President"]
for kl in fd:
    for hk in sd:
        print(kl + " is a " + hk)

food = ["Burger","Hotdogs", "Eggs", "Pancakes"]
drinks = ["Milk", "Water", "Lemon Juice", "Soda"]
print("Welcome to asdf!, Here is our menu")
print("FOODS: ")
for pc in food:
    print("\t" + pc.title())
print("DRINKS: ")
for ap in drinks:
    print("\t" + ap.title())
kf = input("Order for food?: ")
if kf not in food:
    print("Error")
else:
    kfa = input("Order for drinks?: ")
    if kfa not in drinks:
        print("Error")

    else:
        print("Your order is " + kf + " and " + kfa)
        nv = input("Do you want to make any additional orders? (y/n): ")
        if nv == "y":
            px = input("What additonal food order do u want? ")
            hd = px.split(",")
            pm = list(hd)
            da = list(set(pm).intersection(food))
            hl = list(set(pm).intersection(drinks))
            od = list(da)
            pq = list(hl)
            print("\nADDITONAL FOOD")
            print(da)
            print("\nADDITONAL DRINKS")
            print(pq)
            for fs in da:
                print("\nThanks! You've made an additonal order here's your " + fs.title())
            for ds in hl:
                print("Thanks! You've made an additonal order here's your " + ds.title())

        else:
            print("Thank you!")



cities = {
    'Manila' : {
        'country: ':'Philippines',
        'population:' : '1780000',
        'fact: ' : 'Capital of the Philippines'

    },

    'Jakarta' : {
        'country: ' : 'Indonesia',
        'population: ' : '9608000',
        'fact: ': 'Has a lot of Muslims'
    }

}

for city, info_info in cities.items():
    print("\nCity: "+ city.title())
    fc = info_info['country']
    fp = info_info['population']
    ff = info_info['fact']
    print('\tCountry: ' + fc.title())
    print('\tPopulation: ' + fp.title())
    print('\tFact: ' + ff.title())

for ja in range(5):
    ld = ['Easy', 'Medium', 'Hard']
    pili = random.choice(ld)
    lb = UFC('MMA' 'WORLD', 'MARAMI', 'MARAMIII', pili, 'YES')
    kd = lb.whatUFC()
    print(kd)

recs = ['hello', 'there', 'friends']

def addrec(recs,av):
    recs.append(av)

def printRecs(recs):
    for x in recs:
        print('\t'+ x)
def printList(recs):
    print(recs)

la = input()
addrec(recs,la)
print('Record: ')
printRecs(recs)
print('Records list: ', end=' ' + '\t')
printList(recs)

def ybirth(birth):
    for y in birth.values():
        print(y)
def nbirth(birth):
    for n in birth.keys():
        print(n.title())
def allbirth(birth):
    for all in birth.items():
        print(all)
chs = input('n or y?: ')
birth = {'Greg': 1999, 'Haley':2000, 'Josh':1999}
if chs == 'n':
    nbirth(birth)
elif chs == 'y':
    ybirth(birth)
else:
    allbirth(birth)




