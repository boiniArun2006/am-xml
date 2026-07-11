package a88;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Pl extends n {
    private boolean J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private y5v.j f12709O;
    private boolean Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Ml f12710n;
    private r1j.j nr;
    private final w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g4f.Wre f12711t;
    private boolean xMQ;

    Pl(w6 w6Var, Ml ml) {
        this(w6Var, ml, UUID.randomUUID().toString());
    }

    public boolean Ik() {
        return false;
    }

    Pl(w6 w6Var, Ml ml, String str) {
        this.f12711t = new g4f.Wre();
        this.J2 = false;
        this.Uo = false;
        this.rl = w6Var;
        this.f12710n = ml;
        this.KN = str;
        qie(null);
        this.f12709O = (ml.t() == I28.HTML || ml.t() == I28.JAVASCRIPT) ? new y5v.n(str, ml.mUb()) : new y5v.w6(str, ml.J2(), ml.Uo());
        this.f12709O.ViF();
        g4f.w6.O().rl(this);
        this.f12709O.O(w6Var);
    }

    private void Uo() {
        if (this.xMQ) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void gh() {
        if (this.mUb) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void qie(View view) {
        this.nr = new r1j.j(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View HI() {
        return (View) this.nr.get();
    }

    @Override // a88.n
    public void J2() {
        if (this.J2 || this.f12709O == null) {
            return;
        }
        this.J2 = true;
        g4f.w6.O().J2(this);
        this.f12709O.rl(g4f.Dsr.nr().t());
        this.f12709O.qie(g4f.j.n().t());
        this.f12709O.J2(this, this.f12710n);
    }

    @Override // a88.n
    public void O(View view) {
        if (this.Uo) {
            return;
        }
        this.f12711t.Uo(view);
    }

    public boolean S() {
        return this.J2;
    }

    public void ViF() {
        if (this.Uo) {
            return;
        }
        this.f12711t.J2();
    }

    public boolean XQ() {
        return this.rl.t();
    }

    public boolean Z() {
        return this.rl.rl();
    }

    public String az() {
        return this.KN;
    }

    public List ck() {
        return this.f12711t.n();
    }

    @Override // a88.n
    public void n(View view, fuX fux, String str) {
        if (this.Uo) {
            return;
        }
        this.f12711t.t(view, fux, str);
    }

    @Override // a88.n
    public void nr(View view) {
        if (this.Uo || HI() == view) {
            return;
        }
        qie(view);
        ty().n();
        KN(view);
    }

    public boolean o() {
        return this.Uo;
    }

    public boolean r() {
        return this.J2 && !this.Uo;
    }

    @Override // a88.n
    public void t() {
        if (this.Uo) {
            return;
        }
        this.nr.clear();
        ViF();
        this.Uo = true;
        ty().XQ();
        g4f.w6.O().nr(this);
        ty().HI();
        this.f12709O = null;
    }

    public y5v.j ty() {
        return this.f12709O;
    }

    private void KN(View view) {
        Collection<Pl> collectionT = g4f.w6.O().t();
        if (collectionT != null && !collectionT.isEmpty()) {
            for (Pl pl : collectionT) {
                if (pl != this && pl.HI() == view) {
                    pl.nr.clear();
                }
            }
        }
    }

    void WPU() {
        Uo();
        ty().S();
        this.xMQ = true;
    }

    void aYN() {
        gh();
        ty().aYN();
        this.mUb = true;
    }

    void mUb(JSONObject jSONObject) {
        gh();
        ty().az(jSONObject);
        this.mUb = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void xMQ(List list) {
        if (Ik()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((r1j.j) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }
}
