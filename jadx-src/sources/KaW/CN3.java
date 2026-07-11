package KaW;

import io.grpc.ManagedChannelProvider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends ManagedChannelProvider {
    @Override // io.grpc.ManagedChannelProvider
    public boolean rl() {
        return true;
    }

    @Override // io.grpc.ManagedChannelProvider
    public int t() {
        return io.grpc.o.n(CN3.class.getClassLoader()) ? 8 : 3;
    }

    @Override // io.grpc.ManagedChannelProvider
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public Wre n(String str) {
        return Wre.KN(str);
    }
}
