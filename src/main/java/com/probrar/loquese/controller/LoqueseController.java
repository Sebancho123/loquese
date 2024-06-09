
package com.probrar.loquese.controller;

import com.probrar.loquese.model.Loquese;
import com.probrar.loquese.service.ILoqueseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoqueseController {
    
    @Autowired
    private ILoqueseService IloqSer;
    
    @GetMapping("/loquese/traer")
    public List<Loquese> getAll () {
        return IloqSer.getAll();
    }
    
    @PostMapping("loquese/crear")
    public String crearLoq(@RequestBody Loquese loq) {
        IloqSer.crearLoquese(loq);
        return "se creo correctamente";
    }
    
}
