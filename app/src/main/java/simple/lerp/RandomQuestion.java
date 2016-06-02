package simple.lerp;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import simple.lerp.QuizzActivity;

import java.util.Random;


public class RandomQuestion extends ActionBarActivity {


    int CurrentAnswer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_question);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("Random Question");
        t.send(new HitBuilders.AppViewBuilder().build());

        ActivitySetup();

    }

    public void AnalyticsSender(String s ){

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.send(new HitBuilders.AppViewBuilder().build());
        // Build and send an Event.
        t.send(new HitBuilders.EventBuilder()
                .setCategory("Random Question")
                .setAction("Button Pressed")
                .setLabel(s)
                .build());

    }


    public void ActivitySetup() {

        TextView Question = (TextView) findViewById(R.id.randomquestion_question);
        TextView Answer1 = (TextView) findViewById(R.id.randomquestion_a1);
        TextView Answer2 = (TextView) findViewById(R.id.randomquestion_a2);
        TextView Answer3 = (TextView) findViewById(R.id.randomquestion_a3);
        TextView Answer4 = (TextView) findViewById(R.id.randomquestion_a4);
        TextView YayNey = (TextView)findViewById(R.id.randomquestion_yeyney);
        Button button = (Button)findViewById(R.id.randomquestion_next_button);
        Button submit = (Button)findViewById(R.id.randomquestion_submit);
        EditText responce = (EditText)findViewById(R.id.randomquestion_responce);


        Question.setVisibility(View.INVISIBLE);
        Answer1.setVisibility(View.INVISIBLE);
        Answer2.setVisibility(View.INVISIBLE);
        Answer3.setVisibility(View.INVISIBLE);
        Answer4.setVisibility(View.INVISIBLE);
        YayNey.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        responce.setVisibility(View.INVISIBLE);




    }

    public void RandomQuestionBegin(View v) {
        AnalyticsSender("Begin");



        RandomQuestionStarter();
        ImageView button = (ImageView)findViewById(R.id.randomquestion_begin_button);
        button.setVisibility(View.INVISIBLE);


    }





    public void RandomQuestionStarter() {


        TextView Question = (TextView) findViewById(R.id.randomquestion_question);
        TextView QzAns1 = (TextView) findViewById(R.id.randomquestion_a1);
        TextView QzAns2 = (TextView) findViewById(R.id.randomquestion_a2);
        TextView QzAns3 = (TextView) findViewById(R.id.randomquestion_a3);
        TextView QzAns4 = (TextView) findViewById(R.id.randomquestion_a4);
        TextView Yey_Ney = (TextView)findViewById(R.id.randomquestion_yeyney);
        EditText responce = (EditText)findViewById(R.id.randomquestion_responce);

        Button submit = (Button)findViewById(R.id.randomquestion_submit);

        Yey_Ney.setVisibility(View.INVISIBLE);

        Question.setVisibility(View.VISIBLE);   //WRITE THE VISIBLE AND INVISIBLE METHOD!!!----------------------------------------------
        QzAns1.setVisibility(View.VISIBLE);
        QzAns2.setVisibility(View.VISIBLE);
        QzAns3.setVisibility(View.VISIBLE);
        QzAns4.setVisibility(View.VISIBLE);
        responce.setVisibility(View.VISIBLE);
        submit.setVisibility(View.VISIBLE);

        Random randomGenerator = new Random();
        int CurrentQuestion = randomGenerator.nextInt(59);  //Called current question only with the purpuse of saving time.

        if (CurrentQuestion == 0) {
            Question.setText((R.string.qz1_q1));
            QzAns1.setText(R.string.qz1_a1);
            QzAns2.setText(R.string.qz1_a2);
            QzAns3.setText(R.string.qz1_a3);
            QzAns4.setText(R.string.qz1_a4);
            CurrentAnswer = Q1A;

        }
        if (CurrentQuestion == 1) {
            Question.setText((R.string.qz1_q2));
            QzAns1.setText(R.string.qz1_q2_a1);
            QzAns2.setText(R.string.qz1_q2_a2);
            QzAns3.setText(R.string.qz1_q2_a3);
            QzAns4.setText(R.string.qz1_q2_a4);

            CurrentAnswer = Q2A;

        }
        if (CurrentQuestion == 2) {
            Question.setText((R.string.qz1_q3));
            QzAns1.setText(R.string.qz1_q3_a1);
            QzAns2.setText(R.string.qz1_q3_a2);
            QzAns3.setText(R.string.qz1_q3_a3);
            QzAns4.setText(R.string.qz1_q3_a4);
            CurrentAnswer = Q3A;
        }
        if (CurrentQuestion == 3) {
            Question.setText((R.string.qz1_q4));
            QzAns1.setText(R.string.qz1_q4_a1);
            QzAns2.setText(R.string.qz1_q4_a2);
            QzAns3.setText(R.string.qz1_q4_a3);
            QzAns4.setText(R.string.qz1_q4_a4);
            CurrentAnswer = Q4A;
        }
        if (CurrentQuestion == 4) {
            Question.setText((R.string.qz1_q5));
            QzAns1.setText(R.string.qz1_q5_a1);
            QzAns2.setText(R.string.qz1_q5_a2);
            QzAns3.setText(R.string.qz1_q5_a3);
            QzAns4.setText(R.string.qz1_q5_a4);
            CurrentAnswer = Q5A;
        }
        if (CurrentQuestion == 5) {
            Question.setText((R.string.qz1_q6));
            QzAns1.setText(R.string.qz1_q6_a1);
            QzAns2.setText(R.string.qz1_q6_a2);
            QzAns3.setText(R.string.qz1_q6_a3);
            QzAns4.setText(R.string.qz1_q6_a4);
            CurrentAnswer = Q6A;
        }
        if (CurrentQuestion == 6) {
            Question.setText((R.string.qz1_q7));
            QzAns1.setText(R.string.qz1_q7_a1);
            QzAns2.setText(R.string.qz1_q7_a2);
            QzAns3.setText(R.string.qz1_q7_a3);
            QzAns4.setText(R.string.qz1_q7_a4);
            CurrentAnswer = Q7A;
        }
        if (CurrentQuestion == 7) {
            Question.setText((R.string.qz1_q8));
            QzAns1.setText(R.string.qz1_q8_a1);
            QzAns2.setText(R.string.qz1_q8_a2);
            QzAns3.setText(R.string.qz1_q8_a3);
            QzAns4.setText(R.string.qz1_q8_a4);
            CurrentAnswer = Q8A;
        }
        if (CurrentQuestion == 8) {
            Question.setText((R.string.qz1_q9));
            QzAns1.setText(R.string.qz1_q9_a1);
            QzAns2.setText(R.string.qz1_q9_a2);
            QzAns3.setText(R.string.qz1_q9_a3);
            QzAns4.setText(R.string.qz1_q9_a4);
            CurrentAnswer = Q9A;
        }
        if (CurrentQuestion == 9) {
            Question.setText((R.string.qz1_q10));
            QzAns1.setText(R.string.qz1_q10_a1);
            QzAns2.setText(R.string.qz1_q10_a2);
            QzAns3.setText(R.string.qz1_q10_a3);
            QzAns4.setText(R.string.qz1_q10_a4);
            CurrentAnswer = Q10A;

        }
        //--------------------------------------------------

        if (CurrentQuestion == 10) {
            Question.setText((R.string.qz2_q1));
            QzAns1.setText(R.string.qz2_a1);
            QzAns2.setText(R.string.qz2_a2);
            QzAns3.setText(R.string.qz2_a3);
            QzAns4.setText(R.string.qz2_a4);
            CurrentAnswer = QQ1A;

        }   if (CurrentQuestion == 11) {
            Question.setText((R.string.qz2_q2));
            QzAns1.setText(R.string.qz2_q2_a1);
            QzAns2.setText(R.string.qz2_q2_a2);
            QzAns3.setText(R.string.qz2_q2_a3);
            QzAns4.setText(R.string.qz2_q2_a4);

            CurrentAnswer = QQ2A;

        }   if (CurrentQuestion == 12) {
            Question.setText((R.string.qz2_q3));
            QzAns1.setText(R.string.qz2_q3_a1);
            QzAns2.setText(R.string.qz2_q3_a2);
            QzAns3.setText(R.string.qz2_q3_a3);
            QzAns4.setText(R.string.qz2_q3_a4);
            CurrentAnswer = QQ3A;
        }   if (CurrentQuestion == 13) {
            Question.setText((R.string.qz2_q4));
            QzAns1.setText(R.string.qz2_q4_a1);
            QzAns2.setText(R.string.qz2_q4_a2);
            QzAns3.setText(R.string.qz2_q4_a3);
            QzAns4.setText(R.string.qz2_q4_a4);
            CurrentAnswer = QQ4A;
        }   if (CurrentQuestion == 14) {
            Question.setText((R.string.qz2_q5));
            QzAns1.setText(R.string.qz2_q5_a1);
            QzAns2.setText(R.string.qz2_q5_a2);
            QzAns3.setText(R.string.qz2_q5_a3);
            QzAns4.setText(R.string.qz2_q5_a4);
            CurrentAnswer = QQ5A;
        }   if (CurrentQuestion == 15) {
            Question.setText((R.string.qz2_q6));
            QzAns1.setText(R.string.qz2_q6_a1);
            QzAns2.setText(R.string.qz2_q6_a2);
            QzAns3.setText(R.string.qz2_q6_a3);
            QzAns4.setText(R.string.qz2_q6_a4);
            CurrentAnswer = QQ6A;
        }   if (CurrentQuestion == 16) {
            Question.setText((R.string.qz2_q7));
            QzAns1.setText(R.string.qz2_q7_a1);
            QzAns2.setText(R.string.qz2_q7_a2);
            QzAns3.setText(R.string.qz2_q7_a3);
            QzAns4.setText(R.string.qz2_q7_a4);
            CurrentAnswer = QQ7A;
        }   if (CurrentQuestion == 17) {
            Question.setText((R.string.qz2_q8));
            QzAns1.setText(R.string.qz2_q8_a1);
            QzAns2.setText(R.string.qz2_q8_a2);
            QzAns3.setText(R.string.qz2_q8_a3);
            QzAns4.setText(R.string.qz2_q8_a4);
            CurrentAnswer = QQ8A;
        }   if (CurrentQuestion == 18) {
            Question.setText((R.string.qz2_q9));
            QzAns1.setText(R.string.qz2_q9_a1);
            QzAns2.setText(R.string.qz2_q9_a2);
            QzAns3.setText(R.string.qz2_q9_a3);
            QzAns4.setText(R.string.qz2_q9_a4);
            CurrentAnswer = QQ9A;
        }   if (CurrentQuestion == 19) {
            Question.setText((R.string.qz2_q10));
            QzAns1.setText(R.string.qz2_q10_a1);
            QzAns2.setText(R.string.qz2_q10_a2);
            QzAns3.setText(R.string.qz2_q10_a3);
            QzAns4.setText(R.string.qz2_q10_a4);
            CurrentAnswer = QQ10A;

        }

        //------------------------------

        if (CurrentQuestion == 20) {
            Question.setText((R.string.qz3_q1));
            QzAns1.setText(R.string.qz3_a1);
            QzAns2.setText(R.string.qz3_a2);
            QzAns3.setText(R.string.qz3_a3);
            QzAns4.setText(R.string.qz3_a4);
            CurrentAnswer = QQQ1A;

        }   if (CurrentQuestion == 21) {
            Question.setText((R.string.qz3_q2));
            QzAns1.setText(R.string.qz3_q2_a1);
            QzAns2.setText(R.string.qz3_q2_a2);
            QzAns3.setText(R.string.qz3_q2_a3);
            QzAns4.setText(R.string.qz3_q2_a4);

            CurrentAnswer = QQQ2A;

        }   if (CurrentQuestion == 22) {
            Question.setText((R.string.qz3_q3));
            QzAns1.setText(R.string.qz3_q3_a1);
            QzAns2.setText(R.string.qz3_q3_a2);
            QzAns3.setText(R.string.qz3_q3_a3);
            QzAns4.setText(R.string.qz3_q3_a4);
            CurrentAnswer = QQQ3A;
        }   if (CurrentQuestion == 23) {
            Question.setText((R.string.qz3_q4));
            QzAns1.setText(R.string.qz3_q4_a1);
            QzAns2.setText(R.string.qz3_q4_a2);
            QzAns3.setText(R.string.qz3_q4_a3);
            QzAns4.setText(R.string.qz3_q4_a4);
            CurrentAnswer = QQQ4A;
        }   if (CurrentQuestion == 24) {
            Question.setText((R.string.qz3_q5));
            QzAns1.setText(R.string.qz3_q5_a1);
            QzAns2.setText(R.string.qz3_q5_a2);
            QzAns3.setText(R.string.qz3_q5_a3);
            QzAns4.setText(R.string.qz3_q5_a4);
            CurrentAnswer = QQQ5A;
        }   if (CurrentQuestion == 25) {
            Question.setText((R.string.qz3_q6));
            QzAns1.setText(R.string.qz3_q6_a1);
            QzAns2.setText(R.string.qz3_q6_a2);
            QzAns3.setText(R.string.qz3_q6_a3);
            QzAns4.setText(R.string.qz3_q6_a4);
            CurrentAnswer = QQQ6A;
        }   if (CurrentQuestion == 26) {
            Question.setText((R.string.qz3_q7));
            QzAns1.setText(R.string.qz3_q7_a1);
            QzAns2.setText(R.string.qz3_q7_a2);
            QzAns3.setText(R.string.qz3_q7_a3);
            QzAns4.setText(R.string.qz3_q7_a4);
            CurrentAnswer = QQQ7A;
        }   if (CurrentQuestion == 27) {
            Question.setText((R.string.qz3_q8));
            QzAns1.setText(R.string.qz3_q8_a1);
            QzAns2.setText(R.string.qz3_q8_a2);
            QzAns3.setText(R.string.qz3_q8_a3);
            QzAns4.setText(R.string.qz3_q8_a4);
            CurrentAnswer = QQQ8A;
        }   if (CurrentQuestion == 28) {
            Question.setText((R.string.qz3_q9));
            QzAns1.setText(R.string.qz3_q9_a1);
            QzAns2.setText(R.string.qz3_q9_a2);
            QzAns3.setText(R.string.qz3_q9_a3);
            QzAns4.setText(R.string.qz3_q9_a4);
            CurrentAnswer = QQQ9A;
        }   if (CurrentQuestion == 29) {
            Question.setText((R.string.qz3_q10));
            QzAns1.setText(R.string.qz3_q10_a1);
            QzAns2.setText(R.string.qz3_q10_a2);
            QzAns3.setText(R.string.qz3_q10_a3);
            QzAns4.setText(R.string.qz3_q10_a4);
            CurrentAnswer = QQQ10A;

        }
        if (CurrentQuestion == 30) {
            Question.setText((R.string.qz4_q1));
            QzAns1.setText(R.string.qz4_a1);
            QzAns2.setText(R.string.qz4_a2);
            QzAns3.setText(R.string.qz4_a3);
            QzAns4.setText(R.string.qz4_a4);
            CurrentAnswer = Q1A4;

        }   if (CurrentQuestion == 31) {
            Question.setText((R.string.qz4_q2));
            QzAns1.setText(R.string.qz4_q2_a1);
            QzAns2.setText(R.string.qz4_q2_a2);
            QzAns3.setText(R.string.qz4_q2_a3);
            QzAns4.setText(R.string.qz4_q2_a4);

            CurrentAnswer = Q2A4;

        }   if (CurrentQuestion == 32) {
            Question.setText((R.string.qz4_q3));
            QzAns1.setText(R.string.qz4_q3_a1);
            QzAns2.setText(R.string.qz4_q3_a2);
            QzAns3.setText(R.string.qz4_q3_a3);
            QzAns4.setText(R.string.qz4_q3_a4);
            CurrentAnswer = Q3A4;
        }   if (CurrentQuestion == 33) {
            Question.setText((R.string.qz4_q4));
            QzAns1.setText(R.string.qz4_q4_a1);
            QzAns2.setText(R.string.qz4_q4_a2);
            QzAns3.setText(R.string.qz4_q4_a3);
            QzAns4.setText(R.string.qz4_q4_a4);
            CurrentAnswer = Q4A4;
        }   if (CurrentQuestion == 34) {
            Question.setText((R.string.qz4_q5));
            QzAns1.setText(R.string.qz4_q5_a1);
            QzAns2.setText(R.string.qz4_q5_a2);
            QzAns3.setText(R.string.qz4_q5_a3);
            QzAns4.setText(R.string.qz4_q5_a4);
            CurrentAnswer = Q5A4;
        }   if (CurrentQuestion == 35) {
            Question.setText((R.string.qz4_q6));
            QzAns1.setText(R.string.qz4_q6_a1);
            QzAns2.setText(R.string.qz4_q6_a2);
            QzAns3.setText(R.string.qz4_q6_a3);
            QzAns4.setText(R.string.qz4_q6_a4);
            CurrentAnswer = Q6A4;
        }   if (CurrentQuestion == 36) {
            Question.setText((R.string.qz4_q7));
            QzAns1.setText(R.string.qz4_q7_a1);
            QzAns2.setText(R.string.qz4_q7_a2);
            QzAns3.setText(R.string.qz4_q7_a3);
            QzAns4.setText(R.string.qz4_q7_a4);
            CurrentAnswer = Q7A4;
        }   if (CurrentQuestion == 37) {
            Question.setText((R.string.qz4_q8));
            QzAns1.setText(R.string.qz4_q8_a1);
            QzAns2.setText(R.string.qz4_q8_a2);
            QzAns3.setText(R.string.qz4_q8_a3);
            QzAns4.setText(R.string.qz4_q8_a4);
            CurrentAnswer = Q8A4;
        }   if (CurrentQuestion == 38) {
            Question.setText((R.string.qz4_q9));
            QzAns1.setText(R.string.qz4_q9_a1);
            QzAns2.setText(R.string.qz4_q9_a2);
            QzAns3.setText(R.string.qz4_q9_a3);
            QzAns4.setText(R.string.qz4_q9_a4);
            CurrentAnswer = Q9A4;
        }   if (CurrentQuestion == 39) {
            Question.setText((R.string.qz4_q10));
            QzAns1.setText(R.string.qz4_q10_a1);
            QzAns2.setText(R.string.qz4_q10_a2);
            QzAns3.setText(R.string.qz4_q10_a3);
            QzAns4.setText(R.string.qz4_q10_a4);
            CurrentAnswer = Q10A4;

        }


        if (CurrentQuestion == 40) {
            Question.setText((R.string.qz5_q1));
            QzAns1.setText(R.string.qz5_a1);
            QzAns2.setText(R.string.qz5_a2);
            QzAns3.setText(R.string.qz5_a3);
            QzAns4.setText(R.string.qz5_a4);
            CurrentAnswer = QQ1A5;

        }   if (CurrentQuestion == 41) {
            Question.setText((R.string.qz5_q2));
            QzAns1.setText(R.string.qz5_q2_a1);
            QzAns2.setText(R.string.qz5_q2_a2);
            QzAns3.setText(R.string.qz5_q2_a3);
            QzAns4.setText(R.string.qz5_q2_a4);

            CurrentAnswer = QQ2A5;

        }   if (CurrentQuestion == 42) {
            Question.setText((R.string.qz5_q3));
            QzAns1.setText(R.string.qz5_q3_a1);
            QzAns2.setText(R.string.qz5_q3_a2);
            QzAns3.setText(R.string.qz5_q3_a3);
            QzAns4.setText(R.string.qz5_q3_a4);
            CurrentAnswer = QQ3A5;
        }   if (CurrentQuestion == 43) {
            Question.setText((R.string.qz5_q4));
            QzAns1.setText(R.string.qz5_q4_a1);
            QzAns2.setText(R.string.qz5_q4_a2);
            QzAns3.setText(R.string.qz5_q4_a3);
            QzAns4.setText(R.string.qz5_q4_a4);
            CurrentAnswer = QQ4A5;
        }   if (CurrentQuestion == 44) {
            Question.setText((R.string.qz5_q5));
            QzAns1.setText(R.string.qz5_q5_a1);
            QzAns2.setText(R.string.qz5_q5_a2);
            QzAns3.setText(R.string.qz5_q5_a3);
            QzAns4.setText(R.string.qz5_q5_a4);
            CurrentAnswer = QQ5A5;
        }   if (CurrentQuestion == 45) {
            Question.setText((R.string.qz5_q6));
            QzAns1.setText(R.string.qz5_q6_a1);
            QzAns2.setText(R.string.qz5_q6_a2);
            QzAns3.setText(R.string.qz5_q6_a3);
            QzAns4.setText(R.string.qz5_q6_a4);
            CurrentAnswer = QQ6A5;
        }   if (CurrentQuestion == 46) {
            Question.setText((R.string.qz5_q7));
            QzAns1.setText(R.string.qz5_q7_a1);
            QzAns2.setText(R.string.qz5_q7_a2);
            QzAns3.setText(R.string.qz5_q7_a3);
            QzAns4.setText(R.string.qz5_q7_a4);
            CurrentAnswer = QQ7A5;
        }   if (CurrentQuestion == 47) {
            Question.setText((R.string.qz5_q8));
            QzAns1.setText(R.string.qz5_q8_a1);
            QzAns2.setText(R.string.qz5_q8_a2);
            QzAns3.setText(R.string.qz5_q8_a3);
            QzAns4.setText(R.string.qz5_q8_a4);
            CurrentAnswer = QQ8A5;
        }   if (CurrentQuestion == 48) {
            Question.setText((R.string.qz5_q9));
            QzAns1.setText(R.string.qz5_q9_a1);
            QzAns2.setText(R.string.qz5_q9_a2);
            QzAns3.setText(R.string.qz5_q9_a3);
            QzAns4.setText(R.string.qz5_q9_a4);
            CurrentAnswer = QQ9A5;
        }   if (CurrentQuestion == 49) {
            Question.setText((R.string.qz5_q10));
            QzAns1.setText(R.string.qz5_q10_a1);
            QzAns2.setText(R.string.qz5_q10_a2);
            QzAns3.setText(R.string.qz5_q10_a3);
            QzAns4.setText(R.string.qz5_q10_a4);
            CurrentAnswer = QQ10A5;
        }

        if (CurrentQuestion == 50) {
            Question.setText((R.string.qz6_q1));
            QzAns1.setText(R.string.qz6_a1);
            QzAns2.setText(R.string.qz6_a2);
            QzAns3.setText(R.string.qz6_a3);
            QzAns4.setText(R.string.qz6_a4);
            CurrentAnswer = QQQ1A6;

        }   if (CurrentQuestion == 51) {
            Question.setText((R.string.qz6_q2));
            QzAns1.setText(R.string.qz6_q2_a1);
            QzAns2.setText(R.string.qz6_q2_a2);
            QzAns3.setText(R.string.qz6_q2_a3);
            QzAns4.setText(R.string.qz6_q2_a4);

            CurrentAnswer = QQQ2A6;

        }   if (CurrentQuestion == 52) {
            Question.setText((R.string.qz6_q3));
            QzAns1.setText(R.string.qz6_q3_a1);
            QzAns2.setText(R.string.qz6_q3_a2);
            QzAns3.setText(R.string.qz6_q3_a3);
            QzAns4.setText(R.string.qz6_q3_a4);
            CurrentAnswer = QQQ3A6;
        }   if (CurrentQuestion == 53) {
            Question.setText((R.string.qz6_q4));
            QzAns1.setText(R.string.qz6_q4_a1);
            QzAns2.setText(R.string.qz6_q4_a2);
            QzAns3.setText(R.string.qz6_q4_a3);
            QzAns4.setText(R.string.qz6_q4_a4);
            CurrentAnswer = QQQ4A6;
        }   if (CurrentQuestion == 54) {
            Question.setText((R.string.qz6_q5));
            QzAns1.setText(R.string.qz6_q5_a1);
            QzAns2.setText(R.string.qz6_q5_a2);
            QzAns3.setText(R.string.qz6_q5_a3);
            QzAns4.setText(R.string.qz6_q5_a4);
            CurrentAnswer = QQQ5A6;
        }   if (CurrentQuestion == 55) {
            Question.setText((R.string.qz6_q6));
            QzAns1.setText(R.string.qz6_q6_a1);
            QzAns2.setText(R.string.qz6_q6_a2);
            QzAns3.setText(R.string.qz6_q6_a3);
            QzAns4.setText(R.string.qz6_q6_a4);
            CurrentAnswer = QQQ6A6;
        }   if (CurrentQuestion == 56) {
            Question.setText((R.string.qz6_q7));
            QzAns1.setText(R.string.qz6_q7_a1);
            QzAns2.setText(R.string.qz6_q7_a2);
            QzAns3.setText(R.string.qz6_q7_a3);
            QzAns4.setText(R.string.qz6_q7_a4);
            CurrentAnswer = QQQ7A6;
        }   if (CurrentQuestion == 57) {
            Question.setText((R.string.qz6_q8));
            QzAns1.setText(R.string.qz6_q8_a1);
            QzAns2.setText(R.string.qz6_q8_a2);
            QzAns3.setText(R.string.qz6_q8_a3);
            QzAns4.setText(R.string.qz6_q8_a4);
            CurrentAnswer = QQQ8A6;
        }   if (CurrentQuestion == 58) {
            Question.setText((R.string.qz6_q9));
            QzAns1.setText(R.string.qz6_q9_a1);
            QzAns2.setText(R.string.qz6_q9_a2);
            QzAns3.setText(R.string.qz6_q9_a3);
            QzAns4.setText(R.string.qz6_q9_a4);
            CurrentAnswer = QQQ9A6;
        }   if (CurrentQuestion == 59) {
            Question.setText((R.string.qz6_q10));
            QzAns1.setText(R.string.qz6_q10_a1);
            QzAns2.setText(R.string.qz6_q10_a2);
            QzAns3.setText(R.string.qz6_q10_a3);
            QzAns4.setText(R.string.qz6_q10_a4);
            CurrentAnswer = QQQ10A6;

        }



    }

    public void RandomQuestionSubmit(View v) {

        EditText answer = (EditText) findViewById(R.id.randomquestion_responce);

        if (answer.getText().toString().equals("")) {
            Context context = getApplicationContext();
            CharSequence text = "Please insert a valid response";
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        }else {
            int Answer = Integer.parseInt(answer.getText().toString());


            if (Answer > 0 && Answer <= 4) {

                if (Answer == CurrentAnswer) {

                    DisplayResults(1);

                } else {

                    DisplayResults(0);

                }
                answer.setText(""); //SET BACK TO NON WHEN DONE DEBUGGING
            } else {
                Context context = getApplicationContext();
                CharSequence text = "Please insert a valid response";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();


            }
            //MAKE SURE IT WORKS CORRECTLY WITH OTHER NUMERS THAT ARENT 0 UP TP 4
        }
    }


    public void DisplayResults(int answer){

        TextView Question = (TextView) findViewById(R.id.randomquestion_question);
        TextView Answer1 = (TextView) findViewById(R.id.randomquestion_a1);
        TextView Answer2 = (TextView) findViewById(R.id.randomquestion_a2);
        TextView Answer3 = (TextView) findViewById(R.id.randomquestion_a3);
        TextView Answer4 = (TextView) findViewById(R.id.randomquestion_a4);
        TextView YayNey = (TextView)findViewById(R.id.randomquestion_yeyney);
        EditText responce = (EditText)findViewById(R.id.randomquestion_responce);
        Button submit = (Button)findViewById(R.id.randomquestion_submit);
        Button next = (Button)findViewById(R.id.randomquestion_next_button);


        Question.setVisibility(View.INVISIBLE);
        Answer1.setVisibility(View.INVISIBLE);
        Answer2.setVisibility(View.INVISIBLE);
        Answer3.setVisibility(View.INVISIBLE);
        Answer4.setVisibility(View.INVISIBLE);
        submit.setVisibility(View.INVISIBLE);
        responce.setVisibility(View.INVISIBLE);

        YayNey.setVisibility(View.VISIBLE);

        if(answer == 1 ){

            YayNey.setText("Correct!");

        } else {
            YayNey.setText("Incorrect!");
        }

        next.setVisibility(View.VISIBLE);



    }

    public void RandomQuestionNext(View v) {
        AnalyticsSender("Next");



        RandomQuestionStarter();
        Button button = (Button)findViewById(R.id.randomquestion_next_button);
        button.setVisibility(View.INVISIBLE);

    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_random_question, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
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

    public static final int Q1A = 3;
    public static final int Q2A = 3;
    public static final int Q3A = 3;
    public static final int Q4A = 2;
    public static final int Q5A = 3;
    public static final int Q6A = 2;
    public static final int Q7A = 3;
    public static final int Q8A = 3;
    public static final int Q9A = 2;
    public static final int Q10A = 4;
    //Answer Key for Quiz #2---
    public static final int QQ1A = 3;
    public static final int QQ2A = 2;
    public static final int QQ3A = 3;
    public static final int QQ4A = 3;
    public static final int QQ5A = 3;
    public static final int QQ6A = 1;
    public static final int QQ7A = 4;
    public static final int QQ8A = 1;
    public static final int QQ9A = 4;
    public static final int QQ10A = 2;
    //Answer Key for Quiz #3---
    public static final int QQQ1A = 3;
    public static final int QQQ2A = 4;
    public static final int QQQ3A = 4;
    public static final int QQQ4A = 3;
    public static final int QQQ5A = 2;
    public static final int QQQ6A = 3;
    public static final int QQQ7A = 4;
    public static final int QQQ8A = 2;
    public static final int QQQ9A = 2;
    public static final int QQQ10A = 1;
    //Answer Key for Quiz #4---
    public static final int Q1A4 = 4;
    public static final int Q2A4 = 2;
    public static final int Q3A4 = 4;
    public static final int Q4A4 = 4;
    public static final int Q5A4 = 1;
    public static final int Q6A4 = 3;
    public static final int Q7A4 = 4;
    public static final int Q8A4 = 2;
    public static final int Q9A4 = 4;
    public static final int Q10A4 = 4;
    //Answer Key for Quiz #5---
    public static final int QQ1A5 = 3;
    public static final int QQ2A5 = 1;
    public static final int QQ3A5 = 1;
    public static final int QQ4A5 = 2;
    public static final int QQ5A5 = 2;
    public static final int QQ6A5 = 1;
    public static final int QQ7A5 = 4;
    public static final int QQ8A5 = 2;
    public static final int QQ9A5 = 2;
    public static final int QQ10A5 = 2;
    //Answer Key for Quiz #6---
    public static final int QQQ1A6 = 4;
    public static final int QQQ2A6 = 1;
    public static final int QQQ3A6 = 3;
    public static final int QQQ4A6 = 3;
    public static final int QQQ5A6 = 4;
    public static final int QQQ6A6 = 2;
    public static final int QQQ7A6 = 3;
    public static final int QQQ8A6 = 4;
    public static final int QQQ9A6 = 3;
    public static final int QQQ10A6 = 3;
    }


