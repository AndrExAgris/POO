package dados;

public class Email {
    
    private int id;
    private String titulo;
    private String conteudo;
    private String remetente;
    private String destinatario;
    private String data;




    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

}
