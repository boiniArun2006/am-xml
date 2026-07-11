package androidx.compose.runtime;

import TFv.Wre;
import TFv.rv6;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SnapshotStateKt {
    public static final SnapshotMutationPolicy HI() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.rl();
    }

    public static final Wre Ik(Function0 function0) {
        return SnapshotStateKt__SnapshotFlowKt.O(function0);
    }

    public static final SnapshotStateList J2() {
        return SnapshotStateKt__SnapshotStateKt.n();
    }

    public static final SnapshotStateMap KN() {
        return SnapshotStateKt__SnapshotStateKt.t();
    }

    public static final State O(Function0 function0) {
        return SnapshotStateKt__DerivedStateKt.nr(function0);
    }

    public static final SnapshotStateList Uo(Object... objArr) {
        return SnapshotStateKt__SnapshotStateKt.rl(objArr);
    }

    public static final State az(Object obj, Function2 function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.rl(obj, function2, composer, i2);
    }

    public static final State ck(Object obj, Composer composer, int i2) {
        return SnapshotStateKt__SnapshotStateKt.J2(obj, composer, i2);
    }

    public static final SnapshotMutationPolicy gh() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.n();
    }

    public static final State n(Wre wre, Object obj, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.rl(wre, obj, coroutineContext, composer, i2, i3);
    }

    public static final State nr(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        return SnapshotStateKt__DerivedStateKt.t(snapshotMutationPolicy, function0);
    }

    public static final State qie(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.n(obj, obj2, obj3, function2, composer, i2);
    }

    public static final SnapshotMutationPolicy r() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.t();
    }

    public static final State rl(rv6 rv6Var, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.t(rv6Var, coroutineContext, composer, i2, i3);
    }

    public static final MutableVector t() {
        return SnapshotStateKt__DerivedStateKt.rl();
    }

    public static final State ty(Object obj, Object[] objArr, Function2 function2, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.t(obj, objArr, function2, composer, i2);
    }

    public static final MutableState xMQ(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.nr(obj, snapshotMutationPolicy);
    }
}
