package cn.com.ssdut.forum.dao;


/**
 * 内部SQL对象
 * SQL表达式或函数作为一个字段，如 SYSDATE()之类;
 * 这样在放置在Map中传给BaseDao的CURD操作时，会自动被当作SQL语句被处理；
 * 注：使用数据库方言会有数据库平台迁移的问题（慎用）
 * 
 */
public class InnerSql {
	
	/**
	 * SQL语句
	 */
	private String sql = "";

	/**
	 * 实例化一个内部SQL对象
	 * @param sql SQL字符串
	 */
	public InnerSql(String sql){
		this.sql = sql;
	}
	
	/**
	 * 获取SQL字符串
	 * @return SQL字符串
	 */
	public String getSql(){
		return sql;
	}
	
}
