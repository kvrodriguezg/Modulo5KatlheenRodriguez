<%@ page import="modelo.Administrativo"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Administrativos.</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	</head>
	<body class="p-3 mb-2 bg-secondary text-white">
		
		<%--Incluimos el menú.--%>
		<%@ include file='menu.jsp'%>
		
		
		<h1 align="center">Lista de Administrativos.</h1>
		
		<table class="table">
				<thead class="table-dark">
					<tr>
						<th>ID</th>
						<th>Nombre</th>
						<th>RUN</th>
						<th>Tipo</th>
						<th>Fecha de nacimiento</th>
						<th>Área</th>
						<th>Experiencia Previa</th>
					</tr>			
				</thead>
				<tbody>
					<%--Enviamos datos a la lista de usuarios y los mostramos.--%>
					<%
					ArrayList<Administrativo> adm = (ArrayList<Administrativo>)request.getAttribute("adm");
					for(Administrativo us : adm){
						%>
							<tr>
								<td><%= us.getId_us()%></td>
								<td><%= us.getNombre()%></td>
								<td><%= us.getRun()%></td>
								<td><%= us.getTipo()%></td>
								<td><%= us.getFecha_nac()%></td>
								<td><%= us.getArea()%></td>
								<td><%= us.getExp_previa()%></td>									
							</tr>
						<%
					}
					%>			
				</tbody>		
			</table>
			
			<%--Solicitamos datos para editar mediante action del form.--%>
			<h2 align="center">Editar Administrativo</h2>
			
			<div class="container-fluid" align="center">
		    <div class="row">
		        <div class="col-md-12">
		            <div class="well well-sm">
		                <form action="EditarAdmControlador" method="post" class="form-horizontal" >
		                    <fieldset>
		                        <legend class="text-center header">Ingrese los datos del usuario a editar:</legend>

		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="id" type="number" placeholder="ID" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="nombre" type="text" placeholder="Nombre" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="run" type="number" placeholder="RUN" class="form-control">
		                            </div>
		                        </div>
		                        
		                        <br>
		                        <div class="form-group">
		                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
		                            <div class="col-md-8">
		                                <input name="fecha_nac" type="text" placeholder="Fecha de Nacimiento" class="form-control">
		                            </div>
		                        </div>
								
									<br>
									<div id="campos_admin">
										<div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="area" type="text" placeholder="Área" class="form-control">
				                            </div>
				                        </div>
				                        <br>
				                        <div class="form-group">
				                            <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
				                            <div class="col-md-8">
				                                <input  name="exp" type="text" placeholder="Experiencia Previa." class="form-control">
				                            </div>
				                        </div>
				                        <br>
									</div>
	
		                        <div class="form-group">
		                            <div class="col-md-12 text-center">
		                                <button type="submit" class="btn btn-primary btn-lg">Enviar</button>
		                            </div>
		                        </div>
		                    </fieldset>
		                </form>
		            </div>
		        </div>
		    </div>
		</div>
			
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script> 
	</body>
</html>