# groovy_sample
- Spring Boot CLIを使用して構築する
  - https://spring.pleiades.io/spring-boot/docs/current/reference/html/cli.html

- Spring Boot CLIとは？
  - https://spring.pleiades.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.installing.cli
```
Spring Boot CLI（コマンドラインインターフェース）は、IDE なしで Spring を使用して迅速にプロトタイプを作成するために使用できるコマンドラインツールです。これにより、Groovy (英語)  スクリプトを実行できます。つまり、定型コードをあまり使用せずに、使い慣れた Java のような構文を使用できます。

Spring Boot を操作するために CLI を使用する必要はありませんが、Eclipse STS や IntelliJ IDEA のような IDE を使用せずに Spring アプリケーションをすぐに使用できるようにする方法です。
```

- Spring Boot CLIのインストール方法は以下参照
https://spring.pleiades.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.installing.cli.manual-installation


‐ Spring Boot CLI メリット
  - さくっと簡単なエンドポイントが作れる！

## 起動方法

```shell
spring run app.groovy
```

起動後、localhost:8080/にアクセス