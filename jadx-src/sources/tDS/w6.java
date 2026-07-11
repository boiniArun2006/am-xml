package tDS;

import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import ep.oxM.esLNYym;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import tDS.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 implements raJ.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f73447n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f73448n = new j();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof j.C1179j);
        }
    }

    public w6(List list) {
        Intrinsics.checkNotNullParameter(list, esLNYym.jwfqu);
        this.f73447n = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tDS.j nr(CompleteDebugEvent completeDebugEvent, boolean z2, boolean z3, List list, ifA.j rule) {
        Intrinsics.checkNotNullParameter(rule, "rule");
        return Ml.rl(rule, completeDebugEvent, z2, z3, list);
    }

    @Override // raJ.j
    public List n(List debugEvents) {
        Intrinsics.checkNotNullParameter(debugEvents, "debugEvents");
        ArrayList arrayList = new ArrayList();
        for (Object obj : debugEvents) {
            if (t((CompleteDebugEvent) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean t(final CompleteDebugEvent completeDebugEvent) {
        final boolean zIsSpoonerEvent = completeDebugEvent.isSpoonerEvent();
        final boolean zIsPremiumUserEvent = completeDebugEvent.isPremiumUserEvent();
        final List<String> userExperiments = completeDebugEvent.getUserExperiments();
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence(this.f73447n), new Function1() { // from class: tDS.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w6.nr(completeDebugEvent, zIsSpoonerEvent, zIsPremiumUserEvent, userExperiments, (ifA.j) obj);
            }
        }), j.f73448n);
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        j.C1179j c1179j = (j.C1179j) SequencesKt.firstOrNull(sequenceFilter);
        if (c1179j != null) {
            return c1179j.n();
        }
        return true;
    }
}
