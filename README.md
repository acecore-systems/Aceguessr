# Aceguessr

Paper API を使用する Java プラグインです。現行ソースの入口ではイベントを登録しています。ゲーム機能の完成や本番稼働は別途確認してください。

## 構成と検証

`Aceguessr/` に Maven プロジェクトがあり、定義は [pom.xml](Aceguessr/pom.xml) と [plugin.yml](Aceguessr/src/main/resources/plugin.yml) にあります。Java 21 を使用し、CI は `Aceguessr/` で次を実行します。

```sh
mvn --batch-mode --no-transfer-progress clean verify
```

## 作業ルールと課題

- 共通の作業方針: [リポジトリの保護・更新・公開方針](https://github.com/acecore-systems/.github/blob/main/REPOSITORY_POLICY.md)。
- 共通の参加方法: [コントリビューションガイド](https://github.com/acecore-systems/.github/blob/main/CONTRIBUTING.md)。
- 未完了の課題・提案: [Issues](https://github.com/acecore-systems/Aceguessr/issues)。
- 進行中の変更: [Pull Requests](https://github.com/acecore-systems/Aceguessr/pulls)。
