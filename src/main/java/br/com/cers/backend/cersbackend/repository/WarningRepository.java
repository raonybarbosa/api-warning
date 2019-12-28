package br.com.cers.backend.cersbackend.repository;

import br.com.cers.backend.cersbackend.entity.Warning;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "warning", path = "warning")
public interface WarningRepository extends PagingAndSortingRepository<Warning, Long> {
}
