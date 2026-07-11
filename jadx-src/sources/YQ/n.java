package YQ;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {
    public static final Drawable n(Drawable resize, Context context, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(resize, "$this$resize");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num == null || num2 == null) {
            return resize;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        resize.setBounds(0, 0, num.intValue(), num2.intValue());
        resize.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static final Drawable rl(Drawable tint, Integer num) {
        Intrinsics.checkNotNullParameter(tint, "$this$tint");
        if (num != null) {
            DrawableCompat.HI(DrawableCompat.r(tint), ColorStateList.valueOf(num.intValue()));
        }
        return tint;
    }
}
