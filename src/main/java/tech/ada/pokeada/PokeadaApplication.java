package tech.ada.pokeada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.ada.pokeada.dto.NovoUsuarioDTO;
import tech.ada.pokeada.service.UsuarioService;

@SpringBootApplication
public class PokeadaApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService servico;

	public static void main(String... args) {
		SpringApplication.run(PokeadaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		NovoUsuarioDTO dto = new NovoUsuarioDTO();
		dto.setPass("12345678");
		dto.setNome("rodolfo");
		dto.setEmail("rodolfo@gmail.com");
		servico.salvar(dto);
	}
}
