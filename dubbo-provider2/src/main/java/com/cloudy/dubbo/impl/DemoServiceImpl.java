package com.cloudy.dubbo.impl;

import com.cloudy.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/29.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("provider2 - Permission_%d", id - 1));
        demo.add(String.format("provider2 - Permission_%d", id));
        demo.add(String.format("provider2 - Permission_%d", id + 1));

        return demo;
    }

}
