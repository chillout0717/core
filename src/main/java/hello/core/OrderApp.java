package hello.core;

import hello.core.Order.Order;
import hello.core.Order.OrderSerivce;
import hello.core.Order.OrderServiceImpl;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberSerivceImpl;
import hello.core.member.MemberService;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberSerivceImpl();
        OrderSerivce orderSerivce = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderSerivce.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order.toString());
        System.out.println("calculatePrice = " + order.calculatePrice());
    }
}
