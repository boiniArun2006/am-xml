package GP;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final short[] f3539n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f3540t;

    public w6(short[] backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f3539n = backing;
        this.rl = backing.length;
    }

    @Override // GP.n
    public boolean hasNext() {
        return this.f3540t < this.rl;
    }

    @Override // GP.n
    public short next() {
        int i2 = this.f3540t;
        if (i2 >= this.rl) {
            throw new NoSuchElementException();
        }
        short[] sArr = this.f3539n;
        this.f3540t = i2 + 1;
        return sArr[i2];
    }
}
