<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Carro</title>
</head>
<body>

	<h1>Cadastro de Carro</h1>
	<form action="cadastrar" method="post">
		<div>
			<label for="id-placa">Placa</label>
			<input type="text" name="placa" id="id-placa">
		</div>
		<div>
			<label for="id-preco">Preço</label>
			<input type="text" name="preco" id="id-preco">
		</div>
		<div>
			<input type="checkbox" name="automatico" id="id-auto">
			<label for="id-auto">Automático</label>
		</div>
		<div>
			<label for="id-marca">Marca</label>
			<select id="id-marca" name="marca">
				<option>FORD</option>
				<option>FIAT</option>
				<option>Tesla</option>
			</select>
		</div>
		<input type="submit" value="OK">
	</form>

</body>
</html>