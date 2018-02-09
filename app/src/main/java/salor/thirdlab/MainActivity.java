package salor.thirdlab;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();


        final EditText usr= findViewById(R.id.editTextUser);
        final EditText psw = findViewById(R.id.editText3);
        Button buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Activity2.class);
                String user = usr.getText().toString();
                String password = psw.getText().toString();
                intent.putExtra("usr",user);
                intent.putExtra("pass",password);
                startActivity(intent);
            }
        });
    }
}
