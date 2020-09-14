# 1. Types, operators, variables and expressions

1. 
a. a - b - c - d
- a - b
- b - c
- c - d

c. a + b / c / d
- b / c
- c / d
- a + b

e. a % b / c * d
- a % b
- b / c
- c * d

h. (a + b) * c + d * e
- (a + b)
- ab * c
- d * e
-2 abc + de
 

2. 
```
int a = 3;
double d = 2.19;
```

b) (a + 3.0) * a
- 18.0 (double)

e) 2 * 5.0 / a + 3
- 6.33 (double)

f) 2 * 5 / a + 3
- 6 (int) 

g) 4 - d + a / 2
- (double)

3. 

a) ((3 * i) + 4) / 2
- (3 * i + 4) / 2

b) ((3 * j) / (7 - i)) * (i + (-23 * j))
- 3 * j / (7 - i) * (i + (-23 * j))

f) (b || (!(b && (3 == (i * 2)))))
- b || !(b && 3 == i * 2)
 
g) (!(!b) || (b && ((4 >= i + j) || (false))))
- b || b && ((4 >= i + j || false)

4. 

d) 
```
double b = 3.1, c = 0.0;
c = c + 2.0;
b = b * (c + 3.0);
int i = (int) (c + b);
i = i - 1;

c = 20
b = 15.5
i = 17
```

e) 
```
int x = 5;
int y = x; // y = 5
x = x + y; // x = 10
```

5.
Suppose we need to work with the following data:
- age (int) `ageInYears`
- a weight (double) `weightInKilos`
- the number of a lottery ticket (int) `ticketNumber`
- a salary (float) `montlySalaryInDollars`
- a person's gender (male or female) (boolean) `isFemale`
- a person's marital status (single, married, divorced, widowed) (enum/char)
- a distance between stars, measured in light years (long)
- a distance on the Earth's surface, measured in meters  (long)
