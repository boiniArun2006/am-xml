package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {688, 720}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f15826O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f15827n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f15828r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f15829t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation continuation) {
        super(continuation);
        this.J2 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15826O = obj;
        this.f15828r |= Integer.MIN_VALUE;
        return this.J2.xMQ(0L, null, this);
    }
}
