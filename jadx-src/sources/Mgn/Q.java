package Mgn;

import com.libsamplerate_kotlin.SRC_ERR_BAD_CHANNEL_COUNT;
import com.libsamplerate_kotlin.SRC_ERR_BAD_CONVERTER;
import com.libsamplerate_kotlin.SRC_ERR_BAD_DATA_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_MODE;
import com.libsamplerate_kotlin.SRC_ERR_BAD_PROC_PTR;
import com.libsamplerate_kotlin.SRC_ERR_BAD_SRC_RATIO;
import com.libsamplerate_kotlin.SRC_ERR_BAD_STATE;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Q {
    public static final void n(QJ psrc, o converter_type) throws SRC_ERR_BAD_CONVERTER {
        Intrinsics.checkNotNullParameter(psrc, "psrc");
        Intrinsics.checkNotNullParameter(converter_type, "converter_type");
        try {
            try {
                qz.o(psrc, converter_type);
            } catch (Exception unused) {
                Xo.t(psrc, converter_type);
            }
        } catch (Exception unused2) {
            C.t(psrc, converter_type);
        }
    }

    public static final void nr(l3D state) throws SRC_ERR_BAD_STATE {
        Intrinsics.checkNotNullParameter(state, "state");
        QJ qj = state instanceof QJ ? (QJ) state : null;
        if (qj == null) {
            throw new SRC_ERR_BAD_STATE();
        }
        Function1 function1Uo = qj.Uo();
        if (function1Uo != null) {
            function1Uo.invoke(qj);
        }
        qj.qie(0.0d);
        qj.az(0.0d);
        qj.Ik(null);
        qj.r(0);
        qj.o(0L);
    }

    public static final l3D rl(o converter_type, int i2) throws SRC_ERR_BAD_STATE, SRC_ERR_BAD_CHANNEL_COUNT, SRC_ERR_BAD_CONVERTER {
        Intrinsics.checkNotNullParameter(converter_type, "converter_type");
        QJ qj = new QJ(0.0d, 0.0d, null, 0, null, null, null, null, null, null, null, null, 0L, null, 0, null, 65535, null);
        if (i2 < 1) {
            throw new SRC_ERR_BAD_CHANNEL_COUNT();
        }
        qj.xMQ(i2);
        qj.ty(EnumC1413c.J2);
        n(qj, converter_type);
        nr(qj);
        return qj;
    }

    public static final void t(l3D state, eO data) throws SRC_ERR_BAD_SRC_RATIO, SRC_ERR_BAD_PROC_PTR, SRC_ERR_BAD_STATE, SRC_ERR_BAD_MODE, SRC_ERR_BAD_DATA_PTR {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
        QJ qj = state instanceof QJ ? (QJ) state : null;
        if (qj == null) {
            throw new SRC_ERR_BAD_STATE();
        }
        if (qj.KN() == null || qj.rl() == null) {
            throw new SRC_ERR_BAD_PROC_PTR();
        }
        if (qj.O() != EnumC1413c.J2) {
            throw new SRC_ERR_BAD_MODE();
        }
        if (data.n() == null || data.t() == null) {
            throw new SRC_ERR_BAD_DATA_PTR();
        }
        if (Wre.nr(data.mUb())) {
            throw new SRC_ERR_BAD_SRC_RATIO();
        }
        if (data.J2() < 0) {
            data.ty(0L);
        }
        if (data.KN() < 0) {
            data.ck(0L);
        }
        data.HI(0L);
        data.Ik(0L);
        if (qj.nr() < 0.00390625d) {
            qj.az(data.mUb());
        }
        if (Math.abs(qj.nr() - data.mUb()) < 1.0E-15d) {
            Function2 function2Rl = qj.rl();
            if (function2Rl != null) {
                function2Rl.invoke(qj, data);
                return;
            }
            return;
        }
        Function2 function2KN = qj.KN();
        if (function2KN != null) {
            function2KN.invoke(qj, data);
        }
    }
}
