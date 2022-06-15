
lista=input("ingresar lista de paises")
lista=list(dict.fromkeys(lista.split(',')))
lista.sort()
print(lista)
