package Mgn;

import com.libsamplerate_kotlin.SRC_ERR_BAD_CONVERTER;
import com.libsamplerate_kotlin.SRC_ERR_BAD_INTERNAL_STATE;
import com.libsamplerate_kotlin.SRC_ERR_NO_PRIVATE;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class C {

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f6613n = new Ml();

        Ml() {
            super(2, C.class, "linear_copy", "linear_copy(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (QJ) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, QJ p1) throws SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            C.n(p0, p1);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f6614n = new j();

        j() {
            super(2, C.class, "linear_vari_process", "linear_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            C.nr(p0, p1);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6615n = new n();

        n() {
            super(2, C.class, "linear_vari_process", "linear_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            C.nr(p0, p1);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f6616n = new w6();

        w6() {
            super(1, C.class, "linear_reset", "linear_reset(Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((QJ) obj);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            C.rl(p0);
        }
    }

    public static final void n(QJ from, QJ to) throws SRC_ERR_NO_PRIVATE {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        if (from.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        CN3 cn3J2 = from.J2();
        fuX fux = cn3J2 instanceof fuX ? (fuX) cn3J2 : null;
        if (fux == null) {
            throw new IllegalStateException("No private data exist");
        }
        to.HI(fux.t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014e, code lost:
    
        r17 = r4;
        r20 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(QJ psrc, eO data) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
        long j2;
        double d2;
        double dJ2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(data, "data");
        long j3 = 0;
        if (data.J2() <= 0) {
            return;
        }
        CN3 cn3J2 = psrc.J2();
        fuX fux = cn3J2 instanceof fuX ? (fuX) cn3J2 : null;
        if (fux == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        if (fux.mUb() != 0) {
            int iNr = fux.nr();
            for (int i2 = 0; i2 < iNr; i2++) {
                float[] fArrUo = fux.Uo();
                Intrinsics.checkNotNull(fArrUo);
                float[] fArrN = data.n();
                Intrinsics.checkNotNull(fArrN);
                fArrUo[i2] = fArrN[data.rl() + i2];
            }
            fux.r(0);
        }
        fux.qie(data.J2() * ((long) fux.nr()));
        fux.ck(data.KN() * ((long) fux.nr()));
        fux.az(0L);
        fux.Ik(0L);
        double dNr = psrc.nr();
        if (Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dT = psrc.t();
        while (true) {
            double d4 = 1.0d;
            if (dT >= 1.0d || fux.xMQ() >= fux.KN()) {
                break;
            }
            j2 = j3;
            d2 = dNr;
            if (fux.J2() + (((double) fux.nr()) * (dT + 1.0d)) >= fux.O()) {
                break;
            }
            dNr = (fux.KN() <= j2 || Math.abs(psrc.nr() - data.mUb()) <= 1.0E-20d) ? d2 : psrc.nr() + ((fux.xMQ() * (data.mUb() - psrc.nr())) / fux.KN());
            int iNr2 = fux.nr();
            int i3 = 0;
            while (i3 < iNr2) {
                float[] fArrT = data.t();
                Intrinsics.checkNotNull(fArrT);
                double d5 = d4;
                int iXMQ = ((int) fux.xMQ()) + data.nr();
                float[] fArrUo2 = fux.Uo();
                Intrinsics.checkNotNull(fArrUo2);
                double d6 = fArrUo2[i3];
                float[] fArrN2 = data.n();
                Intrinsics.checkNotNull(fArrN2);
                float f3 = fArrN2[i3 + data.rl()];
                float[] fArrUo3 = fux.Uo();
                Intrinsics.checkNotNull(fArrUo3);
                fArrT[iXMQ] = (float) (d6 + (((double) (f3 - fArrUo3[i3])) * dT));
                fux.Ik(fux.xMQ() + 1);
                i3++;
                d4 = d5;
            }
            dT += d4 / dNr;
            j3 = j2;
        }
        double dT2 = Wre.t(dT);
        fux.az(fux.J2() + ((long) (fux.nr() * Wre.O(dT - dT2))));
        double dNr2 = d2;
        while (fux.xMQ() < fux.KN() && fux.J2() + (((double) fux.nr()) * dT2) < fux.O()) {
            if (fux.KN() > j2 && Math.abs(psrc.nr() - data.mUb()) > 1.0E-20d) {
                dNr2 = psrc.nr() + ((fux.xMQ() * (data.mUb() - psrc.nr())) / fux.KN());
            }
            if (z.f6678n.rl() == 1 && fux.J2() < fux.nr() && dT2 < 1.0d) {
                throw new IllegalStateException("DEBUG ASSERTION: Whoops!!!!   in_used : " + fux.J2() + "     channels : " + fux.nr() + "     input_index : " + dT2 + "\n");
            }
            int iNr3 = fux.nr();
            int i5 = 0;
            while (i5 < iNr3) {
                float[] fArrT2 = data.t();
                Intrinsics.checkNotNull(fArrT2);
                int iXMQ2 = ((int) fux.xMQ()) + data.nr();
                float[] fArrN3 = data.n();
                Intrinsics.checkNotNull(fArrN3);
                double d7 = fArrN3[(((int) fux.J2()) - fux.nr()) + i5 + data.rl()];
                float[] fArrN4 = data.n();
                Intrinsics.checkNotNull(fArrN4);
                double d8 = dT2;
                float f4 = fArrN4[((int) fux.J2()) + i5 + data.rl()];
                float[] fArrN5 = data.n();
                Intrinsics.checkNotNull(fArrN5);
                fArrT2[iXMQ2] = (float) (d7 + (((double) (f4 - fArrN5[((((int) fux.J2()) - fux.nr()) + i5) + data.rl()])) * d8));
                fux.Ik(fux.xMQ() + 1);
                i5++;
                dT2 = d8;
            }
            double d9 = dT2 + (1.0d / dNr2);
            double dT3 = Wre.t(d9);
            fux.az(fux.J2() + ((long) (fux.nr() * Wre.O(d9 - dT3))));
            dT2 = dT3;
        }
        double d10 = dT2;
        if (fux.J2() > fux.O()) {
            dJ2 = d10 + ((fux.J2() - fux.O()) / ((long) fux.nr()));
            fux.az(fux.O());
        } else {
            dJ2 = d10;
        }
        psrc.qie(dJ2);
        if (fux.J2() > j2) {
            int iNr4 = fux.nr();
            for (int i7 = 0; i7 < iNr4; i7++) {
                float[] fArrUo4 = fux.Uo();
                Intrinsics.checkNotNull(fArrUo4);
                float[] fArrN6 = data.n();
                Intrinsics.checkNotNull(fArrN6);
                fArrUo4[i7] = fArrN6[(((int) fux.J2()) - fux.nr()) + i7 + data.rl()];
            }
        }
        psrc.az(dNr2);
        data.HI(fux.J2() / ((long) fux.nr()));
        data.Ik(fux.xMQ() / ((long) fux.nr()));
    }

    public static final void rl(QJ psrc) {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        CN3 cn3J2 = psrc.J2();
        fuX fux = cn3J2 instanceof fuX ? (fuX) cn3J2 : null;
        if (fux == null) {
            throw new IllegalStateException("No private data exist");
        }
        fux.gh(psrc.n());
        fux.r(1);
        fux.ty(new float[fux.nr()]);
    }

    public static final void t(QJ psrc, o src_enum) throws SRC_ERR_BAD_CONVERTER {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(src_enum, "src_enum");
        if (src_enum != o.f6653S) {
            throw new SRC_ERR_BAD_CONVERTER();
        }
        if (psrc.J2() != null) {
            psrc.HI(null);
        }
        fuX fux = new fuX(0, 0, 0, 0L, 0L, 0L, 0L, null, 255, null);
        psrc.HI(fux);
        fux.HI(z.f6678n.n());
        fux.gh(psrc.n());
        psrc.mUb(j.f6614n);
        psrc.Z(n.f6615n);
        psrc.ck(w6.f6616n);
        psrc.gh(Ml.f6613n);
        rl(psrc);
    }
}
