package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 菜品订单
 *
 * @author 
 * @email
 */
@TableName("caipin_order")
public class CaipinOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipinOrderEntity() {

	}

	public CaipinOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "caipin_order_uuid_number")

    private String caipinOrderUuidNumber;


    /**
     * 收货地址
     */
    @TableField(value = "address_id")

    private Integer addressId;


    /**
     * 菜品
     */
    @TableField(value = "caipin_id")

    private Integer caipinId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "caipin_order_true_price")

    private Double caipinOrderTruePrice;


    /**
     * 配送员
     */
    @TableField(value = "caipin_order_courier_name")

    private String caipinOrderCourierName;


    /**
     * 联系方式
     */
    @TableField(value = "caipin_order_courier_number")

    private String caipinOrderCourierNumber;


    /**
     * 订单类型
     */
    @TableField(value = "caipin_order_types")

    private Integer caipinOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "caipin_order_payment_types")

    private Integer caipinOrderPaymentTypes;


    /**
     * 订单备注
     */
    @TableField(value = "caipin_order_text")

    private String caipinOrderText;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getCaipinOrderUuidNumber() {
        return caipinOrderUuidNumber;
    }
    /**
	 * 获取：订单号
	 */

    public void setCaipinOrderUuidNumber(String caipinOrderUuidNumber) {
        this.caipinOrderUuidNumber = caipinOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }
    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：菜品
	 */
    public Integer getCaipinId() {
        return caipinId;
    }
    /**
	 * 获取：菜品
	 */

    public void setCaipinId(Integer caipinId) {
        this.caipinId = caipinId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }
    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getCaipinOrderTruePrice() {
        return caipinOrderTruePrice;
    }
    /**
	 * 获取：实付价格
	 */

    public void setCaipinOrderTruePrice(Double caipinOrderTruePrice) {
        this.caipinOrderTruePrice = caipinOrderTruePrice;
    }
    /**
	 * 设置：配送员
	 */
    public String getCaipinOrderCourierName() {
        return caipinOrderCourierName;
    }
    /**
	 * 获取：配送员
	 */

    public void setCaipinOrderCourierName(String caipinOrderCourierName) {
        this.caipinOrderCourierName = caipinOrderCourierName;
    }
    /**
	 * 设置：联系方式
	 */
    public String getCaipinOrderCourierNumber() {
        return caipinOrderCourierNumber;
    }
    /**
	 * 获取：联系方式
	 */

    public void setCaipinOrderCourierNumber(String caipinOrderCourierNumber) {
        this.caipinOrderCourierNumber = caipinOrderCourierNumber;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getCaipinOrderTypes() {
        return caipinOrderTypes;
    }
    /**
	 * 获取：订单类型
	 */

    public void setCaipinOrderTypes(Integer caipinOrderTypes) {
        this.caipinOrderTypes = caipinOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getCaipinOrderPaymentTypes() {
        return caipinOrderPaymentTypes;
    }
    /**
	 * 获取：支付类型
	 */

    public void setCaipinOrderPaymentTypes(Integer caipinOrderPaymentTypes) {
        this.caipinOrderPaymentTypes = caipinOrderPaymentTypes;
    }
    /**
	 * 设置：订单备注
	 */
    public String getCaipinOrderText() {
        return caipinOrderText;
    }
    /**
	 * 获取：订单备注
	 */

    public void setCaipinOrderText(String caipinOrderText) {
        this.caipinOrderText = caipinOrderText;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CaipinOrder{" +
            "id=" + id +
            ", caipinOrderUuidNumber=" + caipinOrderUuidNumber +
            ", addressId=" + addressId +
            ", caipinId=" + caipinId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", caipinOrderTruePrice=" + caipinOrderTruePrice +
            ", caipinOrderCourierName=" + caipinOrderCourierName +
            ", caipinOrderCourierNumber=" + caipinOrderCourierNumber +
            ", caipinOrderTypes=" + caipinOrderTypes +
            ", caipinOrderPaymentTypes=" + caipinOrderPaymentTypes +
            ", caipinOrderText=" + caipinOrderText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
