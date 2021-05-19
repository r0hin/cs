n = input(); # Number of emeralds.
row = input(); # Emeralds as numbers space-separated.

arr = row.split() # Turn emeralds into array.

max = 0; # Create counter for maximum number of emeralds.
i = 0; # Set a counter.
currentlyEven = 0; # Set a variable to compare.

while i < len(arr): # Loop through the emerald array.

  if int(arr[i]) % 2 == 0: # Check if current item is even

    # It's even, so continue.
    currentlyEven = currentlyEven + int(arr[i]); # Set even counter.

    if currentlyEven > max:
      max = currentlyEven # Update max amount of emeralds, if its a new maximum.

  else: 
    currentlyEven = 0 # Cancel streak.

  # counter
  i = i + 1

print(max) #Submit