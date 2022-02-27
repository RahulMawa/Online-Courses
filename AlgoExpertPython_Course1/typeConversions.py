#CONVERTING DATA TYPES
x = "4"
y = int(x)
print(y + 1)
print(type(y), type(x))

z = "4.5"
a = float(z)
print(type(a))
m = print(int(a))  # will truncate the decimal value completely

b = bool("")
c = bool("edif9")
print("b: ", b, "c: ", c)

#converting input result from string to int
number = int(input("Enter a number: "))
result = number + 5
print("Result", result)

print(int(9.7))