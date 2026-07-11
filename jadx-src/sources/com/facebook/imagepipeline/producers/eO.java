package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import bA.C1653C;
import bA.InterfaceC1656I28;
import bA.InterfaceC1657Ml;
import bA.InterfaceC1658Wre;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.producers.DAz;
import com.facebook.imagepipeline.producers.eO;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ln.C2267j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class eO implements l4Z {
    public static final j az = new j(null);
    private final boolean J2;
    private final l4Z KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final ln.Pl f52546O;
    private final boolean Uo;
    private final Runnable gh;
    private final C2267j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final A72.j f52547n;
    private final bAP.Ml nr;
    private final Hh.qz qie;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final bAP.n f52548t;
    private final int xMQ;

    /* JADX INFO: Access modifiers changed from: private */
    abstract class Ml extends AbstractC1863c {
        private final dX.Ml J2;
        private final DAz KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final InterfaceC1866p f52549O;
        private boolean Uo;
        final /* synthetic */ eO mUb;
        private final String nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final mz f52550t;
        private int xMQ;

        public static final class j extends Wre {
            final /* synthetic */ boolean rl;

            j(boolean z2) {
                this.rl = z2;
            }

            @Override // com.facebook.imagepipeline.producers.Wre, com.facebook.imagepipeline.producers.OU
            public void n() {
                if (Ml.this.f52550t.p5()) {
                    Ml.this.KN.KN();
                }
            }

            @Override // com.facebook.imagepipeline.producers.OU
            public void rl() {
                if (this.rl) {
                    Ml.this.nY();
                }
            }
        }

        private final void fD(boolean z2) {
            synchronized (this) {
                if (z2) {
                    if (!this.Uo) {
                        HI().t(1.0f);
                        this.Uo = true;
                        Unit unit = Unit.INSTANCE;
                        this.KN.t();
                    }
                }
            }
        }

        private final void g(Throwable th) {
            fD(true);
            HI().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nY() {
            fD(true);
            HI().n();
        }

        protected abstract bA.eO ViF();

        protected abstract int WPU(C1653C c1653c);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(final eO eOVar, Pl consumer, mz producerContext, boolean z2, final int i2) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.mUb = eOVar;
            this.f52550t = producerContext;
            this.nr = "ProgressiveDecoder";
            this.f52549O = producerContext.M7();
            dX.Ml mlXMQ = producerContext.M().xMQ();
            Intrinsics.checkNotNullExpressionValue(mlXMQ, "getImageDecodeOptions(...)");
            this.J2 = mlXMQ;
            this.KN = new DAz(eOVar.J2(), new DAz.Ml() { // from class: com.facebook.imagepipeline.producers.z
                @Override // com.facebook.imagepipeline.producers.DAz.Ml
                public final void n(C1653C c1653c, int i3) throws Throwable {
                    eO.Ml.Ik(this.f52626n, eOVar, i2, c1653c, i3);
                }
            }, mlXMQ.f63511n);
            producerContext.rl(new j(z2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(Ml this$0, eO this$1, int i2, C1653C c1653c, int i3) throws Throwable {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (c1653c != null) {
                com.facebook.imagepipeline.request.j jVarM = this$0.f52550t.M();
                this$0.f52550t.jB("image_format", c1653c.p5().n());
                Uri uriWPU = jVarM.WPU();
                c1653c.Qu(uriWPU != null ? uriWPU.toString() : null);
                ln.Pl plKN = jVarM.KN();
                if (plKN == null) {
                    plKN = this$1.O();
                }
                boolean zAz = com.facebook.imagepipeline.producers.w6.az(i3, 16);
                if ((plKN == ln.Pl.f70469n || (plKN == ln.Pl.f70471t && !zAz)) && (this$1.nr() || !vn.I28.HI(jVarM.WPU()))) {
                    dX.fuX fuxXQ = jVarM.XQ();
                    Intrinsics.checkNotNullExpressionValue(fuxXQ, "getRotationOptions(...)");
                    c1653c.ub(UM7.j.rl(fuxXQ, jVarM.o(), c1653c, i2));
                }
                if (this$0.f52550t.Uo().getExperiments().KN()) {
                    this$0.E2(c1653c);
                }
                this$0.XQ(c1653c, i3, this$0.xMQ);
            }
        }

        private final Map S(InterfaceC1656I28 interfaceC1656I28, long j2, bA.eO eOVar, boolean z2, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String string = null;
            if (!this.f52549O.J2(this.f52550t, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j2);
            String strValueOf2 = String.valueOf(eOVar.rl());
            String strValueOf3 = String.valueOf(z2);
            if (interfaceC1656I28 != null && (extras = interfaceC1656I28.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(interfaceC1656I28 instanceof InterfaceC1658Wre)) {
                String str5 = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return Hh.CN3.t(map);
            }
            String str6 = string;
            Bitmap bitmapHRu = ((InterfaceC1658Wre) interfaceC1656I28).hRu();
            Intrinsics.checkNotNullExpressionValue(bitmapHRu, "getUnderlyingBitmap(...)");
            String str7 = bitmapHRu.getWidth() + "x" + bitmapHRu.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapHRu.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str6 != null) {
                map2.put("non_fatal_decode_error", str6);
            }
            return Hh.CN3.t(map2);
        }

        private final void X(C1653C c1653c, InterfaceC1656I28 interfaceC1656I28, int i2) {
            this.f52550t.jB("encoded_width", Integer.valueOf(c1653c.getWidth()));
            this.f52550t.jB("encoded_height", Integer.valueOf(c1653c.getHeight()));
            this.f52550t.jB("encoded_size", Integer.valueOf(c1653c.getSize()));
            this.f52550t.jB("image_color_space", c1653c.U());
            if (interfaceC1656I28 instanceof InterfaceC1657Ml) {
                this.f52550t.jB("bitmap_config", String.valueOf(((InterfaceC1657Ml) interfaceC1656I28).hRu().getConfig()));
            }
            if (interfaceC1656I28 != null) {
                interfaceC1656I28.FX(this.f52550t.getExtras());
            }
            this.f52550t.jB("last_scan_num", Integer.valueOf(i2));
        }

        private final void XQ(C1653C c1653c, int i2, int i3) throws Throwable {
            bA.eO eOVar;
            String str;
            long j2;
            InterfaceC1656I28 interfaceC1656I28IF;
            int i5 = i2;
            if ((c1653c.p5() != com.facebook.imageformat.n.rl && com.facebook.imagepipeline.producers.w6.O(i5)) || this.Uo || !C1653C.qm(c1653c)) {
                return;
            }
            if (Intrinsics.areEqual(c1653c.p5(), com.facebook.imageformat.n.nr) && eO.az.rl(c1653c, this.J2)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + c1653c.getWidth() + ", h = " + c1653c.getHeight() + ", pixel config = " + this.J2.KN + ", max bitmap size = 104857600");
                this.f52549O.gh(this.f52550t, "DecodeProducer", illegalStateException, null);
                g(illegalStateException);
                return;
            }
            com.facebook.imageformat.w6 w6VarP5 = c1653c.p5();
            Intrinsics.checkNotNullExpressionValue(w6VarP5, "getImageFormat(...)");
            String strN = w6VarP5.n();
            String str2 = "unknown";
            String str3 = strN == null ? "unknown" : strN;
            String str4 = c1653c.getWidth() + "x" + c1653c.getHeight();
            String strValueOf = String.valueOf(c1653c.FX());
            boolean zNr = com.facebook.imagepipeline.producers.w6.nr(i5);
            boolean z2 = zNr && !com.facebook.imagepipeline.producers.w6.az(i5, 8);
            boolean zAz = com.facebook.imagepipeline.producers.w6.az(i5, 4);
            dX.CN3 cn3O = this.f52550t.M().o();
            if (cn3O != null) {
                str2 = cn3O.f63505n + "x" + cn3O.rl;
            }
            try {
                long jJ2 = this.KN.J2();
                String string = this.f52550t.M().WPU().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                int size = (z2 || zAz) ? c1653c.getSize() : WPU(c1653c);
                bA.eO eOVarViF = (z2 || zAz) ? bA.Xo.nr : ViF();
                this.f52549O.nr(this.f52550t, "DecodeProducer");
                try {
                    Intrinsics.checkNotNull(eOVarViF);
                    interfaceC1656I28IF = iF(c1653c, size, eOVarViF);
                    try {
                        if (c1653c.FX() != 1) {
                            i5 |= 16;
                        }
                        this.f52549O.mUb(this.f52550t, "DecodeProducer", S(interfaceC1656I28IF, jJ2, eOVarViF, zNr, str3, str4, str2, strValueOf));
                        X(c1653c, interfaceC1656I28IF, i3);
                        te(interfaceC1656I28IF, i5);
                        C1653C.Uo(c1653c);
                    } catch (Exception e2) {
                        e = e2;
                        eOVar = eOVarViF;
                        str = str2;
                        j2 = jJ2;
                        Intrinsics.checkNotNull(eOVar);
                        this.f52549O.gh(this.f52550t, "DecodeProducer", e, S(interfaceC1656I28IF, j2, eOVar, zNr, str3, str4, str, strValueOf));
                        g(e);
                        C1653C.Uo(c1653c);
                    }
                } catch (DecodeException e3) {
                    eOVar = eOVarViF;
                    str = str2;
                    j2 = jJ2;
                    try {
                        try {
                            C1653C encodedImage = e3.getEncodedImage();
                            Dzy.j.ViF(this.nr, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e3.getMessage(), string, encodedImage.M7(10), Integer.valueOf(encodedImage.getSize()));
                            throw e3;
                        } catch (Exception e4) {
                            e = e4;
                            interfaceC1656I28IF = null;
                            Intrinsics.checkNotNull(eOVar);
                            this.f52549O.gh(this.f52550t, "DecodeProducer", e, S(interfaceC1656I28IF, j2, eOVar, zNr, str3, str4, str, strValueOf));
                            g(e);
                            C1653C.Uo(c1653c);
                        }
                    } catch (Throwable th) {
                        th = th;
                        C1653C.Uo(c1653c);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    eOVar = eOVarViF;
                    str = str2;
                    j2 = jJ2;
                    interfaceC1656I28IF = null;
                    Intrinsics.checkNotNull(eOVar);
                    this.f52549O.gh(this.f52550t, "DecodeProducer", e, S(interfaceC1656I28IF, j2, eOVar, zNr, str3, str4, str, strValueOf));
                    g(e);
                    C1653C.Uo(c1653c);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private final InterfaceC1656I28 iF(C1653C c1653c, int i2, bA.eO eOVar) {
            boolean z2 = this.mUb.KN() != null && ((Boolean) this.mUb.xMQ().get()).booleanValue();
            try {
                return this.mUb.Uo().n(c1653c, i2, eOVar, this.J2);
            } catch (OutOfMemoryError e2) {
                if (!z2) {
                    throw e2;
                }
                Runnable runnableKN = this.mUb.KN();
                if (runnableKN != null) {
                    runnableKN.run();
                }
                System.gc();
                return this.mUb.Uo().n(c1653c, i2, eOVar, this.J2);
            }
        }

        private final void te(InterfaceC1656I28 interfaceC1656I28, int i2) {
            Pj0.j jVarRl = this.mUb.t().rl(interfaceC1656I28);
            try {
                fD(com.facebook.imagepipeline.producers.w6.nr(i2));
                HI().rl(jVarRl, i2);
            } finally {
                Pj0.j.M7(jVarRl);
            }
        }

        protected boolean N(C1653C c1653c, int i2) {
            return this.KN.gh(c1653c, i2);
        }

        protected final void T(int i2) {
            this.xMQ = i2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        public void Uo(Throwable t3) {
            Intrinsics.checkNotNullParameter(t3, "t");
            g(t3);
        }

        protected final int aYN() {
            return this.xMQ;
        }

        private final void E2(C1653C c1653c) {
            if (c1653c.p5() != com.facebook.imageformat.n.rl) {
                return;
            }
            c1653c.ub(UM7.j.t(c1653c, com.facebook.imageutils.Ml.KN(this.J2.KN), 104857600));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        public void J2() {
            nY();
        }

        @Override // com.facebook.imagepipeline.producers.w6
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void KN(C1653C c1653c, int i2) {
            if (!T5.n.nr()) {
                boolean zNr = com.facebook.imagepipeline.producers.w6.nr(i2);
                if (zNr) {
                    if (c1653c == null) {
                        boolean zAreEqual = Intrinsics.areEqual(this.f52550t.z("cached_value_found"), Boolean.TRUE);
                        if (!this.f52550t.Uo().getExperiments().Uo() || this.f52550t.Mx() == j.w6.FULL_FETCH || zAreEqual) {
                            g(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!c1653c.isValid()) {
                        g(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (N(c1653c, i2)) {
                    boolean zAz = com.facebook.imagepipeline.producers.w6.az(i2, 4);
                    if (!zNr && !zAz && !this.f52550t.p5()) {
                        return;
                    }
                    this.KN.KN();
                    return;
                }
                return;
            }
            T5.n.n("DecodeProducer#onNewResultImpl");
            try {
                boolean zNr2 = com.facebook.imagepipeline.producers.w6.nr(i2);
                if (zNr2) {
                    if (c1653c == null) {
                        boolean zAreEqual2 = Intrinsics.areEqual(this.f52550t.z("cached_value_found"), Boolean.TRUE);
                        if (this.f52550t.Uo().getExperiments().Uo()) {
                            if (this.f52550t.Mx() != j.w6.FULL_FETCH) {
                                if (zAreEqual2) {
                                }
                            }
                        }
                        g(new ExceptionWithNoStacktrace("Encoded image is null."));
                        T5.n.rl();
                        return;
                    }
                    if (!c1653c.isValid()) {
                        g(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        T5.n.rl();
                        return;
                    }
                }
                if (!N(c1653c, i2)) {
                    T5.n.rl();
                    return;
                }
                boolean zAz2 = com.facebook.imagepipeline.producers.w6.az(i2, 4);
                if (zNr2 || zAz2 || this.f52550t.p5()) {
                    this.KN.KN();
                }
                Unit unit = Unit.INSTANCE;
                T5.n.rl();
            } catch (Throwable th) {
                T5.n.rl();
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1863c, com.facebook.imagepipeline.producers.w6
        protected void xMQ(float f3) {
            super.xMQ(f3 * 0.99f);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean rl(C1653C c1653c, dX.Ml ml) {
            if (((long) c1653c.getWidth()) * ((long) c1653c.getHeight()) * ((long) com.facebook.imageutils.Ml.KN(ml.KN)) > 104857600) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private final class n extends Ml {
        final /* synthetic */ eO gh;

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected synchronized boolean N(C1653C c1653c, int i2) {
            return com.facebook.imagepipeline.producers.w6.O(i2) ? false : super.N(c1653c, i2);
        }

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected bA.eO ViF() {
            bA.eO eOVarNr = bA.Xo.nr(0, false, false);
            Intrinsics.checkNotNullExpressionValue(eOVarNr, "of(...)");
            return eOVarNr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(eO eOVar, Pl consumer, mz mzVar, boolean z2, int i2) {
            super(eOVar, consumer, mzVar, z2, i2);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(mzVar, LHbnkhI.MHJsuQw);
            this.gh = eOVar;
        }

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected int WPU(C1653C encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return encodedImage.getSize();
        }
    }

    private final class w6 extends Ml {
        final /* synthetic */ eO az;
        private final bAP.I28 gh;
        private final bAP.Ml qie;

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected synchronized boolean N(C1653C c1653c, int i2) {
            if (c1653c == null) {
                return false;
            }
            try {
                boolean zN = super.N(c1653c, i2);
                if (com.facebook.imagepipeline.producers.w6.O(i2) || com.facebook.imagepipeline.producers.w6.az(i2, 8)) {
                    if (!com.facebook.imagepipeline.producers.w6.az(i2, 4) && C1653C.qm(c1653c) && c1653c.p5() == com.facebook.imageformat.n.rl) {
                        if (!this.gh.Uo(c1653c)) {
                            return false;
                        }
                        int iNr = this.gh.nr();
                        if (iNr <= aYN()) {
                            return false;
                        }
                        if (iNr < this.qie.n(aYN()) && !this.gh.O()) {
                            return false;
                        }
                        T(iNr);
                    }
                }
                return zN;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(eO eOVar, Pl consumer, mz producerContext, bAP.I28 progressiveJpegParser, bAP.Ml progressiveJpegConfig, boolean z2, int i2) {
            super(eOVar, consumer, producerContext, z2, i2);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            this.az = eOVar;
            this.gh = progressiveJpegParser;
            this.qie = progressiveJpegConfig;
            T(0);
        }

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected bA.eO ViF() {
            bA.eO eOVarRl = this.qie.rl(this.gh.nr());
            Intrinsics.checkNotNullExpressionValue(eOVarRl, "getQualityInfo(...)");
            return eOVarRl;
        }

        @Override // com.facebook.imagepipeline.producers.eO.Ml
        protected int WPU(C1653C encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return this.gh.t();
        }
    }

    public eO(A72.j byteArrayPool, Executor executor, bAP.n imageDecoder, bAP.Ml progressiveJpegConfig, ln.Pl downsampleMode, boolean z2, boolean z3, l4Z inputProducer, int i2, C2267j closeableReferenceFactory, Runnable runnable, Hh.qz recoverFromDecoderOOM) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f52547n = byteArrayPool;
        this.rl = executor;
        this.f52548t = imageDecoder;
        this.nr = progressiveJpegConfig;
        this.f52546O = downsampleMode;
        this.J2 = z2;
        this.Uo = z3;
        this.KN = inputProducer;
        this.xMQ = i2;
        this.mUb = closeableReferenceFactory;
        this.gh = runnable;
        this.qie = recoverFromDecoderOOM;
    }

    public final Executor J2() {
        return this.rl;
    }

    public final Runnable KN() {
        return this.gh;
    }

    public final ln.Pl O() {
        return this.f52546O;
    }

    public final bAP.n Uo() {
        return this.f52548t;
    }

    @Override // com.facebook.imagepipeline.producers.l4Z
    public void n(Pl consumer, mz context) {
        eO eOVar;
        mz mzVar;
        Pl w6Var;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (T5.n.nr()) {
            T5.n.n("DecodeProducer#produceResults");
            try {
                com.facebook.imagepipeline.request.j jVarM = context.M();
                this.KN.n((vn.I28.HI(jVarM.WPU()) || ImageRequestBuilder.o(jVarM.WPU())) ? new w6(this, consumer, context, new bAP.I28(this.f52547n), this.nr, this.Uo, this.xMQ) : new n(this, consumer, context, this.Uo, this.xMQ), context);
                Unit unit = Unit.INSTANCE;
                T5.n.rl();
                return;
            } catch (Throwable th) {
                T5.n.rl();
                throw th;
            }
        }
        com.facebook.imagepipeline.request.j jVarM2 = context.M();
        if (vn.I28.HI(jVarM2.WPU()) || ImageRequestBuilder.o(jVarM2.WPU())) {
            eOVar = this;
            mzVar = context;
            w6Var = new w6(eOVar, consumer, mzVar, new bAP.I28(eOVar.f52547n), eOVar.nr, eOVar.Uo, eOVar.xMQ);
        } else {
            w6Var = new n(this, consumer, context, this.Uo, this.xMQ);
            eOVar = this;
            mzVar = context;
        }
        eOVar.KN.n(w6Var, mzVar);
    }

    public final boolean nr() {
        return this.J2;
    }

    public final C2267j t() {
        return this.mUb;
    }

    public final Hh.qz xMQ() {
        return this.qie;
    }
}
