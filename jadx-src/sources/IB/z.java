package IB;

import IB.z;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.gl.OpenGLException;
import com.alightcreative.gl.ShaderSourceLoader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import z.AbstractC2478o;
import z.B;
import z.C2467Dsr;
import z.C2469Ml;
import z.DC;
import z.EnumC2480t;
import z.Ew;
import z.FKk;
import z.Fl;
import z.KH;
import z.LEl;
import z.O;
import z.Pmq;
import z.QaP;
import z.R6;
import z.RGN;
import z.RzR;
import z.Y5;
import z.ci;
import z.g9s;
import z.gnv;
import z.hQ;
import z.iF;
import z.kO4;
import z.o7q;
import z.pO;
import z.pq;
import z.qYU;
import z.rv6;
import z.vd;
import z.xuv;
import z.yg;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class z implements KH {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final j f4071S = new j(null);
    public static final int WPU = 8;
    private Rectangle HI;
    private int Ik;
    private final LinkedList J2;
    private final Map KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f4072O;
    private final Map Uo;
    private final Matrix XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private KH.n f4073Z;
    private final s4 az;
    private int ck;
    private final s4 gh;
    private final s4 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f4074n;
    private final boolean nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private KH.w6 f4075o;
    private final s4 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Lazy f4076r;
    private final WzY.QJ rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ShaderSourceLoader f4077t;
    private final s4 ty;
    private final Ml xMQ;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long rl() {
            if (AbstractC2487Wre.gh() > 4294967296L) {
                return 186624000L;
            }
            if (AbstractC2487Wre.gh() > 3221225472L) {
                return 165888000L;
            }
            if (AbstractC2487Wre.gh() > 2147483648L) {
                return 124416000L;
            }
            if (AbstractC2487Wre.gh() > 1610612736) {
                return 103680000L;
            }
            if (AbstractC2487Wre.gh() > 1073741824) {
                return 82944000L;
            }
            if (AbstractC2487Wre.gh() > 536870912) {
                return 62208000L;
            }
            return 51840000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class n implements g9s {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final g9s f4078n;
        private boolean rl;

        public n(g9s underlyingTexture) {
            Intrinsics.checkNotNullParameter(underlyingTexture, "underlyingTexture");
            this.f4078n = underlyingTexture;
            this.rl = true;
        }

        @Override // z.Z
        public int KN() {
            return this.f4078n.KN();
        }

        public final void Xw(boolean z2) {
            this.rl = z2;
        }

        public final boolean bzg() {
            return this.rl;
        }

        @Override // z.Z
        public int g() {
            return this.f4078n.g();
        }

        @Override // z.Z
        public int getHeight() {
            return this.f4078n.getHeight();
        }

        @Override // z.Z
        public int getSize() {
            return this.f4078n.getSize();
        }

        @Override // z.Z
        public int getWidth() {
            return this.f4078n.getWidth();
        }

        @Override // z.Z
        public int o() {
            return this.f4078n.o();
        }

        @Override // Cp.j
        public void release() {
            this.f4078n.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bzg() throws OpenGLException {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        AbstractC2478o.rl();
        return iArr[0];
    }

    public final void FX() {
        this.f4072O = false;
        ck().Ik();
        this.J2.clear();
        this.Uo.clear();
        this.KN.clear();
        this.xMQ.rl();
        this.mUb.J2();
        this.gh.J2();
        this.qie.J2();
        this.az.J2();
        this.ty.J2();
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2480t.values().length];
            try {
                iArr[EnumC2480t.f76339t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2480t.f76336O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2480t.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public z(int i2, WzY.QJ vg, ShaderSourceLoader shaderSourceLoader, boolean z2) {
        Intrinsics.checkNotNullParameter(vg, "vg");
        Intrinsics.checkNotNullParameter(shaderSourceLoader, "shaderSourceLoader");
        this.f4074n = i2;
        this.rl = vg;
        this.f4077t = shaderSourceLoader;
        this.nr = z2;
        this.f4072O = true;
        this.J2 = new LinkedList();
        this.Uo = new LinkedHashMap();
        this.KN = new LinkedHashMap();
        this.xMQ = new Ml(f4071S.rl());
        this.mUb = new s4(new Function1() { // from class: IB.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.P5((z.n) obj);
            }
        }, new Function1() { // from class: IB.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z.M7((z.n) obj));
            }
        }, new Function1() { // from class: IB.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(z.p5((z.n) obj));
            }
        }, 268435456L);
        this.gh = new s4(new Function1() { // from class: IB.aC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.J((ci) obj);
            }
        }, null, null, 0L, 14, null);
        this.qie = new s4(new Function1() { // from class: IB.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.nHg((C2467Dsr) obj);
            }
        }, null, null, 0L, 14, null);
        this.az = new s4(new Function1() { // from class: IB.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.wTp((C2467Dsr) obj);
            }
        }, null, null, 0L, 14, null);
        this.ty = new s4(new Function1() { // from class: IB.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.s7N((C2467Dsr) obj);
            }
        }, null, null, 0L, 14, null);
        this.ck = 1;
        this.Ik = 1;
        this.f4076r = LazyKt.lazy(new Function0() { // from class: IB.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(z.bzg());
            }
        });
        this.f4075o = KH.w6.f76255O.n();
        this.f4073Z = new KH.n(null, null, 0L, 0, 0, null, null, 0, 255, null);
        this.XQ = new Matrix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ci D(SurfaceTexture surfaceTexture, int i2, int i3, int i5) {
        return new ci(surfaceTexture, i2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ci texture) throws OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        texture.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M7(n texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        return !texture.bzg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P5(n texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        texture.release();
        return Unit.INSTANCE;
    }

    private final int U() {
        return ((Number) this.f4076r.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Xw(z zVar) {
        return "endRenderToTexture stack=" + zVar.J2.size() + "; rendering to default framebuffer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n eF(Function0 function0) {
        return new n((g9s) function0.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jB(z zVar, g9s g9sVar) {
        return "endRenderToTexture stack=" + zVar.J2.size() + "; rendering to texture " + g9sVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nHg(C2467Dsr texture) throws OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        texture.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p5(n texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        return texture.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s7N(C2467Dsr texture) throws OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        texture.release();
        return Unit.INSTANCE;
    }

    private final void v() {
        if (!this.f4072O) {
            throw new IllegalStateException("The underlying OpenGL context has been released");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wTp(C2467Dsr texture) throws OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        texture.release();
        return Unit.INSTANCE;
    }

    public final void B(int i2, int i3) throws OpenGLException {
        this.ck = i2;
        this.Ik = i3;
        J2();
        a();
    }

    @Override // z.KH
    public int HI() {
        g9s g9sVar = (g9s) this.J2.peek();
        return g9sVar != null ? g9sVar.getHeight() : this.Ik;
    }

    @Override // z.KH
    public int Ik() {
        g9s g9sVar = (g9s) this.J2.peek();
        return g9sVar != null ? g9sVar.getWidth() : this.ck;
    }

    @Override // z.KH
    public void KN(KH.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f4073Z = nVar;
    }

    @Override // z.KH
    public ci O(SurfaceTexture surfaceTexture) throws OpenGLException {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        ci ciVar = (ci) this.gh.mUb(surfaceTexture);
        if (ciVar != null) {
            if (!ciVar.P5()) {
                ciVar = null;
            }
            if (ciVar != null) {
                ciVar.release();
                return ciVar;
            }
        }
        return null;
    }

    @Override // z.KH
    public KH.w6 S() {
        return this.f4075o;
    }

    @Override // z.KH
    public Matrix Uo() {
        return this.XQ;
    }

    @Override // z.KH
    public ci XQ(final SurfaceTexture surfaceTexture, final int i2, final int i3, final int i5) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        v();
        ci ciVar = (ci) UGc.n(this.gh, surfaceTexture, new Function0() { // from class: IB.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.D(surfaceTexture, i2, i3, i5);
            }
        });
        if (ciVar.P5()) {
            return ciVar;
        }
        throw new IllegalStateException("Post condition fail: returning invalid texture");
    }

    @Override // z.KH
    public void Z(g9s texture) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        v();
        if (texture instanceof n) {
            ((n) texture).Xw(false);
            this.mUb.az();
        } else {
            throw new IllegalArgumentException(("Unexpected texture type: " + texture).toString());
        }
    }

    @Override // z.KH
    public g9s az(int i2, int i3, DC format, String tag) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(tag, "tag");
        v();
        return M(new Pmq(i2, i3, format, 0, 0, 24, null), tag, false);
    }

    @Override // z.KH
    public WzY.QJ ck() {
        return this.rl;
    }

    @Override // z.KH
    public g9s gh(Object key, final Function0 textureProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(textureProvider, "textureProvider");
        v();
        Object objN = UGc.n(this.mUb, key, new Function0() { // from class: IB.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return z.eF(textureProvider);
            }
        });
        ((n) objN).Xw(true);
        return (g9s) objN;
    }

    @Override // z.KH
    public z.l3D mUb(KClass shaderClass) {
        Intrinsics.checkNotNullParameter(shaderClass, "shaderClass");
        v();
        Map map = this.KN;
        Object b2 = map.get(shaderClass);
        if (b2 == null) {
            if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(C2469Ml.class))) {
                b2 = new C2469Ml(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(iF.class))) {
                b2 = new iF(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(pO.class))) {
                b2 = new pO(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(gnv.class))) {
                b2 = new gnv(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(FKk.class))) {
                b2 = new FKk(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(O.class))) {
                b2 = new O(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(o7q.class))) {
                b2 = new o7q(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(Fl.class))) {
                b2 = new Fl(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(R6.class))) {
                b2 = new R6(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(RzR.class))) {
                b2 = new RzR(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(pq.class))) {
                b2 = new pq(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(xuv.class))) {
                b2 = new xuv(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(yg.class))) {
                b2 = new yg(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(LEl.class))) {
                b2 = new LEl(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(QaP.class))) {
                b2 = new QaP(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(kO4.class))) {
                b2 = new kO4(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(hQ.class))) {
                b2 = new hQ(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(qYU.class))) {
                b2 = new qYU(this.f4077t);
            } else if (Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(RGN.class))) {
                b2 = new RGN(this.f4077t);
            } else {
                if (!Intrinsics.areEqual(shaderClass, Reflection.getOrCreateKotlinClass(B.class))) {
                    throw new UnsupportedOperationException();
                }
                b2 = new B(this.f4077t);
            }
            map.put(shaderClass, b2);
        }
        return (z.l3D) b2;
    }

    @Override // z.KH
    public void n(KH.w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<set-?>");
        this.f4075o = w6Var;
    }

    @Override // z.KH
    public C2467Dsr nr(Bitmap bitmap, EnumC2480t wrap, int i2) {
        s4 s4Var;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        v();
        int i3 = w6.$EnumSwitchMapping$0[wrap.ordinal()];
        if (i3 == 1) {
            s4Var = this.qie;
        } else if (i3 == 2) {
            s4Var = this.az;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            s4Var = this.ty;
        }
        C2467Dsr c2467Dsr = (C2467Dsr) s4Var.Uo(bitmap);
        if (c2467Dsr != null && c2467Dsr.U()) {
            return c2467Dsr;
        }
        C2467Dsr c2467Dsr2 = new C2467Dsr(bitmap, wrap, i2);
        s4Var.qie(bitmap, c2467Dsr2);
        return c2467Dsr2;
    }

    @Override // z.KH
    public g9s qie(Pmq textureSpec, String tag) {
        Intrinsics.checkNotNullParameter(textureSpec, "textureSpec");
        Intrinsics.checkNotNullParameter(tag, "tag");
        v();
        Ml ml = this.xMQ;
        g9s g9sVarT = ml.t(textureSpec);
        return g9sVarT == null ? ml.O(textureSpec, M(textureSpec, tag, true)) : g9sVarT;
    }

    @Override // z.KH
    public void r(g9s texture) throws InterruptedException, OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        v();
        this.J2.push(texture);
        N(texture);
        a();
    }

    public void rV9() throws OpenGLException {
        Iterator it = this.mUb.J2().iterator();
        while (it.hasNext()) {
            ((n) it.next()).release();
        }
        Iterator it2 = this.gh.J2().iterator();
        while (it2.hasNext()) {
            ((ci) it2.next()).release();
        }
        Iterator it3 = this.qie.J2().iterator();
        while (it3.hasNext()) {
            ((C2467Dsr) it3.next()).release();
        }
        Iterator it4 = this.ty.J2().iterator();
        while (it4.hasNext()) {
            ((C2467Dsr) it4.next()).release();
        }
        Iterator it5 = this.az.J2().iterator();
        while (it5.hasNext()) {
            ((C2467Dsr) it5.next()).release();
        }
        this.J2.clear();
        J2();
        a();
    }

    @Override // z.KH
    public int rl() {
        return this.f4074n;
    }

    @Override // z.KH
    public KH.n ty() {
        return this.f4073Z;
    }

    @Override // z.KH
    public Y5 xMQ(VisualEffect effect, int i2) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        v();
        Map map = this.Uo;
        String str = effect.getId() + "/" + i2;
        Object y5 = map.get(str);
        if (y5 == null) {
            y5 = new Y5(effect, i2);
            map.put(str, y5);
        }
        return (Y5) y5;
    }

    private final int E(Pmq pmq, String str) throws OpenGLException {
        DC dcN = pmq.n();
        int iO = Ew.O(str);
        GLES20.glBindTexture(3553, iO);
        GLES20.glTexParameteri(3553, 10240, pmq.t());
        GLES20.glTexParameteri(3553, 10241, pmq.nr());
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        AbstractC2478o.rl();
        GLES20.glTexImage2D(3553, 0, dcN.nr(), pmq.O(), pmq.rl(), 0, dcN.nr(), dcN.J2(), null);
        AbstractC2478o.rl();
        rv6.f76332n.nY(iO, pmq.O(), pmq.rl(), Ew.J2(pmq));
        return iO;
    }

    private final g9s M(Pmq pmq, String str, boolean z2) throws OpenGLException {
        Pair pair;
        int iE = E(pmq, str);
        vd.t(rv6.f76332n, iE, pmq);
        if (!z2) {
            pair = TuplesKt.to(0, 0);
        } else if (this.nr) {
            int iNr = Ew.nr();
            GLES20.glBindRenderbuffer(36161, iNr);
            GLES20.glRenderbufferStorage(36161, 35056, pmq.O(), pmq.rl());
            pair = TuplesKt.to(Integer.valueOf(iNr), Integer.valueOf(iNr));
        } else {
            int iNr2 = Ew.nr();
            GLES20.glBindRenderbuffer(36161, iNr2);
            GLES20.glRenderbufferStorage(36161, 36168, pmq.O(), pmq.rl());
            int iNr3 = Ew.nr();
            GLES20.glBindRenderbuffer(36161, iNr3);
            GLES20.glRenderbufferStorage(36161, 33189, pmq.O(), pmq.rl());
            pair = TuplesKt.to(Integer.valueOf(iNr2), Integer.valueOf(iNr3));
        }
        return new IB.j(iE, pmq.O(), pmq.rl(), pmq.n().t(), ((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
    }

    private final void N(g9s g9sVar) throws InterruptedException, OpenGLException {
        String str;
        int iO = g9sVar.o();
        int iG = g9sVar.g();
        int iKN = g9sVar.KN();
        GLES20.glIsTexture(iO);
        if (iG != 0) {
            GLES20.glIsRenderbuffer(iG);
        }
        AbstractC2478o.rl();
        GLES20.glBindFramebuffer(36160, U());
        AbstractC2478o.rl();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iO, 0);
        AbstractC2478o.rl();
        GLES20.glFramebufferRenderbuffer(36160, 36128, 36161, iG);
        AbstractC2478o.rl();
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iKN);
        AbstractC2478o.rl();
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            switch (iGlCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            rv6.f76332n.xMQ(false);
            throw new OpenGLException("Framebuffer Incomplete: " + iGlCheckFramebufferStatus + " (" + str + ") tex=" + iO + "[isTex=" + GLES20.glIsTexture(iO) + "] depth=" + iKN + "[isTex=" + GLES20.glIsTexture(iKN) + "] stencil=" + iG + "[isTex=" + GLES20.glIsTexture(iG) + "] WxH=" + g9sVar.getWidth() + "x" + g9sVar.getHeight() + " size=" + g9sVar.getSize());
        }
    }

    private final void a() {
        Matrix matrixUo = Uo();
        matrixUo.reset();
        matrixUo.postScale(2.0f / Ik(), (-2.0f) / HI());
        matrixUo.postTranslate(-1.0f, 1.0f);
    }

    @Override // z.KH
    public void J2() throws OpenGLException {
        v();
        Rectangle rectangle = this.HI;
        if (rectangle == null) {
            GLES20.glViewport(0, 0, Ik(), HI());
            AbstractC2478o.rl();
            return;
        }
        GLES20.glViewport((int) (((-rectangle.getLeft()) * Ik()) / rectangle.getWidth()), (int) (((-(HI() - rectangle.getBottom())) * HI()) / rectangle.getHeight()), (int) ((Ik() * Ik()) / rectangle.getWidth()), (int) ((HI() * HI()) / rectangle.getHeight()));
        AbstractC2478o.rl();
    }

    @Override // z.KH
    public void o() throws InterruptedException, OpenGLException {
        v();
        this.J2.pop();
        final g9s g9sVar = (g9s) this.J2.peek();
        if (g9sVar == null) {
            XoT.C.Uo(this, new Function0() { // from class: IB.Xo
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.Xw(this.f4055n);
                }
            });
            GLES20.glBindFramebuffer(36160, 0);
            AbstractC2478o.rl();
        } else {
            XoT.C.Uo(this, new Function0() { // from class: IB.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return z.jB(this.f4058n, g9sVar);
                }
            });
            N(g9sVar);
        }
        a();
    }

    @Override // z.KH
    public void t(Rectangle rectangle) throws OpenGLException {
        v();
        this.HI = rectangle;
        J2();
    }
}
