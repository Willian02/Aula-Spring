package lopes.willian.demo.Repository;

import lopes.willian.demo.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * author: Willian Lopes da Silva
 * since: 06/05/2020 11:40
 * version:1.0
 */
public interface ClientRepository extends
        CrudRepository<ClientEntity, Long > {
}
