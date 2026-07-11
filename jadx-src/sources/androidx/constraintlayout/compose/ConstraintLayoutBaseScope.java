package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u00002\u00020\u0001:\u0003567B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\fR2\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0#0\"8\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010$\u0012\u0004\b'\u0010\u0012\u001a\u0004\b%\u0010&R \u0010-\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010)\u0012\u0004\b,\u0010\u0012\u001a\u0004\b*\u0010+R(\u00102\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010\u0012\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\nR\u0014\u00103\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010.¨\u00068"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "Landroidx/constraintlayout/core/parser/CLObject;", "extendFrom", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "", "value", "", "KN", "(I)V", "t", "()I", "Landroidx/constraintlayout/compose/State;", "state", c.f62177j, "(Landroidx/constraintlayout/compose/State;)V", "Uo", "()V", "", "Landroidx/constraintlayout/compose/LayoutReference;", "elements", "Landroidx/constraintlayout/compose/ChainStyle;", "chainStyle", "Landroidx/constraintlayout/compose/VerticalChainReference;", "nr", "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;", "rl", "(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "Lkotlin/Function1;", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "getTasks$annotations", "tasks", "Landroidx/constraintlayout/core/parser/CLObject;", "O", "()Landroidx/constraintlayout/core/parser/CLObject;", "getContainerObject$annotations", "containerObject", "I", "J2", "setHelpersHashCode", "getHelpersHashCode$annotations", "helpersHashCode", "HelpersStartId", "helperId", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/LayoutReference\n*L\n1#1,1456:1\n13579#2,2:1457\n13579#2,2:1459\n13579#2,2:1461\n13579#2,2:1464\n13579#2,2:1466\n13579#2,2:1469\n13579#2,2:1471\n13579#2,2:1474\n13579#2,2:1476\n13579#2,2:1479\n13579#2,2:1481\n13579#2,2:1484\n13579#2,2:1486\n13579#2,2:1496\n13579#2,2:1498\n13579#2,2:1508\n13579#2:1512\n13580#2:1514\n13579#2,2:1515\n13579#2:1517\n13580#2:1519\n13579#2,2:1520\n149#3:1463\n149#3:1468\n149#3:1473\n149#3:1478\n149#3:1483\n149#3:1488\n149#3:1489\n149#3:1490\n149#3:1491\n149#3:1492\n149#3:1493\n149#3:1494\n149#3:1495\n149#3:1500\n149#3:1501\n149#3:1502\n149#3:1503\n149#3:1504\n149#3:1505\n149#3:1506\n149#3:1507\n149#3:1510\n149#3:1511\n149#3:1522\n149#3:1523\n149#3:1524\n149#3:1525\n149#3:1526\n149#3:1527\n149#3:1528\n149#3:1529\n149#3:1530\n149#3:1531\n149#3:1532\n149#3:1533\n149#3:1534\n149#3:1535\n149#3:1536\n149#3:1537\n149#3:1538\n149#3:1539\n149#3:1540\n149#3:1541\n149#3:1542\n149#3:1543\n149#3:1544\n149#3:1545\n1110#4:1513\n1110#4:1518\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n*L\n139#1:1457,2\n333#1:1459,2\n343#1:1461,2\n356#1:1464,2\n366#1:1466,2\n376#1:1469,2\n386#1:1471,2\n396#1:1474,2\n406#1:1476,2\n419#1:1479,2\n429#1:1481,2\n439#1:1484,2\n449#1:1486,2\n612#1:1496,2\n640#1:1498,2\n788#1:1508,2\n837#1:1512\n837#1:1514\n865#1:1515,2\n882#1:1517\n882#1:1519\n910#1:1520,2\n329#1:1463\n351#1:1468\n372#1:1473\n392#1:1478\n414#1:1483\n435#1:1488\n478#1:1489\n479#1:1490\n481#1:1491\n535#1:1492\n536#1:1493\n538#1:1494\n539#1:1495\n595#1:1500\n596#1:1501\n598#1:1502\n599#1:1503\n600#1:1504\n601#1:1505\n661#1:1506\n694#1:1507\n767#1:1510\n768#1:1511\n944#1:1522\n945#1:1523\n946#1:1524\n947#1:1525\n948#1:1526\n949#1:1527\n950#1:1528\n951#1:1529\n1002#1:1530\n1004#1:1531\n1006#1:1532\n1008#1:1533\n994#1:1534\n995#1:1535\n996#1:1536\n997#1:1537\n1043#1:1538\n1045#1:1539\n1047#1:1540\n1049#1:1541\n1036#1:1542\n1037#1:1543\n1038#1:1544\n1039#1:1545\n838#1:1513\n883#1:1518\n*E\n"})
public abstract class ConstraintLayoutBaseScope {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int helperId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List tasks = new ArrayList();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final int HelpersStartId;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CLObject containerObject;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int helpersHashCode;

    @Stable
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "id", "", "index", "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/Object;", "()Ljava/lang/Object;", "rl", "I", "t", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class HorizontalAnchor {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final LayoutReference reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) other;
            return Intrinsics.areEqual(this.id, horizontalAnchor.id) && this.index == horizontalAnchor.index && Intrinsics.areEqual(this.reference, horizontalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public HorizontalAnchor(Object obj, int i2, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i2;
            this.reference = layoutReference;
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "id", "", "index", "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/Object;", "()Ljava/lang/Object;", "rl", "I", "t", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class VerticalAnchor {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final int index;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final LayoutReference reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) other;
            return Intrinsics.areEqual(this.id, verticalAnchor.id) && this.index == verticalAnchor.index && Intrinsics.areEqual(this.reference, verticalAnchor.reference);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + Integer.hashCode(this.index)) * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.id + ", index=" + this.index + ", reference=" + this.reference + ')';
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final Object getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public VerticalAnchor(Object obj, int i2, LayoutReference layoutReference) {
            this.id = obj;
            this.index = i2;
            this.reference = layoutReference;
        }
    }

    @Stable
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "id", "Landroidx/constraintlayout/compose/LayoutReference;", "reference", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/compose/LayoutReference;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "rl", "Landroidx/constraintlayout/compose/LayoutReference;", "getReference", "()Landroidx/constraintlayout/compose/LayoutReference;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BaselineAnchor {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object id;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final LayoutReference reference;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaselineAnchor)) {
                return false;
            }
            BaselineAnchor baselineAnchor = (BaselineAnchor) other;
            return Intrinsics.areEqual(this.id, baselineAnchor.id) && Intrinsics.areEqual(this.reference, baselineAnchor.reference);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.reference.hashCode();
        }

        public String toString() {
            return "BaselineAnchor(id=" + this.id + ", reference=" + this.reference + ')';
        }

        public BaselineAnchor(Object obj, LayoutReference layoutReference) {
            this.id = obj;
            this.reference = layoutReference;
        }
    }

    private final void KN(int value) {
        this.helpersHashCode = ((this.helpersHashCode * 1009) + value) % 1000000007;
    }

    private final int t() {
        int i2 = this.helperId;
        this.helperId = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getHelpersHashCode() {
        return this.helpersHashCode;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    public void Uo() {
        this.containerObject.clear();
        this.helperId = this.HelpersStartId;
        this.helpersHashCode = 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ConstraintLayoutBaseScope) {
            return Intrinsics.areEqual(this.containerObject, ((ConstraintLayoutBaseScope) other).containerObject);
        }
        return false;
    }

    public int hashCode() {
        return this.containerObject.hashCode();
    }

    public final void n(State state) {
        ConstraintSetParser.iF(this.containerObject, state, new ConstraintSetParser.LayoutVariables());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLObject] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.constraintlayout.core.parser.CLString] */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.constraintlayout.core.parser.CLElement] */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.constraintlayout.core.parser.CLArray, androidx.constraintlayout.core.parser.CLContainer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.constraintlayout.compose.ConstraintLayoutBaseScope] */
    public final VerticalChainReference nr(LayoutReference[] elements, ChainStyle chainStyle) {
        ?? O3;
        VerticalChainReference verticalChainReference = new VerticalChainReference(Integer.valueOf(t()));
        ?? cLArray = new CLArray(new char[0]);
        for (LayoutReference layoutReference : elements) {
            Object obj = layoutReference.helperParamsMap.get(Reflection.getOrCreateKotlinClass(ChainParams.class).getSimpleName());
            if (!(obj instanceof ChainParams)) {
                obj = null;
            }
            ChainParams chainParams = (ChainParams) obj;
            if (chainParams != null) {
                O3 = new CLArray(new char[0]);
                O3.r(CLString.o(layoutReference.getId().toString()));
                O3.r(new CLNumber(chainParams.getWeight()));
                O3.r(new CLNumber(chainParams.getTopMargin()));
                O3.r(new CLNumber(chainParams.getBottomMargin()));
                O3.r(new CLNumber(chainParams.getTopGoneMargin()));
                O3.r(new CLNumber(chainParams.getBottomGoneMargin()));
            } else {
                O3 = CLString.o(layoutReference.getId().toString());
            }
            cLArray.r(O3);
        }
        CLArray cLArray2 = new CLArray(new char[0]);
        cLArray2.r(CLString.o(chainStyle.getName()));
        Float bias = chainStyle.getBias();
        cLArray2.r(new CLNumber(bias != null ? bias.floatValue() : 0.5f));
        ?? Rl = rl(verticalChainReference);
        Rl.rV9("type", "vChain");
        Rl.wTp("contains", cLArray);
        Rl.wTp("style", cLArray2);
        KN(17);
        for (LayoutReference layoutReference2 : elements) {
            KN(layoutReference2.hashCode());
        }
        KN(chainStyle.hashCode());
        return verticalChainReference;
    }

    public ConstraintLayoutBaseScope(CLObject cLObject) {
        CLObject cLObjectRl;
        this.containerObject = (cLObject == null || (cLObjectRl = cLObject.rl()) == null) ? new CLObject(new char[0]) : cLObjectRl;
        this.HelpersStartId = 1000;
        this.helperId = 1000;
    }

    public final CLObject rl(LayoutReference layoutReference) {
        String string = layoutReference.getId().toString();
        if (this.containerObject.iF(string) == null) {
            this.containerObject.wTp(string, new CLObject(new char[0]));
        }
        return this.containerObject.te(string);
    }
}
