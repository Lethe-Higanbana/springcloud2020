package com.summersky.entity;


import java.io.Serializable;

/**
 * <p>
 * 支付表
 * </p>
 *
 * @author zengfanbin
 * @since 2020-04-18
 */
public class Payment implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 支付流水号
     */
    private String serial;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" +
        "id=" + id +
        ", serial=" + serial +
        "}";
    }
}
