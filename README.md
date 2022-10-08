# pp2-exam-weather_report

## 企画書

* 天気予報を取得するコンソールアプリケーションです
* 自分が必要な情報だけを取得するシンプルなアプリを作成しました
* 天気予報は"[天気予報 API（livedoor 天気互換）](https://weather.tsukumijima.net/)
"から取得します

## ビルド手順書

### 使用するソフトウェア

* Java11以上
* gradle 7.5以上
* git 2.3以上

### gitインストール手順

1. 次のサイトにアクセスします [Git for Windows](https://gitforwindows.org/)
1. downloadボタンを押してインストーラをダウンロードします
1. インストーラを起動してインストールします。
1. Adjusting your PATH environmentではUse Git from the Windows Command Promptを選択することを推奨します。
1. Choosing HTTPS transport backendでは Use the OpenSSL libraryを選択します。
1. ほかはデフォルト設定でOKです。


### ビルド手順

以下の手順でビルドとインストール、実行が同時にてきます。

1. コマンドプロンプトまたはハイパーターミナルを開きます
1. 以下のコマンドを実行し、Gitからプロジェクトをダウンロードします`git clone https://github.com/SugaharaManabu/pp2-exam-weather_report-gradle.git`
1. 以下のコマンドで必要なライブラリのダウンロード、ビルドが出来ます。`./gradlew shadowJar` 
1. build/libsフォルダに`pp2-exam-weather_report-gradle-1.0-SNAPSHOT-all.jar`ができればビルド成功です

## インストール手順

1. `build/libs/pp2-exam-weather_report-gradle-1.0-SNAPSHOT-all.jar`を任意のフォルダにコピーします

## 使い方

1.  `java -jar pp2-exam-weather_report-gradle-1.0-SNAPSHOT-all.jar`で起動します。
1. 都市（神戸か大阪）を聞いてくるので、どちらかを指定します
1. 天気予報が表示されます
1. 通信異常、その他の理由で、天気予報が表示されないことがあります。
