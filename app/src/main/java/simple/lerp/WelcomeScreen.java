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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class WelcomeScreen extends ActionBarActivity {


    final int timeWait = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        StartAnimations();

        // sets full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Hides The action bar from the users view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        /* This Thread pauses the activity for logo purposes */

        Thread welcomeThread = new Thread() {

            int wait = 0;

            @Override
            public void run() {
                try {
                    super.run();
/**
 * use while to get the splash time. Use sleep() to increase
 * the wait variable for every 100L.
 */
                    while (wait < timeWait) {
                        sleep(100);
                        wait += 100;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(WelcomeScreen.this, Welcome.class));
                    finish();
                }
            }

        };
        welcomeThread.start();
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();
        RelativeLayout l=(RelativeLayout) findViewById(R.id.welcomescreen);
        l.clearAnimation();
        l.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.imageView3);
        iv.clearAnimation();
        iv.startAnimation(anim);

    }



}
