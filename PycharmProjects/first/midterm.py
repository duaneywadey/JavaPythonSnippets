import random
# 1
factinput = int(input('Enter a number to get its factorial equivalent: '))
counter = 1
loop = 1
while loop <= factinput:
    counter*=loop
    loop+=1
print(counter)

# 2
limitNum = int(input('Print all prime numbers up to what number?: '))
for loopNum in range(2, limitNum):
    for checkPrime in range(2, loopNum):
        if loopNum % checkPrime == 0:
            break
    else:
        print(loopNum)

# 3
def calculator(numuno, numdos):
    while True:
        if choice == '1':
            print(numuno + numdos)
        elif choice == '2':
            print(numuno - numdos)
        elif choice == '3':
            print(numuno * numdos)
        elif choice == '4':
            print(numuno / numdos)
        tryagain = input('Do you want to finish (y/n): ')
        if tryagain == 'y':
            print('Bye')
            break
        else:
            while True:
                print('Menu options are: ')
                print('\t1.) Add\t\n\t2.) Subtract\t\n\t3.) Multiply\t\n\t4.) Divide')
                print('-----------------')
                choice1 = input('Please make a selection: ')
                print('-----------------')
                num1 = int(input('Enter first num: '))
                num2 = int(input('Enter second num: '))
                if choice1 == '1':
                    print(numuno + numdos)
                elif choice1 == '2':
                    print(numuno - numdos)
                elif choice1 == '3':
                    print(numuno * numdos)
                elif choice1 == '4':
                    print(numuno / numdos)
                tryagain = input('Do you want to finish (y/n): ')
                if tryagain == 'y':
                    print('Bye')
                    break
                else:
                    continue


print('Menu options are: ')
print('\t1.) Add\t\n\t2.) Subtract\t\n\t3.) Multiply\t\n\t4.) Divide')
print('-----------------')
choice = input('Please make a selection: ')
print('-----------------')
fersnum = int(input('Enter first num: '))
snum = int(input('Enter second num: '))
print('-----------------')
print('Result: ', end='')
calculator(fersnum, snum)


# 4
tries = 0
guess = int(input("Please guess a number between 1 and 10: "))
ans = random.randint(1,10)
if guess == ans:
    print("Yes!", ans, "is the correct answer")
while guess != ans:
    guess = int(input("Please guess again: "))
    if guess <= ans:
        print('Your guess was lower than the number')
    elif guess >= ans:
        print('Your guess was higher than the number')
    tries+=1
    if guess == ans:
        print("Yes!", ans, "is the correct answer")
    elif tries == 2:
        print('You took 3 goes to complete the game\n Game Over.')
        break

def greetList(names):
    putnm = input()
    pangs = putnm.split(',')
    print(pangs)
    while pangs:
        tngl = pangs.pop()
        names.append(tngl)
    for nn in names:
        print('Hello! ' + nn.title())
names = []
greetList(names)

def add(num1,num2):
    if choice == '1':
        print(num1 + num2)
def minn(num1,num2):
    if choice == '2':
        print(num1-num2)
def mult(num1,num2):
    if choice == '3':
        print(num1 * num2)
def div(num1,num2):
    if choice == '4':
        print(num1 / num2)
while True:
    print('Menu options are: ')
    print('\t1.) Add\t\n\t2.) Subtract\t\n\t3.) Multiply\t\n\t4.) Divide')
    print('-----------------')
    choice = input('Please make a selection: ')
    print('-----------------')
    fersnum = int(input('Enter first num: '))
    snum = int(input('Enter second num: '))
    print('Result: ', end='')
    add(fersnum,snum)
    minn(fersnum,snum)
    mult(fersnum,snum)
    div(fersnum,snum)
    endprog = input('End?: ')
    if endprog == 'y':
        break
    else:
        continue


