package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
/*@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000",
message = "총 상품 가격이 10,000원 이상이어야 합니다.")*/
public class ItemV3 {

    @NotNull(groups = UpdateCheck.class)    // 수정시에만 적용
    private Long id;

    @NotBlank(groups = {SaveCheck.class, UpdateCheck.class})
    private String itemName;

    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    @Range(min = 1000, max = 1000000)
    private Integer price;

    @NotNull(groups = {SaveCheck.class, UpdateCheck.class})
    @Max(value = 9999, groups = SaveCheck.class)    // 등록시에만 적용
    private Integer quantity;

    public ItemV3() {
    }

    public ItemV3(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
