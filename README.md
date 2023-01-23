```
docker run --rm --name postgres-liquibase-demo -p 5432:5432 -d -ePOSTGRES_USER=localuser -e POSTGRES_PASSWORD=localpass -e POSTGRES_DB=localdb postgres:14.5
```