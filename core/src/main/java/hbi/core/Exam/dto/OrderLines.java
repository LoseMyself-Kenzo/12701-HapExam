package hbi.core.Exam.dto;




import javax.persistence.*;

/**
 * Created by LoseMyself on 2017/1/13.
 */
@Table(name = "hap_om_order_lines")
public class OrderLines {
    @Id
    @Column
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long lineId;
    @Column(name = "header_id")
    private Long headerId;
    @Column(name = "line_number")
    private Long lineNumber;
    @Column(name = "description")
    private String description;
    @Column(name = "inventory_item_id")
    private Long inventoryItemId;
    @Column(name = "company_id")
    private Long companyId;
    @Column(name = "order_quantity_uom")
    private String orderQuantityUom;
    @Column(name = "orderd_quantity")
    private Long orderdQuantity;
    @Column(name = "unit_selling_price")
    private Double unitSellingPrice;

    public Long getLineId() {
        return lineId;
    }

    public OrderLines setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public OrderLines setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
        return this;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public OrderLines setHeaderId(Long headerId) {
        this.headerId = headerId;
        return this;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public OrderLines setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderLines setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public OrderLines setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public OrderLines setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public OrderLines setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
        return this;
    }

    public Double getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public OrderLines setUnitSellingPrice(Double unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
        return this;
    }
}
