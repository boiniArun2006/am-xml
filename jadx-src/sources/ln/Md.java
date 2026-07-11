package ln;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.C1864m;
import com.facebook.imagepipeline.producers.C1865o;
import com.facebook.imagepipeline.producers.Fl;
import com.facebook.imagepipeline.producers.LEl;
import com.facebook.imagepipeline.producers.M5;
import com.facebook.imagepipeline.producers.P;
import com.facebook.imagepipeline.producers.QaP;
import com.facebook.imagepipeline.producers.R6;
import com.facebook.imagepipeline.producers.fg;
import com.facebook.imagepipeline.producers.gnv;
import com.facebook.imagepipeline.producers.l4Z;
import com.facebook.imagepipeline.producers.o7q;
import com.facebook.imagepipeline.producers.pO;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Md {
    public static final j s7N = new j(null);
    private final Lazy E2;
    private final Set HI;
    private Map Ik;
    private final M5 J2;
    private final boolean KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Lazy f70455N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f70456O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Lazy f70457S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Lazy f70458T;
    private final Pl Uo;
    private final Lazy ViF;
    private final Lazy WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final Lazy f70459X;
    private final Lazy XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Lazy f70460Z;
    private final Lazy aYN;
    private final boolean az;
    private Map ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f70461e;
    private final Lazy fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f70462g;
    private final UM7.Ml gh;
    private final Lazy iF;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ContentResolver f70463n;
    private final Lazy nHg;
    private final Lazy nY;
    private final boolean nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Lazy f70464o;
    private final boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f70465r;
    private final ci rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final P f70466t;
    private final Lazy te;
    private final boolean ty;
    private final boolean xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String rl(Uri uri) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (string.length() > 30) {
                String strSubstring = string.substring(0, 30);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring + "...";
            }
            return string;
        }
    }

    public Md(ContentResolver contentResolver, ci ciVar, P networkFetcher, boolean z2, boolean z3, M5 threadHandoffProducerQueue, Pl downsampleMode, boolean z4, boolean z5, boolean z6, UM7.Ml imageTranscoderFactory, boolean z7, boolean z9, boolean z10, Set set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(ciVar, KfLR.OxZQRLPy);
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.f70463n = contentResolver;
        this.rl = ciVar;
        this.f70466t = networkFetcher;
        this.nr = z2;
        this.f70456O = z3;
        this.J2 = threadHandoffProducerQueue;
        this.Uo = downsampleMode;
        this.KN = z4;
        this.xMQ = z5;
        this.mUb = z6;
        this.gh = imageTranscoderFactory;
        this.qie = z7;
        this.az = z9;
        this.ty = z10;
        this.HI = set;
        this.ck = new LinkedHashMap();
        this.Ik = new LinkedHashMap();
        this.f70465r = new LinkedHashMap();
        this.f70464o = LazyKt.lazy(new Function0() { // from class: ln.g9s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.FX(this.f70499n);
            }
        });
        this.f70460Z = LazyKt.lazy(new Function0() { // from class: ln.psW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.P5(this.f70537n);
            }
        });
        this.XQ = LazyKt.lazy(new Function0() { // from class: ln.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.jB(this.f70489n);
            }
        });
        this.f70457S = LazyKt.lazy(new Function0() { // from class: ln.Z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.B(this.f70486n);
            }
        });
        this.WPU = LazyKt.lazy(new Function0() { // from class: ln.Ew
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.XQ(this.f70449n);
            }
        });
        this.aYN = LazyKt.lazy(new Function0() { // from class: ln.nKK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.J(this.f70535n);
            }
        });
        this.ViF = LazyKt.lazy(new Function0() { // from class: ln.DAz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.S(this.f70446n);
            }
        });
        this.nY = LazyKt.lazy(new Function0() { // from class: ln.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.M7(this.f70568n);
            }
        });
        this.f70462g = LazyKt.lazy(new Function0() { // from class: ln.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.Z(this.f70538n);
            }
        });
        this.te = LazyKt.lazy(new Function0() { // from class: ln.Ln
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.o(this.f70452n);
            }
        });
        this.iF = LazyKt.lazy(new Function0() { // from class: ln.lej
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.p5(this.f70531n);
            }
        });
        this.fD = LazyKt.lazy(new Function0() { // from class: ln.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.M(this.f70501n);
            }
        });
        this.E2 = LazyKt.lazy(new Function0() { // from class: ln.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.U(this.f70454n);
            }
        });
        this.f70461e = LazyKt.lazy(new Function0() { // from class: ln.rv6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.E(this.f70541n);
            }
        });
        this.f70459X = LazyKt.lazy(new Function0() { // from class: ln.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.piY(this.f70569n);
            }
        });
        this.f70458T = LazyKt.lazy(new Function0() { // from class: ln.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.eF(this.f70453n);
            }
        });
        this.f70455N = LazyKt.lazy(new Function0() { // from class: ln.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.Xw(this.f70500n);
            }
        });
        this.nHg = LazyKt.lazy(new Function0() { // from class: ln.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Md.WPU(this.f70451n);
            }
        });
    }

    private final synchronized l4Z e(l4Z l4z) {
        com.facebook.imagepipeline.producers.l3D l3dGh;
        l3dGh = this.rl.gh(l4z);
        Intrinsics.checkNotNullExpressionValue(l3dGh, "newDelayProducer(...)");
        return l3dGh;
    }

    private final synchronized l4Z rV9(l4Z l4z) {
        l4Z l4zG;
        l4zG = (l4Z) this.ck.get(l4z);
        if (l4zG == null) {
            pO pOVarTe = this.rl.te(l4z);
            Intrinsics.checkNotNullExpressionValue(pOVarTe, "newPostprocessorProducer(...)");
            l4zG = this.rl.g(pOVarTe);
            this.ck.put(l4z, l4zG);
        }
        return l4zG;
    }

    private final synchronized l4Z te(l4Z l4z) {
        l4Z l4zJ2;
        l4zJ2 = (l4Z) this.f70465r.get(l4z);
        if (l4zJ2 == null) {
            l4zJ2 = this.rl.J2(l4z);
            this.f70465r.put(l4z, l4zJ2);
        }
        return l4zJ2;
    }

    public final synchronized l4Z Nxk(P networkFetcher) {
        try {
            Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
            boolean z2 = false;
            if (!T5.n.nr()) {
                l4Z l4zViF = this.rl.ViF(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(l4zViF, "newNetworkFetchProducer(...)");
                com.facebook.imagepipeline.producers.j jVarN = ci.n(k(l4zViF));
                Intrinsics.checkNotNullExpressionValue(jVarN, "newAddImageTransformMetaDataProducer(...)");
                ci ciVar = this.rl;
                if (this.nr && this.Uo != Pl.f70468O) {
                    z2 = true;
                }
                return ciVar.fD(jVarN, z2, this.gh);
            }
            T5.n.n("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                l4Z l4zViF2 = this.rl.ViF(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(l4zViF2, "newNetworkFetchProducer(...)");
                com.facebook.imagepipeline.producers.j jVarN2 = ci.n(k(l4zViF2));
                Intrinsics.checkNotNullExpressionValue(jVarN2, "newAddImageTransformMetaDataProducer(...)");
                ci ciVar2 = this.rl;
                if (this.nr && this.Uo != Pl.f70468O) {
                    z2 = true;
                }
                fg fgVarFD = ciVar2.fD(jVarN2, z2, this.gh);
                T5.n.rl();
                return fgVarFD;
            } catch (Throwable th) {
                T5.n.rl();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z B(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return this$0.a(this$0.iF());
        }
        T5.n.n("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.a(this$0.iF());
        } finally {
            T5.n.rl();
        }
    }

    private final l4Z D(l4Z l4z) {
        com.facebook.imagepipeline.producers.Dsr dsrO = this.rl.O(l4z);
        Intrinsics.checkNotNullExpressionValue(dsrO, "newBitmapMemoryCacheProducer(...)");
        com.facebook.imagepipeline.producers.fuX fuxNr = this.rl.nr(dsrO);
        Intrinsics.checkNotNullExpressionValue(fuxNr, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        l4Z l4zRl = this.rl.rl(fuxNr, this.J2);
        Intrinsics.checkNotNullExpressionValue(l4zRl, "newBackgroundThreadHandoffProducer(...)");
        if (!this.qie && !this.az) {
            com.facebook.imagepipeline.producers.CN3 cn3T = this.rl.t(l4zRl);
            Intrinsics.checkNotNullExpressionValue(cn3T, "newBitmapMemoryCacheGetProducer(...)");
            return cn3T;
        }
        com.facebook.imagepipeline.producers.CN3 cn3T2 = this.rl.t(l4zRl);
        Intrinsics.checkNotNullExpressionValue(cn3T2, "newBitmapMemoryCacheGetProducer(...)");
        com.facebook.imagepipeline.producers.C cUo = this.rl.Uo(cn3T2);
        Intrinsics.checkNotNullExpressionValue(cUo, "newBitmapProbeProducer(...)");
        return cUo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z E(Md this$0) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.h hVarWPU = this$0.rl.WPU();
        Intrinsics.checkNotNullExpressionValue(hVarWPU, "newLocalThumbnailBitmapSdk29Producer(...)");
        return this$0.D(hVarWPU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gnv FX(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return new gnv(this$0.nY());
        }
        T5.n.n("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new gnv(this$0.nY());
        } finally {
            T5.n.rl();
        }
    }

    private final l4Z I(l4Z l4z) {
        return GR(l4z, new R6[]{this.rl.Z()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o7q J(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return this$0.rl.E2(this$0.nY());
        }
        T5.n.n("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.rl.E2(this$0.nY());
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z M(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.K kAYN = this$0.rl.aYN();
        Intrinsics.checkNotNullExpressionValue(kAYN, "newLocalVideoThumbnailProducer(...)");
        return this$0.D(kAYN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o7q M7(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return this$0.rl.E2(this$0.ViF());
        }
        T5.n.n("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.rl.E2(this$0.ViF());
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gnv P5(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return new gnv(this$0.ViF());
        }
        T5.n.n("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new gnv(this$0.ViF());
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z S(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return this$0.Nxk(this$0.f70466t);
        }
        T5.n.n("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.Nxk(this$0.f70466t);
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z U(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.qf qfVarR = this$0.rl.r();
        Intrinsics.checkNotNullExpressionValue(qfVarR, "newLocalContentUriFetchProducer(...)");
        return this$0.GR(qfVarR, new R6[]{this$0.rl.o(), this$0.rl.Z()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z WPU(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.Xo xoXMQ = this$0.rl.xMQ();
        Intrinsics.checkNotNullExpressionValue(xoXMQ, "newDataFetchProducer(...)");
        return this$0.a(this$0.rl.fD(ci.n(xoXMQ), true, this$0.gh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z XQ(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return this$0.rl.rl(this$0.iF(), this$0.J2);
        }
        T5.n.n("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.rl.rl(this$0.iF(), this$0.J2);
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z Xw(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.u uVarIk = this$0.rl.Ik();
        Intrinsics.checkNotNullExpressionValue(uVarIk, "newLocalAssetFetchProducer(...)");
        return this$0.I(uVarIk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z Z(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            com.facebook.imagepipeline.producers.M mXQ = this$0.rl.XQ();
            Intrinsics.checkNotNullExpressionValue(mXQ, "newLocalFileFetchProducer(...)");
            return this$0.rl.rl(this$0.k(mXQ), this$0.J2);
        }
        T5.n.n("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.M mXQ2 = this$0.rl.XQ();
            Intrinsics.checkNotNullExpressionValue(mXQ2, "newLocalFileFetchProducer(...)");
            return this$0.rl.rl(this$0.k(mXQ2), this$0.J2);
        } finally {
            T5.n.rl();
        }
    }

    private final l4Z dR0(R6[] r6Arr) {
        Fl flX = this.rl.X(r6Arr);
        Intrinsics.checkNotNullExpressionValue(flX, "newThumbnailBranchProducer(...)");
        fg fgVarFD = this.rl.fD(flX, true, this.gh);
        Intrinsics.checkNotNullExpressionValue(fgVarFD, "newResizeAndRotateProducer(...)");
        return fgVarFD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z eF(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.rv6 rv6VarS = this$0.rl.S();
        Intrinsics.checkNotNullExpressionValue(rv6VarS, aNrWBQYwFf.wrPWgKohH);
        return this$0.I(rv6VarS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gnv jB(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            return new gnv(this$0.aYN());
        }
        T5.n.n("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new gnv(this$0.aYN());
        } finally {
            T5.n.rl();
        }
    }

    private final l4Z k(l4Z l4z) {
        if (this.mUb) {
            l4z = Y(l4z);
        }
        l4Z l4zHI = this.rl.HI(l4z);
        Intrinsics.checkNotNullExpressionValue(l4zHI, "newEncodedMemoryCacheProducer(...)");
        if (!this.az) {
            com.facebook.imagepipeline.producers.r rVarTy = this.rl.ty(l4zHI);
            Intrinsics.checkNotNullExpressionValue(rVarTy, "newEncodedCacheKeyMultiplexProducer(...)");
            return rVarTy;
        }
        com.facebook.imagepipeline.producers.ci ciVarCk = this.rl.ck(l4zHI);
        Intrinsics.checkNotNullExpressionValue(ciVarCk, "newEncodedProbeProducer(...)");
        com.facebook.imagepipeline.producers.r rVarTy2 = this.rl.ty(ciVarCk);
        Intrinsics.checkNotNullExpressionValue(rVarTy2, "newEncodedCacheKeyMultiplexProducer(...)");
        return rVarTy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z o(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!T5.n.nr()) {
            com.facebook.imagepipeline.producers.qf qfVarR = this$0.rl.r();
            Intrinsics.checkNotNullExpressionValue(qfVarR, "newLocalContentUriFetchProducer(...)");
            return this$0.rl.rl(this$0.k(qfVarR), this$0.J2);
        }
        T5.n.n("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.qf qfVarR2 = this$0.rl.r();
            Intrinsics.checkNotNullExpressionValue(qfVarR2, "newLocalContentUriFetchProducer(...)");
            return this$0.rl.rl(this$0.k(qfVarR2), this$0.J2);
        } finally {
            T5.n.rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z p5(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.facebook.imagepipeline.producers.M mXQ = this$0.rl.XQ();
        Intrinsics.checkNotNullExpressionValue(mXQ, "newLocalFileFetchProducer(...)");
        return this$0.I(mXQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l4Z piY(Md this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LEl lElIF = this$0.rl.iF();
        Intrinsics.checkNotNullExpressionValue(lElIF, "newQualifiedResourceFetchProducer(...)");
        return this$0.I(lElIF);
    }

    public final l4Z E2(com.facebook.imagepipeline.request.j imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (!T5.n.nr()) {
            l4Z l4zG = g(imageRequest);
            if (imageRequest.az() != null) {
                l4zG = rV9(l4zG);
            }
            if (this.KN) {
                l4zG = te(l4zG);
            }
            return (!this.ty || imageRequest.J2() <= 0) ? l4zG : e(l4zG);
        }
        T5.n.n("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            l4Z l4zG2 = g(imageRequest);
            if (imageRequest.az() != null) {
                l4zG2 = rV9(l4zG2);
            }
            if (this.KN) {
                l4zG2 = te(l4zG2);
            }
            if (this.ty && imageRequest.J2() > 0) {
                l4zG2 = e(l4zG2);
            }
            T5.n.rl();
            return l4zG2;
        } catch (Throwable th) {
            T5.n.rl();
            throw th;
        }
    }

    public final l4Z N() {
        return (l4Z) this.iF.getValue();
    }

    public final l4Z T() {
        return (l4Z) this.E2.getValue();
    }

    public final l4Z ViF() {
        Object value = this.f70462g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l4Z) value;
    }

    public final l4Z X() {
        return (l4Z) this.f70455N.getValue();
    }

    public final l4Z a(l4Z inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        if (!T5.n.nr()) {
            com.facebook.imagepipeline.producers.eO eOVarMUb = this.rl.mUb(inputProducer);
            Intrinsics.checkNotNullExpressionValue(eOVarMUb, "newDecodeProducer(...)");
            return D(eOVarMUb);
        }
        T5.n.n("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            com.facebook.imagepipeline.producers.eO eOVarMUb2 = this.rl.mUb(inputProducer);
            Intrinsics.checkNotNullExpressionValue(eOVarMUb2, "newDecodeProducer(...)");
            return D(eOVarMUb2);
        } finally {
            T5.n.rl();
        }
    }

    public final l4Z aYN() {
        Object value = this.te.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l4Z) value;
    }

    public final l4Z bzg() {
        return (l4Z) this.f70459X.getValue();
    }

    public final l4Z fD() {
        return (l4Z) this.nHg.getValue();
    }

    public final l4Z iF() {
        return (l4Z) this.ViF.getValue();
    }

    public final l4Z nHg() {
        return (l4Z) this.f70458T.getValue();
    }

    public final l4Z nY() {
        Object value = this.WPU.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l4Z) value;
    }

    public final l4Z s7N() {
        return (l4Z) this.f70461e.getValue();
    }

    public final l4Z v() {
        return (l4Z) this.f70457S.getValue();
    }

    public final l4Z wTp() {
        return (l4Z) this.fD.getValue();
    }

    private final l4Z GR(l4Z l4z, R6[] r6Arr) {
        return a(z(k(l4z), r6Arr));
    }

    private final l4Z Y(l4Z l4z) {
        com.facebook.imagepipeline.producers.UGc uGcAz;
        com.facebook.imagepipeline.producers.UGc uGcAz2;
        if (!T5.n.nr()) {
            if (this.xMQ) {
                C1864m c1864mNY = this.rl.nY(l4z);
                Intrinsics.checkNotNullExpressionValue(c1864mNY, "newPartialDiskCacheProducer(...)");
                uGcAz2 = this.rl.az(c1864mNY);
            } else {
                uGcAz2 = this.rl.az(l4z);
            }
            Intrinsics.checkNotNull(uGcAz2);
            com.facebook.imagepipeline.producers.s4 s4VarQie = this.rl.qie(uGcAz2);
            Intrinsics.checkNotNullExpressionValue(s4VarQie, "newDiskCacheReadProducer(...)");
            return s4VarQie;
        }
        T5.n.n("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.xMQ) {
                C1864m c1864mNY2 = this.rl.nY(l4z);
                Intrinsics.checkNotNullExpressionValue(c1864mNY2, "newPartialDiskCacheProducer(...)");
                uGcAz = this.rl.az(c1864mNY2);
            } else {
                uGcAz = this.rl.az(l4z);
            }
            Intrinsics.checkNotNull(uGcAz);
            com.facebook.imagepipeline.producers.s4 s4VarQie2 = this.rl.qie(uGcAz);
            Intrinsics.checkNotNullExpressionValue(s4VarQie2, "newDiskCacheReadProducer(...)");
            T5.n.rl();
            return s4VarQie2;
        } catch (Throwable th) {
            T5.n.rl();
            throw th;
        }
    }

    private final l4Z g(com.facebook.imagepipeline.request.j jVar) {
        l4Z l4zV;
        if (!T5.n.nr()) {
            Uri uriWPU = jVar.WPU();
            Intrinsics.checkNotNullExpressionValue(uriWPU, "getSourceUri(...)");
            if (uriWPU != null) {
                int iAYN = jVar.aYN();
                if (iAYN != 0) {
                    switch (iAYN) {
                        case 2:
                            if (jVar.mUb()) {
                                return s7N();
                            }
                            return wTp();
                        case 3:
                            if (jVar.mUb()) {
                                return s7N();
                            }
                            return N();
                        case 4:
                            if (jVar.mUb()) {
                                return s7N();
                            }
                            if (eVO.j.t(this.f70463n.getType(uriWPU))) {
                                return wTp();
                            }
                            return T();
                        case 5:
                            return X();
                        case 6:
                            return nHg();
                        case 7:
                            return fD();
                        case 8:
                            return bzg();
                        default:
                            Set set = this.HI;
                            if (set != null) {
                                Iterator it = set.iterator();
                                if (it.hasNext()) {
                                    android.support.v4.media.j.n(it.next());
                                    throw null;
                                }
                            }
                            throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + s7N.rl(uriWPU));
                    }
                }
                return v();
            }
            throw new IllegalStateException("Uri is null.");
        }
        T5.n.n("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriWPU2 = jVar.WPU();
            Intrinsics.checkNotNullExpressionValue(uriWPU2, "getSourceUri(...)");
            if (uriWPU2 != null) {
                int iAYN2 = jVar.aYN();
                if (iAYN2 != 0) {
                    switch (iAYN2) {
                        case 2:
                            if (jVar.mUb()) {
                                l4Z l4zS7N = s7N();
                                T5.n.rl();
                                return l4zS7N;
                            }
                            l4zV = wTp();
                            break;
                            break;
                        case 3:
                            if (jVar.mUb()) {
                                l4Z l4zS7N2 = s7N();
                                T5.n.rl();
                                return l4zS7N2;
                            }
                            l4zV = N();
                            break;
                            break;
                        case 4:
                            if (jVar.mUb()) {
                                l4Z l4zS7N3 = s7N();
                                T5.n.rl();
                                return l4zS7N3;
                            }
                            if (eVO.j.t(this.f70463n.getType(uriWPU2))) {
                                l4Z l4zWTp = wTp();
                                T5.n.rl();
                                return l4zWTp;
                            }
                            l4zV = T();
                            break;
                            break;
                        case 5:
                            l4zV = X();
                            break;
                        case 6:
                            l4zV = nHg();
                            break;
                        case 7:
                            l4zV = fD();
                            break;
                        case 8:
                            l4zV = bzg();
                            break;
                        default:
                            Set set2 = this.HI;
                            if (set2 != null) {
                                Iterator it2 = set2.iterator();
                                if (it2.hasNext()) {
                                    android.support.v4.media.j.n(it2.next());
                                    throw null;
                                }
                            }
                            throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + s7N.rl(uriWPU2));
                    }
                } else {
                    l4zV = v();
                }
                T5.n.rl();
                return l4zV;
            }
            throw new IllegalStateException("Uri is null.");
        } catch (Throwable th) {
            T5.n.rl();
            throw th;
        }
    }

    private final l4Z z(l4Z l4z, R6[] r6Arr) {
        com.facebook.imagepipeline.producers.j jVarN = ci.n(l4z);
        Intrinsics.checkNotNullExpressionValue(jVarN, "newAddImageTransformMetaDataProducer(...)");
        QaP qaPE = this.rl.e(this.rl.fD(jVarN, true, this.gh));
        Intrinsics.checkNotNullExpressionValue(qaPE, "newThrottlingProducer(...)");
        C1865o c1865oKN = ci.KN(dR0(r6Arr), qaPE);
        Intrinsics.checkNotNullExpressionValue(c1865oKN, "newBranchOnSeparateImagesProducer(...)");
        return c1865oKN;
    }
}
