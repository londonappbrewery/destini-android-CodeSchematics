package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;

    int mStoryIndex = 1; // which part of the story user is on

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);

        updateStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mStoryIndex == 1)
                {
                    mStoryIndex = 3;
                    updateStory();
                }
                else if (mStoryIndex == 2)
                {
                    mStoryIndex = 3;
                    updateStory();
                }
                else
                {
                    mStoryIndex = 6;
                    updateStory();
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (mStoryIndex == 1)
                {
                    mStoryIndex = 2;
                    updateStory();
                }
                else if (mStoryIndex == 2)
                {
                    mStoryIndex = 4;
                    updateStory();
                }
                else
                {
                    mStoryIndex = 5;
                    updateStory();
                }
            }
        });

    }

    private void updateStory()
    {
        if (mStoryIndex == 1) // T1_Story
        {
            mStoryTextView.setText(R.string.T1_Story);
            mTopButton.setText(R.string.T1_Ans1);
            mBottomButton.setText(R.string.T1_Ans2);
        }
        else if (mStoryIndex == 2) // T2_Story
        {
            mStoryTextView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        }
        else if (mStoryIndex == 3) // T3_Story
        {
            mStoryTextView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        }
        else if (mStoryIndex == 4) // T4_End
        {
            mStoryTextView.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else if (mStoryIndex == 5) // T5_End
        {
            mStoryTextView.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else // T6_End
        {
            mStoryTextView.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}
