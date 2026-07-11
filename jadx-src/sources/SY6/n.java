package SY6;

import Hh.C;
import Hh.Dsr;
import Hh.qz;
import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.datasource.fuX;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n implements htt.Ml {
    private String HI;
    private Object J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Object f9772O;
    private Object[] Uo;
    private boolean az;
    private htt.j ck;
    private boolean gh;
    private Ml mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f9773n;
    private Object nr;
    private boolean qie;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f9774t;
    private boolean ty = false;
    private qz xMQ;
    private static final Ml Ik = new j();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final NullPointerException f9771r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicLong f9770o = new AtomicLong();

    class j extends SY6.w6 {
        @Override // SY6.w6, SY6.Ml
        public void nr(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: SY6.n$n, reason: collision with other inner class name */
    class C0314n implements qz {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ w6 f9775O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ htt.j f9776n;
        final /* synthetic */ Object nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f9777t;

        C0314n(htt.j jVar, String str, Object obj, Object obj2, w6 w6Var) {
            this.f9776n = jVar;
            this.rl = str;
            this.f9777t = obj;
            this.nr = obj2;
            this.f9775O = w6Var;
        }

        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public com.facebook.datasource.w6 get() {
            return n.this.xMQ(this.f9776n, this.rl, this.f9777t, this.nr, this.f9775O);
        }

        public String toString() {
            return Dsr.rl(this).rl(AdActivity.REQUEST_KEY_EXTRA, this.f9777t.toString()).toString();
        }
    }

    public enum w6 {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    private void o() {
        this.nr = null;
        this.f9772O = null;
        this.J2 = null;
        this.Uo = null;
        this.KN = true;
        this.mUb = null;
        this.gh = false;
        this.qie = false;
        this.ty = false;
        this.ck = null;
        this.HI = null;
    }

    public I28 KN() {
        return null;
    }

    protected abstract SY6.j aYN();

    protected final n r() {
        return this;
    }

    protected abstract com.facebook.datasource.w6 xMQ(htt.j jVar, String str, Object obj, Object obj2, w6 w6Var);

    protected static String O() {
        return String.valueOf(f9770o.getAndIncrement());
    }

    public Object HI() {
        return this.J2;
    }

    public boolean Ik() {
        return this.az;
    }

    public Object J2() {
        return this.nr;
    }

    public String Uo() {
        return this.HI;
    }

    protected qz ViF(htt.j jVar, String str) {
        qz qzVarQie;
        qz qzVar = this.xMQ;
        if (qzVar != null) {
            return qzVar;
        }
        Object obj = this.f9772O;
        if (obj != null) {
            qzVarQie = mUb(jVar, str, obj);
        } else {
            Object[] objArr = this.Uo;
            qzVarQie = objArr != null ? qie(jVar, str, objArr, this.KN) : null;
        }
        if (qzVarQie != null && this.J2 != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(qzVarQie);
            arrayList.add(mUb(jVar, str, this.J2));
            qzVarQie = fuX.t(arrayList, false);
        }
        return qzVarQie == null ? com.facebook.datasource.Ml.n(f9771r) : qzVarQie;
    }

    protected void WPU(SY6.j jVar) {
        if (this.gh) {
            jVar.nY().nr(this.gh);
            S(jVar);
        }
    }

    protected void XQ(SY6.j jVar) {
        Set set = this.rl;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jVar.xMQ((Ml) it.next());
            }
        }
        Set set2 = this.f9774t;
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                jVar.mUb((QVk.n) it2.next());
            }
        }
        Ml ml = this.mUb;
        if (ml != null) {
            jVar.xMQ(ml);
        }
        if (this.qie) {
            jVar.xMQ(Ik);
        }
    }

    public boolean Z() {
        return this.ty;
    }

    public Object[] az() {
        return this.Uo;
    }

    public htt.j ck() {
        return this.ck;
    }

    protected void fD() {
        boolean z2 = true;
        C.mUb(this.Uo == null || this.f9772O == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.xMQ != null && (this.Uo != null || this.f9772O != null || this.J2 != null)) {
            z2 = false;
        }
        C.mUb(z2, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    public n g(Object obj) {
        this.nr = obj;
        return r();
    }

    @Override // htt.Ml
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public n n(htt.j jVar) {
        this.ck = jVar;
        return r();
    }

    protected qz mUb(htt.j jVar, String str, Object obj) {
        return gh(jVar, str, obj, w6.FULL_FETCH);
    }

    public n nY(boolean z2) {
        this.qie = z2;
        return r();
    }

    protected qz qie(htt.j jVar, String str, Object[] objArr, boolean z2) {
        ArrayList arrayList = new ArrayList(objArr.length * 2);
        if (z2) {
            for (Object obj : objArr) {
                arrayList.add(gh(jVar, str, obj, w6.BITMAP_MEMORY_CACHE));
            }
        }
        for (Object obj2 : objArr) {
            arrayList.add(mUb(jVar, str, obj2));
        }
        return com.facebook.datasource.Wre.rl(arrayList);
    }

    public n te(Object obj) {
        this.f9772O = obj;
        return r();
    }

    public Object ty() {
        return this.f9772O;
    }

    protected n(Context context, Set set, Set set2) {
        this.f9773n = context;
        this.rl = set;
        this.f9774t = set2;
        o();
    }

    protected void S(SY6.j jVar) {
        if (jVar.Z() == null) {
            jVar.D(Uu.j.t(this.f9773n));
        }
    }

    protected qz gh(htt.j jVar, String str, Object obj, w6 w6Var) {
        return new C0314n(jVar, str, obj, J2(), w6Var);
    }

    protected SY6.j nr() {
        if (T5.n.nr()) {
            T5.n.n("AbstractDraweeControllerBuilder#buildController");
        }
        SY6.j jVarAYN = aYN();
        jVarAYN.a(Z());
        jVarAYN.I(Ik());
        jVarAYN.FX(Uo());
        KN();
        jVarAYN.J(null);
        WPU(jVarAYN);
        XQ(jVarAYN);
        if (T5.n.nr()) {
            T5.n.rl();
        }
        return jVarAYN;
    }

    @Override // htt.Ml
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public SY6.j build() {
        Object obj;
        fD();
        if (this.f9772O == null && this.Uo == null && (obj = this.J2) != null) {
            this.f9772O = obj;
            this.J2 = null;
        }
        return nr();
    }
}
