# Aceguessr

Paper API を使用する Java プラグインです。現行ソースの入口ではイベントを登録しています。ゲーム機能の完成や本番稼働は別途確認してください。

## 構成と検証

`Aceguessr/` に Maven プロジェクトがあり、定義は [pom.xml](Aceguessr/pom.xml) と [plugin.yml](Aceguessr/src/main/resources/plugin.yml) にあります。Java 21 を使用し、CI は `Aceguessr/` で次を実行します。

```sh
mvn --batch-mode --no-transfer-progress clean verify
```
