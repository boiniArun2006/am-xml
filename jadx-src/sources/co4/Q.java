package co4;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Q {
    public static final UGc n(List predicates) {
        Intrinsics.checkNotNullParameter(predicates, "predicates");
        return predicates.isEmpty() ? g9s.f43865n : predicates.size() == 1 ? (UGc) CollectionsKt.single(predicates) : new Dsr(predicates);
    }
}
