package simple.lerp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class ManageAccount extends ActionBarActivity {





    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_account);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        ProviderSetup();
        TextView Anouncement = (TextView)findViewById(R.id.anouncement);
        EditText QuizzNumber = (EditText)findViewById(R.id.quizz_number);
        EditText Password = (EditText)findViewById(R.id.password_reset);
        Button button = (Button)findViewById(R.id.Reset);
        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("Account Management");
        t.send(new HitBuilders.AppViewBuilder().build());

        Anouncement.setVisibility(View.INVISIBLE);
        QuizzNumber.setVisibility(View.INVISIBLE);
        Password.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);

    }



    public void AnalyticsSender(String s ){

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.send(new HitBuilders.AppViewBuilder().build());
        // Build and send an Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Account Management")
                .setAction("Button Pressed")
                .setLabel(s)
                .build());

    }







    public void QuizzNumberImporter(int n){
        DatabaseOperations DB = new DatabaseOperations(this);
        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        String name,email,password;
        name = CR.getString(0);
        email = CR.getString(1);
        password = CR.getString(2);
        DB.CurrentQuizSelector(DB,name,email,password,n);
        Intent intent = new Intent(ManageAccount.this,QuizReview.class);
        ManageAccount.this.startActivity(intent);

    }


    public void ProviderSetup(){

        TextView UserName = (TextView)findViewById(R.id.user_name);
        TextView UserEmail = (TextView)findViewById(R.id.user_email);

        TextView PossibleQ1 = (TextView)findViewById(R.id.possible_q1);
        TextView PossibleQ2 = (TextView)findViewById(R.id.possible_q2);
        TextView PossibleQ3 = (TextView)findViewById(R.id.possible_q3);
        TextView PossibleQ4 = (TextView)findViewById(R.id.possible_q4);
        TextView PossibleQ5 = (TextView)findViewById(R.id.possible_q5);
        TextView PossibleQ6 = (TextView)findViewById(R.id.possible_q6);




        PossibleQ1.setVisibility(View.INVISIBLE);
        PossibleQ2.setVisibility(View.INVISIBLE);
        PossibleQ3.setVisibility(View.INVISIBLE);
        PossibleQ4.setVisibility(View.INVISIBLE);
        PossibleQ5.setVisibility(View.INVISIBLE);
        PossibleQ6.setVisibility(View.INVISIBLE);

        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();

        String DBUserName = CR.getString(0);

        String DBQuiz1Score = CR.getString(3);
        String DBQuiz2Score = CR.getString(4);
        String DBQuiz3Score = CR.getString(5);
        String DBQuiz4Score = CR.getString(6);
        String DBQuiz5Score = CR.getString(7);
        String DBQuiz6Score = CR.getString(8);


        int DBQuiz1NumVal = Integer.parseInt(DBQuiz1Score);
        int DBQuiz2NumVal = Integer.parseInt(DBQuiz2Score);
        int DBQuiz3NumVal = Integer.parseInt(DBQuiz3Score);
        int DBQuiz4NumVal = Integer.parseInt(DBQuiz4Score);
        int DBQuiz5NumVal = Integer.parseInt(DBQuiz5Score);
        int DBQuiz6NumVal = Integer.parseInt(DBQuiz6Score);

        UserName.setText(DBUserName);

        String DBUserEmail = CR.getString(1);
        UserEmail.setText(DBUserEmail);

        if(DBQuiz1NumVal >=0) {

            PossibleQ1.setText("Quiz #1 : " + DBQuiz1Score + "/10");
            PossibleQ1.setVisibility(View.VISIBLE);

        }
        if(DBQuiz2NumVal >=0) {

            PossibleQ2.setText("Quiz #2 : " + DBQuiz2Score + "/10");
            PossibleQ2.setVisibility(View.VISIBLE);

        }
        if(DBQuiz3NumVal >=0) {

            PossibleQ3.setText("Quiz #3 : " + DBQuiz3Score + "/10");
            PossibleQ3.setVisibility(View.VISIBLE);

        }
        if(DBQuiz4NumVal >=0) {

            PossibleQ4.setText("Quiz #4 : " + DBQuiz4Score + "/10");
            PossibleQ4.setVisibility(View.VISIBLE);

        }
        if(DBQuiz5NumVal >=0) {

            PossibleQ5.setText("Quiz #5 : " + DBQuiz5Score + "/10");
            PossibleQ5.setVisibility(View.VISIBLE);

        }
        if(DBQuiz6NumVal >=0) {

            PossibleQ6.setText("Quiz #6 : " + DBQuiz6Score + "/10");
            PossibleQ6.setVisibility(View.VISIBLE);

        }
    }

    public void  QuizReset (View v){

        AnalyticsSender("Quiz Reset");
        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);

        CR.moveToFirst();

        String password = CR.getString(2);

        if (password.equals("369")){

            Context context = getApplicationContext();
            CharSequence text = "Password: 369";
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
            toast.show();
            TextView QuizzesTaken = (TextView) findViewById(R.id.quizzes_taken);
            TextView Possible1 = (TextView) findViewById(R.id.possible_q1);
            TextView Possible2 = (TextView) findViewById(R.id.possible_q2);
            TextView Possible3 = (TextView) findViewById(R.id.possible_q3);
            TextView Possible4 = (TextView) findViewById(R.id.possible_q4);
            TextView Possible5 = (TextView) findViewById(R.id.possible_q5);
            TextView Possible6 = (TextView) findViewById(R.id.possible_q6);
            Button button = (Button) findViewById(R.id.button5);


            QuizzesTaken.setVisibility(View.INVISIBLE);
            Possible1.setVisibility(View.INVISIBLE);
            Possible2.setVisibility(View.INVISIBLE);
            Possible3.setVisibility(View.INVISIBLE);
            Possible4.setVisibility(View.INVISIBLE);
            Possible5.setVisibility(View.INVISIBLE);
            Possible6.setVisibility(View.INVISIBLE);
            button.setVisibility(View.INVISIBLE);


            QuizResetSetup();



        } else {


            TextView QuizzesTaken = (TextView) findViewById(R.id.quizzes_taken);
            TextView Possible1 = (TextView) findViewById(R.id.possible_q1);
            TextView Possible2 = (TextView) findViewById(R.id.possible_q2);
            TextView Possible3 = (TextView) findViewById(R.id.possible_q3);
            TextView Possible4 = (TextView) findViewById(R.id.possible_q4);
            TextView Possible5 = (TextView) findViewById(R.id.possible_q5);
            TextView Possible6 = (TextView) findViewById(R.id.possible_q6);
            Button button = (Button) findViewById(R.id.button5);


            QuizzesTaken.setVisibility(View.INVISIBLE);
            Possible1.setVisibility(View.INVISIBLE);
            Possible2.setVisibility(View.INVISIBLE);
            Possible3.setVisibility(View.INVISIBLE);
            Possible4.setVisibility(View.INVISIBLE);
            Possible5.setVisibility(View.INVISIBLE);
            Possible6.setVisibility(View.INVISIBLE);
            button.setVisibility(View.INVISIBLE);


            QuizResetSetup();
        }

    }


    public void QuizResetSetup(){


        TextView Anouncement = (TextView)findViewById(R.id.anouncement);
        EditText QuizzNumber = (EditText)findViewById(R.id.quizz_number);
        EditText Password = (EditText)findViewById(R.id.password_reset);
        Button button = (Button)findViewById(R.id.Reset);


        Anouncement.setVisibility(View.VISIBLE);
        QuizzNumber.setVisibility(View.VISIBLE);
        Password.setVisibility(View.VISIBLE);
        button.setVisibility(View.VISIBLE);
    }



    public void QuizResetExecutor (View view) {

        EditText PPassword = (EditText) findViewById(R.id.password_reset);
        EditText QuizzNumber = (EditText) findViewById(R.id.quizz_number);


        String nombre, correo, ContrasenaFinal;
        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        nombre = CR.getString(0);
        correo = CR.getString(1);
        ContrasenaFinal = CR.getString(2);


        if (PPassword.getText().toString().equals("") || QuizzNumber.getText().toString().equals("")) {
            Context context = getApplicationContext();
            CharSequence text = "Please insert a valid credentials";
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        } else {
            int QuizSelection = Integer.parseInt(QuizzNumber.getText().toString());
            String Password = PPassword.getText().toString();


            if (Password.equals(ContrasenaFinal)) {

                if ((QuizSelection > 0 && QuizSelection <= 6) && ((QuizSelection == 1) || (QuizSelection == 2) || (QuizSelection == 3)||(QuizSelection == 4)||(QuizSelection == 5)
                ||(QuizSelection == 6))) {

                    if (QuizSelection == 1) {
                        DB.updateQuizzOne(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#1 Reset");
                    }
                    if (QuizSelection == 2) {
                        DB.updateQuizzTwo(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#2 Reset");

                    }
                    if (QuizSelection == 3) {
                        DB.updateQuizzThree(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#3 Reset");
                    }
                    if (QuizSelection == 4) {
                        DB.updateQuizzFour(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#4 Reset");
                    }
                    if (QuizSelection == 5) {
                        DB.updateQuizzFive(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#5 Reset");
                    }
                    if (QuizSelection == 6) {
                        DB.updateQuizzSix(DB, nombre, correo, ContrasenaFinal, -2);
                        Sentinel("Quiz#6 Reset");
                    }
                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Please provide a valid Quiz selection.";
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();

                }


            } else {
                Context context = getApplicationContext();
                CharSequence text = "Wrong Password";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
            }
        }
    }


    public void Sentinel(String call){

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, call,Toast.LENGTH_SHORT);
        toast.show();

        Intent intent = new Intent(ManageAccount.this, ManageAccount.class);
        ManageAccount.this.startActivity(intent);
        finish();

    }


    public void PressedPossible1 (View v){ QuizzNumberImporter(1); }
    public void PressedPossible2 (View v){ QuizzNumberImporter(2); }
    public void PressedPossible3 (View v){ QuizzNumberImporter(3); }
    public void PressedPossible4 (View v){ QuizzNumberImporter(4); }
    public void PressedPossible5 (View v){ QuizzNumberImporter(5); }
    public void PressedPossible6 (View v){ QuizzNumberImporter(6); }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_manage_account, menu);
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
