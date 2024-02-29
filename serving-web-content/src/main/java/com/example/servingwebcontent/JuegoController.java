package com.example.servingwebcontent;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class JuegoController {
    private AdivinaJuego juego = new AdivinaJuego();

    @GetMapping("/adivina")
    public String mostrarFormulario(Model model) {
        model.addAttribute("premio", juego.getPremio());
        return "adivina-numero";
    }

    @PostMapping("/")
    public String procesarAdivinanza(@RequestParam("numeroUsuario") int numeroUsuario, Model model) {
        boolean acertado = juego.adivinar(numeroUsuario);
        model.addAttribute("premio", juego.getPremio()); // Actualizar el premio en el modelo
        if (acertado) {
            model.addAttribute("mensaje", "¡Has acertado! Ganaste $" + juego.getPremio());
        } else {
            model.addAttribute("mensaje", "Número incorrecto. Inténtalo de nuevo.");
        }
        return "adivina-numero";
    }

    @PostMapping("/reset")
    public String reiniciarJuego() {
        juego.reiniciar();
        return "redirect:/";
    }
}

