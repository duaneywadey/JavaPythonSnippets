import random
import pprint
import string

pals = {
    'Aimee': 'Dogs',
    'Vladimir':'Horror Movies',
    'Alan':'Anime',
    'Dolan':'Youtube',
    'Vinny':'TV'
}

for hv in set(pals.values()):
    print(hv.title())


print("\n")
rdoods = []

for m in range(30):
    human = {
        'gender': 'male',
        'age': '18',
        'planet': 'earth',
        'number': 5
    }
    rdoods.append(human)

for hh in rdoods[0:10]:
    if hh['gender'] == 'male':
        hh['age'] = '22222'
        hh['planet'] = 'eaaaaaarth'
        hh['number'] = 55555

for hh in rdoods[0:30]:
    print(hh)
print("...")



aliens = []

for alien_number in range (30):
    new_alien = {'color': 'green', 'points': 5, 'speed': 'slow'}
    aliens.append(new_alien)

for alien in aliens[0:10]:
    if alien['color'] == 'green':
        alien['color'] = 'yellow'
        alien['speed'] = 'medium'
        alien['points'] = 10
    if alien['color'] == 'yellow':
         alien['color'] = 'pink'
         alien['speed'] = 'sluggish'
         alien['points'] = 69

for alien in aliens[0:5]:
    print(alien)
print("...")

favehobbies = {
    'Annie' : ['Watching K-pop', 'Listening to J-pop'],
    'Vincent' : ['Playing chess', 'Playing instruments'],
    'Humphrey' : ['Watching Rick and Morty'],
    'Divine' : ['Singing'],
    'Krissy' : ['Youtube', 'Dancing']
}

for hooman, hobbies in favehobbies.items():
    print("\n" + hooman.title() + "'s favorites are")
    for hobby in hobbies:
        print("\t" + hobby.title())

webusers = {
    'john' : {
    'name':'john',
    'age':'17',
    'favesubs':['math','science','history'],
    'religion':'roman catholic'
},

    'albert' : {
        'name':'albert',
        'age':'21',
        'favesubs':['programming'],
        'religion':'prostetantism'
}
}
for username, user_info in webusers.items():
    print("\nUsername: " + username.title())
    fname = user_info['name']
    fage = user_info['age']
    ffavesubs = user_info['favesubs']
    freligion = user_info['religion']
    print("\tName: " + fname.title())
    print("\tAge: " + fage.title())
    for lvb in ffavesubs:
        print("\tFave subs: " + lvb.title())
    print("\tReligion: " + freligion.title())

cities = {
    'Manila' : {
        'country':'Philippines',
        'population' : '1780000',
        'fact' : 'Capital of the Philippines'

    },

    'Jakarta' : {
        'country' : 'Indonesia',
        'population' : '9608000',
        'fact': 'Has a lot of Muslims'
    }

}

for city, info_info in cities.items():
    print("\nCity: "+ city.title())
    fcc = info_info['country']
    fpp = info_info['population']
    fff = info_info['fact']
    print('\tCountry: ' + fcc.title())
    print('\tPopulation: ' + fpp.title())
    print('\tFact: ' + fff.title())


randict = {'Cole': '123', 'Greg': '456', 'Tiff': '789', 'Ald': '244', 'Kris':'421', 'Dame': '235', 'Fred': '253'}
randict['Lau'] = '1010'
print(randict)
for key,value in randict.items():
    print('\nUser: ' + key + '\nFavnum: ' + value)
print('The following numbers have been mentioned: ')

for nn in randict.values():
    print('\t' + nn)

ppl = {
    'Sean': {
        'Address': 'Earth',
        'Gender': 'M',
        'Age': '20',
        'School': 'UAA',
        'Status': 'Single'
    },
    'Queen': {
        'Address': 'Earth',
        'Gender':'F',
        'Age': '20',
        'School': 'UAA',
        'Status': 'Single'
    }
}

print('Human beings: ')
for info,private in ppl.items():
    print('Name: ' + info)
    print('\t'+ info.title())
    ad = private['Address']
    ge = private['Gender']
    ag = private['Age']
    sc = private['School']
    st = private['Status']
    print('\tAddress: ' + ad.title())
    print('\tGender: ' + ge.title())
    print('\tAge: ' + str(ag.title()))
    print('\tSchool: ' + sc.title())
    print('\tStatus: ' + st.title())

loggedUsers = {
    'Cris': {
        'Country': 'USA',
        'Password': '12234'
    },
    'Queen': {
        'Country': 'Aus',
        'Password': '636432'
    },
    'Aldwyn': {
        'Country': 'UK',
        'Password': '25262626'
    },
    'Alessa': {
        'Country': 'FR',
        'Password' : '48686'
    }
}
print('Users logged: ')
for human,prvinfo in loggedUsers.items():
    print('\nTao: ' + human)
    cn = prvinfo['Country']
    ps = prvinfo['Password']
    print('\tCountry: ' + cn.title())
    print('\tPassword: ' + ps.title())



emails = {'Ivan': 'ivan@gmail.com',
          'Marites': 'marites@gmail.com',
          'Cholo': 'cholo@gmail.com',
          'Teresa': 'teresa@gmail.com',
          'Vladimir': 'vladimir@gmail.com' }
em = emails.setdefault('Ivan')
me = emails.setdefault('Cole', 'cole@gmail.com')
print(me)
print(em)
print(emails)
for em,it in emails.items():
    print('Username: ' + em.title() +'\n' + it.title() + '\n')


stuff = {'Auden':1000, 'Lili':500, 'Avery': 100, 'Adelaide': 50}
cashtotal=0
for cc in stuff.values():
    print(cc)
    cashtotal+=cc
print(cashtotal)

foodorders = {
    'Tim': ['Burgers', 'Coke', 'Fries'],
    'Dylan': ['Beef', 'Bread', 'Donut'],
    'Ethan':['Taco', 'Veggies', 'Salad']
}

for names,orders in foodorders.items():
    print(names + "'s orders are")
    for order in orders:
        print('\t' + order.title())


registeredUsers = {
    'Albert' : {
        'Age': 24,
        'Gender': 'Male',
        'Location': 'Manila',
    },

    'Cole': {
        'Age': 18,
        'Gender': 'Male',
        'Location': 'Cavite',
    },
    'Nate': {
        'Age': 29,
        'Gender':'Male',
        'Location': 'Cebu',

    }

}


for na, inf in registeredUsers.items():
    print('Mga tao: ' + na)
    ag = inf['Age']
    gen = inf['Gender']
    locc = inf['Location']
    print('\tAge: ' + str(ag))
    print('\tGender: ' + gen)
    print('\tLocation: ' + locc)

print()
for us in registeredUsers.keys():
    print(us)

counter = 0
for edad in registeredUsers.values():
    ag = edad['Age']
    counter+=ag
    print(ag)
dv = counter // 3
print('Total: ' + str(counter))
print('Median: ' + str(dv))

alphabet_string = string.ascii_lowercase
alphabet_list = list(alphabet_string)
listnum = list(range(1,10))
print(listnum)
alchoice = random.choice(alphabet_list)
nchoice = random.choice(listnum)
ll = []
for xy in range(10):
    alchoice = random.choice(alphabet_list)
    nchoice = random.choice(listnum)
    al2choice = random.choice(alphabet_list)
    n2choice = random.choice(listnum)
    al3choice = random.choice(alphabet_list)
    n3choice = random.choice(listnum)
    passw = alchoice + str(nchoice) + al2choice + str(n2choice) + al3choice + str(n3choice)
    print(passw)
    ll.append(passw)
print(ll)


nns = [1,2,3,4,5]
dbl = [item * 12 for item in nns]
print(dbl)

userslistcomp = [{'name': 'Ivan', 'age':19}, {'name' : 'max', 'age':16}, {'name': 'kyle', 'age': 26}]
usersname = [user['name'] for user in userslistcomp if user['age'] > 18]
for a in usersname:
    print(a)


mnums = [235,15,3,26,85,4,75,84,1,426,569,35,846,57,68623,75,97,24,7]
numslist = [n for n in sorted(mnums)]
print(numslist)

ntn = [nn*2 for nn in sorted(mnums)]
print(ntn)

ifn = [n for n in sorted(ntn) if n%3== 0]
print(ifn)


integer = list(range(1,5))

alphint = [(letter,num) for letter in alphabet_list for num in integer]
print(alphint)
for dg in alphint:
    print(dg)

listahan = list(range(1,100))
printl = [g for g in listahan if g % 12 == 0]
print(printl)

namesreg = ['Cole', 'Dylan', 'Nathan', 'Ethan', 'Vandamme']
demog = ['Age', 'Sex', 'DOB']
printlist = [( nr ,dg) for nr in namesreg for dg in demog ]
for dd in printlist:
    print(dd)

