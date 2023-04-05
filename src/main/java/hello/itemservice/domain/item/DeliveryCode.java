package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * FAST : 빠른배송
 * NORMAL : 일반 배송
 * SLOW : 느린 배송
 */
@Getter
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;
}
