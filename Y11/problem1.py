import math

# Get inputs:

oneLineInput = input('Input x1, y1, x2, y2: ');
x1 = float(oneLineInput.split(' ')[0])
y1 = float(oneLineInput.split(' ')[1])
x2 = float(oneLineInput.split(' ')[2])
y2 = float(oneLineInput.split(' ')[3])

# x1 = float(input('Input x1: '));
# x2 = float(input('Input x2: '));
# y1 = float(input('Input y1: '));
# y2 = float(input('Input y2: '));

def areaOfCircle(x1,y1,x2,y2):
  # Get radius:
  radius = math.sqrt( ((y2-y1)**2) + ((x2-x1)**2) );
  area = (radius**2) * 3.14159
  return round(area, 3)

print(areaOfCircle(x1, y1, x2, y2)  );
