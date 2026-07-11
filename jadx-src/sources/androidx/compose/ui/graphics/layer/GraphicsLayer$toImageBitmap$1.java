package androidx.compose.ui.graphics.layer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {878}, m = "toImageBitmap", n = {}, s = {})
final class GraphicsLayer$toImageBitmap$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f31674O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f31675n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ GraphicsLayer f31676t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphicsLayer$toImageBitmap$1(GraphicsLayer graphicsLayer, Continuation continuation) {
        super(continuation);
        this.f31676t = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31675n = obj;
        this.f31674O |= Integer.MIN_VALUE;
        return this.f31676t.k(this);
    }
}
