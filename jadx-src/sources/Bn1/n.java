package Bn1;

import B7.qz;
import android.view.Choreographer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Choreographer f616n;

    public n(Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f616n = choreographer;
    }

    @Override // B7.qz
    public void n(Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f616n.postFrameCallback(callback);
    }

    @Override // B7.qz
    public void rl(Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f616n.removeFrameCallback(callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(Choreographer choreographer, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
        }
        this(choreographer);
    }
}
