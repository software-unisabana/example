package co.edu.unisabana.example.infraestructure.controller;

import co.edu.unisabana.example.infraestructure.orm.UsuarioORM;
import co.edu.unisabana.example.infraestructure.repository.UsuarioRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UsuarioController {

  private UsuarioRepository repository;
  private final MemoryConsume memoryConsume;

  @GetMapping(path = "/usuarios/obtener")
  public List<UsuarioORM> obtenerUsuarios() throws InterruptedException {
    Thread.sleep(200);
    List<UsuarioORM> all = repository.findAll();
    memoryConsume.consume(10);
    return all;
  }

  @GetMapping(path = "/usuario/{id}")
  public UsuarioORM obtenerUsuario(@PathVariable int id) {
    return repository.findById(id).get();
  }

  @PostMapping(path = "/usuario/registrar")
  public String registrarUsuario(@RequestBody UsuarioORM usuarioORM) {
    repository.save(usuarioORM);
    return "guardado";
  }

  @GetMapping(path = "/")
  public String helloWord() {
    return "Hola mundo";
  }
}
