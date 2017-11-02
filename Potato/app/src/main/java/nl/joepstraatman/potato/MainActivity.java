package nl.joepstraatman.potato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static nl.joepstraatman.potato.R.styleable.CompoundButton;

public class MainActivity extends AppCompatActivity {

    ImageView mouth,shoes,arms,body,eyes,nose,ears,mustache,hat,eyebrows,glasses;
    CheckBox cmouth,cshoes,carms,cbody,ceyes,cnose,cears,cmustache,chat,ceyebrows,cglasses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mouth = (ImageView) findViewById(R.id.mouth);
        shoes = (ImageView) findViewById(R.id.shoes);
        arms = (ImageView) findViewById(R.id.arms);
        body = (ImageView) findViewById(R.id.body);
        eyes = (ImageView) findViewById(R.id.eyes);
        nose = (ImageView) findViewById(R.id.nose);
        ears = (ImageView) findViewById(R.id.ears);
        mustache = (ImageView) findViewById(R.id.mustache);
        hat = (ImageView) findViewById(R.id.hat);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        glasses = (ImageView) findViewById(R.id.glasses);

        cmouth = (CheckBox)findViewById(R.id.cmouth);
        cshoes = (CheckBox)findViewById(R.id.cshoes);
        carms = (CheckBox)findViewById(R.id.carms);
        cbody = (CheckBox)findViewById(R.id.cbody);
        ceyes = (CheckBox)findViewById(R.id.ceyes);
        cnose = (CheckBox)findViewById(R.id.cnose);
        cears = (CheckBox)findViewById(R.id.cears);
        cmustache = (CheckBox)findViewById(R.id.cmustache);
        chat = (CheckBox)findViewById(R.id.chat);
        ceyebrows = (CheckBox)findViewById(R.id.ceyebrows);
        cglasses = (CheckBox)findViewById(R.id.cglasses);

       cmouth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cmouth=(CheckBox)view; // important line and code work
                if(cmouth.isChecked())
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
                //////////////////////////////////////////////
            }
        });
        cshoes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cshoes=(CheckBox)view; // important line and code work
                if(cshoes.isChecked())
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////////////
            }
        });
        carms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox carms=(CheckBox)view; // important line and code work
                if(carms.isChecked())
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        cbody.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cbody=(CheckBox)view; // important line and code work
                if(cbody.isChecked())
                {
                    body.setVisibility(View.VISIBLE);
                }
                else
                {
                    body.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        ceyes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox ceyes=(CheckBox)view; // important line and code work
                if(ceyes.isChecked())
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        cnose.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cnose=(CheckBox)view; // important line and code work
                if(cnose.isChecked())
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        cears.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cears=(CheckBox)view; // important line and code work
                if(cears.isChecked())
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        cmustache.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cmustache=(CheckBox)view; // important line and code work
                if(cmustache.isChecked())
                {
                    mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    mustache.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        chat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox chat=(CheckBox)view; // important line and code work
                if(chat.isChecked())
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        ceyebrows.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox ceyebrows=(CheckBox)view; // important line and code work
                if(ceyebrows.isChecked())
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                ///////////////////////////////////////////////
            }
        });
        cglasses.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CheckBox cglasses=(CheckBox)view; // important line and code work
                if(cglasses.isChecked())
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
    });
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        int mouthValue = mouth.getVisibility();
        if (mouthValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("mouth", old);
        }
        int shoesValue = shoes.getVisibility();
        if (shoesValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("shoes", old);
        }
        int armsValue = arms.getVisibility();
        if (armsValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("arms", old);
        }
        int bodyValue = body.getVisibility();
        if (bodyValue == View.INVISIBLE){
            String old = "INVISIBLE";
            outState.putString("body", old);
        }
        int eyesValue = eyes.getVisibility();
        if (eyesValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("eyes", old);
        }
        int noseValue = nose.getVisibility();
        if (noseValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("nose", old);
        }
        int earsValue = ears.getVisibility();
        if (earsValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("ears", old);
        }
        int mustacheValue = mustache.getVisibility();
        if (mustacheValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("mustache", old);
        }
        int hatValue = hat.getVisibility();
        if (hatValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("hat", old);
        }
        int eyebrowsValue = eyebrows.getVisibility();
        if (eyebrowsValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("eyebrows", old);
        }
        int glassesValue = glasses.getVisibility();
        if (glassesValue == View.VISIBLE){
            String old = "VISIBLE";
            outState.putString("glasses", old);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        String mouthValueRestore = inState.getString("mouth");
        if (mouthValueRestore == "VISIBLE"){
            mouth.setVisibility(View.VISIBLE);
        }
        String shoesValueRestore = inState.getString("shoes");
        if (shoesValueRestore == "VISIBLE"){
            shoes.setVisibility(View.VISIBLE);
        }
        String armsValueRestore = inState.getString("arms");
        if (armsValueRestore == "VISIBLE"){
            arms.setVisibility(View.VISIBLE);
        }
        String bodyValueRestore = inState.getString("body");
        if (bodyValueRestore == "INVISIBLE"){
            body.setVisibility(View.INVISIBLE);
        }
        String eyesValueRestore = inState.getString("eyes");
        if (eyesValueRestore == "VISIBLE"){
            eyes.setVisibility(View.VISIBLE);
        }
        String noseValueRestore = inState.getString("nose");
        if (noseValueRestore == "VISIBLE"){
            nose.setVisibility(View.VISIBLE);
        }
        String earsValueRestore = inState.getString("ears");
        if (earsValueRestore == "VISIBLE"){
            ears.setVisibility(View.VISIBLE);
        }
        String mustacheValueRestore = inState.getString("mustache");
        if (mustacheValueRestore == "VISIBLE"){
            mustache.setVisibility(View.VISIBLE);
        }
        String hatValueRestore = inState.getString("hat");
        if (hatValueRestore == "VISIBLE"){
            hat.setVisibility(View.VISIBLE);
        }
        String eyebrowsValueRestore = inState.getString("eyebrows");
        if (eyebrowsValueRestore == "VISIBLE"){
            eyebrows.setVisibility(View.VISIBLE);
        }
        String glassesValueRestore = inState.getString("glasses");
        if (glassesValueRestore == "VISIBLE"){
            glasses.setVisibility(View.VISIBLE);
        }
    }


}
