package com.example.ljh16.den;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class TtimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttime);
        CheckBox Mon1 = (CheckBox) findViewById(R.id.Mon1);
        Mon1.setOnCheckedChangeListener(this);
        CheckBox Mon2 = (CheckBox) findViewById(R.id.Mon2);
        CheckBox Mon3 = (CheckBox) findViewById(R.id.Mon3);
        CheckBox Mon4 = (CheckBox) findViewById(R.id.Mon4);
        CheckBox Mon5 = (CheckBox) findViewById(R.id.Mon5);
        CheckBox Mon6 = (CheckBox) findViewById(R.id.Mon6);
        CheckBox Mon7 = (CheckBox) findViewById(R.id.Mon7);
        CheckBox Mon8 = (CheckBox) findViewById(R.id.Mon8);
        CheckBox Mon9 = (CheckBox) findViewById(R.id.Mon9);
        CheckBox Tues1 = (CheckBox) findViewById(R.id.Tues1);
        CheckBox Tues2 = (CheckBox) findViewById(R.id.Tues2);
        CheckBox Tues3 = (CheckBox) findViewById(R.id.Tues3);
        CheckBox Tues4 = (CheckBox) findViewById(R.id.Tues4);
        CheckBox Tues5 = (CheckBox) findViewById(R.id.Tues5);
        CheckBox Tues6 = (CheckBox) findViewById(R.id.Tues6);
        CheckBox Tues7 = (CheckBox) findViewById(R.id.Tues7);
        CheckBox Tues8 = (CheckBox) findViewById(R.id.Tues8);
        CheckBox Tues9 = (CheckBox) findViewById(R.id.Tues9);
        CheckBox Wednes = (CheckBox) findViewById(R.id.Wednes1);
        CheckBox Wednes2 = (CheckBox) findViewById(R.id.Wednes2);
        CheckBox Wednes3 = (CheckBox) findViewById(R.id.Wednes3);
        CheckBox Wednes4 = (CheckBox) findViewById(R.id.Wednes4);
        CheckBox Wednes5 = (CheckBox) findViewById(R.id.Wednes5);
        CheckBox Wednes6 = (CheckBox) findViewById(R.id.Wednes6);
        CheckBox Wednes7 = (CheckBox) findViewById(R.id.Wednes7);
        CheckBox Wednes8 = (CheckBox) findViewById(R.id.Wednes8);
        CheckBox Wednes9 = (CheckBox) findViewById(R.id.Wednes9);
        CheckBox Thurs1 = (CheckBox) findViewById(R.id.Thurs1);
        CheckBox Thurs2 = (CheckBox) findViewById(R.id.Thurs2);
        CheckBox Thurs3 = (CheckBox) findViewById(R.id.Thurs3);
        CheckBox Thurs4 = (CheckBox) findViewById(R.id.Thurs4);
        CheckBox Thurs5 = (CheckBox) findViewById(R.id.Thurs5);
        CheckBox Thurs6 = (CheckBox) findViewById(R.id.Thurs6);
        CheckBox Thurs7 = (CheckBox) findViewById(R.id.Thurs7);
        CheckBox Thurs8 = (CheckBox) findViewById(R.id.Thurs8);
        CheckBox Thurs9 = (CheckBox) findViewById(R.id.Thurs9);
        CheckBox Fri1 = (CheckBox) findViewById(R.id.Fri1);
        CheckBox Fri2 = (CheckBox) findViewById(R.id.Fri2);
        CheckBox Fri3 = (CheckBox) findViewById(R.id.Fri3);
        CheckBox Fri4 = (CheckBox) findViewById(R.id.Fri4);
        CheckBox Fri5 = (CheckBox) findViewById(R.id.Fri5);
        CheckBox Fri6 = (CheckBox) findViewById(R.id.Fri6);
        CheckBox Fri7 = (CheckBox) findViewById(R.id.Fri7);
        CheckBox Fri8 = (CheckBox) findViewById(R.id.Fri8);
        CheckBox Fri9 = (CheckBox) findViewById(R.id.Fri9);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.next, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        CheckBox Mon1 = (CheckBox)findViewById(R.id.Mon1);

        CheckBox Mon2 = (CheckBox)findViewById(R.id.Mon2);
        Mon2.setOnCheckedChangeListener(this);
        CheckBox Mon3 = (CheckBox)findViewById(R.id.Mon3);
        Mon3.setOnCheckedChangeListener(this);
        CheckBox Mon4 = (CheckBox)findViewById(R.id.Mon4);
        Mon4.setOnCheckedChangeListener(this);
        CheckBox Mon5 = (CheckBox)findViewById(R.id.Mon5);
        Mon5.setOnCheckedChangeListener(this);
        CheckBox Mon6 = (CheckBox)findViewById(R.id.Mon6);
        Mon6.setOnCheckedChangeListener(this);
        CheckBox Mon7 = (CheckBox)findViewById(R.id.Mon7);
        Mon7.setOnCheckedChangeListener(this);
        CheckBox Mon8 = (CheckBox)findViewById(R.id.Mon8);
        Mon8.setOnCheckedChangeListener(this);
        CheckBox Mon9 = (CheckBox)findViewById(R.id.Mon9);
        Mon9.setOnCheckedChangeListener(this);

        CheckBox Tues1 = (CheckBox)findViewById(R.id.Tues1);
        Tues1.setOnCheckedChangeListener(this);
        CheckBox Tues2 = (CheckBox)findViewById(R.id.Tues2);
        Tues2.setOnCheckedChangeListener(this);
        CheckBox Tues3 = (CheckBox)findViewById(R.id.Tues3);
        Tues3.setOnCheckedChangeListener(this);
        CheckBox Tues4 = (CheckBox)findViewById(R.id.Tues4);
        Tues4.setOnCheckedChangeListener(this);
        CheckBox Tues5 = (CheckBox)findViewById(R.id.Tues5);
        Tues5.setOnCheckedChangeListener(this);
        CheckBox Tues6 = (CheckBox)findViewById(R.id.Tues6);
        Tues6.setOnCheckedChangeListener(this);
        CheckBox Tues7 = (CheckBox)findViewById(R.id.Tues7);
        Tues7.setOnCheckedChangeListener(this);
        CheckBox Tues8 = (CheckBox)findViewById(R.id.Tues8);
        Tues8.setOnCheckedChangeListener(this);
        CheckBox Tues9 = (CheckBox)findViewById(R.id.Tues9);
        Tues9.setOnCheckedChangeListener(this);

        CheckBox Wednes1 = (CheckBox)findViewById(R.id.Wednes1);
        Wednes1.setOnCheckedChangeListener(this);
        CheckBox Wednes2 = (CheckBox)findViewById(R.id.Wednes2);
        Wednes2.setOnCheckedChangeListener(this);
        CheckBox Wednes3 = (CheckBox)findViewById(R.id.Wednes3);
        Wednes3.setOnCheckedChangeListener(this);
        CheckBox Wednes4 = (CheckBox)findViewById(R.id.Wednes4);
        Wednes4.setOnCheckedChangeListener(this);
        CheckBox Wednes5 = (CheckBox)findViewById(R.id.Wednes5);
        Wednes5.setOnCheckedChangeListener(this);
        CheckBox Wednes6 = (CheckBox)findViewById(R.id.Wednes6);
        Wednes6.setOnCheckedChangeListener(this);
        CheckBox Wednes7 = (CheckBox)findViewById(R.id.Wednes7);
        Wednes7.setOnCheckedChangeListener(this);
        CheckBox Wednes8 = (CheckBox)findViewById(R.id.Wednes8);
        Wednes8.setOnCheckedChangeListener(this);
        CheckBox Wednes9 = (CheckBox)findViewById(R.id.Wednes9);
        Wednes9.setOnCheckedChangeListener(this);

        CheckBox Thurs1 = (CheckBox)findViewById(R.id.Thurs1);
        Thurs1.setOnCheckedChangeListener(this);
        CheckBox Thurs2 = (CheckBox)findViewById(R.id.Thurs2);
        Thurs2.setOnCheckedChangeListener(this);
        CheckBox Thurs3 = (CheckBox)findViewById(R.id.Thurs3);
        Thurs3.setOnCheckedChangeListener(this);
        CheckBox Thurs4 = (CheckBox)findViewById(R.id.Thurs4);
        Thurs4.setOnCheckedChangeListener(this);
        CheckBox Thurs5 = (CheckBox)findViewById(R.id.Thurs5);
        Thurs5.setOnCheckedChangeListener(this);
        CheckBox Thurs6 = (CheckBox)findViewById(R.id.Thurs6);
        Thurs6.setOnCheckedChangeListener(this);
        CheckBox Thurs7 = (CheckBox)findViewById(R.id.Thurs7);
        Thurs7.setOnCheckedChangeListener(this);
        CheckBox Thurs8 = (CheckBox)findViewById(R.id.Thurs8);
        Thurs8.setOnCheckedChangeListener(this);
        CheckBox Thurs9 = (CheckBox)findViewById(R.id.Thurs9);
        Thurs9.setOnCheckedChangeListener(this);

        CheckBox Fri1 = (CheckBox)findViewById(R.id.Fri1);
        Fri1.setOnCheckedChangeListener(this);
        CheckBox Fri2 = (CheckBox)findViewById(R.id.Fri2);
        Fri2.setOnCheckedChangeListener(this);
        CheckBox Fri3 = (CheckBox)findViewById(R.id.Fri3);
        Fri3.setOnCheckedChangeListener(this);
        CheckBox Fri4 = (CheckBox)findViewById(R.id.Fri4);
        Fri4.setOnCheckedChangeListener(this);
        CheckBox Fri5 = (CheckBox)findViewById(R.id.Fri5);
        Fri5.setOnCheckedChangeListener(this);
        CheckBox Fri6 = (CheckBox)findViewById(R.id.Fri6);
        Fri6.setOnCheckedChangeListener(this);
        CheckBox Fri7 = (CheckBox)findViewById(R.id.Fri7);
        Fri7.setOnCheckedChangeListener(this);
        CheckBox Fri8 = (CheckBox)findViewById(R.id.Fri8);
        Fri8.setOnCheckedChangeListener(this);
        CheckBox Fri9 = (CheckBox)findViewById(R.id.Fri9);
        Fri9.setOnCheckedChangeListener(this);

        public







        int id = item.getItemId();

        if( id == R.id.newPost ){
            Intent NextBu = new Intent(TtimeActivity.this, ResultActivity.class);
            TtimeActivity.this.startActivity(NextBu);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
