package d2n;

import d2n.Ml;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f63372n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f63373t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final Wre n(long j2, long j3) {
            Ml.j jVar = Ml.f63370t;
            return new Wre(jVar.rl(j2), jVar.rl(j3), null);
        }

        public final Wre rl(long j2, long j3) {
            Ml.j jVar = Ml.f63370t;
            return new Wre(jVar.t(j2), jVar.t(j3), null);
        }

        public final Wre t(long j2, long j3) {
            return new Wre(j2, Ml.HI(j2, j3), null);
        }
    }

    public /* synthetic */ Wre(long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Ml.KN(this.f63372n, wre.f63372n) && Ml.KN(this.rl, wre.rl);
    }

    private Wre(long j2, long j3) {
        this.f63372n = j2;
        this.rl = j3;
        if (Ml.nr(j2, j3) < 0) {
            this.f63373t = Ml.az(j3, j2);
            return;
        }
        throw new IllegalArgumentException(("Start time (" + ((Object) Ml.ck(j2)) + ") must be less than end time (" + ((Object) Ml.ck(j3)) + ").").toString());
    }

    public static /* synthetic */ Wre rl(Wre wre, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = wre.f63372n;
        }
        if ((i2 & 2) != 0) {
            j3 = wre.rl;
        }
        return wre.n(j2, j3);
    }

    public final List J2(Wre other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Ml.nr(other.f63372n, this.f63372n) <= 0 ? Ml.nr(other.rl, this.rl) >= 0 ? CollectionsKt.emptyList() : Ml.nr(other.rl, this.f63372n) <= 0 ? CollectionsKt.listOf(this) : CollectionsKt.listOf(new Wre(other.rl, this.rl, null)) : Ml.nr(other.f63372n, this.rl) >= 0 ? CollectionsKt.listOf(this) : Ml.nr(other.rl, this.rl) >= 0 ? CollectionsKt.listOf(new Wre(this.f63372n, other.f63372n, null)) : CollectionsKt.listOf((Object[]) new Wre[]{new Wre(this.f63372n, other.f63372n, null), new Wre(other.rl, this.rl, null)});
    }

    public final long O() {
        return this.f63372n;
    }

    public int hashCode() {
        return (Ml.qie(this.f63372n) * 31) + Ml.qie(this.rl);
    }

    public final Wre n(long j2, long j3) {
        return new Wre(j2, j3, null);
    }

    public final long nr() {
        return this.rl;
    }

    public final long t() {
        return this.f63373t;
    }

    public String toString() {
        return "TimeRange(start=" + ((Object) Ml.ck(this.f63372n)) + ", end=" + ((Object) Ml.ck(this.rl)) + ')';
    }
}
