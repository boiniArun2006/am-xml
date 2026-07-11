package ey;

import androidx.core.net.Toe.GDEJgAYrPQHfw;
import as.Xo;
import as.o;
import as.qz;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f63927n;
    private final int nr;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f63928t;

    public /* synthetic */ fuX(ByteBuffer byteBuffer, Xo xo, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, xo, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f63927n, fux.f63927n) && Intrinsics.areEqual(this.rl, fux.rl) && qz.nr(this.f63928t, fux.f63928t) && o.t(this.nr, fux.nr);
    }

    private fuX(ByteBuffer byteBuffer, Xo xo, int i2, int i3) {
        this.f63927n = byteBuffer;
        this.rl = xo;
        this.f63928t = i2;
        this.nr = i3;
        Dsr.KN(this);
    }

    public final Xo J2() {
        return this.rl;
    }

    public final Xo O() {
        return this.rl.J2(Dsr.J2(this.f63927n, this.f63928t, this.nr));
    }

    public int hashCode() {
        return (((((this.f63927n.hashCode() * 31) + this.rl.hashCode()) * 31) + qz.O(this.f63928t)) * 31) + o.nr(this.nr);
    }

    public final ByteBuffer n() {
        return this.f63927n;
    }

    public final Xo nr() {
        return this.rl.J2(Dsr.O(this.f63927n, this.f63928t, this.nr));
    }

    public final int rl() {
        return this.nr;
    }

    public final int t() {
        return this.f63928t;
    }

    public String toString() {
        return GDEJgAYrPQHfw.bvzQpvCbvauuKVI + this.f63927n + ", startFrameIndex=" + this.rl + ", channelCount=" + ((Object) qz.J2(this.f63928t)) + ", bytesPerSample=" + ((Object) o.J2(this.nr)) + ')';
    }
}
