package simple.lerp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;


public class Welcome extends ActionBarActivity {

    Context ctx = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        if (checkDatabase()){
            Intent intent = new Intent(Welcome.this, Main_Menu.class);
            Welcome.this.startActivity(intent);
            finish();
        } else {
            Toast.makeText(getBaseContext(), "To skip just tap Create Account", Toast.LENGTH_LONG).show();

        }
        // sets full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Hides The action bar from the users view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



    }
    public boolean checkDatabase(){
        File file = new File("//data/data/ccclxix.lerp/databases/users");
        return file.exists();

    }


    public void Enter ( View v) {



        EditText name = (EditText)findViewById(R.id.Name);
        EditText email = (EditText)findViewById(R.id.Email);
        EditText password_one = (EditText)findViewById(R.id.Pass1);
        EditText password_two = (EditText)findViewById(R.id.Pass2);

        String Contrasena =  password_one.getText().toString();
        String Contrasena2 = password_two.getText().toString();
        String nombre = name.getText().toString();
        String correo =email.getText().toString();
        String ContrasenaFinal;
        Context context = getApplicationContext();
        CharSequence text = "Passed";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text,duration);
        toast.show();


        if (Contrasena.equals("")&&Contrasena2.equals("")&&nombre.equals("")&&correo.equals("")){

            DatabaseOperations DBB = new DatabaseOperations(context);
                    DBB.putInformation(DBB,"","","369",-2,-2,-2,-2,-2,-2,0,0);
            DBForQuizResults DBQR = new DBForQuizResults(this);

            DBQR.putInformation(DBQR,Integer.toString(1),0,0,0,0,0,0,0,0,0,0);
            DBQR.putInformation(DBQR,Integer.toString(2),0,0,0,0,0,0,0,0,0,0);
            DBQR.putInformation(DBQR,Integer.toString(3),0,0,0,0,0,0,0,0,0,0);
            DBQR.putInformation(DBQR,Integer.toString(4),0,0,0,0,0,0,0,0,0,0);
            DBQR.putInformation(DBQR,Integer.toString(5),0,0,0,0,0,0,0,0,0,0);
            DBQR.putInformation(DBQR,Integer.toString(6),0,0,0,0,0,0,0,0,0,0);
            Toast.makeText(getBaseContext(), "Auto Password: 369", Toast.LENGTH_LONG).show();

            Intent myIntent = new Intent(Welcome.this, Main_Menu.class);
            Welcome.this.startActivity(myIntent);
            finish();

        }else {


            if (Contrasena.equals(Contrasena2)) {
                ContrasenaFinal = Contrasena;

                DatabaseOperations DB = new DatabaseOperations(ctx);
                DBForQuizResults DBQR = new DBForQuizResults(this);

                DB.putInformation(DB, nombre, correo, ContrasenaFinal, -2, -2, -2,-2,-2,-2, 0,0);
                DBQR.putInformation(DBQR,Integer.toString(1),0,0,0,0,0,0,0,0,0,0);
                DBQR.putInformation(DBQR,Integer.toString(2),0,0,0,0,0,0,0,0,0,0);
                DBQR.putInformation(DBQR,Integer.toString(3),0,0,0,0,0,0,0,0,0,0);
                DBQR.putInformation(DBQR,Integer.toString(4),0,0,0,0,0,0,0,0,0,0);
                DBQR.putInformation(DBQR,Integer.toString(5),0,0,0,0,0,0,0,0,0,0);
                DBQR.putInformation(DBQR,Integer.toString(6),0,0,0,0,0,0,0,0,0,0);
                Toast.makeText(getBaseContext(), "Registration success", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(Welcome.this, Main_Menu.class);
                Welcome.this.startActivity(myIntent);
                finish();

            } else {
                CharSequence text2 = "Password doesn't match. Please try again";
                password_one.setText("");
                password_two.setText("");
                Toast toast2 = Toast.makeText(context, text2, duration);
                toast2.show();
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
