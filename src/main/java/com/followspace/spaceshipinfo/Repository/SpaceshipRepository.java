package com.followspace.spaceshipinfo.Repository;

import com.followspace.spaceshipinfo.Models.AllInformation;
import com.followspace.spaceshipinfo.Models.Crew;
import org.springframework.data.repository.CrudRepository;

public interface SpaceshipRepository extends CrudRepository<Crew, Integer> {

}
