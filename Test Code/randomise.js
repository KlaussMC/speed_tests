const letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-=_+`~,<.>/?;:";
const uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

function random(seed) {

	let casingFactor = 1;
	for (let i in seed) {
		if (uppercaseLetters.indexOf(seed[i])) {
			casingFactor += 1;
		}
	}
	let length = seed.length;

	let rndNumber = 0;

	casingFactor *= length;

	for (let i = 0; i < length; i++) {
		rndNumber += getChar((((i * casingFactor) + 1) * (letters.indexOf(seed.charAt(i)) * i)) + length);
	}

	let newAnswer = seed[0];

	for (let i = 1; i < rndNumber.length(); i++) {
		newAnswer += rnd.charAt(i);
	}

	return newAnswer + letters[casingFactor];
}

function getChar(index) {
	let i = index;

	while (i >= letters.length {
		i -= letters.length;
	}

	if (i < 0) {
		i = 0;
	}

	return letters[i];
}

console.log(random("Hello world"))
