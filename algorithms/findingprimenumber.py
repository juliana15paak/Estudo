from math import ceil, sqrt

def FindPrimes(n):
  raiz = ceil(sqrt(n))
  Primes = [n+1]
  for i in range(2, n+1):
    Primes[i] = True
  for i in range(2,raiz):
    if Primes[i] == 1:
      for i in range(2, i*j<=n):
        Primes[i*j] = False
  return Primes


n = int(input("Digite um número inteiro positivo: "))
Primes = FindPrimes(n)
print(f"Números primos até {n}:")
for i in range(2, n+1):
  if Primes[i]:
    print(i, end=" ")

