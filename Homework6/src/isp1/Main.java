package Homework6.src.isp1;

import Homework6.src.isp1.pay.impl.InternetPaymentService;
import Homework6.src.isp1.pay.impl.TerminalPaymentService;

public class Main {
        public static void main(String[] args) {
        InternetPaymentService internetService = new InternetPaymentService();
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);
        internetService.payWebMoney(10);

        TerminalPaymentService terminalService = new TerminalPaymentService();
        terminalService.payWebMoney(10);
        terminalService.payCreditCard(10);
    }    
}
