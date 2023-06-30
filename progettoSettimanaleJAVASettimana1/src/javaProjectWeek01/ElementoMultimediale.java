package javaProjectWeek01;

abstract class ElementoMultimediale {
    protected String titolo;
    protected int volume;
    protected int durata;
    protected int luminosità;

    public ElementoMultimediale(String titolo, int volume, int durata, int luminosità) {
    	 this.titolo = titolo;
         this.volume = volume;
         this.durata = durata;
         this.luminosità = luminosità;
     }

    public String getTitolo() {
        return titolo;
    }
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public void setLuminosita(int luminosità) {
        this.luminosità = luminosità;
    }
    
    
}