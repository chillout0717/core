package hello.core.order;

import hello.core.Order.Order;
import hello.core.Order.OrderSerivce;
import hello.core.Order.OrderServiceImpl;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSerivceImpl;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberSerivceImpl();
    OrderSerivce orderSerivce = new OrderServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderSerivce.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }


}
