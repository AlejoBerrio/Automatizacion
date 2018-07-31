Feature: Realizar el registro
	AS usuario
I want realizar un registro en la agencia de viajes
So i pueda ingresar a la web, hacer una búsqueda de próximos vuelos y realizar una reserva

Scenario: Ingresar a web de viajes
	Given que el registro sea exitoso
	When ingrese los datos de usuario y contraseña de forma correcta
	Then se deben visualizar las diferentes opciones