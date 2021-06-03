num = int(input())
l = [int(x) for x in input().split()]
res = [0] * num
pos = 0
neg = 1
for i in l:
    if i < 0:
        res[neg] = i
        neg += 2
    else:
        res[pos] = i
        pos += 2
print(res)
