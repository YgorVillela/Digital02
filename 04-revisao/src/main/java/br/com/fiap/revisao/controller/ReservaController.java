package br.com.fiap.revisao.controller;

import br.com.fiap.revisao.model.Quarto;
import br.com.fiap.revisao.model.Reserva;
import br.com.fiap.revisao.repository.QuartoRepository;
import br.com.fiap.revisao.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private QuartoRepository quartoRepository;

   /* @GetMapping("reservar/{id}")
    public String reservar(@PathVariable("id") int codigoQuarto, Reserva reserva, Model model) {
        Quarto quarto = quartoRepository.findById(codigoQuarto).get();
        reserva.setQuarto(quarto);
        return "reserva/form";
    }*/

    @PostMapping("cadastrar")
    public String cadastrar(Reserva reserva, RedirectAttributes redirect) {
        reservaRepository.save(reserva);
        redirect.addFlashAttribute("msg", "Reservado!");
        return "redirect:/reserva/cadastrar";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Reserva reserva){
        return "reserva/form";
    }
}

