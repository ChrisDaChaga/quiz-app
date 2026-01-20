import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> usuarios;
    
    public UserService() {
        this.usuarios = new ArrayList<>();
    }
    
    public void criar(User user) {
        usuarios.add(user);
    }
    
    public User buscarPorId(int id) {
        Optional<User> user = usuarios.stream()
                .filter(u -> u.getId() == id)
                .findFirst();
        return user.orElse(null);
    }
    
    public List<User> listarTodos() {
        return new ArrayList<>(usuarios);
    }
    
    public boolean atualizar(User user) {
        User usuarioExistente = buscarPorId(user.getId());
        if (usuarioExistente != null) {
            usuarioExistente.setNome(user.getNome());
            usuarioExistente.setCpf(user.getCpf());
            usuarioExistente.setNascimento(user.getNascimento());
            return true;
        }
        return false;
    }
    
    public boolean deletar(int id) {
        return usuarios.removeIf(u -> u.getId() == id);
    }
    
    public int getTotalUsuarios() {
        return usuarios.size();
    }
}
