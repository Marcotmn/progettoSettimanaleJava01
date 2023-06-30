package javaProjectWeek01;
    

class Video extends ElementoMultimediale implements Riproducibile {
    public Video(String titolo, int volume, int durata, int luminosità) {
        super(titolo, volume, durata, luminosità);
    }

    @Override
    public int getDurata() {
    	return durata;
        
    }
    
    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(getTitolo()).append(" ");
            for (int j = 0; j < getVolume(); j++) {
                sb.append("!");
            }
            for (int j = 0; j < getLuminosità(); j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
    }