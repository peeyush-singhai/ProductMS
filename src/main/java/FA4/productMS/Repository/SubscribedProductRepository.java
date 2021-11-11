package FA4.ProductMS.Repository;

import org.springframework.data.repository.CrudRepository;

import FA4.ProductMS.Entity.SubscribedProductEntity;
import FA4.ProductMS.Utility.CompoundKey;

public interface SubscribedProductRepository extends CrudRepository<SubscribedProductEntity, CompoundKey> {

}
