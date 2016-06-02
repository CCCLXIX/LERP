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

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class Quizzes extends ActionBarActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        //Hides The action bar from the users view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("Quiz Selector");
        t.send(new HitBuilders.AppViewBuilder().build());

    }

    public void AnalyticsSender(String s ){

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.send(new HitBuilders.AppViewBuilder().build());
        // Build and send an Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Quiz Selector")
                .setAction("Button Pressed")
                .setLabel(s)
                .build());

    }


    public void Quizz1 (View v){
        AnalyticsSender("Quiz #1");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,1);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();

    }

    public void Quizz2 (View v){
        AnalyticsSender("Quiz #2");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,2);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();
    }

    public void Quizz3 (View v){
        AnalyticsSender("Quiz #3");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,3);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();
    }
    public void Quizz4 (View v){
        AnalyticsSender("Quiz #4");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,4);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();
    }
    public void Quizz5 (View v){
        AnalyticsSender("Quiz #5");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,5);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();
    }
    public void Quizz6 (View v){
        AnalyticsSender("Quiz #6");


        DatabaseOperations DB = new DatabaseOperations(context);
        String DBName,Email,Pass;

        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        DB.CurrentQuizz(DB,DBName,Email,Pass,6);
        Intent intent = new Intent(Quizzes.this, QuizzActivity.class);
        Quizzes.this.startActivity(intent);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quizzes, menu);
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
