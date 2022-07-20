package com.example.proyectom5b0106271836.controlador;

import com.example.proyectom5b0106271836.entidades.Equipos;
import com.example.proyectom5b0106271836.entidades.Pantalones;
import com.example.proyectom5b0106271836.servicio.EquiposServicio;
import com.example.proyectom5b0106271836.servicio.PantalonesServicio;
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
public class EquiposControlador {

    @Autowired
    private EquiposServicio equiposServicio;

    public String verInicio(Model modelo) {

        return "Principal";
    }

    @RequestMapping("/5")
    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave) {

        List<Equipos> listaEquipos = equiposServicio.listAll(palabraClave);
        modelo.addAttribute("listaEquipos", listaEquipos);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index5";
    }

    @RequestMapping("/nuevo5")
    public String mostrarFormularioDeRegistroEquipos(Model model) {
        Equipos equipos = new Equipos();
        model.addAttribute("equipos", equipos);
        return "nuevo_equipos";
    }

    @RequestMapping(value = "/guardar5", method = RequestMethod.POST)
    public String guardarEquipos(@ModelAttribute("equipos") Equipos equipos) {
        equiposServicio.save(equipos);
        return "redirect:/5";
    }

    @RequestMapping("/editar5/{id}")
    public ModelAndView mostrarFormularioDeEditarEquipos(@PathVariable(name = "id") Long id) {
        ModelAndView modelo = new ModelAndView("editar_equipos");
        Equipos equipos = equiposServicio.get(id);
        modelo.addObject("equipos", equipos);
        return modelo;

    }

    @RequestMapping("/eliminar5/{id}")
    public String eliminarEquipos(@PathVariable(name = "id") Long id) {
        equiposServicio.delete(id);
        return "redirect:/5";
    }
}
