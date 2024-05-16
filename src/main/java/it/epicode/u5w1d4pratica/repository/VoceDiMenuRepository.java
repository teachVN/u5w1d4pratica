package it.epicode.u5w1d4pratica.repository;

import it.epicode.u5w1d4pratica.bean.Pizza;
import it.epicode.u5w1d4pratica.bean.VoceDiMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoceDiMenuRepository extends JpaRepository<VoceDiMenu, Integer> {

    public List<Pizza> findByPrezzoLessThan(double prezzo);
    @Query("select count(p) from Pizza p")
    public long countPizze();

}
