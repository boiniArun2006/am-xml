package UiE;

import android.content.Context;
import android.os.Bundle;
import com.facebook.Ew;
import com.facebook.appevents.Xo;
import com.facebook.appevents.rv6;
import com.facebook.internal.Z;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Xo f10810n = new Xo();
    private static final String rl = Xo.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long[] f10811t = {300000, 900000, 1800000, 3600000, 21600000, 43200000, SignalManager.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final int n(long j2) {
        if (VmF.j.nr(Xo.class)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            try {
                long[] jArr = f10811t;
                if (i2 >= jArr.length || jArr[i2] >= j2) {
                    break;
                }
                i2++;
            } catch (Throwable th) {
                VmF.j.rl(th, Xo.class);
                return 0;
            }
        }
        return i2;
    }

    public static final void nr(String activityName, Pl pl, String str) {
        long jLongValue;
        String string;
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (pl == null) {
                return;
            }
            Long lRl = pl.rl();
            if (lRl != null) {
                jLongValue = lRl.longValue();
            } else {
                Long lO = pl.O();
                jLongValue = 0 - (lO != null ? lO.longValue() : 0L);
            }
            if (jLongValue < 0) {
                f10810n.t();
                jLongValue = 0;
            }
            long jJ2 = pl.J2();
            if (jJ2 < 0) {
                f10810n.t();
                jJ2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", pl.t());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(n(jLongValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str2);
            eO eOVarUo = pl.Uo();
            if (eOVarUo == null || (string = eOVarUo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long lO2 = pl.O();
            bundle.putLong("_logTime", (lO2 != null ? lO2.longValue() : 0L) / ((long) 1000));
            rv6.rl.n(activityName, str, null).t("fb_mobile_deactivate_app", jJ2 / 1000, bundle);
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    public static final void rl(String activityName, eO eOVar, String str, Context context) {
        String string;
        if (VmF.j.nr(Xo.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            if (eOVar == null || (string = eOVar.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            rv6.j jVar = rv6.rl;
            rv6 rv6VarN = jVar.n(activityName, str, null);
            rv6VarN.nr("fb_mobile_activate_app", bundle);
            if (jVar.t() != Xo.n.EXPLICIT_ONLY) {
                rv6VarN.n();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Xo.class);
        }
    }

    private Xo() {
    }

    private final void t() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Z.j jVar = Z.f52780O;
            Ew ew = Ew.APP_EVENTS;
            String str = rl;
            Intrinsics.checkNotNull(str);
            jVar.rl(ew, str, "Clock skew detected");
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }
}
