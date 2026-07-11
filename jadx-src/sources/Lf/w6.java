package Lf;

import Be4.P;
import Lf.Dsr;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.Buffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f6176n;
    private final FjR.C rl;

    public static final class j implements Dsr.j {
        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(ByteBuffer byteBuffer, FjR.C c2, eQ.fuX fux) {
            return new w6(byteBuffer, c2);
        }
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        try {
            Buffer buffer = new Buffer();
            buffer.write(this.f6176n);
            this.f6176n.position(0);
            return new qz(P.O(buffer, this.rl.Uo()), null, Be4.CN3.f520t);
        } catch (Throwable th) {
            this.f6176n.position(0);
            throw th;
        }
    }

    public w6(ByteBuffer byteBuffer, FjR.C c2) {
        this.f6176n = byteBuffer;
        this.rl = c2;
    }
}
