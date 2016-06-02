package simple.lerp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Marcos on 4/18/2015.
 */
public class CCCLXIX extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.activity_ccclxix, container, false);

        TranslateAnimation anim = new TranslateAnimation(0f, 0f, 0f, 2500f);
        anim.setDuration(4000);
        anim.setRepeatCount(TranslateAnimation.INFINITE);

        TranslateAnimation anim2 = new TranslateAnimation(0f, 0f,0f, 2500f);
        anim2.setDuration(5500);
        anim2.setRepeatCount(TranslateAnimation.INFINITE);
        //  ImageView iv = (ImageView) findViewById(R.id.drop1);
        //  ImageView iiv = (ImageView) findViewById(R.id.drop2);
        ImageView iiiv = (ImageView) v.findViewById(R.id.drop3);
        ImageView iiiiv = (ImageView) v.findViewById(R.id.drop4);
        ImageView iiiiiv = (ImageView) v.findViewById(R.id.drop5);
        ImageView iiiiiiv = (ImageView) v.findViewById(R.id.drop6);
        //    ImageView iiiiiiiv = (ImageView) findViewById(R.id.drop7);
        ImageView iiiiiiiiv = (ImageView) v.findViewById(R.id.drop8);
        //   ImageView iiiiiiiiiiv = (ImageView) findViewById(R.id.drop9);
        //  iv.startAnimation(anim);
        // iiv.startAnimation(anim);
        ImageView d = (ImageView) v.findViewById(R.id.dropp1);
        ImageView d2 = (ImageView) v.findViewById(R.id.dropp2);
        ImageView d3 = (ImageView) v.findViewById(R.id.dropp3);
        ImageView d4 = (ImageView) v.findViewById(R.id.dropp4);
        ImageView d5 = (ImageView) v.findViewById(R.id.dropp5);
        d.startAnimation(anim2);
        d2.startAnimation(anim2);
        d3.startAnimation(anim2);
        d4.startAnimation(anim2);
        d5.startAnimation(anim2);
        iiiv.startAnimation(anim);
        iiiiv.startAnimation(anim);
        iiiiiv.startAnimation(anim);
        iiiiiiv.startAnimation(anim);
        //       iiiiiiiv.startAnimation(anim);
        iiiiiiiiv.startAnimation(anim);
        //      iiiiiiiiiiv.startAnimation(anim);





        return v;

    }


    public void RainAnimaion(){




        TranslateAnimation anim = new TranslateAnimation(0f, 0f, 0f, 2500f);
        anim.setDuration(4000);
        anim.setRepeatCount(TranslateAnimation.INFINITE);

        TranslateAnimation anim2 = new TranslateAnimation(0f, 0f,0f, 2500f);
        anim2.setDuration(5500);
        anim2.setRepeatCount(TranslateAnimation.INFINITE);
      //  ImageView iv = (ImageView) findViewById(R.id.drop1);
      //  ImageView iiv = (ImageView) findViewById(R.id.drop2);
        ImageView iiiv = (ImageView) getView().findViewById(R.id.drop3);
        ImageView iiiiv = (ImageView) getView().findViewById(R.id.drop4);
        ImageView iiiiiv = (ImageView) getView().findViewById(R.id.drop5);
        ImageView iiiiiiv = (ImageView) getView().findViewById(R.id.drop6);
    //    ImageView iiiiiiiv = (ImageView) findViewById(R.id.drop7);
        ImageView iiiiiiiiv = (ImageView) getView().findViewById(R.id.drop8);
     //   ImageView iiiiiiiiiiv = (ImageView) findViewById(R.id.drop9);
      //  iv.startAnimation(anim);
       // iiv.startAnimation(anim);
        ImageView d = (ImageView) getView().findViewById(R.id.dropp1);
        ImageView d2 = (ImageView) getView().findViewById(R.id.dropp2);
        ImageView d3 = (ImageView) getView().findViewById(R.id.dropp3);
        ImageView d4 = (ImageView) getView().findViewById(R.id.dropp4);
        ImageView d5 = (ImageView) getView().findViewById(R.id.dropp5);
        d.startAnimation(anim2);
        d2.startAnimation(anim2);
        d3.startAnimation(anim2);
        d4.startAnimation(anim2);
        d5.startAnimation(anim2);






        iiiv.startAnimation(anim);
        iiiiv.startAnimation(anim);
        iiiiiv.startAnimation(anim);
        iiiiiiv.startAnimation(anim);
 //       iiiiiiiv.startAnimation(anim);
        iiiiiiiiv.startAnimation(anim);
  //      iiiiiiiiiiv.startAnimation(anim);





    }



    public void MovementAction(View v){


       // TransitionManager.beginDelayedTransition(ccclxix);


        ImageView ccc = (ImageView)getView().findViewById(R.id.drop3);

        //Changes the position of the image

        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        positionRules.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);
     //   positionRules.addRule(RelativeLayout.ALIGN_PARENT_, RelativeLayout.TRUE);
        ccc.setLayoutParams(positionRules);


        //Changes the size of the image
        ViewGroup.LayoutParams sizeRules = ccc.getLayoutParams();

        sizeRules.width= 400;
        sizeRules.height= 300;
        ccc.setLayoutParams(sizeRules);




    }


}
