package androidx.compose.runtime;

import TFv.Wre;
import TFv.fuX;
import TFv.rv6;
import androidx.collection.MutableScatterSet;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LTFv/rv6;", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/State;", "t", "(LTFv/rv6;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "R", "LTFv/Wre;", "initial", "rl", "(LTFv/Wre;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "block", "O", "(Lkotlin/jvm/functions/Function0;)LTFv/Wre;", "Landroidx/collection/MutableScatterSet;", "", "", "set", "", "nr", "(Landroidx/collection/MutableScatterSet;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,179:1\n1247#2,6:180\n256#3,2:186\n231#3,3:188\n200#3,7:191\n211#3,3:199\n214#3,9:203\n234#3:212\n258#3:213\n1399#4:198\n1270#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n65#1:180,6\n178#1:186,2\n178#1:188,3\n178#1:191,7\n178#1:199,3\n178#1:203,9\n178#1:212\n178#1:213\n178#1:198\n178#1:202\n*E\n"})
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final Wre O(Function0 function0) {
        return fuX.iF(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean nr(MutableScatterSet mutableScatterSet, Set set) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128 && set.contains(objArr[(i2 << 3) + i5])) {
                            return true;
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public static final State rl(Wre wre, Object obj, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.v()) {
            ComposerKt.p5(-606625098, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean zE2 = composer.E2(coroutineContext2) | composer.E2(wre);
        Object objIF = composer.iF();
        if (zE2 || objIF == Composer.INSTANCE.n()) {
            objIF = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(coroutineContext2, wre, null);
            composer.o(objIF);
        }
        State stateQie = SnapshotStateKt.qie(obj, wre, coroutineContext2, (Function2) objIF, composer, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 896));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateQie;
    }

    public static final State t(rv6 rv6Var, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1439883919, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        State stateN = SnapshotStateKt.n(rv6Var, rv6Var.getValue(), coroutineContext2, composer, (i2 & 14) | ((i2 << 3) & 896), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateN;
    }
}
