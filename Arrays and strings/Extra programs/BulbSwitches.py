n = int(input())
l = [int(x) for x in input().split()]
c = 0
temp = 1
for i in l:
    if i != temp:
        c += 1
        temp = i
print(c)
