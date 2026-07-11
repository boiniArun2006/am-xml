package w9;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class CN3 {
    public static final void n(Object obj, String msg, String tag) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Log.d("Fellini:" + tag, msg);
    }

    public static /* synthetic */ void rl(Object obj, String str, String str2, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            str2 = obj.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(str2, "this::class.java.simpleName");
        }
        n(obj, str, str2);
    }
}
