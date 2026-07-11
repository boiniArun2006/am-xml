package Y;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fg {
    public static final Bitmap nr(String str, Resources res) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int dimensionPixelSize = res.getDimensionPixelSize(2131165438);
        int dimensionPixelSize2 = res.getDimensionPixelSize(2131166256);
        int dimensionPixelSize3 = res.getDimensionPixelSize(2131166253);
        int color = res.getColor(2131099748, null);
        int color2 = res.getColor(2131099755, null);
        int dimensionPixelOffset = res.getDimensionPixelOffset(2131165283);
        int dimensionPixelOffset2 = res.getDimensionPixelOffset(2131165437);
        int dimensionPixelSize4 = res.getDimensionPixelSize(2131165970);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(-1);
        textPaint.setTextSize(dimensionPixelSize);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, (int) textPaint.measureText(str)).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(staticLayoutBuild.getWidth() + (dimensionPixelSize3 * 2) + dimensionPixelSize4, dimensionPixelOffset2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(canvas.getClipBounds());
        rectF.right -= dimensionPixelSize4;
        paint.setColor(color2);
        float f3 = dimensionPixelSize3;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        paint.setColor(color);
        float f4 = dimensionPixelOffset;
        canvas.drawRoundRect(new RectF(rectF.left + f4, rectF.top + f4, rectF.right - f4, rectF.bottom - f4), f3, f3, paint);
        canvas.translate(f3, dimensionPixelSize2);
        staticLayoutBuild.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final void rl(final EditText editText, final Function1 onRightClicked, final Function1 otherClicked) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(onRightClicked, "onRightClicked");
        Intrinsics.checkNotNullParameter(otherClicked, "otherClicked");
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: Y.gnv
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return fg.t(onRightClicked, editText, otherClicked, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(Function1 function1, EditText editText, Function1 function12, View view, MotionEvent motionEvent) {
        if (view instanceof EditText) {
            EditText editText2 = (EditText) view;
            if (motionEvent.getX() < editText2.getWidth() - editText2.getTotalPaddingEnd()) {
                Intrinsics.checkNotNull(motionEvent);
                function12.invoke(motionEvent);
            } else if (motionEvent.getAction() == 1) {
                function1.invoke(editText);
            }
        }
        return true;
    }
}
