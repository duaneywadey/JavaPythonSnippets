import random

# 1
wordinput = input('Enter a word to capitalize all its letters: ')
uppercase = wordinput.upper()
print(uppercase)

# 2
print()
randomnums = list(range(1,50))
listnum = random.sample(randomnums, k=10)
print('\tRandom numbers: ')
print(listnum)
print('\n\tHighest to lowest: ')
listnum.sort(reverse=True)
print(listnum)
print('\n\tLowest to highest: ')
sortlist = sorted(listnum)
print(sortlist)

# 3
print()
numList1 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 1: ", numList1)
sortlist1 = sorted(numList1)
print(sortlist1[4])
numList2 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 2: ", numList2)
sortlist2 = sorted(numList2)
print(sortlist2[4])
numList3 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 3: ", numList3)
sortlist3 = sorted(numList3)
print(sortlist3[4])
numList4 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 4: ", numList4)
sortlist4 = sorted(numList4)
print(sortlist4[4])

# 4
print()
numList11 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 1: ", numList11)
sortlist11 = sorted(numList11)
print(sortlist11[0])
numList22 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 2: ", numList22)
sortlist22 = sorted(numList22)
print(sortlist22[0])
numList33 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 3: ", numList33)
sortlist33 = sorted(numList33)
print(sortlist33[0])
numList44 = list(int(num) for num in input("Enter five numbers separated by a space: ").strip().split())[:5]
print("Group 4: ", numList44)
sortlist44 = sorted(numList44)
print(sortlist44[0])

# 5
print()
listnums = list(int(num) for num in input("Enter twenty (20) numbers separated by a space: ").strip().split())[:20]
print('\t Odd numbers: ')
for n in listnums:
    if n%2!=0:
        print(n)
    else:
        continue
# 6
names = []
for allname in range(6):
    entername = input('Enter a full name: ')
    names.append(entername)
    names.sort()
for nm in names:
    print(nm.title())

