package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.vd;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class M {
    public static SharedPreferences mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final M f52200n = new M();
    public static final String rl = M.class.getName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f52201t = new AtomicBoolean(false);
    public static final AtomicBoolean nr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f52199O = new j(true, "com.facebook.sdk.AutoInitEnabled");
    public static final j J2 = new j(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    public static final j Uo = new j(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    public static final j KN = new j(false, "auto_event_setup_enabled");
    public static final j xMQ = new j(true, "com.facebook.sdk.MonitorEnabled");

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f52202n;
        public long nr;
        public String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Boolean f52203t;

        public j(boolean z2, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f52202n = z2;
            this.rl = key;
        }

        public final void J2(long j2) {
            this.nr = j2;
        }

        public final boolean O() {
            Boolean bool = this.f52203t;
            return bool != null ? bool.booleanValue() : this.f52202n;
        }

        public final void Uo(Boolean bool) {
            this.f52203t = bool;
        }

        public final boolean n() {
            return this.f52202n;
        }

        public final Boolean nr() {
            return this.f52203t;
        }

        public final String rl() {
            return this.rl;
        }

        public final long t() {
            return this.nr;
        }
    }

    private final void HI() {
        int i2;
        int i3;
        ApplicationInfo applicationInfo;
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (f52201t.get() && s4.e()) {
                Context contextQie = s4.qie();
                int i5 = 0;
                int i7 = (f52199O.O() ? 1 : 0) | ((J2.O() ? 1 : 0) << 1) | ((Uo.O() ? 1 : 0) << 2) | ((xMQ.O() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = mUb;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i8 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i8 != i7) {
                    SharedPreferences sharedPreferences3 = mUb;
                    if (sharedPreferences3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i7).apply();
                    try {
                        applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
                        Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    } catch (PackageManager.NameNotFoundException unused) {
                        i2 = 0;
                    }
                    if (applicationInfo.metaData == null) {
                        i3 = 0;
                        com.facebook.appevents.rv6 rv6Var = new com.facebook.appevents.rv6(contextQie);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i5);
                        bundle.putInt("initial", i3);
                        bundle.putInt("previous", i8);
                        bundle.putInt("current", i7);
                        rv6Var.rl(bundle);
                    }
                    String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                    boolean[] zArr = {true, true, true, true};
                    i3 = 0;
                    i2 = 0;
                    while (i5 < 4) {
                        try {
                            i2 |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                            i3 |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                            i5++;
                        } catch (PackageManager.NameNotFoundException unused2) {
                            i5 = i3;
                        }
                    }
                    i5 = i2;
                    com.facebook.appevents.rv6 rv6Var2 = new com.facebook.appevents.rv6(contextQie);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i5);
                    bundle2.putInt("initial", i3);
                    bundle2.putInt("previous", i8);
                    bundle2.putInt("current", i7);
                    rv6Var2.rl(bundle2);
                    i3 = i5;
                    i5 = i2;
                    com.facebook.appevents.rv6 rv6Var22 = new com.facebook.appevents.rv6(contextQie);
                    Bundle bundle22 = new Bundle();
                    bundle22.putInt("usage", i5);
                    bundle22.putInt("initial", i3);
                    bundle22.putInt("previous", i8);
                    bundle22.putInt("current", i7);
                    rv6Var22.rl(bundle22);
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final Boolean Ik() {
        String str = "";
        if (VmF.j.nr(M.class)) {
            return null;
        }
        try {
            f52200n.o();
            try {
                SharedPreferences sharedPreferences = mUb;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(J2.rl(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e2) {
                vd.z(rl, e2);
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
            return null;
        }
    }

    public static final boolean J2() {
        if (VmF.j.nr(M.class)) {
            return false;
        }
        try {
            M m2 = f52200n;
            m2.mUb();
            return m2.rl();
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
            return false;
        }
    }

    public static final boolean O() {
        if (VmF.j.nr(M.class)) {
            return false;
        }
        try {
            f52200n.mUb();
            return f52199O.O();
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
            return false;
        }
    }

    public static final boolean Uo() {
        if (VmF.j.nr(M.class)) {
            return false;
        }
        try {
            f52200n.mUb();
            return KN.O();
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
            return false;
        }
    }

    public static final boolean nr() {
        if (VmF.j.nr(M.class)) {
            return false;
        }
        try {
            f52200n.mUb();
            return Uo.O();
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
            return false;
        }
    }

    private final void r(j jVar) {
        String str = "";
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            o();
            try {
                SharedPreferences sharedPreferences = mUb;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(jVar.rl(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    jVar.Uo(Boolean.valueOf(jSONObject.getBoolean("value")));
                    jVar.J2(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e2) {
                vd.z(rl, e2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final void ty() {
        if (VmF.j.nr(M.class)) {
            return;
        }
        try {
            Context contextQie = s4.qie();
            ApplicationInfo applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.rv6 rv6Var = new com.facebook.appevents.rv6(contextQie);
            Bundle bundle2 = new Bundle();
            if (!vd.eF()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(rl, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            rv6Var.nr("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
        }
    }

    public static final void xMQ(long j2) {
        com.facebook.internal.QJ qjXQ;
        if (VmF.j.nr(M.class)) {
            return;
        }
        try {
            if (Uo.O() && (qjXQ = com.facebook.internal.UGc.XQ(s4.az(), false)) != null && qjXQ.nr()) {
                com.facebook.internal.j jVarO = com.facebook.internal.j.J2.O(s4.qie());
                String strKN = (jVarO == null || jVarO.KN() == null) ? null : jVarO.KN();
                if (strKN != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strKN);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestAYN = GraphRequest.ty.aYN(null, PangleCreativeInfo.f62498a, null);
                    graphRequestAYN.T(bundle);
                    JSONObject jSONObjectT = graphRequestAYN.gh().t();
                    if (jSONObjectT != null) {
                        j jVar = KN;
                        jVar.Uo(Boolean.valueOf(jSONObjectT.optBoolean("auto_event_setup_enabled", false)));
                        jVar.J2(j2);
                        f52200n.Z(jVar);
                    }
                }
            }
            nr.set(false);
        } catch (Throwable th) {
            VmF.j.rl(th, M.class);
        }
    }

    private final void KN() {
        if (!VmF.j.nr(this)) {
            try {
                j jVar = KN;
                r(jVar);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (jVar.nr() == null || jCurrentTimeMillis - jVar.t() >= 604800000) {
                    jVar.Uo(null);
                    jVar.J2(0L);
                    if (!nr.compareAndSet(false, true)) {
                        return;
                    }
                    s4.Z().execute(new Runnable() { // from class: com.facebook.iwV
                        @Override // java.lang.Runnable
                        public final void run() {
                            M.xMQ(jCurrentTimeMillis);
                        }
                    });
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void Z(j jVar) {
        if (!VmF.j.nr(this)) {
            try {
                o();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", jVar.nr());
                    jSONObject.put("last_timestamp", jVar.t());
                    SharedPreferences sharedPreferences = mUb;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                    sharedPreferences.edit().putString(jVar.rl(), jSONObject.toString()).apply();
                    HI();
                } catch (Exception e2) {
                    vd.z(rl, e2);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void az(j jVar) {
        if (!VmF.j.nr(this)) {
            try {
                o();
                try {
                    Context contextQie = s4.qie();
                    ApplicationInfo applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null && bundle.containsKey(jVar.rl())) {
                        jVar.Uo(Boolean.valueOf(applicationInfo.metaData.getBoolean(jVar.rl(), jVar.n())));
                        return;
                    }
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    vd.z(rl, e2);
                    return;
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
            VmF.j.rl(th, this);
        }
    }

    private final void ck() {
        if (!VmF.j.nr(this)) {
            try {
                Context contextQie = s4.qie();
                ApplicationInfo applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                        Log.w(rl, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                    }
                    if (!nr()) {
                        Log.w(rl, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void gh(j... jVarArr) {
        if (!VmF.j.nr(this)) {
            try {
                for (j jVar : jVarArr) {
                    if (jVar == KN) {
                        KN();
                    } else if (jVar.nr() == null) {
                        r(jVar);
                        if (jVar.nr() == null) {
                            az(jVar);
                        }
                    } else {
                        Z(jVar);
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void mUb() {
        if (!VmF.j.nr(this)) {
            try {
                if (!s4.e() || !f52201t.compareAndSet(false, true)) {
                    return;
                }
                SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…GS, Context.MODE_PRIVATE)");
                mUb = sharedPreferences;
                gh(J2, Uo, f52199O);
                KN();
                ck();
                HI();
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void o() {
        if (!VmF.j.nr(this)) {
            try {
                if (f52201t.get()) {
                } else {
                    throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final Boolean qie() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            o();
            try {
                Context contextQie = s4.qie();
                ApplicationInfo applicationInfo = contextQie.getPackageManager().getApplicationInfo(contextQie.getPackageName(), 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    j jVar = J2;
                    if (bundle.containsKey(jVar.rl())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(jVar.rl()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                vd.z(rl, e2);
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final boolean rl() {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Map mapUo = com.facebook.internal.UGc.Uo();
            if (mapUo != null && !mapUo.isEmpty()) {
                Boolean bool = (Boolean) mapUo.get("auto_log_app_events_enabled");
                Boolean bool2 = (Boolean) mapUo.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean boolT = t();
                if (boolT != null) {
                    return boolT.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return J2.O();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final Boolean t() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Boolean boolIk = Ik();
            if (boolIk != null) {
                return boolIk;
            }
            Boolean boolQie = qie();
            if (boolQie == null) {
                return null;
            }
            return boolQie;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
