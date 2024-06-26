package cn.daqi.mock.api.entity.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @ 作  者: Qi
 * @ 公众号: 非典型性程序员
 * @ 博 客：https://blog.csdn.net/zyueqi1987
 * @ Describe: 接口分类管理实体类
 */
@Data
public class MockProjectRequest {
    // 项目ID
    private Integer id;

    // 项目名称
    @NotBlank(message = "项目名称不能为空")
    private String name;

    // 项目描述
    private String desc;

    // 项目负责人
    private String owner;

    // 项目属性 public-公开,private-私有
    private String type;

    // 操作人
    private String operator;
}
