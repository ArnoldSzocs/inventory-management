package edu.msg.inventory.user.service.control.service;

import edu.msg.inventory.user.service.control.model.Address;
import edu.msg.inventory.user.service.entity.model.AddressEntity;
import edu.msg.inventory.user.service.entity.repository.AddressRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AddressService {

    @Inject
    private AddressRepository addressRepository;

    public AddressEntity mapToAddressEntity(Address address){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setPostalCode(address.getPostalCode());
        addressEntity.setCountry(address.getCountry());
        addressEntity.setCity(address.getCity());
        addressEntity.setAddressLine1(address.getAddressLine1());
        addressEntity.setAddressLine2(address.getAddressLine2());
        return addressEntity;
    }

    public Address mapToAddress(AddressEntity addressEntity){
        Address address = new Address();
        address.setId(addressEntity.getId());
        address.setCity(addressEntity.getCity());
        address.setCountry(addressEntity.getCountry());
        address.setPostalCode(addressEntity.getPostalCode());
        address.setAddressLine1(addressEntity.getAddressLine1());
        address.setAddressLine2(addressEntity.getAddressLine2());
        return address;
    }

    public Address createAddress(Address address){
        AddressEntity addressEntity = mapToAddressEntity(address);
        addressRepository.persist(addressEntity);
        return address;
    }

    public List<Address> getAllAddress(){
        return addressRepository.findAll()
                .stream()
                .map(this::mapToAddress)
                .collect(Collectors.toList());
    }
}
