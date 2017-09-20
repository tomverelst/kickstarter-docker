package be.ordina.docker;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="quote")
public interface QuoteRepository extends MongoRepository<Quote, String> {


}