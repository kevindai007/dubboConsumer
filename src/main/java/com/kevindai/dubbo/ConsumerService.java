package com.kevindai.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kevindai.service.MsgService;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
@Component
public class ConsumerService {
    @Reference(version = "1.0.0")
    private MsgService msgService;

    public void showMsg(String string){
        String s = msgService.sendMsg(string);
        System.out.println(s);
    }
}
