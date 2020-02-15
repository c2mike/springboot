package cn.mayun.propertyfile.web;

import cn.mayun.propertyfile.entity.ReadProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class YmlTest {
    @Autowired
    private ReadProp readProp;

    @Value("${name}")
    private String address;

    @RequestMapping("/ymltest")
    public @ResponseBody
    String ymlTest() {
        return readProp.toString() + address;
    }

    @RequestMapping("/freemark")
    public String freemark(Map<String, Object> map) {
        map.put("name", address);
        map.put("address", "china");
        map.put("sex", "boy");
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        map.put("listResult", list);
        return "other";
    }
}
