package fooddeliveryjason.domain;

import fooddeliveryjason.RiderApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String status;

    private String orderId;

    private String foodId;

    private String address;

    @PostPersist
    public void onPostPersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    public void pick() {
        Picked picked = new Picked(this);
        picked.publishAfterCommit();
    }

    public void confirm() {
        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();
    }

    public static void addPickList(CookFinished cookFinished) {
        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookFinished.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

    }
}
