package co.edu.unisabana.example.infraestructure.repository;

import co.edu.unisabana.example.infraestructure.orm.UsuarioORM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioORM, Integer> {

}
