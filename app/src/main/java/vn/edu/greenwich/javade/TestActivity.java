package vn.edu.greenwich.javade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView tvUsername = findViewById(R.id.tvUsername_Test);
        TextView tvReporter = findViewById(R.id.tvReporter_Test);
        TextView tvAddress = findViewById(R.id.tvAddress_Test);
        TextView tvBedrooms = findViewById(R.id.tvBedrooms_Test);
        TextView tvPrices = findViewById(R.id.tvPrice_Test);
        TextView tvFurniture = findViewById(R.id.tvFurniture_Test);
        TextView tvNotes = findViewById(R.id.tvPropertytype_Test);


        String username = "";
        String reporter = "";
        String address = "";
        String bedrooms = "";
        String price = "";
        String furniture = "";
        String propertytype = "";


        Intent intent = getIntent();

        // 1st method to receive data.
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            username = bundle.getString("username");
            reporter = bundle.getString("reporter");
            address = bundle.getString("address");
            bedrooms = bundle.getString("bedrooms");
            price = bundle.getString("price");
            furniture = bundle.getString("furniture");
            propertytype = bundle.getString("propertytype");
        }

        // 2nd method to receive data.
        //username = intent.getStringExtra("username");
        //password = intent.getStringExtra("password");

        tvUsername.setText(username);
        tvReporter.setText(reporter);
        tvAddress.setText(address);
        tvBedrooms.setText(bedrooms);
        tvPrices.setText(price);
        tvFurniture.setText(furniture);
        tvNotes.setText(propertytype);
    }
}