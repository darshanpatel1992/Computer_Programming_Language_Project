import sys, codecs
 
def separateNonTerminals(grammar):
	rule = grammar[0]
	newGrammar = grammar[1:]

	if rule.islower() and len(newGrammar)>=1:
		print "<"+rule+">",
	else:
		print rule,

	if newGrammar.isupper():
		print newGrammar
	elif len(newGrammar) >= 1:
		print "<"+newGrammar+">"

	if rule.islower() and len(newGrammar)>=1:
		print "<"+rule+"> - "+rule

	if len(newGrammar) >= 1 and not newGrammar.isupper():
		print "<"+newGrammar+"> - ",
		separateNonTerminals(newGrammar)

	return

argList = sys.argv

if len(argList) != 2:
	print "Invalid input!"
	exit()

input = str(argList[1]).split('-')

if len(input) != 2:
	print "Invalind arguments!"
	exit()

print input[0]+ " - ",
separateNonTerminals(input[1])
