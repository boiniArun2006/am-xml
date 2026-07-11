package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class TooltipCompat {

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static void n(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void n(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.n(view, charSequence);
        } else {
            TooltipCompatHandler.Uo(view, charSequence);
        }
    }
}
