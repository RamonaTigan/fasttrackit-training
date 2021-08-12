package homework_course9;

import homework_course5.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class HumanRepository<T extends Human> {
    List<T> humans = new ArrayList<>();


    //2.1 Add method
    public void add(T humanToAdd) {
        if (humanToAdd == null) {
            throw new ValidationException("Validation failed");
        }
        humans.add(humanToAdd);
    }

    //2.2 Get all method
    public List<T> getAll() {
        return humans.stream().collect(Collectors.toList());
    }

    //2.3 Delete by ID method
    public void deleteById(String id)  {
        if (id == null) {
            throw new EntityNotFoundException("Entity not found");
        }
        List<T> toDelete = humans.stream()
                .filter(human -> human.getUniqueId().equals(id))
                .collect(Collectors.toList());
        toDelete.forEach(deleteMe -> humans.remove(deleteMe));

    }

    //2.4 Update by ID method
    public void updateById(String id, T humanUpdate) {
        if (id == null){
            throw new EntityNotFoundException("Entity not found");
        }
        if (humanUpdate == null) {
            throw new ValidationException("Validation failed");
        }
        humans.stream()
                .filter(human1 -> human1.getUniqueId().equals(id))
                .forEach(human1 -> {
                    human1.setFirstName(humanUpdate.getFirstName());
                    human1.setLastName(humanUpdate.getLastName());
                    human1.setDateOfBirth(humanUpdate.getDateOfBirth());
                });
    }

    //2.5 Get by ID method
    public List<T> getById(String id) {
        if (id == null){
            throw new ValidationException("Validation failed");
        }
        return humans.stream()
                .filter(human2 -> human2.getUniqueId().equals(id))
                .collect(Collectors.toList());

    }


    // 2.6 Get all by name method
    public List<T> getAllByName(String name) {
        if (name == null) {
            throw new ValidationException("Validation failed");
        }
        return humans.stream()
                .filter(human -> human.getLastName().equals(name))
                .collect(Collectors.toList());
    }
}

