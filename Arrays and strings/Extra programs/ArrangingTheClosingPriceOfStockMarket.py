num = int(input())
l = [int(x) for x in input().split()]
n, p = [i for i in l if i < 0], [i for i in l if i >= 0]
print(n + p)
