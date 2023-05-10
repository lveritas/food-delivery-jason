package fooddeliveryjason.domain;

import fooddeliveryjason.domain.*;
import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String foodId;
    private List<String> options;
    private String address;

    public CookStarted(Cooking aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
