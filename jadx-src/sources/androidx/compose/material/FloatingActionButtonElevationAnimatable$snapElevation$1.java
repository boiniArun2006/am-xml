package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {370}, m = "snapElevation", n = {"this"}, s = {"L$0"})
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ FloatingActionButtonElevationAnimatable f22062O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f22063n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f22064t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(continuation);
        this.f22062O = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22064t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f22062O.O(this);
    }
}
