package nv;

import Rxk.Ml;
import Rxk.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {
    public static Rect n(Context context, int i2, int i3) {
        TypedArray typedArrayXMQ = eO.xMQ(context, null, o.lRt, i2, i3, new int[0]);
        int dimensionPixelSize = typedArrayXMQ.getDimensionPixelSize(o.gxH, context.getResources().getDimensionPixelSize(Ml.bzg));
        int dimensionPixelSize2 = typedArrayXMQ.getDimensionPixelSize(o.YiW, context.getResources().getDimensionPixelSize(Ml.Xw));
        int dimensionPixelSize3 = typedArrayXMQ.getDimensionPixelSize(o.yA, context.getResources().getDimensionPixelSize(Ml.rV9));
        int dimensionPixelSize4 = typedArrayXMQ.getDimensionPixelSize(o.n7u, context.getResources().getDimensionPixelSize(Ml.f8760v));
        typedArrayXMQ.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable rl(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
