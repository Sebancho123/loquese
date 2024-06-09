
package com.probrar.loquese.service;

import com.probrar.loquese.model.Loquese;
import com.probrar.loquese.repository.ILoqueseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoqueseService implements ILoqueseService{
    
    @Autowired
    private ILoqueseRepository iLoqRepo;

    @Override
    public List<Loquese> getAll() {
        
        List<Loquese>listaLoq = iLoqRepo.findAll();
        return listaLoq;
        
    }

    @Override
    public void crearLoquese(Loquese loq) {
        iLoqRepo.save(loq);
    }
    
}
