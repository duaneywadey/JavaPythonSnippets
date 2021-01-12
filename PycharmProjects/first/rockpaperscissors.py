import random
import os
import sys
#Rock, Paper, Scissors up to 5 tries only
countt = 0
score = 0
gamestart = True
while countt<1000000:
    rps = ["rock", "paper", "scissors"]
    player1 = input("\nChoose between rock paper scissors: ")
    rpschc = random.choice(rps)
    print("\nComputer chose " + rpschc)
    if player1 == "paper" and rpschc == "scissors":
        print("you lose")
        countt+=1
    elif player1 == "paper" and rpschc == "rock":
        print("you won")
        countt += 1
        score += 1
    elif player1 == "paper" and rpschc == "paper":
        print("tie!")
        countt += 1
    elif player1 == "scissors" and rpschc == "paper":
        print("you won")
        countt += 1
        score+=1
    elif player1 == "scissors" and rpschc == "rock":
        print("you lost")
        countt += 1
    elif player1 == "scissors" and rpschc == "scissors":
        print("tie!")
        countt += 1
    elif player1 == "rock" and rpschc == "scissors":
        print("you won")
        score+=1
        countt += 1
    elif player1 == "rock" and rpschc == "paper":
        print("you lost")
        countt += 1
    elif player1 == "rock" and rpschc == "rock":
        print("tie!")
        countt += 1
    else:
        exit()
    if countt % 5 == 0:
        ask = input("Do you want to continue(y/n): ")
        if ask == "y":
            def restart_program():
                """Restarts the current program.
                Note: this function does not return. Any cleanup action (like
                saving data) must be done before calling this function."""
                python = sys.executable
                os.execl(python, python, *sys.argv)

        else:
            print("Score: ", score)
            break

