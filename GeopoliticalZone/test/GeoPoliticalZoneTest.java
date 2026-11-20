import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeoPoliticalZoneTest {
    @Test
    public void testThatFctIsInNorthCentral(){
            GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("FCT");
            assertEquals(GeoPoliticalZone.NORTH_CENTRAL, result);
    }

    @Test
    public void testThatEdoIsInSouthSouth(){
        GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("Edo");
        assertEquals(GeoPoliticalZone.SOUTH_SOUTH, result);
    }

    @Test
    public void testThatLagosIsInSouthWest(){
        GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("Lagos");
        assertEquals(GeoPoliticalZone.SOUTH_WEST, result);
    }

    @Test
    public void testThatBornoIsInNORTH_EAST(){
        GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("Borno");
        assertEquals(GeoPoliticalZone.NORTH_EAST,result);
    }

    @Test
    public void testThatAbiaIsInSOUTH_EAST(){
        GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("Abia");
        assertEquals(GeoPoliticalZone.SOUTH_EAST, result);
    }

    @Test
    public void testThatKanoIsInNORTH_WEST(){
        GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone("kano");
        assertEquals(GeoPoliticalZone.NORTH_WEST, result);
    }

    @Test
    public void testThatAnEmptyStringReturnsAnError(){
        try{
            GeoPoliticalZone result = GeoPoliticalZone.getPoliticalZone(" ");
            
        } catch (IllegalArgumentException opzzy) {
            System.err.println(opzzy.getMessage());
        }
    }




}
