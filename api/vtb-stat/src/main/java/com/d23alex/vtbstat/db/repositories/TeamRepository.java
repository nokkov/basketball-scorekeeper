package com.d23alex.vtbstat.db.repositories;

import com.d23alex.vtbstat.entities.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}