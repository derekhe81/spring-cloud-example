/**
 * 
 */
package services.repository;

import org.springframework.data.repository.CrudRepository;

import services.domain.User;

/**
 * @author hexuan
 *
 */

public interface UserRepository extends CrudRepository<User, Long>{

}
