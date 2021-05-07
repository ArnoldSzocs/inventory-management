package edu.msg.inventory.user.service.boundary;

import edu.msg.inventory.user.service.control.model.Address;
import edu.msg.inventory.user.service.control.service.AddressService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/address")
public class AddressResource {

    @Inject
    private AddressService addressService;

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Address createAddress(Address address){
       return addressService.createAddress(address);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
}
