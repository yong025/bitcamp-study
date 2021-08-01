package org.practice.store;

import java.util.Arrays;
import java.util.Optional;

public class StoreService {
   private StoreDTO[] storeDTOS = new StoreDTO[] {
        StoreDTO.builder().name("수정식당").menu("제육쌈밥").lat(122.2).lgt(122.2).score(4.0).build(),
           StoreDTO.builder().name("후니도니").menu("돈까스").lat(53.3).lgt(111.2).score(3.7).build(),
           StoreDTO.builder().name("얌샘김밥").menu("얍삽김밥").lat(37.3).lgt(122.2).score(5.1).build()
    };

 public StoreDTO findByMene(String menuName){

     Optional<StoreDTO> result =
     Arrays.stream(this.storeDTOS).filter(storeDTOS -> storeDTOS.getMenu().indexOf(menuName) >=0).findFirst();
     if(result.isPresent()) {
         return result.get();
     }else {
         return null;
     }
 }
}
