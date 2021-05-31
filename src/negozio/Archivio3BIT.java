/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negozio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucaa
 */
public class Archivio3BIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creo l'archivio
        Archivio archivio;
        archivio = new Archivio ();
        
        // Menu
        // System.in è la tastiera
        Scanner tastiera;
        tastiera = new Scanner(System.in);
        
        int scelta = 0;
        
        do{
            System.out.println("--- Gestione del negozio di cioccolatini1"
                    + " --- ");
            System.out.println("1) Visualizza elenco delle informazioni ");
            System.out.println("2) Inserisci cioccolatino");
            System.out.println("3) Elimina cioccolatino");
            System.out.println("4) Cerca cioccolatino in base al prezzo");
            System.out.println("5) Cerca cioccolatino in base alla descrizione");
            System.out.println("6) Modifica cioccolatino");
            System.out.println("7) Esci");
            System.out.print("Scegli l'operazione (1-7): ");

            // Aspetto la scelta dell'utente
            scelta = Integer.parseInt(tastiera.nextLine()); //bloccante

            switch (scelta) {
              case 1:
                // Chiedo al archivio l'elenco di tutte le articolo
                ArrayList<Cioccolatino> elencoArticoli;
                elencoArticoli = archivio.elencoArticoli();

                visualizzaElencoArticoli(elencoArticoli);
                break;

              case 2:
                // Inserisci articolo
                // 1. Chiedo all'utente i dati del nuovo articolo da inserire         
                System.out.print("Inserisci il codice: ");
                String codice = tastiera.nextLine();
                System.out.print("Inserisci la tipologia del cioccolato: ");
                String tipologiaCioccolato = tastiera.nextLine();
                System.out.print("Inserisci la quantita dei cioccolatini nel magazzino: ");
                int cioccolatiniNelmagazzino = Integer.parseInt(tastiera.nextLine());
                System.out.print("Inserisci il prezzo del cioccolatino: ");
                float prezzoCioccolato = Float.parseFloat(tastiera.nextLine());
                System.out.print("Inserisci la scadenza del cioccolatino: ");
                String scadenzaCioccolato = tastiera.nextLine();
                System.out.print("Inserisci la forma del cioccolatino: ");
                String formaDelCioccolatino = tastiera.nextLine();

                // Creo un oggetto (cioccolatino) con i dati forniti dall'utente
                Cioccolatino cioccolatino = new Cioccolatino(codice, tipologiaCioccolato, prezzoCioccolato, scadenzaCioccolato, formaDelCioccolatino, cioccolatiniNelmagazzino);

                // Aggiungo l'oggetto creato nel archivio
                if (archivio.aggiungi(cioccolatino)) {
                  System.out.print("Articolo inserito correttamente");
                } else {
                  System.out.print("Esiste gia un articolo con lo stesso codice !");
                }
                break;

              case 3:
                // Chiedo in input il codice dell'articolo da eliminare         
                System.out.print("Inserisci il codice: ");
                codice = tastiera.nextLine();

                // Elimino l'oggetto dal archivio         
                if (archivio.elimina(codice)) {
                  System.out.println("Articolo eliminato correttamente.");
                } else {
                  System.out.println("Eliminazione non riuscita.");
                }
                break;

              case 4:
                System.out.print("Inserisci il prezzo minimo: ");
                float prezzoMinimo = Float.parseFloat(tastiera.nextLine());
                System.out.print("Inserisci il prezzo massimo: ");
                float prezzoMassimo = Float.parseFloat(tastiera.nextLine());

                elencoArticoli = archivio.cercaArticolo(prezzoMinimo, prezzoMassimo);

                visualizzaElencoArticoli(elencoArticoli);

                break;

              case 5:
                System.out.print("Inserisci la tipologia del ciccolato: ");
                tipologiaCioccolato = tastiera.nextLine();

                elencoArticoli = archivio.cercaArticoloPerDescrizione(tipologiaCioccolato);

                visualizzaElencoArticoli(elencoArticoli);
                break;
              case 6:
                System.out.print("Inserisci il codice: ");
                codice = tastiera.nextLine();
                System.out.print("Inserisci la tipologia: ");
                tipologiaCioccolato = tastiera.nextLine();
                System.out.print("Inserisci la quantità: ");
                cioccolatiniNelmagazzino = Integer.parseInt(tastiera.nextLine());
                System.out.print("Inserisci il prezzo: ");
                prezzoCioccolato = Float.parseFloat(tastiera.nextLine());

                if (archivio.modificaArticolo(codice, tipologiaCioccolato, cioccolatiniNelmagazzino, prezzoCioccolato)) {
                  System.out.println("Modifica moto avvenuta correttamente.");
                } else {
                  System.out.println("Non è stato possibile modificare la moto.");
                }
                break;
            }

          } while (scelta != 7);

        }

        private static void visualizzaElencoArticoli(ArrayList<Cioccolatino> elencoArticoli) {
          System.out.println("N°\tCodice\t\tTipologia\t\tPrezzo\t\tScadenza\t\tForma\t\tQuantità");
          for (int i = 0; i < elencoArticoli.size(); i++) 
            {
            System.out.print(i + 1);
            System.out.print("\t" + elencoArticoli.get(i).getCodice());
            System.out.print("\t\t" + elencoArticoli.get(i).gettipologiaCioccolato());
            System.out.print("\t\t" + elencoArticoli.get(i).getprezzoCioccolato());
            System.out.print("\t\t" + elencoArticoli.get(i).getscadenzaCioccolato());
            System.out.print("\t\t" + elencoArticoli.get(i).getformaDelCioccolatino());
            System.out.println("\t\t" + elencoArticoli.get(i).getcioccolatiniNelMagazzino());
            }
        System.out.println("\n");
        }
    }
