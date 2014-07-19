/*
 * HelloController.java
 *
 * Creada el 09-jul-2014, 20:48:41
 *
 * Clase Java desarrollada por Alex Montoya para la empresa Develop el día 09-jul-2014
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * amontoya@7i.com.mx
 *
 */
package mx.com.develop.pruebas.layouts.controller;

import java.util.Date;
import mx.com.develop.pruebas.layouts.data.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Alex Montoya
 * @version 1.0
 * @author-mail amontoya@7i.com.mx
 * @creation-date 09-jul-2014
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hola mundo");
        model.addAttribute("now", new Date());
        
        Usuario usuario = new Usuario("Alex", "Montoya", "Mexicano");
        usuario.setId(4);
        
        model.addAttribute("usuario", usuario);
        
        return "hello";
    }
}
