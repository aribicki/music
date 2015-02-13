public class Music {

  // Class to keep track of music
  // CMP112 Andrew Ribicki Feb 13, 2015

  public  String album;
  public  String artist;
  public  String genre;
  public  String media;
  public  String location;
  public  int copies;
/*--------------------------------------------------------------------------*/
  Music() { 
    album = "No album";
    artist = "No artist";
    genre = "No genre";
    media = "none";
    location = "Nowhere";
    copies = 1;
    }
  
  Music(String thisAlbum, String thisArtist, String thisGenre, String thisMedia)
{
   this();
   album = thisAlbum;
   artist = thisArtist;
   genre = thisGenre;
   media = thisMedia;
   }
 
   public String toString() {
    String output = "";
    output = "Album: " + album + " Artist: " + artist + " Genre: " + genre + " Media " + media + " Location: " + location + " Copies: " + copies;
    return output;
    }
}

 
