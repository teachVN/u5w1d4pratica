package it.epicode.u5w1d4pratica.service;

import it.epicode.u5w1d4pratica.bean.Pizza;
import it.epicode.u5w1d4pratica.bean.VoceDiMenu;
import it.epicode.u5w1d4pratica.repository.VoceDiMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoceDiMenuService {
    @Autowired
    private VoceDiMenuRepository voceDiMenuRepository;

    public void salvaVoceDiMenu(VoceDiMenu voceDiMenu){
        voceDiMenuRepository.save(voceDiMenu);
    }

    public List<Pizza>  getPizzePriceLessThan(double prezzo){
        return voceDiMenuRepository.findByPrezzoLessThan(prezzo);
    }

    public long countPizze(){
        return voceDiMenuRepository.countPizze();
    }

}
