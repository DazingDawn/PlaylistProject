import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    ArrayList<Song> playlist;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist() {
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void likeSong(int index) {
        playlist.get(index).setStatus(true);
      }
      public void addSong(Song song) {
        playlist.add(song);
      }
      public void removeSong(int index) {
        playlist.remove(index);
      }
      public void printSong() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i));
        }
      }
      public void likedSong() {
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getStatus() == true) {
                System.out.println(playlist.get(i));
            }
        }
      }
      public int totalDuration() {
        int sum = 0;
        for (int i = 0; i < playlist.size(); i++) {
            sum += playlist.get(i).getDuration();
        }
        return sum;
      }
      public void removeUnliked() {
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).getStatus() == false) {
                playlist.remove(i);
                i--;
            }
        }
      }
}
