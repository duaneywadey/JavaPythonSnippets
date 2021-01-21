import random

# FOR LOOP 1
rows = random.randint(1,10)
for rw in range(0, rows):
    for cl in range(0, rows):
        print("*", end=" ")
    print()

# FOR LOOP 2
print()
fl2 = random.randint(1,10)
for aa in range (0,fl2):
    for bb in range (0,1+aa):
        print("#", end=" ")
    print()

# FOR LOOP 3
print()
fl3 = random.randint(1,10)
for cc in range (-fl3, fl3+1):
    print(cc, end=" ")

# FOR LOOP 4
print("\n")
fl4 = random.randint(1,10)
for dd in range(1,fl4+1):
    for ee in range(1, dd+1):
        print(ee%2, end=" ")
    print()

#  FOR LOOP 5
print()
fl5 = random.randint(1,10)
for ff in range(1,fl5+1):
    for gg in range(1,fl5+1):
        if ff==gg:
            print(ff, end=" ")
        else:
            print("0", end=" ")
    print()

# FOR LOOP 6
print()
maxx = random.randint(1,100)
for num in range(1, maxx + 1):
   if num > 1:
       for i in range(2, num):
           if (num % i) == 0:
               break
       else:
           print(num)

# FOR LOOP 7
print()
a=0
b=1
fl7 = random.randint(1,10)
print(a)
print(b)
for ii in range(1,fl7):
    c=a+b
    a=b
    b=c
    print(c)


# FOR LOOP 8
print()
upper = random.randint(1,100000)
for num in range(1, upper + 1):
    order = len(str(num))
    sum = 0
    temp = num
    while temp > 0:
        digit = temp % 10
        sum += digit ** order
        temp //= 10
    if num == sum:
        print(num)


# FOR LOOP 9
for jj in range(0,50,5):
    print(jj)

# FOR LOOP 10
sqq = list(range(1,11))
for q in sqq:
    print(q*q, end=" ")

print("\n")

# WHILE LOOPS



# WHILE LOOP 1
l = 0
m = 1
rndm = random.randint(1, 10000)
print(l)
print(m)
while l <= rndm:
    n = l + m
    l = m
    m = n
    if n >= rndm:
        break
    print(n)

print("\n")

# WHILE LOOP 2
print("\n")
x=1
nn= random.randint(1,10)
while x <= 10:
    print(nn,"*",x, "= ", nn*x)
    x+=1

# WHILE LOOP 3
guess1 = int(input("Guess this number between 1-5: "))
ans1 = random.randint(1,5)
if guess1 == ans1:
    print("Yes!", ans1, "is the correct answer")
while guess1!= ans1:
    guess1 = int(input("Guess this number between 1-5: "))
    if guess1 == ans1:
        print("Yes!", ans1, "is the correct answer")

# WHILE LOOP 4
pers = "Ivan"
un = input("Enter the username: ")
if un == pers:
    print("welcome")
while un!= pers:
    un = input("Enter the username: ")
    if un == pers:
        print("welcome")

# WHILE LOOP 5
pers = "Ivan"
code= "1234"
un = input("Enter the username: ")
passw = input("Enter the password: ")
if passw == code and un == pers:
    print("welcome")
while passw!= code and un != pers:
    un = input("Enter the username: ")
    passw = input("Enter the password: ")
    if un == pers and passw == code:
        print("Welcome!")



# WHILE LOOP 6

code1 = "1234"
passw = input("Enter the password: ")
if passw == code1:
    print("welcome")
while passw != code1:
    error=0
    passw = input("Enter the password: ")
    error+=1
    if passw == code1:
        print("welcome")
    elif error % 3 == 0:
        print("invalid")
        break

# WHILE LOOP 7
a=2
num=int(input("Enter a number to check if it's prime or not: "))
while num > a :
  if num%a==0 & a!=num:
    print(num, 'is not prime')
    break
  else:
    print(num, 'is a prime number')
    a=(num)+1

# WHILE LOOP 8
d = 0
while d <= 500:
    print(d)
    d+=2

# WHILE LOOP 9
e = 1
while e <= 500:
    print(e)
    e+=2

# WHILE LOOP 10
f = 0
while f <= 505:
    print(f)
    f+=5

hj = input()
yi = hj.split(",")
uy = tuple(yi)
print(uy)
for hh in uy:
    print(int(hh) ** 2)

confirmedusers = ['Brian', 'John', 'Josh', 'Avery']
uname = input('Enter your name: ')
if uname in confirmedusers:
    print('Welcome! ' + uname)
else:
    la = input('Do you want to sign up? (y/n): ')
    if la == 'y' or 'Y':
        nm = input('Enter your desired username: ')
        confirmedusers.append(nm)
        print(confirmedusers)
        print('Welcome! ' + nm)
        print('Here is an updated list of the members!: ')
        for kkb in confirmedusers:
            print('\t' + kkb.title())
        print('I want you to meet our other members! ', end=" ")
        for kb in confirmedusers[0:4]:
            print(kb.title(), end=", ")
    else:
        print('Thank you for coming!')
def boxername(bfname, blname):
    fullboxername = bfname + ' ' + blname
    return fullboxername.title()
while True:
    print('\tHello there! Please tell me your name ')
    print('Enter "n" if you want to quit')
    boxerfname = input('First name: ')
    if boxerfname == 'n':
        break
    boxerlname = input('Last name: ')
    if boxerlname == 'n':
        break
    finalllboxername = boxername(boxerfname, boxerlname)
    print('\nHello there! ' + finalllboxername + '!')

def acc(acfname,aclname):
    fullaccname = acfname + ' ' + aclname
    return fullaccname.title()
while True:
    acof=input('Enter your first name: ')
    acol=input('Enter your last name: ')
    ps = input('Enter the password: ')
    if ps != '123':
        print('Sorry invalid')
        break
    finalaccname = acc(acof,acol)
    print('Hello there! ' + str(finalaccname))
    break

