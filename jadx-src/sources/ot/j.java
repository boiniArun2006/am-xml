package ot;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class j {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static final String rl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return n(context);
        } catch (ActivityNotFoundException unused) {
            return t(context);
        }
    }

    private static final String n(Context context) {
        int i2;
        String str = "market://details?id=" + context.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (context instanceof Activity) {
            i2 = 524288;
        } else {
            i2 = 268435456;
        }
        intent.addFlags(i2 | 1207959552);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        return str;
    }

    private static final String t(Context context) {
        String str = "http://play.google.com/store/apps/details?id=" + context.getPackageName();
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return str;
    }
}
