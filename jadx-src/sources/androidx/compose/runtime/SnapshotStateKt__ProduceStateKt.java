package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001af\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "initialValue", "Lkotlin/Function2;", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "producer", "Landroidx/compose/runtime/State;", "rl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "key1", "key2", c.f62177j, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", IV8ValueMap.FUNCTION_KEYS, "t", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,204:1\n1247#2,6:205\n1247#2,6:211\n1247#2,6:217\n1247#2,6:223\n1247#2,6:229\n1247#2,6:235\n1247#2,6:241\n1247#2,6:247\n1247#2,6:253\n1247#2,6:259\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n76#1:205,6\n77#1:211,6\n106#1:217,6\n107#1:223,6\n137#1:229,6\n138#1:235,6\n169#1:241,6\n170#1:247,6\n199#1:253,6\n201#1:259,6\n*E\n"})
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final State n(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1703169085, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:135)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        boolean zE2 = composer.E2(function2);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            objIF2 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(function2, mutableState, null);
            composer.o(objIF2);
        }
        EffectsKt.nr(obj2, obj3, (Function2) objIF2, composer, (i2 >> 3) & 126);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableState;
    }

    public static final State rl(Object obj, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(10454275, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:74)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        Unit unit = Unit.INSTANCE;
        boolean zE2 = composer.E2(function2);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            objIF2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(function2, mutableState, null);
            composer.o(objIF2);
        }
        EffectsKt.O(unit, (Function2) objIF2, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableState;
    }

    public static final State t(Object obj, Object[] objArr, Function2 function2, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(490154582, i2, -1, "androidx.compose.runtime.produceState (ProduceState.kt:197)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE2 = composer.E2(function2);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            objIF2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(function2, mutableState, null);
            composer.o(objIF2);
        }
        EffectsKt.Uo(objArrCopyOf, (Function2) objIF2, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableState;
    }
}
