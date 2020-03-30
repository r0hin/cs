import tkinter as tk

def show_entry_fields():
    print(e1.get())
    print(e2.get())

master = tk.Tk()

tk.Label(master, text="First Name").grid(row=0)
tk.Label(master, text="Last Name").grid(row=1)

e1 = tk.Entry(master)
e2 = tk.Entry(master)

e1.grid(row=0, column=1)
e2.grid(row=1, column=1)

tk.Button(master, text='Quit', command=quit).grid(row=3, column=0)
tk.Button(master, text='Show', command=show_entry_fields).grid(row=3, column=1)

tk.mainloop()