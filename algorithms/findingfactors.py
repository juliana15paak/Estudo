from math import ceil, sqrt

def FindFactors(n):
  factors = [0]
  raiz=ceil(sqrt(n))
  for i in range(1, raiz):
    if n%i == 0:
      factors.append(i)
      if i != raiz:
        cofactorB = n//i
        factors.append(cofactorB)
  return sorted(factors)

n = int(input("Digite um número para encontrarmos quais são os seus fatores: "))
print(FindFactors(n))