package androidx.compose.foundation.gestures;

import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {RendererCapabilities.DECODER_SUPPORT_MASK}, m = "waitForLongPress", n = {"result"}, s = {"L$0"})
final class TapGestureDetectorKt$waitForLongPress$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f17165O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17166n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f17167t;

    TapGestureDetectorKt$waitForLongPress$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17167t = obj;
        this.f17165O |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.o(null, null, this);
    }
}
