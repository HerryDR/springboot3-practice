package com.jsf.springboot.model;

import java.io.Serializable;
import lombok.Data;

/**
 * t_vip
 */
@Data
public class TVip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    private static final long serialVersionUID = 1L;
}