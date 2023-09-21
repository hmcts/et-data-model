package uk.gov.hmcts.et.common.model.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class Item<T> {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private T value;

    public static <T> Item<T> from(T value) {
        Item<T> typeItem = new Item<>();
        typeItem.id = UUID.randomUUID().toString();
        typeItem.value = value;
        return typeItem;
    }

    public static <T> Item<T> from(String id, T value) {
        Item<T> typeItem = new Item<>();
        typeItem.id = id;
        typeItem.value = value;
        return typeItem;
    }
}
