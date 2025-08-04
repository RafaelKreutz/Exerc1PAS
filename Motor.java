import java.sql.Time;

public class Motor {

    private TipoCombustivel tipoMotor; 
    private int consumo, consumo2; // em quilometros por unidade. Ex: Km/Lt
    private int ultimoConsumo;
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int  consumo, int consumo2) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
        this.consumo2 = consumo2;
    }

    public int getConsumo(TipoTanque tipoTanque) {
        if ((tipoTanque.equals(TipoTanque.FLEX))){
            if(tipoTanque.equals(TipoTanque.GASOLINA)) ultimoConsumo = this.consumo;
            else ultimoConsumo = this.consumo2;
            return ultimoConsumo;
        } else return this.consumo;

    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}