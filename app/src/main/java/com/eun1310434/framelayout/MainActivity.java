/*=====================================================================
□ INFORMATION
  ○ Data : 28.05.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ FUNCTION
  ○

□ STUDY
  ○ Frame Layout
     - FrameLayout is designed to block out an area on the screen to display a single item.
       Generally, FrameLayout should be used to hold a single child view,
       because it can be difficult to organize child views in a way that's scalable to different screen sizes without the children overlapping each other.
       You can, however, add multiple children to a FrameLayout and control their position within the FrameLayout by assigning gravity to each child,
       using the android:layout_gravity attribute.
=====================================================================*/
package com.eun1310434.framelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onButtonClicked(View v) {
        //android:onClick="onButtonClicked" 으로 설정 했음
        changeImage();
    }

    private void changeImage() {
        if (imageIndex == 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        } else if (imageIndex == 1) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }
    }
}
