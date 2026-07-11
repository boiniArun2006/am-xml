package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00060\u000bj\u0002`\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "", "c", "Sax", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "v", "Landroid/graphics/Paint;", "paint", "", "Xw", "Ljava/lang/Object;", "getToken", "()Ljava/lang/Object;", "setToken", "(Ljava/lang/Object;)V", "token", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRectListDebugger.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 3 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,92:1\n476#2,10:93\n486#2:104\n487#2:106\n488#2:108\n489#2:110\n491#2,3:112\n810#3:103\n837#3:105\n839#3:107\n837#3:109\n839#3:111\n*S KotlinDebug\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n*L\n87#1:93,10\n87#1:104\n87#1:106\n87#1:108\n87#1:110\n87#1:112,3\n87#1:103\n87#1:105\n87#1:107\n87#1:109\n87#1:111\n*E\n"})
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Object token;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Paint paint;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint paintN = AndroidPaint_androidKt.n();
        paintN.WPU(Color.INSTANCE.O());
        paintN.X(PaintingStyle.INSTANCE.rl());
        this.paint = paintN.getInternalPaint();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        RectList rects = DelegatableNodeKt.ck(this).getRectManager().getRects();
        Canvas canvasNr = AndroidCanvas_androidKt.nr(contentDrawScope.getDrawContext().KN());
        Paint paint = this.paint;
        long[] jArr = rects.items;
        int i2 = rects.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j2 = jArr[i3];
            long j3 = jArr[i3 + 1];
            long j4 = jArr[i3 + 2];
            canvasNr.drawRect((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3, paint);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        DelegatableNodeKt.ck(this).getRectManager().o(this.token);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        this.token = DelegatableNodeKt.ck(this).getRectManager().HI(new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DrawModifierNodeKt.n(this.f33310n);
            }
        });
    }
}
