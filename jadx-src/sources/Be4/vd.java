package Be4;

import Be4.aC;
import Be4.psW;
import GJW.DC;
import GJW.OU;
import GJW.qYU;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import okio.BufferedSource;
import okio.Okio;
import okio.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class vd implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final psW f566n;
    private final FjR.C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f567t;

    static final class I28 extends SuspendLambda implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f568O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f569n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Drawable f570t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(Drawable drawable, Function0 function0, Function0 function02, Continuation continuation) {
            super(2, continuation);
            this.f570t = drawable;
            this.f568O = function0;
            this.J2 = function02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new I28(this.f570t, this.f568O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f569n == 0) {
                ResultKt.throwOnFailure(obj);
                afx.n(this.f570t).registerAnimationCallback(kYF.Wre.n(this.f568O, this.J2));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f571O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f572n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f573r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f574t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f571O = obj;
            this.f573r |= Integer.MIN_VALUE;
            return vd.this.xMQ(null, this);
        }
    }

    public static final class j implements aC.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f575n;

        public j(boolean z2) {
            this.f575n = z2;
        }

        private final boolean rl(BufferedSource bufferedSource) {
            Dsr dsr = Dsr.f521n;
            if (QJ.t(dsr, bufferedSource) || QJ.rl(dsr, bufferedSource)) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 30 && QJ.n(dsr, bufferedSource);
        }

        public boolean equals(Object obj) {
            return obj instanceof j;
        }

        public int hashCode() {
            return j.class.hashCode();
        }

        public /* synthetic */ j(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z2);
        }

        @Override // Be4.aC.j
        public aC n(Lf.qz qzVar, FjR.C c2, eQ.fuX fux) {
            if (!rl(qzVar.t().Z())) {
                return null;
            }
            return new vd(qzVar.t(), c2, this.f575n);
        }
    }

    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f576O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f577n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f578r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f579t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f576O = obj;
            this.f578r |= Integer.MIN_VALUE;
            return vd.this.n(this);
        }
    }

    public static final class w6 implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f580n;
        final /* synthetic */ vd rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f581t;

        public w6(Ref.ObjectRef objectRef, vd vdVar, Ref.BooleanRef booleanRef) {
            this.f580n = objectRef;
            this.rl = vdVar;
            this.f581t = booleanRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            this.f580n.element = imageDecoder;
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            Z.fuX fuxHI = this.rl.rl.HI();
            int iNr = Z.n.rl(fuxHI) ? width : kYF.Wre.nr(fuxHI.nr(), this.rl.rl.ty());
            Z.fuX fuxHI2 = this.rl.rl.HI();
            int iNr2 = Z.n.rl(fuxHI2) ? height : kYF.Wre.nr(fuxHI2.t(), this.rl.rl.ty());
            if (width > 0 && height > 0 && (width != iNr || height != iNr2)) {
                double dT = Dsr.t(width, height, iNr, iNr2, this.rl.rl.ty());
                Ref.BooleanRef booleanRef = this.f581t;
                boolean z2 = dT < 1.0d;
                booleanRef.element = z2;
                if (z2 || !this.rl.rl.t()) {
                    imageDecoder.setTargetSize(MathKt.roundToInt(((double) width) * dT), MathKt.roundToInt(dT * ((double) height)));
                }
            }
            this.rl.J2(imageDecoder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(kYF.Wre.t(this.rl.J2()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.rl.nr() ? 1 : 0);
        if (this.rl.O() != null) {
            imageDecoder.setTargetColorSpace(this.rl.O());
        }
        imageDecoder.setUnpremultipliedRequired(!this.rl.az());
        FjR.Wre.n(this.rl.qie());
        imageDecoder.setPostProcessor(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable Uo(vd vdVar, Ref.BooleanRef booleanRef) throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        psW pswMUb = vdVar.mUb(vdVar.f566n);
        try {
            return ImageDecoder.decodeDrawable(vdVar.KN(pswMUb), Q.n(new w6(objectRef, vdVar, booleanRef)));
        } finally {
            ImageDecoder imageDecoderN = SPz.n(objectRef.element);
            if (imageDecoderN != null) {
                imageDecoderN.close();
            }
            pswMUb.close();
        }
    }

    private final psW mUb(psW psw) {
        return (this.f567t && QJ.t(Dsr.f521n, psw.Z())) ? P.O(Okio.buffer(new C1311z(psw.Z())), this.rl.Uo()) : psw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Drawable drawable, Continuation continuation) {
        Ml ml;
        vd vdVar;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f573r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f573r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f571O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f573r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!g9s.n(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableN = afx.n(drawable);
            Integer numNr = FjR.Wre.nr(this.rl.qie());
            animatedImageDrawableN.setRepeatCount(numNr != null ? numNr.intValue() : -1);
            Function0 function0T = FjR.Wre.t(this.rl.qie());
            Function0 function0Rl = FjR.Wre.rl(this.rl.qie());
            if (function0T != null || function0Rl != null) {
                DC dcP0N = OU.t().p0N();
                I28 i28 = new I28(drawable, function0T, function0Rl, null);
                ml.f572n = this;
                ml.f574t = drawable;
                ml.f573r = 1;
                if (GJW.Dsr.Uo(dcP0N, i28, ml) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            vdVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = (Drawable) ml.f574t;
            vdVar = (vd) ml.f572n;
            ResultKt.throwOnFailure(obj);
        }
        return new AL.Ml(drawable, vdVar.rl.ty());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Be4.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        Ref.BooleanRef booleanRef;
        vd vdVar;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f578r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f578r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objXMQ = nVar.f576O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f578r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objXMQ);
            final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            Function0 function0 = new Function0() { // from class: Be4.rv6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return vd.Uo(this.f564n, booleanRef3);
                }
            };
            nVar.f577n = this;
            nVar.f579t = booleanRef3;
            nVar.f578r = 1;
            Object objT = qYU.t(null, function0, nVar, 1, null);
            if (objT != coroutine_suspended) {
                booleanRef = booleanRef3;
                objXMQ = objT;
                vdVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef2 = (Ref.BooleanRef) nVar.f577n;
            ResultKt.throwOnFailure(objXMQ);
            return new fuX((Drawable) objXMQ, booleanRef2.element);
        }
        booleanRef = (Ref.BooleanRef) nVar.f579t;
        vdVar = (vd) nVar.f577n;
        ResultKt.throwOnFailure(objXMQ);
        nVar.f577n = booleanRef;
        nVar.f579t = null;
        nVar.f578r = 2;
        objXMQ = vdVar.xMQ((Drawable) objXMQ, nVar);
        if (objXMQ != coroutine_suspended) {
            booleanRef2 = booleanRef;
            return new fuX((Drawable) objXMQ, booleanRef2.element);
        }
        return coroutine_suspended;
    }

    public vd(psW psw, FjR.C c2, boolean z2) {
        this.f566n = psw;
        this.rl = c2;
        this.f567t = z2;
    }

    private final ImageDecoder.Source KN(psW psw) {
        Path pathRl = psw.rl();
        if (pathRl != null) {
            return ImageDecoder.createSource(pathRl.toFile());
        }
        psW.j jVarUo = psw.Uo();
        if (jVarUo instanceof Be4.j) {
            return ImageDecoder.createSource(this.rl.Uo().getAssets(), ((Be4.j) jVarUo).n());
        }
        if (jVarUo instanceof Wre) {
            return ImageDecoder.createSource(this.rl.Uo().getContentResolver(), ((Wre) jVarUo).n());
        }
        if (jVarUo instanceof C1310m) {
            C1310m c1310m = (C1310m) jVarUo;
            if (Intrinsics.areEqual(c1310m.rl(), this.rl.Uo().getPackageName())) {
                return ImageDecoder.createSource(this.rl.Uo().getResources(), c1310m.t());
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return ImageDecoder.createSource(psw.Z().readByteArray());
        }
        return i2 == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(psw.Z().readByteArray())) : ImageDecoder.createSource(psw.n().toFile());
    }
}
