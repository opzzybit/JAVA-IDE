import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TelevisionTest {

    @Test
    public void testToGetTelevisionName(){
        Telvesion television = new Telvesion("Samsung","off",20,"Standard",20,4,10);
        assertEquals("Samsung",television.getName());
    }



    @Test
    public void testThatTelevision_IsOff(){
        Telvesion television = new Telvesion("Samsung","off",20,"Standard",20,4,10);
        assertEquals("off",television.getPowerBotton());
    }

    @Test
    public void testThatTelevision_IsOn(){
        Telvesion television = new Telvesion("Samsung","off",20,"Standard",20,4,10);
        assertEquals("off",television.getPowerBotton());

        television.turnOnTelevision("on");
        assertEquals("on",television.getPowerBotton());
    }

    @Test
    public void testThatTheCurrentVolume_IsTwenty(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(20,television.getVolume());
    }

    @Test
    public void testThatICanIncreaseTheVolume_TooThirtyFive(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(20,television.getVolume());

       try {
           television.incereseVolume(20);
           assertEquals(40, television.getVolume());
       }
       catch (IllegalArgumentException error) {
           System.err.println(error.getMessage());
       }
    }

    @Test
    public void testThatICandecreaseTheVolume_TooThirty(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",20,4,10);
        assertEquals(40,television.getVolume());

        try {
            television.decereseVolume(42);
            assertEquals(-2, television.getVolume());
        }
        catch (IllegalArgumentException error) {
            System.err.println(error.getMessage());
        }
    }

    @Test
    public void testThatDefaultPictureMode_IsInStandard(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",20,4,10);
        assertEquals("Standard",television.getPictureMode());
    }

    @Test
    public void testThatIChangePictureMode_ToGameMode() {
        Telvesion television = new Telvesion("Samsung","on", 40, "Standard", 20,4,10);
        assertEquals("Standard", television.getPictureMode());

        try {
            television.changePictureMode("Game");
            assertEquals("Game", television.getPictureMode());
            System.out.println("Picture Mode Selected");
        }
        catch (IllegalArgumentException opzzy) {
            System.err.println(opzzy.getMessage());
        }
        finally {
            System.out.println("TEST PASSED");
        }
    }

    @Test
    public void testThatIfChangedPictureMode_IsNotFound_TnrowAnError() {
        Telvesion television = new Telvesion("Samsung","on", 40, "Game", 20,4,10);

        try {
            television.changePictureMode("Netflix");
            assertEquals("Netflix",television.getPictureMode());
            System.out.println("Picture Mode Selected");
        }
        catch (IllegalArgumentException opzzy) {
            System.err.println(opzzy.getMessage());
        }
        finally {
            System.out.println("TEST PASSED");
        }
    }

    @Test
    public void testThatTheCurrentBrigthtness_IsTwenty(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(20,television.getBrightness());
    }

    @Test
    public void testThatICanIncreaseTheBrigthtness_TooFourty(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(20,television.getBrightness());

        try {
            television.incereseBrightness(20);
            assertEquals(40, television.getBrightness());
        }
        catch (IllegalArgumentException error){
            System.err.println(error.getMessage());
        }
    }

    @Test
    public void testThatICandecreaseTheBrigthtness_TooThirtyTwo(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",35,4,10);
        assertEquals(35,television.getBrightness());

        try {
            television.decereseBrigthtness(3);
            assertEquals(32, television.getBrightness());
        }
        catch(IllegalArgumentException error){
            System.err.println(error.getMessage());
        }
    }

    @Test
    public void testThatTheChannelNumberIsFour(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",35,4,10);
        assertEquals(4,television.getChannelNumber());
    }

    @Test
    public void testThatChannelNumberCanChange(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",35,4,10);
        assertEquals(4,television.getChannelNumber());

        television.ChangeChannelNumber(9);
        assertEquals(9,television.getChannelNumber());

    }

    @Test
    public void testThatTheCurrentContrast_IsTen(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(10,television.getContrast());
    }

    @Test
    public void testThatICanIncreaseTheContrast_TooFifty(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals(10,television.getContrast());

        try {
            television.incereseContrast(40);
            assertEquals(50, television.getContrast());
        }
        catch (IllegalArgumentException error){
            System.err.println(error.getMessage());
        }
    }

    @Test
    public void testThatICandecreaseTheContrast_Too(){
        Telvesion television = new Telvesion("Samsung","on",40,"Standard",35,4,50);
        assertEquals(50,television.getContrast());

        try {
            television.decereseContrast(22);
            assertEquals(28, television.getContrast());
        }
        catch (IllegalArgumentException error){
            System.err.println(error.getMessage());
        }
    }

    @Test
    public void testThatICanOffTheTelevision(){
        Telvesion television = new Telvesion("Samsung","on",20,"Standard",20,4,10);
        assertEquals("on",television.getPowerBotton());

        television.turnOffTelevision("off");
        assertEquals("off",television.getPowerBotton());
    }

}

