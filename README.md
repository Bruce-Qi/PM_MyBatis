# PM_MyBatis
Maven+MyBatis+servlet+EasyUI+Oracle完成的一个员工信息管理系统（初级）

在使用MyBatis+servlet完成的人员信息管理系统中，我使用了一个net.sf.json的类来做json的数据，然后发现这个包只能使用jdk1.5的，
	所以我在pom文件中的依赖没有直接写网上的坐标，而是自己把jar包导入到lib下，然后再添加依赖：
	<dependency>
			<groupId>net.sf.json-lib</groupId>
			<artifactId>json-lib</artifactId>
			<version>2.4</version>
			<scope>system</scope>
			<systemPath>E:\eclipse_works\javaEE\PM_MyBatis\src\main\webapp\WEB-INF\lib\json-lib-2.2.3-jdk15.jar</systemPath>
		</dependency>
	依赖完成之后发现还有报错的，于是把相关的jar包都依赖进来：ezmorph1.0.6、ommons-beanutils1.8.0、commons-lang2.3、commons-collections3.2.2
	然后就可以了。
