package betrip.services.betrip_backend_services.betripapp.mapping;

import betrip.services.betrip_backend_services.betripapp.domain.travelers.model.entity.Traveler;
import betrip.services.betrip_backend_services.betripapp.resource.CreateTravelerResource;
import betrip.services.betrip_backend_services.betripapp.resource.TravelerResource;
import betrip.services.betrip_backend_services.betripapp.resource.UpdateTravelerResource;
import betrip.services.betrip_backend_services.betripapp.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class TravelerMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    //Object Mapping
    public TravelerResource toResource(Traveler model){
        return  mapper.map(model,TravelerResource.class);
    }
    public Page<TravelerResource> modelListToPage(List<Traveler> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,TravelerResource.class),pageable, modelList.size());
    }

    public Traveler toModel(CreateTravelerResource resource){
        return mapper.map(resource,Traveler.class);
    }

    public Traveler toModel(UpdateTravelerResource resource){
        return mapper.map(resource,Traveler.class);
    }

}
