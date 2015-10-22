package topcom.presense.server.services;

import topcom.presense.server.dao.*;
import topcom.presense.server.pojo.*;

public class PreSenseWS {

	public void receiveInfoFromSensor(byte[] resource) {

	/* 
			O Sensor envia as informacoes de presenca (no caso, o arquivo json) 
		por meio deste metodo. Portanto, byte[] resource corresponde a esse 
		arquivo (lembrando que deve vir em base64).
			Nesse metodo, implementar a logica do que acontece no servidor quando
		o sensor envia algo. Deve conter chamadas de outros metodos em outras
		classes do servidor.
			Se necessario, da para particionar esse metodo em varios outros.
	*/

	}

	public void consultDatabase() {

	/* 
			Aqui vou fazer as operacoes necessarias relacionadas a manipulacao de dados
		da interface Web.
	*/

	}
}
