def findDigitsInBase(n,b):
    digits = []
    while n > 0:
        resto = n%b
        digits.append(resto)
        n = n//b
    
    for e in reversed(digits):
        print(e, end='')
    
def main():
    n = int(input("Digite o número decimal: "))
    b = int(input("Digite a base (10 = decimal, 2 = binário...): "))
    findDigitsInBase(n,b)

main()
    
