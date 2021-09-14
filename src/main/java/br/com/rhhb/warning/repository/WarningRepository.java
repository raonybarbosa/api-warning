package br.com.rhhb.warning.repository;

import br.com.rhhb.warning.entity.Warning;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "warning", path = "warning")
public interface WarningRepository extends PagingAndSortingRepository<Warning, Long> {
}
