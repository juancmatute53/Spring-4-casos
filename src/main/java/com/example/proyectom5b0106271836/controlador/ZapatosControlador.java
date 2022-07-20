package com.example.proyectom5b0106271836.controlador;

import com.example.proyectom5b0106271836.entidades.Casa;

import com.example.proyectom5b0106271836.entidades.Zapatos;
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
public class ZapatosControlador {

    @Autowired
    private ZapatosServicio zapatosServicio;

    public String verInicio(Model modelo) {

        return "Principal";
    }

    @RequestMapping("/3")
    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave) {

        List<Zapatos> listaZapatos = zapatosServicio.listAll(palabraClave);
        modelo.addAttribute("listaZapatos", listaZapatos);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index3";
    }

    @RequestMapping("/nuevo3")
    public String mostrarFormularioDeRegistroZapatos(Model model) {
        Zapatos zapatos = new Zapatos();
        model.addAttribute("zapatos", zapatos);
        return "nuevo_zapatos";
    }

    @RequestMapping(value = "/guardar3", method = RequestMethod.POST)
    public String guardarZapatos(@ModelAttribute("zapatos") Zapatos zapatos) {
        zapatos.setTotalP(zapatos.getCosto() * zapatos.getCantidad());
        zapatosServicio.save(zapatos);
        return "redirect:/3";
    }

    @RequestMapping("/editar3/{id}")
    public ModelAndView mostrarFormularioDeEditarZapatos(@PathVariable(name = "id") Long id) {
        ModelAndView modelo = new ModelAndView("editar_zapatos");
        Zapatos zapatos = zapatosServicio.get(id);
        modelo.addObject("zapatos", zapatos);
        return modelo;

    }

    @RequestMapping("/eliminar3/{id}")
    public String eliminarZapatos(@PathVariable(name = "id") Long id) {
        zapatosServicio.delete(id);
        return "redirect:/3";
    }
}
