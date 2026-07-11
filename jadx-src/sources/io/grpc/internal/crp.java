package io.grpc.internal;

import io.grpc.AbstractC2170c;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class crp extends AbstractC2170c.Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f68467n;
    private final Dsr nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f68468t;

    @Override // io.grpc.AbstractC2170c.Wre
    public AbstractC2170c.n n(Map map) {
        Object objT;
        try {
            AbstractC2170c.n nVarJ2 = this.nr.J2(map);
            if (nVarJ2 == null) {
                objT = null;
            } else {
                if (nVarJ2.nr() != null) {
                    return AbstractC2170c.n.rl(nVarJ2.nr());
                }
                objT = nVarJ2.t();
            }
            return AbstractC2170c.n.n(Mf.rl(map, this.f68467n, this.rl, this.f68468t, objT));
        } catch (RuntimeException e2) {
            return AbstractC2170c.n.rl(io.grpc.SPz.Uo.Ik("failed to parse service config").ck(e2));
        }
    }

    public crp(boolean z2, int i2, int i3, Dsr dsr) {
        this.f68467n = z2;
        this.rl = i2;
        this.f68468t = i3;
        this.nr = (Dsr) t1.Xo.ck(dsr, "autoLoadBalancerFactory");
    }
}
