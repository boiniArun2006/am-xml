package androidx.compose.runtime;

import android.os.Looper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"!\u0010\u0007\u001a\u00020\u00008FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", c.f62177j, "Lkotlin/Lazy;", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/ActualAndroid_androidKt")
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Lazy f30053n = LazyKt.lazy(new Function0<MonotonicFrameClock>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt__MonotonicFrameClock_androidKt$DefaultMonotonicFrameClock$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final MonotonicFrameClock invoke() {
            if (Looper.getMainLooper() != null) {
                return DefaultChoreographerFrameClock.f30149n;
            }
            return FallbackFrameClock.f30170n;
        }
    });
}
