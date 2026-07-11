package Be4;

import Be4.aC;
import Be4.psW;
import GJW.qYU;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements aC {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final j f522O = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f523n;
    private final qz nr;
    private final FjR.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yB.fuX f524t;

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f525O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f526n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f527r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f528t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f525O = obj;
            this.f527r |= Integer.MIN_VALUE;
            return I28.this.n(this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n extends ForwardingSource {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Exception f529n;

        public final Exception n() {
            return this.f529n;
        }

        public n(Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j2) throws Exception {
            try {
                return super.read(buffer, j2);
            } catch (Exception e2) {
                this.f529n = e2;
                throw e2;
            }
        }
    }

    public static final class w6 implements aC.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final qz f530n;
        private final yB.fuX rl;

        public boolean equals(Object obj) {
            return obj instanceof w6;
        }

        public int hashCode() {
            return w6.class.hashCode();
        }

        @Override // Be4.aC.j
        public aC n(Lf.qz qzVar, FjR.C c2, eQ.fuX fux) {
            return new I28(qzVar.t(), c2, this.rl, this.f530n);
        }

        public w6(int i2, qz qzVar) {
            this.f530n = qzVar;
            this.rl = yB.o.rl(i2, 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuX J2(I28 i28) {
        return i28.O(new BitmapFactory.Options());
    }

    private final fuX O(BitmapFactory.Options options) throws Exception {
        n nVar = new n(this.f523n.Z());
        BufferedSource bufferedSourceBuffer = Okio.buffer(nVar);
        boolean z2 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedSourceBuffer.peek().inputStream(), null, options);
        Exception excN = nVar.n();
        if (excN != null) {
            throw excN;
        }
        options.inJustDecodeBounds = false;
        Pl pl = Pl.f533n;
        C cN = pl.n(options.outMimeType, bufferedSourceBuffer, this.nr);
        Exception excN2 = nVar.n();
        if (excN2 != null) {
            throw excN2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.rl.O() != null) {
            options.inPreferredColorSpace = this.rl.O();
        }
        options.inPremultiplied = this.rl.az();
        t(options, cN);
        nr(options, cN);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedSourceBuffer.inputStream(), null, options);
            CloseableKt.closeFinally(bufferedSourceBuffer, null);
            Exception excN3 = nVar.n();
            if (excN3 != null) {
                throw excN3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.rl.Uo().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.rl.Uo().getResources(), pl.rl(bitmapDecodeStream, cN));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z2 = false;
            }
            return new fuX(bitmapDrawable, z2);
        } finally {
        }
    }

    private final void nr(BitmapFactory.Options options, C c2) {
        psW.j jVarUo = this.f523n.Uo();
        if ((jVarUo instanceof C1310m) && Z.n.rl(this.rl.HI())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((C1310m) jVarUo).n();
            options.inTargetDensity = this.rl.Uo().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i2 = Xo.rl(c2) ? options.outHeight : options.outWidth;
        int i3 = Xo.rl(c2) ? options.outWidth : options.outHeight;
        Z.fuX fuxHI = this.rl.HI();
        int iNY = Z.n.rl(fuxHI) ? i2 : kYF.C.nY(fuxHI.nr(), this.rl.ty());
        Z.fuX fuxHI2 = this.rl.HI();
        int iNY2 = Z.n.rl(fuxHI2) ? i3 : kYF.C.nY(fuxHI2.t(), this.rl.ty());
        int iN = Dsr.n(i2, i3, iNY, iNY2, this.rl.ty());
        options.inSampleSize = iN;
        double dRl = Dsr.rl(((double) i2) / ((double) iN), ((double) i3) / ((double) iN), iNY, iNY2, this.rl.ty());
        if (this.rl.t()) {
            dRl = RangesKt.coerceAtMost(dRl, 1.0d);
        }
        boolean z2 = dRl == 1.0d;
        options.inScaled = !z2;
        if (z2) {
            return;
        }
        if (dRl > 1.0d) {
            options.inDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) / dRl);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) * dRl);
        }
    }

    private final void t(BitmapFactory.Options options, C c2) {
        Bitmap.Config configJ2 = this.rl.J2();
        if (c2.rl() || Xo.n(c2)) {
            configJ2 = kYF.j.O(configJ2);
        }
        if (this.rl.nr() && configJ2 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configJ2 = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configJ2 != Bitmap.Config.HARDWARE) {
            configJ2 = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configJ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Be4.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) throws Throwable {
        Ml ml;
        yB.fuX fux;
        final I28 i28;
        yB.fuX fux2;
        Throwable th;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f527r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f527r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f525O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f527r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                fux = this.f524t;
                ml.f526n = this;
                ml.f528t = fux;
                ml.f527r = 1;
                if (fux.t(ml) != coroutine_suspended) {
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux2 = (yB.fuX) ml.f526n;
                try {
                    ResultKt.throwOnFailure(obj);
                    fuX fux3 = (fuX) obj;
                    fux2.release();
                    return fux3;
                } catch (Throwable th2) {
                    th = th2;
                    fux2.release();
                    throw th;
                }
            }
            yB.fuX fux4 = (yB.fuX) ml.f528t;
            i28 = (I28) ml.f526n;
            ResultKt.throwOnFailure(obj);
            fux = fux4;
            Function0 function0 = new Function0() { // from class: Be4.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return I28.J2(this.f532n);
                }
            };
            ml.f526n = fux;
            ml.f528t = null;
            ml.f527r = 2;
            Object objT = qYU.t(null, function0, ml, 1, null);
            if (objT != coroutine_suspended) {
                fux2 = fux;
                obj = objT;
                fuX fux32 = (fuX) obj;
                fux2.release();
                return fux32;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            fux2 = fux;
            th = th3;
            fux2.release();
            throw th;
        }
    }

    public I28(psW psw, FjR.C c2, yB.fuX fux, qz qzVar) {
        this.f523n = psw;
        this.rl = c2;
        this.f524t = fux;
        this.nr = qzVar;
    }
}
