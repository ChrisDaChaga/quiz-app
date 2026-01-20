import java.util.Date;

public class UserIplm extends User {
    
    public UserIplm() {
        super();
    }
    
    public UserIplm(int id, String nome, int cpf, Date nascimento) {
        super(id, nome, cpf, nascimento);
    }
    
    @Override
    public String toString() {
        return "UserIplm{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf=" + getCpf() +
                ", nascimento=" + getNascimento() +
                '}';
    }
}
