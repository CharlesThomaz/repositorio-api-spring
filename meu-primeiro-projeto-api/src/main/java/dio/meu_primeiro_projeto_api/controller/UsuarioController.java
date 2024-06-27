package dio.meu_primeiro_projeto_api.controller;

import dio.meu_primeiro_projeto_api.model.Usuario;
import dio.meu_primeiro_projeto_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/allUsers")
    public List<Usuario> getUsers(){
        return repository.findAll();

    }
    @GetMapping("/{username}")
    public Usuario GetOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(Integer id){
        repository.deleteById(id);    }

    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }


}
