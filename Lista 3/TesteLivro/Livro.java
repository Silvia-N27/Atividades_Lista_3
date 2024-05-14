public class Livro {
    private String autor;
    private String titulo;

    public Livro(String autorUm, String tituloUm){ //construtor
        autor = autorUm;
        titulo = tituloUm;
    }
    public void setAutor(String autorUm){ //modificar o atributo autor
        autor = autorUm;
    }
    public void setTitulo(String tituloUm){ //modificar o atributo titulo
        titulo = tituloUm;
    }
    public String getAutor(){ //exibir o nome do autor
        return autor;
    }
    public String getTitulo(){ //exibir o título
        return titulo;
    }
    public void exibirMensagem(){
        System.out.println("Nome do livro:"+getTitulo()+"\nAutor:"+getAutor());
    }
}