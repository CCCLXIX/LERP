package simple.lerp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import junit.framework.TestCase;

import org.w3c.dom.Text;


public class QuizzActivity extends ActionBarActivity {


    Context context = this;



    int TotalScore = 0;
    int CurrentQuestion = 0;
    int CurrentAnswer = 0;
    int CurrentQuizz = 0;
    private int q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        // sets full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Hides The action bar from the users view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("Quiz");
        t.send(new HitBuilders.AppViewBuilder().build());

        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);

        CR.moveToFirst();
        //DBName = CR.getString(0);
        //Email = CR.getString(1);
        //Pass = CR.getString(2);
        //Quizone = CR.getString(3);
        //QuizTwo = CR.getString(4);
        //QuizThree = CR.getString(5);
        //QuizFour = CR.getString(6);
        //QuizFive = CR.getString(7);
        //QuizSix = CR.getString(8);
        //CurrentQuizz = CR.getString(9);
        //QuizSelectedReview = CR.getString(10);

        String CurrentQuiz = CR.getString(9);  // The column 9 because in there's store the value passed from Quizzes

        CurrentQuizz = Integer.parseInt(CurrentQuiz);
        Log.d("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK",CurrentQuiz);

        QuizzNumberInput();
    }





    public void QuizzNumberInput() {
        if (CurrentQuizz == 1) {
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(3);
            int Check = Integer.parseInt(check);
                if (Check <0) {

                    QuizNumberOneSetup();
                    RelativeLayout QuizzLayout = (RelativeLayout)findViewById(R.id.QuizzLayout);

                    QuizzLayout.setBackgroundResource(R.drawable.background_quiz1_2);

                }   else {
                    Context context = getApplicationContext();
                    CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                    toast.show();
                    Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                    QuizzActivity.this.startActivity(intent);
                    finish();
                }
        }


        if (CurrentQuizz == 2){
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(4);
            int Check = Integer.parseInt(check);  // If the int Check is bigger than zero it means that there was a quizzes taken.
                if (Check <0) {

                QuizNumberTwoSetup();
                    RelativeLayout QuizzLayout = (RelativeLayout)findViewById(R.id.QuizzLayout);

                    QuizzLayout.setBackgroundResource(R.drawable.background_quiz2_2);

                }   else {
                    Context context = getApplicationContext();
                    CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                    toast.show();
                    Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                    QuizzActivity.this.startActivity(intent);
                    finish();
            }

        }

        if (CurrentQuizz == 3){
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(5);
            int Check = Integer.parseInt(check);
            if (Check <0) {

                QuizNumberThreeSetup();

            }   else {
                Context context = getApplicationContext();
                CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                QuizzActivity.this.startActivity(intent);
                finish();
            }

        }
        if (CurrentQuizz == 4){
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(6);
            int Check = Integer.parseInt(check);
            if (Check <0) {

                QuizNumberFourSetup();

            }   else {
                Context context = getApplicationContext();
                CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                QuizzActivity.this.startActivity(intent);
                finish();
            }

        }
        if (CurrentQuizz == 5){
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(7);
            int Check = Integer.parseInt(check);
            if (Check <0) {

                QuizNumberFiveSetup();
            }   else {
                Context context = getApplicationContext();
                CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                QuizzActivity.this.startActivity(intent);
                finish();
            }

        }
        if (CurrentQuizz == 6){
            DatabaseOperations DB = new DatabaseOperations(context);
            Cursor CR = DB.getInformation(DB);
            CR.moveToFirst();
            String check = CR.getString(8);
            int Check = Integer.parseInt(check);
            if (Check <0) {

                QuizNumberSixSetup();

            }   else {
                Context context = getApplicationContext();
                CharSequence text = "Quiz Already Taken! Please follow instructions in Account Management to reset Quiz.";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(QuizzActivity.this, Quizzes.class);
                QuizzActivity.this.startActivity(intent);
                finish();
            }

        }
    }


    public void QuizNumberOneSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = Q1A;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz1_q2));
            QzAns1.setText(R.string.qz1_q2_a1);
            QzAns2.setText(R.string.qz1_q2_a2);
            QzAns3.setText(R.string.qz1_q2_a3);
            QzAns4.setText(R.string.qz1_q2_a4);

            CurrentAnswer = Q2A;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz1_q3));
            QzAns1.setText(R.string.qz1_q3_a1);
            QzAns2.setText(R.string.qz1_q3_a2);
            QzAns3.setText(R.string.qz1_q3_a3);
            QzAns4.setText(R.string.qz1_q3_a4);
            CurrentAnswer = Q3A;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz1_q4));
            QzAns1.setText(R.string.qz1_q4_a1);
            QzAns2.setText(R.string.qz1_q4_a2);
            QzAns3.setText(R.string.qz1_q4_a3);
            QzAns4.setText(R.string.qz1_q4_a4);
            CurrentAnswer = Q4A;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz1_q5));
            QzAns1.setText(R.string.qz1_q5_a1);
            QzAns2.setText(R.string.qz1_q5_a2);
            QzAns3.setText(R.string.qz1_q5_a3);
            QzAns4.setText(R.string.qz1_q5_a4);
            CurrentAnswer = Q5A;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz1_q6));
            QzAns1.setText(R.string.qz1_q6_a1);
            QzAns2.setText(R.string.qz1_q6_a2);
            QzAns3.setText(R.string.qz1_q6_a3);
            QzAns4.setText(R.string.qz1_q6_a4);
            CurrentAnswer = Q6A;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz1_q7));
            QzAns1.setText(R.string.qz1_q7_a1);
            QzAns2.setText(R.string.qz1_q7_a2);
            QzAns3.setText(R.string.qz1_q7_a3);
            QzAns4.setText(R.string.qz1_q7_a4);
            CurrentAnswer = Q7A;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz1_q8));
            QzAns1.setText(R.string.qz1_q8_a1);
            QzAns2.setText(R.string.qz1_q8_a2);
            QzAns3.setText(R.string.qz1_q8_a3);
            QzAns4.setText(R.string.qz1_q8_a4);
            CurrentAnswer = Q8A;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz1_q9));
            QzAns1.setText(R.string.qz1_q9_a1);
            QzAns2.setText(R.string.qz1_q9_a2);
            QzAns3.setText(R.string.qz1_q9_a3);
            QzAns4.setText(R.string.qz1_q9_a4);
            CurrentAnswer = Q9A;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz1_q10));
            QzAns1.setText(R.string.qz1_q10_a1);
            QzAns2.setText(R.string.qz1_q10_a2);
            QzAns3.setText(R.string.qz1_q10_a3);
            QzAns4.setText(R.string.qz1_q10_a4);
            CurrentAnswer = Q10A;

        }
        if (CurrentQuestion== 10){
            DisplayResults();
            DBImput(1);
        }


    }

    public void QuizNumberTwoSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        Question.setText(R.string.qz2_q1);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        QzAns1.setText(R.string.qz2_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        QzAns2.setText(R.string.qz2_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        QzAns3.setText(R.string.qz2_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        QzAns4.setText(R.string.qz2_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = QQ1A;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz2_q2));
            QzAns1.setText(R.string.qz2_q2_a1);
            QzAns2.setText(R.string.qz2_q2_a2);
            QzAns3.setText(R.string.qz2_q2_a3);
            QzAns4.setText(R.string.qz2_q2_a4);

            CurrentAnswer = QQ2A;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz2_q3));
            QzAns1.setText(R.string.qz2_q3_a1);
            QzAns2.setText(R.string.qz2_q3_a2);
            QzAns3.setText(R.string.qz2_q3_a3);
            QzAns4.setText(R.string.qz2_q3_a4);
            CurrentAnswer = QQ3A;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz2_q4));
            QzAns1.setText(R.string.qz2_q4_a1);
            QzAns2.setText(R.string.qz2_q4_a2);
            QzAns3.setText(R.string.qz2_q4_a3);
            QzAns4.setText(R.string.qz2_q4_a4);
            CurrentAnswer = QQ4A;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz2_q5));
            QzAns1.setText(R.string.qz2_q5_a1);
            QzAns2.setText(R.string.qz2_q5_a2);
            QzAns3.setText(R.string.qz2_q5_a3);
            QzAns4.setText(R.string.qz2_q5_a4);
            CurrentAnswer = QQ5A;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz2_q6));
            QzAns1.setText(R.string.qz2_q6_a1);
            QzAns2.setText(R.string.qz2_q6_a2);
            QzAns3.setText(R.string.qz2_q6_a3);
            QzAns4.setText(R.string.qz2_q6_a4);
            CurrentAnswer = QQ6A;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz2_q7));
            QzAns1.setText(R.string.qz2_q7_a1);
            QzAns2.setText(R.string.qz2_q7_a2);
            QzAns3.setText(R.string.qz2_q7_a3);
            QzAns4.setText(R.string.qz2_q7_a4);
            CurrentAnswer = QQ7A;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz2_q8));
            QzAns1.setText(R.string.qz2_q8_a1);
            QzAns2.setText(R.string.qz2_q8_a2);
            QzAns3.setText(R.string.qz2_q8_a3);
            QzAns4.setText(R.string.qz2_q8_a4);
            CurrentAnswer = QQ8A;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz2_q9));
            QzAns1.setText(R.string.qz2_q9_a1);
            QzAns2.setText(R.string.qz2_q9_a2);
            QzAns3.setText(R.string.qz2_q9_a3);
            QzAns4.setText(R.string.qz2_q9_a4);
            CurrentAnswer = QQ9A;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz2_q10));
            QzAns1.setText(R.string.qz2_q10_a1);
            QzAns2.setText(R.string.qz2_q10_a2);
            QzAns3.setText(R.string.qz2_q10_a3);
            QzAns4.setText(R.string.qz2_q10_a4);
            CurrentAnswer = QQ10A;

        }
        if (CurrentQuestion== 10){

            DisplayResults();
            DBImput(2);

        }


    }

    public void QuizNumberThreeSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        Question.setText(R.string.qz3_q1);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        QzAns1.setText(R.string.qz3_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        QzAns2.setText(R.string.qz3_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        QzAns3.setText(R.string.qz3_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        QzAns4.setText(R.string.qz3_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = QQQ1A;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz3_q2));
            QzAns1.setText(R.string.qz3_q2_a1);
            QzAns2.setText(R.string.qz3_q2_a2);
            QzAns3.setText(R.string.qz3_q2_a3);
            QzAns4.setText(R.string.qz3_q2_a4);

            CurrentAnswer = QQQ2A;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz3_q3));
            QzAns1.setText(R.string.qz3_q3_a1);
            QzAns2.setText(R.string.qz3_q3_a2);
            QzAns3.setText(R.string.qz3_q3_a3);
            QzAns4.setText(R.string.qz3_q3_a4);
            CurrentAnswer = QQQ3A;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz3_q4));
            QzAns1.setText(R.string.qz3_q4_a1);
            QzAns2.setText(R.string.qz3_q4_a2);
            QzAns3.setText(R.string.qz3_q4_a3);
            QzAns4.setText(R.string.qz3_q4_a4);
            CurrentAnswer = QQQ4A;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz3_q5));
            QzAns1.setText(R.string.qz3_q5_a1);
            QzAns2.setText(R.string.qz3_q5_a2);
            QzAns3.setText(R.string.qz3_q5_a3);
            QzAns4.setText(R.string.qz3_q5_a4);
            CurrentAnswer = QQQ5A;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz3_q6));
            QzAns1.setText(R.string.qz3_q6_a1);
            QzAns2.setText(R.string.qz3_q6_a2);
            QzAns3.setText(R.string.qz3_q6_a3);
            QzAns4.setText(R.string.qz3_q6_a4);
            CurrentAnswer = QQQ6A;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz3_q7));
            QzAns1.setText(R.string.qz3_q7_a1);
            QzAns2.setText(R.string.qz3_q7_a2);
            QzAns3.setText(R.string.qz3_q7_a3);
            QzAns4.setText(R.string.qz3_q7_a4);
            CurrentAnswer = QQQ7A;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz3_q8));
            QzAns1.setText(R.string.qz3_q8_a1);
            QzAns2.setText(R.string.qz3_q8_a2);
            QzAns3.setText(R.string.qz3_q8_a3);
            QzAns4.setText(R.string.qz3_q8_a4);
            CurrentAnswer = QQQ8A;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz3_q9));
            QzAns1.setText(R.string.qz3_q9_a1);
            QzAns2.setText(R.string.qz3_q9_a2);
            QzAns3.setText(R.string.qz3_q9_a3);
            QzAns4.setText(R.string.qz3_q9_a4);
            CurrentAnswer = QQQ9A;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz3_q10));
            QzAns1.setText(R.string.qz3_q10_a1);
            QzAns2.setText(R.string.qz3_q10_a2);
            QzAns3.setText(R.string.qz3_q10_a3);
            QzAns4.setText(R.string.qz3_q10_a4);
            CurrentAnswer = QQQ10A;

        }
        if (CurrentQuestion== 10){
            DisplayResults();
            DBImput(3);
        }


    }
    public void QuizNumberFourSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        Question.setText(R.string.qz4_q1);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        QzAns1.setText(R.string.qz4_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        QzAns2.setText(R.string.qz4_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        QzAns3.setText(R.string.qz4_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        QzAns4.setText(R.string.qz4_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = Q1A4;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz4_q2));
            QzAns1.setText(R.string.qz4_q2_a1);
            QzAns2.setText(R.string.qz4_q2_a2);
            QzAns3.setText(R.string.qz4_q2_a3);
            QzAns4.setText(R.string.qz4_q2_a4);

            CurrentAnswer = Q2A4;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz4_q3));
            QzAns1.setText(R.string.qz4_q3_a1);
            QzAns2.setText(R.string.qz4_q3_a2);
            QzAns3.setText(R.string.qz4_q3_a3);
            QzAns4.setText(R.string.qz4_q3_a4);
            CurrentAnswer = Q3A4;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz4_q4));
            QzAns1.setText(R.string.qz4_q4_a1);
            QzAns2.setText(R.string.qz4_q4_a2);
            QzAns3.setText(R.string.qz4_q4_a3);
            QzAns4.setText(R.string.qz4_q4_a4);
            CurrentAnswer = Q4A4;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz4_q5));
            QzAns1.setText(R.string.qz4_q5_a1);
            QzAns2.setText(R.string.qz4_q5_a2);
            QzAns3.setText(R.string.qz4_q5_a3);
            QzAns4.setText(R.string.qz4_q5_a4);
            CurrentAnswer = Q5A4;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz4_q6));
            QzAns1.setText(R.string.qz4_q6_a1);
            QzAns2.setText(R.string.qz4_q6_a2);
            QzAns3.setText(R.string.qz4_q6_a3);
            QzAns4.setText(R.string.qz4_q6_a4);
            CurrentAnswer = Q6A4;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz4_q7));
            QzAns1.setText(R.string.qz4_q7_a1);
            QzAns2.setText(R.string.qz4_q7_a2);
            QzAns3.setText(R.string.qz4_q7_a3);
            QzAns4.setText(R.string.qz4_q7_a4);
            CurrentAnswer = Q7A4;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz4_q8));
            QzAns1.setText(R.string.qz4_q8_a1);
            QzAns2.setText(R.string.qz4_q8_a2);
            QzAns3.setText(R.string.qz4_q8_a3);
            QzAns4.setText(R.string.qz4_q8_a4);
            CurrentAnswer = Q8A4;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz4_q9));
            QzAns1.setText(R.string.qz4_q9_a1);
            QzAns2.setText(R.string.qz4_q9_a2);
            QzAns3.setText(R.string.qz4_q9_a3);
            QzAns4.setText(R.string.qz4_q9_a4);
            CurrentAnswer = Q9A4;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz4_q10));
            QzAns1.setText(R.string.qz4_q10_a1);
            QzAns2.setText(R.string.qz4_q10_a2);
            QzAns3.setText(R.string.qz4_q10_a3);
            QzAns4.setText(R.string.qz4_q10_a4);
            CurrentAnswer = Q10A4;

        }
        if (CurrentQuestion== 10){
            DisplayResults();
            DBImput(4);
        }


    }
    public void QuizNumberFiveSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        Question.setText(R.string.qz5_q1);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        QzAns1.setText(R.string.qz5_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        QzAns2.setText(R.string.qz5_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        QzAns3.setText(R.string.qz5_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        QzAns4.setText(R.string.qz5_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = QQ1A5;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz5_q2));
            QzAns1.setText(R.string.qz5_q2_a1);
            QzAns2.setText(R.string.qz5_q2_a2);
            QzAns3.setText(R.string.qz5_q2_a3);
            QzAns4.setText(R.string.qz5_q2_a4);

            CurrentAnswer = QQ2A5;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz5_q3));
            QzAns1.setText(R.string.qz5_q3_a1);
            QzAns2.setText(R.string.qz5_q3_a2);
            QzAns3.setText(R.string.qz5_q3_a3);
            QzAns4.setText(R.string.qz5_q3_a4);
            CurrentAnswer = QQ3A5;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz5_q4));
            QzAns1.setText(R.string.qz5_q4_a1);
            QzAns2.setText(R.string.qz5_q4_a2);
            QzAns3.setText(R.string.qz5_q4_a3);
            QzAns4.setText(R.string.qz5_q4_a4);
            CurrentAnswer = QQ4A5;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz5_q5));
            QzAns1.setText(R.string.qz5_q5_a1);
            QzAns2.setText(R.string.qz5_q5_a2);
            QzAns3.setText(R.string.qz5_q5_a3);
            QzAns4.setText(R.string.qz5_q5_a4);
            CurrentAnswer = QQ5A5;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz5_q6));
            QzAns1.setText(R.string.qz5_q6_a1);
            QzAns2.setText(R.string.qz5_q6_a2);
            QzAns3.setText(R.string.qz5_q6_a3);
            QzAns4.setText(R.string.qz5_q6_a4);
            CurrentAnswer = QQ6A5;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz5_q7));
            QzAns1.setText(R.string.qz5_q7_a1);
            QzAns2.setText(R.string.qz5_q7_a2);
            QzAns3.setText(R.string.qz5_q7_a3);
            QzAns4.setText(R.string.qz5_q7_a4);
            CurrentAnswer = QQ7A5;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz5_q8));
            QzAns1.setText(R.string.qz5_q8_a1);
            QzAns2.setText(R.string.qz5_q8_a2);
            QzAns3.setText(R.string.qz5_q8_a3);
            QzAns4.setText(R.string.qz5_q8_a4);
            CurrentAnswer = QQ8A5;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz5_q9));
            QzAns1.setText(R.string.qz5_q9_a1);
            QzAns2.setText(R.string.qz5_q9_a2);
            QzAns3.setText(R.string.qz5_q9_a3);
            QzAns4.setText(R.string.qz5_q9_a4);
            CurrentAnswer = QQ9A5;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz5_q10));
            QzAns1.setText(R.string.qz5_q10_a1);
            QzAns2.setText(R.string.qz5_q10_a2);
            QzAns3.setText(R.string.qz5_q10_a3);
            QzAns4.setText(R.string.qz5_q10_a4);
            CurrentAnswer = QQ10A5;

        }
        if (CurrentQuestion== 10){
            DisplayResults();
            DBImput(5);
        }


    }
    public void QuizNumberSixSetup(){
        TextView Question= (TextView) findViewById(R.id.question);
        Question.setText(R.string.qz6_q1);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        QzAns1.setText(R.string.qz6_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        QzAns2.setText(R.string.qz6_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        QzAns3.setText(R.string.qz6_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        QzAns4.setText(R.string.qz6_a4);
        TextView Results = (TextView)findViewById(R.id.results);
        Button Home = (Button)findViewById(R.id.home);
        Results.setVisibility(View.INVISIBLE);
        Home.setVisibility(View.INVISIBLE);


        if (CurrentQuestion == 0) {
            CurrentAnswer = QQQ1A6;

        }   if (CurrentQuestion == 1) {
            Question.setText((R.string.qz6_q2));
            QzAns1.setText(R.string.qz6_q2_a1);
            QzAns2.setText(R.string.qz6_q2_a2);
            QzAns3.setText(R.string.qz6_q2_a3);
            QzAns4.setText(R.string.qz6_q2_a4);

            CurrentAnswer = QQQ2A6;

        }   if (CurrentQuestion == 2) {
            Question.setText((R.string.qz6_q3));
            QzAns1.setText(R.string.qz6_q3_a1);
            QzAns2.setText(R.string.qz6_q3_a2);
            QzAns3.setText(R.string.qz6_q3_a3);
            QzAns4.setText(R.string.qz6_q3_a4);
            CurrentAnswer = QQQ3A6;
        }   if (CurrentQuestion == 3) {
            Question.setText((R.string.qz6_q4));
            QzAns1.setText(R.string.qz6_q4_a1);
            QzAns2.setText(R.string.qz6_q4_a2);
            QzAns3.setText(R.string.qz6_q4_a3);
            QzAns4.setText(R.string.qz6_q4_a4);
            CurrentAnswer = QQQ4A6;
        }   if (CurrentQuestion == 4) {
            Question.setText((R.string.qz6_q5));
            QzAns1.setText(R.string.qz6_q5_a1);
            QzAns2.setText(R.string.qz6_q5_a2);
            QzAns3.setText(R.string.qz6_q5_a3);
            QzAns4.setText(R.string.qz6_q5_a4);
            CurrentAnswer = QQQ5A6;
        }   if (CurrentQuestion == 5) {
            Question.setText((R.string.qz6_q6));
            QzAns1.setText(R.string.qz6_q6_a1);
            QzAns2.setText(R.string.qz6_q6_a2);
            QzAns3.setText(R.string.qz6_q6_a3);
            QzAns4.setText(R.string.qz6_q6_a4);
            CurrentAnswer = QQQ6A6;
        }   if (CurrentQuestion == 6) {
            Question.setText((R.string.qz6_q7));
            QzAns1.setText(R.string.qz6_q7_a1);
            QzAns2.setText(R.string.qz6_q7_a2);
            QzAns3.setText(R.string.qz6_q7_a3);
            QzAns4.setText(R.string.qz6_q7_a4);
            CurrentAnswer = QQQ7A6;
        }   if (CurrentQuestion == 7) {
            Question.setText((R.string.qz6_q8));
            QzAns1.setText(R.string.qz6_q8_a1);
            QzAns2.setText(R.string.qz6_q8_a2);
            QzAns3.setText(R.string.qz6_q8_a3);
            QzAns4.setText(R.string.qz6_q8_a4);
            CurrentAnswer = QQQ8A6;
        }   if (CurrentQuestion == 8) {
            Question.setText((R.string.qz6_q9));
            QzAns1.setText(R.string.qz6_q9_a1);
            QzAns2.setText(R.string.qz6_q9_a2);
            QzAns3.setText(R.string.qz6_q9_a3);
            QzAns4.setText(R.string.qz6_q9_a4);
            CurrentAnswer = QQQ9A6;
        }   if (CurrentQuestion == 9) {
            Question.setText((R.string.qz6_q10));
            QzAns1.setText(R.string.qz6_q10_a1);
            QzAns2.setText(R.string.qz6_q10_a2);
            QzAns3.setText(R.string.qz6_q10_a3);
            QzAns4.setText(R.string.qz6_q10_a4);
            CurrentAnswer = QQQ10A6;

        }
        if (CurrentQuestion== 10){
            DisplayResults();
            DBImput(6);
        }


    }


    public void DisplayResults(){

        TextView Question= (TextView) findViewById(R.id.question);
        TextView QzAns1 = (TextView)findViewById(R.id.qz1_a1);
        TextView QzAns2 = (TextView)findViewById(R.id.qz1_a2);
        TextView QzAns3 = (TextView)findViewById(R.id.qz1_a3);
        TextView QzAns4 = (TextView)findViewById(R.id.qz1_a4);
        Button Home = (Button)findViewById(R.id.home);
        Button SubmitAnswer = (Button)findViewById(R.id.submit_answer);
        EditText Response = (EditText)findViewById(R.id.answer);
        TextView Results = (TextView)findViewById(R.id.results);

        DBForQuizResults DBQR = new DBForQuizResults(this);
        Cursor CR = DBQR.getInformation(DBQR,Integer.toString(CurrentQuizz));
        DBQR.UpdateQuizResult(DBQR,Integer.toString(CurrentQuizz),q1,q2,q3,q4,q5,q6,q7,q8,q9,q10);
        CR.moveToFirst();
        Log.d("Count",String.valueOf(CR.getCount()));
        int cucu = CR.getInt(0);
        int cucu2 = CR.getInt(2);
        int cucu3 = CR.getInt(3);
        int cucu4 = CR.getInt(4);
        int cucu5 = CR.getInt(5);
        int cucu6 = CR.getInt(6);
        int cucu7 = CR.getInt(7);
        int cucu8 = CR.getInt(8);
        int cucu9 = CR.getInt(9);
        int cucu10 = CR.getInt(10);



        Question.setText("");
        QzAns1.setText("");
        QzAns2.setText("");
        QzAns3.setText("");
        QzAns4.setText("");
        SubmitAnswer.setVisibility(View.INVISIBLE);
        Response.setVisibility(View.INVISIBLE);
        Results.setVisibility(View.VISIBLE);
        Home.setVisibility(View.VISIBLE);

        Results.setText("Result: "+ TotalScore+"/10 ["+cucu+cucu2+cucu3+cucu4+cucu5+cucu6+cucu7+cucu8+cucu9+cucu10+"]");


    }

    public void DBImput(int v){
        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);

        String DBName, Email, Pass;

        CR.moveToFirst();
        DBName = CR.getString(0);
        Email = CR.getString(1);
        Pass = CR.getString(2);

        if (v == 1) {
            DB.updateQuizzOne(DB, DBName, Email, Pass, TotalScore);
            Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
            TotalScore = 0;
        }

        if (v == 2){
            DB.updateQuizzTwo(DB, DBName, Email, Pass, TotalScore);
            TotalScore = 0;
        }

        if (v == 3){
            DB.updateQuizzThree(DB, DBName, Email, Pass, TotalScore);
            TotalScore = 0;
        }
        if (v == 4){
            DB.updateQuizzFour(DB, DBName, Email, Pass, TotalScore);
            TotalScore = 0;
        }
        if (v == 5){
            DB.updateQuizzFive(DB, DBName, Email, Pass, TotalScore);
            TotalScore = 0;
        }
        if (v == 6){
            DB.updateQuizzSix(DB, DBName, Email, Pass, TotalScore);
            TotalScore = 0;
        }

    }



    public void ScoreReviewHandler ( int QuestionResult){
        if (CurrentQuestion==0){
            q1=QuestionResult;
        } if (CurrentQuestion == 1){
            q2=QuestionResult;
        } if (CurrentQuestion==2){
            q3=QuestionResult;
        } if (CurrentQuestion == 3){
            q4=QuestionResult;
        } if (CurrentQuestion==4){
            q5=QuestionResult;
        } if (CurrentQuestion == 5){
            q6=QuestionResult;
        } if (CurrentQuestion==6){
            q7=QuestionResult;
        } if (CurrentQuestion == 7){
            q8=QuestionResult;
        } if (CurrentQuestion==8){
            q9=QuestionResult;
        } if (CurrentQuestion == 9){
            q10=QuestionResult;
        }


    }

    public void ScoreCounter  (int UserAnswer){

        CurrentQuestion ++;

        if (CurrentAnswer == UserAnswer){
            TotalScore++;
        }

    }


    public void Submit (View v) {

        EditText answer = (EditText)findViewById(R.id.answer);
        if (answer.getText().toString().equals("")) {
            Context context = getApplicationContext();
            CharSequence text = "Please insert a valid response";
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        }else {

            int Answer = Integer.parseInt(answer.getText().toString());


            if (Answer > 0 && Answer <= 4) {

                if (Answer == CurrentAnswer) {

                    Context context = getApplicationContext();
                    CharSequence text = "Correct!";
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                    ScoreReviewHandler(Answer);

                } else {
                    Context context = getApplicationContext();
                    CharSequence text = "Incorrect!";
                    Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                    toast.show();
                    ScoreReviewHandler(Answer);

                }
                answer.setText(""); //SET BACK TO NON WHEN DONE DEBUGGING
                ScoreCounter(Answer);
                if (CurrentQuizz == 1) {
                    QuizNumberOneSetup();
                }
                if (CurrentQuizz == 2) {
                    QuizNumberTwoSetup();
                }
                if (CurrentQuizz == 3) {
                    QuizNumberThreeSetup();
                }
                if (CurrentQuizz == 4) {
                    QuizNumberFourSetup();
                }
                if (CurrentQuizz == 5) {
                    QuizNumberFiveSetup();
                }
                if (CurrentQuizz == 6) {
                    QuizNumberSixSetup();
                }

            } else {

                Context context = getApplicationContext();
                CharSequence text = "Please provide a valid choice!";
                Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                toast.show();
                answer.setText("");

            }


        }

    }

//    public String Grade (String s){

     //   DatabaseOperations DB = new DatabaseOperations(context);
      //  Cursor CR = new Cursor(DB);




     //   return ()
   // }

    public void GoHome(View v){

        Intent intent = new Intent(QuizzActivity.this,Main_Menu.class);
        QuizzActivity.this.startActivity(intent);
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quizz, menu);
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

    //Answer Key for Quiz #1---
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
