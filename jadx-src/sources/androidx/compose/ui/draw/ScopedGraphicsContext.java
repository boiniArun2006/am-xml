package androidx.compose.ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draw/ScopedGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", c.f62177j, "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "", "rl", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "nr", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableObjectList;", "allocatedGraphicsLayers", "value", "Landroidx/compose/ui/graphics/GraphicsContext;", "t", "()Landroidx/compose/ui/graphics/GraphicsContext;", "O", "(Landroidx/compose/ui/graphics/GraphicsContext;)V", "graphicsContext", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,415:1\n56#2,5:416\n1#3:421\n287#4,6:422\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/ScopedGraphicsContext\n*L\n180#1:416,5\n198#1:422,6\n*E\n"})
final class ScopedGraphicsContext implements GraphicsContext {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private MutableObjectList allocatedGraphicsLayers;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private GraphicsContext graphicsContext;

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public GraphicsLayer n() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (!(graphicsContext != null)) {
            InlineClassHelperKt.t("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerN = graphicsContext.n();
        MutableObjectList mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList == null) {
            this.allocatedGraphicsLayers = ObjectListKt.Uo(graphicsLayerN);
            return graphicsLayerN;
        }
        mutableObjectList.ty(graphicsLayerN);
        return graphicsLayerN;
    }

    public final void nr() {
        MutableObjectList mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                rl((GraphicsLayer) objArr[i3]);
            }
            mutableObjectList.Z();
        }
    }

    @Override // androidx.compose.ui.graphics.GraphicsContext
    public void rl(GraphicsLayer layer) {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext != null) {
            graphicsContext.rl(layer);
        }
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void O(GraphicsContext graphicsContext) {
        nr();
        this.graphicsContext = graphicsContext;
    }
}
