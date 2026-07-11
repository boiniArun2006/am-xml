package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {636}, m = "snapElevation", n = {"this"}, s = {"L$0"})
final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ FloatingActionButtonElevationAnimatable f25905O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25906n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f25907t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(continuation);
        this.f25905O = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25907t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f25905O.O(this);
    }
}
