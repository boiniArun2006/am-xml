package SY6;

import Hh.C;
import Hh.CN3;
import Hh.Dsr;
import QVk.n;
import TD.j;
import TD.w6;
import Uu.j;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.caoccao.javet.utils.SimpleFreeMarkerFormat;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements htt.j, j.InterfaceC0359j, j.InterfaceC0384j {
    private boolean HI;
    private String Ik;
    protected Ml J2;
    private htt.w6 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Uu.j f9761O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected Drawable f9762S;
    private boolean az;
    private boolean ck;
    private Object gh;
    private String mUb;
    private TD.Ml nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f9765o;
    private boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.facebook.datasource.w6 f9766r;
    private final TD.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f9767t;
    private boolean ty;
    private Drawable xMQ;
    private static final Map WPU = CN3.of("component_tag", "drawee");
    private static final Map aYN = CN3.of("origin", "memory_bitmap", "origin_sub", "shortcut");
    private static final Class ViF = j.class;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TD.w6 f9764n = TD.w6.n();
    protected QVk.Ml Uo = new QVk.Ml();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f9763Z = true;
    private boolean XQ = false;

    /* JADX INFO: renamed from: SY6.j$j, reason: collision with other inner class name */
    class C0313j extends com.facebook.datasource.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f9768n;
        final /* synthetic */ boolean rl;

        C0313j(String str, boolean z2) {
            this.f9768n = str;
            this.rl = z2;
        }

        @Override // com.facebook.datasource.n
        public void O(com.facebook.datasource.w6 w6Var) {
            j.this.s7N(this.f9768n, w6Var, w6Var.nr(), true);
        }

        @Override // com.facebook.datasource.n
        public void J2(com.facebook.datasource.w6 w6Var) {
            boolean zRl = w6Var.rl();
            boolean zJ2 = w6Var.J2();
            float fT = w6Var.t();
            Object result = w6Var.getResult();
            if (result != null) {
                j.this.v(this.f9768n, w6Var, result, fT, zRl, this.rl, zJ2);
            } else if (zRl) {
                j.this.s7N(this.f9768n, w6Var, new NullPointerException(), true);
            }
        }

        @Override // com.facebook.datasource.I28
        public void nr(com.facebook.datasource.w6 w6Var) {
            boolean zRl = w6Var.rl();
            j.this.rV9(this.f9768n, w6Var, w6Var.t(), zRl);
        }
    }

    private void P5(Throwable th, com.facebook.datasource.w6 w6Var) {
        n.j jVarT = T(w6Var, null, null);
        HI().rl(this.mUb, th);
        ck().rl(this.mUb, th, jVarT);
    }

    private void X(String str, Object obj) {
        if (Dzy.j.az(2)) {
            Dzy.j.o(ViF, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.mUb, str, S(obj), Integer.valueOf(WPU(obj)));
        }
    }

    private void e(String str, Throwable th) {
        if (Dzy.j.az(2)) {
            Dzy.j.r(ViF, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.mUb, str, th);
        }
    }

    private boolean fD(String str, com.facebook.datasource.w6 w6Var) {
        if (w6Var == null && this.f9766r == null) {
            return true;
        }
        return str.equals(this.mUb) && w6Var == this.f9766r && this.az;
    }

    private synchronized void te(String str, Object obj) {
        TD.j jVar;
        try {
            if (T5.n.nr()) {
                T5.n.n("AbstractDraweeController#init");
            }
            this.f9764n.rl(w6.j.ON_INIT_CONTROLLER);
            if (!this.f9763Z && (jVar = this.rl) != null) {
                jVar.n(this);
            }
            this.qie = false;
            this.ty = false;
            Xw();
            this.ck = false;
            TD.Ml ml = this.nr;
            if (ml != null) {
                ml.n();
            }
            Uu.j jVar2 = this.f9761O;
            if (jVar2 != null) {
                jVar2.n();
                this.f9761O.J2(this);
            }
            Ml ml2 = this.J2;
            if (ml2 instanceof n) {
                ((n) ml2).KN();
            } else {
                this.J2 = null;
            }
            htt.w6 w6Var = this.KN;
            if (w6Var != null) {
                w6Var.reset();
                this.KN.J2(null);
                this.KN = null;
            }
            this.xMQ = null;
            if (Dzy.j.az(2)) {
                Dzy.j.Ik(ViF, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.mUb, str);
            }
            this.mUb = str;
            this.gh = obj;
            if (T5.n.nr()) {
                T5.n.rl();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void J(I28 i28) {
    }

    protected abstract Uri ViF();

    protected abstract int WPU(Object obj);

    protected abstract Object aYN(Object obj);

    protected abstract Object az();

    protected abstract void bzg(Drawable drawable);

    protected abstract Drawable gh(Object obj);

    protected abstract void jB(Object obj);

    @Override // Uu.j.InterfaceC0384j
    public boolean n() {
        if (Dzy.j.az(2)) {
            Dzy.j.ck(ViF, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.mUb);
        }
        if (!Nxk()) {
            return false;
        }
        this.nr.rl();
        this.KN.reset();
        Y();
        return true;
    }

    public abstract Map nHg(Object obj);

    @Override // htt.j
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (Dzy.j.az(2)) {
            Dzy.j.Ik(ViF, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.mUb, motionEvent);
        }
        Uu.j jVar = this.f9761O;
        if (jVar == null) {
            return false;
        }
        if (!jVar.rl() && !GR()) {
            return false;
        }
        this.f9761O.nr(motionEvent);
        return true;
    }

    protected abstract com.facebook.datasource.w6 r();

    @Override // htt.j
    public void t(htt.n nVar) {
        if (Dzy.j.az(2)) {
            Dzy.j.Ik(ViF, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.mUb, nVar);
        }
        this.f9764n.rl(nVar != null ? w6.j.ON_SET_HIERARCHY : w6.j.ON_CLEAR_HIERARCHY);
        if (this.az) {
            this.rl.n(this);
            release();
        }
        htt.w6 w6Var = this.KN;
        if (w6Var != null) {
            w6Var.J2(null);
            this.KN = null;
        }
        if (nVar != null) {
            C.rl(Boolean.valueOf(nVar instanceof htt.w6));
            htt.w6 w6Var2 = (htt.w6) nVar;
            this.KN = w6Var2;
            w6Var2.J2(this.xMQ);
        }
    }

    protected void wTp(String str, Object obj) {
    }

    private static class n extends Wre {
        private n() {
        }

        public static n mUb(Ml ml, Ml ml2) {
            if (T5.n.nr()) {
                T5.n.n("AbstractDraweeController#createInternal");
            }
            n nVar = new n();
            nVar.Uo(ml);
            nVar.Uo(ml2);
            if (T5.n.nr()) {
                T5.n.rl();
            }
            return nVar;
        }
    }

    private n.j N(Map map, Map map2, Uri uri) {
        String str;
        PointF pointFQie;
        htt.w6 w6Var = this.KN;
        if (w6Var instanceof Jff.j) {
            Jff.j jVar = (Jff.j) w6Var;
            String strValueOf = String.valueOf(jVar.az());
            pointFQie = jVar.qie();
            str = strValueOf;
        } else {
            str = null;
            pointFQie = null;
        }
        return hVe.n.n(WPU, aYN, map, null, o(), str, pointFQie, map2, ty(), E2(), uri);
    }

    private boolean Nxk() {
        TD.Ml ml;
        return this.HI && (ml = this.nr) != null && ml.O();
    }

    private n.j T(com.facebook.datasource.w6 w6Var, Object obj, Uri uri) {
        return N(w6Var == null ? null : w6Var.getExtras(), nHg(obj), uri);
    }

    private void Xw() {
        Map extras;
        boolean z2 = this.az;
        this.az = false;
        this.HI = false;
        com.facebook.datasource.w6 w6Var = this.f9766r;
        Map map = null;
        if (w6Var != null) {
            extras = w6Var.getExtras();
            this.f9766r.close();
            this.f9766r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f9762S;
        if (drawable != null) {
            bzg(drawable);
        }
        if (this.Ik != null) {
            this.Ik = null;
        }
        this.f9762S = null;
        Object obj = this.f9765o;
        if (obj != null) {
            Map mapNHg = nHg(aYN(obj));
            X("release", this.f9765o);
            jB(this.f9765o);
            this.f9765o = null;
            map = mapNHg;
        }
        if (z2) {
            eF(extras, map);
        }
    }

    private htt.w6 g() {
        htt.w6 w6Var = this.KN;
        if (w6Var != null) {
            return w6Var;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.gh);
    }

    private Rect o() {
        htt.w6 w6Var = this.KN;
        if (w6Var == null) {
            return null;
        }
        return w6Var.getBounds();
    }

    protected void B(Drawable drawable) {
        this.xMQ = drawable;
        htt.w6 w6Var = this.KN;
        if (w6Var != null) {
            w6Var.J2(drawable);
        }
    }

    protected void D(Uu.j jVar) {
        this.f9761O = jVar;
        if (jVar != null) {
            jVar.J2(this);
        }
    }

    protected boolean E2() {
        return this.XQ;
    }

    public void FX(String str) {
        this.Ik = str;
    }

    protected Ml HI() {
        Ml ml = this.J2;
        return ml == null ? w6.Uo() : ml;
    }

    protected void I(boolean z2) {
        this.ck = z2;
    }

    protected Drawable Ik() {
        return this.xMQ;
    }

    @Override // htt.j
    public htt.n O() {
        return this.KN;
    }

    protected String S(Object obj) {
        return obj != null ? obj.getClass().getSimpleName() : SimpleFreeMarkerFormat.STRING_NULL;
    }

    public void U(QVk.n nVar) {
        this.Uo.p5(nVar);
    }

    public String XQ() {
        return this.mUb;
    }

    protected Uu.j Z() {
        return this.f9761O;
    }

    protected void a(boolean z2) {
        this.XQ = z2;
    }

    protected QVk.n ck() {
        return this.Uo;
    }

    public void mUb(QVk.n nVar) {
        this.Uo.M7(nVar);
    }

    protected TD.Ml nY() {
        if (this.nr == null) {
            this.nr = new TD.Ml();
        }
        return this.nr;
    }

    public Animatable qie() {
        Object obj = this.f9762S;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    @Override // TD.j.InterfaceC0359j
    public void release() {
        this.f9764n.rl(w6.j.ON_RELEASE_CONTROLLER);
        TD.Ml ml = this.nr;
        if (ml != null) {
            ml.t();
        }
        Uu.j jVar = this.f9761O;
        if (jVar != null) {
            jVar.O();
        }
        htt.w6 w6Var = this.KN;
        if (w6Var != null) {
            w6Var.reset();
        }
        Xw();
    }

    public Object ty() {
        return this.gh;
    }

    public j(TD.j jVar, Executor executor, String str, Object obj) {
        this.rl = jVar;
        this.f9767t = executor;
        te(str, obj);
    }

    private void M(String str, Object obj, com.facebook.datasource.w6 w6Var) {
        Object objAYN = aYN(obj);
        HI().nr(str, objAYN, qie());
        ck().Z(str, objAYN, T(w6Var, objAYN, null));
    }

    private void M7(Throwable th) {
        HI().J2(this.mUb, th);
        ck().T(this.mUb);
    }

    private void eF(Map map, Map map2) {
        HI().t(this.mUb);
        ck().Uo(this.mUb, N(map, map2, null));
    }

    private void p5(String str, Object obj) {
        Object objAYN = aYN(obj);
        HI().n(str, objAYN);
        ck().n(str, objAYN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rV9(String str, com.facebook.datasource.w6 w6Var, float f3, boolean z2) {
        if (!fD(str, w6Var)) {
            e("ignore_old_datasource @ onProgress", null);
            w6Var.close();
        } else if (!z2) {
            this.KN.t(f3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s7N(String str, com.facebook.datasource.w6 w6Var, Throwable th, boolean z2) {
        w6.j jVar;
        Drawable drawable;
        if (T5.n.nr()) {
            T5.n.n("AbstractDraweeController#onFailureInternal");
        }
        if (!fD(str, w6Var)) {
            e("ignore_old_datasource @ onFailure", th);
            w6Var.close();
            if (T5.n.nr()) {
                T5.n.rl();
                return;
            }
            return;
        }
        TD.w6 w6Var2 = this.f9764n;
        if (z2) {
            jVar = w6.j.ON_DATASOURCE_FAILURE;
        } else {
            jVar = w6.j.ON_DATASOURCE_FAILURE_INT;
        }
        w6Var2.rl(jVar);
        if (z2) {
            e("final_failed @ onFailure", th);
            this.f9766r = null;
            this.HI = true;
            htt.w6 w6Var3 = this.KN;
            if (w6Var3 != null) {
                if (this.ck && (drawable = this.f9762S) != null) {
                    w6Var3.O(drawable, 1.0f, true);
                } else if (Nxk()) {
                    w6Var3.n(th);
                } else {
                    w6Var3.rl(th);
                }
            }
            P5(th, w6Var);
        } else {
            e("intermediate_failed @ onFailure", th);
            M7(th);
        }
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, com.facebook.datasource.w6 w6Var, Object obj, float f3, boolean z2, boolean z3, boolean z4) {
        w6.j jVar;
        try {
            if (T5.n.nr()) {
                T5.n.n("AbstractDraweeController#onNewResultInternal");
            }
            if (!fD(str, w6Var)) {
                X("ignore_old_datasource @ onNewResult", obj);
                jB(obj);
                w6Var.close();
                if (T5.n.nr()) {
                    T5.n.rl();
                    return;
                }
                return;
            }
            TD.w6 w6Var2 = this.f9764n;
            if (z2) {
                jVar = w6.j.ON_DATASOURCE_RESULT;
            } else {
                jVar = w6.j.ON_DATASOURCE_RESULT_INT;
            }
            w6Var2.rl(jVar);
            try {
                Drawable drawableGh = gh(obj);
                Object obj2 = this.f9765o;
                Drawable drawable = this.f9762S;
                this.f9765o = obj;
                this.f9762S = drawableGh;
                try {
                    if (z2) {
                        X("set_final_result @ onNewResult", obj);
                        this.f9766r = null;
                        g().O(drawableGh, 1.0f, z3);
                        M(str, obj, w6Var);
                    } else if (z4) {
                        X("set_temporary_result @ onNewResult", obj);
                        g().O(drawableGh, 1.0f, z3);
                        M(str, obj, w6Var);
                    } else {
                        X("set_intermediate_result @ onNewResult", obj);
                        g().O(drawableGh, f3, z3);
                        p5(str, obj);
                    }
                    if (drawable != null && drawable != drawableGh) {
                        bzg(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        X("release_previous_result @ onNewResult", obj2);
                        jB(obj2);
                    }
                    if (T5.n.nr()) {
                        T5.n.rl();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableGh) {
                        bzg(drawable);
                    }
                    if (obj2 != null && obj2 != obj) {
                        X("release_previous_result @ onNewResult", obj2);
                        jB(obj2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                X("drawable_failed @ onNewResult", obj);
                jB(obj);
                s7N(str, w6Var, e2, z2);
                if (T5.n.nr()) {
                    T5.n.rl();
                }
            }
        } catch (Throwable th2) {
            if (T5.n.nr()) {
                T5.n.rl();
            }
            throw th2;
        }
    }

    protected void E(com.facebook.datasource.w6 w6Var, Object obj) {
        HI().O(this.mUb, this.gh);
        ck().jB(this.mUb, this.gh, T(w6Var, obj, ViF()));
    }

    protected boolean GR() {
        return Nxk();
    }

    protected void Y() {
        if (T5.n.nr()) {
            T5.n.n("AbstractDraweeController#submitRequest");
        }
        Object objAz = az();
        if (objAz != null) {
            if (T5.n.nr()) {
                T5.n.n("AbstractDraweeController#submitRequest->cache");
            }
            this.f9766r = null;
            this.az = true;
            this.HI = false;
            this.f9764n.rl(w6.j.ON_SUBMIT_CACHE_HIT);
            E(this.f9766r, aYN(objAz));
            wTp(this.mUb, objAz);
            v(this.mUb, this.f9766r, objAz, 1.0f, true, true, true);
            if (T5.n.nr()) {
                T5.n.rl();
            }
            if (T5.n.nr()) {
                T5.n.rl();
                return;
            }
            return;
        }
        this.f9764n.rl(w6.j.ON_DATASOURCE_SUBMIT);
        this.KN.t(0.0f, true);
        this.az = true;
        this.HI = false;
        com.facebook.datasource.w6 w6VarR = r();
        this.f9766r = w6VarR;
        E(w6VarR, null);
        if (Dzy.j.az(2)) {
            Dzy.j.Ik(ViF, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.mUb, Integer.valueOf(System.identityHashCode(this.f9766r)));
        }
        this.f9766r.O(new C0313j(this.mUb, this.f9766r.n()), this.f9767t);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    protected void iF(String str, Object obj) {
        te(str, obj);
        this.f9763Z = false;
        this.XQ = false;
    }

    @Override // htt.j
    public void nr() {
        if (T5.n.nr()) {
            T5.n.n("AbstractDraweeController#onDetach");
        }
        if (Dzy.j.az(2)) {
            Dzy.j.ck(ViF, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.mUb);
        }
        this.f9764n.rl(w6.j.ON_DETACH_CONTROLLER);
        this.qie = false;
        this.rl.nr(this);
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    @Override // htt.j
    public void rl() {
        String str;
        if (T5.n.nr()) {
            T5.n.n("AbstractDraweeController#onAttach");
        }
        if (Dzy.j.az(2)) {
            Class cls = ViF;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.mUb;
            if (this.az) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            Dzy.j.Ik(cls, "controller %x %s: onAttach: %s", numValueOf, str2, str);
        }
        this.f9764n.rl(w6.j.ON_ATTACH_CONTROLLER);
        C.Uo(this.KN);
        this.rl.n(this);
        this.qie = true;
        if (!this.az) {
            Y();
        }
        if (T5.n.nr()) {
            T5.n.rl();
        }
    }

    public String toString() {
        return Dsr.rl(this).t("isAttached", this.qie).t("isRequestSubmitted", this.az).t("hasFetchFailed", this.HI).n("fetchedImage", WPU(this.f9765o)).rl(CrashEvent.f62787f, this.f9764n.toString()).toString();
    }

    public void xMQ(Ml ml) {
        C.Uo(ml);
        Ml ml2 = this.J2;
        if (ml2 instanceof n) {
            ((n) ml2).Uo(ml);
        } else if (ml2 != null) {
            this.J2 = n.mUb(ml2, ml);
        } else {
            this.J2 = ml;
        }
    }
}
