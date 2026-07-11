package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 n2\u00020\u0001:\u0001pB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010#\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0005R\"\u0010,\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u001a\u00107\u001a\u000604j\u0002`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=RB\u0010E\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR6\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010G\u001a\u0004\bH\u0010I\"\u0004\b'\u0010JRN\u0010R\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR0\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u00109\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010=R0\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u00109\u001a\u0004\b_\u0010;\"\u0004\b`\u0010=R7\u0010j\u001a\b\u0012\u0004\u0012\u00020c0b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\b.\u0010g\"\u0004\bh\u0010iR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00070b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010g\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "initialIncrementId", "<init>", "(J)V", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "KN", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "nr", "(Landroidx/compose/foundation/text/selection/Selectable;)V", c.f62177j, "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "WPU", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "t", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", JavetError.PARAMETER_START_POSITION, "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "xMQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "newPosition", "previousPosition", "isStartHandle", "J2", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "Uo", "O", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "sorted", "", "rl", "Ljava/util/List;", "_selectables", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "_selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "incrementId", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "ck", "(Lkotlin/jvm/functions/Function1;)V", "onPositionChangeCallback", "Lkotlin/Function4;", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "XQ", "(Lkotlin/jvm/functions/Function4;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function6;", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "r", "(Lkotlin/jvm/functions/Function6;)V", "onSelectionUpdateCallback", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "o", "(Lkotlin/jvm/functions/Function0;)V", "onSelectionUpdateEndCallback", "mUb", "getOnSelectableChangeCallback$foundation_release", "Ik", "onSelectableChangeCallback", "gh", "getAfterSelectableUnsubscribe$foundation_release", "HI", "afterSelectableUnsubscribe", "Landroidx/collection/LongObjectMap;", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "qie", "Landroidx/compose/runtime/MutableState;", "()Landroidx/collection/LongObjectMap;", "S", "(Landroidx/collection/LongObjectMap;)V", "subselections", "ty", "()Ljava/util/List;", "selectables", "az", "selectableMap", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,217:1\n85#2:218\n113#2,2:219\n96#3,5:221\n96#3,5:226\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n100#1:218\n100#1:219,2\n103#1:221,5\n106#1:226,5\n*E\n"})
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function4 onSelectionUpdateStartCallback;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private Function6 onSelectionUpdateCallback;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function1 onPositionChangeCallback;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private Function2 onSelectionUpdateSelectAll;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Function1 afterSelectableUnsubscribe;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Function1 onSelectableChangeCallback;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean sorted;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private AtomicLong incrementId;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final MutableState subselections;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List _selectables;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableLongObjectMap _selectableMap;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private Function0 onSelectionUpdateEndCallback;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int ty = 8;
    private static final Saver HI = SaverKt.n(new Function2<SaverScope, SelectionRegistrarImpl, Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new Function1<Long, SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l2) {
            return n(l2.longValue());
        }

        public final SelectionRegistrarImpl n(long j2) {
            return new SelectionRegistrarImpl(j2, null);
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return SelectionRegistrarImpl.HI;
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public boolean J2(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment, boolean isInTouchMode) {
        Function6 function6 = this.onSelectionUpdateCallback;
        if (function6 != null) {
            return ((Boolean) function6.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.nr(newPosition), Offset.nr(previousPosition), Boolean.valueOf(isStartHandle), adjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void t(long selectableId) {
        this.sorted = false;
        Function1 function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    private SelectionRegistrarImpl(long j2) {
        this._selectables = new ArrayList();
        this._selectableMap = LongObjectMapKt.t();
        this.incrementId = new AtomicLong(j2);
        this.subselections = SnapshotStateKt__SnapshotStateKt.O(LongObjectMapKt.n(), null, 2, null);
    }

    public final void HI(Function1 function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void Ik(Function1 function1) {
        this.onSelectableChangeCallback = function1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void O(long selectableId) {
        Function1 function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    public void S(LongObjectMap longObjectMap) {
        this.subselections.setValue(longObjectMap);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void Uo() {
        Function0 function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final List WPU(final LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            List list = this._selectables;
            final Function2<Selectable, Selectable, Integer> function2 = new Function2<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$sort$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    long jT2;
                    long jT3;
                    int iCompareValues;
                    LayoutCoordinates layoutCoordinatesFD = selectable.fD();
                    LayoutCoordinates layoutCoordinatesFD2 = selectable2.fD();
                    if (layoutCoordinatesFD != null) {
                        jT2 = containerLayoutCoordinates.nHg(layoutCoordinatesFD, Offset.INSTANCE.t());
                    } else {
                        jT2 = Offset.INSTANCE.t();
                    }
                    if (layoutCoordinatesFD2 != null) {
                        jT3 = containerLayoutCoordinates.nHg(layoutCoordinatesFD2, Offset.INSTANCE.t());
                    } else {
                        jT3 = Offset.INSTANCE.t();
                    }
                    int i2 = (int) (jT2 & 4294967295L);
                    int i3 = (int) (4294967295L & jT3);
                    if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
                        iCompareValues = ComparisonsKt.compareValues(Float.valueOf(Float.intBitsToFloat((int) (jT2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jT3 >> 32))));
                    } else {
                        iCompareValues = ComparisonsKt.compareValues(Float.valueOf(Float.intBitsToFloat(i2)), Float.valueOf(Float.intBitsToFloat(i3)));
                    }
                    return Integer.valueOf(iCompareValues);
                }
            };
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.Wre
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.aYN(function2, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return get_selectables();
    }

    public final void XQ(Function4 function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final void Z(Function2 function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final LongObjectMap az() {
        return this._selectableMap;
    }

    public final void ck(Function1 function1) {
        this.onPositionChangeCallback = function1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long n() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void nr(Selectable selectable) {
        if (this._selectableMap.n(selectable.mUb())) {
            this._selectables.remove(selectable);
            this._selectableMap.HI(selectable.mUb());
            Function1 function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(Long.valueOf(selectable.mUb()));
            }
        }
    }

    public final void o(Function0 function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void r(Function6 function6) {
        this.onSelectionUpdateCallback = function6;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public LongObjectMap rl() {
        return (LongObjectMap) this.subselections.getValue();
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final List get_selectables() {
        return this._selectables;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void xMQ(LayoutCoordinates layoutCoordinates, long startPosition, SelectionAdjustment adjustment, boolean isInTouchMode) {
        Function4 function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.nr(startPosition), adjustment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aYN(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable KN(Selectable selectable) {
        boolean z2;
        if (selectable.mUb() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            InlineClassHelperKt.n("The selectable contains an invalid id: " + selectable.mUb());
        }
        if (this._selectableMap.n(selectable.mUb())) {
            InlineClassHelperKt.n("Another selectable with the id: " + selectable + ".selectableId has already subscribed.");
        }
        this._selectableMap.r(selectable.mUb(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
