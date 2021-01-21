import random
guess1 = int(input("Guess this number between 1-5: "))
ans1 = random.randint(1,5)
if guess1 == ans1:
    print("Yes!", ans1, "is the correct answer")
while guess1!= ans1:
    guess1 = int(input("Guess this number between 1-5: "))
    if guess1 == ans1:
        print("Yes!", ans1, "is the correct answer")

guess2 = int(input("\nGuess this number between 1-10: "))
ans2 = random.randint(1,10)
if guess2 == ans2:
    print("Yes!", ans2, "is the correct answer")
while guess2!= ans2:
    guess2 = int(input("Guess this number between 1-10: "))
    if guess2 == ans2:
        print("Yes!", ans2, "is the correct answer")

