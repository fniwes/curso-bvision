<g:if test="${alumnos}">
	<ul>
		<g:each var="item" in="${alumnos}">
			<li>
				<a href="${createLink(action: 'edit', id: item.id)}">${item.nombre}</a>
				<a href="${createLink(action: 'editService', id: item.id)}">Editar en Servicio</a>
			</li>
		</g:each>		
	</ul>
</g:if>
<g:else>
	<p>No hay alumnos</p>
</g:else>