package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class AppCompatResources {
    public static ColorStateList n(Context context, int i2) {
        return ContextCompat.getColorStateList(context, i2);
    }

    public static Drawable rl(Context context, int i2) {
        return ResourceManagerInternal.Uo().xMQ(context, i2);
    }
}
