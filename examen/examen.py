def promedioNotasDMP():
  print("******Calculat Promedio final******")
  #Datos de entrada
  nota1=float(input("Ingrese nota 1:"))
  nota2=float(input("Ingrese nota 2:"))
  nota3=float(input("Ingrese nota 3:"))
  #Proceso
  promedioFin=(0.25*nota1)+(0.25*nota2)+(0.50*nota3)
  #Datos de Salida
  print(f"Su promedio final es: {round(promedioFin,2)}")

promedioNotasDMP()