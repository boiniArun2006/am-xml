package pL6;

import io.grpc.AbstractC2170c;
import io.grpc.Pl;
import io.grpc.SPz;
import io.grpc.Xo;
import io.grpc.eO;
import io.grpc.internal.Pmq;
import io.grpc.internal.T;
import io.grpc.internal.mz;
import java.util.List;
import java.util.Map;
import pL6.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr extends Xo {
    @Override // io.grpc.Xo
    public boolean nr() {
        return true;
    }

    @Override // io.grpc.Xo
    public int t() {
        return 5;
    }

    private AbstractC2170c.n J2(Map map) {
        Long lQie = mz.qie(map, "interval");
        Long lQie2 = mz.qie(map, "baseEjectionTime");
        Long lQie3 = mz.qie(map, "maxEjectionTime");
        Integer numXMQ = mz.xMQ(map, "maxEjectionPercentage");
        fuX.CN3.j jVar = new fuX.CN3.j();
        if (lQie != null) {
            jVar.O(lQie);
        }
        if (lQie2 != null) {
            jVar.rl(lQie2);
        }
        if (lQie3 != null) {
            jVar.Uo(lQie3);
        }
        if (numXMQ != null) {
            jVar.J2(numXMQ);
        }
        Map mapMUb = mz.mUb(map, "successRateEjection");
        if (mapMUb != null) {
            fuX.CN3.w6.j jVar2 = new fuX.CN3.w6.j();
            Integer numXMQ2 = mz.xMQ(mapMUb, "stdevFactor");
            Integer numXMQ3 = mz.xMQ(mapMUb, "enforcementPercentage");
            Integer numXMQ4 = mz.xMQ(mapMUb, "minimumHosts");
            Integer numXMQ5 = mz.xMQ(mapMUb, "requestVolume");
            if (numXMQ2 != null) {
                jVar2.O(numXMQ2);
            }
            if (numXMQ3 != null) {
                jVar2.rl(numXMQ3);
            }
            if (numXMQ4 != null) {
                jVar2.t(numXMQ4);
            }
            if (numXMQ5 != null) {
                jVar2.nr(numXMQ5);
            }
            jVar.KN(jVar2.n());
        }
        Map mapMUb2 = mz.mUb(map, "failurePercentageEjection");
        if (mapMUb2 != null) {
            fuX.CN3.n.j jVar3 = new fuX.CN3.n.j();
            Integer numXMQ6 = mz.xMQ(mapMUb2, "threshold");
            Integer numXMQ7 = mz.xMQ(mapMUb2, "enforcementPercentage");
            Integer numXMQ8 = mz.xMQ(mapMUb2, "minimumHosts");
            Integer numXMQ9 = mz.xMQ(mapMUb2, "requestVolume");
            if (numXMQ6 != null) {
                jVar3.O(numXMQ6);
            }
            if (numXMQ7 != null) {
                jVar3.rl(numXMQ7);
            }
            if (numXMQ8 != null) {
                jVar3.t(numXMQ8);
            }
            if (numXMQ9 != null) {
                jVar3.nr(numXMQ9);
            }
            jVar.nr(jVar3.n());
        }
        List listG = T.g(mz.J2(map, "childPolicy"));
        if (listG == null || listG.isEmpty()) {
            return AbstractC2170c.n.rl(SPz.f68187o.Ik("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        AbstractC2170c.n nVarViF = T.ViF(listG, eO.rl());
        if (nVarViF.nr() != null) {
            return nVarViF;
        }
        jVar.t((T.n) nVarViF.t());
        return AbstractC2170c.n.n(jVar.n());
    }

    @Override // io.grpc.Pl.w6
    public Pl n(Pl.I28 i28) {
        return new fuX(i28, Pmq.f68358n);
    }

    @Override // io.grpc.Xo
    public String rl() {
        return "outlier_detection_experimental";
    }

    @Override // io.grpc.Xo
    public AbstractC2170c.n O(Map map) {
        try {
            return J2(map);
        } catch (RuntimeException e2) {
            return AbstractC2170c.n.rl(SPz.f68186Z.ck(e2).Ik("Failed parsing configuration for " + rl()));
        }
    }
}
