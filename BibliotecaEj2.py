from functools import reduce
def sumaImpares(lista):
    listaimpar=list(filter(lambda x: x%2, lista))
    return reduce(lambda a,b: a+b, listaimpar)

print(sumaImpares([1,2,3,4,5,6,7]))

