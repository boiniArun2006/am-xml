package androidx.compose.material;

import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {RendererCapabilities.DECODER_SUPPORT_MASK}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {
    final /* synthetic */ FloatingActionButtonElevationAnimatable J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f22058O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f22059n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f22060r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f22061t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(continuation);
        this.J2 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22058O = obj;
        this.f22060r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
