/**
 * File for a Song class to be used in the Playlist Project
 * @author Jerry Fu
 * @version 2/6/24
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private boolean status;
    private int duration;
    private String name;
    private String artist;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song(int duration, String name, String artist) {
        this.status = false;
        this.duration = duration;
        this.name = name;
        this.artist = artist;
    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public boolean getStatus() {
        return status;
    }
    public int getDuration() {
        return duration;
    }
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString() {
        if(status == false) {
            return "\"" + name + "\"" + " by " + artist + " (" + duration + ") ";
        }
        else {
            return "\"" + name + "\"" + " by " + artist + " (" + duration + ") " + " - liked";
        }
    }
}
