package w9;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f74800n;
    private final int rl;

    public /* synthetic */ I28(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Ml.KN(this.f74800n, i28.f74800n) && Ml.KN(this.rl, i28.rl);
    }

    private I28(int i2, int i3) {
        this.f74800n = i2;
        this.rl = i3;
        if (Ml.nr(i2, i3) < 0) {
            return;
        }
        throw new IllegalArgumentException(("Start index " + ((Object) Ml.az(i2)) + " must be smaller than end index " + ((Object) Ml.az(i3))).toString());
    }

    public int hashCode() {
        return (Ml.xMQ(this.f74800n) * 31) + Ml.xMQ(this.rl);
    }

    public final int n() {
        return this.rl;
    }

    public final int rl() {
        return this.f74800n;
    }

    public String toString() {
        return "ByteIndexRange(startIndex=" + ((Object) Ml.az(this.f74800n)) + ", endIndex=" + ((Object) Ml.az(this.rl)) + ')';
    }
}
