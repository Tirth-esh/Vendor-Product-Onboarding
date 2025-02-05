package com.LilyPad.ProductOnboarding.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "media")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private String fileName;

    @Column(columnDefinition = "TEXT")
    private String filePath;

    @Enumerated(EnumType.STRING)
    private MediaType fileType;

    private Integer fileSize;

    @Column(nullable = false, updatable = false)
    private java.sql.Timestamp uploadDate;
}

enum MediaType {
    IMAGE, VIDEO, DOCUMENT
}
