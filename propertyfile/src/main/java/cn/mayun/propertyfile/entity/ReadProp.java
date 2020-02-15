package cn.mayun.propertyfile.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:application.yml"})
@Component
@ConfigurationProperties(prefix = "env")

public class ReadProp {
    private String url;
    private String name;

    @Override
    public String toString() {
        return "ReadProp{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}
