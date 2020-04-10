public class Stadt
{
    private String stadtname;
    private int einwohnerzahl;

    public Stadt(String pStadtname, int pEinwohnerzahl)
    {
        stadtname = pStadtname;    
        einwohnerzahl = pEinwohnerzahl;
    }

    public String getStadtname() {
        return stadtname;
    }   

    public int getEinwohnerzahl() {
        return einwohnerzahl;
    }
}
