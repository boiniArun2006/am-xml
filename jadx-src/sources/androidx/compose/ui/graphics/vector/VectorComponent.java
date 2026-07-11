package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00106\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R1\u0010>\u001a\u0002092\u0006\u0010/\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR%\u0010H\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060E¢\u0006\u0002\bF8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010GR\u001a\u0010K\u001a\u00020I8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "", "KN", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "xMQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", c.f62177j, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "rl", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "qie", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "t", "Ljava/lang/String;", "getName", "ck", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "nr", "Z", "isDirty", "Landroidx/compose/ui/graphics/vector/DrawCache;", "O", "Landroidx/compose/ui/graphics/vector/DrawCache;", "cacheDrawScope", "Lkotlin/Function0;", "J2", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "HI", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "Uo", "Landroidx/compose/runtime/MutableState;", "gh", "()Landroidx/compose/ui/graphics/ColorFilter;", "ty", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "tintFilter", "Landroidx/compose/ui/geometry/Size;", "az", "()J", "Ik", "(J)V", "viewportSize", "mUb", "J", "previousDrawSize", "F", "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "drawVectorBlock", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,642:1\n85#2:643\n113#2,2:644\n85#2:646\n113#2,2:647\n635#3:649\n57#4:650\n61#4:653\n57#4:656\n61#4:659\n57#4:663\n61#4:666\n60#5:651\n70#5:654\n60#5:657\n70#5:660\n80#5:662\n60#5:664\n70#5:667\n22#6:652\n22#6:655\n22#6:658\n22#6:665\n22#6:668\n30#7:661\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:643\n121#1:644,2\n127#1:646\n127#1:647,2\n142#1:649\n161#1:650\n162#1:653\n165#1:656\n165#1:659\n192#1:663\n193#1:666\n161#1:651\n162#1:654\n165#1:657\n165#1:660\n165#1:662\n192#1:664\n193#1:667\n161#1:652\n162#1:655\n165#1:658\n192#1:665\n193#1:668\n165#1:661\n*E\n"})
public final class VectorComponent extends VNode {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function0 invalidateCallback;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private ColorFilter tintFilter;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final DrawCache cacheDrawScope;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final MutableState intrinsicColorFilter;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Function1 drawVectorBlock;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private float rootScaleX;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private long previousDrawSize;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private float rootScaleY;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final GroupComponent root;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final MutableState viewportSize;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.nr(new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                n(vNode);
                return Unit.INSTANCE;
            }

            public final void n(VNode vNode) {
                VectorComponent.this.KN();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.intrinsicColorFilter = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
        Size.Companion companion = Size.INSTANCE;
        this.viewportSize = SnapshotStateKt__SnapshotStateKt.O(Size.t(companion.rl()), null, 2, null);
        this.previousDrawSize = companion.n();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                GroupComponent root = this.f31825n.getRoot();
                VectorComponent vectorComponent = this.f31825n;
                float f3 = vectorComponent.rootScaleX;
                float f4 = vectorComponent.rootScaleY;
                long jT2 = Offset.INSTANCE.t();
                DrawContext drawContext = drawScope.getDrawContext();
                long jT3 = drawContext.t();
                drawContext.KN().O();
                try {
                    drawContext.getTransform().Uo(f3, f4, jT2);
                    root.n(drawScope);
                } finally {
                    drawContext.KN().n();
                    drawContext.xMQ(jT3);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KN() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void HI(Function0 function0) {
        this.invalidateCallback = function0;
    }

    public final void Ik(long j2) {
        this.viewportSize.setValue(Size.t(j2));
    }

    public final long az() {
        return ((Size) this.viewportSize.getValue()).getPackedValue();
    }

    public final void ck(String str) {
        this.name = str;
    }

    public final ColorFilter gh() {
        return (ColorFilter) this.intrinsicColorFilter.getValue();
    }

    public final int mUb() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.rl() : ImageBitmapConfig.INSTANCE.rl();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void n(DrawScope drawScope) {
        xMQ(drawScope, 1.0f, null);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final GroupComponent getRoot() {
        return this.root;
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (az() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (az() & 4294967295L)) + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    public final void ty(ColorFilter colorFilter) {
        this.intrinsicColorFilter.setValue(colorFilter);
    }

    public final void xMQ(DrawScope drawScope, float f3, ColorFilter colorFilter) {
        DrawScope drawScope2;
        int iN = (this.root.getIsTintable() && this.root.getTintColor() != 16 && VectorKt.J2(gh()) && VectorKt.J2(colorFilter)) ? ImageBitmapConfig.INSTANCE.n() : ImageBitmapConfig.INSTANCE.rl();
        if (!this.isDirty && Size.KN(this.previousDrawSize, drawScope.t()) && ImageBitmapConfig.xMQ(iN, mUb())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.xMQ(iN, ImageBitmapConfig.INSTANCE.n()) ? ColorFilter.Companion.rl(ColorFilter.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.t() >> 32)) / Float.intBitsToFloat((int) (az() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.t() & 4294967295L)) / Float.intBitsToFloat((int) (az() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.rl(iN, IntSize.t((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.t() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.t() >> 32))))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.t();
        }
        if (colorFilter == null) {
            colorFilter = gh() != null ? gh() : this.tintFilter;
        }
        this.cacheDrawScope.t(drawScope2, f3, colorFilter);
    }
}
