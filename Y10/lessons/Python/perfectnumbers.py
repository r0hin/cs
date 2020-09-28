num = 1000
perfect = []
deficient = []
abundant = []

def factors(num):
    temporaryfactorthingy = []
    for i in range(1, num):
        if (num % i == 0 and num != i):
            temporaryfactorthingy.append(i)
        pass
    return temporaryfactorthingy

def sumify(alist):
    sum = 0
    for item in alist:
        sum += item
        pass
    return sum

for i in range(num):
    factorslist = factors(i)
    thesum = sumify(factorslist)

    if (thesum > i):
        print(str(i) + ' is abundant')
        abundant.append(i)

    elif (thesum < i):
        print(str(i) + ' is deficeint')
        deficient.append(i)

    else:
        print(str(i) + ' is PERFCET LETS GOOOOO!')
        perfect.append(i)

print(perfect)