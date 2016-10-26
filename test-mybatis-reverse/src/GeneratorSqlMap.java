import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class GeneratorSqlMap {
	
	public void generator() throws Exception{
		
		List<String>  warnings=new ArrayList<>();
		boolean overwrite=true;
		//制定逆向工程的配置文件
		File configfile=new File("generatorConfig.xml");
		ConfigurationParser cp=new ConfigurationParser(warnings);
		Configuration cf=cp.parseConfiguration(configfile);
		
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(cf,
				callback, warnings);
		myBatisGenerator.generate(null);
		
		
		
	}

	public static void main(String[] args) throws Exception{
		
		GeneratorSqlMap generatorSqlmap = new GeneratorSqlMap();
		generatorSqlmap.generator();
	}

}
