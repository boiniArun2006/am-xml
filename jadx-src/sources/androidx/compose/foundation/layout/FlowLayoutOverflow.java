package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@ExperimentalLayoutApi
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001!B\u0089\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u00120\b\u0002\u0010\u000f\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007\u00120\b\u0002\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR<\u0010\u000f\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR<\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0001\u0004\"#$%¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "state", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "rl", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "list", c.f62177j, "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "I", "t", "nr", "Lkotlin/jvm/functions/Function1;", "O", "OverflowType", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "FlowLayout overflow is no longer maintained")
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
public abstract class FlowLayoutOverflow {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function1 collapseGetter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final OverflowType type;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Function1 seeMoreGetter;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int minLinesToShowCollapse;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int minCrossAxisSizeToShowCollapse;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OverflowType {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f17620o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ OverflowType[] f17621r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final OverflowType f17619n = new OverflowType("Visible", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final OverflowType f17622t = new OverflowType("Clip", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final OverflowType f17618O = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType J2 = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] n() {
            return new OverflowType[]{f17619n, f17622t, f17618O, J2};
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) f17621r.clone();
        }

        static {
            OverflowType[] overflowTypeArrN = n();
            f17621r = overflowTypeArrN;
            f17620o = EnumEntriesKt.enumEntries(overflowTypeArrN);
        }

        private OverflowType(String str, int i2) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.f17618O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i2, i3, function1, function12);
    }

    private FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
        this.seeMoreGetter = function1;
        this.collapseGetter = function12;
    }

    public final void n(FlowLayoutOverflowState state, List list) {
        Function1 function1 = this.seeMoreGetter;
        Function2 function2 = function1 != null ? (Function2) function1.invoke(state) : null;
        Function1 function12 = this.collapseGetter;
        Function2 function22 = function12 != null ? (Function2) function12.invoke(state) : null;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i2 == 1) {
            if (function2 != null) {
                list.add(function2);
            }
        } else {
            if (i2 != 2) {
                return;
            }
            if (function2 != null) {
                list.add(function2);
            }
            if (function22 != null) {
                list.add(function22);
            }
        }
    }

    public final FlowLayoutOverflowState rl() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }
}
