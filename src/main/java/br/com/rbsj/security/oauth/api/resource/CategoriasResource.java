package br.com.rbsj.security.oauth.api.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriasResource {

	@GetMapping
	public List<String> list(){
		List<String> categorias = Arrays.asList("Informática", "Celulares", "Eletro");
		return categorias;
	}
}
