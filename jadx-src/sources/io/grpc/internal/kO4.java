package io.grpc.internal;

import io.grpc.AbstractC2170c;
import io.grpc.Pl;
import io.grpc.internal.pq;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class kO4 extends io.grpc.Xo {
    static boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f68624t = 0;

    @Override // io.grpc.Xo
    public boolean nr() {
        return true;
    }

    @Override // io.grpc.Xo
    public int t() {
        return 5;
    }

    static {
        rl = !t1.s4.rl(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // io.grpc.Xo
    public AbstractC2170c.n O(Map map) {
        try {
            return AbstractC2170c.n.n(new pq.w6(mz.nr(map, "shuffleAddressList")));
        } catch (RuntimeException e2) {
            return AbstractC2170c.n.rl(io.grpc.SPz.f68186Z.ck(e2).Ik("Failed parsing configuration for " + rl()));
        }
    }

    @Override // io.grpc.Pl.w6
    public io.grpc.Pl n(Pl.I28 i28) {
        return rl ? new R6(i28) : new pq(i28);
    }

    @Override // io.grpc.Xo
    public String rl() {
        return "pick_first";
    }
}
