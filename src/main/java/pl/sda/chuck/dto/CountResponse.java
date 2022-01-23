package pl.sda.chuck.dto;


/**
 *  Example:
 *  {"type": "success" }
 */

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class CountResponse {

    @NonNull
    String type;
    @NonNull
    Integer value;
}




