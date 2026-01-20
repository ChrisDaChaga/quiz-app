import java.util.Date;

public class User {
    private int id;
    private String nome;
    private int cpf;
    private Date nascimento;
    
    public User() {
    }
    
    public User(int id, String nome, int cpf, Date nascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCpf() {
        return cpf;
    }
    
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    public Date getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
