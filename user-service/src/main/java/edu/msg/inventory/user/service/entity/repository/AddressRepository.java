package edu.msg.inventory.user.service.entity.repository;

import edu.msg.inventory.user.service.entity.model.AddressEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AddressRepository implements PanacheRepository<AddressEntity> {
}
