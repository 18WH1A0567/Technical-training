n = int(input())
l = [int(x) for x in input().split()]
d = {}
for i in l:
    if i in d:
        d[i] += 1
    else:
        d[i] = 1
x1 = max(d, key = d.get)
v1 = d[x1]
d.pop(x1)
x2 = max(d, key = d.get)
v2 = d[x2]
if v1 == v2:
    print("No majority element!")
else:
    print(x1)
