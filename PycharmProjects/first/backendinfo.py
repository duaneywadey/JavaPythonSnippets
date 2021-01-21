import sqlite3


def studentData():
    con=sqlite3.connect('Participant.db')
    cur = con.cursor()
    cur.execute("CREATE TABLE IF NOT EXISTS Participant(id INTEGER PRIMARY KEY, StdID text, Firstname text, Surname text, Age text, Gender text, Location text, Instrument text)")
    con.commit()
    con.close()

def addStdRec(StdID, Firstname,  Surname, Age, Gender, Location,  Instrument):
    con=sqlite3.connect('Participant.db')
    cur = con.cursor()
    cur.execute('INSERT INTO Participant VALUES (NULL, ?,?,?,?,?,?,? )',
                (StdID, Firstname,  Surname, Age, Gender, Location,  Instrument))
    con.commit()
    con.close()

def viewData():
    con = sqlite3.connect('Participant.db')
    cur = con.cursor()
    cur.execute("SELECT * FROM Participant")
    rows = cur.fetchall()
    con.close()
    return rows

def deleteRec(id):
    con = sqlite3.connect('Participant.db')
    cur = con.cursor()
    cur.execute('DELETE FROM Participant WHERE id=?', (id,))
    con.commit()
    con.close()

def searchData(StdID='', Firstname='',  Surname='', Age='', Gender='', Location='',  Instrument=''):
    con=sqlite3.connect('Participant.db')
    cur=con.cursor()
    cur.execute('SELECT * FROM Participant WHERE StdID=?, OR Firstname=?, OR Surname=?, OR Age=?, OR Gender=?, OR Location=?, OR Instrument=?',
                (StdID, Firstname,  Surname, Age, Gender, Location,  Instrument))
    rows=cur.fetchall()
    con.close()
    return rows

def dataUpdate(id, StdID='', Firstname='',  Surname='', Age='', Gender='', Location='',  Instrument=''):
    con=sqlite3.connect('Participant.db')
    cur=con.cursor()
    cur.execute('UPDATE Participant SET StdID=?, Firstname=?, Age=?, Gender=?, Location=?, Instrument=?, WHERE id=?',
                (StdID, Firstname,  Surname, Age, Gender, Location,  Instrument, id))
    con.commit()
    con.close()
