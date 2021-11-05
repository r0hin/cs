from datetime import datetime;


def convertTime(s):
  hours = int(s.split(':')[0])
  minutes = int(s.split(':')[1])

  if (minutes == 0):
    minutes = '00'

  pm = 'am'
  hoursLeftOver = hours

  if (hours > 12):
    hoursLeftOver = hours - 12
    pm = 'pm'

  return str(hoursLeftOver) + ':' + str(minutes) + pm

print(convertTime(input('Enter time:')))


