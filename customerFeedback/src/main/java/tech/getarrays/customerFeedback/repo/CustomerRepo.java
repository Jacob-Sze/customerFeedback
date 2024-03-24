package tech.getarrays.customerFeedback.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.getarrays.customerFeedback.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

    void deleteCustomerById(Long id);

    Optional<Customer> findCustomerById(Long id);
    
}