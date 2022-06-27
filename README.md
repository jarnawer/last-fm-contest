## Build Docker container

```
docker build -t last-fm-contest:dev .
```


## Run docker container 

```
docker run -e SPARK_LOCAL_IP=127.0.0.1 last-fm-contest:dev driver --class org.example.App local:///opt/spark/work-dir/last-fm-contest-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## TODO
### Generate output files into a shared volume
