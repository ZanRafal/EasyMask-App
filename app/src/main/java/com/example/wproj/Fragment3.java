package com.example.wproj;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.media.FaceDetector;
import android.os.Bundle;

import com.example.wproj.ui.main.Mask;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.wproj.ui.main.SectionsPagerAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment implements View.OnClickListener {

    public static int time1 = 0, time2 = 0;
    Button addButton, rmvButton;
    ListView mListView;
    View view;
    MaskListAdapter adapter;


    public Fragment3() {
        try {
            Socket socket = new Socket("", 5000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(reader.ready()){
                if(!reader.readLine().equals(" ")) {
                    time1 = Integer.parseInt(reader.readLine());
                }
                else time2 = Integer.parseInt(reader.readLine());
            }
            reader.close();
            socket.close();

        } catch(UnknownHostException e) {

        } catch(IOException e) {

        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment3_layout, container, false);

        mListView = (ListView) view.findViewById(R.id.lystTo);
        ArrayList<FaceMask> itemsList = new ArrayList<>(2);

        itemsList.add(new FaceMask("Maseczka", "Do wymiany"));
        itemsList.add(new FaceMask("Maseczka", "Nieświeża"));

        adapter = new MaskListAdapter(getContext() , R.layout.adapter_view_layout2, itemsList);
        mListView.setAdapter(adapter);

        addButton = (Button) view.findViewById(R.id.addButton);
        addButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemsList.size() < 2) {
                    itemsList.add(new FaceMask("Maseczka", "Świeża"));
                    adapter.notifyDataSetChanged();
                }
                else {
                }
            }
        });

      rmvButton = (Button) view.findViewById(R.id.removeButton);
      rmvButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (itemsList.size() > 0) {
                  adapter.notifyDataSetChanged();
                  itemsList.remove(itemsList.size() - 1);
              } else {}
          }
      });

        return view;


    }

    @Override
    public void onClick(View v) {
    }
}

