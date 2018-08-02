letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-=_+`~,<.>/?:"
uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def random(seed):
    seed += seed[0] + letters[letters.find(seed[len(seed) - 1])]
    casingFactor = 1

    for i in range(len(seed)):
        if not uppercaseLetters.find(seed[1]) == 0:
            casingFactor += 1

    length = len(seed)
    rndNumber = ""
    casingFactor *= length

    for i in range(length):
        rndNumber += getChar((((i * casingFactor) + 1) * (letters.find(seed[i]) * i)) + length)

    newAnswer = seed[0]

    for i in range(len(rndNumber)-1):
        newAnswer += rndNumber[i]

    return lengthen(reverse((newAnswer + letters[loop(casingFactor, 0, len(letters))])[1:]), seed)

def getChar(index):
	i = index
	while i >= len(letters):
		i -= len(letters)
	if (i < 0):
		i = 0
	return letters[i]

def loop (number, start, stop):
	if number > stop:
		return number % stop
	elif number < start:
		return stop - abs(number % stop)
	else:
		return number

def reverse(answer):
	return answer[::-1]

def lengthen (string, seed):
	index = 0
	for i in range(len(string)):
		index += letters.find(string[i])
	newString = ""
	for i in range(index):
		newString += letters[loop(index, 0, len(letters) - 1)]
		index -= len(seed)
	return newString

print (random("hello world"))

# all objects have properties: Mum.Dishwasher XD. from thalia
