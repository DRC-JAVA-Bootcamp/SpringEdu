package com.kodluyoruz.springegitim.besincihafta.Crm;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.io.IOException;

public class CustomerService {


    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://veriphone.p.rapidapi.com/verify?phone=%2B4915123577723")
                .get()
                .addHeader("x-rapidapi-host", "veriphone.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "e7573b8dfamsh06db1ee333752fbp1e2a0ajsn67ca8fb7fe8d")
                .build();

        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
