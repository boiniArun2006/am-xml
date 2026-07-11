package WzY;

import Hr.CQ.USEaHtCMH;
import WzY.P;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.LruCache;
import com.alightcreative.app.motion.scene.BlendingMode;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.DrawingTool;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.GradientFill;
import com.alightcreative.app.motion.scene.GradientType;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.StrokePoint;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.TextureSrcType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.EffectRenderPass;
import com.alightcreative.app.motion.scene.visualeffect.ShaderGroup;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef;
import com.alightcreative.gl.OpenGLException;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import z.AbstractC2476m;
import z.AbstractC2478o;
import z.B;
import z.C2470N;
import z.C2479p;
import z.DC;
import z.FKk;
import z.Fl;
import z.KH;
import z.LEl;
import z.Mf;
import z.O;
import z.Pmq;
import z.QaP;
import z.R6;
import z.gnv;
import z.kO4;
import zV.C2499j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class P implements s4 {
    private final Pmq E2;
    private final QJ HI;
    private final C1487z Ik;
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f11589N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f11590O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float f11591S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private z.g9s f11592T;
    private final int Uo;
    private final Matrix ViF;
    private final float WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final C2470N f11593X;
    private final int XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final int f11594Z;
    private final float aYN;
    private final float az;
    private final Path ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2470N f11595e;
    private final Pmq fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f11596g;
    private final RenderEnvironment gh;
    private final yg iF;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KH f11597n;
    private final KH nHg;
    private final C2499j nY;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f11598o;
    private final int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f11599r;
    private final HI0.Q rl;
    private boolean s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f11600t;
    private boolean te;
    private boolean ty;
    private final Ml wTp;
    private final int xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ml extends LruCache {
        Ml() {
            super(16777216);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int sizeOf(Pair pair, Bitmap bitmap) {
            if (bitmap != null) {
                return bitmap.getAllocationByteCount();
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class j {
        private Rectangle J2;
        private Transform KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private z.g9s f11601O;
        private Transform Uo;
        private List gh;
        private Vector2D mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11602n;
        private BlendingMode nr;
        private Matrix qie;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f11603t;
        private float xMQ;

        public j(boolean z2, boolean z3, List pendingLayerEffects, BlendingMode blendingMode, z.g9s g9sVar, Rectangle layerBounds, Transform layerTransform, Transform layerPrevTransform, float f3, Vector2D overdrawScale, List edgeDecorations, Matrix matrix) {
            Intrinsics.checkNotNullParameter(pendingLayerEffects, "pendingLayerEffects");
            Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
            Intrinsics.checkNotNullParameter(layerBounds, "layerBounds");
            Intrinsics.checkNotNullParameter(layerTransform, "layerTransform");
            Intrinsics.checkNotNullParameter(layerPrevTransform, "layerPrevTransform");
            Intrinsics.checkNotNullParameter(overdrawScale, "overdrawScale");
            Intrinsics.checkNotNullParameter(edgeDecorations, "edgeDecorations");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            this.f11602n = z2;
            this.rl = z3;
            this.f11603t = pendingLayerEffects;
            this.nr = blendingMode;
            this.f11601O = g9sVar;
            this.J2 = layerBounds;
            this.Uo = layerTransform;
            this.KN = layerPrevTransform;
            this.xMQ = f3;
            this.mUb = overdrawScale;
            this.gh = edgeDecorations;
            this.qie = matrix;
        }

        public final void HI(boolean z2) {
            this.rl = z2;
        }

        public final void Ik(Rectangle rectangle) {
            Intrinsics.checkNotNullParameter(rectangle, "<set-?>");
            this.J2 = rectangle;
        }

        public final Transform J2() {
            return this.KN;
        }

        public final Transform KN() {
            return this.Uo;
        }

        public final Rectangle O() {
            return this.J2;
        }

        public final void S(Vector2D vector2D) {
            Intrinsics.checkNotNullParameter(vector2D, "<set-?>");
            this.mUb = vector2D;
        }

        public final z.g9s Uo() {
            return this.f11601O;
        }

        public final void WPU(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f11603t = list;
        }

        public final void XQ(Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "<set-?>");
            this.qie = matrix;
        }

        public final void Z(Transform transform) {
            Intrinsics.checkNotNullParameter(transform, "<set-?>");
            this.Uo = transform;
        }

        public final void aYN(boolean z2) {
            this.f11602n = z2;
        }

        public final void az(BlendingMode blendingMode) {
            Intrinsics.checkNotNullParameter(blendingMode, "<set-?>");
            this.nr = blendingMode;
        }

        public final void ck(float f3) {
            this.xMQ = f3;
        }

        public final List gh() {
            return this.f11603t;
        }

        public final Vector2D mUb() {
            return this.mUb;
        }

        public final BlendingMode n() {
            return this.nr;
        }

        public final float nr() {
            return this.xMQ;
        }

        public final void o(z.g9s g9sVar) {
            this.f11601O = g9sVar;
        }

        public final boolean qie() {
            return this.f11602n;
        }

        public final void r(Transform transform) {
            Intrinsics.checkNotNullParameter(transform, "<set-?>");
            this.KN = transform;
        }

        public final List rl() {
            return this.gh;
        }

        public final boolean t() {
            return this.rl;
        }

        public final void ty(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.gh = list;
        }

        public final Matrix xMQ() {
            return this.qie;
        }

        public /* synthetic */ j(boolean z2, boolean z3, List list, BlendingMode blendingMode, z.g9s g9sVar, Rectangle rectangle, Transform transform, Transform transform2, float f3, Vector2D vector2D, List list2, Matrix matrix, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? false : z3, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? BlendingMode.NORMAL : blendingMode, (i2 & 16) != 0 ? null : g9sVar, (i2 & 32) != 0 ? Rectangle.INSTANCE.getEMPTY() : rectangle, (i2 & 64) != 0 ? Transform.INSTANCE.getIDENTITY() : transform, (i2 & 128) != 0 ? Transform.INSTANCE.getIDENTITY() : transform2, (i2 & 256) != 0 ? 1.0f : f3, (i2 & 512) != 0 ? Vector2D.INSTANCE.getONE() : vector2D, (i2 & 1024) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 2048) != 0 ? new Matrix() : matrix);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class w6 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((ShaderGroup) obj).getId()), Integer.valueOf(((ShaderGroup) obj2).getId()));
        }
    }

    @Override // WzY.s4
    public void HI(Bitmap bitmap, RectF bounds, Matrix matrix, float f3, yg ygVar, GradientFill gradientFill, TextureCropMode textureFillMode) throws OpenGLException {
        AbstractC2476m abstractC2476m;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(textureFillMode, "textureFillMode");
        if (!this.te) {
            o();
            GLES20.glDisable(2960);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        C2470N c2470nNr = C2470N.KN.nr(bounds.left, bounds.top, bounds.right, bounds.bottom, textureFillMode, bitmap.getWidth() / bitmap.getHeight());
        z.UGc.gh(c2470nNr, GeometryKt.times(GeometryKt.times(GeometryKt.times(matrix, this.f11596g.xMQ()), mYa()), this.f11597n.Uo()));
        if (gradientFill != null) {
            int i2 = n.$EnumSwitchMapping$2[gradientFill.getType().ordinal()];
            if (i2 == 1) {
                abstractC2476m = (AbstractC2476m) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(z.pO.class));
            } else if (i2 == 2) {
                abstractC2476m = (AbstractC2476m) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(gnv.class));
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC2476m = (AbstractC2476m) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(FKk.class));
            }
            abstractC2476m.render(c2470nNr, KH.j.rl(this.f11597n, bitmap, null, 0, 6, null), gradientFill.getStartLocation(), gradientFill.getEndLocation(), ColorKt.premultiply(gradientFill.getStartColor()), ColorKt.premultiply(gradientFill.getEndColor()), f3);
        } else if (ygVar == null || ygVar.nr().getA() <= 0.0f) {
            Mf.t(this.f11597n).render(c2470nNr, KH.j.rl(this.f11597n, bitmap, null, 0, 6, null), f3);
        } else {
            ((B) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(B.class))).render(c2470nNr, KH.j.rl(this.f11597n, bitmap, null, 0, 6, null), f3, ygVar.nr());
        }
        if (this.te) {
            return;
        }
        GLES20.glDisable(2960);
        az();
    }

    @Override // WzY.s4
    public void XQ(Rectangle viewport) {
        Intrinsics.checkNotNullParameter(viewport, "viewport");
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BlendingMode.values().length];
            try {
                iArr2[BlendingMode.SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BlendingMode.CLIPPING_MASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BlendingMode.MASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BlendingMode.EXCLUDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GradientType.values().length];
            try {
                iArr3[GradientType.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[GradientType.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[GradientType.SWEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[WzY.j.values().length];
            try {
                iArr4[WzY.j.f11650n.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[WzY.j.f11651t.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DrawingTool.values().length];
            try {
                iArr5[DrawingTool.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[DrawingTool.BRUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[DrawingTool.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[DrawingTool.ERASER.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public P(KH gctx, HI0.Q contentResolver, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, RenderEnvironment env, int i12, float f3) {
        Intrinsics.checkNotNullParameter(gctx, "gctx");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(env, "env");
        this.f11597n = gctx;
        this.rl = contentResolver;
        this.f11600t = i2;
        this.nr = i3;
        this.f11590O = i5;
        this.J2 = i7;
        this.Uo = i8;
        this.KN = i9;
        this.xMQ = i10;
        this.mUb = i11;
        this.gh = env;
        this.qie = i12;
        this.az = f3;
        this.HI = gctx.ck();
        this.ck = new Path();
        this.Ik = new C1487z();
        int iRoundToInt = MathKt.roundToInt(Org() * f3);
        this.f11599r = iRoundToInt;
        int iRoundToInt2 = MathKt.roundToInt(qm() * f3);
        this.f11598o = iRoundToInt2;
        int iCoerceAtMost = RangesKt.coerceAtMost(Org() + (iRoundToInt * 2), gctx.rl());
        this.f11594Z = iCoerceAtMost;
        int iCoerceAtMost2 = RangesKt.coerceAtMost(qm() + (iRoundToInt2 * 2), gctx.rl());
        this.XQ = iCoerceAtMost2;
        float fMin = Math.min(Org() / ul(), qm() / aYN());
        this.f11591S = fMin;
        this.WPU = 1.0f / fMin;
        this.aYN = 1.0f / Math.min(fcU() / g(), G7() / mUb());
        this.ViF = new Matrix();
        this.nY = new C2499j(new Function0() { // from class: WzY.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.Po6();
            }
        }, new Function2() { // from class: WzY.Ew
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return P.EWS((P.j) obj, (P.j) obj2);
            }
        });
        this.f11596g = new j(false, false, null, null, null, null, null, null, 0.0f, null, null, null, 4095, null);
        yg ygVar = new yg();
        ygVar.xMQ(0.0f);
        this.iF = ygVar;
        int iOrg = Org();
        int iQm = qm();
        DC dc = DC.f76231X;
        this.fD = new Pmq(iOrg, iQm, dc, 0, 0, 24, null);
        this.E2 = new Pmq(iCoerceAtMost, iCoerceAtMost2, dc, 0, 0, 24, null);
        C2470N.j jVar = C2470N.KN;
        this.f11595e = jVar.rl(-1.0f, -1.0f, 1.0f, 1.0f);
        this.f11593X = jVar.rl((iCoerceAtMost * (-1.0f)) / Org(), (iCoerceAtMost2 * (-1.0f)) / qm(), (iCoerceAtMost * 1.0f) / Org(), (iCoerceAtMost2 * 1.0f) / qm());
        this.nHg = gctx;
        this.wTp = new Ml();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C(z.Z z2, RectF rectF, Matrix matrix) {
        return "fillWithVideo(" + z2 + ") bounds=" + rectF + " matrix=" + matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EWS(j a2, j b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        b2.aYN(a2.qie());
        b2.HI(a2.t());
        b2.WPU(a2.gh());
        b2.o(a2.Uo());
        b2.Ik(a2.O());
        b2.Z(a2.KN());
        b2.r(a2.J2());
        b2.az(a2.n());
        b2.ck(a2.nr());
        b2.ty(a2.rl());
        b2.S(a2.mUb());
        b2.XQ(a2.xMQ());
        return Unit.INSTANCE;
    }

    private final z.g9s FX(final int i2, final String str, VisualEffectRef visualEffectRef, final z.g9s g9sVar, final Rectangle rectangle, Transform transform, Transform transform2, final int i3, Matrix matrix) throws OpenGLException {
        boolean z2;
        z.g9s g9sVar2;
        String str2;
        z.g9s g9sVar3;
        Vector2D vector2D;
        Vector2D vector2D2;
        z.g9s g9sVar4;
        String str3;
        XoT.C.Uo(this, new Function0() { // from class: WzY.DAz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.B(str, g9sVar, i2, i3);
            }
        });
        final VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(str);
        if (visualEffectVisualEffectById == null) {
            kO4.render$default(Mf.t(this.f11597n), this.f11595e, g9sVar, 0.0f, 4, null);
            XoT.C.HI(this, new Function0() { // from class: WzY.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P.J(str);
                }
            });
            return g9sVar;
        }
        List<UserParameter> parameters = visualEffectVisualEffectById.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (obj instanceof UserParameter.Texture) {
                arrayList.add(obj);
            }
        }
        ArrayList<UserParameter.Texture> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((UserParameter.Texture) obj2).getSrcType() == TextureSrcType.BUFFER) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (UserParameter.Texture texture : arrayList2) {
            z.g9s g9sVarQie = this.f11597n.qie(z.Ew.t(eWT(), texture.getDownsample()), "layerEffectBuffer");
            this.f11597n.r(g9sVarQie);
            GLES20.glColorMask(true, true, true, true);
            GLES20.glDisable(3042);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(17408);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.f11597n.o();
            Pair pair = new Pair(texture.getName(), g9sVarQie);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        List<UserParameter> parameters2 = visualEffectVisualEffectById.getParameters();
        final int i5 = 0;
        if (parameters2 == null || !parameters2.isEmpty()) {
            for (UserParameter userParameter : parameters2) {
                if ((userParameter instanceof UserParameter.Texture) && ((UserParameter.Texture) userParameter).getSrcType() == TextureSrcType.COMPOSITION) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        z.g9s g9sVar5 = this.f11592T;
        if (!z2 || g9sVar5 == null) {
            g9sVar2 = null;
        } else {
            z.g9s g9sVarQie2 = this.f11597n.qie(eWT(), "conpBuf");
            this.f11597n.r(g9sVarQie2);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(17408);
            Mf.t(this.f11597n).render(this.f11595e, g9sVar5, 1.0f);
            this.f11597n.o();
            g9sVar2 = g9sVarQie2;
        }
        final Vector2D vector2D3 = new Vector2D(g(), mUb());
        final Vector2D vector2D4 = new Vector2D(Org(), qm());
        String str4 = "none";
        String str5 = "-";
        if (i2 >= i3 - 1) {
            Object obj3 = "-";
            GLES20.glBlendFunc(1, 771);
            int i7 = 0;
            for (Object obj4 : visualEffectVisualEffectById.getPasses()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final EffectRenderPass effectRenderPass = (EffectRenderPass) obj4;
                z.g9s g9sVar6 = !Intrinsics.areEqual(effectRenderPass.getTarget(), obj3) ? (z.g9s) linkedHashMap.get(effectRenderPass.getTarget()) : null;
                if (g9sVar6 == null) {
                    GLES20.glEnable(3042);
                } else {
                    GLES20.glDisable(3042);
                }
                z.g9s g9sVar7 = !Intrinsics.areEqual(effectRenderPass.getSrc(), obj3) ? (z.g9s) linkedHashMap.get(effectRenderPass.getSrc()) : g9sVar;
                Map<String, ? extends z.g9s> mapMinus = MapsKt.minus(linkedHashMap, effectRenderPass.getTarget());
                final Vector2D vector2D5 = new Vector2D(g(), mUb());
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                String str6 = str4;
                final z.g9s g9sVar8 = g9sVar6;
                Object obj5 = obj3;
                final int i9 = i7;
                XoT.C.Uo(this, new Function0() { // from class: WzY.lej
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P.I(visualEffectVisualEffectById, i9, effectRenderPass, g9sVar8, rectangle, vector2D3, vector2D5, vector2D4);
                    }
                });
                if (g9sVar8 != null) {
                    this.f11597n.r(g9sVar8);
                }
                this.f11597n.J2();
                if (Intrinsics.areEqual(effectRenderPass.getInnerEffect(), str6)) {
                    str2 = str6;
                    this.f11597n.xMQ(visualEffectVisualEffectById, visualEffectRef.getRenderGroup()).render(this.f11595e, g9sVar7 == null ? g9sVar : g9sVar7, this.rl, this.f11597n, rectangle, transform, transform2, vector2D3, vector2D5, vector2D4, i9, visualEffectRef.getParameters(), mapMinus, g9sVar2, Jk(), matrix);
                } else {
                    String innerEffect = effectRenderPass.getInnerEffect();
                    str2 = str6;
                    FX(0, innerEffect, visualEffectRef, g9sVar7 == null ? g9sVar : g9sVar7, rectangle, transform, transform2, 0, matrix);
                }
                if (g9sVar8 != null) {
                    this.f11597n.o();
                }
                this.f11597n.J2();
                str4 = str2;
                i7 = i8;
                linkedHashMap = linkedHashMap2;
                obj3 = obj5;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            if (g9sVar2 != null) {
                g9sVar2.release();
            }
            Iterator it = linkedHashMap3.values().iterator();
            while (it.hasNext()) {
                ((z.g9s) it.next()).release();
            }
            XoT.C.Uo(this, new Function0() { // from class: WzY.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P.GR(str, g9sVar);
                }
            });
            return g9sVar;
        }
        z.g9s g9sVarQie3 = this.f11597n.qie(eWT(), "layerEffectTarget");
        this.f11597n.r(g9sVarQie3);
        GLES20.glColorMask(true, true, true, true);
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(17408);
        GLES20.glBlendFunc(1, 771);
        for (Object obj6 : visualEffectVisualEffectById.getPasses()) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final EffectRenderPass effectRenderPass2 = (EffectRenderPass) obj6;
            GLES20.glDisable(3042);
            final z.g9s g9sVar9 = !Intrinsics.areEqual(effectRenderPass2.getTarget(), str5) ? (z.g9s) linkedHashMap.get(effectRenderPass2.getTarget()) : null;
            z.g9s g9sVar10 = !Intrinsics.areEqual(effectRenderPass2.getSrc(), str5) ? (z.g9s) linkedHashMap.get(effectRenderPass2.getSrc()) : g9sVar;
            Map<String, ? extends z.g9s> mapMinus2 = MapsKt.minus(linkedHashMap, effectRenderPass2.getTarget());
            XoT.C.Uo(this, new Function0() { // from class: WzY.qf
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P.D(visualEffectVisualEffectById, i5, effectRenderPass2, g9sVar9);
                }
            });
            if (g9sVar9 != null) {
                this.f11597n.r(g9sVar9);
            }
            this.f11597n.J2();
            if (Intrinsics.areEqual(effectRenderPass2.getInnerEffect(), "none")) {
                g9sVar3 = g9sVar9;
                vector2D = vector2D3;
                vector2D2 = vector2D4;
                g9sVar4 = g9sVarQie3;
                str3 = str5;
                this.f11597n.xMQ(visualEffectVisualEffectById, visualEffectRef.getRenderGroup()).render(this.f11595e, g9sVar10 == null ? g9sVar : g9sVar10, this.rl, this.f11597n, rectangle, transform, transform2, vector2D, new Vector2D(g(), mUb()), vector2D2, i5, visualEffectRef.getParameters(), mapMinus2, g9sVar2, Jk(), matrix);
            } else {
                g9sVar3 = g9sVar9;
                vector2D = vector2D3;
                vector2D2 = vector2D4;
                str3 = str5;
                g9sVar4 = g9sVarQie3;
                FX(0, effectRenderPass2.getInnerEffect(), visualEffectRef, g9sVar10 == null ? g9sVar : g9sVar10, rectangle, transform, transform2, 0, matrix);
            }
            if (g9sVar3 != null) {
                this.f11597n.o();
            }
            this.f11597n.J2();
            str5 = str3;
            g9sVarQie3 = g9sVar4;
            i5 = i10;
            vector2D3 = vector2D;
            vector2D4 = vector2D2;
        }
        final z.g9s g9sVar11 = g9sVarQie3;
        this.f11597n.o();
        g9sVar.release();
        if (g9sVar2 != null) {
            g9sVar2.release();
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((z.g9s) it2.next()).release();
        }
        XoT.C.Uo(this, new Function0() { // from class: WzY.Ln
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.a(str, g9sVar11);
            }
        });
        return g9sVar11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J(String str) {
        return "Warning: Effect '" + str + "' not found.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String K(P p2) {
        return "useBackingStore: margin=" + p2.az + " (" + p2.f11599r + "," + p2.f11598o + ") view=" + p2.Org() + "," + p2.qm() + " backing=" + p2.f11594Z + "," + p2.XQ + " logical=" + p2.ul() + "," + p2.aYN() + " fsQuad/vertices=" + p2.f11593X.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Nxk(P p2, List list, BlendingMode blendingMode, float f3, z.g9s g9sVar) {
        return "beginLayer#" + p2.nY.n() + " effects=" + list.size() + " blendingMode=" + blendingMode + " layerAlpha=" + f3 + USEaHtCMH.ekeMm + g9sVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j Po6() {
        return new j(false, false, null, null, null, null, null, null, 0.0f, null, null, null, 4095, null);
    }

    private final void UhV() {
        float[] fArr = new float[9];
        this.f11596g.xMQ().getValues(fArr);
        this.HI.r();
        this.HI.aYN(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Y() {
        return "UCSTROKE:drawBrushStroke";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dR0() {
        return "UCSTROKE:drawPenStroke";
    }

    private final Pmq eWT() {
        return this.f11592T == null ? this.fD : this.E2;
    }

    private final void k(List list, Matrix matrix, yg ygVar, boolean z2, boolean z3) throws OpenGLException {
        float f3;
        float f4;
        float f5;
        int i2;
        float f6;
        float scale = GeometryKt.getScale(matrix);
        this.HI.J2();
        GLES20.glDisable(2960);
        GLES20.glEnable(3042);
        int i3 = 1;
        if (z3) {
            GLES20.glBlendFunc(0, 771);
        } else {
            GLES20.glBlendFunc(1, 771);
        }
        GLES20.glBlendEquation(32774);
        float fO = this.s7N ? ygVar.O() : ygVar.O() * Uo();
        float[] gLMat4 = this.s7N ? GeometryKt.toGLMat4(GeometryKt.times(matrix, this.f11597n.Uo())) : GeometryKt.toGLMat4(GeometryKt.times(GeometryKt.times(matrix, mYa()), this.f11597n.Uo()));
        Iterator it = list.iterator();
        int i5 = 0;
        Object obj = null;
        float fMax = 0.0f;
        while (true) {
            f3 = 2.0f;
            f4 = 0.01f;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (obj != null) {
                StrokePoint strokePoint = (StrokePoint) next;
                StrokePoint strokePoint2 = (StrokePoint) obj;
                float length = GeometryKt.getLength(GeometryKt.minus(strokePoint.getLocation(), strokePoint2.getLocation()));
                float pressure = ((z2 ? strokePoint2.getPressure() : 1.0f) * fO) / 2.0f;
                float pressure2 = (((z2 ? strokePoint.getPressure() : 1.0f) * fO) / 2.0f) - pressure;
                while (fMax < length) {
                    i5++;
                    fMax += Math.max(0.01f, Math.max(0.01f, ((fMax / length) * pressure2) + pressure) * 0.25f);
                }
                fMax -= length;
            }
            obj = next;
        }
        z.qz qzVar = new z.qz(i5, 2);
        z.qz qzVar2 = new z.qz(i5, 1);
        Object obj2 = null;
        float fMax2 = 0.0f;
        int i7 = 0;
        for (Object obj3 : list) {
            if (obj2 != null) {
                StrokePoint strokePoint3 = (StrokePoint) obj3;
                StrokePoint strokePoint4 = (StrokePoint) obj2;
                f6 = f3;
                Vector2D vector2DMinus = GeometryKt.minus(strokePoint3.getLocation(), strokePoint4.getLocation());
                float length2 = GeometryKt.getLength(vector2DMinus);
                float pressure3 = ((z2 ? strokePoint4.getPressure() : 1.0f) * fO) / f6;
                float pressure4 = (((z2 ? strokePoint3.getPressure() : 1.0f) * fO) / f6) - pressure3;
                int i8 = i7;
                while (fMax2 < length2) {
                    int i9 = i3;
                    float f7 = fMax2 / length2;
                    float f8 = scale;
                    float fMax3 = Math.max(f4, pressure3 + (pressure4 * f7));
                    Vector2D vector2DPlus = GeometryKt.plus(strokePoint4.getLocation(), GeometryKt.times(vector2DMinus, f7));
                    int i10 = i8 * 2;
                    qzVar.xMQ(i10, vector2DPlus.getX());
                    qzVar.xMQ(i10 + 1, vector2DPlus.getY());
                    qzVar2.xMQ(i8, fMax3 * f6 * f8);
                    i8++;
                    f4 = 0.01f;
                    fMax2 += Math.max(0.01f, fMax3 * 0.25f);
                    scale = f8;
                    i3 = i9;
                }
                f5 = scale;
                i2 = i3;
                fMax2 -= length2;
                i7 = i8;
            } else {
                f5 = scale;
                i2 = i3;
                f6 = f3;
            }
            f3 = f6;
            obj2 = obj3;
            scale = f5;
            i3 = i2;
        }
        ((O) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(O.class))).render(new C2479p(z.Zs.f76289S, qzVar, qzVar2, null, 8, null), ygVar.nr(), gLMat4);
        GLES20.glBlendFunc(i3, 771);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ofS(P p2, VisualEffectRef visualEffectRef, Ref.ObjectRef objectRef) {
        return "     endLayer#" + p2.nY.n() + " applied=" + visualEffectRef.getId() + " layerTexture=" + ((z.g9s) objectRef.element).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String piY(long j2) {
        return "drawWithCache: blitTime=" + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xg(P p2, List list, BlendingMode blendingMode, float f3, Ref.ObjectRef objectRef) {
        String id;
        int iN = p2.nY.n();
        int size = list.size();
        VisualEffectRef visualEffectRef = (VisualEffectRef) CollectionsKt.firstOrNull(list);
        if (visualEffectRef == null || (id = visualEffectRef.getId()) == null) {
            id = V8ValueNull.NULL;
        }
        return "endLayer#" + iN + " effects=" + size + "/" + id + " blendingMode=" + blendingMode + " layerAlpha=" + f3 + " layerTexture=" + ((z.g9s) objectRef.element).o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z.g9s z(Rectangle rectangle, P p2, Function0 function0) {
        Pmq pmq = new Pmq(Math.max(1, MathKt.roundToInt((float) Math.ceil(rectangle.getWidth()))), Math.max(1, MathKt.roundToInt((float) Math.ceil(rectangle.getHeight()))), DC.f76231X, 0, 0, 24, null);
        z.g9s g9sVarQie = p2.f11597n.qie(pmq, "drawWithCache");
        p2.f11597n.r(g9sVarQie);
        GLES20.glViewport(0, 0, pmq.O(), pmq.rl());
        p2.s7N = true;
        function0.invoke();
        p2.s7N = false;
        p2.f11597n.o();
        GLES20.glViewport(0, 0, p2.f11597n.Ik(), p2.f11597n.HI());
        return g9sVarQie;
    }

    @Override // WzY.s4
    public void E2(List points, Matrix matrix, yg paint) throws OpenGLException {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(paint, "paint");
        XoT.C.Uo(this, new Function0() { // from class: WzY.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.Y();
            }
        });
        k(points, matrix, paint, true, false);
    }

    public int G7() {
        return this.J2;
    }

    public void GD() {
        this.f11596g.XQ(new Matrix());
        UhV();
    }

    public void HV() {
        if (this.f11596g.t()) {
            throw new IllegalStateException("Check failed.");
        }
        z.g9s g9sVar = this.f11592T;
        if (g9sVar != null) {
            this.f11592T = null;
            if (this.te) {
                throw new IllegalStateException("Must release clip before calling releaseBackingStore()");
            }
            o();
            this.f11597n.o();
            this.f11597n.J2();
            GLES20.glDisable(2960);
            kO4.render$default(Mf.t(this.f11597n), this.f11593X, g9sVar, 0.0f, 4, null);
            g9sVar.release();
            az();
        }
    }

    @Override // WzY.s4
    public void Ik(Object key, final Rectangle bounds, Matrix matrix, float f3, WzY.j mode, final Function0 renderer) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        if (this.s7N) {
            throw new IllegalStateException("Check failed.");
        }
        o();
        GLES20.glDisable(2960);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glBlendEquation(32774);
        z.g9s g9sVarGh = this.f11597n.gh(key, new Function0() { // from class: WzY.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.z(bounds, this, renderer);
            }
        });
        int i2 = n.$EnumSwitchMapping$3[mode.ordinal()];
        if (i2 == 1) {
            GLES20.glBlendFunc(1, 771);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            GLES20.glBlendFunc(0, 771);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        kO4 ko4T = Mf.t(this.f11597n);
        C2470N c2470nRl = C2470N.KN.rl(bounds.getLeft(), bounds.getBottom(), bounds.getRight(), bounds.getTop());
        z.UGc.gh(c2470nRl, GeometryKt.times(GeometryKt.times(GeometryKt.times(matrix, this.f11596g.xMQ()), mYa()), this.f11597n.Uo()));
        ko4T.render(c2470nRl, g9sVarGh, f3);
        final long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        GLES20.glBlendFunc(1, 771);
        this.f11597n.Z(g9sVarGh);
        XoT.C.Uo(this, new Function0() { // from class: WzY.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.piY(jCurrentTimeMillis2);
            }
        });
        GLES20.glDisable(2960);
        az();
    }

    @Override // WzY.s4
    public void J2(Sis path) throws OpenGLException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (this.te) {
            throw new IllegalStateException("Must release clip before applying new clip");
        }
        this.ck.set(path.t());
        o();
        GLES20.glDisable(3089);
        AbstractC2478o.rl();
        GLES20.glStencilMask(240);
        AbstractC2478o.rl();
        GLES20.glClearStencil(0);
        AbstractC2478o.rl();
        GLES20.glClear(1024);
        AbstractC2478o.rl();
        az();
        GLES20.glColorMask(false, false, false, false);
        OU.O(path, this.HI, this.iF, mYa(), Rl());
        GLES20.glColorMask(true, true, true, true);
        o();
        AbstractC2478o.rl();
        GLES20.glEnable(2960);
        AbstractC2478o.rl();
        GLES20.glStencilFunc(514, 32, 240);
        AbstractC2478o.rl();
        GLES20.glStencilOp(7680, 7681, 7681);
        AbstractC2478o.rl();
        GLES20.glStencilMask(0);
        AbstractC2478o.rl();
        this.te = true;
    }

    public boolean Jk() {
        return this.ty;
    }

    @Override // WzY.s4
    public KH KN() {
        return this.nHg;
    }

    public Pmq Mx() {
        return this.E2;
    }

    @Override // WzY.s4
    public void O() {
        if (this.te) {
            throw new IllegalStateException("Must release clip before calling save()");
        }
        this.HI.Z();
        this.nY.t(this.f11596g);
        this.f11596g.HI(false);
    }

    public int Org() {
        return this.f11600t;
    }

    @Override // WzY.s4
    public Matrix S() {
        return this.f11596g.xMQ();
    }

    @Override // WzY.s4
    public float Uo() {
        return this.WPU;
    }

    @Override // WzY.s4
    public void ViF(List points, Matrix matrix, yg paint) throws OpenGLException {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(paint, "paint");
        XoT.C.Uo(this, new Function0() { // from class: WzY.ci
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.dR0();
            }
        });
        k(points, matrix, paint, false, false);
    }

    @Override // WzY.s4
    public void WPU(final z.Z texture, final RectF bounds, final Matrix matrix, float f3, TextureCropMode textureFillMode) throws OpenGLException {
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(textureFillMode, "textureFillMode");
        XoT.C.Uo(this, new Function0() { // from class: WzY.Md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.C(texture, bounds, matrix);
            }
        });
        if (!this.te) {
            o();
            GLES20.glDisable(2960);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        C2470N c2470nNr = C2470N.KN.nr(bounds.left, bounds.top, bounds.right, bounds.bottom, textureFillMode, texture.getWidth() / texture.getHeight());
        z.UGc.gh(c2470nNr, GeometryKt.times(GeometryKt.times(GeometryKt.times(matrix, this.f11596g.xMQ()), mYa()), this.f11597n.Uo()));
        if (texture instanceof z.g9s) {
            Mf.t(this.f11597n).render(c2470nNr, (z.g9s) texture, f3);
        } else {
            if (!(texture instanceof z.afx)) {
                throw new IllegalStateException();
            }
            Mf.nr(this.f11597n).render(c2470nNr, (z.afx) texture, f3);
        }
        if (this.te) {
            return;
        }
        GLES20.glDisable(2960);
        az();
    }

    @Override // WzY.s4
    public void Z(float f3, float f4, float f5, yg paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Vector2D vector2DTimes = GeometryKt.times(new Vector2D(f3, f4), mYa());
        float x2 = vector2DTimes.getX();
        float y2 = vector2DTimes.getY();
        float f6 = f5 * this.f11591S;
        this.HI.rl();
        this.HI.nr(x2, y2, f6);
        paint.J2(this.HI, Rl());
    }

    @Override // WzY.s4
    public int aYN() {
        return this.KN;
    }

    @Override // WzY.s4
    public void az() {
        if (!this.f11589N) {
            throw new IllegalStateException("Check failed.");
        }
        this.f11589N = false;
        this.HI.n(this.f11597n.Ik(), this.f11597n.HI(), 1.0f);
        UhV();
    }

    @Override // WzY.s4
    public RenderEnvironment ck() {
        return this.gh;
    }

    @Override // WzY.s4
    public void fD(float f3, float f4, float f5, float f6, yg paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.Ik.ijL();
        this.Ik.Y(f3, f4);
        this.Ik.J(f5, f6);
        OU.O(this.Ik, this.HI, paint, mYa(), Rl());
    }

    public int fcU() {
        return this.f11590O;
    }

    @Override // WzY.s4
    public int g() {
        return this.xMQ;
    }

    @Override // WzY.s4
    public void gh(float f3, float f4, float f5, float f6, yg paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Vector2D vector2DTimes = GeometryKt.times(new Vector2D(f3, f4), mYa());
        float x2 = vector2DTimes.getX();
        float y2 = vector2DTimes.getY();
        Vector2D vector2DTimes2 = GeometryKt.times(new Vector2D(f5, f6), mYa());
        float x3 = vector2DTimes2.getX();
        float y3 = vector2DTimes2.getY();
        this.HI.rl();
        this.HI.ck(x2, y2, x3 - x2, y3 - y2);
        paint.J2(this.HI, Rl());
    }

    public void hRu(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        j jVar = this.f11596g;
        jVar.XQ(GeometryKt.times(jVar.xMQ(), matrix));
        UhV();
    }

    public void i() {
        XoT.C.Uo(this, new Function0() { // from class: WzY.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.K(this.f11648n);
            }
        });
        if (this.f11592T == null) {
            if (this.f11596g.t()) {
                throw new IllegalStateException("Check failed.");
            }
            o();
            z.g9s g9sVarQie = this.f11597n.qie(this.E2, "backingStore");
            this.f11592T = g9sVarQie;
            this.f11597n.r(g9sVarQie);
            GLES20.glColorMask(true, true, true, true);
            GLES20.glDisable(3042);
            GLES20.glDisable(2960);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClearStencil(0);
            GLES20.glClear(17408);
            GLES20.glEnable(3042);
            az();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, z.g9s] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, z.g9s] */
    @Override // WzY.s4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void iF(Matrix matrix) throws OpenGLException {
        int i2;
        int iterCount;
        Iterator it;
        List list;
        List arrayList;
        Iterator<Integer> it2;
        Integer numValueOf;
        int intValue;
        Matrix transMatrix = matrix;
        Intrinsics.checkNotNullParameter(transMatrix, "transMatrix");
        if (this.te) {
            throw new IllegalStateException("Must release clip before calling endLayer()");
        }
        if (!this.f11596g.t()) {
            throw new IllegalStateException("Called endLayer() but should have called restore()");
        }
        o();
        List listGh = this.f11596g.gh();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Uo = this.f11596g.Uo();
        if (Uo == 0) {
            throw new IllegalStateException();
        }
        objectRef.element = Uo;
        Rectangle rectangleO = this.f11596g.O();
        Transform transformKN = this.f11596g.KN();
        final BlendingMode blendingModeN = this.f11596g.n();
        Transform transformJ2 = this.f11596g.J2();
        final float fNr = this.f11596g.nr();
        List listRl = this.f11596g.rl();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = listGh.iterator();
        while (it3.hasNext()) {
            VisualEffectRef visualEffectRef = (VisualEffectRef) it3.next();
            VisualEffect effect = VisualEffectKt.getEffect(visualEffectRef);
            if (effect == null) {
                arrayList = CollectionsKt.emptyList();
                it = it3;
                list = listRl;
            } else {
                String iterParam = effect.getIterParam();
                if (iterParam == null) {
                    iterCount = effect.getIterCount();
                    List<ShaderGroup> listSortedWith = CollectionsKt.sortedWith(effect.getShaderGroups().values(), new w6());
                    ArrayList<VisualEffectRef> arrayList3 = new ArrayList();
                    for (ShaderGroup shaderGroup : listSortedWith) {
                        Iterator it4 = it3;
                        List list2 = listRl;
                        VisualEffectRef visualEffectRefCopy$default = visualEffectRef.getDisabledRenderGroups().contains(Integer.valueOf(shaderGroup.getId())) ? null : visualEffectRef.getRenderGroup() == shaderGroup.getId() ? visualEffectRef : VisualEffectRef.copy$default(visualEffectRef, null, null, shaderGroup.getId(), null, 11, null);
                        if (visualEffectRefCopy$default != null) {
                            arrayList3.add(visualEffectRefCopy$default);
                        }
                        it3 = it4;
                        listRl = list2;
                    }
                    it = it3;
                    list = listRl;
                    IntRange intRange = new IntRange(1, iterCount);
                    arrayList = new ArrayList();
                    it2 = intRange.iterator();
                    while (it2.hasNext()) {
                        int iNextInt = ((IntIterator) it2).nextInt();
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                        for (VisualEffectRef visualEffectRef2 : arrayList3) {
                            int i3 = iNextInt;
                            arrayList4.add(VisualEffectRef.copy$default(visualEffectRef2, null, MapsKt.plus(visualEffectRef2.getParameters(), TuplesKt.to("acIter", new UserParameterValue(i3 - 1))), 0, null, 13, null));
                            it2 = it2;
                            iNextInt = i3;
                        }
                        CollectionsKt.addAll(arrayList, arrayList4);
                    }
                } else {
                    final UserParameterValue userParameterValue = visualEffectRef.getParameters().get(iterParam);
                    if (userParameterValue != null) {
                        int i5 = n.$EnumSwitchMapping$0[userParameterValue.getDataType().ordinal()];
                        if (i5 == 1) {
                            intValue = userParameterValue.getIntValue();
                        } else {
                            if (i5 != 2) {
                                throw new IllegalStateException(new Function0() { // from class: WzY.rv6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return P.ijL(userParameterValue);
                                    }
                                }.toString());
                            }
                            intValue = MathKt.roundToInt(userParameterValue.getFloatValue());
                        }
                        numValueOf = Integer.valueOf(intValue);
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iterCount = numValueOf.intValue();
                    }
                    List<ShaderGroup> listSortedWith2 = CollectionsKt.sortedWith(effect.getShaderGroups().values(), new w6());
                    ArrayList<VisualEffectRef> arrayList32 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    it = it3;
                    list = listRl;
                    IntRange intRange2 = new IntRange(1, iterCount);
                    arrayList = new ArrayList();
                    it2 = intRange2.iterator();
                    while (it2.hasNext()) {
                    }
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList);
            it3 = it;
            listRl = list;
        }
        XoT.C.Uo(this, new Function0() { // from class: WzY.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.m(this.f11677n);
            }
        });
        XoT.C.Uo(this, new Function0() { // from class: WzY.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.eTf(this.f11579n);
            }
        });
        final List listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) SPz.HI(listRl));
        Ref.ObjectRef objectRef2 = objectRef;
        XoT.C.Uo(this, new Function0() { // from class: WzY.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.xg(this.f11644n, listPlus, blendingModeN, fNr, objectRef);
            }
        });
        this.nY.rl(this.f11596g);
        this.f11597n.o();
        this.f11597n.J2();
        this.HI.o();
        GLES20.glDisable(2960);
        int i7 = 0;
        if (listPlus.isEmpty()) {
            int i8 = n.$EnumSwitchMapping$1[blendingModeN.ordinal()];
            if (i8 == 1) {
                i2 = 1;
                GLES20.glEnable(3042);
                GLES20.glBlendEquation(32774);
                GLES20.glBlendFunc(1, 769);
                Mf.t(this.f11597n).render(this.f11595e, (z.g9s) objectRef2.element, fNr);
            } else if (i8 == 2) {
                i2 = 1;
                GLES20.glEnable(3042);
                GLES20.glBlendEquation(32774);
                GLES20.glBlendFunc(772, 771);
                kO4.render$default(Mf.t(this.f11597n), this.f11595e, (z.g9s) objectRef2.element, 0.0f, 4, null);
            } else if (i8 != 3) {
                if (i8 != 4) {
                    Mf.t(this.f11597n).render(this.f11595e, (z.g9s) objectRef2.element, fNr);
                } else if (ck().getTargetHasAlpha()) {
                    GLES20.glEnable(3042);
                    GLES20.glBlendEquation(32774);
                    GLES20.glBlendFunc(0, 771);
                    kO4.render$default(Mf.t(this.f11597n), this.f11595e, (z.g9s) objectRef2.element, 0.0f, 4, null);
                } else {
                    i2 = 1;
                    ((Fl) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(Fl.class))).render(this.f11595e, (z.g9s) objectRef2.element, fNr, ck().getScene().getBackground(), SPz.rl, SPz.f11611t, 25.0f);
                }
                i2 = 1;
            } else {
                i2 = 1;
                XoT.C.Uo(this, new Function0() { // from class: WzY.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P.pJg(this.f11576n);
                    }
                });
                if (ck().getTargetHasAlpha()) {
                    GLES20.glEnable(3042);
                    GLES20.glBlendEquation(32774);
                    GLES20.glBlendFunc(0, 770);
                    kO4.render$default(Mf.t(this.f11597n), this.f11595e, (z.g9s) objectRef2.element, 0.0f, 4, null);
                } else {
                    ((R6) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(R6.class))).render(this.f11595e, (z.g9s) objectRef2.element, fNr, ck().getScene().getBackground(), SPz.rl, SPz.f11611t, 25.0f);
                }
            }
            GLES20.glBlendFunc(i2, 771);
            GLES20.glBlendEquation(32774);
        } else {
            if (fNr < 1.0f) {
                throw new IllegalStateException("Cannot combine UCanvas layer alpha with effect");
            }
            for (Object obj : listPlus) {
                int i9 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final VisualEffectRef visualEffectRef3 = (VisualEffectRef) obj;
                final Ref.ObjectRef objectRef3 = objectRef2;
                Rectangle rectangle = rectangleO;
                Transform transform = transformKN;
                Transform transform2 = transformJ2;
                objectRef3.element = FX(i7, visualEffectRef3.getId(), visualEffectRef3, (z.g9s) objectRef2.element, rectangle, transform, transform2, listPlus.size(), transMatrix);
                XoT.C.Uo(this, new Function0() { // from class: WzY.psW
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return P.ofS(this.f11670n, visualEffectRef3, objectRef3);
                    }
                });
                transMatrix = matrix;
                transformJ2 = transform2;
                i7 = i9;
                objectRef2 = objectRef3;
                transformKN = transform;
                rectangleO = rectangle;
            }
        }
        ((z.g9s) objectRef2.element).release();
        az();
    }

    @Override // WzY.s4
    public int mUb() {
        return this.mUb;
    }

    public Matrix mYa() {
        return this.ViF;
    }

    @Override // WzY.s4
    public void n() {
        if (this.te) {
            throw new IllegalStateException("Must release clip before calling restore()");
        }
        if (this.f11596g.t()) {
            throw new IllegalStateException("Called restore() but should have called endLayer()");
        }
        this.nY.rl(this.f11596g);
        this.HI.o();
    }

    public boolean n1() {
        return this.f11596g.qie();
    }

    @Override // WzY.s4
    public void nY(Rectangle layerBounds, Transform layerTransform, Transform layerPrevTransform, final List layerEffects, final BlendingMode blendingMode, final float f3, List edgeDecorations, Vector2D overdrawScale) {
        Intrinsics.checkNotNullParameter(layerBounds, "layerBounds");
        Intrinsics.checkNotNullParameter(layerTransform, "layerTransform");
        Intrinsics.checkNotNullParameter(layerPrevTransform, "layerPrevTransform");
        Intrinsics.checkNotNullParameter(layerEffects, "layerEffects");
        Intrinsics.checkNotNullParameter(blendingMode, "blendingMode");
        Intrinsics.checkNotNullParameter(edgeDecorations, "edgeDecorations");
        Intrinsics.checkNotNullParameter(overdrawScale, "overdrawScale");
        if (this.te) {
            throw new IllegalStateException("Must release clip before calling beginLayer()");
        }
        o();
        this.nY.t(this.f11596g);
        this.f11596g.HI(true);
        this.f11596g.WPU(layerEffects);
        this.f11596g.Ik(layerBounds);
        this.f11596g.Z(layerTransform);
        this.f11596g.az(blendingMode);
        this.f11596g.r(layerPrevTransform);
        this.f11596g.ck(f3);
        this.f11596g.S(overdrawScale);
        this.f11596g.ty(edgeDecorations);
        final z.g9s g9sVarQie = this.f11597n.qie(eWT(), "beginLayer");
        XoT.C.Uo(this, new Function0() { // from class: WzY.Zs
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P.Nxk(this.f11620n, layerEffects, blendingMode, f3, g9sVarQie);
            }
        });
        this.f11596g.o(g9sVarQie);
        this.f11597n.r(g9sVarQie);
        this.f11597n.J2();
        GLES20.glColorMask(true, true, true, true);
        GLES20.glDisable(3042);
        GLES20.glDisable(2960);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearStencil(0);
        GLES20.glClear(17408);
        GLES20.glEnable(3042);
        az();
    }

    @Override // WzY.s4
    public void o() {
        if (this.f11589N) {
            throw new IllegalStateException("Check failed.");
        }
        this.f11589N = true;
        this.HI.J2();
    }

    @Override // WzY.s4
    public void qie(boolean z2) {
        this.ty = z2;
    }

    public int qm() {
        return this.nr;
    }

    @Override // WzY.s4
    public void r() {
        if (!this.te) {
            throw new IllegalStateException("No clip applied");
        }
        GLES20.glDisable(2960);
        az();
        this.te = false;
    }

    @Override // WzY.s4
    public int rl() {
        return this.f11597n.rl();
    }

    @Override // WzY.s4
    public void te(Sis path, yg paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        OU.O(path, this.HI, paint, mYa(), Rl());
    }

    @Override // WzY.s4
    public void ty(GradientFill gradientFill, RectF bounds, Matrix matrix, float f3) throws OpenGLException {
        z.P p2;
        Intrinsics.checkNotNullParameter(gradientFill, "gradientFill");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!this.te) {
            o();
            GLES20.glDisable(2960);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        C2470N c2470nRl = C2470N.KN.rl(bounds.left, bounds.top, bounds.right, bounds.bottom);
        z.UGc.gh(c2470nRl, GeometryKt.times(GeometryKt.times(GeometryKt.times(matrix, this.f11596g.xMQ()), mYa()), this.f11597n.Uo()));
        int i2 = n.$EnumSwitchMapping$2[gradientFill.getType().ordinal()];
        if (i2 == 1) {
            p2 = (z.P) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(z.yg.class));
        } else if (i2 == 2) {
            p2 = (z.P) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(LEl.class));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            p2 = (z.P) this.f11597n.mUb(Reflection.getOrCreateKotlinClass(QaP.class));
        }
        p2.render(c2470nRl, gradientFill.getStartLocation(), gradientFill.getEndLocation(), ColorKt.times(ColorKt.premultiply(gradientFill.getStartColor()), f3), ColorKt.times(ColorKt.premultiply(gradientFill.getEndColor()), f3));
        if (this.te) {
            return;
        }
        GLES20.glDisable(2960);
        az();
    }

    public int ul() {
        return this.Uo;
    }

    @Override // WzY.s4
    public void xMQ(boolean z2) {
        this.f11596g.aYN(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String B(String str, z.g9s g9sVar, int i2, int i3) {
        return "  applyEffect(IN): " + str + " layerTexture=" + g9sVar.o() + "  index/max=" + i2 + "/" + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D(VisualEffect visualEffect, int i2, EffectRenderPass effectRenderPass, z.g9s g9sVar) {
        String str;
        String id = visualEffect.getId();
        String target = effectRenderPass.getTarget();
        if (g9sVar != null) {
            str = g9sVar.getWidth() + "x" + g9sVar.getHeight();
        } else {
            str = null;
        }
        return "RenderEffectPass (NONFINAL) id=" + id + " pass=" + i2 + " target=" + target + " tartgetBuffer=" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GR(String str, z.g9s g9sVar) {
        return "  applyEffect(OUT): " + str + " layerTexture=" + g9sVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String I(VisualEffect visualEffect, int i2, EffectRenderPass effectRenderPass, z.g9s g9sVar, Rectangle rectangle, Vector2D vector2D, Vector2D vector2D2, Vector2D vector2D3) {
        String str;
        String id = visualEffect.getId();
        String target = effectRenderPass.getTarget();
        if (g9sVar != null) {
            str = g9sVar.getWidth() + "x" + g9sVar.getHeight();
        } else {
            str = null;
        }
        return "RenderEffectPass (FINAL) id=" + id + " pass=" + i2 + " target=" + target + " tartgetBuffer=" + str + " layerBounds=" + rectangle + " sceneSize=" + vector2D + " projectSize=" + vector2D2 + " viewSize=" + vector2D3;
    }

    private final float Rl() {
        if (!n1()) {
            return 1.0f;
        }
        return 1.0f / this.aYN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(String str, z.g9s g9sVar) {
        return "  applyEffect(OUT): " + str + " target=" + g9sVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eTf(P p2) {
        return "RenderOPTI strokeScale:" + p2.Rl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ijL(UserParameterValue userParameterValue) {
        return "Data type " + userParameterValue.getDataType() + " not supported for iteration count";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(P p2) {
        return "RenderOPTI setStrokeWidth - view(" + p2.fcU() + ", " + p2.G7() + ") logical(" + p2.g() + ", " + p2.mUb() + ") viewToLogicalScale:" + p2.aYN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pJg(P p2) {
        return "UCanvasMask: targetHasAlpha=" + p2.ck().getTargetHasAlpha() + " bg=" + p2.ck().getScene().getBackground();
    }
}
