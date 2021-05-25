l = [int(x) for x in input("Enter numbers: ").split()]
t = int(input("Enter target: "))
for i in l:
    x = t - i
    if x in l:
        if l.index(x) != l.index(i):
            print(i, x)
            break