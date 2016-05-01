# NTP-command-propmpt

Napisati aplikaciju koja simulira Command Prompt. Aplikacija prima komande sa tastature i prikazuje rezultat izvršenja na konzoli. Implementirati sledeće komande: dir, cd <folder>, zip <fajl> <arhiva>, unzip <arhiva>, copy <stari fajl> <novi fajl>  i exit. 

Komanda dir nema parametara i lista tekući folder. 
Komanda cd se može zadati bez parametara i sa jednim parametrom. Ako se ne prosledi parametar, komanda vraća tekući folder, ako ima parametar, to je folder u koji treba preći. Ako je parameter “..” onda se prelazi u nadređeni folder. 
Komanda zip ima dva obavezna parametra: prvi je ime fajla koji treba smestiti u arhivu, a drugi je ime arhive u koji se smešta fajl.
Komanda unzip raspakuje arhivu koja je data u parametru u tekući folder.
Komanda copy kopira <stari fajl> u <novi fajl>.
Komanda exit prekida izvršavanje programa.
