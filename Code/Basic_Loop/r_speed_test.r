startTime <- as.numeric(Sys.time())*1000
statements <- 0

while (as.numeric(Sys.time())*1000 - startTime <= 1000) {
  statements = statements + 1
}

print (statements)
