package BUw;

import SHQ.j;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import oSp.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.j f482n;
    private final List nr;
    private volatile YSF.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile po.n f483t;

    public Ml(oSp.j jVar) {
        this(jVar, new po.w6(), new YSF.Wre());
    }

    public static /* synthetic */ void t(Ml ml, po.j jVar) {
        synchronized (ml) {
            try {
                if (ml.f483t instanceof po.w6) {
                    ml.nr.add(jVar);
                }
                ml.f483t.n(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ml(oSp.j jVar, po.n nVar, YSF.j jVar2) {
        this.f482n = jVar;
        this.f483t = nVar;
        this.nr = new ArrayList();
        this.rl = jVar2;
        J2();
    }

    private void J2() {
        this.f482n.n(new j.InterfaceC1084j() { // from class: BUw.w6
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                Ml.n(this.f487n, nVar);
            }
        });
    }

    private static j.InterfaceC0309j Uo(SHQ.j jVar, I28 i28) {
        j.InterfaceC0309j interfaceC0309jN = jVar.n("clx", i28);
        if (interfaceC0309jN != null) {
            return interfaceC0309jN;
        }
        h1M.CN3.J2().rl("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        j.InterfaceC0309j interfaceC0309jN2 = jVar.n(AppMeasurement.CRASH_ORIGIN, i28);
        if (interfaceC0309jN2 != null) {
            h1M.CN3.J2().gh("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0309jN2;
    }

    public po.n O() {
        return new po.n() { // from class: BUw.j
            @Override // po.n
            public final void n(po.j jVar) {
                Ml.t(this.f485n, jVar);
            }
        };
    }

    public YSF.j nr() {
        return new YSF.j() { // from class: BUw.n
            @Override // YSF.j
            public final void n(String str, Bundle bundle) {
                this.f486n.rl.n(str, bundle);
            }
        };
    }

    public static /* synthetic */ void n(Ml ml, oSp.n nVar) {
        ml.getClass();
        h1M.CN3.J2().rl("AnalyticsConnector now available.");
        SHQ.j jVar = (SHQ.j) nVar.get();
        YSF.I28 i28 = new YSF.I28(jVar);
        I28 i282 = new I28();
        if (Uo(jVar, i282) != null) {
            h1M.CN3.J2().rl("Registered Firebase Analytics listener.");
            YSF.Ml ml2 = new YSF.Ml();
            YSF.w6 w6Var = new YSF.w6(i28, 500, TimeUnit.MILLISECONDS);
            synchronized (ml) {
                try {
                    Iterator it = ml.nr.iterator();
                    while (it.hasNext()) {
                        ml2.n((po.j) it.next());
                    }
                    i282.nr(ml2);
                    i282.O(w6Var);
                    ml.f483t = ml2;
                    ml.rl = w6Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        h1M.CN3.J2().gh("Could not register Firebase Analytics listener; a listener is already registered.");
    }
}
