public class Telvesion {
    private String name;
    private String powerBotton;
    private int volume;
    private String pictureMode;
    private int brightness ;
    private int channelNumber;
    private int contrast;

    public Telvesion(
                 String name,
                 String powerBotton,
                 int volume,
                 String pictureMode,
                 int brightness,
                 int channelNumber,
                 int contrast
    ){

        this.name = name;
        this.powerBotton = powerBotton;
        this.volume = volume;
        this.pictureMode = pictureMode;
        this.brightness = brightness;
        this.channelNumber = channelNumber;
        this.contrast = contrast;
    }

    public void  turnOnTelevision(String powerBotton){
        this.powerBotton = powerBotton;
    }

    public void turnOffTelevision(String powerBotton){
        this.powerBotton = powerBotton;
    }

    public void incereseVolume(int volumeBotton){
        int storedVolume = volume + volumeBotton;


        if (storedVolume > 100) throw new IllegalArgumentException("Volume must be between 0 and 100");

        else volume += volumeBotton;
    }

    public void decereseVolume(int volumeBotton){

        int storedVolume = volume - volumeBotton;

        if (storedVolume < 0) throw new IllegalArgumentException("Volume must be between 0 and 100");

        else volume -= volumeBotton;
    }



    public void changePictureMode(String pictureMode) {
        String[] availablePictureMode = {
                "Standard",
                "Vivid",
                "Cinema",
                "Game",
                "Sports" ,
                "Energy Saving"
        };
        boolean found = false;
        for(int mode = 0; mode < availablePictureMode.length; mode++) {
            if (availablePictureMode[mode].equalsIgnoreCase(pictureMode)) {
                this.pictureMode = pictureMode;
                found = true;
                break;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Picture Mode Not Found");
        }

    }

    public void incereseBrightness(int brightnessBotton){
        int storedBrighhtness = brightness + brightnessBotton;

        if (storedBrighhtness > 100) throw new IllegalArgumentException("Brightness must be between 0 and 100");

        else brightness += brightnessBotton;
    }

    public void decereseBrigthtness(int brightnessBotton){
        int storedBrighhtness = brightness - brightnessBotton;

        if (storedBrighhtness < 0) throw new IllegalArgumentException("Brightness must be between 0 and 100");

        else brightness -= brightnessBotton;
    }

    public void ChangeChannelNumber(int channelNumber){
        this.channelNumber = channelNumber;
    }

    public void incereseContrast(int contrastBotton){
        int storedContrast = contrast + contrastBotton;

        if (storedContrast > 100) throw new IllegalArgumentException("Contrast must be between 0 and 100");

        else contrast += contrastBotton;
    }

    public void decereseContrast(int contrastBotton){
        int storedContrast = contrast - contrastBotton;

        if (storedContrast < 0) throw new IllegalArgumentException("Contrast must be between 0 and 100");

        else contrast -= contrastBotton;
    }




    public String getName() {
        return name;
    }

    public String getPowerBotton(){
        return powerBotton;
    }

    public int getVolume(){
        return volume;
    }

    public String getPictureMode() {
        return pictureMode;
    }

    public int getBrightness() {
        return brightness;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public int getContrast() {
        return contrast;
    }
}




