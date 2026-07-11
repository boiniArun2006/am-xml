package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@InternalComposeApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0014\u0010$R6\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\"\u0010+R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b%\u0010'¨\u0006,"}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "Landroidx/compose/runtime/MovableContent;", AppLovinEventTypes.USER_VIEWED_CONTENT, MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/Anchor;", "anchor", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidations", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "locals", "nestedReferences", "<init>", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/util/List;)V", c.f62177j, "Landroidx/compose/runtime/MovableContent;", "t", "()Landroidx/compose/runtime/MovableContent;", "rl", "Ljava/lang/Object;", "Uo", "()Ljava/lang/Object;", "Landroidx/compose/runtime/ControlledComposition;", "()Landroidx/compose/runtime/ControlledComposition;", "nr", "Landroidx/compose/runtime/SlotTable;", "KN", "()Landroidx/compose/runtime/SlotTable;", "O", "Landroidx/compose/runtime/Anchor;", "()Landroidx/compose/runtime/Anchor;", "J2", "Ljava/util/List;", "()Ljava/util/List;", "xMQ", "(Ljava/util/List;)V", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MovableContentStateReference {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private List invalidations;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final List nestedReferences;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Anchor anchor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final PersistentCompositionLocalMap locals;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MovableContent content;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final SlotTable slotTable;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Object parameter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ControlledComposition composition;

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final List getNestedReferences() {
        return this.nestedReferences;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final PersistentCompositionLocalMap getLocals() {
        return this.locals;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final Object getParameter() {
        return this.parameter;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final List getInvalidations() {
        return this.invalidations;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final ControlledComposition getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final MovableContent getContent() {
        return this.content;
    }

    public final void xMQ(List list) {
        this.invalidations = list;
    }

    public MovableContentStateReference(MovableContent movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List list, PersistentCompositionLocalMap persistentCompositionLocalMap, List list2) {
        this.content = movableContent;
        this.parameter = obj;
        this.composition = controlledComposition;
        this.slotTable = slotTable;
        this.anchor = anchor;
        this.invalidations = list;
        this.locals = persistentCompositionLocalMap;
        this.nestedReferences = list2;
    }
}
