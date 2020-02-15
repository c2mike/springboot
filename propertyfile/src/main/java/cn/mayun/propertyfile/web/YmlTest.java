package cn.mayun.propertyfile.web;

import cn.mayun.propertyfile.entity.ReadProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YmlTest {
    @Autowired
    private ReadProp readProp;

    @Value("${name}")
    private String address;
    @RequestMapping("/ymltest")
    public @ResponseBody
    String ymlTest()
    {
        return readProp.toString()+address;
    }
}
