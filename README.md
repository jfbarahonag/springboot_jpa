# Build and start the database
```shell
# Construir imagen
docker-compose build

# Crear contenedor
docker-compose up -d
```

# Set the privileges to the user over the database 
```shell
# Abrir MySql
docker exec -it my-mysql-container mysql -u root -p

# Dar permisos a usuario sobre base de datos
mysql> GRANT ALL PRIVILEGES ON <db>.* TO '<user>';
```