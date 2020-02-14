package br.com.rbsj.security.oauth.api.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosResource {
	
	@GetMapping
	public List<String> list(){
		List<String> usuarios = Arrays.asList("ruijunior", "liliansilva", "mpmt", "bep");
		return usuarios;
	}

}
