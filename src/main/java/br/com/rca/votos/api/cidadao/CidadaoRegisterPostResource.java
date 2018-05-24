package br.com.rca.votos.api.cidadao;

import br.com.rca.votos.application.cidadao.CidadaoNovo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CidadaoRegisterPostResource {

    @Autowired
    private CidadaoNovo cidadaoNovo;

    @PostMapping("/api/cidadao")
    public void novo(@Valid @RequestBody CidadaoRegisterPostParam cidadaoRegisterPostParam) {
        cidadaoNovo.novo(
            cidadaoRegisterPostParam.getCpf(),
            cidadaoRegisterPostParam.getPassword()
        );
    }
}