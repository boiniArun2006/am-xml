package androidx.compose.ui.graphics.layer;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f31715O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f31716S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ LayerSnapshotV22 f31717Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f31718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f31719o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f31720r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f31721t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, Continuation continuation) {
        super(continuation);
        this.f31717Z = layerSnapshotV22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31719o = obj;
        this.f31716S |= Integer.MIN_VALUE;
        return this.f31717Z.n(null, this);
    }
}
