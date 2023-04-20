package modelo;

import com.opencsv.bean.CsvBindByPosition;

public class Partidos {
	
	@CsvBindByPosition(position = 0)
	private String Ronda;
	
	@CsvBindByPosition(position = 1)
    private String EquipoA;

    @CsvBindByPosition(position = 2)
    private Integer golesEquipoA;
    
    @CsvBindByPosition(position = 3)
    private String EquipoB;
    
    @CsvBindByPosition(position = 4)
    private Integer golesEquipoB;

    
	public String getRonda() {
		return Ronda;
	}

	public void setRonda(String ronda) {
		Ronda = ronda;
	}

	public String getEquipoA() {
		return EquipoA;
	}

	public void setEquipoA(String equipoA) {
		EquipoA = equipoA;
	}

	public Integer getGolesEquipoA() {
		return golesEquipoA;
	}

	public void setGolesEquipoA(Integer golesEquipoA) {
		this.golesEquipoA = golesEquipoA;
	}

	public String getEquipoB() {
		return EquipoB;
	}

	public void setEquipoB(String equipoB) {
		EquipoB = equipoB;
	}

	public Integer getGolesEquipoB() {
		return golesEquipoB;
	}

	public void setGolesEquipoB(Integer golesEquipoB) {
		this.golesEquipoB = golesEquipoB;
	}

	public char[] length() {
		
		return null;
	}
    
   
    
    

    
}
