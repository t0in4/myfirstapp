import random
wordArray1 = ["24/7","multi-tier","B-to-B","dynamic","pervasive"]
wordArray2 = ["empowered", "leveraged", "aligned", "targeted"]
wordArray3 = ["process", "paradigm", "solution", "portal", "vision"]
arraySize1 = random.choice(range(len(wordArray1)))
arraySize2 = random.choice(range(len(wordArray2)))
arraySize3 = random.choice(range(len(wordArray3)))
#phrase = wordArray1[arraySize1],wordArray2[arraySize2],wordArray3[arraySize3]
x,y,z = wordArray1[arraySize1],wordArray2[arraySize2],wordArray3[arraySize3]
print("{0} {1} {2}".format(x,y,z))
d = [x,y,z]
pwer = random.shuffle(d)
print("{0} {1} {2}".format(d[0],d[1],d[2]))
