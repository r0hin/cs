import random
import time
from turtle import *

speed(100)
def makesquare():
    for i in range(4):
        begin_fill()
        forward(90)
        right(90)
        end_fill()
    forward(90)
def makecircle():
    for i in range(100):

        forward(200)
        right(95)

        forward(80)
        right(95)

        forward(200)
        right(95)

        forward(80)
def makegrid():
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        backward(180)
        forward(360)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        right(90)
        forward(360)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        right(90)
        forward(360)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        right(90)
        forward(360)
        right(90)
        forward(90)
        right(90)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(360)
        left(90)
        forward(90)
        left(90)
        forward(360)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        right(90)
        forward(90)
        right(90)
        forward(360)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        left(90)
        forward(90)
        left(90)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        left(90)
        forward(360)
        right(90)
        color(array[randomColor])
        forward(90)
        right(90)
        forward(360)
        left(90)
        array = ["blue", "red", 'green', 'yellow']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        left(90)
        forward(360)
        delay(100)
        time.sleep(100)


def addsquare(num):
    for i in range(num):
        array = ["blue", "red", 'green', 'yellow','orange','purple']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        right(90)
        array = ["blue", "red", 'green', 'yellow','orange','purple']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        right(90)
        array = ["blue", "red", 'green', 'yellow','orange','purple']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        right(90)
        array = ["blue", "red", 'green', 'yellow','orange','purple']
        randomColor = random.randrange(0,len(array))
        color(array[randomColor])
        forward(90)
        right(90)
        forward(90)
        
def grid(num,num2):
    num3 = 90
    for i in range(num):
        addsquare(num2)
        penup()
        setpos(0, num3)
        num3 = num3 + 90
        pendown()


grid(15,15)
