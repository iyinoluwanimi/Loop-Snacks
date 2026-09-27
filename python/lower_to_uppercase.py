word = input("Enter a word:")

for letter in word:
	if letter >= 'a' and letter <= 'z':
		letter = chr (ord(letter)-32)
	print(letter,end ="")
