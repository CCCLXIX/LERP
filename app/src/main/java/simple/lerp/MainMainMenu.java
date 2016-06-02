package simple.lerp;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Marcos on 4/18/2015.
 */
public class MainMainMenu extends FragmentActivity {
    Context context = this;
    String name;


    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_mainmenu);
        viewPager = (ViewPager) findViewById(R.id.MainMainMenuLayout);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        System.out.print("Passed");






    }


}
