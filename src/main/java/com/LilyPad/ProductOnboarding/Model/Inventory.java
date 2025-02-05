package com.LilyPad.ProductOnboarding.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer stockQuantity;

    @Enumerated(EnumType.STRING)
    private StockStatus stockStatus;

    private Integer lowStockAlertThreshold;
}

enum StockStatus {
    IN_STOCK, OUT_OF_STOCK, LOW_STOCK
}
