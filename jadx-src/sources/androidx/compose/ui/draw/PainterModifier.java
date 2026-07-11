package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0016\u0010\u0019\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010 \u001a\u00020\u001f*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010&\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J#\u0010*\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b*\u0010'J#\u0010+\u001a\u00020$*\u00020\"2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010;R\u0014\u0010X\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "UR", "(J)J", "Landroidx/compose/ui/unit/Constraints;", "constraints", CmcdConfiguration.KEY_PLAYBACK_RATE, "W1c", "(J)Z", "poH", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "U", "width", "nHg", "r", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "W5k", "()Landroidx/compose/ui/graphics/painter/Painter;", "b", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "Xw", "Z", "NC9", "()Z", "WKb", "(Z)V", "jB", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "ni", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "Vd", "(Landroidx/compose/ui/layout/ContentScale;)V", "P5", "F", "getAlpha", "()F", "rl", "(F)V", "M7", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "GT", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "ex", "useIntrinsicSize", "lRt", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,364:1\n148#2:365\n33#2:378\n33#2:401\n33#2:431\n57#3:366\n57#3:369\n61#3:372\n61#3:375\n57#3:382\n61#3:385\n57#3:387\n61#3:394\n57#3:405\n61#3:412\n57#3:419\n57#3:422\n61#3:425\n61#3:428\n57#3:435\n61#3:438\n57#3:440\n61#3:447\n57#3:451\n61#3:458\n57#3:469\n61#3:473\n60#4:367\n60#4:370\n70#4:373\n70#4:376\n53#4,3:379\n60#4:383\n70#4:386\n60#4:388\n70#4:395\n53#4,3:402\n60#4:406\n70#4:413\n60#4:420\n60#4:423\n70#4:426\n70#4:429\n53#4,3:432\n60#4:436\n70#4:439\n60#4:441\n70#4:448\n80#4:450\n60#4:452\n70#4:459\n80#4:461\n60#4:470\n70#4:474\n22#5:368\n22#5:371\n22#5:374\n22#5:377\n22#5:384\n22#5,5:389\n22#5,5:396\n22#5,5:407\n22#5,5:414\n22#5:421\n22#5:424\n22#5:427\n22#5:430\n22#5:437\n22#5,5:442\n22#5,5:453\n22#5:471\n22#5:475\n30#6:449\n30#6:460\n120#7,3:462\n124#7,3:466\n1#8:465\n139#9:472\n139#9:476\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:365\n245#1:378\n289#1:401\n318#1:431\n233#1:366\n235#1:369\n240#1:372\n242#1:375\n246#1:382\n246#1:385\n272#1:387\n279#1:394\n297#1:405\n298#1:412\n306#1:419\n308#1:422\n313#1:425\n315#1:428\n323#1:435\n323#1:438\n331#1:440\n331#1:447\n332#1:451\n332#1:458\n351#1:469\n354#1:473\n233#1:367\n235#1:370\n240#1:373\n242#1:376\n245#1:379,3\n246#1:383\n246#1:386\n272#1:388\n279#1:395\n289#1:402,3\n297#1:406\n298#1:413\n306#1:420\n308#1:423\n313#1:426\n315#1:429\n318#1:432,3\n323#1:436\n323#1:439\n331#1:441\n331#1:448\n331#1:450\n332#1:452\n332#1:459\n332#1:461\n351#1:470\n354#1:474\n233#1:368\n235#1:371\n240#1:374\n242#1:377\n246#1:384\n272#1:389,5\n279#1:396,5\n297#1:407,5\n298#1:414,5\n306#1:421\n308#1:424\n313#1:427\n315#1:430\n323#1:437\n331#1:442,5\n332#1:453,5\n351#1:471\n354#1:475\n331#1:449\n332#1:460\n343#1:462,3\n343#1:466,3\n351#1:472\n354#1:476\n*E\n"})
final class PainterModifier extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata and from toString */
    private ColorFilter colorFilter;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata and from toString */
    private float alpha;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private ContentScale contentScale;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata and from toString */
    private boolean sizeToIntrinsics;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata and from toString */
    private Alignment alignment;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private Painter painter;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final boolean W1c(long j2) {
        return !Size.KN(j2, Size.INSTANCE.n()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final boolean ex() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != 9205357640488583168L;
    }

    private final boolean poH(long j2) {
        return !Size.KN(j2, Size.INSTANCE.n()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final void GT(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(ContentDrawScope contentDrawScope) {
        long jQie = this.painter.getIntrinsicSize();
        float fIntBitsToFloat = W1c(jQie) ? Float.intBitsToFloat((int) (jQie >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.t() >> 32));
        long jNr = Size.nr((((long) Float.floatToRawIntBits(poH(jQie) ? Float.intBitsToFloat((int) (jQie & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.t() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jRl = (Float.intBitsToFloat((int) (contentDrawScope.t() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.t() & 4294967295L)) == 0.0f) ? Size.INSTANCE.rl() : ScaleFactorKt.n(jNr, this.contentScale.n(jNr, contentDrawScope.t()));
        long jN = this.alignment.n(IntSize.t((((long) Math.round(Float.intBitsToFloat((int) (jRl & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jRl >> 32)))) << 32)), IntSize.t((((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.t() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.t() & 4294967295L)))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float fGh = IntOffset.gh(jN);
        float fQie = IntOffset.qie(jN);
        contentDrawScope.getDrawContext().getTransform().nr(fGh, fQie);
        try {
            this.painter.mUb(contentDrawScope, jRl, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().nr(-fGh, -fQie);
            contentDrawScope.l2();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().nr(-fGh, -fQie);
            throw th;
        }
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void Vd(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final Painter getPainter() {
        return this.painter;
    }

    public final void WKb(boolean z2) {
        this.sizeToIntrinsics = z2;
    }

    public final void b(Painter painter) {
        this.painter = painter;
    }

    public final void ni(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void rl(float f3) {
        this.alpha = f3;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifier(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f3, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z2;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f3;
        this.colorFilter = colorFilter;
    }

    private final long UR(long dstSize) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        if (!ex()) {
            return dstSize;
        }
        if (!W1c(this.painter.getIntrinsicSize())) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32));
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32));
        }
        if (!poH(this.painter.getIntrinsicSize())) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L));
        } else {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & 4294967295L));
        }
        long jNr = Size.nr((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        if (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) {
            return Size.INSTANCE.rl();
        }
        return ScaleFactorKt.n(jNr, this.contentScale.n(jNr, dstSize));
    }

    private final long pr(long constraints) {
        boolean z2;
        int iTy;
        int iAz;
        boolean z3 = false;
        if (Constraints.KN(constraints) && Constraints.Uo(constraints)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Constraints.mUb(constraints) && Constraints.xMQ(constraints)) {
            z3 = true;
        }
        if ((!ex() && z2) || z3) {
            return Constraints.nr(constraints, Constraints.qie(constraints), 0, Constraints.gh(constraints), 0, 10, null);
        }
        long jQie = this.painter.getIntrinsicSize();
        if (W1c(jQie)) {
            iTy = Math.round(Float.intBitsToFloat((int) (jQie >> 32)));
        } else {
            iTy = Constraints.ty(constraints);
        }
        if (poH(jQie)) {
            iAz = Math.round(Float.intBitsToFloat((int) (jQie & 4294967295L)));
        } else {
            iAz = Constraints.az(constraints);
        }
        int iUo = ConstraintsKt.Uo(constraints, iTy);
        long jUR = UR(Size.nr((((long) Float.floatToRawIntBits(ConstraintsKt.J2(constraints, iAz))) & 4294967295L) | (Float.floatToRawIntBits(iUo) << 32)));
        return Constraints.nr(constraints, ConstraintsKt.Uo(constraints, Math.round(Float.intBitsToFloat((int) (jUR >> 32)))), 0, ConstraintsKt.J2(constraints, Math.round(Float.intBitsToFloat((int) (jUR & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (ex()) {
            long jPr = pr(ConstraintsKt.rl(0, 0, 0, i2, 7, null));
            return Math.max(Constraints.ty(jPr), intrinsicMeasurable.Nxk(i2));
        }
        return intrinsicMeasurable.Nxk(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (ex()) {
            long jPr = pr(ConstraintsKt.rl(0, i2, 0, 0, 13, null));
            return Math.max(Constraints.az(jPr), intrinsicMeasurable.FX(i2));
        }
        return intrinsicMeasurable.FX(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(pr(j2));
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.az(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (ex()) {
            long jPr = pr(ConstraintsKt.rl(0, i2, 0, 0, 13, null));
            return Math.max(Constraints.az(jPr), intrinsicMeasurable.g(i2));
        }
        return intrinsicMeasurable.g(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (ex()) {
            long jPr = pr(ConstraintsKt.rl(0, 0, 0, i2, 7, null));
            return Math.max(Constraints.ty(jPr), intrinsicMeasurable.GR(i2));
        }
        return intrinsicMeasurable.GR(i2);
    }
}
