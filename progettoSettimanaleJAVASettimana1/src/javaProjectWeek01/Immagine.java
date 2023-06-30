package javaProjectWeek01;

class Immagine extends ElementoMultimediale {
   

    public Immagine(String titolo, int luminosità) {
        super(titolo,0,0, luminosità);
       
    }

    public void show() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitolo()).append(" ");
        for (int i = 0; i < getLuminosità(); i++) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }
}