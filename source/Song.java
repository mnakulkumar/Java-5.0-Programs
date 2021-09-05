class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong){
        Song s =(Song) aSong;
        return getTitle().equals(s.getTitle()); //String class's overrided equals method will work here
    }

    public int hashCode(){
        return title.hashCode(); //String class's overrided hashcode method will work here
    }

    public int compareTo(Song s){
        return title.compareTo(s.getTitle()); //String class's compareTo method will work here
    }

    Song(String t,String a,String r, String b){
        title = t;
        artist = a;
        rating= r;
        bpm= b;        
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getRating(){
        return rating;
    }

    public String getBpm(){
        return bpm;

    }

    public String toString(){
        //return title+":"+artist; //For Jukebox5
        return title; //for Jukebox6
    }

    
}

