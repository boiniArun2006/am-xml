package YHx;

import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadInternalState;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrNoPrivate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CN3 {

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f12046n = new Ml();

        Ml() {
            super(2, CN3.class, "linearCopy", "linearCopy(Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCPrivate;Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCPrivate;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRCErrNoPrivate {
            n((fuX) obj, (fuX) obj2);
            return Unit.INSTANCE;
        }

        public final void n(fuX p0, fuX p1) throws SRCErrNoPrivate {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            CN3.n(p0, p1);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f12047n = new j();

        j() {
            super(2, CN3.class, "linearVariProcess", "linearVariProcess(Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCPrivate;Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCData;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRCErrBadInternalState, SRCErrNoPrivate {
            n((fuX) obj, (I28) obj2);
            return Unit.INSTANCE;
        }

        public final void n(fuX p0, I28 p1) throws SRCErrBadInternalState, SRCErrNoPrivate {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            CN3.nr(p0, p1);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f12048n = new n();

        n() {
            super(2, CN3.class, "linearVariProcess", "linearVariProcess(Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCPrivate;Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCData;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRCErrBadInternalState, SRCErrNoPrivate {
            n((fuX) obj, (I28) obj2);
            return Unit.INSTANCE;
        }

        public final void n(fuX p0, I28 p1) throws SRCErrBadInternalState, SRCErrNoPrivate {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            CN3.nr(p0, p1);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f12049n = new w6();

        w6() {
            super(1, CN3.class, "linearReset", "linearReset(Lcom/bendingspoons/fellini/audioprocessing/resampler/libresample/SRCPrivate;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((fuX) obj);
            return Unit.INSTANCE;
        }

        public final void n(fuX p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            CN3.rl(p0);
        }
    }

    public static final void n(fuX from, fuX to) throws SRCErrNoPrivate {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        if (from.J2() == null) {
            throw new SRCErrNoPrivate();
        }
        YHx.w6 w6VarJ2 = from.J2();
        YHx.Ml ml = w6VarJ2 instanceof YHx.Ml ? (YHx.Ml) w6VarJ2 : null;
        if (ml == null) {
            throw new IllegalStateException("No private data exist");
        }
        to.HI(ml.t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x014b, code lost:
    
        r17 = r4;
        r20 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(fuX psrc, I28 data) throws SRCErrBadInternalState, SRCErrNoPrivate {
        long j2;
        long j3;
        double dJ2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(data, "data");
        long j4 = 1;
        if (data.O() <= 1) {
            return;
        }
        YHx.w6 w6VarJ2 = psrc.J2();
        YHx.Ml ml = w6VarJ2 instanceof YHx.Ml ? (YHx.Ml) w6VarJ2 : null;
        if (ml == null) {
            throw new SRCErrNoPrivate();
        }
        if (ml.mUb() != 0) {
            int iNr = ml.nr();
            for (int i2 = 0; i2 < iNr; i2++) {
                float[] fArrUo = ml.Uo();
                Intrinsics.checkNotNull(fArrUo);
                float[] fArrN = data.n();
                Intrinsics.checkNotNull(fArrN);
                fArrUo[i2] = fArrN[data.rl() + i2];
            }
            ml.r(0);
        }
        ml.qie(data.O() * ((long) ml.nr()));
        ml.ck(data.Uo() * ((long) ml.nr()));
        long j5 = 0;
        ml.az(0L);
        ml.Ik(0L);
        double dNr = psrc.nr();
        if (YHx.n.t(dNr)) {
            throw new SRCErrBadInternalState();
        }
        double dT = psrc.t();
        while (true) {
            double d2 = 1.0d;
            if (dT >= 1.0d || ml.xMQ() >= ml.KN()) {
                break;
            }
            j2 = j4;
            j3 = j5;
            if (ml.J2() + (((double) ml.nr()) * (dT + 1.0d)) >= ml.O()) {
                break;
            }
            if (ml.KN() > j3 && Math.abs(psrc.nr() - data.xMQ()) > 1.0E-20d) {
                dNr = psrc.nr() + ((ml.xMQ() * (data.xMQ() - psrc.nr())) / ml.KN());
            }
            int iNr2 = ml.nr();
            int i3 = 0;
            while (i3 < iNr2) {
                float[] fArrT = data.t();
                Intrinsics.checkNotNull(fArrT);
                int iXMQ = ((int) ml.xMQ()) + data.nr();
                float[] fArrUo2 = ml.Uo();
                Intrinsics.checkNotNull(fArrUo2);
                double d4 = fArrUo2[i3];
                float[] fArrN2 = data.n();
                Intrinsics.checkNotNull(fArrN2);
                float f3 = fArrN2[i3 + data.rl()];
                float[] fArrUo3 = ml.Uo();
                Intrinsics.checkNotNull(fArrUo3);
                fArrT[iXMQ] = (float) (d4 + (((double) (f3 - fArrUo3[i3])) * dT));
                ml.Ik(ml.xMQ() + j2);
                i3++;
                d2 = d2;
            }
            dT += d2 / dNr;
            j4 = j2;
            j5 = j3;
        }
        double dRl = YHx.n.rl(dT);
        ml.az(ml.J2() + ((long) (ml.nr() * MathKt.roundToInt(dT - dRl))));
        while (ml.xMQ() < ml.KN() && ml.J2() + (((double) ml.nr()) * dRl) < ml.O()) {
            if (ml.KN() > j3 && Math.abs(psrc.nr() - data.xMQ()) > 1.0E-20d) {
                dNr = psrc.nr() + ((ml.xMQ() * (data.xMQ() - psrc.nr())) / ml.KN());
            }
            if (Wre.f12056n.rl() == 1 && ml.J2() < ml.nr() && dRl < 1.0d) {
                throw new IllegalStateException("DEBUG ASSERTION: Whoops!!!!   in_used : " + ml.J2() + "     channels : " + ml.nr() + "     input_index : " + dRl + '\n');
            }
            int iNr3 = ml.nr();
            int i5 = 0;
            while (i5 < iNr3) {
                float[] fArrT2 = data.t();
                Intrinsics.checkNotNull(fArrT2);
                int iXMQ2 = ((int) ml.xMQ()) + data.nr();
                float[] fArrN3 = data.n();
                Intrinsics.checkNotNull(fArrN3);
                double d5 = fArrN3[(((int) ml.J2()) - ml.nr()) + i5 + data.rl()];
                float[] fArrN4 = data.n();
                Intrinsics.checkNotNull(fArrN4);
                double d6 = dRl;
                float f4 = fArrN4[((int) ml.J2()) + i5 + data.rl()];
                float[] fArrN5 = data.n();
                Intrinsics.checkNotNull(fArrN5);
                fArrT2[iXMQ2] = (float) (d5 + (((double) (f4 - fArrN5[((((int) ml.J2()) - ml.nr()) + i5) + data.rl()])) * d6));
                ml.Ik(ml.xMQ() + j2);
                i5++;
                dRl = d6;
            }
            double d7 = dRl + (1.0d / dNr);
            double dRl2 = YHx.n.rl(d7);
            ml.az(ml.J2() + ((long) (ml.nr() * MathKt.roundToInt(d7 - dRl2))));
            dRl = dRl2;
        }
        double d8 = dRl;
        if (ml.J2() > ml.O()) {
            dJ2 = d8 + ((ml.J2() - ml.O()) / ((long) ml.nr()));
            ml.az(ml.O());
        } else {
            dJ2 = d8;
        }
        psrc.qie(dJ2);
        if (ml.J2() > j3) {
            int iNr4 = ml.nr();
            for (int i7 = 0; i7 < iNr4; i7++) {
                float[] fArrUo4 = ml.Uo();
                Intrinsics.checkNotNull(fArrUo4);
                float[] fArrN6 = data.n();
                Intrinsics.checkNotNull(fArrN6);
                fArrUo4[i7] = fArrN6[(((int) ml.J2()) - ml.nr()) + i7 + data.rl()];
            }
        }
        psrc.az(dNr);
        data.ty(ml.J2() / ((long) ml.nr()));
        data.ck(ml.xMQ() / ((long) ml.nr()));
    }

    public static final void rl(fuX psrc) {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        YHx.w6 w6VarJ2 = psrc.J2();
        YHx.Ml ml = w6VarJ2 instanceof YHx.Ml ? (YHx.Ml) w6VarJ2 : null;
        if (ml == null) {
            throw new IllegalStateException("No private data exist");
        }
        ml.gh(psrc.n());
        ml.r(1);
        ml.ty(new float[ml.nr()]);
    }

    public static final void t(fuX psrc) {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        if (psrc.J2() != null) {
            psrc.HI(null);
        }
        YHx.Ml ml = new YHx.Ml(0, 0, 0, 0L, 0L, 0L, 0L, null, 255, null);
        psrc.HI(ml);
        ml.HI(Wre.f12056n.n());
        ml.gh(psrc.n());
        psrc.mUb(j.f12047n);
        psrc.Z(n.f12048n);
        psrc.ck(w6.f12049n);
        psrc.gh(Ml.f12046n);
        rl(psrc);
    }
}
