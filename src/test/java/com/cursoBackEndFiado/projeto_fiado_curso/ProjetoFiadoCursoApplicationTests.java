package com.cursoBackEndFiado.projeto_fiado_curso;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.EstabelecimentoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProjetoFiadoCursoApplicationTests {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;
	@Test
	void contextLoads() {
		//criacaoEstabelecimento();

	}
	public void criacaoEstabelecimento() {
		Estabelecimento estabelecimento = new Estabelecimento("Bar do Joao","14981111111","12345678910");

		assertEquals(estabelecimento, estabelecimentoRepository.save(estabelecimento));
	}

}
