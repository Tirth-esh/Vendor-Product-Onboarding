package com.LilyPad.ProductOnboarding.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "attributes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String name;

    @Enumerated(EnumType.STRING)
    private AttributeType type;

    private Boolean isRequired;

    @Column(columnDefinition = "json")
    private String options;
}
enum AttributeType {
    TEXT, NUMBER
}
