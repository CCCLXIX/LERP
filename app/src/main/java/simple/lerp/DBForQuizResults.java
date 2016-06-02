package simple.lerp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Marcos on 6/1/2015.
 */
public class DBForQuizResults extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Results";
    public static final String USER_ID = "id";
    public static final String QUIZZ = "QuizNumber";
    public static final String Q1 = "q1";
    public static final String Q2 = "q2";
    public static final String Q3 = "q3";
    public static final String Q4 = "q4";
    public static final String Q5 = "q5";
    public static final String Q6 = "q6";
    public static final String Q7 = "q7";
    public static final String Q8 = "q8";
    public static final String Q9 = "q9";
    public static final String Q10 = "q10";
    public static final String TABLE_NAME = "QuizResults";



    public static final String CURRENTQUIZZ = "quizz";
    public static final String QUIZZSELECTEDREVIEW = "quizz_selected_review";


    public static final int database_version = 1;
    public String CREATE_QUERY = "CREATE TABLE "+ TABLE_NAME+" ("+ QUIZZ+" TEXT,"+Q1+" INT,"+ Q2+" INT,"+Q3+" INT,"+Q4+" " +
            "INT,"+Q5+" INT,"+Q6+" INT,"+ Q7 +" INT,"+ Q8+" INT,"+Q9+" INT,"+Q10+");";

    public DBForQuizResults(Context context) {
        super(context, DATABASE_NAME, null, database_version);
        Log.d("Database operations", "Database created");

    }



    //CREATE DATABASE HELPER

    @Override
    public void onCreate(SQLiteDatabase sdb) {

        sdb.execSQL(CREATE_QUERY);
        Log.d("Database operations", "Table created");

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

    public void putInformation(DBForQuizResults dop,String quizz,int q1,int q2, int q3, int q4, int q5, int q6, int q7, int q8, int q9, int q10)
    {
        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(QUIZZ, quizz);
        cv.put(Q1, q1);
        cv.put(Q2, q2);
        cv.put(Q3, q3);
        cv.put(Q4, q4);
        cv.put(Q5, q5);
        cv.put(Q6, q6);
        cv.put(Q7, q7);
        cv.put(Q8, q8);
        cv.put(Q9, q9);
        cv.put(Q10, q10);
        long k = SQ.insert(TABLE_NAME, null, cv);
        Log.d("Database operations", "One raw inserted");

    }


    public Cursor getInformation(DBForQuizResults dop, String quizz)
    {
        SQLiteDatabase SQ = dop.getReadableDatabase();
        String selection =QUIZZ+"= '" +quizz+"'";
        String args[] = {quizz};

        String[] coloumns = {QUIZZ,Q1, Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10};
        Cursor CR = SQ.query(TABLE_NAME,coloumns, selection, null, null, null, null);

        return CR;

        // TODO A possible solution for this bug could be find in the way the program is accessing the information in the DB
        // TODO Most likely the solution is changing the "LIKE ?" to "WHERE "  further study needed :D


    }




    public void UpdateQuizResult(DBForQuizResults DOP, String  quiz, int q1, int q2,int q3, int q4, int q5, int q6, int q7, int q8, int q9, int q10 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = QUIZZ+ " LIKE ? ";
        String args[] = {quiz};
        ContentValues values = new ContentValues();
        values.put(Q1, q1);
        values.put(Q2, q2);
        values.put(Q3, q3);
        values.put(Q4, q4);
        values.put(Q5, q5);
        values.put(Q6, q6);
        values.put(Q7, q7);
        values.put(Q8, q8);
        values.put(Q9, q9);
        values.put(Q10, q10);

        SQ.update(TABLE_NAME, values, selection, args);


    }
}
