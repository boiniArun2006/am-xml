package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/ConsumedInsetsModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/WindowInsets;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "Lp6", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", c.f62177j, "Lkotlin/jvm/functions/Function1;", "t", "Landroidx/compose/foundation/layout/WindowInsets;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ConsumedInsetsModifier implements ModifierLocalConsumer {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 block;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private WindowInsets oldWindowInsets;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConsumedInsetsModifier) && ((ConsumedInsetsModifier) other).block == this.block;
    }

    public int hashCode() {
        return this.block.hashCode();
    }

    public ConsumedInsetsModifier(Function1 function1) {
        this.block = function1;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void Lp6(ModifierLocalReadScope scope) {
        WindowInsets windowInsets = (WindowInsets) scope.aYN(WindowInsetsPaddingKt.rl());
        if (!Intrinsics.areEqual(windowInsets, this.oldWindowInsets)) {
            this.oldWindowInsets = windowInsets;
            this.block.invoke(windowInsets);
        }
    }
}
