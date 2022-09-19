
public class Veiculo {

    String Marca;
    String Modelo;
    String Placa;
    String Cor;
    float Km;
    int Velocidade;
    boolean isLigado;
    int litrosCombustivel;

    int capacidadeTanque;
    double Preco;

    public void Acelerar(){
        Velocidade += 20;

    }

    public void Abastecer(){
        litrosCombustivel += 1;
        capacidadeTanque = 60;

    }

    public void Frear(){

        Velocidade -= 20;

    }

    public void Pintar(){

        getCor();

    }
    public void Ligar(){
        isLigado = true;
    }

    public void Desligar(){
        isLigado = false;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public float getKm() {
        return Km;
    }

    public void setKm(float km) {
        Km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public void Velocidade() {
        getVelocidade();

    }
}
