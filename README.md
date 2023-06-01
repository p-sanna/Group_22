GRUPPO 22
Sviluppo del gioco da tavola “My Shelfie” in Java

DESCRIZIONE DEL PROGETTO
Il progetto è uno sviluppo del gioco da tavola “My Shelfie” in Java seguendo le regole, gli elementi e le dinamiche riportate nel rispettivo libretto d’istruzioni.
Causa motivi di tempo non è stato possibile implementare il conteggio dei punti nel caso 4 giocatori pur avendo comunque implementato la plancia che preleva le carte correttamente.
Il programma è in grado di selezionare quali tessere lasciare prendere all’utente e quante la libreria può ospitarne adeguando l’input dell’utente di conseguenza, è possibile in quanto non del tutto eliminato un bug sulla selezione di tessere che non hanno nessuna adiacente intorno a loro.
Abbiamo usato Junit per testare i metodi delle classi una volta che il programma ha assunto dimensioni importanti per capire se i metodi ci restituissero a condizioni prestabilite i corretti risultati per poter poi quindi implementare il tutto nel main.
COME USARE IL PROGETTO

Il primo output a console richiede l’inserimento del numero di giocatori tra 2 e 4.
In base al numero inserito verrà stampata la plancia di gioco con numero di tessere variabili in base al numero di giocatori. 
Immediatamente dopo vengono riportate le descrizioni dei due Obiettivi Comuni per la partita in corso.
Si prosegue con la richiesta di inserimento dei nomi dei giocatori che devono essere diversi e non vuoti, pena richiesta di nuovo inserimento. Appena l’inserimento dei nomi avviene correttamente viene stampato il primo giocatore  a partire e l’ordine dei turni; inoltre vengono stampati a schermo gli Obiettivi Personali per ciascun giocatore in ordine in base alla successione dei turni.
Inizia ora la sequenza di richieste riguardanti il prelievo di tessere dalla plancia:
•	Primo requisito riguarda il numero di tessere che si vogliono prelevare( da 1 a 3);
•	Se viene indicato 1: si devono inserire le coordinate della tessera seguendo le indicazioni a console;
•	Se viene indicato 2: viene richiesto di indicare le coordinate della prima tessera, la richiesta successiva riguarda la direzione di spostamento (v/o) e la conseguente richiesta di decidere se spostarsi di una riga/colonna di coordinata -1 o +1;
•	Se viene indicato 3: avviene la stessa sequenza del caso 2 tessere, in aggiunta però è richiesto di inserir e la colonna/riga della terza tessera da prelevare sempre rispetto della prima tessera ma tenendo conto della direzione della seconda tessera selezionata (se si inserisce -1 per la seconda, si deve inserire -2 per la terza, e allo stesso modo se si inserisce +1 per la seconda, si deve inserire +2 per la terza).
Se la selezione del prelievo avviene correttamente viene richiesto di inserire in quale colonna (da 1 a 5) della rispettiva libreria inserire le tessere appena prese. Terminata questa azione viene considerato finito il turno e viene indicato l’inizio del turno successivo.
Si prosegue in sequenza con i vari turni, se necessario la plancia viene ricaricata, fino a quando uno dei giocatori completa la propria libreria. In questo caso la partita termina e vengono stampati i risultati con i relativi punteggi.
