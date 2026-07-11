package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.text.AnnotatedString;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u0016\u0010\nR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b \u0010\nR&\u0010.\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\b\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010\nR\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b0\u0010\nR&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\b\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010\nR\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b%\u0010\nR\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020<0\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b>\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\b\u001a\u0004\b)\u0010\nR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020@0\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bD\u0010\nR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\bA\u0010\nR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\b\u001a\u0004\b:\u0010\nR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020I0\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\bM\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\bG\u0010\nR#\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u00050\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\b\u001a\u0004\bR\u0010\nR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\bT\u0010\nR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b2\u0010\nR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020P0\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b[\u0010\nR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\b\u001a\u0004\b+\u0010\nR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\bX\u0010\nR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020`0\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\b\u001a\u0004\ba\u0010\nR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\b\u001a\u0004\b\u001e\u0010\nR)\u0010g\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020f0e0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b/\u0010\nR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\b=\u0010\nR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020f0\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\b\u001a\u0004\bL\u0010\n¨\u0006k"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "rl", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "nr", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "t", "e", "StateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "te", "ProgressBarRangeInfo", "O", "nY", "PaneTitle", "", "J2", "fD", "SelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "Uo", c.f62177j, "CollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "KN", "CollectionItemInfo", "xMQ", "mUb", "Heading", "Disabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "gh", "aYN", "LiveRegion", "", "qie", "Focused", "az", "Ik", "getIsContainer$annotations", "IsContainer", "ty", "S", "IsTraversalGroup", "HI", "ck", "getInvisibleToUser$annotations", "InvisibleToUser", "HideFromAccessibility", "Landroidx/compose/ui/autofill/ContentType;", "ContentType", "Landroidx/compose/ui/autofill/ContentDataType;", "r", "ContentDataType", "", "o", "wTp", "TraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "Z", "HorizontalScrollAxisRange", "XQ", "v", "VerticalScrollAxisRange", "IsPopup", "WPU", "IsDialog", "Landroidx/compose/ui/semantics/Role;", "iF", "Role", "ViF", "X", "TestTag", "LinkTestMarker", "Landroidx/compose/ui/text/AnnotatedString;", "g", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Text", "nHg", "TextSubstitution", "IsShowingTextSubstitution", "InputText", "E2", "EditableText", "Landroidx/compose/ui/text/TextRange;", "N", "TextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "ImeAction", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "s7N", "ToggleableState", "Password", "Error", "Lkotlin/Function1;", "", "IndexForKey", "IsEditable", "rV9", "MaxTextLength", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsProperties {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SemanticsProperties f33276n = new SemanticsProperties();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ContentDescription = SemanticsPropertiesKt.rl("ContentDescription", new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey StateDescription = SemanticsPropertiesKt.n("StateDescription");

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ProgressBarRangeInfo = SemanticsPropertiesKt.n("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey PaneTitle = SemanticsPropertiesKt.rl("PaneTitle", new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final SemanticsPropertyKey SelectableGroup = SemanticsPropertiesKt.n("SelectableGroup");

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final SemanticsPropertyKey CollectionInfo = SemanticsPropertiesKt.n("CollectionInfo");

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final SemanticsPropertyKey CollectionItemInfo = SemanticsPropertiesKt.n("CollectionItemInfo");

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Heading = SemanticsPropertiesKt.n("Heading");

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Disabled = SemanticsPropertiesKt.n("Disabled");

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final SemanticsPropertyKey LiveRegion = SemanticsPropertiesKt.n("LiveRegion");

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Focused = SemanticsPropertiesKt.n("Focused");

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final SemanticsPropertyKey IsContainer = SemanticsPropertiesKt.n("IsContainer");

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private static final SemanticsPropertyKey IsTraversalGroup = new SemanticsPropertyKey("IsTraversalGroup", null, 2, null);

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private static final SemanticsPropertyKey InvisibleToUser = new SemanticsPropertyKey("InvisibleToUser", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private static final SemanticsPropertyKey HideFromAccessibility = new SemanticsPropertyKey("HideFromAccessibility", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private static final SemanticsPropertyKey ContentType = new SemanticsPropertyKey("ContentType", new Function2<ContentType, ContentType, ContentType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey ContentDataType = new SemanticsPropertyKey("ContentDataType", new Function2<ContentDataType, ContentDataType, ContentDataType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return contentDataType;
        }
    });

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey TraversalIndex = new SemanticsPropertyKey("TraversalIndex", new Function2<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float n(Float f3, float f4) {
            return f3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f3, Float f4) {
            return n(f3, f4.floatValue());
        }
    });

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey HorizontalScrollAxisRange = SemanticsPropertiesKt.n("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private static final SemanticsPropertyKey VerticalScrollAxisRange = SemanticsPropertiesKt.n("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey IsPopup = SemanticsPropertiesKt.rl("IsPopup", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private static final SemanticsPropertyKey IsDialog = SemanticsPropertiesKt.rl("IsDialog", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Role = SemanticsPropertiesKt.rl("Role", new Function2<Role, Role, Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        public final Role n(Role role, int i2) {
            return role;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Role invoke(Role role, Role role2) {
            return n(role, role2.getValue());
        }
    });

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private static final SemanticsPropertyKey TestTag = new SemanticsPropertyKey("TestTag", false, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private static final SemanticsPropertyKey LinkTestMarker = new SemanticsPropertyKey("LinkTestMarker", false, new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey Text = SemanticsPropertiesKt.rl("Text", new Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private static final SemanticsPropertyKey TextSubstitution = new SemanticsPropertyKey("TextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private static final SemanticsPropertyKey IsShowingTextSubstitution = new SemanticsPropertyKey("IsShowingTextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private static final SemanticsPropertyKey InputText = SemanticsPropertiesKt.n("InputText");

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private static final SemanticsPropertyKey EditableText = SemanticsPropertiesKt.n("EditableText");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey TextSelectionRange = SemanticsPropertiesKt.n("TextSelectionRange");

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey ImeAction = SemanticsPropertiesKt.n("ImeAction");

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey Selected = SemanticsPropertiesKt.n("Selected");

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey ToggleableState = SemanticsPropertiesKt.n("ToggleableState");

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Password = SemanticsPropertiesKt.n("Password");

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private static final SemanticsPropertyKey Error = SemanticsPropertiesKt.n("Error");

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private static final SemanticsPropertyKey IndexForKey = new SemanticsPropertyKey("IndexForKey", null, 2, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final SemanticsPropertyKey IsEditable = new SemanticsPropertyKey("IsEditable", null, 2, null);

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private static final SemanticsPropertyKey MaxTextLength = new SemanticsPropertyKey("MaxTextLength", null, 2, null);
    public static final int bzg = 8;

    public final SemanticsPropertyKey E2() {
        return Selected;
    }

    public final SemanticsPropertyKey HI() {
        return InputText;
    }

    public final SemanticsPropertyKey Ik() {
        return IsContainer;
    }

    public final SemanticsPropertyKey J2() {
        return Disabled;
    }

    public final SemanticsPropertyKey KN() {
        return Error;
    }

    public final SemanticsPropertyKey N() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey O() {
        return ContentType;
    }

    public final SemanticsPropertyKey S() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey T() {
        return Text;
    }

    public final SemanticsPropertyKey Uo() {
        return EditableText;
    }

    public final SemanticsPropertyKey ViF() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey WPU() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey X() {
        return TestTag;
    }

    public final SemanticsPropertyKey XQ() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey Z() {
        return IsPopup;
    }

    public final SemanticsPropertyKey aYN() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey az() {
        return ImeAction;
    }

    public final SemanticsPropertyKey ck() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey e() {
        return StateDescription;
    }

    public final SemanticsPropertyKey fD() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey g() {
        return Password;
    }

    public final SemanticsPropertyKey gh() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey iF() {
        return Role;
    }

    public final SemanticsPropertyKey mUb() {
        return Heading;
    }

    public final SemanticsPropertyKey n() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey nHg() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey nY() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey nr() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey o() {
        return IsEditable;
    }

    public final SemanticsPropertyKey qie() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey r() {
        return IsDialog;
    }

    public final SemanticsPropertyKey rl() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey s7N() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey t() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey te() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey ty() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey v() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey wTp() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey xMQ() {
        return Focused;
    }

    private SemanticsProperties() {
    }
}
