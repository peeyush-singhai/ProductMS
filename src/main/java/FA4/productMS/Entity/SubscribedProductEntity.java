package FA4.ProductMS.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import FA4.ProductMS.Utility.CompoundKey;

@Entity
@Table(name = "subscribed_product")
public class SubscribedProductEntity {
	
	@EmbeddedId
	private CompoundKey compoundId;
	
	

}
