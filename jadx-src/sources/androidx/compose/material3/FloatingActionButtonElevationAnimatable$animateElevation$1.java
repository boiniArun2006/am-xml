package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {650}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {
    final /* synthetic */ FloatingActionButtonElevationAnimatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f25901O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25902n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f25903r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f25904t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(continuation);
        this.J2 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25901O = obj;
        this.f25903r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
