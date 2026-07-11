package androidx.compose.ui.tooling;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.C1561ViewTreeLifecycleOwner;
import androidx.view.compose.LocalActivityResultRegistryOwner;
import androidx.view.compose.LocalOnBackPressedDispatcherOwner;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u000b*\u0003tx|\b\u0000\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u0004\u0018\u00010\u0012*\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\"\u0010\"\u001a\u00020\n2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0002\b H\u0003¢\u0006\u0004\b\"\u0010#J7\u0010)\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0019H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010\fJ\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R(\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00100R\u0016\u0010L\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00107R\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR!\u0010S\u001a\r\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0002\b 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR+\u0010!\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0002\b 0T8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bU\u0010V\u0012\u0004\bW\u0010\fR\u0016\u0010Y\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00107R\u0016\u0010[\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00107R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u00100R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\"\u0010f\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u00107\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR(\u0010s\u001a\u00020k8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\bl\u0010m\u0012\u0004\br\u0010\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010w\u001a\u00020t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u00020\u0012*\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0085\u0001\u001a\u00020\u0019*\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0086\u0001"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroidx/compose/ui/tooling/data/Group;", "", "ty", "(Landroidx/compose/ui/tooling/data/Group;)Z", "Ik", "Landroidx/compose/ui/tooling/ViewInfo;", "o", "(Landroidx/compose/ui/tooling/data/Group;)Landroidx/compose/ui/tooling/ViewInfo;", "", "r", "()V", "Uo", "KN", "az", "Landroidx/compose/ui/unit/IntRect;", "box", "", "mUb", "(Landroidx/compose/ui/tooling/data/Group;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/String;", "", "Ljava/lang/reflect/Method;", "xMQ", "(Ljava/lang/Object;)Ljava/lang/reflect/Method;", "", "x", "y", "ck", "(Ljava/lang/Object;II)Ljava/lang/String;", "HI", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "onLayout", "(ZIIII)V", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Ljava/lang/String;", "TAG", "Landroidx/compose/ui/platform/ComposeView;", "t", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "O", "Z", "debugViewInfos", "J2", "debugPaintBounds", "", "Ljava/util/List;", "getViewInfos$ui_tooling_release", "()Ljava/util/List;", "setViewInfos$ui_tooling_release", "(Ljava/util/List;)V", "viewInfos", "getDesignInfoList$ui_tooling_release", "setDesignInfoList$ui_tooling_release", "designInfoList", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "S", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "slotTableRecord", "g", "composableName", "E2", "hasAnimations", "Landroidx/compose/ui/tooling/ThreadSafeException;", "e", "Landroidx/compose/ui/tooling/ThreadSafeException;", "delayedException", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/jvm/functions/Function2;", "previewComposition", "Landroidx/compose/runtime/MutableState;", "N", "Landroidx/compose/runtime/MutableState;", "getContent$annotations", "v", "forceCompositionInvalidation", "Xw", "lookForDesignInfoProviders", "jB", "designInfoProvidersArgument", "U", "Lkotlin/jvm/functions/Function0;", "onDraw", "P5", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "stitchTrees", "Landroid/graphics/Paint;", "M7", "Landroid/graphics/Paint;", "debugBoundsPaint", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "p5", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "getClock$ui_tooling_release$annotations", "clock", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "eF", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "E", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "M", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "FakeActivityResultRegistryOwner", "gh", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "fileName", "qie", "(Landroidx/compose/ui/tooling/data/Group;)I", JavetError.PARAMETER_LINE_NUMBER, "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n766#2:643\n857#2,2:644\n1549#2:646\n1620#2,3:647\n1549#2:650\n1620#2,3:651\n1549#2:654\n1620#2,3:655\n1549#2:658\n1620#2,3:659\n1360#2:662\n1446#2,2:663\n1603#2,9:665\n1855#2:674\n1856#2:676\n1612#2:677\n1448#2,3:678\n1747#2,3:681\n1360#2:685\n1446#2,5:686\n1855#2,2:691\n1#3:675\n1#3:684\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ComposeViewAdapter\n*L\n238#1:643\n238#1:644,2\n238#1:646\n238#1:647,3\n253#1:650\n253#1:651,3\n289#1:654\n289#1:655,3\n304#1:658\n304#1:659,3\n307#1:662\n307#1:663,2\n315#1:665,9\n315#1:674\n315#1:676\n315#1:677\n307#1:678,3\n326#1:681,3\n381#1:685\n381#1:686,5\n382#1:691,2\n315#1:675\n*E\n"})
public final class ComposeViewAdapter extends FrameLayout {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public boolean hasAnimations;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public boolean debugPaintBounds;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    public final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    public final Paint debugBoundsPaint;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public final MutableState content;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public boolean debugViewInfos;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public boolean stitchTrees;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final CompositionDataRecord slotTableRecord;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public Function2 previewComposition;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public Function0 onDraw;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public boolean lookForDesignInfoProviders;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final ThreadSafeException delayedException;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    public final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String composableName;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public String designInfoProvidersArgument;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public List designInfoList;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    public PreviewAnimationClock clock;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public List viewInfos;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final ComposeView composeView;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean forceCompositionInvalidation;

    @VisibleForTesting
    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    private final void HI() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapter_androidKt.f33937n.rl());
        this.content.setValue(this.previewComposition);
        invalidate();
    }

    private final void KN() {
        Set store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.rl((CompositionData) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> listRl = PreviewUtils_androidKt.rl((Group) it2.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Group group) {
                    boolean z2;
                    if (Intrinsics.areEqual(group.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "remember") || !this.f33969n.az(group)) {
                        Collection<Group> children = group.getChildren();
                        ComposeViewAdapter composeViewAdapter = this.f33969n;
                        if (!(children instanceof Collection) || !children.isEmpty()) {
                            for (Group group2 : children) {
                                if (Intrinsics.areEqual(group2.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String(), "remember") && composeViewAdapter.az(group2)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                    } else {
                        z2 = true;
                        break;
                    }
                    return Boolean.valueOf(z2);
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (Group group : listRl) {
                String strMUb = mUb(group, group.getBox());
                if (strMUb == null) {
                    Iterator it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            strMUb = null;
                            break;
                        }
                        String strMUb2 = mUb((Group) it3.next(), group.getBox());
                        if (strMUb2 != null) {
                            strMUb = strMUb2;
                            break;
                        }
                    }
                }
                if (strMUb != null) {
                    arrayList3.add(strMUb);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    private final void Uo() {
        Set store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.rl((CompositionData) it.next()));
        }
        boolean z2 = this.clock != null;
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling_release();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling_release((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        boolean zJ2 = animationSearch.J2(arrayList);
        this.hasAnimations = zJ2;
        if (z2 && zJ2) {
            animationSearch.nr(arrayList);
        }
    }

    private final ViewInfo o(Group group) {
        String sourceFile;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && ty(group) && layoutInfo == null) {
            return o((Group) CollectionsKt.single(group.getChildren()));
        }
        Collection children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!Ik((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(o((Group) it.next()));
        }
        SourceLocation location = group.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            sourceFile = "";
        }
        String str = sourceFile;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList2, layoutInfo);
    }

    private final void r() {
        Set store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(o(SlotTreeKt.rl((CompositionData) it.next())));
        }
        List list = CollectionsKt.toList(arrayList);
        if (this.stitchTrees) {
            list = ShadowViewInfo_androidKt.n(list);
        }
        this.viewInfos = list;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtil_androidKt.t(list, 0, null, 3, null));
        }
    }

    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    /* JADX INFO: renamed from: getStitchTrees$ui_tooling_release, reason: from getter */
    public final boolean getStitchTrees() {
        return this.stitchTrees;
    }

    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        C1561ViewTreeLifecycleOwner.rl(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    public final void setClock$ui_tooling_release(PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling_release(List<String> list) {
        this.designInfoList = list;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z2) {
        this.stitchTrees = z2;
    }

    public final void setViewInfos$ui_tooling_release(List<ViewInfo> list) {
        this.viewInfos = list;
    }

    private final boolean Ik(Group group) {
        NodeGroup nodeGroup;
        Object node;
        if (ty(group) && group.getChildren().isEmpty()) {
            LayoutInfo layoutInfo = null;
            if (group instanceof NodeGroup) {
                nodeGroup = (NodeGroup) group;
            } else {
                nodeGroup = null;
            }
            if (nodeGroup != null) {
                node = nodeGroup.getNode();
            } else {
                node = null;
            }
            if (node instanceof LayoutInfo) {
                layoutInfo = (LayoutInfo) node;
            }
            if (layoutInfo == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean az(Group group) {
        Method methodXMQ;
        Collection data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        for (Object obj : data) {
            if (obj != null) {
                methodXMQ = xMQ(obj);
            } else {
                methodXMQ = null;
            }
            if (methodXMQ != null) {
                return true;
            }
        }
        return false;
    }

    private final String ck(Object obj, int i2, int i3) {
        Method methodXMQ = xMQ(obj);
        if (methodXMQ == null) {
            return null;
        }
        try {
            Object objInvoke = methodXMQ.invoke(obj, Integer.valueOf(i2), Integer.valueOf(i3), this.designInfoProvidersArgument);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) objInvoke;
            if (str.length() == 0) {
                return null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    private final String gh(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        if (location != null && (sourceFile = location.getSourceFile()) != null) {
            return sourceFile;
        }
        return "";
    }

    private final String mUb(Group group, IntRect intRect) {
        String strCk;
        Iterator it = group.getData().iterator();
        do {
            strCk = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                strCk = ck(next, intRect.getLeft(), intRect.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
            }
        } while (strCk == null);
        return strCk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(final Function2 function2, Composer composer, final int i2) {
        int i3;
        boolean z2;
        int i5;
        int i7;
        Composer composerKN = composer.KN(522143116);
        if ((i2 & 6) == 0) {
            if (composerKN.E2(function2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.E2(this)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(522143116, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:402)");
            }
            CompositionLocalKt.t(new ProvidedValue[]{CompositionLocalsKt.xMQ().nr(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.KN().nr(FontFamilyResolver_androidKt.n(getContext())), LocalOnBackPressedDispatcherOwner.f13286n.rl(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.f13282n.n(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.nr(-1475548980, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    if (!composer2.HI((i8 & 3) != 2, i8 & 1)) {
                        composer2.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1475548980, i8, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:413)");
                    }
                    InspectableKt.rl(this.f33964n.slotTableRecord, function2, composer2, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composerKN, 54), composerKN, ProvidedValue.xMQ | 48);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    this.f33967n.n(function2, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    private final int qie(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean ty(Group group) {
        if (gh(group).length() == 0 && qie(group) == -1) {
            return true;
        }
        return false;
    }

    private final Method xMQ(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation) {
            HI();
        }
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(viewInfo), (Iterable) viewInfo.n()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.KN()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.delayedException.rl();
        r();
        if (this.composableName.length() > 0) {
            Uo();
            if (this.lookForDesignInfoProviders) {
                KN();
            }
        }
    }
}
