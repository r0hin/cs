row = input()
counter = 0
row = row + '0'

for i, char in enumerate(row):
  if (row[i] == '2' and row[i+1] != '5'):
    counter = counter + 1;

print(counter)
