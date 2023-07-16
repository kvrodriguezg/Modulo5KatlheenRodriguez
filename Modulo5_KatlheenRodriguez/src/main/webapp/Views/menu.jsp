<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%--Menú--%>
	<header>	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="Inicio">Menú</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarNavDropdown">
	      <ul class="navbar-nav">
	      <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="Login">Login</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="Inicio">Inicio</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" href="Contacto">Contacto</a>
	        </li>
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Usuarios
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	            <li><a class="dropdown-item" href="Crear_Usuario">Crear Usuario</a></li>
	            <li><a class="dropdown-item" href="Listado_Usuarios">Lista de Usuarios</a></li>
	            <li><a class="dropdown-item" href="ListadoAdmControlador">Lista de Administrativos</a></li>
	            <li><a class="dropdown-item" href="ListadoClientesControlador">Lista de Clientes</a></li>
	            <li><a class="dropdown-item" href="ListadoProfControlador">Lista de Profesionales</a></li>
	          </ul>
	        </li>
	        
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Capacitación
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	            <li><a class="dropdown-item" href="Crear_Capacitacion">Crear Capacitación</a></li>
	            <li><a class="dropdown-item" href="Listar_Capacitaciones">Lista de Capacitaciones</a></li>
	          </ul>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="Logout">Logout</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
</header>