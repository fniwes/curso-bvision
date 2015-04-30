# Solicitudes REST como JSON

## Obtener todos los helados en la base de datos como json

curl -X GET -H 'accept:text/json'  'http://localhost:8080/restdemo/icecreams'

Notar que estamos enviando un header "accept: text/json" para que retorne en formato json, de lo contrario lo retornará en el default que puede ser xml o incluso html

## Crear un registro nuevo

curl -X POST -H 'accept:text/json' 'http://localhost:8080/restdemo/icecreams?flavor=Strawberry&colour=red&price=1'

Notar que se cambio el método a POST y se pasan como parámetros en el queryString todos los datos necesarios para crear un helado.

Si este servicio es exitoso, retorna el elemento creado, incluyendo el id que le asignó automáticamente.

## Editar un registro

curl -X PUT -H 'accept:text/json' 'http://localhost:8080/restdemo/icecreams/1?price=2'

Notar que ahora el método es PUT y se agregó a la URL el id del helado que se quiere modificar.

Si el servicio es exitoso, retorna el elemento entero modificado.

## Eliminar un registro

curl -X DELETE -H 'accept:text/json' 'http://localhost:8080/restdemo/icecreams/2'

El método de la petción es DELETE.

No se pasa ningun parámetro por QueryString, únicamente se informa el id del registro a eliminar por medio de la URL.

Si el servicio es exitoso, se retorna un HttpStatusCode de 200


