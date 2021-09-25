package com.beetle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "music")
@Data@AllArgsConstructor @NoArgsConstructor
public class Music implements Serializable {
    //private static final long serialVersionUID =1L;
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String label;

}

