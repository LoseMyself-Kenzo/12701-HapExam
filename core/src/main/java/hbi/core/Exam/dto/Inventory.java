package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;
import org.springframework.ldap.odm.annotations.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * Created by LoseMyself on 2017/1/11.
 */
@Table(name = "hap_inv_inventory_items")
public class Inventory extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long inventoryItemId;
    @Column(name = "item_code")
    @Condition(operator = LIKE)
    private String itemCode;
    @Column(name = "item_uom")
    @Condition(operator = LIKE)
    private String itemUom;
    @Column(name = "item_description")
    @Condition(operator = LIKE)
    private String itemDescription;
    @Column(name = "order_flag")
    private String orderFlag;

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public Inventory setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Inventory setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getItemUom() {
        return itemUom;
    }

    public Inventory setItemUom(String itemUom) {
        this.itemUom = itemUom;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public Inventory setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public Inventory setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
        return this;
    }
}
