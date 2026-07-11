package SHQ;

import SHQ.j;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzls;
import com.google.firebase.Wre;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n implements SHQ.j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile SHQ.j f9077t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final AppMeasurementSdk f9078n;
    final Map rl;

    class j implements j.InterfaceC0309j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f9079n;
        final /* synthetic */ n rl;

        j(n nVar, String str) {
            this.f9079n = str;
            Objects.requireNonNull(nVar);
            this.rl = nVar;
        }
    }

    static /* synthetic */ void KN(WU.j jVar) {
        throw null;
    }

    @Override // SHQ.j
    public List J2(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f9078n.getConditionalUserProperties(str, str2)) {
            int i2 = com.google.firebase.analytics.connector.internal.n.Uo;
            Preconditions.checkNotNull(bundle);
            j.w6 w6Var = new j.w6();
            w6Var.f9075n = (String) Preconditions.checkNotNull((String) zzjg.zzb(bundle, "origin", String.class, null));
            w6Var.rl = (String) Preconditions.checkNotNull((String) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.NAME, String.class, null));
            w6Var.f9076t = zzjg.zzb(bundle, "value", Object.class, null);
            w6Var.nr = (String) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            w6Var.f9074O = ((Long) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            w6Var.J2 = (String) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            w6Var.Uo = (Bundle) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            w6Var.KN = (String) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            w6Var.xMQ = (Bundle) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            w6Var.mUb = ((Long) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            w6Var.gh = (String) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            w6Var.qie = (Bundle) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            w6Var.ty = ((Boolean) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            w6Var.az = ((Long) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            w6Var.HI = ((Long) zzjg.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(w6Var);
        }
        return arrayList;
    }

    @Override // SHQ.j
    public int O(String str) {
        return this.f9078n.getMaxUserProperties(str);
    }

    @Override // SHQ.j
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.n.rl(str2, bundle)) {
            this.f9078n.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // SHQ.j
    public void nr(j.w6 w6Var) {
        String str;
        int i2 = com.google.firebase.analytics.connector.internal.n.Uo;
        if (w6Var == null || (str = w6Var.f9075n) == null || str.isEmpty()) {
            return;
        }
        Object obj = w6Var.f9076t;
        if ((obj == null || zzls.zzb(obj) != null) && com.google.firebase.analytics.connector.internal.n.n(str) && com.google.firebase.analytics.connector.internal.n.nr(str, w6Var.rl)) {
            String str2 = w6Var.gh;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.n.rl(str2, w6Var.qie) && com.google.firebase.analytics.connector.internal.n.O(str, w6Var.gh, w6Var.qie))) {
                String str3 = w6Var.KN;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.n.rl(str3, w6Var.xMQ) && com.google.firebase.analytics.connector.internal.n.O(str, w6Var.KN, w6Var.xMQ))) {
                    String str4 = w6Var.J2;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.n.rl(str4, w6Var.Uo) && com.google.firebase.analytics.connector.internal.n.O(str, w6Var.J2, w6Var.Uo))) {
                        AppMeasurementSdk appMeasurementSdk = this.f9078n;
                        Bundle bundle = new Bundle();
                        String str5 = w6Var.f9075n;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = w6Var.rl;
                        if (str6 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str6);
                        }
                        Object obj2 = w6Var.f9076t;
                        if (obj2 != null) {
                            zzjg.zza(bundle, obj2);
                        }
                        String str7 = w6Var.nr;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, w6Var.f9074O);
                        String str8 = w6Var.J2;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = w6Var.Uo;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = w6Var.KN;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = w6Var.xMQ;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, w6Var.mUb);
                        String str10 = w6Var.gh;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = w6Var.qie;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, w6Var.az);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, w6Var.ty);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, w6Var.HI);
                        appMeasurementSdk.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // SHQ.j
    public void rl(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.n.n(str) && com.google.firebase.analytics.connector.internal.n.rl(str2, bundle) && com.google.firebase.analytics.connector.internal.n.O(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f9078n.logEvent(str, str2, bundle);
        }
    }

    @Override // SHQ.j
    public Map t(boolean z2) {
        return this.f9078n.getUserProperties(null, null, z2);
    }

    n(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f9078n = appMeasurementSdk;
        this.rl = new ConcurrentHashMap();
    }

    public static SHQ.j Uo(Wre wre, Context context, WU.Ml ml) {
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(ml);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f9077t == null) {
            synchronized (n.class) {
                try {
                    if (f9077t == null) {
                        Bundle bundle = new Bundle(1);
                        if (wre.WPU()) {
                            ml.n(com.google.firebase.n.class, Ml.f9073n, w6.f9080n);
                            bundle.putBoolean("dataCollectionDefaultEnabled", wre.S());
                        }
                        f9077t = new n(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f9077t;
    }

    private final boolean xMQ(String str) {
        if (!str.isEmpty()) {
            Map map = this.rl;
            if (map.containsKey(str) && map.get(str) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // SHQ.j
    public j.InterfaceC0309j n(String str, j.n nVar) {
        Object wre;
        Preconditions.checkNotNull(nVar);
        if (com.google.firebase.analytics.connector.internal.n.n(str) && !xMQ(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f9078n;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                wre = new com.google.firebase.analytics.connector.internal.Ml(appMeasurementSdk, nVar);
            } else if ("clx".equals(str)) {
                wre = new com.google.firebase.analytics.connector.internal.Wre(appMeasurementSdk, nVar);
            } else {
                wre = null;
            }
            if (wre != null) {
                this.rl.put(str, wre);
                return new j(this, str);
            }
        }
        return null;
    }
}
