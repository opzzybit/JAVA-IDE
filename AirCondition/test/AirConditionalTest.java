import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionalTest {

@Test
public void testThatTheAirCondition_IsOff() {
    AirConditionMethod inActiveAirCondition = new AirConditionMethod();

    inActiveAirCondition.setInactiveAirCondition("off");

    assertEquals("off", inActiveAirCondition.getPowerSwitch());
}

@Test
public void testThatTheAirCondition_IsTurnOn(){
    AirConditionMethod  activeAirCondition = new AirConditionMethod();

    activeAirCondition.setInactiveAirCondition("off");
    assertEquals("off",activeAirCondition.getPowerSwitch());

    activeAirCondition.setActiveAirCondition("on");
    assertEquals("on",activeAirCondition.getPowerSwitch());
}
@Test
public void testTheAirConditional_IsAtDefaultTemperature(){
    AirConditionMethod  temperatureCondition = new AirConditionMethod();

    temperatureCondition.setDefaultTemperature(24);
    assertEquals(24,temperatureCondition.getTemperature());
}
@Test
public void testThatTheTemperature_IsIncreases(){
    AirConditionMethod  temperatureCondition = new AirConditionMethod();

    temperatureCondition.setDefaultTemperature(24);
    assertEquals(24,temperatureCondition.getTemperature());

    temperatureCondition.increaseTemperature(3);
    assertEquals(27,temperatureCondition.getTemperature());
}
@Test
public void testThatTheTemperature_Isdecreases(){
    AirConditionMethod  temperatureCondition = new AirConditionMethod();

    temperatureCondition.setDefaultTemperature(27);
    assertEquals(27,temperatureCondition.getTemperature());

    temperatureCondition.decreaseTemperature(11);
    assertEquals(16,temperatureCondition.getTemperature());
}
@Test
public void  testThatTheIncrement_DoesNotExceedThirty(){
    AirConditionMethod  temperatureCondition = new AirConditionMethod();

    temperatureCondition.setDefaultTemperature(30);
    assertEquals(30,temperatureCondition.getTemperature());

    temperatureCondition.exceedingMaximumTemperature(2);
    assertEquals(30,temperatureCondition.getTemperature());
}
@Test
public void testThatThedecrement_DoesNotGoBelowSixteen(){
AirConditionMethod  temperatureCondition = new AirConditionMethod();

temperatureCondition.setDefaultTemperature(16);
assertEquals(16,temperatureCondition.getTemperature());

temperatureCondition.underRunningMinimumTemperature(9);
assertEquals(16,temperatureCondition.getTemperature());
    }



}
