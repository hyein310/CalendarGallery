package com.example.calendargallery;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class myPictureView extends View {
    String imagePath = null;
    public myPictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (imagePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath); //SD카드의 이미지를 불러오기 때문에 에뮬레이터에 사진이 없을 시, 작동하지 않음.
            canvas.drawBitmap(bitmap, (canvas.getWidth()-bitmap.getWidth())/2, (canvas.getHeight()-bitmap.getHeight())/2, null);
            bitmap.recycle();
        }
    }
}