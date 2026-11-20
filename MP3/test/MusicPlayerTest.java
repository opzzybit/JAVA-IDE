import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicPlayerTest {

    @Test
    public void testThatTheMusicPlayer_IsOff(){
        MusicPlayer musicPlayer = new MusicPlayer("off",0,5,"my list");
        assertEquals("off", musicPlayer.getSwicth());
    }

    @Test
    public void testThatTheMusicPlayer_canTurnOn(){
        MusicPlayer musicPlayer = new MusicPlayer("off",0,5,"my list");
        assertEquals("off", musicPlayer.getSwicth());

        musicPlayer.onSwicth("on");assertEquals("on", musicPlayer.getSwicth());
    }

    @Test
    public void testThatTheMusicPlayerContainsExistingMusics(){
        MusicPlayer musicPlayer = new MusicPlayer("off",0,5,"my list");
        assertEquals("my list", musicPlayer.getMusicList());

        try {
            musicPlayer.checkMusicList("Apart");
            assertEquals("Apart", musicPlayer.getMusicList());
        }
        catch (IllegalArgumentException opzzy) {
            System.err.println(opzzy.getMessage());
        }
    }

    @Test
    public void testThatVolumeIsAtTen(){
        MusicPlayer musicPlayer = new MusicPlayer("off",10,4,"my list");
        assertEquals(10, musicPlayer.getVolume());
    }

    @Test
    public void testThatVolumeCanBeIncreased_ToFourty(){
        MusicPlayer musicPlayer = new MusicPlayer("off",10,4,"my list");
        assertEquals(10, musicPlayer.getVolume());

        musicPlayer.increaseVolume(30);
        assertEquals(40, musicPlayer.getVolume());
    }

    @Test
    public void testThatVolumeCanBedecreased_ToTwentyFive(){
        MusicPlayer musicPlayer = new MusicPlayer("off",40,4,"my list");
        assertEquals(40, musicPlayer.getVolume());

        musicPlayer.decreaseVolume(15);
        assertEquals(25, musicPlayer.getVolume());
    }

    @Test
    public void testThatNumberTwoOfMusicListIsApart(){
        MusicPlayer musicPlayer = new MusicPlayer("off",40,4,"my list");
        assertEquals("Calm Down", musicPlayer.getMusicSelection());

        try {
            musicPlayer.setMusicSelection(6);
            assertEquals("Free mind", musicPlayer.getMusicSelection());
        }
        catch(IllegalArgumentException opzzy) {
                System.err.println(opzzy.getMessage());
        }
    }

    @Test
    public void testThatTheMusicPlayer_canTurnOff(){
        MusicPlayer musicPlayer = new MusicPlayer("on",0,5,"my list");
        assertEquals("on", musicPlayer.getSwicth());

        musicPlayer.offSwicth("off");
        assertEquals("off", musicPlayer.getSwicth());
    }






}
