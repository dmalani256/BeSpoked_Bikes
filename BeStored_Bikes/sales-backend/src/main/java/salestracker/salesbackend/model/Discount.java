package salestracker.salesbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int DiscountId;

    @Column(name = "product")
    public String product;

    @Column(name = "begin_date")
    public Date begin_date;

    @Column(name = "end_date")
    public Date end_date;

    @Column(name = "discount_percentage")
    public double discount_percentage;

}
