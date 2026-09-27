word = input("Enter a word:")

for letter in word:
	if letter >= 'A' and letter <= 'Z':
		letter = chr (ord(letter) + 32)
	print(letter,end ="")
