package Li;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import jMi.C;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 {
    private static final yMa.j xMQ = yMa.j.O();
    private final oSp.n J2;
    private final oSp.n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.google.firebase.Wre f6180O;
    private final s9b.I28 Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f6181n = new ConcurrentHashMap();
    private Boolean nr;
    private final com.google.firebase.perf.config.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final O2.Wre f6182t;

    public boolean nr() {
        Boolean bool = this.nr;
        return bool != null ? bool.booleanValue() : com.google.firebase.Wre.az().S();
    }

    public Map rl() {
        return new HashMap(this.f6181n);
    }

    I28(com.google.firebase.Wre wre, oSp.n nVar, s9b.I28 i28, oSp.n nVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.j jVar, SessionManager sessionManager) {
        this.nr = null;
        this.f6180O = wre;
        this.J2 = nVar;
        this.Uo = i28;
        this.KN = nVar2;
        if (wre == null) {
            this.nr = Boolean.FALSE;
            this.rl = jVar;
            this.f6182t = new O2.Wre(new Bundle());
            return;
        }
        C.gh().r(wre, i28, nVar2);
        Context contextQie = wre.qie();
        O2.Wre wreN = n(contextQie);
        this.f6182t = wreN;
        remoteConfigManager.setFirebaseRemoteConfigProvider(nVar);
        this.rl = jVar;
        jVar.Xw(wreN);
        jVar.bzg(contextQie);
        sessionManager.setApplicationContext(contextQie);
        this.nr = jVar.mUb();
        yMa.j jVar2 = xMQ;
        if (jVar2.KN() && nr()) {
            jVar2.J2(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", yMa.n.rl(wre.ck().O(), contextQie.getPackageName())));
        }
    }

    private static O2.Wre n(Context context) {
        Bundle bundle;
        O2.Wre wre;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            Log.d("isEnabled", "No perf enable meta data found " + e2.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            wre = new O2.Wre(bundle);
        } else {
            wre = new O2.Wre();
        }
        return wre;
    }

    public static I28 t() {
        return (I28) com.google.firebase.Wre.az().mUb(I28.class);
    }

    public Trace O(String str) {
        return Trace.t(str);
    }
}
