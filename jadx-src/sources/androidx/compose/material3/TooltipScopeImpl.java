package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001a\u00020\u0007*\u00020\u00072\u001f\u0010\f\u001a\u001b\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/TooltipScopeImpl;", "Landroidx/compose/material3/TooltipScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "draw", c.f62177j, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "Lkotlin/jvm/functions/Function0;", "rl", "()Lkotlin/jvm/functions/Function0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TooltipScopeImpl implements TooltipScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function0 getAnchorBounds;

    @Override // androidx.compose.material3.TooltipScope
    public Modifier n(Modifier modifier, final Function2 function2) {
        return DrawModifierKt.t(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.TooltipScopeImpl$drawCaret$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                return (DrawResult) function2.invoke(cacheDrawScope, this.getGetAnchorBounds().invoke());
            }
        });
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Function0 getGetAnchorBounds() {
        return this.getAnchorBounds;
    }

    public TooltipScopeImpl(Function0 function0) {
        this.getAnchorBounds = function0;
    }
}
