package Vil;

import Vil.I28;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class CN3 {
    public static final void n(Activity activity, int i2, TextView textView, View containerView, I28.j transition) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        String string = activity.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        rl(activity, string, textView, containerView, transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void rl(Activity activity, String string, TextView textView, View containerView, I28.j transition) {
        I28 customToastMaker;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Wre wre = activity instanceof Wre ? (Wre) activity : null;
        if (wre == null || (customToastMaker = wre.getCustomToastMaker()) == null) {
            return;
        }
        customToastMaker.t(string, textView, containerView, transition);
    }
}
