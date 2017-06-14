package com.kevindai.dubbo;

import com.kevindai.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Component
public class ConsumerService {
   @Autowired
    private MsgService msgService;

    public void showMsg(String string){
        String s = msgService.sendMsg(string);
        System.out.println(string);
    }
}
