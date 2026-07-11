package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u0006*\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001e\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R*\u00108\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R6\u0010A\u001a\b\u0012\u0004\u0012\u00020:092\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010+\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010G8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010H\u001a\u0004\b&\u0010I\"\u0004\b/\u0010JR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010HR*\u0010Q\u001a\u00020\"2\u0006\u0010;\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010$\"\u0004\bO\u0010PR*\u0010X\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010[\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR*\u0010]\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010S\u001a\u0004\b\\\u0010U\"\u0004\b0\u0010WR*\u0010`\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010S\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR*\u0010c\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010S\u001a\u0004\ba\u0010U\"\u0004\bb\u0010WR*\u0010f\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010S\u001a\u0004\bd\u0010U\"\u0004\be\u0010WR*\u0010i\u001a\u00020R2\u0006\u0010;\u001a\u00020R8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010S\u001a\u0004\bg\u0010U\"\u0004\bh\u0010WR\u0016\u0010j\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00100R\u0014\u0010k\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u0011\u0010m\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b<\u0010l\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "qie", "(Landroidx/compose/ui/graphics/Brush;)V", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "az", "(J)V", "node", "ty", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "gh", "nY", "g", "", "index", "instance", "xMQ", "(ILandroidx/compose/ui/graphics/vector/VNode;)V", "from", "to", JavetError.PARAMETER_COUNT, "HI", "(III)V", "ck", "(II)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Matrix;", "rl", "[F", "groupMatrix", "", "t", "Ljava/util/List;", "children", "", "<set-?>", "nr", "Z", "mUb", "()Z", "isTintable", "O", "J", "Uo", "()J", "tintColor", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "J2", "getClipPathData", "()Ljava/util/List;", "Ik", "(Ljava/util/List;)V", "clipPathData", "isClipPathDirty", "Landroidx/compose/ui/graphics/Path;", "KN", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "wrappedListener", "Ljava/lang/String;", "getName", "r", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "F", "getRotation", "()F", "XQ", "(F)V", "rotation", "getPivotX", "o", "pivotX", "getPivotY", "pivotY", "getScaleX", "S", "scaleX", "getScaleY", "WPU", "scaleY", "getTranslationX", "aYN", "translationX", "getTranslationY", "ViF", "translationY", "isMatrixDirty", "willClipPath", "()I", "numChildren", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,642:1\n635#2:643\n640#2:644\n249#3,8:645\n257#3:654\n259#3,4:661\n1#4:653\n34#5,6:655\n34#5,6:665\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n409#1:643\n410#1:644\n608#1:645,8\n608#1:654\n608#1:661,4\n615#1:655,6\n621#1:665,6\n*E\n"})
public final class GroupComponent extends VNode {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private List clipPathData;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Path clipPath;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long tintColor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean isClipPathDirty;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private float pivotX;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Function1 wrappedListener;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean isTintable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float rotation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private float[] groupMatrix;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List children;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float pivotY;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Function1 invalidateListener;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.INSTANCE.Uo();
        this.clipPathData = VectorKt.nr();
        this.isClipPathDirty = true;
        this.wrappedListener = new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                n(vNode);
                return Unit.INSTANCE;
            }

            public final void n(VNode vNode) {
                this.f31773n.ty(vNode);
                Function1 invalidateListener = this.f31773n.getInvalidateListener();
                if (invalidateListener != null) {
                    invalidateListener.invoke(vNode);
                }
            }
        };
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final void gh() {
        this.isTintable = false;
        this.tintColor = Color.INSTANCE.Uo();
    }

    public final void HI(int from, int to, int count) {
        int i2 = 0;
        if (from > to) {
            while (i2 < count) {
                VNode vNode = (VNode) this.children.get(from);
                this.children.remove(from);
                this.children.add(to, vNode);
                to++;
                i2++;
            }
        } else {
            while (i2 < count) {
                VNode vNode2 = (VNode) this.children.get(from);
                this.children.remove(from);
                this.children.add(to - 1, vNode2);
                i2++;
            }
        }
        t();
    }

    public final void ck(int index, int count) {
        for (int i2 = 0; i2 < count; i2++) {
            if (index < this.children.size()) {
                ((VNode) this.children.get(index)).nr(null);
                this.children.remove(index);
            }
        }
        t();
    }

    private final boolean KN() {
        return !this.clipPathData.isEmpty();
    }

    private final void az(long color) {
        if (this.isTintable && color != 16) {
            long j2 = this.tintColor;
            if (j2 == 16) {
                this.tintColor = color;
            } else {
                if (VectorKt.O(j2, color)) {
                    return;
                }
                gh();
            }
        }
    }

    private final void g() {
        float[] fArrT = this.groupMatrix;
        if (fArrT == null) {
            fArrT = Matrix.t(null, 1, null);
            this.groupMatrix = fArrT;
        } else {
            Matrix.KN(fArrT);
        }
        float[] fArr = fArrT;
        Matrix.HI(fArr, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.mUb(fArr, this.rotation);
        Matrix.gh(fArr, this.scaleX, this.scaleY, 1.0f);
        Matrix.HI(fArr, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    private final void qie(Brush brush) {
        if (this.isTintable && brush != null) {
            if (brush instanceof SolidColor) {
                az(((SolidColor) brush).getValue());
            } else {
                gh();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty(VNode node) {
        if (node instanceof PathComponent) {
            PathComponent pathComponent = (PathComponent) node;
            qie(pathComponent.getFill());
            qie(pathComponent.getStroke());
        } else if (node instanceof GroupComponent) {
            GroupComponent groupComponent = (GroupComponent) node;
            if (groupComponent.isTintable && this.isTintable) {
                az(groupComponent.tintColor);
            } else {
                gh();
            }
        }
    }

    public final void Ik(List list) {
        this.clipPathData = list;
        this.isClipPathDirty = true;
        t();
    }

    public final int J2() {
        return this.children.size();
    }

    public final void S(float f3) {
        this.scaleX = f3;
        this.isMatrixDirty = true;
        t();
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    public final void ViF(float f3) {
        this.translationY = f3;
        this.isMatrixDirty = true;
        t();
    }

    public final void WPU(float f3) {
        this.scaleY = f3;
        this.isMatrixDirty = true;
        t();
    }

    public final void XQ(float f3) {
        this.rotation = f3;
        this.isMatrixDirty = true;
        t();
    }

    public final void Z(float f3) {
        this.pivotY = f3;
        this.isMatrixDirty = true;
        t();
    }

    public final void aYN(float f3) {
        this.translationX = f3;
        this.isMatrixDirty = true;
        t();
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final boolean getIsTintable() {
        return this.isTintable;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void n(DrawScope drawScope) {
        if (this.isMatrixDirty) {
            g();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            nY();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            DrawTransform transform = drawContext.getTransform();
            float[] fArr = this.groupMatrix;
            if (fArr != null) {
                transform.n(Matrix.n(fArr).getValues());
            }
            Path path = this.clipPath;
            if (KN() && path != null) {
                DrawTransform.J2(transform, path, 0, 2, null);
            }
            List list = this.children;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((VNode) list.get(i2)).n(drawScope);
            }
            drawContext.KN().n();
            drawContext.xMQ(jT2);
        } catch (Throwable th) {
            drawContext.KN().n();
            drawContext.xMQ(jT2);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void nr(Function1 function1) {
        this.invalidateListener = function1;
    }

    public final void o(float f3) {
        this.pivotX = f3;
        this.isMatrixDirty = true;
        t();
    }

    public final void r(String str) {
        this.name = str;
        t();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    /* JADX INFO: renamed from: rl, reason: from getter */
    public Function1 getInvalidateListener() {
        return this.invalidateListener;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.name);
        List list = this.children;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            VNode vNode = (VNode) list.get(i2);
            sb.append("\t");
            sb.append(vNode.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    private final void nY() {
        if (KN()) {
            Path pathN = this.clipPath;
            if (pathN == null) {
                pathN = AndroidPath_androidKt.n();
                this.clipPath = pathN;
            }
            PathParserKt.t(this.clipPathData, pathN);
        }
    }

    public final void xMQ(int index, VNode instance) {
        if (index < J2()) {
            this.children.set(index, instance);
        } else {
            this.children.add(instance);
        }
        ty(instance);
        instance.nr(this.wrappedListener);
        t();
    }
}
