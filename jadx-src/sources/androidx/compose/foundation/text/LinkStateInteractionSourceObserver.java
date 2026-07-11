package androidx.compose.foundation.text;

import TFv.CN3;
import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/LinkStateInteractionSourceObserver;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;)V", "", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "Landroidx/compose/foundation/interaction/InteractionSource;", "", "rl", "I", "Focused", "t", "Hovered", "nr", "Pressed", "Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/MutableIntState;", "interactionState", "", "J2", "()Z", "isFocused", "Uo", "isHovered", "KN", "isPressed", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkStateInteractionSourceObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,70:1\n1516#2:71\n*S KotlinDebug\n*F\n+ 1 LinkStateInteractionSourceObserver.kt\nandroidx/compose/foundation/text/LinkStateInteractionSourceObserver\n*L\n36#1:71\n*E\n"})
public final class LinkStateInteractionSourceObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final InteractionSource interactionSource;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int Focused = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int Hovered = 2;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int Pressed = 4;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState interactionState = SnapshotIntStateKt.n(0);

    public final boolean J2() {
        return (this.interactionState.J2() & this.Focused) != 0;
    }

    public final boolean KN() {
        return (this.interactionState.J2() & this.Pressed) != 0;
    }

    public final Object O(Continuation continuation) {
        final MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object objN = this.interactionSource.getInteractions().n(new CN3() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver$collectInteractionsForLinks$2
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Interaction interaction, Continuation continuation2) {
                int i2;
                if (interaction instanceof HoverInteraction.Enter ? true : interaction instanceof FocusInteraction.Focus ? true : interaction instanceof PressInteraction.Press) {
                    mutableObjectList.ty(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    mutableObjectList.ViF(((HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    mutableObjectList.ViF(((FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof PressInteraction.Release) {
                    mutableObjectList.ViF(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    mutableObjectList.ViF(((PressInteraction.Cancel) interaction).getPress());
                }
                MutableObjectList mutableObjectList2 = mutableObjectList;
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                Object[] objArr = mutableObjectList2.content;
                int i3 = mutableObjectList2._size;
                int i5 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    Interaction interaction2 = (Interaction) objArr[i7];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i2 = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i2 = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i2 = linkStateInteractionSourceObserver.Pressed;
                    }
                    i5 |= i2;
                }
                this.interactionState.KN(i5);
                return Unit.INSTANCE;
            }
        }, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public final boolean Uo() {
        return (this.interactionState.J2() & this.Hovered) != 0;
    }

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }
}
