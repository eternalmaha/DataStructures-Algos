public class compactDisc {
    
    //instance variables
    private String artistName;
    private String albumName;
    private String albumLanguage; 

    public void setArtistName(String artistName){
            this.artistName = artistName; 

    }

    public String getArtistName(){
        return artistName;
    }

    public void setAlbumName(String albumName){
        this.albumName = albumName; 
    }

    public String getAlbumName(){
        return albumName; 
    }

    public void setAlbumLanguage(String albumLanguage){
        this.albumLanguage = albumLanguage; 
    }

    public String getAlbumLanguage(){
        return albumLanguage; 
    }

    public String toString(){
        return "Artist Name: " + artistName + "\n" + "Album Name: " + albumName + "\n" + albumLanguage; 
    }



}

