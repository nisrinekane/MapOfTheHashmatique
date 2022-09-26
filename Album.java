import java.util.HashMap;

public class Album {
     void getTrackList() {
        // set up a hashmap
        HashMap<String, String> trackList = new HashMap<String, String>();
        //add 4 songs
        trackList.put("Supermassive Hash Hole", "Glaciers melting in the dead of night and the superstars sucked into the super hashmap");
        trackList.put("Hashteria", "'Cause I want it now I want it now Give me your keys and your values");
        trackList.put("Hashmaps of Cydonia", "No one's gonna take me alive,Hashes has come to make things right");
        trackList.put("Hashlight", "hashlight,I will be chasing a hashlight,Until the end of my life");

        // pull out one song
        String aSong = trackList.get("Supermassive Hash Hole");

        //map over the track list
        for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}