package io.grpc;

import io.grpc.SPz;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {
    public static SPz n(JP.Xo xo) {
        t1.Xo.ck(xo, "context must not be null");
        if (!xo.KN()) {
            return null;
        }
        Throwable thT = xo.t();
        if (thT == null) {
            return SPz.J2.Ik("io.grpc.Context was cancelled without error");
        }
        if (thT instanceof TimeoutException) {
            return SPz.xMQ.Ik(thT.getMessage()).ck(thT);
        }
        SPz sPzGh = SPz.gh(thT);
        return (SPz.n.UNKNOWN.equals(sPzGh.az()) && sPzGh.qie() == thT) ? SPz.J2.Ik("Context cancelled").ck(thT) : sPzGh.ck(thT);
    }
}
