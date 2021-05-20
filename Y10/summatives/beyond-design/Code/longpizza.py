n = int(input())

x, y = map(int, input().split())

r = int(input())

counter = 0

for i in range(r):
  l, r = map(int, input().split())
  counter += max(0, min(r, y) - max(l, x) + 1)

print(counter);

