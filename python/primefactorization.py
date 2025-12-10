from math import ceil, sqrt

def PrimeFactorization(n):
  sr = ceil(sqrt(n))
  for i in range(2, sr):
    if n%i==0:
      ct = 0
      while n%i==0:
        n = n//i
        ct += 1
      print(f"{i}^{ct}")
  if n!=1:
    print(f"{n}^1")
  
n = int(input("Enter a number to see its prime factorization: "))
PrimeFactorization(n)