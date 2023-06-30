package javaProjectWeek01;

class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
  
    public RegistrazioneAudio(String titolo, int volume, int durata, int luminosità) {
        super(titolo, volume, durata, 0);
     
    }


    @Override
    public int getDurata() {
    	return durata;
        
    }

    @Override
    public void play() {for (int i = 0; i < durata; i++) {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitolo()).append(" ");
        for (int j = 0; j < volume; j++) {
            sb.append("!");
        }
        System.out.println(sb.toString());
    }
    }
    
   
}

