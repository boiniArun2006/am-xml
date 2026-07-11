package N;

import android.content.Context;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {
    public static final int n(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ((float) context.getResources().getConfiguration().screenWidthDp) < 600.0f ? WindowWidthSizeClass.INSTANCE.nr() : ((float) context.getResources().getConfiguration().screenWidthDp) < 840.0f ? WindowWidthSizeClass.INSTANCE.Uo() : WindowWidthSizeClass.INSTANCE.J2();
    }
}
