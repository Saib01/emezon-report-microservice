package com.emazon.report.infrastructure.output.mongodb.entity;

import com.emazon.report.domain.model.Product;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="products")
public class ReportEntity  {
    @Id
    private String id;
    @Indexed
    private String email;
    private List<Product> purchaseInformation;
    private Double total;
    @Indexed
    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private LocalDateTime updateDate;
}
