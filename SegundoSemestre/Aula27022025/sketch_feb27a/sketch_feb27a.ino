#define BT1 8
#define BT2 9
#define ledR 2
#define ledW 3
#define ledB 4

int contador;




void setup() {
  // habilitar porta de comunicação serial (Baud Rate)
  Serial.begin(9600)
  // configurar pinos de I/O
  pinMode(BT1, INPUT)
  pinMode(BT2, INPUT)
  pinMode(ledR, OUTPUT)
  pinMode(ledW, OUTPUT)
  pinMode(ledB, OUTPUT)

}
/*
BT1:
LOW---> Desligado ----> ledW piscará em intervalos de 500ms
HIGH--> ligado-----> ledR e ledB piscarão alternados em intervalos de 350ms

*/

void loop() {
  // put your main code here, to run repeatedly:
  if(digitalRead(BT1) == HIGH){
    contador++;
    Serial.print("Valor do contador = ");
    Serial.println(contador);
    piscaW();
  }else{
    piscaRB();
  }

}

void piscaW(){
  digitalWrite(ledB, HIGH);
  digitalWrite(ledR, LOW);
  delay(350);
  digitalWrite(ledB, HIGH);
  digitalWrite(ledR, LOW);
  delay(350); 
}

void piscaRB(){
  digitalWrite(ledW, HIGH);
  delay(250);
  digitalWrite(ledW, LOW);
  delay(250);
}




