public class Tester
{
    private Staedteranking meinRanking;

    public Tester()
    {        
        testeDenQuickSortAlgorithmus();
    }

    private void erzeugeNeueUnsortierteListe(){
        meinRanking = null;

        meinRanking = new Staedteranking();

        Stadt s1 = new Stadt("Ahaus", 39185); 
        Stadt s2 = new Stadt("Bocholt", 71036);
        Stadt s3 = new Stadt("Borken", 42509);
        Stadt s4 = new Stadt("Gescher", 17253);
        Stadt s5 = new Stadt("Gronau", 47671);
        Stadt s6 = new Stadt("Isselburg", 10713);
        Stadt s7 = new Stadt("Rhede", 19165);
        Stadt s8 = new Stadt("Stadtlohn", 20367);
        Stadt s9 = new Stadt("Velen", 12989);
        Stadt s10 = new Stadt("Vreden", 22561);

        meinRanking.neueStadtInsRankingAufnehmen(s1);       
        meinRanking.neueStadtInsRankingAufnehmen(s2);       
        meinRanking.neueStadtInsRankingAufnehmen(s3);      
        meinRanking.neueStadtInsRankingAufnehmen(s4);       
        meinRanking.neueStadtInsRankingAufnehmen(s5); 
        meinRanking.neueStadtInsRankingAufnehmen(s6);       
        meinRanking.neueStadtInsRankingAufnehmen(s7);       
        meinRanking.neueStadtInsRankingAufnehmen(s8);      
        meinRanking.neueStadtInsRankingAufnehmen(s9);       
        meinRanking.neueStadtInsRankingAufnehmen(s10);      
    }

    public void testeDenQuickSortAlgorithmus()
    {
        erzeugeNeueUnsortierteListe();

        meinRanking.listeAusgeben();

        meinRanking.sortiereRankinglisteMitQuickSort();

        meinRanking.listeAusgeben();

        meinRanking = null;
    }
}
