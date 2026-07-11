package com.alightcreative.widget;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class LEl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final OU f47148n = new OU(null);

    public static final OU n(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new OU(nr(context));
    }

    public static final Vibrator nr(Context context) {
        Vibrator defaultVibrator;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            defaultVibrator = AbstractC1764p.n(systemService).getDefaultVibrator();
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            defaultVibrator = (Vibrator) systemService2;
        }
        Intrinsics.checkNotNull(defaultVibrator);
        return defaultVibrator;
    }

    public static final OU rl(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return n(context);
    }

    public static final OU t(Fragment fragment) {
        OU ouN;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Context context = fragment.getContext();
        return (context == null || (ouN = n(context)) == null) ? f47148n : ouN;
    }
}
