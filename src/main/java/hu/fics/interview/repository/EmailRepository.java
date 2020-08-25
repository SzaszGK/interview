package hu.fics.interview.repository;

import hu.fics.interview.model.Email;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emails", path = "email")
public interface EmailRepository extends PagingAndSortingRepository<Email, Long> {
}
