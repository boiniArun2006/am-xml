package androidx.compose.material.ripple;

import GJW.C;
import GJW.vd;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "", "bounded", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "LGJW/vd;", "scope", "", "t", "(Landroidx/compose/foundation/interaction/Interaction;LGJW/vd;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "radius", "Landroidx/compose/ui/graphics/Color;", TtmlNode.ATTR_TTS_COLOR, "rl", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", c.f62177j, "Z", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", "", "nr", "Ljava/util/List;", "interactions", "O", "Landroidx/compose/foundation/interaction/Interaction;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n225#2,8:531\n272#2,14:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n497#1:531,8\n497#1:539,14\n*E\n"})
final class StateLayer {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Interaction currentInteraction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 rippleAlpha;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Animatable animatedAlpha = AnimatableKt.rl(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List interactions = new ArrayList();

    public final void rl(DrawScope drawScope, float f3, long j2) throws Throwable {
        long j3;
        float fFloatValue = ((Number) this.animatedAlpha.ty()).floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jAz = Color.az(j2, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.Lu(drawScope, jAz, f3, 0L, 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
            return;
        }
        float fGh = Size.gh(drawScope.t());
        float fXMQ = Size.xMQ(drawScope.t());
        int iRl = ClipOp.INSTANCE.rl();
        DrawContext drawContext = drawScope.getDrawContext();
        long jT2 = drawContext.t();
        drawContext.KN().O();
        try {
            drawContext.getTransform().rl(0.0f, 0.0f, fGh, fXMQ, iRl);
            j3 = jT2;
            try {
                DrawScope.Lu(drawScope, jAz, f3, 0L, 0.0f, null, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null);
                drawContext.KN().n();
                drawContext.xMQ(j3);
            } catch (Throwable th) {
                th = th;
                drawContext.KN().n();
                drawContext.xMQ(j3);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j3 = jT2;
        }
    }

    public final void t(Interaction interaction, vd scope) {
        boolean z2 = interaction instanceof HoverInteraction.Enter;
        if (z2) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) CollectionsKt.lastOrNull(this.interactions);
        if (Intrinsics.areEqual(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            C.nr(scope, null, null, new StateLayer$handleInteraction$1(this, z2 ? rippleAlpha.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? rippleAlpha.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? rippleAlpha.getDraggedAlpha() : 0.0f, RippleKt.nr(interaction2), null), 3, null);
        } else {
            C.nr(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.O(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }

    public StateLayer(boolean z2, Function0 function0) {
        this.bounded = z2;
        this.rippleAlpha = function0;
    }
}
