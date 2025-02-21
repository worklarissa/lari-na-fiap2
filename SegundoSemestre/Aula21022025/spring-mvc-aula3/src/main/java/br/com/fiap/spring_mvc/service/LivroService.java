package br.com.fiap.spring_mvc.service;

import br.com.fiap.spring_mvc.dto.LivroRequest;
import br.com.fiap.spring_mvc.model.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    public Livro salvarLivro(LivroRequest livroRequest){
        Livro livro = requestToLivro(livroRequest);
        return livroRepository.save(livro);

    }



    public Livro requestToLivro(LivroRequest livroRequest){
        Livro livro = new Livro();
        livro.setTitulo(LivroRequest.getTitulo());
        livro.setAutor(LivroRequest.getAutor());
        livro.setCategoria(LivroRequest.getCategoria());
        livro.setPreco(livroRequest.getPreco());
        livro.setIsbn(livroRequest.getIsbn());
        return livro;
    }

}
