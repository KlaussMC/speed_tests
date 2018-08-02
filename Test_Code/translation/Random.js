const letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-=_+`~,<.>/?;:";
const uppercaseletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
function random(seed) {
	seed += seed[0] + letters[letters.indexOf(seed[seed.length])];
	let casingFactor = 1;
	for (let i in seed) {
		if (uppercaseletters.indexOf(seed[i])) {
			casingFactor += 1;
		}
	}
	let length = seed.length;
	let rndNumber = "";
	casingFactor *= length;
	for (let i = 0; i < length; i++) {
		rndNumber += getChar((((i * casingFactor) + 1) * (letters.indexOf(seed[i]) * i)) + length);
	}
	let newAnswer = seed[0];
	for (let i = 1; i < rndNumber.length; i++) {
		newAnswer += rndNumber[i];
	}
	return lengthen(reverse(format(newAnswer + letters[loop(casingFactor, 0, letters.length)])), seed);
}
function getChar(index) {
	let i = index;
	while (i >= letters.length) {
		i -= letters.length;
	}
	if (i < 0) {
		i = 0;
	}
	return letters[i];
}
function loop (number, start, stop) {
	if (number > stop) {
		return number % stop;
	} else if (number < start) {
		return stop - Math.abs(number % stop);
	} else {
		return number;
	}
}
function format (answer) {
	return answer.substring(1);
}
function reverse(answer) {
	let newAnswer = "";
	for (let i = answer.length; i > 0; i--) {
		newAnswer += answer[i] || "";
	}
	return newAnswer;
}
function lengthen (string, seed) {
	let index = 0;
	for (let i = 0; i < string.length; i++) {
		index += letters.indexOf(string[i]);
	}
	let newString = "";
	for (let i = 0; i < index; i++) {
		newString += letters[loop(index, 0, letters.length)];
		index -= seed.length;
	}
	return newString;
}
// let startTime = new Date().getTime();
// console.log(random(process.argv[2] || "hello world"))
// console.log("completed in " Date.getTime() - startTime + "ms");

console.log(random("hello world"))
