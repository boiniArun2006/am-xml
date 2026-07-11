package Q6;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7918n;
    private final d2n.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final as.CN3 f7919t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.f7918n, dsr.f7918n) && Intrinsics.areEqual(this.rl, dsr.rl) && Intrinsics.areEqual(this.f7919t, dsr.f7919t);
    }

    public Dsr(List instructions, d2n.Wre timeRange, as.CN3 outputStreamProperties) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(outputStreamProperties, "outputStreamProperties");
        this.f7918n = instructions;
        this.rl = timeRange;
        this.f7919t = outputStreamProperties;
        Iterator it = instructions.iterator();
        while (it.hasNext()) {
            aC aCVar = (aC) it.next();
            if (!d2n.CN3.rl(this.rl, aCVar.rl())) {
                throw new IllegalArgumentException(("The timeRange (" + this.rl + ") must contain the rangeInComposition of each instruction. Found instruction " + aCVar + " with range " + aCVar.rl() + " that is not contained by the time range of the command.").toString());
            }
        }
    }

    public int hashCode() {
        return (((this.f7918n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f7919t.hashCode();
    }

    public final List n() {
        return this.f7918n;
    }

    public final as.CN3 rl() {
        return this.f7919t;
    }

    public final d2n.Wre t() {
        return this.rl;
    }

    public String toString() {
        return "SoundCommand(instructions=" + this.f7918n + ", timeRange=" + this.rl + ", outputStreamProperties=" + this.f7919t + ')';
    }
}
