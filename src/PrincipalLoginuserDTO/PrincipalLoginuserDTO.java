package PrincipalLoginuserDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.LoginuserDTO;
import com.distribuida.entities.Loginuser;

public class PrincipalLoginuserDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LoginuserDTO loginuserDTO = context.getBean("loginuserDTOImpl",LoginuserDTO.class);
		
		
		List<Loginuser> user = loginuserDTO.findAll();
		
		//Impresion-busquda general
		for(Loginuser item : user){
     		System.out.println(item.toString());
		}
		
		
		//busqueda espesifica por id
		Loginuser luser = loginuserDTO.findOne(3);
		System.out.println(luser.toString());
		
		///add-agregar
		//loginuserDTO.add(0,"usuario2","123445","12345","12345","paleta54@hotchanell.com","usuer123",new Date(),new Date(),31);
		
		//up-modificar
		//loginuserDTO.up(1,"usuario2","1234aDFb","12345abc","12345abc","paleta54@hotchanell.com","usuer123",new Date(),new Date(),31);
		
		//del-eliminar
		//loginuserDTO.del(1);
		context.close();

	}
	}


