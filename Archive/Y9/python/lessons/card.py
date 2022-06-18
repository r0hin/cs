from tkinter import *

root = Tk()
root.title("photo tagger")
root.geometry("500x350")


spaceframe = Frame(root,height=10)
spaceframe.pack(fill=X)
frame = Frame(root,borderwidth = 1.5, relief=RAISED, width=400,height=150)
frame.pack(fill=None, expand=False)
spaceframe = Frame(root,height=10)
spaceframe.pack(fill=X)


root.mainloop()
            