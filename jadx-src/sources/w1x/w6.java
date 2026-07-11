package w1x;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f74796n = new w6();
    private static final Set rl = SetsKt.setOf((Object[]) new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(String applicationId, com.facebook.appevents.Ml event) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
            Intrinsics.checkNotNullParameter(event, "$event");
            I28.t(applicationId, CollectionsKt.listOf(event));
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(Context context, String str, String str2) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "$context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            String str3 = str2 + "pingForOnDevice";
            if (sharedPreferences.getLong(str3, 0L) == 0) {
                I28.O(str2);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putLong(str3, System.currentTimeMillis());
                editorEdit.apply();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    public static final void O(final String applicationId, final com.facebook.appevents.Ml event) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(event, "event");
            if (f74796n.t(event)) {
                s4.Z().execute(new Runnable() { // from class: w1x.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6.J2(applicationId, event);
                    }
                });
            }
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    public static final void Uo(final String str, final String str2) {
        if (VmF.j.nr(w6.class)) {
            return;
        }
        try {
            final Context contextQie = s4.qie();
            if (contextQie == null || str == null || str2 == null) {
                return;
            }
            s4.Z().execute(new Runnable() { // from class: w1x.n
                @Override // java.lang.Runnable
                public final void run() {
                    w6.KN(contextQie, str2, str);
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
        }
    }

    public static final boolean nr() {
        if (VmF.j.nr(w6.class)) {
            return false;
        }
        try {
            if (!s4.nY(s4.qie()) && !vd.J()) {
                if (I28.rl()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return false;
        }
    }

    private w6() {
    }

    private final boolean t(com.facebook.appevents.Ml ml) {
        boolean z2;
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            if (ml.KN() && rl.contains(ml.J2())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ml.KN() && !z2) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
