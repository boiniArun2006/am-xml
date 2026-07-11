package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005=>?@AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u0017J/\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001c\u0010\u0017J/\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u0017R \u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R \u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b%\u0010\u0003\u001a\u0004\b$\u0010!R \u0010-\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0003\u001a\u0004\b*\u0010+R \u00101\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010)\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010+R \u00105\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00102\u0012\u0004\b4\u0010\u0003\u001a\u0004\b\u001e\u00103R \u00107\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u00102\u0012\u0004\b6\u0010\u0003\u001a\u0004\b.\u00103R \u00109\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00102\u0012\u0004\b8\u0010\u0003\u001a\u0004\b(\u00103R \u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00102\u0012\u0004\b;\u0010\u0003\u001a\u0004\b:\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "ty", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "HI", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "mUb", "(I[I[IZ)V", "xMQ", "([I[IZ)V", "KN", "az", "qie", "gh", "rl", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "J2", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "Start", "t", "getEnd$annotations", "End", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "nr", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Uo", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Top", "O", c.f62177j, "getBottom$annotations", "Bottom", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "Center", "getSpaceEvenly$annotations", "SpaceEvenly", "getSpaceBetween$annotations", "SpaceBetween", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,711:1\n702#1,2:717\n705#1,5:722\n702#1,2:727\n705#1,5:732\n702#1,2:740\n705#1,5:746\n702#1,2:754\n705#1,5:760\n702#1,2:768\n705#1,5:774\n702#1,2:782\n705#1,5:788\n113#2:712\n113#2:713\n12762#3,3:714\n13404#3,3:719\n13404#3,3:729\n12762#3,3:737\n13404#3,2:742\n13406#3:745\n12762#3,3:751\n13404#3,2:756\n13406#3:759\n12762#3,3:765\n13404#3,2:770\n13406#3:773\n12762#3,3:779\n13404#3,2:784\n13406#3:787\n13404#3,3:793\n26#4:744\n26#4:758\n26#4:772\n26#4:786\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n614#1:717,2\n614#1:722,5\n622#1:727,2\n622#1:732,5\n636#1:740,2\n636#1:746,5\n651#1:754,2\n651#1:760,5\n675#1:768,2\n675#1:774,5\n695#1:782,2\n695#1:788,5\n339#1:712\n351#1:713\n612#1:714,3\n614#1:719,3\n622#1:729,3\n634#1:737,3\n636#1:742,2\n636#1:745\n648#1:751,3\n651#1:756,2\n651#1:759\n665#1:765,3\n675#1:770,2\n675#1:773\n687#1:779,3\n695#1:784,2\n695#1:787\n703#1:793,3\n637#1:744\n652#1:758\n676#1:772\n696#1:786\n*E\n"})
public final class Arrangement {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Arrangement f17400n = new Arrangement();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.xMQ(iArr, iArr2, false);
            } else {
                Arrangement.f17400n.mUb(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.mUb(i2, iArr, iArr2, false);
            } else {
                Arrangement.f17400n.xMQ(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    };

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.xMQ(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.mUb(i2, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float spacing = Dp.KN(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.KN(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.KN(i2, iArr, iArr2, false);
            } else {
                Arrangement.f17400n.KN(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Center";
        }
    };

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float spacing = Dp.KN(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.az(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.az(i2, iArr, iArr2, false);
            } else {
                Arrangement.f17400n.az(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    };

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float spacing = Dp.KN(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.qie(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.qie(i2, iArr, iArr2, false);
            } else {
                Arrangement.f17400n.qie(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    };

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float spacing = Dp.KN(0);

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.f17400n.gh(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.f34160n) {
                Arrangement.f17400n.gh(i2, iArr, iArr2, false);
            } else {
                Arrangement.f17400n.gh(i2, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    };

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\n\u0010\rR \u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\rR \u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\rR \u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "t", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "rl", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", c.f62177j, "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getLeft$annotations", "Left", "getCenter", "getCenter$annotations", "Center", "nr", "getRight$annotations", "Right", "O", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "J2", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "Uo", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n554#1:712\n*E\n"})
    public static final class Absolute {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Absolute f17403n = new Absolute();

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.xMQ(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.KN(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.mUb(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.qie(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.az(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.f17400n.gh(i2, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        public final Horizontal n() {
            return Left;
        }

        public final Horizontal rl() {
            return Right;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final HorizontalOrVertical t(float space) {
            return new SpacedAligned(space, false, null, 0 == true ? 1 : 0);
        }

        private Absolute() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "t", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n50#1:712\n*E\n"})
    public interface Horizontal {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        /* JADX INFO: renamed from: n */
        default float getSpacing() {
            return Dp.KN(0);
        }

        void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n101#1:712\n*E\n"})
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n */
        default float getSpacing() {
            return Dp.KN(0);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)R \u0010+\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b \u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Dp;", "space", "", "rtlMirror", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "alignment", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "layoutDirection", "outPositions", "", "t", "(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V", "rl", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", c.f62177j, "F", "getSpace-D9Ej5fM", "()F", "Z", "getRtlMirror", "()Z", "Lkotlin/jvm/functions/Function2;", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "nr", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,711:1\n702#2,2:712\n705#2,5:717\n13404#3,3:714\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n584#1:712,2\n584#1:717,5\n584#1:714,3\n*E\n"})
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final float spacing;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final boolean rtlMirror;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Function2 alignment;

        public /* synthetic */ SpacedAligned(float f3, boolean z2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f3, z2, function2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) other;
            return Dp.mUb(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && Intrinsics.areEqual(this.alignment, spacedAligned.alignment);
        }

        public int hashCode() {
            int iGh = ((Dp.gh(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            Function2 function2 = this.alignment;
            return iGh + (function2 == null ? 0 : function2.hashCode());
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void t(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int i5;
            if (iArr.length == 0) {
                return;
            }
            int iHow = density.How(this.space);
            boolean z2 = this.rtlMirror && layoutDirection == LayoutDirection.f34161t;
            Arrangement arrangement = Arrangement.f17400n;
            if (z2) {
                int length = iArr.length - 1;
                i3 = 0;
                i5 = 0;
                while (-1 < length) {
                    int i7 = iArr[length];
                    int iMin = Math.min(i3, i2 - i7);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iHow, (i2 - iMin) - i7);
                    int i8 = iArr2[length] + i7 + iMin2;
                    length--;
                    i5 = iMin2;
                    i3 = i8;
                }
            } else {
                int length2 = iArr.length;
                int i9 = 0;
                i3 = 0;
                i5 = 0;
                int i10 = 0;
                while (i9 < length2) {
                    int i11 = iArr[i9];
                    int iMin3 = Math.min(i3, i2 - i11);
                    iArr2[i10] = iMin3;
                    int iMin4 = Math.min(iHow, (i2 - iMin3) - i11);
                    int i12 = iArr2[i10] + i11 + iMin4;
                    i9++;
                    i5 = iMin4;
                    i3 = i12;
                    i10++;
                }
            }
            int i13 = i3 - i5;
            Function2 function2 = this.alignment;
            if (function2 == null || i13 >= i2) {
                return;
            }
            int iIntValue = ((Number) function2.invoke(Integer.valueOf(i2 - i13), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i14 = 0; i14 < length3; i14++) {
                iArr2[i14] = iArr2[i14] + iIntValue;
            }
        }

        private SpacedAligned(float f3, boolean z2, Function2 function2) {
            this.space = f3;
            this.rtlMirror = z2;
            this.alignment = function2;
            this.spacing = f3;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: n, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void rl(Density density, int i2, int[] iArr, int[] iArr2) {
            t(density, i2, iArr, LayoutDirection.f34160n, iArr2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) Dp.qie(this.space));
            sb.append(", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "outPositions", "", "rl", "(Landroidx/compose/ui/unit/Density;I[I[I)V", "Landroidx/compose/ui/unit/Dp;", c.f62177j, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,711:1\n113#2:712\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n78#1:712\n*E\n"})
    public interface Vertical {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        /* JADX INFO: renamed from: n */
        default float getSpacing() {
            return Dp.KN(0);
        }

        void rl(Density density, int i2, int[] iArr, int[] iArr2);
    }

    public final void KN(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i5 : size) {
            i3 += i5;
        }
        float f3 = (totalSize - i3) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i7 = 0;
            while (i2 < length) {
                int i8 = size[i2];
                outPosition[i7] = Math.round(f3);
                f3 += i8;
                i2++;
                i7++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = size[length2];
            outPosition[length2] = Math.round(f3);
            f3 += i9;
        }
    }

    public final void az(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i5 : size) {
            i3 += i5;
        }
        float length = (totalSize - i3) / (size.length + 1);
        if (reverseInput) {
            float f3 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i7 = size[length2];
                outPosition[length2] = Math.round(f3);
                f3 += i7 + length;
            }
            return;
        }
        int length3 = size.length;
        float f4 = length;
        int i8 = 0;
        while (i2 < length3) {
            int i9 = size[i2];
            outPosition[i8] = Math.round(f4);
            f4 += i9 + length;
            i2++;
            i8++;
        }
    }

    public final void gh(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i5 : size) {
            i3 += i5;
        }
        float length = !(size.length == 0) ? (totalSize - i3) / size.length : 0.0f;
        float f3 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i7 = size[length2];
                outPosition[length2] = Math.round(f3);
                f3 += i7 + length;
            }
            return;
        }
        int length3 = size.length;
        int i8 = 0;
        while (i2 < length3) {
            int i9 = size[i2];
            outPosition[i8] = Math.round(f3);
            f3 += i9 + length;
            i2++;
            i8++;
        }
    }

    public final void mUb(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        int i3 = 0;
        for (int i5 : size) {
            i3 += i5;
        }
        int i7 = totalSize - i3;
        if (!reverseInput) {
            int length = size.length;
            int i8 = 0;
            while (i2 < length) {
                int i9 = size[i2];
                outPosition[i8] = i7;
                i7 += i9;
                i2++;
                i8++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = size[length2];
            outPosition[length2] = i7;
            i7 += i10;
        }
    }

    public final void qie(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        if (size.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i5 : size) {
            i3 += i5;
        }
        float fMax = (totalSize - i3) / Math.max(ArraysKt.getLastIndex(size), 1);
        float f3 = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i7 = size[length];
                outPosition[length] = Math.round(f3);
                f3 += i7 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i8 = 0;
        while (i2 < length2) {
            int i9 = size[i2];
            outPosition[i8] = Math.round(f3);
            f3 += i9 + fMax;
            i2++;
            i8++;
        }
    }

    public final void xMQ(int[] size, int[] outPosition, boolean reverseInput) {
        int i2 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i3 = 0;
            int i5 = 0;
            while (i2 < length) {
                int i7 = size[i2];
                outPosition[i3] = i5;
                i5 += i7;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = size[length2];
            outPosition[length2] = i2;
            i2 += i8;
        }
    }

    public final Horizontal HI(float space, final Alignment.Horizontal alignment) {
        return new SpacedAligned(space, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return n(num.intValue(), layoutDirection);
            }

            public final Integer n(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(alignment.n(0, i2, layoutDirection));
            }
        }, null);
    }

    public final Horizontal J2() {
        return Start;
    }

    public final HorizontalOrVertical O() {
        return SpaceEvenly;
    }

    public final Vertical Uo() {
        return Top;
    }

    public final Vertical n() {
        return Bottom;
    }

    public final HorizontalOrVertical nr() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical rl() {
        return Center;
    }

    public final Horizontal t() {
        return End;
    }

    public final HorizontalOrVertical ty(float space) {
        return new SpacedAligned(space, true, new Function2<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return n(num.intValue(), layoutDirection);
            }

            public final Integer n(int i2, LayoutDirection layoutDirection) {
                return Integer.valueOf(Alignment.INSTANCE.gh().n(0, i2, layoutDirection));
            }
        }, null);
    }

    private Arrangement() {
    }
}
