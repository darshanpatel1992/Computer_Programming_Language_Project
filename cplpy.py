# Darshan Patel
# **CS 635102
#*dap83@njit.edu
import sys, codecs
 #function create for input string
def splitNT(fullstring):
	fstchar = fullstring[0]
	remainst = fullstring[1:]
 #condition for first char of input is lower case
 #else print first char with <>
	if fstchar.islower() and len(remainst)>=1:
		print "<"+fstchar+">",
	else:
		print fstchar,
#condition for upper case
	if remainst.isupper():
		print remainst
	elif len(remainst) >= 1:
		print "<"+remainst+">"
#conditon for  lower case and length of newgrammer graterthan and eq to 1
	if fstchar.islower() and len(remainst)>=1:
		print "<"+fstchar+"> ->" +fstchar

	if len(remainst) >= 1 and not remainst.isupper():
		print "<"+remainst+"> ->",
   #call newgrammer
		splitNT(remainst)

	return
 # Get input from the user
argList = raw_input('Enter the ip:\n')
 #input with -> arrow and split sting
input = str(argList).split('->')
# condition if length of input is less then 2 it will get error
if len(input) != 2:
	print "Invalid input!"
	exit()

print input[0]+ " -> ",
#function call of splitnt
splitNT(input[1])
