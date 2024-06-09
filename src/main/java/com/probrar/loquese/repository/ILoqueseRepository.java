
package com.probrar.loquese.repository;

import com.probrar.loquese.model.Loquese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoqueseRepository extends JpaRepository<Loquese, Long>{
    
}
