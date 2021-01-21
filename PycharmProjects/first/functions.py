import random
class lottery:
    def __init__(self, num1, num2, num3):
        self.num1 = num1
        self.num2 = num2
        self.num3 = num3
        self.num4 = random.randint(1,10)


    def yourNums(self,qp):
        qp = []
        for xc in qp:
            print("\t" + self.num1 + ' ' +  ' ' + self.num2 + ' ' +  self.num3, end=' ')


    def winNums(self,bc):
        for zx in bc:
            print("\t" + str(zx).title(), end=' ')

print('***** WELCOME TO ONLINE LOTTERY ENTER THREE(3) NUMBERS FOR A CHANCE TO WIN TEN MILLION PESOS!!! *****')
while True:
    qp = []
    print('NOTE: Winning numbers DO NOT range over 50')
    cx = int(input('Enter number 1: '))
    ax = int(input('Enter number 2: '))
    vx = int(input('Enter number 3: '))
    qp.append(cx)
    qp.append(ax)
    qp.append(vx)
    it = lottery(cx, ax, vx)
    nc = list(range(1,50))
    bc = random.sample(nc, k=3)
    print('YOUR NUMBERS: ')
    lottery.yourNums(it)
    print()
    print('WINNING NUMBERS: ')
    for zx in bc:
        print("\t" + str(zx).title(), end=' ')
    print()
    if qp == bc:
        print('\nCongrats! You won 10 million pesos!!!')
    else:
        ask = input('Do you want to continue(y/n)?: ')
        if ask == 'y':
            continue
        else:
            print('Thanks for participating!')
            break



