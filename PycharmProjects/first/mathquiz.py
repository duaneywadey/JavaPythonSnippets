import random
aa=0
score = 0
while aa <= 10000000:
    op = ["+", "-", "*"]
    ops = random.choice(op)
    a = random.randint(1, 10)
    b = random.randint(1, 10)
    c = int(input("\nWhat is " + str(a) + ops + str(b) + "?: "))
    d = a + b
    e = a - b
    f = a * b
    if c == d and ops == "+":
        aa += 1
        print("Yes! ",d," is the correct answer!")
        score+=1

    elif c == e and ops == "-":
        aa += 1
        print("Yes! ",e," is the correct answer!")
        score+=1

    elif c == f and ops == "*":
        aa += 1
        print("Yes! ",f," is the correct answer!")
        score+=1
    else:
        aa+=1
        if ops == "+":
            print(d, "is the correct answer!")
        elif ops == "-":
            print(e, "is the correct answer!")
        elif ops == "*":
            print(f, " is the correct answer!")
        else:
            print()

    if aa % 10 == 0 :
        q = input("Do you want to continue?(y/n): ")
        if q == "y":
            continue
        else:
            print("Score: " + str(score))
            break
