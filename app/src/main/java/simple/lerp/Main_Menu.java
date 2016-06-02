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
import android.widget.Toast;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class Main_Menu extends ActionBarActivity {
    Context context = this;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("Home");
        t.send(new HitBuilders.AppViewBuilder().build());

        DatabaseSetUp();

        Context context = getApplicationContext();
        CharSequence text = "Welcome, "+ name;
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();


    }

    public void AnalyticsSender(String s ){

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.send(new HitBuilders.AppViewBuilder().build());
        // Build and send an Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Main Menu")
                .setAction("Button Pressed")
                .setLabel(s)
                .build());

    }

    public void  Resources (View v){

        AnalyticsSender("Resources");

        Intent intent = new Intent(Main_Menu.this, NYSResources.class);
        Main_Menu.this.startActivity(intent);


    }




    public void  AccountManagement (View v){
        AnalyticsSender("Account Management");


        Intent intent = new Intent(Main_Menu.this, ManageAccount.class);
        Main_Menu.this.startActivity(intent);


    }

    public void Quizzes ( View v){
        AnalyticsSender("Quizzes");


        Intent intent = new Intent(Main_Menu.this, Quizzes.class);
        Main_Menu.this.startActivity(intent);

    }
    public void CCCLXIX ( View v){
        AnalyticsSender("About");


        Intent intent = new Intent(Main_Menu.this, MainMainMenu.class);
        Main_Menu.this.startActivity(intent);

    }

    public void RandomQuestion ( View v){

        AnalyticsSender("Random Selection");


        Intent intent = new Intent(Main_Menu.this, RandomQuestion.class);
        Main_Menu.this.startActivity(intent);

    }


    public void DatabaseSetUp(){

        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        name = CR.getString(0);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main__menu, menu);
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

    @Override
    protected void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(Main_Menu.this).reportActivityStart(this);
    }


    @Override
    protected void onStop() {
        super.onStop();
        GoogleAnalytics.getInstance(Main_Menu.this).reportActivityStop(this);
    }
}
