x = 3
y = 4

cond = x == y
print(cond)

y = 3
cond = x != y
print(cond)

cond = x + 2 >= y + 1
print(cond)

str1 = "hello"
str2 = "Hello"
cond = str1 == str2
print(cond)

"""
ASCII CHARACTERS AND THEIR ENCODING
How to find the ASCII number associated to each character
ord() or ordinal function will output the ASCII number
chr() or the char function will output the character for input of ASCII numbers
"""

print(ord("a"))
print(ord("A"))
print(ord("!"))

print(chr(ord("a")))
print(chr(ord("A")))
print(chr(33))