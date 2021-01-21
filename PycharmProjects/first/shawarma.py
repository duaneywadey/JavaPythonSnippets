
from basicfunctions import *
import datetime
from listsprac import martialArts, UFC
import calendar
today = datetime.date.today()
print(today)
print()
userprofile = randomProfile('Duane','Ivan', location = 'Cav', hobby = 'Music', favorite = 'crush', planet = 'Earth')
print(userprofile)
tl = translate('Hello')
print(tl)
listss = arraysprac('laptrip', 'talaga')
print(listss)
d1 = add1 = random.randint(1,5)
d2 = add2 = random.randint(1,5)
for ja in range(5):
    ld = ['Easy', 'Medium', 'Hard']
    pili = random.choice(ld)
    lb = UFC('MMA' 'WORLD', 'MARAMI', 'MARAMIII', pili, 'YES')
    kd = lb.whatUFC()
    print(kd)

for kk in range(20):
    jw = martialArts('Boksing', 'Greece', 'Greeks')
    kf = jw.country()
    if kk % 5 == 0:
        print('\n')
    print(kf)