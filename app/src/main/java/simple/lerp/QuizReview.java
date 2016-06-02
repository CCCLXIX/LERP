package simple.lerp;

        import android.content.Context;
        import android.database.Cursor;
        import android.graphics.Color;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TextView;



public class QuizReview extends ActionBarActivity {
    Context context = this;
    int ccc = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_review);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        TextView PossibleQ1 = (TextView)findViewById(R.id.Review_QuizOption);
        DatabaseOperations DB = new DatabaseOperations(context);
        Cursor CR = DB.getInformation(DB);
        CR.moveToFirst();
        int quizSelectedInt = CR.getInt(10);



        if (quizSelectedInt ==1){


            CR.moveToFirst();
            String q = CR.getString(3);
            PossibleQ1.setText("Quiz 1 - "+ q+"/10");

            TextCareTaker(1);

        }
        if (quizSelectedInt == 2){

            CR.moveToFirst();
            String q = CR.getString(4);
            PossibleQ1.setText("Quiz 2 - "+ q+"/10");

            TextCareTaker(2);

        }
        if (quizSelectedInt == 3){

            CR.moveToFirst();
            String q = CR.getString(5);
            PossibleQ1.setText("Quiz 3 - "+ q+"/10");

            TextCareTaker(3);

        }
        if (quizSelectedInt == 4){

            CR.moveToFirst();
            String q = CR.getString(6);
            PossibleQ1.setText("Quiz 4 - "+ q+"/10");


            TextCareTaker(4);

        }
        if (quizSelectedInt == 5){

            CR.moveToFirst();
            String q = CR.getString(7);
            PossibleQ1.setText("Quiz 5 - "+ q+"/10");

            TextCareTaker(5);

        }
        if (quizSelectedInt == 6){

            CR.moveToFirst();
            String q = CR.getString(8);
            PossibleQ1.setText("Quiz 6 - "+ q+"/10");
            TextCareTaker(6);

        }

    }

    public void TextCareTaker(int b) {

        TextView Review = (TextView) findViewById(R.id.ReviewTextQuestion);
        TextView ReviewQ1P1 = (TextView) findViewById(R.id.RTQ1PA1);
        TextView ReviewQ1P2 = (TextView) findViewById(R.id.RTQ1PA2);
        TextView ReviewQ1P3 = (TextView) findViewById(R.id.RTQ1PA3);
        TextView ReviewQ1P4 = (TextView) findViewById(R.id.RTQ1PA4);

        TextView Review2 = (TextView) findViewById(R.id.ReviewTextQuestion2);
        TextView ReviewQ2P1 = (TextView) findViewById(R.id.RTQ2PA1);
        TextView ReviewQ2P2 = (TextView) findViewById(R.id.RTQ2PA2);
        TextView ReviewQ2P3 = (TextView) findViewById(R.id.RTQ2PA3);
        TextView ReviewQ2P4 = (TextView) findViewById(R.id.RTQ2PA4);

        TextView Review3 = (TextView) findViewById(R.id.ReviewTextQuestion3);
        TextView ReviewQ3P1 = (TextView) findViewById(R.id.RTQ3PA1);
        TextView ReviewQ3P2 = (TextView) findViewById(R.id.RTQ3PA2);
        TextView ReviewQ3P3 = (TextView) findViewById(R.id.RTQ3PA3);
        TextView ReviewQ3P4 = (TextView) findViewById(R.id.RTQ3PA4);

        TextView Review4 = (TextView) findViewById(R.id.ReviewTextQuestion4);
        TextView ReviewQ4P1 = (TextView) findViewById(R.id.RTQ4PA1);
        TextView ReviewQ4P2 = (TextView) findViewById(R.id.RTQ4PA2);
        TextView ReviewQ4P3 = (TextView) findViewById(R.id.RTQ4PA3);
        TextView ReviewQ4P4 = (TextView) findViewById(R.id.RTQ4PA4);

        TextView Review5 = (TextView) findViewById(R.id.ReviewTextQuestion5);
        TextView ReviewQ5P1 = (TextView) findViewById(R.id.RTQ5PA1);
        TextView ReviewQ5P2 = (TextView) findViewById(R.id.RTQ5PA2);
        TextView ReviewQ5P3 = (TextView) findViewById(R.id.RTQ5PA3);
        TextView ReviewQ5P4 = (TextView) findViewById(R.id.RTQ5PA4);

        TextView Review6 = (TextView) findViewById(R.id.ReviewTextQuestion6);
        TextView ReviewQ6P1 = (TextView) findViewById(R.id.RTQ6PA1);
        TextView ReviewQ6P2 = (TextView) findViewById(R.id.RTQ6PA2);
        TextView ReviewQ6P3 = (TextView) findViewById(R.id.RTQ6PA3);
        TextView ReviewQ6P4 = (TextView) findViewById(R.id.RTQ6PA4);

        TextView Review7 = (TextView) findViewById(R.id.ReviewTextQuestion7);
        TextView ReviewQ7P1 = (TextView) findViewById(R.id.RTQ7PA1);
        TextView ReviewQ7P2 = (TextView) findViewById(R.id.RTQ7PA2);
        TextView ReviewQ7P3 = (TextView) findViewById(R.id.RTQ7PA3);
        TextView ReviewQ7P4 = (TextView) findViewById(R.id.RTQ7PA4);

        TextView Review8 = (TextView) findViewById(R.id.ReviewTextQuestion8);
        TextView ReviewQ8P1 = (TextView) findViewById(R.id.RTQ8PA1);
        TextView ReviewQ8P2 = (TextView) findViewById(R.id.RTQ8PA2);
        TextView ReviewQ8P3 = (TextView) findViewById(R.id.RTQ8PA3);
        TextView ReviewQ8P4 = (TextView) findViewById(R.id.RTQ8PA4);

        TextView Review9 = (TextView) findViewById(R.id.ReviewTextQuestion9);
        TextView ReviewQ9P1 = (TextView) findViewById(R.id.RTQ9PA1);
        TextView ReviewQ9P2 = (TextView) findViewById(R.id.RTQ9PA2);
        TextView ReviewQ9P3 = (TextView) findViewById(R.id.RTQ9PA3);
        TextView ReviewQ9P4 = (TextView) findViewById(R.id.RTQ9PA4);

        TextView Review10 = (TextView) findViewById(R.id.ReviewTextQuestion10);
        TextView ReviewQ10P1 = (TextView) findViewById(R.id.RTQ10PA1);
        TextView ReviewQ10P2 = (TextView) findViewById(R.id.RTQ10PA2);
        TextView ReviewQ10P3 = (TextView) findViewById(R.id.RTQ10PA3);
        TextView ReviewQ10P4 = (TextView) findViewById(R.id.RTQ10PA4);




        if (b == 1) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz1_q1));
                    ReviewQ1P1.setText((R.string.qz1_a1));
                    ReviewQ1P2.setText((R.string.qz1_a2));
                    ReviewQ1P3.setText((R.string.qz1_a3));
                    ReviewQ1P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz1_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ1P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz1_q2));
                    ReviewQ2P1.setText((R.string.qz1_q2_a1));
                    ReviewQ2P2.setText((R.string.qz1_q2_a2));
                    ReviewQ2P3.setText((R.string.qz1_q2_a3));
                    ReviewQ2P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz1_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 1) {
                        ReviewQ2P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ2P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ2P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz1_q3));
                    ReviewQ3P1.setText((R.string.qz1_q3_a1));
                    ReviewQ3P2.setText((R.string.qz1_q3_a2));
                    ReviewQ3P3.setText((R.string.qz1_q3_a3));
                    ReviewQ3P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz1_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 1) {
                        ReviewQ3P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ3P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz1_q4));
                    ReviewQ4P1.setText((R.string.qz1_q4_a1));
                    ReviewQ4P2.setText((R.string.qz1_q4_a2));
                    ReviewQ4P3.setText((R.string.qz1_q4_a3));
                    ReviewQ4P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz1_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ4P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ4P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz1_q5));
                    ReviewQ5P1.setText((R.string.qz1_q5_a1));
                    ReviewQ5P2.setText((R.string.qz1_q5_a2));
                    ReviewQ5P3.setText((R.string.qz1_q5_a3));
                    ReviewQ5P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz1_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 1) {
                        ReviewQ5P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ5P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ5P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz1_q6));
                    ReviewQ6P1.setText((R.string.qz1_q6_a1));
                    ReviewQ6P2.setText((R.string.qz1_q6_a2));
                    ReviewQ6P3.setText((R.string.qz1_q6_a3));
                    ReviewQ6P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz1_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 1) {
                        ReviewQ6P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ6P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz1_q7));
                    ReviewQ7P1.setText((R.string.qz1_q7_a1));
                    ReviewQ7P2.setText((R.string.qz1_q7_a2));
                    ReviewQ7P3.setText((R.string.qz1_q7_a3));
                    ReviewQ7P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz1_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ7P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz1_q8));
                    ReviewQ8P1.setText((R.string.qz1_q8_a1));
                    ReviewQ8P2.setText((R.string.qz1_q8_a2));
                    ReviewQ8P3.setText((R.string.qz1_q8_a3));
                    ReviewQ8P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz1_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 1) {
                        ReviewQ8P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ8P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ8P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz1_q9));
                    ReviewQ9P1.setText((R.string.qz1_q9_a1));
                    ReviewQ9P2.setText((R.string.qz1_q9_a2));
                    ReviewQ9P3.setText((R.string.qz1_q9_a3));
                    ReviewQ9P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz1_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ9P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ9P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz1_q10));
                    ReviewQ10P1.setText((R.string.qz1_q10_a1));
                    ReviewQ10P2.setText((R.string.qz1_q10_a2));
                    ReviewQ10P3.setText((R.string.qz1_q10_a3));
                    ReviewQ10P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz1_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 1) {
                        ReviewQ10P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ10P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ10P3.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
        if (b == 2) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz2_q1));
                    ReviewQ1P1.setText((R.string.qz2_a1));
                    ReviewQ1P2.setText((R.string.qz2_a2));
                    ReviewQ1P3.setText((R.string.qz2_a3));
                    ReviewQ1P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz2_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ1P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz2_q2));
                    ReviewQ2P1.setText((R.string.qz2_q2_a1));
                    ReviewQ2P2.setText((R.string.qz2_q2_a2));
                    ReviewQ2P3.setText((R.string.qz2_q2_a3));
                    ReviewQ2P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz2_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 1) {
                        ReviewQ2P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ2P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ2P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz2_q3));
                    ReviewQ3P1.setText((R.string.qz2_q3_a1));
                    ReviewQ3P2.setText((R.string.qz2_q3_a2));
                    ReviewQ3P3.setText((R.string.qz2_q3_a3));
                    ReviewQ3P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz2_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 1) {
                        ReviewQ3P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ3P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz2_q4));
                    ReviewQ4P1.setText((R.string.qz2_q4_a1));
                    ReviewQ4P2.setText((R.string.qz2_q4_a2));
                    ReviewQ4P3.setText((R.string.qz2_q4_a3));
                    ReviewQ4P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz2_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ4P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ4P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz2_q5));
                    ReviewQ5P1.setText((R.string.qz2_q5_a1));
                    ReviewQ5P2.setText((R.string.qz2_q5_a2));
                    ReviewQ5P3.setText((R.string.qz2_q5_a3));
                    ReviewQ5P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz2_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 1) {
                        ReviewQ5P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ5P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ5P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz2_q6));
                    ReviewQ6P1.setText((R.string.qz2_q6_a1));
                    ReviewQ6P2.setText((R.string.qz2_q6_a2));
                    ReviewQ6P3.setText((R.string.qz2_q6_a3));
                    ReviewQ6P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz2_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 2) {
                        ReviewQ6P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ6P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz2_q7));
                    ReviewQ7P1.setText((R.string.qz2_q7_a1));
                    ReviewQ7P2.setText((R.string.qz2_q7_a2));
                    ReviewQ7P3.setText((R.string.qz2_q7_a3));
                    ReviewQ7P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz2_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ7P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz2_q8));
                    ReviewQ8P1.setText((R.string.qz2_q8_a1));
                    ReviewQ8P2.setText((R.string.qz2_q8_a2));
                    ReviewQ8P3.setText((R.string.qz2_q8_a3));
                    ReviewQ8P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz2_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 3) {
                        ReviewQ8P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ8P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ8P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz2_q9));
                    ReviewQ9P1.setText((R.string.qz2_q9_a1));
                    ReviewQ9P2.setText((R.string.qz2_q9_a2));
                    ReviewQ9P3.setText((R.string.qz2_q9_a3));
                    ReviewQ9P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz2_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ9P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ9P2.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz2_q10));
                    ReviewQ10P1.setText((R.string.qz2_q10_a1));
                    ReviewQ10P2.setText((R.string.qz2_q10_a2));
                    ReviewQ10P3.setText((R.string.qz2_q10_a3));
                    ReviewQ10P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz2_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 1) {
                        ReviewQ10P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ10P4.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ10P3.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
        if (b == 3) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz3_q1));
                    ReviewQ1P1.setText((R.string.qz3_a1));
                    ReviewQ1P2.setText((R.string.qz3_a2));
                    ReviewQ1P3.setText((R.string.qz3_a3));
                    ReviewQ1P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz3_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ1P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz3_q2));
                    ReviewQ2P1.setText((R.string.qz3_q2_a1));
                    ReviewQ2P2.setText((R.string.qz3_q2_a2));
                    ReviewQ2P3.setText((R.string.qz3_q2_a3));
                    ReviewQ2P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz3_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 1) {
                        ReviewQ2P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ2P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ2P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz3_q3));
                    ReviewQ3P1.setText((R.string.qz3_q3_a1));
                    ReviewQ3P2.setText((R.string.qz3_q3_a2));
                    ReviewQ3P3.setText((R.string.qz3_q3_a3));
                    ReviewQ3P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz3_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 1) {
                        ReviewQ3P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ3P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz3_q4));
                    ReviewQ4P1.setText((R.string.qz3_q4_a1));
                    ReviewQ4P2.setText((R.string.qz3_q4_a2));
                    ReviewQ4P3.setText((R.string.qz3_q4_a3));
                    ReviewQ4P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz3_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ4P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ4P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz5_q5));
                    ReviewQ5P1.setText((R.string.qz5_q5_a1));
                    ReviewQ5P2.setText((R.string.qz5_q5_a2));
                    ReviewQ5P3.setText((R.string.qz5_q5_a3));
                    ReviewQ5P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz5_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 1) {
                        ReviewQ5P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ5P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ5P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz3_q6));
                    ReviewQ6P1.setText((R.string.qz3_q6_a1));
                    ReviewQ6P2.setText((R.string.qz3_q6_a2));
                    ReviewQ6P3.setText((R.string.qz3_q6_a3));
                    ReviewQ6P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz3_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 1) {
                        ReviewQ6P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ6P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz4_q7));
                    ReviewQ7P1.setText((R.string.qz4_q7_a1));
                    ReviewQ7P2.setText((R.string.qz4_q7_a2));
                    ReviewQ7P3.setText((R.string.qz4_q7_a3));
                    ReviewQ7P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz4_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ7P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz3_q8));
                    ReviewQ8P1.setText((R.string.qz3_q8_a1));
                    ReviewQ8P2.setText((R.string.qz3_q8_a2));
                    ReviewQ8P3.setText((R.string.qz3_q8_a3));
                    ReviewQ8P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz3_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 1) {
                        ReviewQ8P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ8P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ8P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz3_q9));
                    ReviewQ9P1.setText((R.string.qz3_q9_a1));
                    ReviewQ9P2.setText((R.string.qz3_q9_a2));
                    ReviewQ9P3.setText((R.string.qz3_q9_a3));
                    ReviewQ9P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz3_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ9P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ9P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz3_q10));
                    ReviewQ10P1.setText((R.string.qz3_q10_a1));
                    ReviewQ10P2.setText((R.string.qz3_q10_a2));
                    ReviewQ10P3.setText((R.string.qz3_q10_a3));
                    ReviewQ10P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz3_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 4) {
                        ReviewQ10P4.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ10P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ10P3.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
        if (b == 4) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz4_q1));
                    ReviewQ1P1.setText((R.string.qz4_a1));
                    ReviewQ1P2.setText((R.string.qz4_a2));
                    ReviewQ1P3.setText((R.string.qz4_a3));
                    ReviewQ1P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz4_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ1P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz4_q2));
                    ReviewQ2P1.setText((R.string.qz4_q2_a1));
                    ReviewQ2P2.setText((R.string.qz4_q2_a2));
                    ReviewQ2P3.setText((R.string.qz4_q2_a3));
                    ReviewQ2P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz4_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 1) {
                        ReviewQ2P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ2P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ2P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz4_q3));
                    ReviewQ3P1.setText((R.string.qz4_q3_a1));
                    ReviewQ3P2.setText((R.string.qz4_q3_a2));
                    ReviewQ3P3.setText((R.string.qz4_q3_a3));
                    ReviewQ3P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz4_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 1) {
                        ReviewQ3P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ3P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz4_q4));
                    ReviewQ4P1.setText((R.string.qz4_q4_a1));
                    ReviewQ4P2.setText((R.string.qz4_q4_a2));
                    ReviewQ4P3.setText((R.string.qz4_q4_a3));
                    ReviewQ4P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz4_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ4P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ4P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz4_q5));
                    ReviewQ5P1.setText((R.string.qz4_q5_a1));
                    ReviewQ5P2.setText((R.string.qz4_q5_a2));
                    ReviewQ5P3.setText((R.string.qz4_q5_a3));
                    ReviewQ5P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz4_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 3) {
                        ReviewQ5P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ5P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ5P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz4_q6));
                    ReviewQ6P1.setText((R.string.qz4_q6_a1));
                    ReviewQ6P2.setText((R.string.qz4_q6_a2));
                    ReviewQ6P3.setText((R.string.qz4_q6_a3));
                    ReviewQ6P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz4_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 1) {
                        ReviewQ6P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ6P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz4_q7));
                    ReviewQ7P1.setText((R.string.qz4_q7_a1));
                    ReviewQ7P2.setText((R.string.qz4_q7_a2));
                    ReviewQ7P3.setText((R.string.qz4_q7_a3));
                    ReviewQ7P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz4_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ7P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz4_q8));
                    ReviewQ8P1.setText((R.string.qz4_q8_a1));
                    ReviewQ8P2.setText((R.string.qz4_q8_a2));
                    ReviewQ8P3.setText((R.string.qz4_q8_a3));
                    ReviewQ8P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz4_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 1) {
                        ReviewQ8P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ8P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ8P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz4_q9));
                    ReviewQ9P1.setText((R.string.qz4_q9_a1));
                    ReviewQ9P2.setText((R.string.qz4_q9_a2));
                    ReviewQ9P3.setText((R.string.qz4_q9_a3));
                    ReviewQ9P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz4_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ9P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ9P2.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz4_q10));
                    ReviewQ10P1.setText((R.string.qz4_q10_a1));
                    ReviewQ10P2.setText((R.string.qz4_q10_a2));
                    ReviewQ10P3.setText((R.string.qz4_q10_a3));
                    ReviewQ10P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz4_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 1) {
                        ReviewQ10P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ10P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ10P3.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
        if (b == 5) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz5_q1));
                    ReviewQ1P1.setText((R.string.qz5_a1));
                    ReviewQ1P2.setText((R.string.qz5_a2));
                    ReviewQ1P3.setText((R.string.qz5_a3));
                    ReviewQ1P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz5_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ1P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz5_q2));
                    ReviewQ2P1.setText((R.string.qz5_q2_a1));
                    ReviewQ2P2.setText((R.string.qz5_q2_a2));
                    ReviewQ2P3.setText((R.string.qz5_q2_a3));
                    ReviewQ2P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz5_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 3) {
                        ReviewQ2P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ2P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ2P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz5_q3));
                    ReviewQ3P1.setText((R.string.qz5_q3_a1));
                    ReviewQ3P2.setText((R.string.qz5_q3_a2));
                    ReviewQ3P3.setText((R.string.qz5_q3_a3));
                    ReviewQ3P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz5_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 3) {
                        ReviewQ3P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ3P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz5_q4));
                    ReviewQ4P1.setText((R.string.qz5_q4_a1));
                    ReviewQ4P2.setText((R.string.qz5_q4_a2));
                    ReviewQ4P3.setText((R.string.qz5_q4_a3));
                    ReviewQ4P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz5_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ4P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ4P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz5_q5));
                    ReviewQ5P1.setText((R.string.qz5_q5_a1));
                    ReviewQ5P2.setText((R.string.qz5_q5_a2));
                    ReviewQ5P3.setText((R.string.qz5_q5_a3));
                    ReviewQ5P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz5_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 1) {
                        ReviewQ5P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ5P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ5P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz5_q6));
                    ReviewQ6P1.setText((R.string.qz5_q6_a1));
                    ReviewQ6P2.setText((R.string.qz5_q6_a2));
                    ReviewQ6P3.setText((R.string.qz5_q6_a3));
                    ReviewQ6P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz5_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 2) {
                        ReviewQ6P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ6P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz5_q7));
                    ReviewQ7P1.setText((R.string.qz5_q7_a1));
                    ReviewQ7P2.setText((R.string.qz5_q7_a2));
                    ReviewQ7P3.setText((R.string.qz5_q7_a3));
                    ReviewQ7P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz5_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ7P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz5_q8));
                    ReviewQ8P1.setText((R.string.qz5_q8_a1));
                    ReviewQ8P2.setText((R.string.qz5_q8_a2));
                    ReviewQ8P3.setText((R.string.qz5_q8_a3));
                    ReviewQ8P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz5_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 1) {
                        ReviewQ8P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ8P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ8P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz5_q9));
                    ReviewQ9P1.setText((R.string.qz5_q9_a1));
                    ReviewQ9P2.setText((R.string.qz5_q9_a2));
                    ReviewQ9P3.setText((R.string.qz5_q9_a3));
                    ReviewQ9P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz5_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ9P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ9P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz5_q10));
                    ReviewQ10P1.setText((R.string.qz5_q10_a1));
                    ReviewQ10P2.setText((R.string.qz5_q10_a2));
                    ReviewQ10P3.setText((R.string.qz5_q10_a3));
                    ReviewQ10P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz5_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 1) {
                        ReviewQ10P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ10P4.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ10P3.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
        if (b == 6) {

            for (int i = 0; i <= 10; i++) {
                DBForQuizResults DBQR = new DBForQuizResults(context);
                Cursor CRQR = DBQR.getInformation(DBQR, Integer.toString(b));  // TODO here is where the problem relies, the .getInformation method

                CRQR.moveToFirst();

                if (i == 0) {
                    Review.setText((R.string.qz6_q1));
                    ReviewQ1P1.setText((R.string.qz6_a1));
                    ReviewQ1P2.setText((R.string.qz6_a2));
                    ReviewQ1P3.setText((R.string.qz6_a3));
                    ReviewQ1P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ1P4.setText((R.string.qz6_a4));
                    int a = CRQR.getInt(1);


                    if (a == 1) {
                        ReviewQ1P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ1P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ1P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 1) {
                    Review2.setText((R.string.qz6_q2));
                    ReviewQ2P1.setText((R.string.qz6_q2_a1));
                    ReviewQ2P2.setText((R.string.qz6_q2_a2));
                    ReviewQ2P3.setText((R.string.qz6_q2_a3));
                    ReviewQ2P1.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ2P4.setText((R.string.qz6_q2_a4));
                    int a = CRQR.getInt(2);


                    if (a == 3) {
                        ReviewQ2P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ2P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ2P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 2) {
                    Review3.setText((R.string.qz6_q3));
                    ReviewQ3P1.setText((R.string.qz6_q3_a1));
                    ReviewQ3P2.setText((R.string.qz6_q3_a2));
                    ReviewQ3P3.setText((R.string.qz6_q3_a3));
                    ReviewQ3P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ3P4.setText((R.string.qz6_q3_a4));
                    int a = CRQR.getInt(3);


                    if (a == 1) {
                        ReviewQ3P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ3P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ3P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 3) {
                    Review4.setText((R.string.qz6_q4));
                    ReviewQ4P1.setText((R.string.qz6_q4_a1));
                    ReviewQ4P2.setText((R.string.qz6_q4_a2));
                    ReviewQ4P3.setText((R.string.qz6_q4_a3));
                    ReviewQ4P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ4P4.setText((R.string.qz6_q4_a4));
                    int a = CRQR.getInt(4);


                    if (a == 1) {
                        ReviewQ4P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ4P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ4P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 4) {
                    Review5.setText((R.string.qz6_q5));
                    ReviewQ5P1.setText((R.string.qz6_q5_a1));
                    ReviewQ5P2.setText((R.string.qz6_q5_a2));
                    ReviewQ5P3.setText((R.string.qz6_q5_a3));
                    ReviewQ5P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ5P4.setText((R.string.qz6_q5_a4));
                    int a = CRQR.getInt(5);


                    if (a == 1) {
                        ReviewQ5P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ5P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ5P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 5) {
                    Review6.setText((R.string.qz6_q6));
                    ReviewQ6P1.setText((R.string.qz6_q6_a1));
                    ReviewQ6P2.setText((R.string.qz6_q6_a2));
                    ReviewQ6P3.setText((R.string.qz6_q6_a3));
                    ReviewQ6P2.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ6P4.setText((R.string.qz6_q6_a4));
                    int a = CRQR.getInt(6);


                    if (a == 1) {
                        ReviewQ6P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ6P3.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ6P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 6) {
                    Review7.setText((R.string.qz6_q7));
                    ReviewQ7P1.setText((R.string.qz6_q7_a1));
                    ReviewQ7P2.setText((R.string.qz6_q7_a2));
                    ReviewQ7P3.setText((R.string.qz6_q7_a3));
                    ReviewQ7P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ7P4.setText((R.string.qz6_q7_a4));
                    int a = CRQR.getInt(7);


                    if (a == 1) {
                        ReviewQ7P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ7P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ7P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 7) {
                    Review8.setText((R.string.qz6_q8));
                    ReviewQ8P1.setText((R.string.qz6_q8_a1));
                    ReviewQ8P2.setText((R.string.qz6_q8_a2));
                    ReviewQ8P3.setText((R.string.qz6_q8_a3));
                    ReviewQ8P4.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ8P4.setText((R.string.qz6_q8_a4));
                    int a = CRQR.getInt(8);


                    if (a == 1) {
                        ReviewQ8P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ8P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 3) {
                        ReviewQ8P3.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 8) {
                    Review9.setText((R.string.qz6_q9));
                    ReviewQ9P1.setText((R.string.qz6_q9_a1));
                    ReviewQ9P2.setText((R.string.qz6_q9_a2));
                    ReviewQ9P3.setText((R.string.qz6_q9_a3));
                    ReviewQ9P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ9P4.setText((R.string.qz6_q9_a4));
                    int a = CRQR.getInt(9);


                    if (a == 1) {
                        ReviewQ9P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ9P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ9P4.setTextColor(Color.parseColor("#FFE23830"));
                    }

                }
                if (i == 9) {
                    Review10.setText((R.string.qz6_q10));
                    ReviewQ10P1.setText((R.string.qz6_q10_a1));
                    ReviewQ10P2.setText((R.string.qz6_q10_a2));
                    ReviewQ10P3.setText((R.string.qz6_q10_a3));
                    ReviewQ10P3.setTextColor(Color.parseColor("#FF2BD321"));   ////Correct Answer Color Green
                    ReviewQ10P4.setText((R.string.qz6_q10_a4));
                    int a = CRQR.getInt(10);


                    if (a == 1) {
                        ReviewQ10P1.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 2) {
                        ReviewQ10P2.setTextColor(Color.parseColor("#FFE23830"));
                    }
                    if (a == 4) {
                        ReviewQ10P4.setTextColor(Color.parseColor("#FFE23830"));
                    }



                }
                //---------------------------------------------------------------------------------------------------



            }

        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz_review, menu);
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

    private static int[] QUIZ1A = {0,3,3,3,2,3,2,3,3,2,4};

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
