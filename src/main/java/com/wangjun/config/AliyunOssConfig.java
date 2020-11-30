package com.wangjun.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author : 王俊
 * @date :  2020/11/28
 */
@Configuration
@ConfigurationProperties(prefix = "aliyun")
@Data
@Accessors(chain = true)
public class AliyunOssConfig {
    private String endPoint;    //地域节点
    private String accessKeyId; //
    private String accessKeySecret;
    private String bucketName;  //bucket名称
    private String fileHost;    //目标文件夹

    @Bean
    public OSS OSSClient(){
        return new OSSClient(endPoint,accessKeyId,accessKeySecret);
    }
}
