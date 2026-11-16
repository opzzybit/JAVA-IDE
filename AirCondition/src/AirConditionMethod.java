public class AirConditionMethod {

    private String powerSwitch;
    private int  temperature;


    public void  setInactiveAirCondition(String inactive) {
        powerSwitch = inactive;}

    public void setActiveAirCondition(String powerBotton){
        powerSwitch =  powerBotton;
    }

    public void setDefaultTemperature(int temperature) {
        this.temperature += temperature;
    }

    public void increaseTemperature(int number) {
        temperature +=  number;
    }

    public void decreaseTemperature(int number) {
        temperature -= number;
    }

    public void exceedingMaximumTemperature(int number) {
        int finalValue = 0;
        int increase = temperature + number;
        temperature += finalValue;

        if(increase > temperature) finalValue += temperature;

    }

    public void underRunningMinimumTemperature(int number) {
        int finalValue = 0;
        temperature += finalValue;

        if (number < temperature) finalValue += temperature;

    }

    public int getTemperature(){return temperature;}

    public String getPowerSwitch() {return powerSwitch;}
}
