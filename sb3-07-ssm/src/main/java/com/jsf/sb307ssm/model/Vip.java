package com.jsf.sb307ssm.model;

import java.io.Serializable;
import lombok.Data;

/**
 * t_vip
 */
@Data
public class Vip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    private static final long serialVersionUID = 1L;
}