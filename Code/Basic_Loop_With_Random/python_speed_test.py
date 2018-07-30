import time
startTime = int(round(time.time() * 1000))
statements = 0

while int(round(time.time() * 1000)) - startTime <= 1000:
    statements += 1

print (statements)
