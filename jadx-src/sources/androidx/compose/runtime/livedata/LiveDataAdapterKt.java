package androidx.compose.runtime.livedata;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.view.LifecycleOwner;
import androidx.view.LiveData;
import androidx.view.compose.LocalLifecycleOwnerKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/LiveData;", "Landroidx/compose/runtime/State;", c.f62177j, "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "R", "initial", "rl", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime-livedata_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,70:1\n75#2:71\n1247#3,6:72\n1247#3,6:78\n*S KotlinDebug\n*F\n+ 1 LiveDataAdapter.kt\nandroidx/compose/runtime/livedata/LiveDataAdapterKt\n*L\n58#1:71\n59#1:72,6\n63#1:78,6\n*E\n"})
public final class LiveDataAdapterKt {
    public static final State n(LiveData liveData, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-2027206144, i2, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:39)");
        }
        State stateRl = rl(liveData, liveData.J2(), composer, i2 & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateRl;
    }

    public static final State rl(LiveData liveData, Object obj, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(411178300, i2, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:56)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.ty(LocalLifecycleOwnerKt.t());
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            if (liveData.xMQ()) {
                obj = liveData.J2();
            }
            objIF = SnapshotStateKt__SnapshotStateKt.O(obj, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        boolean zE2 = composer.E2(liveData) | composer.E2(lifecycleOwner);
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == companion.n()) {
            objIF2 = new LiveDataAdapterKt$observeAsState$1$1(liveData, lifecycleOwner, mutableState);
            composer.o(objIF2);
        }
        EffectsKt.n(liveData, lifecycleOwner, (Function1) objIF2, composer, i2 & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableState;
    }
}
