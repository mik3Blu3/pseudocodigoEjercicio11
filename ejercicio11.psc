Algoritmo Ruleta_Numeros
	ContadorSegundaDecena <- 0
	contadorPromedio <- 0
	cantidadIteraciones <- 1
	numeroMayor <- 0
	numeroAux <- 0
	Escribir 'Se mostraran en pantalla 10 numeros aleatorios generados entre el rango (0,36)'
	Mientras cantidadIteraciones<=10 Hacer
		alNumero <- Aleatorio(0,36)
		Escribir 'El numero generado fue: ',alNumero
		numeroMod <- alNumero MOD 2
		numeroAux <- alNumero/2
		Si (numeroMod==0) Y (alNumero<>0) Entonces
			promedioAux <- (promedioAux+alNumero)
			contadorPromedio <- (contadorPromedio+1)
		FinSi
		Si (numeroAux<>0) Y (numeroMod<>0) Entonces
			contadorNumerosImpares <- (contadorNumerosImpares+1)
		FinSi
		Si alNumero>=13 Y alNumero<=24 Entonces
			ContadorSegundaDecena <- (ContadorSegundaDecena+1)
		FinSi
		Si alNumero>numeroMayor Entonces
			numeroMayor <- alNumero
		FinSi
		cantidadIteraciones <- (cantidadIteraciones+1)
	FinMientras
	promedioRealPares <- (promedioAux/contadorPromedio)
	Escribir ''
	Escribir 'La cantidad de numeros impares fue: ',contadorNumerosImpares
	Escribir ''
	Escribir 'El promedio de los numeros pares sin contar los ceros fue: ',promedioRealPares
	Escribir ''
	Escribir 'La cantidad de numeros que se encuentran entre la 2 decena (13-24) fue: ',ContadorSegundaDecena
	Escribir ''
	Escribir 'El numero mas grande generado fue: ',numeroMayor
FinAlgoritmo
