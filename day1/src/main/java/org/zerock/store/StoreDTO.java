package org.zerock.store;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//하위 세개는 무조건 한세트 builder 패턴
@AllArgsConstructor
@Builder
@NoArgsConstructor

public class StoreDTO {

    private String name;
    private double lat,lng;
    private String menu;
    private double score;
}
