package Mgn;

import com.libsamplerate_kotlin.SRC_ERR_BAD_CONVERTER;
import com.libsamplerate_kotlin.SRC_ERR_BAD_INTERNAL_STATE;
import com.libsamplerate_kotlin.SRC_ERR_NO_PRIVATE;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Xo {

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f6626n = new Ml();

        Ml() {
            super(2, Xo.class, "zoh_copy", "zoh_copy(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((QJ) obj, (QJ) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, QJ p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Xo.n(p0, p1);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f6627n = new j();

        j() {
            super(2, Xo.class, "zoh_vari_process", "zoh_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Xo.nr(p0, p1);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6628n = new n();

        n() {
            super(2, Xo.class, "zoh_vari_process", "zoh_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Xo.nr(p0, p1);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f6629n = new w6();

        w6() {
            super(1, Xo.class, "zoh_reset", "zoh_reset(Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((QJ) obj);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Xo.rl(p0);
        }
    }

    public static final void n(QJ from, QJ to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        if (from.J2() == null) {
            return;
        }
        CN3 cn3J2 = from.J2();
        r rVar = cn3J2 instanceof r ? (r) cn3J2 : null;
        if (rVar == null) {
            throw new IllegalStateException("No private data exist");
        }
        to.HI(rVar.t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        r17 = r4;
        r20 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void nr(QJ psrc, eO data) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_NO_PRIVATE {
        long j2;
        long j3;
        double d2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(data, "data");
        long j4 = 0;
        if (data.J2() <= 0) {
            return;
        }
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        CN3 cn3J2 = psrc.J2();
        r rVar = cn3J2 instanceof r ? (r) cn3J2 : null;
        if (rVar == null) {
            throw new IllegalStateException("No private data exist");
        }
        if (rVar.mUb() != 0) {
            int iNr = rVar.nr();
            for (int i2 = 0; i2 < iNr; i2++) {
                float[] fArrUo = rVar.Uo();
                Intrinsics.checkNotNull(fArrUo);
                float[] fArrN = data.n();
                Intrinsics.checkNotNull(fArrN);
                fArrUo[i2] = fArrN[data.rl() + i2];
            }
            rVar.Ik(0);
        }
        rVar.qie(data.J2() * ((long) rVar.nr()));
        rVar.HI(data.KN() * ((long) rVar.nr()));
        rVar.az(0L);
        rVar.ck(0L);
        double dNr = psrc.nr();
        if (Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dT = psrc.t();
        while (true) {
            double d4 = 1.0d;
            j2 = 1;
            if (dT >= 1.0d || rVar.xMQ() >= rVar.KN()) {
                break;
            }
            j3 = j4;
            d2 = dNr;
            if (rVar.J2() + (((double) rVar.nr()) * dT) >= rVar.O()) {
                break;
            }
            dNr = (rVar.KN() <= j3 || Math.abs(psrc.nr() - data.mUb()) <= 1.0E-20d) ? d2 : psrc.nr() + ((rVar.xMQ() * (data.mUb() - psrc.nr())) / rVar.KN());
            int iNr2 = rVar.nr();
            int i3 = 0;
            while (i3 < iNr2) {
                float[] fArrT = data.t();
                Intrinsics.checkNotNull(fArrT);
                double d5 = d4;
                int iXMQ = ((int) rVar.xMQ()) + data.nr();
                float[] fArrUo2 = rVar.Uo();
                Intrinsics.checkNotNull(fArrUo2);
                fArrT[iXMQ] = fArrUo2[i3];
                rVar.ck(rVar.xMQ() + 1);
                i3++;
                d4 = d5;
            }
            dT += d4 / dNr;
            j4 = j3;
        }
        double dT2 = Wre.t(dT);
        rVar.az(rVar.J2() + ((long) (rVar.nr() * Wre.O(dT - dT2))));
        double dNr2 = d2;
        while (rVar.xMQ() < rVar.KN() && rVar.J2() + (((double) rVar.nr()) * dT2) <= rVar.O()) {
            if (rVar.KN() > j3 && Math.abs(psrc.nr() - data.mUb()) > 1.0E-20d) {
                dNr2 = psrc.nr() + ((rVar.xMQ() * (data.mUb() - psrc.nr())) / rVar.KN());
            }
            int iNr3 = rVar.nr();
            int i5 = 0;
            while (i5 < iNr3) {
                float[] fArrT2 = data.t();
                Intrinsics.checkNotNull(fArrT2);
                int iXMQ2 = ((int) rVar.xMQ()) + data.nr();
                float[] fArrN2 = data.n();
                Intrinsics.checkNotNull(fArrN2);
                long j5 = j2;
                fArrT2[iXMQ2] = fArrN2[(((int) rVar.J2()) - rVar.nr()) + i5 + data.rl()];
                rVar.ck(rVar.xMQ() + j5);
                i5++;
                j2 = j5;
            }
            double d6 = dT2 + (1.0d / dNr2);
            double dT3 = Wre.t(d6);
            rVar.az(rVar.J2() + ((long) (rVar.nr() * Wre.O(d6 - dT3))));
            dT2 = dT3;
        }
        if (rVar.J2() > rVar.O()) {
            dT2 += (rVar.J2() - rVar.O()) / ((long) rVar.nr());
            rVar.az(rVar.O());
        }
        psrc.qie(dT2);
        if (rVar.J2() > j3) {
            int iNr4 = rVar.nr();
            for (int i7 = 0; i7 < iNr4; i7++) {
                float[] fArrUo3 = rVar.Uo();
                Intrinsics.checkNotNull(fArrUo3);
                float[] fArrN3 = data.n();
                Intrinsics.checkNotNull(fArrN3);
                fArrUo3[i7] = fArrN3[(((int) rVar.J2()) - rVar.nr()) + i7 + data.rl()];
            }
        }
        psrc.az(dNr2);
        data.HI(rVar.J2() / ((long) rVar.nr()));
        data.Ik(rVar.xMQ() / ((long) rVar.nr()));
    }

    public static final void rl(QJ psrc) {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        CN3 cn3J2 = psrc.J2();
        r rVar = cn3J2 instanceof r ? (r) cn3J2 : null;
        if (rVar == null) {
            return;
        }
        rVar.gh(psrc.n());
        rVar.Ik(1);
        rVar.ty(new float[rVar.nr()]);
    }

    public static final void t(QJ psrc, o src_enum) throws SRC_ERR_BAD_CONVERTER {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(src_enum, "src_enum");
        if (src_enum != o.f6654Z) {
            throw new SRC_ERR_BAD_CONVERTER();
        }
        if (psrc.J2() != null) {
            psrc.HI(null);
        }
        r rVar = new r(0, 0, 0, 0L, 0L, 0L, 0L, null, 255, null);
        psrc.HI(rVar);
        rVar.r(Pl.f6622n.n());
        rVar.gh(psrc.n());
        psrc.mUb(j.f6627n);
        psrc.Z(n.f6628n);
        psrc.ck(w6.f6629n);
        psrc.gh(Ml.f6626n);
        rl(psrc);
    }
}
