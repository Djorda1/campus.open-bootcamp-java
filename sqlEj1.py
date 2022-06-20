import random
import sqlite3


# cursor.execute('CREATE TABLE alumnos (id INTEGER PRIMARY KEY, Nombre TEXT NOT NULL ,  Apellido TEXT NOT NULL)')

def importarTabla():
    conn = sqlite3.connect('FicheroSqlite.db')
    cursor = conn.cursor()
    f = open('textoParaEjSql.py.txt', 'r')
    f = f.read().split(',')
    u = 1
    Nombres = []
    Apellidos = []
    for i in f:
        if u % 2:
            Nombres.append(i)
        else:
            Apellidos.append(i)
        u = u + 1
    k = 0
    while k<8:
        rows = cursor.execute(f"INSERT INTO alumnos(id,Nombre,Apellido) VALUES({k},'{Nombres[k]}', '{Apellidos[k]}')")
        conn.commit()
        k=k+1
    cursor.close()
    conn.close()

def buscarAlumno(nombre):
    conn = sqlite3.connect('FicheroSqlite.db')
    cursor = conn.cursor()
    rows = cursor.execute(f"SELECT * FROM alumnos")
    for row in rows:
        for i in row:
            if nombre==i:
                print(row)
            else:pass
    cursor.close()
    conn.close()

buscarAlumno('Tomas')


