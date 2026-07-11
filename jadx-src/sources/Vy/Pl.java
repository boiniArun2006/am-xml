package Vy;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Pl extends n {
    private boolean J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private WoV.j f11385O;
    private boolean Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f11386n;
    private pLC.j nr;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final J2B.Wre f11387t;
    private boolean xMQ;

    Pl(w6 w6Var, Ml ml) {
        this(w6Var, ml, UUID.randomUUID().toString());
    }

    public boolean HI() {
        return false;
    }

    Pl(w6 w6Var, Ml ml, String str) {
        this.f11387t = new J2B.Wre();
        this.J2 = false;
        this.Uo = false;
        this.rl = w6Var;
        this.f11386n = ml;
        this.KN = str;
        mUb(null);
        this.f11385O = (ml.nr() == I28.HTML || ml.nr() == I28.JAVASCRIPT) ? new WoV.n(str, ml.qie()) : new WoV.w6(str, ml.Uo(), ml.KN());
        this.f11385O.ViF();
        J2B.w6.O().rl(this);
        this.f11385O.nr(w6Var);
    }

    private void O() {
        if (this.xMQ) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void mUb(View view) {
        this.nr = new pLC.j(view);
    }

    private void xMQ() {
        if (this.mUb) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public boolean Ik() {
        return this.Uo;
    }

    public void WPU() {
        if (this.Uo) {
            return;
        }
        this.f11387t.rl();
    }

    public boolean Z() {
        return this.J2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View az() {
        return (View) this.nr.get();
    }

    public boolean ck() {
        return this.J2 && !this.Uo;
    }

    public String gh() {
        return this.KN;
    }

    @Override // Vy.n
    public void nr() {
        if (this.J2 || this.f11385O == null) {
            return;
        }
        this.J2 = true;
        J2B.w6.O().J2(this);
        this.f11385O.rl(J2B.Dsr.nr().t());
        this.f11385O.gh(J2B.j.n().t());
        this.f11385O.O(this, this.f11386n);
    }

    public boolean o() {
        return this.rl.t();
    }

    public WoV.j qie() {
        return this.f11385O;
    }

    public boolean r() {
        return this.rl.rl();
    }

    @Override // Vy.n
    public void rl() {
        if (this.Uo) {
            return;
        }
        this.nr.clear();
        WPU();
        this.Uo = true;
        qie().XQ();
        J2B.w6.O().nr(this);
        qie().HI();
        this.f11385O = null;
    }

    @Override // Vy.n
    public void t(View view) {
        if (this.Uo || az() == view) {
            return;
        }
        mUb(view);
        qie().n();
        J2(view);
    }

    public List ty() {
        return this.f11387t.n();
    }

    private void J2(View view) {
        Collection<Pl> collectionT = J2B.w6.O().t();
        if (collectionT != null && !collectionT.isEmpty()) {
            for (Pl pl : collectionT) {
                if (pl != this && pl.az() == view) {
                    pl.nr.clear();
                }
            }
        }
    }

    void KN(JSONObject jSONObject) {
        xMQ();
        qie().qie(jSONObject);
        this.mUb = true;
    }

    void S() {
        xMQ();
        qie().aYN();
        this.mUb = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Uo(List list) {
        if (HI()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((pLC.j) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    void XQ() {
        O();
        qie().S();
        this.xMQ = true;
    }
}
