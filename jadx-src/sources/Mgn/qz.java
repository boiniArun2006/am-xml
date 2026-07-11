package Mgn;

import Mgn.I28;
import com.libsamplerate_kotlin.SRC_ERR_BAD_CHANNEL_COUNT;
import com.libsamplerate_kotlin.SRC_ERR_BAD_CONVERTER;
import com.libsamplerate_kotlin.SRC_ERR_BAD_INTERNAL_STATE;
import com.libsamplerate_kotlin.SRC_ERR_FILTER_LEN;
import com.libsamplerate_kotlin.SRC_ERR_NO_PRIVATE;
import com.libsamplerate_kotlin.SRC_ERR_SINC_PREPARE_DATA_BAD_LEN;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class qz {

    /* synthetic */ class C extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C f6660n = new C();

        C() {
            super(2, qz.class, "sinc_hex_vari_process", "sinc_hex_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.ty(p0, p1);
        }
    }

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final CN3 f6661n = new CN3();

        CN3() {
            super(2, qz.class, "sinc_stereo_vari_process", "sinc_stereo_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.Z(p0, p1);
        }
    }

    /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Dsr f6662n = new Dsr();

        Dsr() {
            super(2, qz.class, "sinc_quad_vari_process", "sinc_quad_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.Ik(p0, p1);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f6663n = new I28();

        I28() {
            super(2, qz.class, "sinc_mono_vari_process", "sinc_mono_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.HI(p0, p1);
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f6664n = new Ml();

        Ml() {
            super(2, qz.class, "sinc_copy", "sinc_copy(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (QJ) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, QJ p1) throws SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.az(p0, p1);
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f6665n = new Wre();

        Wre() {
            super(2, qz.class, "sinc_mono_vari_process", "sinc_mono_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.HI(p0, p1);
        }
    }

    /* synthetic */ class aC extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final aC f6666n = new aC();

        aC() {
            super(2, qz.class, "sinc_quad_vari_process", "sinc_quad_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.Ik(p0, p1);
        }
    }

    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final fuX f6667n = new fuX();

        fuX() {
            super(2, qz.class, "sinc_stereo_vari_process", "sinc_stereo_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.Z(p0, p1);
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f6668n = new n();

        n() {
            super(2, qz.class, "sinc_multichan_vari_process", "sinc_multichan_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.ck(p0, p1);
        }
    }

    /* synthetic */ class o extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final o f6669n = new o();

        o() {
            super(2, qz.class, "sinc_hex_vari_process", "sinc_hex_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.ty(p0, p1);
        }
    }

    /* JADX INFO: renamed from: Mgn.qz$qz, reason: collision with other inner class name */
    /* synthetic */ class C0230qz extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0230qz f6670n = new C0230qz();

        C0230qz() {
            super(2, qz.class, "sinc_multichan_vari_process", "sinc_multichan_vari_process(Lcom/libsamplerate_kotlin/SRC_PRIVATE;Lcom/libsamplerate_kotlin/SRC_DATA;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            n((QJ) obj, (eO) obj2);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0, eO p1) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            qz.ck(p0, p1);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f6671n = new w6();

        w6() {
            super(1, qz.class, "sinc_reset", "sinc_reset(Lcom/libsamplerate_kotlin/SRC_PRIVATE;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((QJ) obj);
            return Unit.INSTANCE;
        }

        public final void n(QJ p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            qz.r(p0);
        }
    }

    public static final int KN(int i2) {
        return i2 & ((XQ(1) << 12) - XQ(1));
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mgn.o.values().length];
            try {
                iArr[Mgn.o.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mgn.o.f6657r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mgn.o.f6656o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HI(QJ psrc, eO srcData) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
        long j2;
        double d2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        aCVar.g(srcData.J2() * ((long) aCVar.xMQ()));
        aCVar.E2(srcData.KN() * ((long) aCVar.xMQ()));
        long j3 = 0;
        aCVar.e(0L);
        aCVar.te(0L);
        double dNr = psrc.nr();
        if (Mgn.Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dMUb = (((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty());
        double d4 = 1.0d;
        if (Math.min(psrc.nr(), srcData.mUb()) < 1.0d) {
            dMUb /= Math.min(psrc.nr(), srcData.mUb());
        }
        int iXMQ = aCVar.xMQ() * (Mgn.Wre.O(dMUb) + 1);
        double dT = psrc.t();
        double dT2 = Mgn.Wre.t(dT);
        aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(dT - dT2))) % aCVar.J2());
        double d5 = (1.0d / dNr) + 1.0E-20d;
        while (aCVar.Ik() < aCVar.ck()) {
            if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                qie(aCVar, srcData, iXMQ);
                if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                    break;
                }
                if (aCVar.Uo() >= 0) {
                    j2 = j3;
                    d2 = d4;
                    if (((double) aCVar.nr()) + dT2 + d5 > aCVar.Uo()) {
                        break;
                    }
                } else {
                    j2 = j3;
                    d2 = d4;
                }
                if (aCVar.ck() > j2 && Math.abs(psrc.nr() - srcData.mUb()) > 1.0E-10d) {
                    dNr = psrc.nr() + ((aCVar.Ik() * (srcData.mUb() - psrc.nr())) / aCVar.ck());
                }
                double dTy = ((double) aCVar.ty()) * (dNr < d2 ? dNr : d2);
                int iUo = Uo(dTy);
                int iUo2 = Uo(dT2 * dTy);
                float[] fArrT = srcData.t();
                Intrinsics.checkNotNull(fArrT);
                fArrT[((int) aCVar.Ik()) + srcData.nr()] = (float) ((dTy / ((double) aCVar.ty())) * O(aCVar, iUo, iUo2));
                aCVar.e(aCVar.Ik() + 1);
                double d6 = dT2 + (d2 / dNr);
                double dT3 = Mgn.Wre.t(d6);
                aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(d6 - dT3))) % aCVar.J2());
                dT2 = dT3;
                j3 = j2;
                d4 = d2;
            }
        }
        psrc.qie(dT2);
        psrc.az(dNr);
        srcData.HI(aCVar.az() / ((long) aCVar.xMQ()));
        srcData.Ik(aCVar.Ik() / ((long) aCVar.xMQ()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Ik(QJ psrc, eO srcData) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
        long j2;
        double d2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        aCVar.g(srcData.J2() * ((long) aCVar.xMQ()));
        aCVar.E2(srcData.KN() * ((long) aCVar.xMQ()));
        aCVar.te(0L);
        aCVar.e(0L);
        double dNr = psrc.nr();
        if (Mgn.Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dMUb = (((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty());
        double d4 = 1.0d;
        if (Math.min(psrc.nr(), srcData.mUb()) < 1.0d) {
            j2 = 0;
            dMUb /= Math.min(psrc.nr(), srcData.mUb());
        } else {
            j2 = 0;
        }
        int iXMQ = aCVar.xMQ() * (Mgn.Wre.O(dMUb) + 1);
        double dT = psrc.t();
        double dT2 = Mgn.Wre.t(dT);
        aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(dT - dT2))) % aCVar.J2());
        double d5 = (1.0d / dNr) + 1.0E-20d;
        while (aCVar.Ik() < aCVar.ck()) {
            if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                qie(aCVar, srcData, iXMQ);
                if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                    break;
                }
                if (aCVar.Uo() >= 0) {
                    d2 = d4;
                    if (((double) aCVar.nr()) + dT2 + d5 >= aCVar.Uo()) {
                        break;
                    }
                } else {
                    d2 = d4;
                }
                if (aCVar.ck() > j2 && Math.abs(psrc.nr() - srcData.mUb()) > 1.0E-10d) {
                    dNr = psrc.nr() + ((aCVar.Ik() * (srcData.mUb() - psrc.nr())) / aCVar.ck());
                }
                double d6 = dNr;
                double dTy = ((double) aCVar.ty()) * (d6 < d2 ? d6 : d2);
                int iUo = Uo(dTy);
                int iUo2 = Uo(dT2 * dTy);
                int i2 = iXMQ;
                Mgn.aC aCVar2 = aCVar;
                double dTy2 = dTy / ((double) aCVar.ty());
                double d7 = dT2;
                float[] fArrT = srcData.t();
                Intrinsics.checkNotNull(fArrT);
                aCVar = aCVar2;
                nr(aCVar, iUo, iUo2, dTy2, fArrT, aCVar2.Ik() + ((long) srcData.nr()));
                aCVar.e(aCVar.Ik() + ((long) 4));
                double d8 = d7 + (d2 / d6);
                double dT3 = Mgn.Wre.t(d8);
                aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(d8 - dT3))) % aCVar.J2());
                dT2 = dT3;
                dNr = d6;
                d5 = d5;
                d4 = d2;
                iXMQ = i2;
                j2 = 0;
            }
        }
        psrc.qie(dT2);
        psrc.az(dNr);
        srcData.HI(aCVar.az() / ((long) aCVar.xMQ()));
        srcData.Ik(aCVar.Ik() / ((long) aCVar.xMQ()));
    }

    public static final void J2(Mgn.aC filter, int i2, int i3, double d2, float[] output, long j2) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(output, "output");
        double[] dArr = new double[2];
        double[] dArr2 = new double[2];
        int iGh = gh(filter.mUb());
        int i5 = (iGh - i3) / i2;
        int iXQ = XQ(Integer.valueOf(i3 + (i5 * i2)));
        int iNr = filter.nr() - (filter.xMQ() * i5);
        do {
            if (iNr >= 0) {
                double dXMQ = xMQ(iXQ);
                int iMUb = mUb(iXQ);
                float[] fArrGh = filter.gh();
                Intrinsics.checkNotNull(fArrGh);
                double d4 = fArrGh[iMUb];
                float[] fArrGh2 = filter.gh();
                Intrinsics.checkNotNull(fArrGh2);
                float f3 = fArrGh2[iMUb + 1];
                float[] fArrGh3 = filter.gh();
                Intrinsics.checkNotNull(fArrGh3);
                double d5 = d4 + (dXMQ * ((double) (f3 - fArrGh3[iMUb])));
                double d6 = dArr[0];
                float[] fArrKN = filter.KN();
                Intrinsics.checkNotNull(fArrKN);
                dArr[0] = d6 + (((double) fArrKN[iNr]) * d5);
                double d7 = dArr[1];
                float[] fArrKN2 = filter.KN();
                Intrinsics.checkNotNull(fArrKN2);
                dArr[1] = d7 + (d5 * ((double) fArrKN2[iNr + 1]));
            }
            iXQ = XQ(Integer.valueOf(iXQ - i2));
            iNr += 2;
        } while (iXQ >= n(0));
        int iXQ2 = XQ(Integer.valueOf(i2 - i3));
        int i7 = (iGh - iXQ2) / i2;
        int iXQ3 = XQ(Integer.valueOf(iXQ2 + (i7 * i2)));
        int iNr2 = filter.nr() + (filter.xMQ() * (i7 + 1));
        do {
            double dXMQ2 = xMQ(iXQ3);
            int iMUb2 = mUb(iXQ3);
            float[] fArrGh4 = filter.gh();
            Intrinsics.checkNotNull(fArrGh4);
            double d8 = fArrGh4[iMUb2];
            float[] fArrGh5 = filter.gh();
            Intrinsics.checkNotNull(fArrGh5);
            float f4 = fArrGh5[iMUb2 + 1];
            float[] fArrGh6 = filter.gh();
            Intrinsics.checkNotNull(fArrGh6);
            double d9 = d8 + (dXMQ2 * ((double) (f4 - fArrGh6[iMUb2])));
            double d10 = dArr2[0];
            float[] fArrKN3 = filter.KN();
            Intrinsics.checkNotNull(fArrKN3);
            dArr2[0] = d10 + (((double) fArrKN3[iNr2]) * d9);
            double d11 = dArr2[1];
            float[] fArrKN4 = filter.KN();
            Intrinsics.checkNotNull(fArrKN4);
            dArr2[1] = d11 + (d9 * ((double) fArrKN4[iNr2 + 1]));
            iXQ3 = XQ(Integer.valueOf(iXQ3 - i2));
            iNr2 -= 2;
        } while (iXQ3 > n(0));
        int i8 = (int) j2;
        output[i8] = (float) ((dArr[0] + dArr2[0]) * d2);
        output[i8 + 1] = (float) (d2 * (dArr[1] + dArr2[1]));
    }

    public static final double O(Mgn.aC filter, int i2, int i3) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        int iGh = gh(filter.mUb());
        int i5 = (iGh - i3) / i2;
        int iXQ = XQ(Integer.valueOf(i3 + (XQ(Integer.valueOf(i5)) * i2)));
        int iNr = filter.nr() - i5;
        double d2 = 0.0d;
        double d4 = 0.0d;
        do {
            if (iNr >= 0) {
                double dXMQ = xMQ(iXQ);
                int iMUb = mUb(iXQ);
                float[] fArrGh = filter.gh();
                Intrinsics.checkNotNull(fArrGh);
                double d5 = fArrGh[iMUb];
                float[] fArrGh2 = filter.gh();
                Intrinsics.checkNotNull(fArrGh2);
                float f3 = fArrGh2[iMUb + 1];
                float[] fArrGh3 = filter.gh();
                Intrinsics.checkNotNull(fArrGh3);
                double d6 = d5 + (dXMQ * ((double) (f3 - fArrGh3[iMUb])));
                float[] fArrKN = filter.KN();
                Intrinsics.checkNotNull(fArrKN);
                d4 += d6 * ((double) fArrKN[iNr]);
            }
            iXQ = XQ(Integer.valueOf(iXQ - i2));
            iNr++;
        } while (iXQ >= n(0));
        int iXQ2 = XQ(Integer.valueOf(i2 - i3));
        int i7 = (iGh - iXQ2) / i2;
        int iXQ3 = XQ(Integer.valueOf(iXQ2 + (XQ(Integer.valueOf(i7)) * i2)));
        int iNr2 = filter.nr() + 1 + i7;
        do {
            double dXMQ2 = xMQ(iXQ3);
            int iMUb2 = mUb(iXQ3);
            float[] fArrGh4 = filter.gh();
            Intrinsics.checkNotNull(fArrGh4);
            double d7 = fArrGh4[iMUb2];
            float[] fArrGh5 = filter.gh();
            Intrinsics.checkNotNull(fArrGh5);
            float f4 = fArrGh5[iMUb2 + 1];
            float[] fArrGh6 = filter.gh();
            Intrinsics.checkNotNull(fArrGh6);
            double d8 = d7 + (dXMQ2 * ((double) (f4 - fArrGh6[iMUb2])));
            float[] fArrKN2 = filter.KN();
            Intrinsics.checkNotNull(fArrKN2);
            d2 += d8 * ((double) fArrKN2[iNr2]);
            iXQ3 = XQ(Integer.valueOf(iXQ3 - i2));
            iNr2--;
        } while (iXQ3 > n(0));
        return d4 + d2;
    }

    public static final int Uo(double d2) {
        return XQ(Integer.valueOf(Mgn.Wre.O(d2 * Mgn.Dsr.f6617n.n())));
    }

    public static final int XQ(Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return number.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Z(QJ psrc, eO srcData) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
        long j2;
        double d2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        aCVar.g(srcData.J2() * ((long) aCVar.xMQ()));
        aCVar.E2(srcData.KN() * ((long) aCVar.xMQ()));
        aCVar.te(0L);
        aCVar.e(0L);
        double dNr = psrc.nr();
        if (Mgn.Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dMUb = (((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty());
        double d4 = 1.0d;
        if (Math.min(psrc.nr(), srcData.mUb()) < 1.0d) {
            j2 = 0;
            dMUb /= Math.min(psrc.nr(), srcData.mUb());
        } else {
            j2 = 0;
        }
        int iXMQ = aCVar.xMQ() * (Mgn.Wre.O(dMUb) + 1);
        double dT = psrc.t();
        double dT2 = Mgn.Wre.t(dT);
        aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(dT - dT2))) % aCVar.J2());
        double d5 = (1.0d / dNr) + 1.0E-20d;
        while (aCVar.Ik() < aCVar.ck()) {
            if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                qie(aCVar, srcData, iXMQ);
                if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                    break;
                }
                if (aCVar.Uo() >= 0) {
                    d2 = d4;
                    if (((double) aCVar.nr()) + dT2 + d5 >= aCVar.Uo()) {
                        break;
                    }
                } else {
                    d2 = d4;
                }
                if (aCVar.ck() > j2 && Math.abs(psrc.nr() - srcData.mUb()) > 1.0E-10d) {
                    dNr = psrc.nr() + ((aCVar.Ik() * (srcData.mUb() - psrc.nr())) / aCVar.ck());
                }
                double d6 = dNr;
                double dTy = ((double) aCVar.ty()) * (d6 < d2 ? d6 : d2);
                int iUo = Uo(dTy);
                int iUo2 = Uo(dT2 * dTy);
                int i2 = iXMQ;
                Mgn.aC aCVar2 = aCVar;
                double dTy2 = dTy / ((double) aCVar.ty());
                double d7 = dT2;
                float[] fArrT = srcData.t();
                Intrinsics.checkNotNull(fArrT);
                aCVar = aCVar2;
                J2(aCVar, iUo, iUo2, dTy2, fArrT, aCVar2.Ik() + ((long) srcData.nr()));
                aCVar.e(aCVar.Ik() + ((long) 2));
                double d8 = d7 + (d2 / d6);
                double dT3 = Mgn.Wre.t(d8);
                aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(d8 - dT3))) % aCVar.J2());
                dT2 = dT3;
                dNr = d6;
                d5 = d5;
                d4 = d2;
                iXMQ = i2;
                j2 = 0;
            }
        }
        psrc.qie(dT2);
        psrc.az(dNr);
        srcData.HI(aCVar.az() / ((long) aCVar.xMQ()));
        srcData.Ik(aCVar.Ik() / ((long) aCVar.xMQ()));
    }

    public static final void az(QJ from, QJ to) throws SRC_ERR_NO_PRIVATE {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Mgn.CN3 cn3J2 = from.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        to.HI(aCVar.t());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ck(QJ psrc, eO data) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(data, "data");
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        aCVar.g(data.J2() * ((long) aCVar.xMQ()));
        aCVar.E2(data.KN() * ((long) aCVar.xMQ()));
        long j2 = 0;
        aCVar.te(0L);
        aCVar.e(0L);
        double dNr = psrc.nr();
        if (Mgn.Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dMUb = (((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty());
        double d2 = 1.0d;
        if (Math.min(psrc.nr(), data.mUb()) < 1.0d) {
            dMUb /= Math.min(psrc.nr(), data.mUb());
        }
        int iXMQ = aCVar.xMQ() * (Mgn.Wre.O(dMUb) + 1);
        double dT = psrc.t();
        double dT2 = Mgn.Wre.t(dT);
        aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(dT - dT2))) % aCVar.J2());
        double d4 = (1.0d / dNr) + 1.0E-20d;
        while (aCVar.Ik() < aCVar.ck()) {
            if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                qie(aCVar, data, iXMQ);
                if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() > iXMQ) {
                    if (aCVar.Uo() >= 0 && ((double) aCVar.nr()) + dT2 + d4 >= aCVar.Uo()) {
                        break;
                    }
                    if (aCVar.ck() > j2 && Math.abs(psrc.nr() - data.mUb()) > 1.0E-10d) {
                        dNr = psrc.nr() + ((aCVar.Ik() * (data.mUb() - psrc.nr())) / aCVar.ck());
                    }
                    double d5 = dNr;
                    double dTy = ((double) aCVar.ty()) * (d5 < d2 ? d5 : d2);
                    int iUo = Uo(dTy);
                    int iUo2 = Uo(dT2 * dTy);
                    int iXMQ2 = aCVar.xMQ();
                    double dTy2 = dTy / ((double) aCVar.ty());
                    float[] fArrT = data.t();
                    Intrinsics.checkNotNull(fArrT);
                    double d6 = d2;
                    t(aCVar, iUo, iUo2, iXMQ2, dTy2, fArrT, aCVar.Ik() + ((long) data.nr()));
                    aCVar.e(aCVar.Ik() + ((long) psrc.n()));
                    double d7 = dT2 + (d6 / d5);
                    double dT3 = Mgn.Wre.t(d7);
                    aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(d7 - dT3))) % aCVar.J2());
                    dT2 = dT3;
                    dNr = d5;
                    d2 = d6;
                    j2 = 0;
                } else {
                    break;
                }
            }
        }
        psrc.qie(dT2);
        psrc.az(dNr);
        data.HI(aCVar.az() / ((long) aCVar.xMQ()));
        data.Ik(aCVar.Ik() / ((long) aCVar.xMQ()));
    }

    public static final int mUb(int i2) {
        return i2 >> 12;
    }

    public static final int n(Number x2) {
        Intrinsics.checkNotNullParameter(x2, "x");
        return x2.intValue();
    }

    public static final void nr(Mgn.aC filter, int i2, int i3, double d2, float[] output, long j2) {
        int i5;
        char c2;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(output, "output");
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        int iGh = gh(filter.mUb());
        int i9 = (iGh - i3) / i2;
        int iXQ = XQ(Integer.valueOf(i3 + (i9 * i2)));
        int iNr = filter.nr() - (filter.xMQ() * i9);
        do {
            i5 = 3;
            c2 = 2;
            if (iNr >= 0) {
                double dXMQ = xMQ(iXQ);
                int iMUb = mUb(iXQ);
                float[] fArrGh = filter.gh();
                Intrinsics.checkNotNull(fArrGh);
                double d4 = fArrGh[iMUb];
                float[] fArrGh2 = filter.gh();
                Intrinsics.checkNotNull(fArrGh2);
                float f3 = fArrGh2[iMUb + 1];
                float[] fArrGh3 = filter.gh();
                Intrinsics.checkNotNull(fArrGh3);
                float f4 = f3 - fArrGh3[iMUb];
                i7 = iXQ;
                i8 = 0;
                double d5 = d4 + (dXMQ * ((double) f4));
                double d6 = dArr[0];
                float[] fArrKN = filter.KN();
                Intrinsics.checkNotNull(fArrKN);
                dArr[0] = d6 + (((double) fArrKN[iNr]) * d5);
                double d7 = dArr[1];
                float[] fArrKN2 = filter.KN();
                Intrinsics.checkNotNull(fArrKN2);
                dArr[1] = d7 + (((double) fArrKN2[iNr + 1]) * d5);
                double d8 = dArr[2];
                float[] fArrKN3 = filter.KN();
                Intrinsics.checkNotNull(fArrKN3);
                dArr[2] = d8 + (((double) fArrKN3[iNr + 2]) * d5);
                double d9 = dArr[3];
                float[] fArrKN4 = filter.KN();
                Intrinsics.checkNotNull(fArrKN4);
                dArr[3] = d9 + (d5 * ((double) fArrKN4[iNr + 3]));
            } else {
                i7 = iXQ;
                i8 = 0;
            }
            iXQ = XQ(Integer.valueOf(i7 - i2));
            iNr += 4;
        } while (iXQ >= n(Integer.valueOf(i8)));
        int iXQ2 = XQ(Integer.valueOf(i2 - i3));
        int i10 = (iGh - iXQ2) / i2;
        int iXQ3 = XQ(Integer.valueOf(iXQ2 + (i10 * i2)));
        int iNr2 = filter.nr() + (filter.xMQ() * (i10 + 1));
        while (true) {
            double dXMQ2 = xMQ(iXQ3);
            int iMUb2 = mUb(iXQ3);
            float[] fArrGh4 = filter.gh();
            Intrinsics.checkNotNull(fArrGh4);
            double d10 = fArrGh4[iMUb2];
            float[] fArrGh5 = filter.gh();
            Intrinsics.checkNotNull(fArrGh5);
            float f5 = fArrGh5[iMUb2 + 1];
            float[] fArrGh6 = filter.gh();
            Intrinsics.checkNotNull(fArrGh6);
            float f6 = f5 - fArrGh6[iMUb2];
            int i11 = i5;
            char c4 = c2;
            double d11 = d10 + (dXMQ2 * ((double) f6));
            double d12 = dArr2[i8];
            float[] fArrKN5 = filter.KN();
            Intrinsics.checkNotNull(fArrKN5);
            dArr2[i8] = d12 + (((double) fArrKN5[iNr2]) * d11);
            double d13 = dArr2[1];
            float[] fArrKN6 = filter.KN();
            Intrinsics.checkNotNull(fArrKN6);
            dArr2[1] = d13 + (((double) fArrKN6[iNr2 + 1]) * d11);
            double d14 = dArr2[c4];
            float[] fArrKN7 = filter.KN();
            Intrinsics.checkNotNull(fArrKN7);
            dArr2[c4] = d14 + (((double) fArrKN7[iNr2 + 2]) * d11);
            double d15 = dArr2[i11];
            float[] fArrKN8 = filter.KN();
            Intrinsics.checkNotNull(fArrKN8);
            dArr2[i11] = d15 + (d11 * ((double) fArrKN8[iNr2 + 3]));
            iXQ3 = XQ(Integer.valueOf(iXQ3 - i2));
            iNr2 -= 4;
            if (iXQ3 <= n(Integer.valueOf(i8))) {
                int i12 = (int) j2;
                output[i12] = (float) ((dArr[i8] + dArr2[i8]) * d2);
                output[i12 + 1] = (float) ((dArr[1] + dArr2[1]) * d2);
                output[i12 + 2] = (float) ((dArr[c4] + dArr2[c4]) * d2);
                output[i12 + i11] = (float) (d2 * (dArr[i11] + dArr2[i11]));
                return;
            }
            i5 = i11;
            c2 = c4;
        }
    }

    public static final void o(QJ psrc, Mgn.o src_enum) throws SRC_ERR_FILTER_LEN, SRC_ERR_BAD_CHANNEL_COUNT, SRC_ERR_BAD_CONVERTER {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(src_enum, "src_enum");
        Mgn.aC aCVar = new Mgn.aC(0, 0, 0L, 0L, 0L, 0L, 0, 0, 0.0d, 0.0d, null, 0, 0, 0, 0, null, null, null, 262143, null);
        if (psrc.J2() != null) {
            psrc.HI(null);
        }
        aCVar.X(Mgn.Dsr.f6617n.t());
        aCVar.aYN(psrc.n());
        if (psrc.n() > aCVar.HI().length) {
            throw new SRC_ERR_BAD_CHANNEL_COUNT();
        }
        if (psrc.n() == 1) {
            psrc.mUb(I28.f6663n);
            psrc.Z(Wre.f6665n);
        } else if (psrc.n() == 2) {
            psrc.mUb(CN3.f6661n);
            psrc.Z(fuX.f6667n);
        } else if (psrc.n() == 4) {
            psrc.mUb(Dsr.f6662n);
            psrc.Z(aC.f6666n);
        } else if (psrc.n() == 6) {
            psrc.mUb(C.f6660n);
            psrc.Z(o.f6669n);
        } else {
            psrc.mUb(C0230qz.f6670n);
            psrc.Z(n.f6668n);
        }
        psrc.ck(w6.f6671n);
        psrc.gh(Ml.f6664n);
        int i2 = j.$EnumSwitchMapping$0[src_enum.ordinal()];
        if (i2 == 1) {
            I28.j jVar = Mgn.I28.f6620t;
            aCVar.nY(jVar.rl().Uo());
            aCVar.ViF(jVar.rl().Uo().length - 2);
            aCVar.iF(jVar.rl().KN());
        } else if (i2 == 2) {
            I28.j jVar2 = Mgn.I28.f6620t;
            aCVar.nY(jVar2.nr().Uo());
            aCVar.ViF(jVar2.nr().Uo().length - 2);
            aCVar.iF(jVar2.nr().KN());
        } else {
            if (i2 != 3) {
                throw new SRC_ERR_BAD_CONVERTER();
            }
            I28.j jVar3 = Mgn.I28.f6620t;
            aCVar.nY(jVar3.t().Uo());
            aCVar.ViF(jVar3.t().Uo().length - 2);
            aCVar.iF(jVar3.t().KN());
        }
        aCVar.XQ(Mgn.Wre.O((((((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty())) * ((double) 256)) + ((double) 1)) * 3);
        aCVar.XQ(Math.max(aCVar.J2(), 4096));
        aCVar.XQ(aCVar.J2() * aCVar.xMQ());
        aCVar.XQ(aCVar.J2() + 1);
        psrc.HI(aCVar);
        r(psrc);
        int iXQ = XQ(Integer.valueOf(aCVar.mUb()));
        int i3 = 0;
        while ((n(1) << i3) < iXQ) {
            i3++;
            iXQ = (iXQ | n(1)) << i3;
        }
        if (i3 + 11 >= 32) {
            throw new SRC_ERR_FILTER_LEN();
        }
    }

    public static final void qie(Mgn.aC filter, eO srcData, int i2) throws SRC_ERR_SINC_PREPARE_DATA_BAD_LEN {
        int iMax;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(srcData, "srcData");
        if (filter.Uo() < 0 && srcData.n() != null) {
            if (filter.nr() == 0) {
                iMax = filter.J2() - (i2 * 2);
                filter.Z(i2);
                filter.o(i2);
            } else if (filter.O() + i2 + filter.xMQ() < filter.J2()) {
                iMax = Math.max((filter.J2() - filter.nr()) - i2, 0);
            } else {
                int iO = filter.O() - filter.nr();
                float[] fArrKN = filter.KN();
                Intrinsics.checkNotNull(fArrKN);
                float[] fArrKN2 = filter.KN();
                Intrinsics.checkNotNull(fArrKN2);
                ArraysKt.copyInto(fArrKN, fArrKN2, 0, filter.nr() - i2, (filter.nr() - i2) + i2 + iO);
                filter.o(i2);
                filter.Z(filter.nr() + iO);
                iMax = Math.max((filter.J2() - filter.nr()) - i2, 0);
            }
            int iMin = Math.min((int) (filter.qie() - filter.az()), iMax);
            int iXMQ = iMin - (iMin % filter.xMQ());
            if (iXMQ < 0 || filter.O() + iXMQ > filter.J2()) {
                throw new SRC_ERR_SINC_PREPARE_DATA_BAD_LEN();
            }
            float[] fArrN = srcData.n();
            Intrinsics.checkNotNull(fArrN);
            float[] fArrKN3 = filter.KN();
            Intrinsics.checkNotNull(fArrKN3);
            ArraysKt.copyInto(fArrN, fArrKN3, filter.O(), ((int) filter.az()) + srcData.rl(), ((int) filter.az()) + srcData.rl() + iXMQ);
            filter.Z(filter.O() + iXMQ);
            filter.te(filter.az() + ((long) iXMQ));
            if (filter.az() != filter.qie() || filter.O() - filter.nr() >= i2 * 2 || srcData.O() == 0) {
                return;
            }
            int iJ2 = i2 + 5;
            if (filter.J2() - filter.O() < iJ2) {
                int iO2 = filter.O() - filter.nr();
                float[] fArrKN4 = filter.KN();
                Intrinsics.checkNotNull(fArrKN4);
                float[] fArrKN5 = filter.KN();
                Intrinsics.checkNotNull(fArrKN5);
                ArraysKt.copyInto(fArrKN4, fArrKN5, 0, filter.nr() - i2, (filter.nr() - i2) + i2 + iO2);
                filter.o(i2);
                filter.Z(filter.nr() + iO2);
            }
            filter.S(filter.O());
            if (iJ2 < 0 || filter.O() + iJ2 > filter.J2()) {
                iJ2 = filter.J2() - filter.O();
            }
            float[] fArrKN6 = filter.KN();
            Intrinsics.checkNotNull(fArrKN6);
            ArraysKt.fill(fArrKN6, 0.0f, filter.O(), filter.O() + iJ2);
            filter.Z(filter.O() + iJ2);
        }
    }

    public static final void r(QJ psrc) {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            return;
        }
        aCVar.Z(0);
        aCVar.o(0);
        aCVar.S(-1);
        aCVar.fD(0.0d);
        aCVar.T(0.0d);
        aCVar.WPU(new float[aCVar.J2() + aCVar.xMQ()]);
        float[] fArrKN = aCVar.KN();
        Intrinsics.checkNotNull(fArrKN);
        ArraysKt.fill(fArrKN, 170.0f, aCVar.J2(), aCVar.J2() + aCVar.xMQ());
    }

    public static final void rl(Mgn.aC filter, int i2, int i3, double d2, float[] output, int i5) {
        char c2;
        char c4;
        int i7;
        char c5;
        char c6;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(output, "output");
        double[] dArr = new double[6];
        double[] dArr2 = new double[6];
        int iGh = gh(filter.mUb());
        int i8 = (iGh - i3) / i2;
        int iXQ = XQ(Integer.valueOf(i3 + (i8 * i2)));
        int iNr = filter.nr() - (filter.xMQ() * i8);
        do {
            if (iNr >= 0) {
                double dXMQ = xMQ(iXQ);
                int iMUb = mUb(iXQ);
                float[] fArrGh = filter.gh();
                Intrinsics.checkNotNull(fArrGh);
                i7 = 0;
                float f3 = fArrGh[iMUb];
                c4 = 5;
                c5 = 4;
                double d4 = f3;
                float[] fArrGh2 = filter.gh();
                Intrinsics.checkNotNull(fArrGh2);
                float f4 = fArrGh2[iMUb + 1];
                float[] fArrGh3 = filter.gh();
                Intrinsics.checkNotNull(fArrGh3);
                float f5 = f4 - fArrGh3[iMUb];
                c2 = 3;
                c6 = 2;
                double d5 = d4 + (dXMQ * ((double) f5));
                double d6 = dArr[0];
                float[] fArrKN = filter.KN();
                Intrinsics.checkNotNull(fArrKN);
                dArr[0] = d6 + (((double) fArrKN[iNr]) * d5);
                double d7 = dArr[1];
                float[] fArrKN2 = filter.KN();
                Intrinsics.checkNotNull(fArrKN2);
                dArr[1] = d7 + (((double) fArrKN2[iNr + 1]) * d5);
                double d8 = dArr[2];
                float[] fArrKN3 = filter.KN();
                Intrinsics.checkNotNull(fArrKN3);
                dArr[2] = d8 + (((double) fArrKN3[iNr + 2]) * d5);
                double d9 = dArr[3];
                float[] fArrKN4 = filter.KN();
                Intrinsics.checkNotNull(fArrKN4);
                dArr[3] = d9 + (((double) fArrKN4[iNr + 3]) * d5);
                double d10 = dArr[4];
                float[] fArrKN5 = filter.KN();
                Intrinsics.checkNotNull(fArrKN5);
                dArr[4] = d10 + (((double) fArrKN5[iNr + 4]) * d5);
                double d11 = dArr[5];
                float[] fArrKN6 = filter.KN();
                Intrinsics.checkNotNull(fArrKN6);
                dArr[5] = d11 + (d5 * ((double) fArrKN6[iNr + 5]));
            } else {
                c2 = 3;
                c4 = 5;
                i7 = 0;
                c5 = 4;
                c6 = 2;
            }
            iXQ = XQ(Integer.valueOf(iXQ - i2));
            iNr += 6;
        } while (iXQ >= n(Integer.valueOf(i7)));
        int iXQ2 = XQ(Integer.valueOf(i2 - i3));
        int i9 = (iGh - iXQ2) / i2;
        int iXQ3 = XQ(Integer.valueOf(iXQ2 + (i9 * i2)));
        int iNr2 = filter.nr() + (filter.xMQ() * (i9 + 1));
        do {
            double dXMQ2 = xMQ(iXQ3);
            int iMUb2 = mUb(iXQ3);
            float[] fArrGh4 = filter.gh();
            Intrinsics.checkNotNull(fArrGh4);
            double d12 = fArrGh4[iMUb2];
            float[] fArrGh5 = filter.gh();
            Intrinsics.checkNotNull(fArrGh5);
            float f6 = fArrGh5[iMUb2 + 1];
            float[] fArrGh6 = filter.gh();
            Intrinsics.checkNotNull(fArrGh6);
            double d13 = d12 + (dXMQ2 * ((double) (f6 - fArrGh6[iMUb2])));
            double d14 = dArr2[i7];
            float[] fArrKN7 = filter.KN();
            Intrinsics.checkNotNull(fArrKN7);
            dArr2[i7] = d14 + (((double) fArrKN7[iNr2]) * d13);
            double d15 = dArr2[1];
            float[] fArrKN8 = filter.KN();
            Intrinsics.checkNotNull(fArrKN8);
            dArr2[1] = d15 + (((double) fArrKN8[iNr2 + 1]) * d13);
            double d16 = dArr2[c6];
            float[] fArrKN9 = filter.KN();
            Intrinsics.checkNotNull(fArrKN9);
            dArr2[c6] = d16 + (((double) fArrKN9[iNr2 + 2]) * d13);
            double d17 = dArr2[c2];
            float[] fArrKN10 = filter.KN();
            Intrinsics.checkNotNull(fArrKN10);
            dArr2[c2] = d17 + (((double) fArrKN10[iNr2 + 3]) * d13);
            double d18 = dArr2[c5];
            float[] fArrKN11 = filter.KN();
            Intrinsics.checkNotNull(fArrKN11);
            dArr2[c5] = d18 + (((double) fArrKN11[iNr2 + 4]) * d13);
            double d19 = dArr2[c4];
            float[] fArrKN12 = filter.KN();
            Intrinsics.checkNotNull(fArrKN12);
            dArr2[c4] = d19 + (d13 * ((double) fArrKN12[iNr2 + 5]));
            iXQ3 = XQ(Integer.valueOf(iXQ3 - i2));
            iNr2 -= 6;
        } while (iXQ3 > n(Integer.valueOf(i7)));
        output[i5] = (float) ((dArr[i7] + dArr2[i7]) * d2);
        output[i5 + 1] = (float) ((dArr[1] + dArr2[1]) * d2);
        output[i5 + 2] = (float) ((dArr[c6] + dArr2[c6]) * d2);
        output[i5 + 3] = (float) ((dArr[c2] + dArr2[c2]) * d2);
        output[i5 + 4] = (float) ((dArr[c5] + dArr2[c5]) * d2);
        output[i5 + 5] = (float) (d2 * (dArr[c4] + dArr2[c4]));
    }

    public static final void t(Mgn.aC filter, int i2, int i3, int i5, double d2, float[] output, long j2) {
        double[] dArr;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(output, "output");
        double[] dArrHI = filter.HI();
        double[] dArrR = filter.r();
        int iGh = gh(filter.mUb());
        int i7 = (iGh - i3) / i2;
        int iXQ = XQ(Integer.valueOf(i3 + (i7 * i2)));
        int iNr = filter.nr() - (i7 * i5);
        ArraysKt.fill(dArrHI, 0.0d, 0, i5);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
        }
        int i8 = -i2;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(iXQ, 0, i8);
        if (progressionLastElement <= iXQ) {
            while (true) {
                double dXMQ = xMQ(iXQ);
                int iMUb = mUb(iXQ);
                float[] fArrGh = filter.gh();
                Intrinsics.checkNotNull(fArrGh);
                double d4 = fArrGh[iMUb];
                float[] fArrGh2 = filter.gh();
                Intrinsics.checkNotNull(fArrGh2);
                float f3 = fArrGh2[iMUb + 1];
                float[] fArrGh3 = filter.gh();
                Intrinsics.checkNotNull(fArrGh3);
                float f4 = f3 - fArrGh3[iMUb];
                dArr = dArrHI;
                double d5 = d4 + (dXMQ * ((double) f4));
                if (iNr >= 0) {
                    int i9 = 0;
                    while (i9 < i5) {
                        double d6 = dArr[i9];
                        float[] fArrKN = filter.KN();
                        Intrinsics.checkNotNull(fArrKN);
                        int i10 = i9;
                        dArr[i10] = d6 + (((double) fArrKN[iNr + i9]) * d5);
                        i9 = i10 + 1;
                    }
                }
                iNr += i5;
                if (iXQ == progressionLastElement) {
                    break;
                }
                iXQ += i8;
                dArrHI = dArr;
            }
        } else {
            dArr = dArrHI;
        }
        int iXQ2 = XQ(Integer.valueOf(i2 - i3));
        int i11 = (iGh - iXQ2) / i2;
        int iXQ3 = XQ(Integer.valueOf(iXQ2 + (i11 * i2)));
        int iNr2 = filter.nr() + ((i11 + 1) * i5);
        ArraysKt.fill(dArrR, 0.0d, 0, i5);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i2 + ".");
        }
        int progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(iXQ3, 1, i8);
        if (progressionLastElement2 <= iXQ3) {
            while (true) {
                double dXMQ2 = xMQ(iXQ3);
                int iMUb2 = mUb(iXQ3);
                float[] fArrGh4 = filter.gh();
                Intrinsics.checkNotNull(fArrGh4);
                double d7 = fArrGh4[iMUb2];
                float[] fArrGh5 = filter.gh();
                Intrinsics.checkNotNull(fArrGh5);
                float f5 = fArrGh5[iMUb2 + 1];
                float[] fArrGh6 = filter.gh();
                Intrinsics.checkNotNull(fArrGh6);
                double d8 = d7 + (dXMQ2 * ((double) (f5 - fArrGh6[iMUb2])));
                for (int i12 = 0; i12 < i5; i12++) {
                    double d9 = dArrR[i12];
                    float[] fArrKN2 = filter.KN();
                    Intrinsics.checkNotNull(fArrKN2);
                    dArrR[i12] = d9 + (((double) fArrKN2[iNr2 + i12]) * d8);
                }
                iNr2 -= i5;
                if (iXQ3 == progressionLastElement2) {
                    break;
                } else {
                    iXQ3 += i8;
                }
            }
        }
        for (int i13 = 0; i13 < i5; i13++) {
            output[((int) j2) + i13] = (float) ((dArr[i13] + dArrR[i13]) * d2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ty(QJ psrc, eO data) throws SRC_ERR_BAD_INTERNAL_STATE, SRC_ERR_SINC_PREPARE_DATA_BAD_LEN, SRC_ERR_NO_PRIVATE {
        long j2;
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(data, "data");
        if (psrc.J2() == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        Mgn.CN3 cn3J2 = psrc.J2();
        Mgn.aC aCVar = cn3J2 instanceof Mgn.aC ? (Mgn.aC) cn3J2 : null;
        if (aCVar == null) {
            throw new SRC_ERR_NO_PRIVATE();
        }
        aCVar.g(data.J2() * ((long) aCVar.xMQ()));
        aCVar.E2(data.KN() * ((long) aCVar.xMQ()));
        long j3 = 0;
        aCVar.te(0L);
        aCVar.e(0L);
        double dNr = psrc.nr();
        if (Mgn.Wre.nr(dNr)) {
            throw new SRC_ERR_BAD_INTERNAL_STATE();
        }
        double dMUb = (((double) aCVar.mUb()) + 2.0d) / ((double) aCVar.ty());
        double d2 = 1.0d;
        if (Math.min(psrc.nr(), data.mUb()) < 1.0d) {
            dMUb /= Math.min(psrc.nr(), data.mUb());
        }
        int iXMQ = aCVar.xMQ() * (Mgn.Wre.O(dMUb) + 1);
        double dT = psrc.t();
        aCVar.ty();
        double dT2 = Mgn.Wre.t(dT);
        aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(dT - dT2))) % aCVar.J2());
        double d4 = 1.0E-20d + (1.0d / dNr);
        while (aCVar.Ik() < aCVar.ck()) {
            if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                qie(aCVar, data, iXMQ);
                if (((aCVar.O() - aCVar.nr()) + aCVar.J2()) % aCVar.J2() <= iXMQ) {
                    break;
                }
                if (aCVar.Uo() >= 0) {
                    j2 = j3;
                    if (((double) aCVar.nr()) + dT2 + d4 >= aCVar.Uo()) {
                        break;
                    }
                } else {
                    j2 = j3;
                }
                if (aCVar.ck() > j2 && Math.abs(psrc.nr() - data.mUb()) > 1.0E-10d) {
                    dNr = psrc.nr() + ((aCVar.Ik() * (data.mUb() - psrc.nr())) / aCVar.ck());
                }
                double d5 = dNr;
                double dTy = ((double) aCVar.ty()) * (d5 < d2 ? d5 : d2);
                int iUo = Uo(dTy);
                int iUo2 = Uo(dT2 * dTy);
                double d6 = d2;
                double dTy2 = dTy / ((double) aCVar.ty());
                double d7 = dT2;
                float[] fArrT = data.t();
                Intrinsics.checkNotNull(fArrT);
                Mgn.aC aCVar2 = aCVar;
                aCVar = aCVar2;
                rl(aCVar, iUo, iUo2, dTy2, fArrT, ((int) aCVar2.Ik()) + data.nr());
                aCVar.e(aCVar.Ik() + ((long) 6));
                double d8 = d7 + (d6 / d5);
                double dT3 = Mgn.Wre.t(d8);
                aCVar.o((aCVar.nr() + (aCVar.xMQ() * Mgn.Wre.O(d8 - dT3))) % aCVar.J2());
                dT2 = dT3;
                dNr = d5;
                j3 = j2;
                d2 = d6;
                iXMQ = iXMQ;
            }
        }
        psrc.qie(dT2);
        psrc.az(dNr);
        data.HI(aCVar.az() / ((long) aCVar.xMQ()));
        data.Ik(aCVar.Ik() / ((long) aCVar.xMQ()));
    }

    public static final int gh(int i2) {
        return XQ(Integer.valueOf(i2)) << 12;
    }

    public static final double xMQ(int i2) {
        return ((double) KN(i2)) * Mgn.Dsr.f6617n.rl();
    }
}
