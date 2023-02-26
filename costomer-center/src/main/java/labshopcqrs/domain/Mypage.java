package labshopcqrs.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Mypage_table")
@Data
public class Mypage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long orderid;
        private String productid;
        private String deliveryStatus;
        private String orderStatus;


}
