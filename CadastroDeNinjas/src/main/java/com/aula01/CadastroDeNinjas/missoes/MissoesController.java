package com.aula01.CadastroDeNinjas.missoes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula01.CadastroDeNinjas.controllers.NinjaModel;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
	
    @Autowired
    private MissoesRepository missoesRepository;

    @PostMapping("/criar")
    public ResponseEntity<Missoes> criarMissao(@RequestBody Missoes missao) {
        return ResponseEntity.ok(missoesRepository.save(missao));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Missoes>> listarMissoes() {
        return ResponseEntity.ok(missoesRepository.findAll());
    }

    @PostMapping("/aceitar/{id}")
    public ResponseEntity<String> aceitarMissao(@PathVariable Long id, @RequestBody List<NinjaModel> equipe) {
        Optional<Missoes> missaoOpt = missoesRepository.findById(id);
        if (missaoOpt.isPresent()) {
            Missoes missao = missaoOpt.get();
            if (missao.aceitarMissao(equipe)) {
                missoesRepository.save(missao);
                return ResponseEntity.ok("Missão aceita com sucesso!");
            } else {
                return ResponseEntity.badRequest().body("Equipe não atende aos requisitos da missão.");
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/desistir/{id}")
    public ResponseEntity<String> desistirMissao(@PathVariable Long id) {
        Optional<Missoes> missaoOpt = missoesRepository.findById(id);
        if (missaoOpt.isPresent()) {
            Missoes missao = missaoOpt.get();
            missao.desistirMissao();
            missoesRepository.save(missao);
            return ResponseEntity.ok("Missão cancelada com sucesso.");
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/fracasso/{id}")
    public ResponseEntity<String> registrarFracasso(@PathVariable Long id) {
        Optional<Missoes> missaoOpt = missoesRepository.findById(id);
        if (missaoOpt.isPresent()) {
            Missoes missao = missaoOpt.get();
            missao.registrarFracasso();
            missoesRepository.save(missao);
            return ResponseEntity.ok("Fracasso registrado. A missão foi marcada como não concluída.");
        }
        return ResponseEntity.notFound().build();
    }

}
