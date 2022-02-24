x = 2
y = 3

sum = x + y
print(sum)

sum += 3.0
print(sum)  # this time output will be float

sub = y - 1
print(sub)

product = x * y
print(product)

division = x / y
print(division)  # this will also be in float, even if operands are int

power = x ** y
print(power)

int_division = y // x
print(int_division)  # for 3 / 2, instead of showing 1.5, int division will show 1, by completely ignoring the decimals... 
#so even though the answer was 1.5, instead of showing 2, it printed 1

mod = y % x
print(mod)  # prints the remainder during a division