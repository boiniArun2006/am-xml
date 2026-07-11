package A72;

import androidx.core.util.Pools;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class n implements Pools.Pool {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f16n = new n();
    private static int rl = 16384;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ThreadLocal f17t = new j();

    @Override // androidx.core.util.Pools.Pool
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public boolean n(ByteBuffer byteBuffer) {
        return true;
    }

    class j extends ThreadLocal {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(n.rl);
        }
    }

    public static int nr() {
        return rl;
    }

    @Override // androidx.core.util.Pools.Pool
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ByteBuffer acquire() {
        return (ByteBuffer) f17t.get();
    }
}
