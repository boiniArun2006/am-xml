package Y3a;

import WzY.OU;
import WzY.Sis;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final CubicBSpline f11999n;
    private static final Sis rl;

    static {
        CubicBSpline cubicBSplineCubicBSplineFromSVGPath = CubicBSplineKt.cubicBSplineFromSVGPath("M49.5739,34.7699L27.8609,1.3649C26.6779,-0.4551 24.0129,-0.4551 22.8299,1.3649L1.1169,34.7699C0.0389,36.4279 0.0389,38.5629 1.1169,40.2209L22.8299,73.6259C24.0129,75.4459 26.6779,75.4459 27.8609,73.6259L49.5739,40.2209C50.6509,38.5629 50.6509,36.4279 49.5739,34.7699Z");
        f11999n = cubicBSplineCubicBSplineFromSVGPath;
        rl = OU.J2(CubicBSplineKt.toPath(cubicBSplineCubicBSplineFromSVGPath));
    }

    public static /* synthetic */ BitmapDrawable J2(View view, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2131232325;
        }
        return nr(view, i2);
    }

    public static /* synthetic */ BitmapDrawable O(Context context, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 2131232325;
        }
        return t(context, i2);
    }

    public static final CubicBSpline n() {
        return f11999n;
    }

    public static final BitmapDrawable nr(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return t(context, i2);
    }

    public static final Sis rl() {
        return rl;
    }

    public static final BitmapDrawable t(Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Drawable drawable = context.getResources().getDrawable(i2, context.getTheme());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(context.getResources().getDimensionPixelOffset(2131166376), context.getResources().getDimensionPixelOffset(2131166376), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        return bitmapDrawable;
    }
}
