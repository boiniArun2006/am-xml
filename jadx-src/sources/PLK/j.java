package PLK;

import HI0.qf;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j extends Ic.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f7692t;

    public j(int i2) {
        this.f7692t = i2;
    }

    public /* synthetic */ j(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i2);
    }

    @Override // Ic.j
    public void nr(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        SolidColor solidColorT = qf.t(this.f7692t);
        for (int i2 = 0; i2 < width; i2++) {
            for (int i3 = 0; i3 < height; i3++) {
                int i5 = (i3 * width) + i2;
                iArr[i5] = ColorKt.toInt(ColorKt.times(solidColorT, ((double) Color.red(iArr[i5])) / 255.0d));
            }
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }
}
