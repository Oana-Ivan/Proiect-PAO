# Proiect PAO - Biblioteca
---

Acest proiect propune un mod de reprezentare a actiunilor ce sunt caracteristice unui biblioteci

## Obiecte implementate
- clasa Carte, din care deriva:
    - CarteLiteratura
    - CarteStiintifica
- clasa sortCarti prin intermediul careia cartile se sorteaza crescator dupa numarul de dati cand
  o anumita carte a fost imprumutata
- clasa abstracta Persoana, din care deriva:
    - clasa Bibliotecar
    - clasa Autor
    - Clasa Abonat
- clasa Abonament
- clasa Main unde se gaseste meniul cu actiunile posibile
- clasa Gestiune unde sunt implementate optiunile din meniul din clasa Main

## Actiuni posibile
1.	adaugare carte literatura
2.	adaugare carte stiintifica
3.	afisare carti(afisarea obiectelor de tip Carte, CarteLiteratura si CarteStiintifica)
4.	afisarea celei mai citite cartii din punct de vedere al numarului de imprumuturi
5.	adaugare bibliotecar
6.	afisare bibliotecari
7.	adaugare autor
8.	afisare autori
9.	adaugare abonat
10.	afisare abonati
11.	adaugare abonament
12.	afisare abonamente
13.	adaugare imprumut(dupa numele persoanei care imprumuta si titlul cartii imprumutate)
14.	sortare carti dupa numar imprumuturi
