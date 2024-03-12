package com.mayur.cards.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private Long cardId;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Column(name = "card_type", nullable = false)
    private String cardType;

    @Column(name = "total_limit", nullable = false)
    private int totalLimit;

    @Column(name = "amount_used", nullable = false)
    private int amountUsed;

    @Column(name = "available_amount", nullable = false)
    private int availableAmount;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by", updatable = false)
    private String createdBy = "Mayur_APPS";

    @Column(name = "updated_by")
    private String updatedBy = "MAYUR_APPS";

}
