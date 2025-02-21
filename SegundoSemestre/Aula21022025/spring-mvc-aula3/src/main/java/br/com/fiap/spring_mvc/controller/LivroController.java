package br.com.fiap.spring_mvc.controller;

import br.com.fiap.spring_mvc.dto.LivroRequest;
import br.com.fiap.spring_mvc.model.Livro;
import br.com.fiap.spring_mvc.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    LivroService livroService;



    @GetMapping("/cadastro")
    public ModelAndView livroCadastro() {
        ModelAndView mv = new ModelAndView("livroCadastro");
        mv.addObject("livroRequest", new LivroRequest());
        return mv;
    }

    @PostMapping("/cadastrar")
    public ModelAndView cadastrarLivro(@Valid @ModelAttribute LivroRequest livroRequest){
        //mapear livroRequest para livro
        Livro livro = livroService.salvarLivro(livroRequest);
        //salvar livro no bd
        //renderizar a página com a lista de livros cadastrados

        return listarLivros();
    }

    @GetMapping
    public ModelAndView listarLivros(){
        return new ModelAndView("LivroLista");
    }
}
