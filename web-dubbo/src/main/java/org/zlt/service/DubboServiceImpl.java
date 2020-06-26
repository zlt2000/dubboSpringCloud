package org.zlt.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author zlt
 * @date 2020/6/26
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@Service(protocol = "dubbo")
public class DubboServiceImpl implements DubboService {
    @Override
    public String test(String param) {
        return "dubbo service: " + param;
    }
}
