Dim startTime, statements

startTime = Timer
statements = 0

Do While Timer - startTime <= 1
    statements = statements + 1
Loop

WScript.stdout.write(statements)
