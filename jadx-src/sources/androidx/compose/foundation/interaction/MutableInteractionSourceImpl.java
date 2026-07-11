package androidx.compose.foundation.interaction;

import ILs.j;
import TFv.nKK;
import TFv.r;
import androidx.compose.runtime.Stable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "()V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "", c.f62177j, "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "rl", "(Landroidx/compose/foundation/interaction/Interaction;)Z", "LTFv/r;", "LTFv/r;", "nr", "()LTFv/r;", "interactions", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final r interactions = nKK.rl(0, 16, j.f4187t, 1, null);

    @Override // androidx.compose.foundation.interaction.InteractionSource
    /* JADX INFO: renamed from: nr, reason: from getter and merged with bridge method [inline-methods] */
    public r t() {
        return this.interactions;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object n(Interaction interaction, Continuation continuation) {
        Object objRl = t().rl(interaction, continuation);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean rl(Interaction interaction) {
        return t().t(interaction);
    }
}
