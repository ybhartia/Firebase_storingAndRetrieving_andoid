package com.example.yashbhartia.pushingdata;

/**
 * Created by yashbhartia on 11/6/17.
 */

public class Artist {

    //////hello there
    String artistID;
    String artistName;
    String artistGenre;

    public Artist(){
    }

    public Artist(String artistGenre, String artistName, String artistID){
        this.artistGenre = artistGenre;
        this.artistID = artistID;
        this.artistName = artistName;
    }

    public String getArtistID() {
        return artistID;
    }

    public void setArtistID(String artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }

    public void setArtistGenre(String artistGenre) {
        this.artistGenre = artistGenre;
    }
}
