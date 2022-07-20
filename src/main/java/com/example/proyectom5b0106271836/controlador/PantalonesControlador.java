package com.example.proyectom5b0106271836.controlador;

import com.example.proyectom5b0106271836.entidades.Casa;
import com.example.proyectom5b0106271836.entidades.Pantalones;
import com.example.proyectom5b0106271836.entidades.Zapatos;
import com.example.proyectom5b0106271836.servicio.CasaServicio;
import com.example.proyectom5b0106271836.servicio.PantalonesServicio;
import com.example.proyectom5b0106271836.servicio.ZapatosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PantalonesControlador {

    @Autowired
    private PantalonesServicio pantalonesServicio;

    public String verInicio(Model modelo) {

        return "Principal";
    }

    @RequestMapping("/4")
    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave) {

        List<Pantalones> listaPantalones = pantalonesServicio.listAll(palabraClave);
        modelo.addAttribute("listaPantalones", listaPantalones);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index4";
    }

    @RequestMapping("/nuevo4")
    public String mostrarFormularioDeRegistroPantalones(Model model) {
        Pantalones pantalones = new Pantalones();
        model.addAttribute("pantalones", pantalones);
        return "nuevo_pantalones";
    }

    @RequestMapping(value = "/guardar4", method = RequestMethod.POST)
    public String guardarPantalones(@ModelAttribute("pantalones") Pantalones pantalones) {
        pantalones.setTotalP(pantalones.getCosto() * pantalones.getCantidad());
        pantalonesServicio.save(pantalones);
        return "redirect:/4";
    }

    @RequestMapping("/editar4/{id}")
    public ModelAndView mostrarFormularioDeEditarPantalones(@PathVariable(name = "id") Long id) {
        ModelAndView modelo = new ModelAndView("editar_pantalones");
        Pantalones pantalones = pantalonesServicio.get(id);
        modelo.addObject("pantalones", pantalones);
        return modelo;

    }

    @RequestMapping("/eliminar4/{id}")
    public String eliminarPantalones(@PathVariable(name = "id") Long id) {
        pantalonesServicio.delete(id);
        return "redirect:/4";
    }
}
