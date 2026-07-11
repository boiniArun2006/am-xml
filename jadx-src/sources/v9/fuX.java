package v9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class fuX {
    public static final Sequence n(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence sequenceZipWithNext = SequencesKt.zipWithNext(SequencesKt.plus((Sequence<? extends Object>) sequence, (Object) null));
        Intrinsics.checkNotNull(sequenceZipWithNext, "null cannot be cast to non-null type kotlin.sequences.Sequence<kotlin.Pair<T of com.bendingspoons.fellini.utils.extensions.SequenceExtensionsKt.zipWithNextIncludingEnd, T of com.bendingspoons.fellini.utils.extensions.SequenceExtensionsKt.zipWithNextIncludingEnd?>>");
        return sequenceZipWithNext;
    }
}
