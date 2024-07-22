package com.example.xotrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    static TextView textView, xa, ya;
    Button b1, cb, jb;
    ImageView iv, conclusion;
  static  ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
   static int turnCounter = 0;
    public static int buttonSelected;
    static int[] xarray = {0, 0, 0};
    static int[] yarray = {0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv= findViewById(R.id.xo);
      //  b1 = findViewById(R.id.button1);
        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7);
        ib8 = findViewById(R.id.ib8);
        ib9 = findViewById(R.id.ib9);





        conclusion = findViewById(R.id.conc);
xa=findViewById(R.id.x);
ya=findViewById(R.id.y);

        applyAnimations();


    }

    private void applyAnimations() {
        AnimationSet animationSet = new AnimationSet(true);
       iv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);



        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        scaleAnimation.setDuration(4000);


        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(5000);


        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(3000);

        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(alphaAnimation);


        animationSet.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        iv.startAnimation(animationSet);
                    }
                }, 5000); // 5 second delay
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        iv.startAnimation(animationSet);
    }


  /*  public void toggleButton(View view) {

//x = 1, 0=0
if(turnCounter==-1){
    b1.setBackgroundResource(R.drawable.blank_button);
    b1.invalidate();
    turnCounter=1;
}
        else if (turnCounter ==1 ) {
            // Set "X" background
            b1.setBackgroundResource(R.drawable.x_vector);
    ib1.setBackgroundResource(R.drawable.x_pic);
   // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background
            b1.setBackgroundResource(R.drawable.o_button);
    ib1.setBackgroundResource(R.drawable.o_pic);
   // b1.invalidate();
            turnCounter=1;
        }
    } */


    public void toggleButton1(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=1;clicked();

        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib1.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib1.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }



    public void toggleButton2(View view) {
//for  b2
//x = 1, 0=0

        buttonSelected=2;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib2.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib2.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }



    public void toggleButton3(View view) {
//for  b3
//x = 1, 0=0

        buttonSelected=3;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib3.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib3.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clearf(view);
            clickcases();
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }



    public void toggleButton4(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=4;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib4.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib4.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }


    public void toggleButton5(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=5;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib5.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib5.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }



    public void toggleButton6(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=6;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib6.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib6.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }




    public void toggleButton7(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=7;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib7.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib7.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }



    public void toggleButton8(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=8;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib8.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib8.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }
    public void toggleButton9(View view) {
//for  b1
//x = 1, 0=0

        buttonSelected=9;clicked();
        if(turnCounter==-1){

            turnCounter=1;
        }
        else if (turnCounter ==1 ) {
            // Set "X" background

            ib9.setBackgroundResource(R.drawable.x_pic);
            xpush();
            // b1.invalidate();
            turnCounter=0;
        } else if (turnCounter==0){
            // Set "O" background

            ib9.setBackgroundResource(R.drawable.o_pic);
            ypush();
            // b1.invalidate();
            turnCounter=1;
        }
        xarray();
        yarray();
        if(winC()){
            clickcases();
            clearf(view);
            if(turnCounter==1) {
                conclusion.setBackgroundResource(R.drawable.owins);

            } else if (turnCounter==0) {
                conclusion.setBackgroundResource(R.drawable.xwins);
            }
        }
    }
    public static void xpush(){
        if(xcontains()||xscontains()){
           // System.out.println("reenter number pls: ");
            turnCounter=1;
        } else if(xarray[0]==0){
            xarray[0]=buttonSelected;
           // clicked();
        }
        else if (xarray[1]==0){
            xarray[1]=xarray[0];
            xarray[0]=buttonSelected;
          //  clicked();
        }
        else if (xarray[2]==0){
            xarray[2]=xarray[1];
            xarray[1]=xarray[0];
            xarray[0]=buttonSelected;
           // clicked();
        }

        else{
            xpop(buttonSelected);
            xarray[0]=buttonSelected;

        }


    }


    public static void xpop(int buttonSelected){
       // unclick(buttonSelected);
        if(xarray[2]==1){
            ib1.setBackgroundResource(android.R.color.transparent);
            ib1.setClickable(true);
        } else if (xarray[2]==2) {
            ib2.setBackgroundResource(android.R.color.transparent);
            ib2.setClickable(true);
        } else if (xarray[2]==3) {
            ib3.setBackgroundResource(android.R.color.transparent);
            ib3.setClickable(true);
        }
        else if (xarray[2]==4) {
            ib4.setBackgroundResource(android.R.color.transparent);
            ib4.setClickable(true);
        }
        else if (xarray[2]==5) {
            ib5.setBackgroundResource(android.R.color.transparent);
            ib5.setClickable(true);
        }
        else if (xarray[2]==6) {
            ib6.setBackgroundResource(android.R.color.transparent);
            ib6.setClickable(true);
        }
        else if (xarray[2]==7) {
            ib7.setBackgroundResource(android.R.color.transparent);
            ib7.setClickable(true);
        }
        else if (xarray[2]==8) {
            ib8.setBackgroundResource(android.R.color.transparent);
            ib8.setClickable(true);
        }
        else if (xarray[2]==9) {
            ib9.setBackgroundResource(android.R.color.transparent);
            ib9.setClickable(true);
        }

        xarray[2]=xarray[1];
        xarray[1]=xarray[0];
        xarray[0]=0;


    }



    public static void ypush(){
        if(ycontains()||yscontains()){
          //  System.out.println("reenter number pls: ");
            turnCounter=0;
        }
        else if(yarray[0]==0){
            yarray[0]=buttonSelected;
            //clicked();
        }
        else if (yarray[1]==0){
            yarray[1]=yarray[0];
            yarray[0]=buttonSelected;
           // clicked();
        }
        else if (yarray[2]==0){
            yarray[2]=yarray[1];
            yarray[1]=yarray[0];
            yarray[0]=buttonSelected;
           // clicked();
        }

        else{
            ypop(buttonSelected);
            yarray[0]=buttonSelected;
        }


    }


    public static void ypop(int buttonSelected){
       // unclick(buttonSelected);
        if(yarray[2]==1){
            ib1.setBackgroundResource(android.R.color.transparent);
            ib1.setClickable(true);
        } else if (yarray[2]==2) {
            ib2.setBackgroundResource(android.R.color.transparent);
            ib2.setClickable(true);
        } else if (yarray[2]==3) {
            ib3.setBackgroundResource(android.R.color.transparent);
            ib3.setClickable(true);
        }
    else if (yarray[2]==4) {
            ib4.setBackgroundResource(android.R.color.transparent);
            ib4.setClickable(true);
    }
else if (yarray[2]==5) {
            ib5.setBackgroundResource(android.R.color.transparent);
            ib5.setClickable(true);
        }
        else if (yarray[2]==6) {
            ib6.setBackgroundResource(android.R.color.transparent);
            ib6.setClickable(true);
        }
        else if (yarray[2]==7) {
            ib7.setBackgroundResource(android.R.color.transparent);
            ib7.setClickable(true);
        }
        else if (yarray[2]==8) {
            ib8.setBackgroundResource(android.R.color.transparent);
            ib8.setClickable(true);
        }
        else if (yarray[2]==9) {
            ib9.setBackgroundResource(android.R.color.transparent);
            ib9.setClickable(true);
        }


        yarray[2]=yarray[1];
        yarray[1]=yarray[0];
        yarray[0]=0;



    }

    public static boolean xscontains() {
        for (int element1 : xarray){
            if (element1 == buttonSelected){
                return true;
            }
        }
        return false;
    }
    public static boolean yscontains() {
        for (int element1 : yarray){
            if (element1 == buttonSelected){
                return true;
            }
        }
        return false;
    }
    public static boolean xcontains() {
        for (int element1 : yarray){
            if (element1 == buttonSelected){
                return true;
            }
        }
        return false;
    }
    public static boolean ycontains() {
        for (int element1 : xarray){
            if (element1 == buttonSelected){
                return true;
            }
        }
        return false;
    }




    public static boolean winC(){
//sorry this is big, there were too many different combinations of outcomes, also the comments in this function might be wrongly labeled
        // win - row
        if (xarray[0]==1 && xarray[1]==2 && xarray[2]==3 ){ //x row 1.1
            return true;
        }
        else if (xarray[0]==1 && xarray[1]==3 && xarray[2]==2 ){ //x row 1.2
            return true;
        }

        else if (xarray[0]==2 && xarray[1]==1 && xarray[2]==3 ){ // x row 1.3
            return true;
        }
        else if (xarray[0]==2 && xarray[1]==3 && xarray[2]==1 ){ // x row 1.4
            return true;
        }
        else if (xarray[0]==3 && xarray[1]==2 && xarray[2]==1 ){ //x row 1.5
            return true;
        }
        else if (xarray[0]==3 && xarray[1]==1 && xarray[2]==2 ){ //x row 1.6
            return true;
        }
        else if (yarray[0]==1 && yarray[1]==2 && yarray[2]==3 ){  // y row 1.1
            return true;
        }
        else if (yarray[0]==1 && yarray[1]==3 && yarray[2]==2 ){ //y row 1.2
            return true;
        }

        else if (yarray[0]==2 && yarray[1]==1 && yarray[2]==3 ){ // y row 1.3
            return true;
        }
        else if (yarray[0]==2 && yarray[1]==3 && yarray[2]==1 ){ // y row 1.4
            return true;
        }
        else if (yarray[0]==3 && yarray[1]==2 && yarray[2]==1 ){ //y row 1.5
            return true;
        }
        else if (yarray[0]==3 && yarray[1]==1 && yarray[2]==2 ){ //y row 1.6
            return true;
        }

        else if (xarray[0]==4 && xarray[1]==5 && xarray[2]==6 ){ //x row 2.1
            return true;
        }
        else if (xarray[0]==4 && xarray[1]==6 && xarray[2]==5 ){ //x row 2.2
            return true;
        }

        else if (xarray[0]==5 && xarray[1]==4 && xarray[2]==6 ){ // x row 2.3
            return true;
        }
        else if (xarray[0]==5 && xarray[1]==6 && xarray[2]==4 ){ // x row 2.4
            return true;
        }
        else if (xarray[0]==6 && xarray[1]==5 && xarray[2]==4 ){ //x row 2.5
            return true;
        }
        else if (xarray[0]==6 && xarray[1]==4 && xarray[2]==5 ){ //x row 2.6
            return true;
        }
        else if (yarray[0]==4 && yarray[1]==5 && yarray[2]==6 ){  // y row 2.1
            return true;
        }
        else if (yarray[0]==4 && yarray[1]==6 && yarray[2]==5 ){ //y row 2.2
            return true;
        }

        else if (yarray[0]==5 && yarray[1]==4 && yarray[2]==6 ){ // y row 2.3
            return true;
        }
        else if (yarray[0]==5 && yarray[1]==6 && yarray[2]==4 ){ // y row 2.4
            return true;
        }
        else if (yarray[0]==6 && yarray[1]==5 && yarray[2]==4 ){ //y row 2.5
            return true;
        }
        else if (yarray[0]==6 && yarray[1]==4 && yarray[2]==5 ){ //y row 2.6
            return true;
        }     else if (xarray[0]==7 && xarray[1]==8 && xarray[2]==9 ){ //x row 3.1
            return true;
        }
        else if (xarray[0]==7 && xarray[1]==9 && xarray[2]==8 ){ //x row 3.2
            return true;
        }

        else if (xarray[0]==8 && xarray[1]==7 && xarray[2]==9 ){ // x row 3.3
            return true;
        }
        else if (xarray[0]==8 && xarray[1]==9 && xarray[2]==7 ){ // x row 3.4
            return true;
        }
        else if (xarray[0]==9 && xarray[1]==7 && xarray[2]==8 ){ //x row 3.5
            return true;
        }
        else if (xarray[0]==9 && xarray[1]==8 && xarray[2]==7 ){ //x row 3.6
            return true;
        }
        else if (yarray[0]==7 && yarray[1]==9 && yarray[2]==8 ){  // y row 3.1
            return true;
        }
        else if (yarray[0]==7 && yarray[1]==8 && yarray[2]==9 ){ //y row 3.2
            return true;
        }

        else if (yarray[0]==8 && yarray[1]==9 && yarray[2]==7 ){ // y row 3.3
            return true;
        }
        else if (yarray[0]==8 && yarray[1]==7 && yarray[2]==9 ){ // y row 3.4
            return true;
        }
        else if (yarray[0]==9 && yarray[1]==8 && yarray[2]==7 ){ //y row 3.5
            return true;
        }
        else if (yarray[0]==9 && yarray[1]==7 && yarray[2]==8 ){ //y row 3.6
            return true;
        }







        // win - col
        if (xarray[0]==1 && xarray[1]==4 && xarray[2]==7 ){ //x col 1.1
            return true;
        }
        else if (xarray[0]==1 && xarray[1]==7 && xarray[2]==4 ){ //x col 1.2
            return true;
        }

        else if (xarray[0]==4 && xarray[1]==7 && xarray[2]==1 ){ // x col 1.3
            return true;
        }
        else if (xarray[0]==4 && xarray[1]==1 && xarray[2]==7 ){ // x col 1.4
            return true;
        }
        else if (xarray[0]==7 && xarray[1]==1 && xarray[2]==4 ){ //x col 1.5
            return true;
        }
        else if (xarray[0]==7 && xarray[1]==4 && xarray[2]==1 ){ //x col 1.6
            return true;
        }
        else if (yarray[0] == 1 && yarray[1] == 4 && yarray[2] == 7) { //y col 1.1
            return true;
        } else if (yarray[0] == 1 && yarray[1] == 7 && yarray[2] == 4) { //y col 1.2
            return true;
        } else if (yarray[0] == 4 && yarray[1] == 7 && yarray[2] == 1) { //y col 1.3
            return true;
        } else if (yarray[0] == 4 && yarray[1] == 1 && yarray[2] == 7) { //y col 1.4
            return true;
        } else if (yarray[0] == 7 && yarray[1] == 1 && yarray[2] == 4) { //y col 1.5
            return true;
        } else if (yarray[0] == 7 && yarray[1] == 4 && yarray[2] == 1) { //y col 1.6
            return true;
        }



        else  if (xarray[0] == 2 && xarray[1] == 5 && xarray[2] == 8) { //x col 1.1
            return true;
        } else if (xarray[0] == 2 && xarray[1] == 8 && xarray[2] == 5) { //x col 1.2
            return true;
        } else if (xarray[0] == 5 && xarray[1] == 8 && xarray[2] == 2) { //x col 1.3
            return true;
        } else if (xarray[0] == 5 && xarray[1] == 2 && xarray[2] == 8) { //x col 1.4
            return true;
        } else if (xarray[0] == 8 && xarray[1] == 2 && xarray[2] == 5) { //x col 1.5
            return true;
        } else if (xarray[0] == 8 && xarray[1] == 5 && xarray[2] == 2) { //x col 1.6
            return true;
        } else if (yarray[0] == 2 && yarray[1] == 5 && yarray[2] == 8) { //y col 1.1
            return true;
        } else if (yarray[0] == 2 && yarray[1] == 8 && yarray[2] == 5) { //y col 1.2
            return true;
        } else if (yarray[0] == 5 && yarray[1] == 8 && yarray[2] == 2) { //y col 1.3
            return true;
        } else if (yarray[0] == 5 && yarray[1] == 2 && yarray[2] == 8) { //y col 1.4
            return true;
        } else if (yarray[0] == 8 && yarray[1] == 2 && yarray[2] == 5) { //y col 1.5
            return true;
        } else if (yarray[0] == 8 && yarray[1] == 5 && yarray[2] == 2) { //y col 1.6
            return true;
        }



        else  if (xarray[0] == 3 && xarray[1] == 6 && xarray[2] == 9) { //x col 1.1
            return true;
        } else if (xarray[0] == 3 && xarray[1] == 9 && xarray[2] == 6) { //x col 1.2
            return true;
        } else if (xarray[0] == 6 && xarray[1] == 9 && xarray[2] == 3) { //x col 1.3
            return true;
        } else if (xarray[0] == 6 && xarray[1] == 3 && xarray[2] == 9) { //x col 1.4
            return true;
        } else if (xarray[0] == 9 && xarray[1] == 3 && xarray[2] == 6) { //x col 1.5
            return true;
        } else if (xarray[0] == 9 && xarray[1] == 6 && xarray[2] == 3) { //x col 1.6
            return true;
        } else if (yarray[0] == 3 && yarray[1] == 6 && yarray[2] == 9) { //y col 1.1
            return true;
        } else if (yarray[0] == 3 && yarray[1] == 9 && yarray[2] == 6) { //y col 1.2
            return true;
        } else if (yarray[0] == 6 && yarray[1] == 9 && yarray[2] == 3) { //y col 1.3
            return true;
        } else if (yarray[0] == 6 && yarray[1] == 3 && yarray[2] == 9) { //y col 1.4
            return true;
        } else if (yarray[0] == 9 && yarray[1] == 3 && yarray[2] == 6) { //y col 1.5
            return true;
        } else if (yarray[0] == 9 && yarray[1] == 6 && yarray[2] == 3) { //y col 1.6
            return true;
        }

//diagonal checkign here
        else if(xarray[0]==1&&xarray[1]==5&&xarray[2]==9){
            return true;
        }
        else if(xarray[0]==1&&xarray[1]==9&&xarray[2]==5){
            return true;
        }

        else if(xarray[0]==5&&xarray[1]==1&&xarray[2]==9){
            return true;
        }
        else if(xarray[0]==5&&xarray[1]==9&&xarray[2]==1){
            return true;
        }

        else if(xarray[0]==9&&xarray[1]==1&&xarray[2]==5){
            return true;
        }

        else if(xarray[0]==9&&xarray[1]==5&&xarray[2]==1){
            return true;
        }



        else if(yarray[0]==1&&yarray[1]==5&&yarray[2]==9){
            return true;
        }
        else if(yarray[0]==1&&yarray[1]==9&&yarray[2]==5){
            return true;
        }
        else if(yarray[0]==5&&yarray[1]==1&&yarray[2]==9){
            return true;
        }
        else if(yarray[0]==5&&yarray[1]==9&&yarray[2]==1){
            return true;
        }

        else if(yarray[0]==9&&yarray[1]==1&&yarray[2]==5){
            return true;
        }

        else if(yarray[0]==9&&yarray[1]==5&&yarray[2]==1){
            return true;
        }




        else if(xarray[0]==3&&xarray[1]==5&&xarray[2]==7){
            return true;
        }
        else if(xarray[0]==3&&xarray[1]==7&&xarray[2]==5){
            return true;
        }

        else if(xarray[0]==5&&xarray[1]==3&&xarray[2]==7){
            return true;
        }
        else if(xarray[0]==5&&xarray[1]==7&&xarray[2]==3){
            return true;
        }

        else if(xarray[0]==7&&xarray[1]==3&&xarray[2]==5){
            return true;
        }

        else if(xarray[0]==7&&xarray[1]==5&&xarray[2]==3){
            return true;
        }



        else if(yarray[0]==3&&yarray[1]==5&&yarray[2]==7){
            return true;
        }
        else if(yarray[0]==3&&yarray[1]==7&&yarray[2]==5){
            return true;
        }
        else if(yarray[0]==5&&yarray[1]==3&&yarray[2]==7){
            return true;
        }
        else if(yarray[0]==5&&yarray[1]==7&&yarray[2]==3){
            return true;
        }

        else if(yarray[0]==7&&yarray[1]==3&&yarray[2]==5){
            return true;
        }

        else if(yarray[0]==7&&yarray[1]==5&&yarray[2]==3){
            return true;
        }


//add diagonal conditions
        else {
            return false;
        }



    }
    public static void xarray(){
        String xs ="";
        for (int num=0;num<3;num++){
           xs += String.valueOf(+xarray[num]);

        }
        xa.setText(xs);
    }
    public static void yarray(){
        String ys ="";
        for (int num=0;num<3;num++){
            ys += String.valueOf(+yarray[num]);

        }
        ya.setText(ys);
    }


    public void clearf(View view) {
        if(!winC()) {
            clickcasesno();
            clickcases();
            ib1.setBackgroundResource(android.R.color.transparent);
            ib2.setBackgroundResource(android.R.color.transparent);
            ib3.setBackgroundResource(android.R.color.transparent);
            ib4.setBackgroundResource(android.R.color.transparent);
            ib5.setBackgroundResource(android.R.color.transparent);
            ib6.setBackgroundResource(android.R.color.transparent);
            ib7.setBackgroundResource(android.R.color.transparent);
            ib8.setBackgroundResource(android.R.color.transparent);
            ib9.setBackgroundResource(android.R.color.transparent);
            xarray[0] = 0;
            xarray[1] = 0;
            xarray[2] = 0;
            yarray[0] = 0;
            yarray[1] = 0;
            yarray[2] = 0;

            conclusion.setBackgroundResource(android.R.color.transparent);
        }
        if(winC()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Your code to be executed after the delay
                    clickcasesno();
                    ib1.setBackgroundResource(android.R.color.transparent);
                    ib2.setBackgroundResource(android.R.color.transparent);
                    ib3.setBackgroundResource(android.R.color.transparent);
                    ib4.setBackgroundResource(android.R.color.transparent);
                    ib5.setBackgroundResource(android.R.color.transparent);
                    ib6.setBackgroundResource(android.R.color.transparent);
                    ib7.setBackgroundResource(android.R.color.transparent);
                    ib8.setBackgroundResource(android.R.color.transparent);
                    ib9.setBackgroundResource(android.R.color.transparent);
                    xarray[0] = 0;
                    xarray[1] = 0;
                    xarray[2] = 0;
                    yarray[0] = 0;
                    yarray[1] = 0;
                    yarray[2] = 0;

                    conclusion.setBackgroundResource(android.R.color.transparent);
                    clickcases();
                }
            }, 2500);
        }
    }


    public void clickcases(){
        ib1.setClickable(true);
        ib2.setClickable(true);
        ib3.setClickable(true);
        ib4.setClickable(true);
        ib5.setClickable(true);
        ib6.setClickable(true);
        ib7.setClickable(true);
        ib8.setClickable(true);
        ib9.setClickable(true);

    }
    public void clickcasesno(){
        ib1.setClickable(false);
        ib2.setClickable(false);
        ib3.setClickable(false);
        ib4.setClickable(false);
        ib5.setClickable(false);
        ib6.setClickable(false);
        ib7.setClickable(false);
        ib8.setClickable(false);
        ib9.setClickable(false);

    }
   /* public void click(){
        if(xarray[0]==0){
            clickcases();
        }
        if(xarray[1]==0){
            clickcases();
        }
        if(xarray[2]==0){
            clickcases();
        }
        if(yarray[0]==0){
            clickcases();
        }
        if(yarray[1]==0){
            clickcases();
        }
        if(yarray[2]==0){
            clickcases();
        }

    } */

    public static void clicked(){
        if(buttonSelected==1){
            ib1.setClickable(false);
        }
        if(buttonSelected==2){
            ib2.setClickable(false);
        }
        if(buttonSelected==3){
            ib3.setClickable(false);
        }
        if(buttonSelected==4){
            ib4.setClickable(false);
        }
        if(buttonSelected==5){
            ib5.setClickable(false);
        }
        if(buttonSelected==6){
            ib6.setClickable(false);
        }
        if(buttonSelected==7){
            ib7.setClickable(false);
        }
        if(buttonSelected==8){
            ib8.setClickable(false);
        }
        if(buttonSelected==9){
            ib9.setClickable(false);
        }


    }

    public static void unclick(int buttonSelected){
        if(xarray[2]==1){
            ib1.setClickable(true);
        }
        if(xarray[2]==2){
            ib2.setClickable(true);
        }
        if(xarray[2]==3){
            ib3.setClickable(true);
        }
        if(xarray[2]==4){
            ib4.setClickable(true);
        }
        if(xarray[2]==5){
            ib5.setClickable(true);
        }
        if(xarray[2]==6){
            ib6.setClickable(true);
        }
        if(xarray[2]==7){
            ib7.setClickable(true);
        }
        if(xarray[2]==8){
            ib8.setClickable(true);
        }
        if(xarray[2]==9){
            ib9.setClickable(true);
        }
        if(yarray[2]==1){
            ib1.setClickable(true);
        }
        if(yarray[2]==2){
            ib2.setClickable(true);
        }
        if(yarray[2]==3){
            ib3.setClickable(true);
        }
        if(yarray[2]==4){
            ib4.setClickable(true);
        }
        if(yarray[2]==5){
            ib5.setClickable(true);
        }
        if(yarray[2]==6){
            ib6.setClickable(true);
        }
        if(yarray[2]==7){
            ib7.setClickable(true);
        }
        if(yarray[2]==8){
            ib8.setClickable(true);
        }
        if(yarray[2]==9){
            ib9.setClickable(true);
        }


    }





    }
//the end thank you for going thru this, best regards-dm :)

