import sqlite3

conn = sqlite3.connect('musicians.db')
c = conn.cursor()

def createTable():
    c.execute('CREATE TABLE stuffToPlot(unix REAL, datestamp TEXT, keyword TEXT, value REAL)')

def data_entry():
    c.execute('INSERT INTO stuffToPlot VALUES(123133214,21,MALE, CAVITE)')
    conn.commit()
    c.close()
    conn.close()


#createTable()
data_entry()
