package cn.com.ssdut.forum.dao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * POJO映射到数据库表的表标记;
 * 与{@link Column}, {@link Pk} 标记用作ORM简单映射使用
 * <pre><code>
 *  &#064;Table("td_user")
 *  public class TestBO {
 *
 *	&#064;Column("user_id")
 *	&#064;Pk(IdGenerationType.ASSIGN)
 *	
 *	private int userId ;
 *	
 *	&#064;Column("user_name")
 *	&#064;Pk
 *	private String userName;
 *	
 *	&#064;Column("real_name")
 *	private String realName;
 *	
 *	&#064;Column
 *	private String password;
 *  ...
 * </code></pre>
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	/**
	 * 表名称
	 * @return 字符串
	 */
	String value();
}
