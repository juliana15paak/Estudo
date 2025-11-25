from math import ceil, sqrt

def FindPrimes(n):
  raiz = ceil(sqrt(n))
  if n<=2:
    return []
  Primes = [True] * n
  Primes[0] = False
  Primes[1] = False
  for i in range(2,raiz):
    if Primes[i]:
      for j in range(i*i, n, i):
        Primes[j] = False
  return Primes


n = int(input("Digite um número inteiro positivo: "))
Primes = FindPrimes(n)
print(f"Números primos até {n}:")
for i in range(2, n):
  if Primes[i]:
    print(i, end=" ")

