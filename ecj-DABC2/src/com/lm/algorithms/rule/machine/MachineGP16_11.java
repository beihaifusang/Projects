package com.lm.algorithms.rule.machine;

import com.lm.domain.Entity;
import com.lm.algorithms.rule.GPRuleBase;
/**
 * GP引入的节点
 */
public class MachineGP16_11 extends GPRuleBase implements IMachineRule {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public double calPrio(Entity e) {
    double W= e.getWeight();
    double PT=e.getProcessingTime();
    double AT=e.getArrivalTime();
    double DD=e.getDueDate();
    double RPT=e.getRemainingTime();
    double RT=e.getRelDateTime();
    double OP=e.getOpNumber();
    return 
    Mul(Div(0.856436884448583, W), Sub(Add(Sub(Add(Add(DD, PT), Sub(Div(Add(PT, OP), Mul(Div(Add(DD, PT), Mul(W, Mul(W, W))), Add(Div(Add(Add(PT, OP), Sub(Div(Add(PT, OP), Div(0.856436884448583, W)), Mul(Add(Mul(W, W), OP), Div(RPT, W)))), Mul(Div(Mul(W, W), Sub(RPT, Sub(RPT, 0.856436884448583))), Sub(RPT, 0.856436884448583))), Sub(Div(Add(PT, OP), Mul(Div(Mul(W, W), Div(W, 0.856436884448583)), Sub(RPT, 0.856436884448583))), Mul(Add(PT, OP), Mul(W, Sub(W, PT))))))), Mul(Add(PT, OP), Mul(W, Sub(W, PT))))), Div(Add(DD, PT), Div(W, PT))), Mul(Div(0.856436884448583, W), Sub(Div(Div(RPT, W), Sub(Div(W, PT), Div(RPT, PT))), Mul(Add(PT, Div(Div(Div(0.856436884448583, 0.856436884448583), Mul(Div(Mul(W, W), Div(0.856436884448583, W)), Div(0.856436884448583, W))), Mul(Div(Div(0.856436884448583, W), Sub(RPT, 0.856436884448583)), Sub(RPT, 0.856436884448583)))), Div(RPT, W))))), Mul(Add(PT, OP), Div(RPT, W))))
    		;
    }
}