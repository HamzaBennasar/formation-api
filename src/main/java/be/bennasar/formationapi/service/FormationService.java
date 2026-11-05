package be.bennasar.formationapi.service;

import be.bennasar.formationapi.entity.Formation;
import be.bennasar.formationapi.repository.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FormationService {

    private final FormationRepository formationRepository;

    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> findAll() {
        return formationRepository.findAll();
    }

    public Formation findById(Long id) {
        return formationRepository.findById(id).orElseThrow();
    }

    public Formation create(Formation formation) {
        return formationRepository.save(formation);
    }

    public Formation update(Long id, Formation newFormation) {
        Formation existingFormation = findById(id);

        existingFormation.setTitle(newFormation.getTitle());
        existingFormation.setDescription(newFormation.getDescription());
        existingFormation.setLocation(newFormation.getLocation());
        existingFormation.setDate(newFormation.getDate());

        return formationRepository.save(existingFormation);
    }

    public void delete(Long id) {
        Formation formationToDelete = findById(id);
        formationRepository.delete(formationToDelete);
    }
}
