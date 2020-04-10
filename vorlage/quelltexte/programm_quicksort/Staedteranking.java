public class Staedteranking
{
    List<Stadt> rankingliste;

    public Staedteranking()
    {
        rankingliste = new List<Stadt>();
    }

    public void neueStadtInsRankingAufnehmen(Stadt pStadt) {
        rankingliste.append(pStadt);
    }

    public void listeAusgeben() {
        rankingliste.toFirst();

        System.out.println("Rankingliste:");
        System.out.println("*************");

        while(rankingliste.hasAccess()){
            System.out.println(rankingliste.getContent().getStadtname() + ": " + rankingliste.getContent().getEinwohnerzahl());
            rankingliste.next();
        }

        System.out.println(" ");
    }

    public void sortiereRankinglisteMitQuickSort(){
        rankingliste = quickSort(rankingliste);
    }

    private List<Stadt> quickSort(List<Stadt> pZuSortierendeListe){
        // Solange die zu sortierende Liste nicht leer ist,
        // muss sortiert werden...
        if(!pZuSortierendeListe.isEmpty()){
            // Lege linke und rechte Listen an
            List<Stadt> linkeListe;
            List<Stadt> rechteListe;

            // Lege eine Liste an, die am Ende nach oben weiter gegeben wird
            List<Stadt> gebauteListe;

            // Initialiesiere die drei Listen (zu Beginn leer)
            linkeListe = new List<Stadt>(); 
            rechteListe = new List<Stadt>();
            gebauteListe = new List<Stadt>();

            // Waehle als Pivoelement das letzte Element:
            // Springe zum Ende
            pZuSortierendeListe.toLast();

            // Speichere das Element ab
            Stadt pivot =  pZuSortierendeListe.getContent();

            // Entferne das Element, damit es beim Aufteilen in die linke
            // und rechte Liste nicht beruecksichtigt wird
            pZuSortierendeListe.remove();

            // Springe an den Anfang
            pZuSortierendeListe.toFirst();

            // Los geht's mit dem Aufteilen
            while(pZuSortierendeListe.hasAccess()){

                // Entscheide anhand der Einwohnerzahlen, welche Stadt nach
                // links bzw. nach rechts muss (die zu sortierende Liste
                // wird dabei von links nach rechts durchlaufen)
                if(pZuSortierendeListe.getContent().getEinwohnerzahl() < pivot.getEinwohnerzahl()){
                    linkeListe.append(pZuSortierendeListe.getContent());
                }
                else {
                    rechteListe.append(pZuSortierendeListe.getContent());
                }

                // Gehe ein Element in der zu sortierenden Liste weiter
                pZuSortierendeListe.next();
            }

            // Setze die fertige (gebaute) Liste zusammen,
            // allerdings wird vorher quickSort(...) noch auf die
            // linke und rechte Liste aufgerufen

            // ***********************
            // *  REKURSIVE AUFRUFE  * 
            // ***********************

            // Zuerst kommt die sortierte (!) linke Liste, dann...
            gebauteListe.concat(quickSort(linkeListe));

            // ...das aktuelle Pivotelement nicht vergessen...
            gebauteListe.append(pivot);

            // ...und die sortierte (!) rechte Liste.
            gebauteListe.concat(quickSort(rechteListe));

            // Die sortierte Liste kann zurueck gegeben werden
            return gebauteListe;
        }
        else {
            // Ist die Liste leer, wird null zurueck gegeben.
            // Dies ist der Rekursionsanker
            return null;
        }

    }
}