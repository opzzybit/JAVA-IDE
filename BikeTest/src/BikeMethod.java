public class BikeMethod {

    private String powerBotton = "off";
    private int  accelerationBotton;

    public void setTurnOffBotton(String powerBotton) {
        this.powerBotton = powerBotton;
    }

    public void setTurnOnBotton(String powerBotton) {
        this.powerBotton = powerBotton;
    }

    public void setCurrentAcceleration(int currentAcceleration) {
        accelerationBotton += currentAcceleration;
    }

  
    public void gearOneAccelearted(int gearNumber) {
        int actual = 0;

        if(gearNumber == 1) {
            accelerationBotton += gearNumber;
        }
        else {
            accelerationBotton += actual;
        }
    }

    public void gearTwoAccelearted(int gearNumber) {
        int actual = 0;

        if(gearNumber == 2) accelerationBotton += gearNumber;

        else accelerationBotton += actual;
    }

    public void gearThreeAccelerated(int gearNumber) {
        int actual = 0;

        if (gearNumber == 3) accelerationBotton += gearNumber;
         else accelerationBotton += actual;
    }

    public void gearFourAccelerated(int gearNumber) {
        int actual = 0;

        if (gearNumber == 4) accelerationBotton += gearNumber;

        else accelerationBotton += actual;
    }






  
    public void gearOneDecelearted(int gearNumber) {
        int actual = 0;

        if(gearNumber == 1) accelerationBotton -= gearNumber;

        else accelerationBotton += actual;
    }

    public void gearTwoDecelearted(int gearNumber) {
        int actual = 0;

        if(gearNumber == 2) accelerationBotton -= gearNumber;

        else accelerationBotton += actual;
    }

    public void gearThreeDecelerated(int gearNumber) {
        int actual = 0;

        if (gearNumber == 3) accelerationBotton -= gearNumber;

        else accelerationBotton += actual;
    }

    public void gearFourDecelerated(int gearNumber) {
        int actual = 0;

        if (gearNumber == 4) accelerationBotton -= gearNumber;

        else accelerationBotton += actual;
    }


    public String getPowerBotton() {return powerBotton;}

    public int getAccelerationBotton() {return accelerationBotton;}
}
