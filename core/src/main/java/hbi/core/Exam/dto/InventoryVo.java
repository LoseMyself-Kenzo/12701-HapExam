package hbi.core.Exam.dto;

/**
 * Created by LoseMyself on 2017/1/14.
 */
public class InventoryVo {
    private OrderLines orderLines;
    private String itemDescription;
    private String itemUom;
    private String itemCode;
    private Double money;

    public Double getMoney() {
        return money;
    }

    public InventoryVo setMoney(Double money) {
        this.money = money;
        return this;
    }

    public OrderLines getOrderLines() {
        return orderLines;
    }

    public InventoryVo setOrderLines(OrderLines orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public InventoryVo setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public String getItemUom() {
        return itemUom;
    }

    public InventoryVo setItemUom(String itemUom) {
        this.itemUom = itemUom;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public InventoryVo setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
}
