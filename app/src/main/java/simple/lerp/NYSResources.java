package simple.lerp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;


public class NYSResources extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nysresources);

        //Hides The action bar from the users view
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Tracker t = ((Analytics) getApplication()).getTracker(Analytics.TrackerName.APP_TRACKER);
        t.setScreenName("NYSRDB");
        t.send(new HitBuilders.AppViewBuilder().build());

        TextView jan_15 = (TextView)findViewById(R.id.jan_15);
        String LinkTextJan15 = "<a href='http://www.nysedregents.org/livingenvironment/115/lenv12015-exam.pdf'>2015</a>";
        jan_15.setText(Html.fromHtml(LinkTextJan15));
        jan_15.setMovementMethod(LinkMovementMethod.getInstance());

        //-----------------------------Start of 2014-------------------------


        TextView jan_14 = (TextView)findViewById(R.id.jan_14);
        String LinkTextJan14 = "<a href='http://www.nysedregents.org/livingenvironment/114/lenv12014-examw.pdf'>2014</a>";
        jan_14.setText(Html.fromHtml(LinkTextJan14));
        jan_14.setMovementMethod(LinkMovementMethod.getInstance());

        TextView jun_14 = (TextView)findViewById(R.id.jun_14);
        String LinkTextJun14 = "<a href='http://www.nysedregents.org/livingenvironment/814/lenv82014-exam.pdf'>2014</a>";
        jun_14.setText(Html.fromHtml(LinkTextJun14));
        jun_14.setMovementMethod(LinkMovementMethod.getInstance());


        TextView ag_14 = (TextView)findViewById(R.id.ag_14);
        String LinkTextAg14 = "<a href='http://www.nysedregents.org/livingenvironment/614/lenv62014-examw.pdf'>2014</a>";
        ag_14.setText(Html.fromHtml(LinkTextAg14));
        ag_14.setMovementMethod(LinkMovementMethod.getInstance());


        //-----------------------------Start of 2013-------------------------

        TextView jan_13 = (TextView)findViewById(R.id.jan_13);
        String LinkTextJan13 = "<a href='http://www.nysedregents.org/livingenviron ment/113/lenv12013-exam.pdf'>2013</a>";
        jan_13.setText(Html.fromHtml(LinkTextJan13));
        jan_13.setMovementMethod(LinkMovementMethod.getInstance());

        TextView jun_13 = (TextView)findViewById(R.id.jun_13);
        String LinkTextJun13 = "<a href='http://www.nysedregents.org/livingenvironment/613/lenv62013-examw.pdf'>2013</a>";
        jun_13.setText(Html.fromHtml(LinkTextJun13));
        jun_13.setMovementMethod(LinkMovementMethod.getInstance());


        TextView ag_13 = (TextView)findViewById(R.id.ag_13);
        String LinkTextAg13 = "<a href='http://www.nysedregents.org/livingenvironment/813/lenv82013-exam.pdf'>2013</a>";
        ag_13.setText(Html.fromHtml(LinkTextAg13));
        ag_13.setMovementMethod(LinkMovementMethod.getInstance());

        //-----------------------------Start of 2012-------------------------

        TextView jan_12 = (TextView)findViewById(R.id.jan_12);
        String LinkTextJan12 = "<a href='http://www.nysedregents.org/livingenvironment/112/lenv12012-exam.pdf'>2012</a>";
        jan_12.setText(Html.fromHtml(LinkTextJan12));
        jan_12.setMovementMethod(LinkMovementMethod.getInstance());

        TextView jun_12 = (TextView)findViewById(R.id.jun_12);
        String LinkTextJun12 = "<a href='http://www.nysedregents.org/livingenvironment/612/lenv62012-exam_w.pdf'>2012</a>";
        jun_12.setText(Html.fromHtml(LinkTextJun12));
        jun_12.setMovementMethod(LinkMovementMethod.getInstance());


        TextView ag_12 = (TextView)findViewById(R.id.ag_12);
        String LinkTextAg12 = "<a href='http://www.nysedregents.org/livingenvironment/812/lenv82012-exam.pdf'>2012</a>";
        ag_12.setText(Html.fromHtml(LinkTextAg12));
        ag_12.setMovementMethod(LinkMovementMethod.getInstance());

        //-----------------------------Start of 2011-------------------------

        TextView jan_11 = (TextView)findViewById(R.id.jan_11);
        String LinkTextJan11 = "<a href='http://www.nysedregents.org/livingenvironment/Archive/20110125-le-examrev.pdf'>2011</a>";
        jan_11.setText(Html.fromHtml(LinkTextJan11));
        jan_11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView jun_11 = (TextView)findViewById(R.id.jun_11);
        String LinkTextJun11 = "<a href='http://www.nysedregents.org/livingenvironment/611/le-exam611.pdf'>2011</a>";
        jun_11.setText(Html.fromHtml(LinkTextJun11));
        jun_11.setMovementMethod(LinkMovementMethod.getInstance());


        TextView ag_11 = (TextView)findViewById(R.id.ag_11);
        String LinkTextAg11 = "<a href='http://www.nysedregents.org/livingenvironment/811/le-exam811.pdf'>2011</a>";
        ag_11.setText(Html.fromHtml(LinkTextAg11));
        ag_11.setMovementMethod(LinkMovementMethod.getInstance());

        //-----------------------------Start of 2010-------------------------

        TextView jan_10 = (TextView)findViewById(R.id.jan_10);
        String LinkTextJan10 = "<a href='http://www.nysedregents.org/livingenvironment/Archive/20100126exam.pdf'>2010</a>";
        jan_10.setText(Html.fromHtml(LinkTextJan10));
        jan_10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView jun_10 = (TextView)findViewById(R.id.jun_10);
        String LinkTextJun10 = "<a href='http://www.nysedregents.org/livingenvironment/Archive/20100616exam.pdf'>2010</a>";
        jun_10.setText(Html.fromHtml(LinkTextJun10));
        jun_10.setMovementMethod(LinkMovementMethod.getInstance());


        TextView ag_10 = (TextView)findViewById(R.id.ag_10);
        String LinkTextAg10 = "<a href='http://www.nysedregents.org/livingenvironment/811/le-exam811.pdf'>2010</a>";
        ag_10.setText(Html.fromHtml(LinkTextAg10));
        ag_10.setMovementMethod(LinkMovementMethod.getInstance());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nysresources, menu);
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
