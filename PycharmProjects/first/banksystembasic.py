namee = input("Please enter your username: ")
passw = input("Enter your password: ")
mm = 2000000
print("Current balance: ", mm)
while namee == "user" and passw == "123":
    amt = int(input("Enter your desired amount: "))
    if amt > 2000000:
        print("Error!")
        ask = input("Do you want to continue?: ")
        if ask == 'y':
            namee = input("Please enter your username: ")
            passw = input("Enter your password: ")
            while namee == "user" and passw == "123":
                amt = int(input("Enter your desired amount: "))
                bill = input(
                    "What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill: ")
                mm = 2000000
                print(mm)
                if bill == "1":
                    wtd = mm - amt
                    print("You have ", wtd, " left on your balance")
                    bill1 = amt / 1000
                    print("You have received a total of ", int(bill1), " one thousand peso bills")
                    break
                elif bill == "5":
                    wtd = mm - amt
                    print("You have ", wtd, " left on your balance")
                    bill2 = amt / 500
                    print("You have received a total of ", int(bill2), "five hundred peso bills")
                    break
                else:
                    bill = input(
                        "What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill")
                    if bill == "1":
                        wtd = mm - amt
                        print("You have ", wtd, "left on your balance")
                        bill1 = amt / 1000
                        print("You have received a total of ", int(bill1), " one thousand peso bills")
                        break
                    elif bill == "5":
                        wtd = mm - amt
                        print("You have ", wtd, " left on your balance")
                        bill2 = amt / 500
                        print("You have received a total of ", int(bill2), " five hundred peso bills")
                        break
        else:
            quit()

    bill = input("What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill: ")
    if bill == "1":
        wtd = mm - amt
        print("You have ", wtd, " left on your balance")
        bill1 = amt/1000
        print("You have received a total of ", int(bill1), " one thousand peso bills")
        quit()
    elif bill =="5":
        wtd = mm - amt
        print("You have ", wtd, " left on your balance")
        bill2 = amt/ 500
        print("You have received a total of ", int(bill2), " five hundred peso bills")
        quit()
    else:
        bill = input(
            "What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill")
        if bill == "1":
            wtd = mm - amt
            print("You have ", wtd, " left on your balance")
            bill1 = amt / 1000
            print("You have received a total of ", int(bill1), " one thousand peso bills")
            quit()
        elif bill == "5":
            wtd = mm - amt
            print("You have ", wtd, "left on your balance")
            bill2 = amt / 500
            print("You have received a total of ", int(bill2), " five hundred peso bills")
            quit()
else:
    print("Error!")
    ask = input("Do you want to continue?: ")
    if ask == 'y':
        namee = input("Please enter your username: ")
        passw = input("Enter your password: ")
        while namee == "user" and passw == "123":
            amt = int(input("Enter your desired amount: "))
            bill = input(
                "What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill: ")
            mm = 2000000
            print(mm)
            if bill == "1":
                wtd = mm - amt
                print("You have ", wtd , " left on your balance")
                bill1 = amt / 1000
                print("You have received a total of ", int(bill1), " one thousand peso bills")
                break
            elif bill == "5":
                wtd = mm - amt
                print("You have ", wtd, " left on your balance")
                bill2 = amt / 500
                print("You have received a total of ", int(bill2), "five hundred peso bills")
                break
            else:
                bill = input(
                    "What type of bill do you want? ('1') for one thousand peso bill and ('5') for five hundred peso bill")
                if bill == "1":
                    wtd = mm - amt
                    print("You have ", wtd, "left on your balance")
                    bill1 = amt / 1000
                    print("You have received a total of ", int(bill1), " one thousand peso bills")
                    break
                elif bill == "5":
                    wtd = mm - amt
                    print("You have ", wtd, " left on your balance")
                    bill2 = amt / 500
                    print("You have received a total of ", int(bill2), " five hundred peso bills")
                    break
        else:
            quit()

while True:
    pd = input('Enter your name: ')
    print('Hello there! ' + pd)
    dp = 2000000
    mb = int(input('Enter how much money would you like to withdraw: '))
    pq = dp-mb
    bm = mb // 1000
    ng = mb // 500
    nb = input('What type of bills do you like?: ')
    if nb == 'a':
        print('Current remaing balance: ' + str(pq))
        print("Here's your " + str(bm) + " thousand peso bills.")
    elif nb == 'b':
        print('Current remaing balance: ' + str(pq))
        print("Here's your " + str(ng) + " five hundred peso bills.")
    kv = input('Do you want to continue? ')
    if kv == 'y':
        continue
    else:
        break
