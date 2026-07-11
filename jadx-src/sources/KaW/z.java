package KaW;

import io.grpc.internal.IG;
import io.grpc.internal.N;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class z implements IG {
    @Override // io.grpc.internal.IG
    public N n(int i2) {
        return new eO(new Buffer(), Math.min(1048576, Math.max(4096, i2)));
    }

    z() {
    }
}
