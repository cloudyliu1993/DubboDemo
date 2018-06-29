package com.cloudy.dubbo.demo;

import java.util.List;

/**
 * Created by Administrator on 2018/6/28.
 */
public interface DemoService {

    List<String> getPermissions(Long id);

}
