public class MusicPlayer {
    private String swicth;
    private int volume;
    private String musicSelection;
    private String  musicList;

    public MusicPlayer(String powerButton, int volumeButton, int musicSelection, String musicInput){
        swicth = powerButton;
        volume += volumeButton;
        this.musicSelection = "Calm Down";
        musicList = musicInput;
    }

    public void onSwicth(String swicthButton){
        swicth = swicthButton;
    }

    public void offSwicth(String swicthButton){
        swicth = swicthButton;
    }

    public void checkMusicList(String search){

        String[] storage = {
                "The empty world",
                "Apart",
                "Oliver Twist",
                "Calm Down",
                "Fall it",
                "Free mind"
        };
        boolean found = false;
        for(int mode = 0; mode < storage.length; mode++) {
            if (storage[mode].equalsIgnoreCase(search)) {
                musicList = search;
                found = true;
                break;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Music Not Found");
        }

    }

    public void increaseVolume(int volume) {
        this.volume += volume;
    }

    public void decreaseVolume(int volume) {
        this.volume -= volume;
    }

    public void setMusicSelection(int selectionInput) {
        String[] storage = {
                "The empty world",
                "Apart",
                "Oliver Twist",
                "Calm Down",
                "Fall it",
                "Free mind"
        };

        if (selectionInput > 0 && selectionInput <= storage.length) {
            this.musicSelection = storage[selectionInput - 1];
        }
        else{
            throw new IllegalArgumentException("Option Not Found");
        }
    }

    public String getSwicth() {
        return swicth;
    }

    public String getMusicList() {
        return musicList;
    }

    public int getVolume() {
        return volume;
    }

    public String getMusicSelection() {
        return musicSelection;
    }
}
