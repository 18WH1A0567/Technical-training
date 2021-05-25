def sumOfFactors(n):
    if n == 1:
        return 1
    s = 0
    s += n
    i = 1
    while(i*i <= n):
        if n % i == 0:
            s += i
        i += 1 
    return s 
    
l = [int(x) for x in input().split()]
r = []
for i in l:
    x = sumOfFactors(i)
    if x in l:
        r.append(i)
if len(r) > 0:
    print(r)
else:
    print('-1')
    
