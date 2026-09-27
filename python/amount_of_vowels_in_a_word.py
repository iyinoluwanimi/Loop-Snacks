word = input("Enter a word:")

count = 0
for letter in word:
	if letter == "a" or letter == "e" or letter == "i" or letter == "o" or letter == "u" or letter == "A" or letter == "E" or letter == "I" or letter == "O" or letter == "U" :
		count = count + 1
print(count)
