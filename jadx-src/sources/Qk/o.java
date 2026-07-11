package Qk;

import com.alightcreative.app.motion.scene.ExportOutcome;
import com.alightcreative.app.motion.scene.ExportProgress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExportOutcome f8318n;
    private final ExportProgress rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f8319t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f8318n, oVar.f8318n) && Intrinsics.areEqual(this.rl, oVar.rl) && this.f8319t == oVar.f8319t;
    }

    public o(ExportOutcome outcome, ExportProgress completedProgress, long j2) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(completedProgress, "completedProgress");
        this.f8318n = outcome;
        this.rl = completedProgress;
        this.f8319t = j2;
    }

    public int hashCode() {
        return (((this.f8318n.hashCode() * 31) + this.rl.hashCode()) * 31) + Long.hashCode(this.f8319t);
    }

    public final ExportProgress n() {
        return this.rl;
    }

    public final long rl() {
        return this.f8319t;
    }

    public final ExportOutcome t() {
        return this.f8318n;
    }

    public String toString() {
        return "ExportResult(outcome=" + this.f8318n + ", completedProgress=" + this.rl + ", elapsedTimeMillis=" + this.f8319t + ")";
    }
}
