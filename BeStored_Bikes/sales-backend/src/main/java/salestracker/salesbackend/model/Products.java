package salestracker.salesbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId")
    public int ProductId;

    @Column(name = "ProductName")
    public String name;

    @Column(name = "ProductManufacturer")
    public String manufacturer;

    @Column(name = "ProductStyle")
    public String style;

    @Column(name = "PurchasePrice")
    public double purchasePrice;

    @Column(name = "SalePrice")
    public double salePrice;

    @Column(name = "Quantity")
    public int quantity;

    @Column(name = "CommissionPercentage")
    public double commissionPercent;
}
