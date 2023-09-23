package com.d23alex.vtbstat.db.repositories.gameevents;

import com.d23alex.vtbstat.entities.gameevents.SubstitutionIn;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface SubstitutionInRepository extends CrudRepository<SubstitutionIn, Long> {
    Set<SubstitutionIn> findAllByGameId(long id);
}
