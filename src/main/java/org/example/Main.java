package com.example;

import com.example.report.Report;
import com.example.report.Temperature;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import javax.annotation.Nonnull;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final String[] cityCodes = {
        "",
        "280010",           // 神戸
        "270000"            // 大阪
    };

    public static void main(String[] args) {
        System.out.println("天気予報表示プログラム");
        System.out.println("天気予報 API（livedoor 天気互換） https://weather.tsukumijima.net/ から天気予報を取得します");
        System.out.println();
        System.out.println("天気を表示したい都市を選択してください");
        System.out.println("1:神戸　2:大阪");
        Scanner scanner = new Scanner(System.in);
        int city;
        try {
            city = scanner.nextInt();
            if ((city < 1) || (city > 2)) {
                System.out.println("1か2を入力してください");
                return;
            }
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
            e.printStackTrace();
            return;
        }

        String urlBase = "https://weather.tsukumijima.net/api/forecast";
        String cityCode = cityCodes[city];
        String url = urlBase + "?city=" + cityCode;

        try {
            var optStr = getHttpBody(url);

            if (optStr.isPresent()) {
                System.out.println("現在の天気を表示します");
                var str = optStr.get().string();

                Report report = getModel(str);
                System.out.println(report.getTitle());
                System.out.println(report.getDescription().getBodyText());
                System.out.println();
                System.out.println();
                System.out.print("今日の天気は");
                System.out.println(report.getForecasts().get(0).getDetail().getWeather());

                Temperature temperature = report.getForecasts().get(0).getTemperature();
                var minTemp = temperature.getMin().getCelsius();
                var maxTemp = temperature.getMax().getCelsius();


                if (!Strings.isNullOrEmpty(maxTemp)) {
                    System.out.print("今日の最高気温は");
                    System.out.println(maxTemp + "℃");
                }
                if (!Strings.isNullOrEmpty(minTemp)) {

                    System.out.println("今日の最低気温は");
                    System.out.println(minTemp + "℃");
                }
                System.out.println();
            } else {
                System.out.println("エラーが発生しました");
            }
        } catch (Exception e) {
            System.out.println("エラーが発生しました");
        }
    }

    public static Optional<ResponseBody> getHttpBody(String url) throws Exception {
        Request request = new Request.Builder().url(url).build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        return Optional.ofNullable(response.body());
    }

    @Nonnull
    public static Report getModel(@Nonnull String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Report.class);
    }
}
