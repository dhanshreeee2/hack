package com.example.contactlist;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.contactlist.R;

public class DetailsContact extends AppCompatActivity {
    DbAdapter db;
    String id,name,number,email,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_contact);

        Intent intent = getIntent();
        id = intent.getStringExtra("ID");
        name = intent.getStringExtra("RAW MATERIALS");
        number = intent.getStringExtra("QUANTITY REQUIRED");
        email = intent.getStringExtra("OUTPUT PRODUCT");
        address = intent.getStringExtra("DESCRIPTION");
        ((TextView) findViewById(R.id.name)).setText(name);
        ((TextView) findViewById(R.id.number)).setText(number);
        ((TextView) findViewById(R.id.email)).setText(email);
        ((TextView) findViewById(R.id.address)).setText(address);
        //calling DbAdapter
        db = new DbAdapter(this);
        db.open();
    }
    public void Edit(View v){
        //go to EditContact page
        Intent edit = new Intent(DetailsContact.this, EditContact.class);
        edit.putExtra("ID", id);
        edit.putExtra("RAW MATERIALS", name);
        edit.putExtra("QUANTITY REQUIRED", number);
        edit.putExtra("OUTPUT PRODUCT", email);
        edit.putExtra("DESCRIPTION",address);
        startActivity(edit);
    }
    public void Delete(View v){
        db.delete(Integer.parseInt(id));
        Toast.makeText(getApplicationContext(),"deleted", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onBackPressed() {
        finish();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}