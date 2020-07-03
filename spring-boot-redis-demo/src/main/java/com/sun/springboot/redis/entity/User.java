package com.sun.springboot.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Caroline SUN
 * @version 1.0.0
 * @description TODO
 * @date 2020-06-30 17:08
 **/
//@Data：使用这个注解，就不用再去手写Getter,Setter,equals,canEqual,hasCode,toString等方法了，注解后在编译时会自动加进去。
//@AllArgsConstructor：使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
//@NoArgsConstructor：使用后创建一个无参构造函数
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable
{
	private static final long serialVersionUID = 2892248514883451461L;
	/**
	 * 主键id
	 */
	private Long id;
	/**
	 * 姓名
	 */
	private String name;

}
