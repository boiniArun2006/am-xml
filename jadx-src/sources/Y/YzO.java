package Y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class YzO extends Ic.j {
    private final int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f11932t;

    @Override // Ic.j, Ic.n
    public lN.Ml n() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("gradient:#%08X..#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f11932t), Integer.valueOf(this.nr)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return new lN.fuX(str);
    }

    @Override // Ic.j
    public void nr(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, bitmap.getHeight(), this.nr, this.f11932t, Shader.TileMode.CLAMP));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
    }

    public YzO(int i2, int i3) {
        this.f11932t = i2;
        this.nr = i3;
    }
}
