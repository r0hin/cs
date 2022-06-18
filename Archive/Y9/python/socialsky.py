import time; import os; import tkinter as tk; from tkinter import *; import tkinter; import random; import webbrowser; import pyrebase

# ===========
#  Imports
# ===========
# time | os | tkinter | random| webbrowser | pyrebase
# ---------------------------------------------------

config = {
    "apiKey": "AIzaSyA0HGJmoZzBtUDQz8q1220KddF3L4n-cbI",
    "authDomain": "socialsky-c7b4a.firebaseapp.com",
    "databaseURL": "https://socialsky-c7b4a.firebaseio.com",
    "projectId": "socialsky-c7b4a",
    "storageBucket": "",
    "messagingSenderId": "274702686604",
    "appId": "1:274702686604:web:daa2b2529fa8586ce11ea9"
}
firebase = pyrebase.initialize_app(config)

auth = firebase.auth()
db = firebase.database()


root = tk.Tk()


def all_children(window):
    _list = window.winfo_children()

    for item in _list:
        if item.winfo_children():
            _list.extend(item.winfo_children())

    return _list


def newpost():
    
    print(V1.get())
    value = V1.get()
    entryText.set( "" )
    db = firebase.database()
    db.child("posts").push(value)
    time.sleep(1)
    start()
    


def signin():


    auth = firebase.auth()
    globals()['user'] = auth.sign_in_with_email_and_password(
        e1.get(), e2.get())
        
    data = auth.get_account_info(user['idToken'])

    if os.path.exists("session.txt"):
        os.remove("session.txt")
    file = open("session.txt", "w")
    file.write(e1.get() + '\n')
    file.write(e2.get())
    file.close()

    start()
    # except:
    #     del1 = tk.Label(
    #         root, fg="red", text="An error occured while trying to validate your information.", font=("Helvetica", 12))
    #     del1.pack()


def signup():
    webbrowser.open('https://socialsky-c7b4a.web.app')


def center(win):
    win.update_idletasks()
    width = win.winfo_width()
    height = win.winfo_height()
    x = (win.winfo_screenwidth() // 2) - (width // 2)
    y = (win.winfo_screenheight() // 2) - (height // 2)
    win.geometry('{}x{}+{}+{}'.format(width, height, x, y))

entryText = tk.StringVar()
V1 = tk.Entry(root, bd=5, textvariable=entryText)


def start():



    widget_list = all_children(root)
    for item in widget_list:
        item.pack_forget()
    del1 = tk.Label(root, text="Social Sky", font=("Helvetica", 44))
    del1.pack()

    L1 = tk.Label(root, text="New Post")
    L1.pack()
    V1.pack()
    tk.Button(root, command=newpost, text="Post", bd=5).pack()
    tk.Button(root, command=start, text="Refresh", bd=5).pack()
    tk.Label(root, text="", bd=5).pack()
    tk.Label(root, text="Most recent 12 posts:", bd=5).pack()
    tk.Label(root, text="", bd=5).pack()
    posts = db.child("posts").get()
    values = []
    keys = []
    for user in posts.each():
        values.append(user.val())
        keys.append(user.key())

    actualvalues = list(reversed(values))
    values = actualvalues[:12]

    for value in values:
        valueid = value + 'poop'
        valueid = tk.Frame(root, borderwidth = 1.5, width=300, height=200, relief=RAISED)

        tk.Label(valueid, text=value).pack(side=TOP)
        valueid.pack()


frame = tk.Frame(root, borderwidth=1.5, width=400, height=150)
frame.pack(fill=None, expand=False)



try:
    del1 = tk.Label(frame, text=" ", font=("Helvetica", 44))
    del1.pack()
    del1 = tk.Label(frame, text=" ", font=("Helvetica", 44))
    del1.pack()

    del22 = tk.Label(frame, text="Welcome (back) to SocialSky", font=("Helvetica", 32))
    del22.pack()

    del1 = tk.Label(frame, text=" ", font=("Helvetica", 44))
    del1.pack()

    del19 = tk.Label(frame, text="Email Address", font=("Helvetica", 14))
    del19.pack()

    file = open("session.txt", "r+")
    lines = file.readlines()
    user = lines[0].replace("\n", "")

    passw = lines[1]

    e1 = tk.Entry(frame)

    e2 = tk.Entry(frame, show="*")
    e1.insert(0, user)
    e2.insert(0, passw)
    e1.pack()
    del1 = tk.Label(frame, text=" ", font=("Helvetica", 24))
    del1.pack()
    del32 = tk.Label(frame, text="We managed to save your login details from last session! Choose 'sign in' to login.", font=("Helvetica", 12))
    del32.pack()
    del1 = tk.Label(frame, text=" ", font=("Helvetica", 24))
    del1.pack()

    file.close()

except:

    e1 = tk.Entry(frame)
    e1.insert(0, "")
    e2 = tk.Entry(frame, show="*")
    e2.insert(0, "")
    e1.pack()


del3 = tk.Label(frame, text="Password", font=("Helvetica", 14))
del3.pack()

e2.pack()

del4 = tk.Button(frame, text='Sign In', command=signin)
del4.pack()
del5 = tk.Button(frame, text='Sign Up', command=signup)
del5.pack()


root.geometry('1000x600')
center(root)
root.title('SocialSky | Anonymous social media created by Rohin. ')

root.config(background="#fff")
root.mainloop()
