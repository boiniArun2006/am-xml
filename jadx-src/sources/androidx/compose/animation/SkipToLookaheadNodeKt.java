package androidx.compose.animation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "Lkotlin/jvm/functions/Function0;", "DefaultEnabled", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SkipToLookaheadNodeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function0 f15387n = new Function0<Boolean>() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$DefaultEnabled$1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    };

    public static final Modifier n(Modifier modifier, ScaleToBoundsImpl scaleToBoundsImpl, final Function0 function0) {
        Modifier modifierN;
        if (Intrinsics.areEqual(scaleToBoundsImpl.getContentScale(), ContentScale.INSTANCE.n())) {
            modifierN = GraphicsLayerModifierKt.n(Modifier.INSTANCE, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.SkipToLookaheadNodeKt$createContentScaleModifier$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    n(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                public final void n(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.X(((Boolean) function0.invoke()).booleanValue());
                }
            });
        } else {
            modifierN = Modifier.INSTANCE;
        }
        return modifier.Zmq(modifierN).Zmq(new SkipToLookaheadElement(scaleToBoundsImpl, function0));
    }
}
