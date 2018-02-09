package salor.thirdlab;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ResourceBundle;

public class Activity2 extends AppCompatActivity {
    //un solo textView para mostrar las diferentes alertas
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        TextView txt = (TextView) findViewById(R.id.textViewOpenWelcome);
        String username="lab";
        String password="lab";
        Intent intent = getIntent();
        String usr = intent.getStringExtra("usr");
        String pass = intent.getStringExtra("pass");
        System.out.println(usr+"\n" + pass);
        if(username.equals(usr)&& password.equals(pass)){
            Toast toast = new Toast(this);
            toast.makeText(this,"Password ok!",Toast.LENGTH_LONG).show();
            txt.setVisibility(View.VISIBLE);
        }else{
            txt.setText("Wrong!");
            txt.setVisibility(View.VISIBLE);
            AlertDialog.Builder dialogConf = new AlertDialog.Builder(this);
            dialogConf.setTitle("Alert");
            dialogConf.setMessage("Password not ok");
            dialogConf.setIcon(R.mipmap.ic_launcher);
            dialogConf.setNeutralButton("Retry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent2 = new Intent(Activity2.this,MainActivity.class);
                    startActivity(intent2);
                }
            });
            AlertDialog dialog = dialogConf.create();
            dialog.show();
        }









    }
}
