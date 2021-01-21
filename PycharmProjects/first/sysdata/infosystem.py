#Frontend

from tkinter import*
import tkinter.messagebox
import backendinfo


class Participant:
    def __init__(self, root):
        self.root = root
        self.root.title ('Rock Mob Registration System')
        self.root.geometry ('1350x750+0+0')
        self.root.config (bg = 'gray40')

        StdID = StringVar()
        Firstname = StringVar()
        Surname = StringVar()
        Age = StringVar()
        Gender = StringVar()
        Location = StringVar()
        Instrument = StringVar()
############################################ FUNCTION ########################################################
        def iExit():
            iExit = tkinter.messagebox.askyesno('Rock Mob Registration System', 'Confirm if you want to exit')
            if iExit > 0:
                root.destroy()
                return

        def clearData():
            self.txtStdID.delete(0,END)
            self.txtfna.delete(0,END)
            self.txtSna.delete(0,END)
            self.txtAGE.delete(0,END)
            self.txtGEN.delete(0,END)
            self.txtLOC.delete(0,END)
            self.txtINST.delete(0,END)

        def addData():
            if (len(StdID.get())!=0):
                backendinfo.addStdRec(StdID.get(), Firstname.get(), Surname.get(), Age.get(), Gender.get(), Location.get(), Instrument.get())
                studentlist.delete(0,END)
                studentlist.insert(END, (StdID.get(), Firstname.get(), Surname.get(), Age.get(), Gender.get(), Location.get(), Instrument.get()))

        def DisplayData():
            studentlist.delete(0,END)
            for row in backendinfo.viewData():
                    studentlist.insert(END,row,str(''))

        def StudentRec(event):
            global sd
            searchStd = studentlist.curselection()[0]
            sd = studentlist.get(searchStd)
            self.txtStdID.delete(0, END)
            self.txtStdID.insert(END,sd[1])
            self.txtfna.delete(0, END)
            self.txtfna.insert(END, sd[2])
            self.txtSna.delete(0, END)
            self.txtSna.insert(END, sd[3])
            self.txtAGE.delete(0, END)
            self.txtStdID.insert(END, sd[4])
            self.txtGEN.delete(0, END)
            self.txtGEN.insert(END, sd[5])
            self.txtLOC.delete(0, END)
            self.txtStdID.insert(END, sd[6])
            self.txtINST.delete(0, END)
            self.txtINST.insert(END, sd[7])

        def DeleteDate():
            if (len(StdID.get())!=0):
                backendinfo.deleteRec(sd[0])
                clearData()
                DisplayData()

        def searchDatabase():
            studentlist.delete(0,END)
            for row in backendinfo.searchData(StdID.get(), Firstname.get(), Surname.get(), Age.get(), Gender.get(), Location.get(), Instrument.get()):
                studentlist.insert(END,row,str(''))

        def update():
            if (len(StdID.get())!=0):
                backendinfo.deleteRec(sd[0])
            if (len(StdID.get())!=0):
                backendinfo.addStdRec(StdID.get(), Firstname.get(), Surname.get(), Age.get(), Gender.get(), Location.get(), Instrument.get())
                studentlist.delete(0,END)
                studentlist.insert(StdID.get(), Firstname.get(), Surname.get(), Age.get(), Gender.get(), Location.get(), Instrument.get())



        ############################################ FRAMES ################################################

        MainFrame = Frame(self.root, bg = 'gray40')
        MainFrame.grid()

        TitFrame = Frame(MainFrame, bd=2, padx= 54, pady=8, bg = 'gray40', relief = RIDGE)
        TitFrame.pack(side=TOP)

        self.lblTit = Label(TitFrame, font=('arial', 47, 'bold'), text = 'Rock Mob Registration System', bg= 'gray25', fg = 'CadetBlue1' )
        self.lblTit.grid()

        ButtonFrame = Frame(MainFrame, bd=2, width=1350, height = 70, padx = 18, pady= 10, bg = 'gray25', relief=RIDGE)
        ButtonFrame.pack(side=BOTTOM)

        DataFrame = Frame(MainFrame, bd=1, width=1300, height=400, padx = 20, pady=20, relief = RIDGE, bg = 'gray40')
        DataFrame.pack(side=BOTTOM)

        DataFrameLEFT = LabelFrame(DataFrame, bd=1, width=1000, height=600, padx=20, relief=RIDGE, bg= 'gray25', font= ('arial', 20, 'bold'), text = 'Participant Info\n', fg = 'CadetBlue1')
        DataFrameLEFT.pack(side=LEFT)

        DataFrameRIGHT= LabelFrame(DataFrame, bd=1, width=450, height=300, padx=31, pady=3, relief=RIDGE, bg='gray25')
        DataFrameRIGHT.pack(side=RIGHT)

######################################### LABELS ##################################################################
        self.lblStdID = Label(DataFrameLEFT, font=('arial', 20, 'bold'), text= 'Participant ID: ', padx=2, pady=2,bg='Ghost White')
        self.lblStdID .grid(row=0, column=0, sticky=W)
        self.txtStdID = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable = StdID,  width=39)
        self.txtStdID .grid(row=0, column=1)

        self.lblfna = Label(DataFrameLEFT, font=('arial', 20, 'bold'), text = 'Firstname:', padx=2,pady=2,bg='Ghost White')
        self.lblfna .grid(row=1, column=0, sticky=W)
        self.txtfna = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable= Firstname, width=39)
        self.txtfna .grid(row=1, column=1)

        self.lblSna = Label(DataFrameLEFT, font=('arial', 20, 'bold'),text='Surname: ', padx=2, pady=2, bg = 'Ghost White')
        self.lblSna .grid(row=2, column=0, sticky=W)
        self.txtSna = Entry(DataFrameLEFT, font=('arial', 20, 'bold'),textvariable=Surname, width=39)
        self.txtSna .grid(row=2, column=1)

        self.lblAGE = Label(DataFrameLEFT, font=('arial', 20, 'bold'), text='Age: ', padx=2, pady=2,bg='Ghost White')
        self.lblAGE.grid(row=3, column=0, sticky=W)
        self.txtAGE = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable=Age, width=39)
        self.txtAGE.grid(row=3, column=1)

        self.lblGEN = Label(DataFrameLEFT, font=('arial', 20, 'bold'), text='Gender: ', padx=2, pady=2, bg='Ghost White')
        self.lblGEN.grid(row=4, column=0, sticky=W)
        self.txtGEN = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable=Gender, width=39)
        self.txtGEN.grid(row=4, column=1)

        self.lblLOC= Label(DataFrameLEFT, font=('arial', 20, 'bold'), text='Location: ', padx=2, pady=2, bg='Ghost White')
        self.lblLOC.grid(row=5, column=0, sticky=W)
        self.txtLOC = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable=Location, width=39)
        self.txtLOC.grid(row=5, column=1)

        self.lblINST = Label(DataFrameLEFT, font=('arial', 20, 'bold'), text='Instrument: ', padx=2, pady=2, bg='Ghost White')
        self.lblINST.grid(row=5, column=0, sticky=W)
        self.txtINST = Entry(DataFrameLEFT, font=('arial', 20, 'bold'), textvariable=Instrument, width=39)
        self.txtINST.grid(row=5, column=1)

############################################## LISTS AND SCROLL BAR ########################################################
        scrollbar = Scrollbar(DataFrameRIGHT)
        scrollbar.grid(row=0, column=1, sticky='ns')

        studentlist = Listbox(DataFrameRIGHT, width=41, height=16, font=('arial', 12, 'bold'), yscrollcommand = scrollbar.set)
        studentlist.bind('<<ListboxSelect>>', StudentRec)
        studentlist.grid(row=0, column=0, padx=8)
        scrollbar.config(command = studentlist.yview)


################################################## BUTTONS ###################################################
        self.btnAddData = Button(ButtonFrame, text='Add New', font=('arial', 20, 'bold'), height=1,width=10,bd=4, command = addData)
        self.btnAddData.grid(row=0, column=0)

        self.btnDisplayData = Button(ButtonFrame, text='Display', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command = DisplayData)
        self.btnDisplayData.grid(row=0, column=1)

        self.btnClearData = Button(ButtonFrame, text='Clear ', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command= clearData)
        self.btnClearData.grid(row=0, column=2)

        self.btnDeleteData = Button(ButtonFrame, text='Delete ', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command = DeleteDate)
        self.btnDeleteData.grid(row=0, column=3)

        self.btnSearchData = Button(ButtonFrame, text='Search ', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command = searchDatabase)
        self.btnSearchData.grid(row=0, column=4)

        self.btnUpdateData = Button(ButtonFrame, text='Update ', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command = update)
        self.btnUpdateData.grid(row=0, column=5)

        self.btnExit = Button(ButtonFrame, text='Exit ', font=('arial', 20, 'bold'), height=1, width=10, bd=4, command = iExit)
        self.btnExit.grid(row=0, column=6)


if __name__ == '__main__':
    root = Tk()
    application = Participant(root)
    root.mainloop()