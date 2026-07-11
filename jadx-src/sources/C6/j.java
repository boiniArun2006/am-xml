package C6;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ByteBuffer f762n;
    private final long nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f763t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f762n, jVar.f762n) && this.rl == jVar.rl && this.f763t == jVar.f763t && this.nr == jVar.nr;
    }

    public j(ByteBuffer buffer, boolean z2, boolean z3, long j2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f762n = buffer;
        this.rl = z2;
        this.f763t = z3;
        this.nr = j2;
    }

    public int hashCode() {
        return (((((this.f762n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f763t)) * 31) + Long.hashCode(this.nr);
    }

    public final ByteBuffer n() {
        return this.f762n;
    }

    public final long nr() {
        return this.nr;
    }

    public final boolean rl() {
        return this.rl;
    }

    public final boolean t() {
        return this.f763t;
    }

    public String toString() {
        return "CodecBuffer(buffer=" + this.f762n + ", eos=" + this.rl + ", keyframe=" + this.f763t + ", presentationTimeUs=" + this.nr + ")";
    }
}
