package GP;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 implements Wre {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final short[] f3534O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f3535n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f3536t;

    public CN3(n backing, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f3535n = backing;
        this.rl = i2;
        this.f3536t = i3;
        this.nr = z2;
        this.f3534O = new short[i2];
    }

    private final void n() {
        if (this.J2) {
            return;
        }
        int i2 = 0;
        while (i2 < this.rl && this.f3535n.hasNext()) {
            this.f3534O[i2] = this.f3535n.next();
            i2++;
        }
        if (i2 >= this.rl) {
            this.J2 = true;
        }
    }

    @Override // GP.Wre
    public boolean hasNext() {
        n();
        return this.J2;
    }

    @Override // GP.Wre
    public short[] next() {
        n();
        if (this.J2) {
            this.J2 = false;
            return this.f3534O;
        }
        throw new NoSuchElementException();
    }
}
