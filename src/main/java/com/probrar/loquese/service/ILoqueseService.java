
package com.probrar.loquese.service;

import com.probrar.loquese.model.Loquese;
import java.util.List;


public interface ILoqueseService {
    
    //traertods
    public List<Loquese>getAll();
    
    //crear
    public void crearLoquese(Loquese loq);
    
}
