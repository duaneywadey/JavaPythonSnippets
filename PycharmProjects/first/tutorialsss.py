import random
import sys
import pprint
# FACTORIAL
n = random.randint(1,10) #input() function takes input as string type
                #int() converts it to integer type
fact = 1
for i in range(1,n+1):
    fact*=i
print(fact)

ct = 1
a = 1
nn = random.randint(1,10)
while a <= nn:
    ct *= a
    a+=1
print(ct)

# SUM OF NUMS FROM 1-10
cer = 1
for ee in range (1,11):
    cer+=ee
print(cer)


er = random.randint(1,100)
kl = er
zx = er*er
zxy = er*er*er
zxyy = er*er*er*er
mn = kl + zx + zxy + zxyy
print(mn)

rows = random.randint(1,10)
for rw in range(0,rows+1):
    for cl in range(0,rw):
        print(cl,end=" ")
    print()

af = [1, 2, 3, 4]
bf = [2, 7]
print(any(x in af for x in bf))

L1 = [2,3,4]
L2 = [1,2]
[i for i in L1 if i in L2]
[2]


S1 = set(L1)
S2 = set(L2)
S1.intersection(S2)
set([2])

list1 = [1,2,3,4,5,6]
list2 = [3, 5, 7, 9]
da = list(set(list1).intersection(list2))
print(da)


pm = random.randint(1,100)
ck = 0
nv = 1
print(ck)
print(nv)
for lc in range(0,pm):
    pa = ck + nv
    ck=nv
    nv=pa
    if pa >= pm:
        break
    print(pa)

for dk in range(100):
    num1 = random.randint(1,100)
    num2 = random.randint(1,100)
    ans = num1 + num2
    print("\n" + "Question: " + str(num1) + "+" + str(num2))
    print("Answer: " + str(ans))

print("\n*********** WELCOME TO DUANEY'S ONLINE BIDDING ***********")
while True:
    p1 = random.randint(1,100000)
    p2 = random.randint(1,100000)
    p3 = random.randint(1,100000)
    print("Tim's bid: " + str(p1))
    print("Allen's bid: " + str(p2))
    print("Nate's bid: " + str(p3))
    if p1 > 50000 and p1 > p2 and p1 > p3:
        print('\nCongratulations! Tim won!')
        print("Tim's bid costs " + str(p1) + ' pesos')
        break
    elif p2 > 50000 and p2>p1 and p2>p3:
        print('\nCongratulations! Allen won!')
        print("Allen's bid costs " + str(p2) + ' pesos')
        break
    elif p3 > 50000 and p3>p1 and p3>p2:
        print('\nCongratulations! Nate won!')
        print("Nate's bid costs " + str(p3) + ' pesos')
        break

unprinted_designs = ['iphone case', 'robot pendant', 'dodecahedron']
completed_models = []

while unprinted_designs:
    current_design = unprinted_designs.pop()
    print("Printing model: " + current_design)
    completed_models.append(current_design)

print("\nThe following models have been printed:")
for completed_model in completed_models:
    print(completed_model)

evencount = 0
for ab in range(1000):
    rd = random.randint(1,10000)
    print(rd)
    if rd % 2 == 0:
        print( ' - Even here')
        evencount+=1
    else:
        continue

print('\nEven nums: ' + str(evencount))

print(sys.path)

message = 'It was a bright cold day in April, and the clocks were striking thirteen.'
count = {}
for character in message:
    count.setdefault(character, 0)
    count[character] = count[character] + 1
    pprint.pprint(count)