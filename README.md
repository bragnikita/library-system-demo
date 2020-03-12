# library-system-demo

KotlinとMicronaut Microservices Frameworkで実装された単純のCRUDウェブアプリケーション。

DBとしてはH2 in-memoryデータベースを使っています。フロントエンドをVueJsとBootstrap4です。

実行の手順；
1) Dockerを使うと
```shell script
./gradlew build
docker build . -t library
docker run --rm -p 8080:8080 library
```
2) tarパッケージからの実行
```shell script
./gradlew build
tar -xf build/distributions/library-0.1.tar
./library-0.1/bin/library
```

3) dist/*.jar
```shell script
java -jar dist/library-0.1-all.jar
```
[http://localhost:8080](http://localhost:8080)をブラウザに開くと管理画面が使えます。

Unitテスト：
```shell script
./gradlew test --tests "*"
```