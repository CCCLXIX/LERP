package simple.lerp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseOperations extends SQLiteOpenHelper {

    public static final String USER_ID = "id";
    public static final String USER_NAME = "user_name"	;
    public static final String USER_PASS = "user_pass" ;
    public static final String DATABASE_NAME = "users";
    public static final String TABLE_NAME = "localusers";
    public static final String USER_EMAIL = "user_email";
    public static final String Q1 = "q1";
    public static final String Q2 = "q2";
    public static final String Q3 = "q3";
    public static final String Q4 = "q4";
    public static final String Q5 = "q5";
    public static final String Q6 = "q6";

    public static final String CURRENTQUIZZ = "quizz";
    public static final String QUIZZSELECTEDREVIEW = "quizz_selected_review";


    public static final int database_version = 2;
	public String CREATE_QUERY = "CREATE TABLE "+ TABLE_NAME+" ("+ USER_NAME+" TEXT,"+USER_EMAIL+" TEXT,"+ USER_PASS+" TEXT,"+Q1+" INT,"+Q2+" INT,"+Q3+" INT,"+Q4+" INT,"+ Q5 +" INT,"+ Q6+" INT,"+CURRENTQUIZZ+" INT,"+QUIZZSELECTEDREVIEW+");";

	public DatabaseOperations(Context context) {
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
	
	public void putInformation(DatabaseOperations dop,String name,String email,String pass, int q1, int q2, int q3, int q4, int q5, int q6, int quizz, int quizreview)
	{
	SQLiteDatabase SQ = dop.getWritableDatabase();
	ContentValues cv = new ContentValues();
	cv.put(USER_NAME, name);
	cv.put(USER_EMAIL, email);
    cv.put(USER_PASS, pass);
        cv.put(Q1, q1);
        cv.put(Q2, q2);
        cv.put(Q3, q3);
        cv.put(Q4, q4);
        cv.put(Q5, q5);
        cv.put(Q6, q6);
        cv.put(CURRENTQUIZZ, quizz);
        cv.put(QUIZZSELECTEDREVIEW,quizreview);

        long k = SQ.insert(TABLE_NAME, null, cv);
	Log.d("Database operations", "One raw inserted");

	}


	public Cursor getInformation(DatabaseOperations dop)
	{
		SQLiteDatabase SQ = dop.getReadableDatabase();
		String[] coloumns = {USER_NAME,USER_EMAIL ,USER_PASS, Q1, Q2,Q3,Q4,Q5,Q6, CURRENTQUIZZ,QUIZZSELECTEDREVIEW};
		Cursor CR = SQ.query(TABLE_NAME,coloumns, null, null, null, null, null);

		return CR;
		
		
	}

    public void CurrentQuizz (DatabaseOperations DOP, String user_name, String user_email,String user_pass, int quizz )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(CURRENTQUIZZ, quizz);
        SQ.update(TABLE_NAME, values, selection, args);


    }

    public void CurrentQuizSelector (DatabaseOperations DOP, String user_name, String user_email,String user_pass, int quizz )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(QUIZZSELECTEDREVIEW, quizz);
        SQ.update(TABLE_NAME, values, selection, args);


    }

    public void updateQuizzOne(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q1 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q1, q1);
        SQ.update(TABLE_NAME, values, selection, args);


    }
    public void updateQuizzTwo(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q2 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q2, q2);
        SQ.update(TABLE_NAME, values, selection, args);


    }
    public void updateQuizzThree(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q3 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q3, q3);
        SQ.update(TABLE_NAME, values, selection, args);


    }

    public void updateQuizzFour(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q4 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q4, q4);
        SQ.update(TABLE_NAME, values, selection, args);


    }

    public void updateQuizzFive(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q5 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q5, q5);
        SQ.update(TABLE_NAME, values, selection, args);


    }

    public void updateQuizzSix(DatabaseOperations DOP, String user_name, String user_email,String user_pass, int q6 )
    {
        SQLiteDatabase SQ  = DOP.getWritableDatabase();
        String selection = USER_NAME+ " LIKE ? AND "+ USER_EMAIL +" LIKE ? AND "+USER_PASS+" LIKE ?";
        String args[] = {user_name,user_email,user_pass};
        ContentValues values = new ContentValues();
        values.put(Q6, q6);
        SQ.update(TABLE_NAME, values, selection, args);


    }
	
	public Cursor getUserPass(DatabaseOperations DOP, String user)
	{
	    SQLiteDatabase SQ = DOP.getReadableDatabase();
	    String selection = USER_NAME +" LIKE ?";
	    String coloumns[] = {USER_PASS};
	    String args[] = {user};
	    Cursor CR = SQ.query(TABLE_NAME, coloumns, selection, args, null, null, null);
		return CR;
		
	}

    public Cursor getUserName(DatabaseOperations DOP, String user)
    {
        SQLiteDatabase SQ = DOP.getReadableDatabase();
        String selection = USER_NAME +" LIKE ?";
        String coloumns[] = {USER_PASS};
        String args[] = {user};
        Cursor CR = SQ.query(TABLE_NAME, coloumns, selection, args, null, null, null);
        return CR;

    }

	
	public void deleteUser(DatabaseOperations DOP, String user, String pass)
	{
		String selection = USER_NAME+ " LIKE ? AND "+ USER_PASS +" LIKE ?";
		//String coloumns[] = {TableInfo.USER_PASS};
		String args[] = {user,pass};
		SQLiteDatabase SQ = DOP.getWritableDatabase();
		SQ.delete(TABLE_NAME, selection, args);
		
	}
	
	public void updateUserInfo(DatabaseOperations DOP, String user_name, String user_pass, String new_user_name )
	{
	SQLiteDatabase SQ  = DOP.getWritableDatabase();
	String selection = USER_NAME+ " LIKE ? AND "+ USER_PASS +" LIKE ?";
	String args[] = {user_name,user_pass};
	ContentValues values = new ContentValues();
	values.put(USER_NAME, new_user_name);
	SQ.update(TABLE_NAME, values, selection, args);
		
		
	}
	

}
