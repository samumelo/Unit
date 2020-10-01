<%@page import="java.util.List"%>
<%@page import="m02aula06.basica.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Cliente> lista = (List<Cliente>) request.getAttribute("clientes");
	for(int i=0; i<lista.size(); i++){
		out.println("CPF: " + lista.get(i).getCpf() + "<br/>");
		out.println("NOME: " + lista.get(i).getNome() + "<br/");
		out.println("EMAIL: " + lista.get(i).getEmail() + "<br/>");
		out.println("Data Nascimento: " + lista.get(i).getDataNascimento() + "<br/");
		out.println("Sexo: " + lista.get(i).getSexo() + "<br/");
		out.println("Apelido: " + lista.get(i).getApelido() + "<br/");
		out.println("Nome Social: " + lista.get(i).getNomeSocial() + "<br/");
		out.println("Telefone: " + lista.get(i).getTelefone() + "<br/" + "<br/");
		out.println("<input type=\button\" value=\"Excluir\">" + "<br/" + "<br/");
	}
	%>
	
</body>
</html>