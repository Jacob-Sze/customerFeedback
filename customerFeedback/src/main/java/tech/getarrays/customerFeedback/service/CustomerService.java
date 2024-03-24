package tech.getarrays.customerFeedback.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tech.getarrays.customerFeedback.exceptions.UserNotFoundException;
import tech.getarrays.customerFeedback.model.Customer;
import tech.getarrays.customerFeedback.repo.CustomerRepo;

@Service
@Transactional
public class CustomerService {
    private final CustomerRepo customerRepo;
    
    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    @SuppressWarnings("null")
    public Customer addCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public List<Customer> findAllCustomers(){
        return customerRepo.findAll();
    }

    @SuppressWarnings("null")
    public Customer updateCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer findCustomerById(Long id){
        return customerRepo.findCustomerById(id)
        .orElseThrow(() -> new UserNotFoundException("User is not found by ID"));
    }
    public void deleteCustomer(Long id){
        customerRepo.deleteCustomerById(id);
    }
}
