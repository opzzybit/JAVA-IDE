import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

@Test
public void testThatTheBike_CanBeTurnedOn(){
    BikeMethod  improvedBake = new BikeMethod();
    assertEquals("off",improvedBake.getPowerBotton());

    improvedBake.setTurnOnBotton("on");
    assertEquals("on",improvedBake.getPowerBotton());

}
@Test
public void testThatTheBike_CanBeTurnedOff(){
    BikeMethod  improvedBake = new BikeMethod();
    assertEquals("off",improvedBake.getPowerBotton());

    improvedBake.setTurnOnBotton("on");
    assertEquals("on",improvedBake.getPowerBotton());

    improvedBake.setTurnOffBotton("off");
    assertEquals("off",improvedBake.getPowerBotton());
}
@Test
public void testThatTheBikeGearOne_CanAccelerateByOne(){
    BikeMethod  improvedBake = new BikeMethod();

    improvedBake.setCurrentAcceleration(15);
    assertEquals(15, improvedBake.getAccelerationBotton());

    improvedBake.gearOneAccelearted(1);
    assertEquals(16, improvedBake.getAccelerationBotton());
}
@Test
public void testThatTheBikeGearTwo_CanAccelerateByTwo(){
    BikeMethod  improvedBake = new BikeMethod();

    improvedBake.setCurrentAcceleration(24);
    assertEquals(24, improvedBake.getAccelerationBotton());

    improvedBake.gearTwoAccelearted(2);
    assertEquals(26, improvedBake.getAccelerationBotton());
}
@Test
public void testThatTheBikeGearThree_CanAccelerateByThree(){
    BikeMethod  improvedBake = new BikeMethod();

    improvedBake.setCurrentAcceleration(35);
    assertEquals(35, improvedBake.getAccelerationBotton());

    improvedBake.gearThreeAccelerated(3);
    assertEquals(38, improvedBake.getAccelerationBotton());
}
@Test
public void testThatTheBikeGearFour_CanAccelerateByFour(){
    BikeMethod  improvedBake = new BikeMethod();

    improvedBake.setCurrentAcceleration(44);
    assertEquals(44, improvedBake.getAccelerationBotton());

    improvedBake.gearFourAccelerated(4);
    assertEquals(48, improvedBake.getAccelerationBotton());
}


@Test
public void testThatTheBikeGearOne_CanDeccelerateByOne(){
     BikeMethod  improvedBake = new BikeMethod();

     improvedBake.setCurrentAcceleration(15);
     assertEquals(15, improvedBake.getAccelerationBotton());

     improvedBake.gearOneDecelearted(1);
     assertEquals(14, improvedBake.getAccelerationBotton());
    }
@Test
public void testThatTheBikeGearTwo_CanDeccelerateByTwo(){
     BikeMethod  improvedBake = new BikeMethod();

        improvedBake.setCurrentAcceleration(24);
        assertEquals(24, improvedBake.getAccelerationBotton());

        improvedBake.gearTwoDecelearted(2);
        assertEquals(22, improvedBake.getAccelerationBotton());
    }
    @Test
    public void testThatTheBikeGearThree_CanDeccelerateByThree(){
        BikeMethod  improvedBake = new BikeMethod();

        improvedBake.setCurrentAcceleration(35);
        assertEquals(35, improvedBake.getAccelerationBotton());

        improvedBake.gearThreeDecelerated(3);
        assertEquals(32, improvedBake.getAccelerationBotton());
    }
    @Test
    public void testThatTheBikeGearFour_CanDeccelerateByFour(){
        BikeMethod  improvedBake = new BikeMethod();

        improvedBake.setCurrentAcceleration(44);
        assertEquals(44, improvedBake.getAccelerationBotton());

        improvedBake.gearFourDecelerated(4);
        assertEquals(40, improvedBake.getAccelerationBotton());
    }


}
