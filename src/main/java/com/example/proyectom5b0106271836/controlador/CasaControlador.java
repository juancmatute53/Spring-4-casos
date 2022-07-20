package com.example.proyectom5b0106271836.controlador;

import com.example.proyectom5b0106271836.entidades.Casa;
import com.example.proyectom5b0106271836.servicio.CasaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CasaControlador {

    @Autowired
    private CasaServicio casaServicio;

    @RequestMapping("/")
    public String verInicio(Model modelo) {
        return "Principal";
    }


    @RequestMapping("/2")
    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave) {

        List<Casa> listaCasa = casaServicio.listAll(palabraClave);
        modelo.addAttribute("listaCasa", listaCasa);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index";
    }

    @RequestMapping("/nuevo")
    public String mostrarFormularioDeRegistroCasa(Model model) {
        Casa casa = new Casa();
        model.addAttribute("casa", casa);
        return "nuevo_casa";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarCasa(@ModelAttribute("casa") Casa casa) {
        casa.setTotalP(casa.getArea() * 80);
        casaServicio.save(casa);
        return "redirect:/2";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView mostrarFormularioDeEditarCasa(@PathVariable(name = "id") Long id) {
        ModelAndView modelo = new ModelAndView("editar_casa");
        Casa casa = casaServicio.get(id);
        modelo.addObject("casa", casa);
        return modelo;

    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarCasa(@PathVariable(name = "id") Long id) {
        casaServicio.delete(id);
        return "redirect:/2";
    }
}
