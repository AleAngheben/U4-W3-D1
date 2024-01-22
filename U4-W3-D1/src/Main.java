public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // ESERCIZIO 1
        //------ // SELECT * FROM public.clienti WHERE nome = 'Mario';


        // ESERCIZIO 2
        //------ // SELECT nome,cognome FROM public.clienti WHERE anno_di_nascita = '1982-03-12';


        // ESERCIZIO 3
        //------ //SELECT numero_fattura FROM public.fatture WHERE iva = 20;


        // ESERCIZIO 4
        //------ //SELECT id_prodotto, descrizione, in_produzione, in_commercio, data_attivazione, dara_disattivazione
        //	FROM public.prodotti WHERE EXTRACT(YEAR FROM data_attivazione) = 2017
        //	AND (in_produzione = true OR in_commercio = true);


        // ESERCIZIO 5
        //------ // SELECT * FROM public.fatture a INNER JOIN public.clienti c ON a.id_cliente = c.numero_clienti
        //WHERE a.importo < '1000.00';


        // ESERCIZIO 6
        //------ // SELECT a.numero_fattura, a.importo, a.iva, a.data_fattura, f.denominazione FROM public.fatture a INNER JOIN public.fornitori f
        //ON a.numero_fornitore = f.numero_fornitore
        //;

        // ESERCIZIO 7
        //------ //SELECT iva , data_fattura FROM public.fatture WHERE iva = 20 AND EXTRACT(YEAR FROM data_fattura)=2016;

        // ESERCIZIO 8
        //------//SELECT EXTRACT(YEAR FROM data_fattura)AS anno, count(*),SUM(importo) AS somma_importi FROM public.fatture GROUP BY anno
    }
}