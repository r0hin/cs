tallest = [];
stillInputting = True

for i in range(int(input('enter how many students: '))):
  lineinput = input('Enter studen data: ')
  height = float(lineinput.split(' ')[1])
  unit = lineinput.split(' ')[2]

  if (unit == 'cm'):
    height = height / 100
  elif (unit == 'dm'):
    height = height / 10
  elif (unit == 'mm'):
    height = height / 1000

  tallest.append({
    "height": height,
    "name": lineinput.split(' ')[0]
  });

print(tallest)

sortedList = sorted(tallest, key=lambda k: k['height'])
print(sortedList)