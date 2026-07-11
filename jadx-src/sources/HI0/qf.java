package HI0;

import android.graphics.Color;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.SolidColorHSV;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qf {
    public static final SolidColor t(int i2) {
        return new SolidColor(Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, Color.alpha(i2) / 255.0f);
    }

    public static final int n(int i2) {
        return ((i2 >> 16) & 255) | ((-16711936) & i2) | ((i2 << 16) & 16711680);
    }

    public static final SolidColorHSV nr(int i2) {
        return ColorKt.toHSV(t(i2));
    }

    public static final String rl(int i2) {
        String hexString = Integer.toHexString(i2);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return "#" + StringsKt.padStart(hexString, 8, '0');
    }
}
