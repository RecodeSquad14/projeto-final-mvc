package br.com.neuro_conexao.neuro_conexao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;






@Controller()
public class WebController {
  // pagina home
  @GetMapping("/")
  public String home(){
    return "index";
  }

  // pagina de conexao
  @GetMapping("/conexao")
  public String conexao() {
      return "pages/conexao";
  }
  
  // pagina treinamento
  @GetMapping("/treinamentoHtml")
  public String treinamento() {
      return "pages/treinamento";
  }
  
  // pagina sobre nós
  @GetMapping("/sobrenos")
  public String sobrenos() {
      return "pages/sobrenos";
  }

  // login
  @GetMapping("/login")
  public String login() {
      return "pages/login";
  }
 

}
