package study.hellojpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery{

    @Id
    @GeneratedValue
    @Column( name = "DELIVERY_ID" )
    private long id;

    @OneToOne( mappedBy = "delivery" )
    private Order order;

    @Embedded
    private Address address;

    public Delivery( Address address ){
        this.address = address;
    }

    @Enumerated( EnumType.STRING )
    private DeliveryStatus status;

}
