package YgZ;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f12213n = new Ml();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static /* synthetic */ void rl(Ml ml, Context context, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "Cannot open the link.";
        }
        ml.n(context, str, str2);
    }

    public final void n(Context context, String url, String errorMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.setFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, errorMessage, 0).show();
        }
    }

    private Ml() {
    }
}
