package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u001e\u0010'\u001a\u00020\u0013*\u00020\u00128@X\u0080\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", com.safedk.android.utils.j.f63190c, "Landroidx/compose/ui/text/TextLayoutResult;", "O", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/TextLayoutResult;", "", "nr", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "", "id", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/util/List;I)Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/semantics/Role;", "", "xMQ", "(I)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsNode;", "", "Uo", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "KN", "(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroid/view/View;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "rl", "(Landroidx/compose/ui/semantics/SemanticsOwner;)Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Rect;", "getDefaultFakeNodeBounds", "()Landroidx/compose/ui/geometry/Rect;", "DefaultFakeNodeBounds", "J2", "isHidden$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "isHidden", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,256:1\n288#2,2:257\n26#3:259\n26#3:260\n26#3:261\n26#3:262\n26#3:263\n26#3:264\n26#3:265\n26#3:266\n26#3:267\n26#3:268\n26#3:269\n26#3:270\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsUtils_androidKt\n*L\n154#1:257,2\n173#1:259\n174#1:260\n175#1:261\n176#1:262\n190#1:263\n191#1:264\n192#1:265\n193#1:266\n236#1:267\n237#1:268\n238#1:269\n239#1:270\n*E\n"})
public final class SemanticsUtils_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f33056n = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static final TextLayoutResult O(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsConfiguration, SemanticsActions.f33251n.xMQ());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.getAction()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final Float nr(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsConfiguration, SemanticsActions.f33251n.KN());
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.getAction()) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final String xMQ(int i2) {
        Role.Companion companion = Role.INSTANCE;
        if (Role.az(i2, companion.n())) {
            return "android.widget.Button";
        }
        if (Role.az(i2, companion.t())) {
            return "android.widget.CheckBox";
        }
        if (Role.az(i2, companion.J2())) {
            return "android.widget.RadioButton";
        }
        if (Role.az(i2, companion.O())) {
            return "android.widget.ImageView";
        }
        if (Role.az(i2, companion.nr())) {
            return "android.widget.Spinner";
        }
        if (Role.az(i2, companion.xMQ())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final boolean J2(SemanticsNode semanticsNode) {
        if (!semanticsNode.nY()) {
            SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
            if (!unmergedConfig.J2(semanticsProperties.gh()) && !semanticsNode.getUnmergedConfig().J2(semanticsProperties.ck())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final View KN(AndroidViewsHandler androidViewsHandler, int i2) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() == i2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (AndroidViewHolder) entry.getValue();
    }

    public static final boolean Uo(SemanticsNode semanticsNode) {
        if (!J2(semanticsNode)) {
            if (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig().Uo()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final ScrollObservationScope n(List list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((ScrollObservationScope) list.get(i3)).getSemanticsNodeId() == i2) {
                return (ScrollObservationScope) list.get(i3);
            }
        }
        return null;
    }

    public static final IntObjectMap rl(SemanticsOwner semanticsOwner) {
        SemanticsNode semanticsNodeNr = semanticsOwner.nr();
        if (semanticsNodeNr.getLayoutNode().HI() && semanticsNodeNr.getLayoutNode().nr()) {
            MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(48);
            Rect rectXMQ = semanticsNodeNr.xMQ();
            t(new Region(Math.round(rectXMQ.getLeft()), Math.round(rectXMQ.getTop()), Math.round(rectXMQ.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(rectXMQ.xMQ())), semanticsNodeNr, mutableIntObjectMap, semanticsNodeNr, new Region());
            return mutableIntObjectMap;
        }
        return IntObjectMapKt.n();
    }

    private static final void t(Region region, SemanticsNode semanticsNode, MutableIntObjectMap mutableIntObjectMap, SemanticsNode semanticsNode2, Region region2) {
        boolean z2;
        int id;
        Rect rectXMQ;
        LayoutInfo layoutInfoCk;
        if (semanticsNode2.getLayoutNode().HI() && semanticsNode2.getLayoutNode().nr()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z2 || semanticsNode2.getIsFake()) {
                Rect rectS = semanticsNode2.S();
                int iRound = Math.round(rectS.getLeft());
                int iRound2 = Math.round(rectS.getTop());
                int iRound3 = Math.round(rectS.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
                int iRound4 = Math.round(rectS.xMQ());
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (semanticsNode2.getId() == semanticsNode.getId()) {
                    id = -1;
                } else {
                    id = semanticsNode2.getId();
                }
                if (region2.op(region, Region.Op.INTERSECT)) {
                    mutableIntObjectMap.r(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                    List listZ = semanticsNode2.Z();
                    for (int size = listZ.size() - 1; -1 < size; size--) {
                        if (!((SemanticsNode) listZ.get(size)).ty().J2(SemanticsProperties.f33276n.WPU())) {
                            t(region, semanticsNode, mutableIntObjectMap, (SemanticsNode) listZ.get(size), region2);
                        }
                    }
                    if (Uo(semanticsNode2)) {
                        region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (semanticsNode2.getIsFake()) {
                    SemanticsNode semanticsNodeR = semanticsNode2.r();
                    if (semanticsNodeR != null && (layoutInfoCk = semanticsNodeR.ck()) != null && layoutInfoCk.HI()) {
                        rectXMQ = semanticsNodeR.xMQ();
                    } else {
                        rectXMQ = f33056n;
                    }
                    mutableIntObjectMap.r(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(Math.round(rectXMQ.getLeft()), Math.round(rectXMQ.getTop()), Math.round(rectXMQ.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(rectXMQ.xMQ()))));
                    return;
                }
                if (id == -1) {
                    mutableIntObjectMap.r(id, new SemanticsNodeWithAdjustedBounds(semanticsNode2, region2.getBounds()));
                }
            }
        }
    }
}
