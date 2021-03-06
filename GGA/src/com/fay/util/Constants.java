package com.fay.util;
/*2015.3.23*/

import java.util.Map;

import com.fay.rule.BufferOutRule.BufferOutEDD;
import com.fay.rule.BufferOutRule.BufferOutGP1;
import com.fay.rule.BufferOutRule.BufferOutGP2;
import com.fay.rule.BufferOutRule.BufferOutGP3;
import com.fay.rule.BufferOutRule.BufferOutSPT;
import com.fay.rule.BufferOutRule.BufferOutSPTR;
import com.fay.rule.BufferOutRule.BufferOutSRPT;
import com.fay.rule.BufferOutRule.BufferOutWEDD;
import com.fay.rule.BufferOutRule.BufferOutWSPT;
import com.fay.rule.BufferOutRule.BufferOutWT;
import com.fay.rule.BufferOutRule.IBufferOutRule;
import com.fay.rule.JobRule.IJobRule;
import com.fay.rule.JobRule.JobEFT;
import com.fay.rule.JobRule.JobLPT;
import com.fay.rule.JobRule.JobMA;
import com.fay.rule.JobRule.JobFA;
import com.fay.rule.JobRule.JobSPT;
import com.fay.rule.MachineRule.IMachineRule;
import com.fay.rule.MachineRule.MachineEDD;
import com.fay.rule.MachineRule.MachineSPT;
import com.fay.rule.MachineRule.MachineSPTR;
import com.fay.rule.MachineRule.MachineSRPT;
import com.fay.rule.MachineRule.MachineWEDD;
import com.fay.rule.MachineRule.MachineWSPT;
import com.fay.rule.MachineRule.MachineWT;
import com.fay.rule.MachineRule.MachineTIS;
import com.fay.rule.MachineRule.MachineATC;
import com.fay.rule.MachineRule.MachineMS;
import com.fay.rule.MachineRule.MachineCOVERT;
import com.fay.rule.MachineRule.MachineS_RPT;
import com.fay.rule.TimeWindowRule.ITimeWindowRule;
import com.fay.rule.TimeWindowRule.TimeWindow_0;
import com.fay.rule.TimeWindowRule.TimeWindow_20;
import com.fay.rule.TimeWindowRule.TimeWindow_40;


public class Constants {
	
	/*********************GA**********/
	public static String RULESQUENCE_DIR = "NewSeq8/WithoutGP";
	
	
	
    public static final int TOTAL_CASE = 1;//涓轰簡娴嬭瘯淇
    public static final double DUE_FACTOR_DEFAULT = 1;//2;
//    public static final String CMS_SOURCE = "testInstances/cms-Trans/";
    public static final String CMS_SOURCE = "";
    //这里需要加规则,已加
    public static final IMachineRule[] mRules = { new MachineEDD(),	new MachineSPT(),	new MachineSPTR(),
    	new MachineSRPT(),	new MachineWEDD(),	new MachineWSPT(),	new MachineWT(), new MachineATC(),new MachineCOVERT(),
    	new MachineTIS(),new MachineMS(),new MachineS_RPT()
    	 };

    public static final IBufferOutRule[] bRules = { new BufferOutEDD(), new BufferOutSPT(),	new BufferOutSPTR(),
                   	new BufferOutSRPT(), new BufferOutWEDD(), new BufferOutWSPT(), new BufferOutWT(),
    };
    
 //   public static final ITimeWindowRule[] tRules = { new TimeWindow_0(), new TimeWindow_20(),
  //  	new TimeWindow_40()};
    //时间窗改为零
    public static final ITimeWindowRule[] tRules = { new TimeWindow_0()  };
   //job-》M 5个规则 
    public static final IJobRule[] jRules = { new JobEFT(), new JobFA(), new JobMA(),
    	                                        new JobSPT(), new JobLPT()};
    
 //   public static int[][] setupTime; 		// 鐢熶骇鍑嗗鏃堕棿锛屼互宸ヤ欢鏃忎负绱㈠紩
 //   public static int[][] transferTime;		// 杞Щ鏃堕棿鐭╅樀
    /**鏈哄櫒--鍏崇郴**/
    public static Map<Integer, Integer> CellForm;	
    
    
    
    public static final String[] PROBLEM_NAMES = {
    	"j4m17c4", "j8m17c4","j11m21c5",
    	"j20m21c5","j28m21c5","j36m21c5",
        "j40m25c6","j48m25c6","j56m25c6",
        "j64m25c6", "j72m25c6","j80m25c6"
    };

    public static final int TOTAL_PROBLEMS = 20;
    public static final int INSTANCES_PER_PROBLEM = 1;
    public static final int REPLICATIONS_PER_INSTANCE = 1;
    
}
