package yzg;

import K7m.Wre;
import K7m.fuX;
import a88.Pl;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import g4f.aC;
import hcZ.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import yzg.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j implements j.InterfaceC0957j {
    private long KN;
    private int rl;
    private static j xMQ = new j();
    private static Handler mUb = new Handler(Looper.getMainLooper());
    private static Handler gh = null;
    private static final Runnable qie = new n();
    private static final Runnable az = new w6();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f76214n = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f76215t = false;
    private final List nr = new ArrayList();
    private yzg.n J2 = new yzg.n();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private hcZ.n f76213O = new hcZ.n();
    private yzg.w6 Uo = new yzg.w6(new Ej.w6());

    /* JADX INFO: renamed from: yzg.j$j, reason: collision with other inner class name */
    class RunnableC1288j implements Runnable {
        RunnableC1288j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.Uo.rl();
        }
    }

    private void az() {
        this.rl = 0;
        this.nr.clear();
        this.f76215t = false;
        Iterator it = g4f.w6.O().n().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((Pl) it.next()).Ik()) {
                this.f76215t = true;
                break;
            }
        }
        this.KN = Wre.rl();
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.ck().XQ();
        }
    }

    class w6 implements Runnable {
        w6() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.gh != null) {
                j.gh.post(j.qie);
                j.gh.postDelayed(j.az, 200L);
            }
        }
    }

    private void J2(String str, View view, JSONObject jSONObject) {
        hcZ.j jVarRl = this.f76213O.rl();
        String strUo = this.J2.Uo(str);
        if (strUo != null) {
            JSONObject jSONObjectA = jVarRl.a(view);
            K7m.w6.Uo(jSONObjectA, str);
            K7m.w6.HI(jSONObjectA, strUo);
            K7m.w6.xMQ(jSONObject, jSONObjectA);
        }
    }

    private void O(View view, hcZ.j jVar, JSONObject jSONObject, Ml ml, boolean z2) {
        jVar.n(view, jSONObject, this, ml == Ml.PARENT_VIEW, z2);
    }

    private boolean Uo(View view, JSONObject jSONObject) {
        n.j jVarXMQ = this.J2.xMQ(view);
        if (jVarXMQ == null) {
            return false;
        }
        K7m.w6.mUb(jSONObject, jVarXMQ);
        return true;
    }

    private void Z() {
        Handler handler = gh;
        if (handler != null) {
            handler.removeCallbacks(az);
            gh = null;
        }
    }

    public static j ck() {
        return xMQ;
    }

    private boolean mUb(View view, JSONObject jSONObject) {
        String strMUb = this.J2.mUb(view);
        if (strMUb == null) {
            return false;
        }
        K7m.w6.Uo(jSONObject, strMUb);
        K7m.w6.J2(jSONObject, Boolean.valueOf(this.J2.ck(view)));
        K7m.w6.ty(jSONObject, Boolean.valueOf(this.J2.qie(strMUb)));
        this.J2.ty();
        return true;
    }

    private void nr(long j2) {
        if (this.f76214n.size() > 0) {
            Iterator it = this.f76214n.iterator();
            if (it.hasNext()) {
                android.support.v4.media.j.n(it.next());
                TimeUnit.NANOSECONDS.toMillis(j2);
                throw null;
            }
        }
    }

    private void r() {
        if (gh == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            gh = handler;
            handler.post(qie);
            gh.postDelayed(az, 200L);
        }
    }

    void ty() {
        j jVar;
        this.J2.HI();
        long jRl = Wre.rl();
        hcZ.j jVarN = this.f76213O.n();
        if (this.J2.KN().size() > 0) {
            for (String str : this.J2.KN()) {
                JSONObject jSONObjectA = jVarN.a(null);
                J2(str, this.J2.n(str), jSONObjectA);
                K7m.w6.az(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.Uo.n(jSONObjectA, hashSet, jRl);
            }
        }
        if (this.J2.gh().size() > 0) {
            JSONObject jSONObjectA2 = jVarN.a(null);
            jVar = this;
            jVar.O(null, jVarN, jSONObjectA2, Ml.PARENT_VIEW, false);
            K7m.w6.az(jSONObjectA2);
            jVar.Uo.t(jSONObjectA2, jVar.J2.gh(), jRl);
            if (jVar.f76215t) {
                Iterator it = g4f.w6.O().n().iterator();
                while (it.hasNext()) {
                    ((Pl) it.next()).xMQ(jVar.nr);
                }
            }
        } else {
            jVar = this;
            jVar.Uo.rl();
        }
        jVar.J2.nr();
    }

    j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ() {
        az();
        ty();
        qie();
        aC.J2().n();
    }

    private void qie() {
        nr(Wre.rl() - this.KN);
    }

    public void HI() {
        Z();
    }

    public void Ik() {
        r();
    }

    @Override // hcZ.j.InterfaceC0957j
    public void n(View view, hcZ.j jVar, JSONObject jSONObject, boolean z2) {
        Ml mlAz;
        j jVar2;
        boolean z3;
        if (!fuX.J2(view) || (mlAz = this.J2.az(view)) == Ml.UNDERLYING_VIEW) {
            return;
        }
        JSONObject jSONObjectA = jVar.a(view);
        K7m.w6.xMQ(jSONObject, jSONObjectA);
        if (!mUb(view, jSONObjectA)) {
            boolean zUo = Uo(view, jSONObjectA);
            if (!z2 && !zUo) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f76215t && mlAz == Ml.OBSTRUCTION_VIEW && !z3) {
                this.nr.add(new r1j.j(view));
            }
            jVar2 = this;
            jVar2.O(view, jVar, jSONObjectA, mlAz, z3);
        } else {
            jVar2 = this;
        }
        jVar2.rl++;
    }

    public void o() {
        HI();
        this.f76214n.clear();
        mUb.post(new RunnableC1288j());
    }
}
