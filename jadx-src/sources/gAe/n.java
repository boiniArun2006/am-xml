package gAe;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import uBO.C2401c;
import uBO.Z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InputStream f67157n;

    public static eO rl(byte[] bArr) {
        return new n(new ByteArrayInputStream(bArr));
    }

    @Override // gAe.eO
    public C2401c n() throws IOException {
        try {
            return C2401c.M7(this.f67157n, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        } finally {
            this.f67157n.close();
        }
    }

    @Override // gAe.eO
    public Z read() throws IOException {
        try {
            return Z.FX(this.f67157n, com.google.crypto.tink.shaded.protobuf.Xo.rl());
        } finally {
            this.f67157n.close();
        }
    }

    private n(InputStream inputStream) {
        this.f67157n = inputStream;
    }
}
