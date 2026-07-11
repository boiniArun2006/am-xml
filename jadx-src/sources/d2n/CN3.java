package d2n;

import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class CN3 {

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ long f63368n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f63369t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j2, Wre wre) {
            super(1);
            this.f63368n = j2;
            this.f63369t = wre;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Wre invoke(Wre previousSlice) {
            Intrinsics.checkNotNullParameter(previousSlice, "previousSlice");
            return CN3.J2(Wre.nr.t(previousSlice.nr(), this.f63368n), this.f63369t);
        }
    }

    public static final Wre J2(Wre wre, Wre other) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Uo(wre, other)) {
            return new Wre(((Ml) ComparisonsKt.maxOf(Ml.rl(wre.O()), Ml.rl(other.O()))).Ik(), ((Ml) ComparisonsKt.minOf(Ml.rl(wre.nr()), Ml.rl(other.nr()))).Ik(), null);
        }
        return null;
    }

    public static final Wre KN(Wre leftTrimmedAt, long j2) {
        Intrinsics.checkNotNullParameter(leftTrimmedAt, "$this$leftTrimmedAt");
        if (Ml.nr(j2, leftTrimmedAt.nr()) < 0) {
            return Wre.rl(leftTrimmedAt, ((Ml) ComparisonsKt.maxOf(Ml.rl(j2), Ml.rl(leftTrimmedAt.O()))).Ik(), 0L, 2, null);
        }
        return null;
    }

    public static final long O(Wre wre, float f3) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return Ml.HI(wre.O(), d2n.j.XQ(wre.t(), f3));
    }

    public static final boolean Uo(Wre wre, Wre other) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Ml.nr(wre.O(), other.nr()) < 0 && Ml.nr(wre.nr(), other.O()) > 0;
    }

    public static final Sequence n(Wre chunkSequence, long j2) {
        Intrinsics.checkNotNullParameter(chunkSequence, "$this$chunkSequence");
        return SequencesKt.generateSequence(J2(Wre.nr.t(chunkSequence.O(), j2), chunkSequence), new j(j2, chunkSequence));
    }

    public static final boolean nr(Wre contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return t(contains, j2, d2n.j.f63374t.J2());
    }

    public static final boolean rl(Wre wre, Wre range) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return nr(wre, range.O()) && nr(wre, I28.t(range.nr()));
    }

    public static final boolean t(Wre contains, long j2, long j3) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        w6.n(j3, "tolerance");
        return Ml.nr(j2, Ml.ty(contains.O(), j3)) >= 0 && Ml.nr(j2, Ml.HI(contains.nr(), j3)) < 0;
    }

    public static final float xMQ(Wre progressAt, long j2) {
        Intrinsics.checkNotNullParameter(progressAt, "$this$progressAt");
        if (j2 < progressAt.O()) {
            return 0.0f;
        }
        if (j2 >= progressAt.nr()) {
            return 1.0f;
        }
        return (j2 - progressAt.O()) / (progressAt.nr() - progressAt.O());
    }
}
