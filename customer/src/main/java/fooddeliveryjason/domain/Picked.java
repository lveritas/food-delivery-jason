package fooddeliveryjason.domain;

import fooddeliveryjason.domain.*;
import fooddeliveryjason.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String foodId;
    private String address;
}
