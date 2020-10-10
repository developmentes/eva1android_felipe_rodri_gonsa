package com.inacap.felipe_gonsa_rodri;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import adapter.HarryAdapter;
import model.HarryPotter;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {


    public static final String URL = "http://hp-api.herokuapp.com/api/characters";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        processHttp();

    }
// metodo para utilizar el protocolo http
    public void processHttp() {
        AsyncHttpClient client = new AsyncHttpClient();

        client.get(URL, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

               try {
                   String res = new String(responseBody);
                   Log.d("INFO", res);


                   processJson(res);



               } catch (JSONException e) {
                   e.printStackTrace();
               }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }


    public void processJson (String res) throws JSONException {

//            JSONObject root = new JSONObject(res); //se comenta porque la api se compone de un array en su totalidad
            JSONArray harry = new JSONArray(res);


            List<HarryPotter> lista = new ArrayList<HarryPotter>();

            for (int i = 0; i <= harry.length(); i++) {

                JSONObject harryObj  = harry.getJSONObject(i);


                String name = harryObj.getString("name");
                String species = harryObj.getString("species");
                String gender = harryObj.getString("gender");
                String house = harryObj.getString("house");
                String dateOfBirth = harryObj.getString("dateOfBirth");
                int yearOfBirth = harryObj.getInt("yearOfBirth");
                String image = harryObj.getString("image");
                JSONObject wand = harryObj.getJSONObject("wand");

                String wood = wand.getString("wood");
                String core = wand.getString("core");
//creamos un objeto de la clase HarryPotter
                HarryPotter harryPotter = new HarryPotter(name, species, gender, house, dateOfBirth, yearOfBirth, wood, core, image);
                Log.d("INFO", harryPotter.getCore() + " " + harryPotter.getDateOfBird() + " " + harryPotter.getGender() + " " + harryPotter.getHouse() + " " +
                        harryPotter.getName() + " " + harryPotter.getSpecies() + " " + harryPotter.getYearOfBirth() + " " + harryPotter.getWood() + " " + harryPotter.getImage());
                lista.add(harryPotter);
            }


        RecyclerView rc = findViewById(R.id.rc_harry);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(RecyclerView.VERTICAL);

        HarryAdapter adapter = new HarryAdapter(this, lista, R.layout.harry_main2);

        rc.setLayoutManager(lm);
        rc.setAdapter(adapter);
    }




    public void entrar(View view) {
    }

    public void acercade(View view) {
    }
}