let startTime = new Date().getTime();
let statements = 0;

while (new Date().getTime() - startTime <= 1000) {
	statements++;
}

console.log(statements);
