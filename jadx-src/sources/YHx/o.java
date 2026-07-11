package YHx;

import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadChannelCount;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadDataPointer;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadMode;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadProcPtr;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadSRCSRatio;
import com.bendingspoons.fellini.audioprocessing.resampler.libresample.SRCErrBadState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class o {
    public static final void nr(Dsr state) {
        Intrinsics.checkNotNullParameter(state, "state");
        fuX fux = state instanceof fuX ? (fuX) state : null;
        if (fux == null) {
            throw new SRCErrBadState();
        }
        Function1 function1Uo = fux.Uo();
        if (function1Uo != null) {
            function1Uo.invoke(fux);
        }
        fux.qie(0.0d);
        fux.az(0.0d);
        fux.Ik(null);
        fux.r(0);
        fux.o(0L);
    }

    public static final Dsr rl(int i2) throws SRCErrBadChannelCount {
        fuX fux = new fuX(0.0d, 0.0d, null, 0, null, null, null, null, null, null, null, null, 0L, null, 0, null, 65535, null);
        if (i2 < 1) {
            throw new SRCErrBadChannelCount();
        }
        fux.xMQ(i2);
        fux.ty(aC.SRC_MODE_PROCESS);
        n(fux);
        nr(fux);
        return fux;
    }

    public static final void t(Dsr state, I28 data) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
        fuX fux = state instanceof fuX ? (fuX) state : null;
        if (fux == null) {
            throw new SRCErrBadState();
        }
        if (fux.KN() == null || fux.rl() == null) {
            throw new SRCErrBadProcPtr();
        }
        if (fux.O() != aC.SRC_MODE_PROCESS) {
            throw new SRCErrBadMode();
        }
        if (data.n() == null || data.t() == null) {
            throw new SRCErrBadDataPointer();
        }
        if (n.t(data.xMQ())) {
            throw new SRCErrBadSRCSRatio();
        }
        if (data.O() < 0) {
            data.az(0L);
        }
        if (data.Uo() < 0) {
            data.HI(0L);
        }
        data.ty(0L);
        data.ck(0L);
        if (fux.nr() < 0.00390625d) {
            fux.az(data.xMQ());
        }
        if (Math.abs(fux.nr() - data.xMQ()) < 1.0E-15d) {
            Function2 function2Rl = fux.rl();
            if (function2Rl != null) {
                function2Rl.invoke(fux, data);
                return;
            }
            return;
        }
        Function2 function2KN = fux.KN();
        if (function2KN != null) {
            function2KN.invoke(fux, data);
        }
    }

    private static final void n(fuX fux) {
        CN3.t(fux);
    }
}
