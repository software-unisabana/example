package co.edu.unisabana.example.infraestructure.controller;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ConsumeMemoryController {

  private final MemoryConsume memoryConsume;

  @GetMapping(path = "/consume/{memory}")
  public String consumeMemory(@PathVariable int memory) {

    // Consumir 100 MB de memoria RAM
    memoryConsume.consume(memory);
    return "ok";
  }
}
