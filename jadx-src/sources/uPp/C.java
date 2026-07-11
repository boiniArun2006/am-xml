package uPp;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C extends t2.fuX implements o, j {
    private final Throwable rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && Intrinsics.areEqual(this.rl, ((C) obj).rl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.rl = cause;
    }

    public int hashCode() {
        return this.rl.hashCode();
    }
}
