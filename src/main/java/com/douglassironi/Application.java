package com.douglassironi;
import com.douglassironi.impl.producer.Producer;
import com.douglassironi.impl.SampleMessage;
import com.douglassironi.impl.database.InsertModel;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ApplicationRunner runner(Producer producer) {
		return (args) -> {
			for(int i = 1; i < 20; i++) {
				InsertModel insertModel = new InsertModel("parametros","insert into ");
				producer.send(new SampleMessage(i, insertModel.getComandoSql()));
			}
		};
	}

}