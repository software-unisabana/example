package co.edu.unisabana.example.infraestructure.controller;


import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PruebaCrashController {

  private ApplicationContext context;

  @GetMapping("/crash")
  public void crash() {
    ((ConfigurableApplicationContext) context).close();
  }
}
