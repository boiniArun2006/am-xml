package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntRect;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B_\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0011\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\u0019\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0015\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u000e\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010)\u0082\u0001\u0003+,-¨\u0006."}, d2 = {"Landroidx/compose/ui/tooling/data/Group;", "", "key", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "identity", "Landroidx/compose/ui/unit/IntRect;", "box", "", "data", "children", "", "isInline", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/lang/Object;Landroidx/compose/ui/unit/IntRect;Ljava/util/Collection;Ljava/util/Collection;Z)V", c.f62177j, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "rl", "Ljava/lang/String;", "J2", "()Ljava/lang/String;", "t", "Landroidx/compose/ui/tooling/data/SourceLocation;", "nr", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "getIdentity", "O", "Landroidx/compose/ui/unit/IntRect;", "()Landroidx/compose/ui/unit/IntRect;", "Ljava/util/Collection;", "()Ljava/util/Collection;", "Uo", "KN", "Z", "()Z", "", "Landroidx/compose/ui/layout/ModifierInfo;", "()Ljava/util/List;", "modifierInfo", "Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/EmptyGroup;", "Landroidx/compose/ui/tooling/data/NodeGroup;", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Group {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Collection data;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean isInline;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final IntRect box;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Collection children;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Object identity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SourceLocation location;

    public /* synthetic */ Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, sourceLocation, obj2, intRect, collection, collection2, z2);
    }

    private Group(Object obj, String str, SourceLocation sourceLocation, Object obj2, IntRect intRect, Collection collection, Collection collection2, boolean z2) {
        this.key = obj;
        this.name = str;
        this.location = sourceLocation;
        this.identity = obj2;
        this.box = intRect;
        this.data = collection;
        this.children = collection2;
        this.isInline = z2;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final IntRect getBox() {
        return this.box;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final SourceLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Collection getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Collection getData() {
        return this.data;
    }

    public List O() {
        return CollectionsKt.emptyList();
    }
}
