package com.example.wproj;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.time.LocalDate;


public class Fragment2 extends Fragment {

    View view;
    TextView textView;



    public static int stat1 = 0;

  /*  private String getData(String tag) {
        Connection connection = Jsoup.connect("https://www.gov.pl/web/koronawirus/wykaz-zarazen-koronawirusem-sars-cov-2");
        try {
            Document document = (Document) connection.get();
            nodes = document.getElementsByTagName("infection-stat");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return String.valueOf(nodes);
        }

        public Fragment2() {
        }

   */

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2_layout, container, false);

        LocalDate data;
        data = LocalDate.now();

        textView = (TextView) view.findViewById(R.id.dataJestTo);
        textView.setText("Z dnia: " + String.valueOf(data) + ":  ");

        return view;
    }


}