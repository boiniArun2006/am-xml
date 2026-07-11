package pL6;

import io.grpc.AbstractC2170c;
import io.grpc.Pl;
import io.grpc.Xo;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C extends Xo {
    public static final /* synthetic */ int rl = 0;

    @Override // io.grpc.Xo
    public boolean nr() {
        return true;
    }

    @Override // io.grpc.Xo
    public int t() {
        return 5;
    }

    @Override // io.grpc.Xo
    public AbstractC2170c.n O(Map map) {
        return AbstractC2170c.n.n("no service config");
    }

    @Override // io.grpc.Pl.w6
    public Pl n(Pl.I28 i28) {
        return new aC(i28);
    }

    @Override // io.grpc.Xo
    public String rl() {
        return "round_robin";
    }
}
