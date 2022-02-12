package ProjetoFinal;

public class main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 10, "M", "jubileu10");
        g[1] = new Gafanhoto("Creuza", 10, "M", "creuza10");

        // Jubileu assiste aula 1
        Visualizacao vis = new Visualizacao(g[0], v[0]);
        vis.avaliar();

        //Jubileu assiste aula 2
        Visualizacao vis2 = new Visualizacao(g[0], v[1]);
        vis2.avaliar(87.0f);

        System.out.println(vis.toString());
        System.out.println(vis2.toString());
    }
}
