package bZx;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import bZx.qz;
import com.facebook.GraphRequest;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {
    private static volatile boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static String f43341O;
    private static o nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static SensorManager f43343t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f43342n = new I28();
    private static final qz rl = new qz();
    private static final AtomicBoolean J2 = new AtomicBoolean(true);
    private static final AtomicBoolean Uo = new AtomicBoolean(false);

    public static final void J2() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            J2.set(true);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final boolean KN() {
        if (VmF.j.nr(I28.class)) {
            return false;
        }
        try {
            return Uo.get();
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return false;
        }
    }

    public static final void O() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            J2.set(false);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final String Uo() {
        if (VmF.j.nr(I28.class)) {
            return null;
        }
        try {
            if (f43341O == null) {
                f43341O = UUID.randomUUID().toString();
            }
            String str = f43341O;
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void az(QJ qj, String appId) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(appId, "$appId");
            boolean z2 = qj != null && qj.nr();
            boolean zO = s4.o();
            if (z2 && zO) {
                f43342n.t(appId);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final void gh(Activity activity) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (J2.get()) {
                CN3.J2.n().KN(activity);
                o oVar = nr;
                if (oVar != null) {
                    oVar.qie();
                }
                SensorManager sensorManager = f43343t;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(rl);
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final void mUb(Activity activity) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            CN3.J2.n().J2(activity);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(String str) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.internal.j jVarO = com.facebook.internal.j.J2.O(s4.qie());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((jVarO != null ? jVarO.KN() : null) != null) {
                jSONArray.put(jVarO.KN());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(UiE.fuX.O() ? "1" : "0");
            Locale localeTe = vd.te();
            jSONArray.put(localeTe.getLanguage() + '_' + localeTe.getCountry());
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", Uo());
            bundle.putString("extinfo", string);
            GraphRequest.w6 w6Var = GraphRequest.ty;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z2 = true;
            String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
            JSONObject jSONObjectT = w6Var.te(null, str3, bundle, null).gh().t();
            AtomicBoolean atomicBoolean = Uo;
            if (jSONObjectT == null || !jSONObjectT.optBoolean("is_app_indexing_enabled", false)) {
                z2 = false;
            }
            atomicBoolean.set(z2);
            if (atomicBoolean.get()) {
                o oVar = nr;
                if (oVar != null) {
                    oVar.KN();
                }
            } else {
                f43341O = null;
            }
            KN = false;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final void qie(Activity activity) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (J2.get()) {
                CN3.J2.n().O(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strAz = s4.az();
                final QJ qjJ2 = UGc.J2(strAz);
                if ((qjJ2 != null && qjJ2.nr()) || f43342n.xMQ()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f43343t = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    o oVar = new o(activity);
                    nr = oVar;
                    qz qzVar = rl;
                    qzVar.n(new qz.n() { // from class: bZx.w6
                        @Override // bZx.qz.n
                        public final void n() {
                            I28.az(qjJ2, strAz);
                        }
                    });
                    sensorManager.registerListener(qzVar, defaultSensor, 2);
                    if (qjJ2 != null && qjJ2.nr()) {
                        oVar.KN();
                    }
                }
                I28 i28 = f43342n;
                if (!i28.xMQ() || Uo.get()) {
                    return;
                }
                i28.t(strAz);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final void ty(boolean z2) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            Uo.set(z2);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    private I28() {
    }

    private final void t(final String str) {
        if (!VmF.j.nr(this)) {
            try {
                if (KN) {
                    return;
                }
                KN = true;
                s4.Z().execute(new Runnable() { // from class: bZx.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        I28.nr(str);
                    }
                });
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final boolean xMQ() {
        VmF.j.nr(this);
        return false;
    }
}
