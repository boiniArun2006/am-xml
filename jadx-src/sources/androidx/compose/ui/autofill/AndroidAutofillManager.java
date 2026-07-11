package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.AnnotatedString;
import com.caoccao.javet.values.reference.IV8ValueMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010&J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010E¨\u0006G"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "platformAutofillManager", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroid/view/View;", "view", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", "packageName", "<init>", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;Landroidx/compose/ui/semantics/SemanticsOwner;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "previous", "current", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "rl", "(Landroidx/compose/ui/semantics/SemanticsInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "qie", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", IV8ValueMap.FUNCTION_VALUES, "gh", "(Landroid/util/SparseArray;)V", "az", "(Landroidx/compose/ui/semantics/SemanticsInfo;)V", "xMQ", "", "previousSemanticsId", "mUb", "(Landroidx/compose/ui/semantics/SemanticsInfo;I)V", "KN", "J2", "Uo", "()V", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "O", "()Landroidx/compose/ui/autofill/PlatformAutofillManager;", "setPlatformAutofillManager", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;)V", "Landroidx/compose/ui/semantics/SemanticsOwner;", "t", "Landroid/view/View;", "nr", "Landroidx/compose/ui/spatial/RectManager;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "reusableRect", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "Landroidx/collection/MutableIntSet;", "Landroidx/collection/MutableIntSet;", "currentlyDisplayedIDs", "", "Z", "pendingAutofillCommit", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nAndroidAutofillManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,314:1\n89#2,7:315\n80#3:322\n80#3:323\n34#4,6:324\n*S KotlinDebug\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n*L\n69#1:315,7\n172#1:322\n173#1:323\n175#1:324,6\n*E\n"})
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Rect reusableRect = new Rect();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private MutableIntSet currentlyDisplayedIDs;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private AutofillId rootAutofillId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private PlatformAutofillManager platformAutofillManager;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final RectManager rectManager;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SemanticsOwner semanticsOwner;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean pendingAutofillCommit;

    @Override // androidx.compose.ui.focus.FocusListener
    public void n(FocusTargetModifierNode previous, FocusTargetModifierNode current) {
        SemanticsInfo semanticsInfoIk;
        SemanticsConfiguration semanticsConfigurationD;
        SemanticsInfo semanticsInfoIk2;
        SemanticsConfiguration semanticsConfigurationD2;
        if (previous != null && (semanticsInfoIk2 = DelegatableNodeKt.Ik(previous)) != null && (semanticsConfigurationD2 = semanticsInfoIk2.D()) != null && AndroidAutofillManager_androidKt.nr(semanticsConfigurationD2)) {
            this.platformAutofillManager.rl(this.view, semanticsInfoIk2.getSemanticsId());
        }
        if (current == null || (semanticsInfoIk = DelegatableNodeKt.Ik(current)) == null || (semanticsConfigurationD = semanticsInfoIk.D()) == null || !AndroidAutofillManager_androidKt.nr(semanticsConfigurationD)) {
            return;
        }
        final int semanticsId = semanticsInfoIk.getSemanticsId();
        this.rectManager.getRects().qie(semanticsId, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                n(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2, int i3, int i5, int i7) {
                this.f31114n.getPlatformAutofillManager().O(this.f31114n.view, semanticsId, new Rect(i2, i3, i5, i7));
            }
        });
    }

    public final void J2(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.r(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.nr(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void KN(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.r(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.nr(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void Uo() {
        if (this.currentlyDisplayedIDs.t() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.nr()) {
            this.pendingAutofillCommit = true;
        }
    }

    public final void az(final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().qie(semanticsInfo.getSemanticsId(), new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                n(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2, int i3, int i5, int i7) {
                this.f31118n.reusableRect.set(i2, i3, i5, i7);
                this.f31118n.getPlatformAutofillManager().t(this.f31118n.view, semanticsInfo.getSemanticsId(), this.f31118n.reusableRect);
            }
        });
    }

    public final void mUb(SemanticsInfo semanticsInfo, int previousSemanticsId) {
        if (this.currentlyDisplayedIDs.r(previousSemanticsId)) {
            this.platformAutofillManager.nr(this.view, previousSemanticsId, false);
        }
        SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
        if (semanticsConfigurationD == null || !AndroidAutofillManager_androidKt.O(semanticsConfigurationD)) {
            return;
        }
        this.currentlyDisplayedIDs.Uo(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.nr(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void qie(ViewStructure rootViewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f31121n;
        SemanticsInfo semanticsInfoT = this.semanticsOwner.t();
        PopulateViewStructure_androidKt.n(rootViewStructure, semanticsInfoT, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListKN = ObjectListKt.KN(semanticsInfoT, rootViewStructure);
        while (mutableObjectListKN.KN()) {
            Object objG = mutableObjectListKN.g(mutableObjectListKN._size - 1);
            Intrinsics.checkNotNull(objG, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure = (ViewStructure) objG;
            Object objG2 = mutableObjectListKN.g(mutableObjectListKN._size - 1);
            Intrinsics.checkNotNull(objG2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List listA = ((SemanticsInfo) objG2).a();
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsInfo semanticsInfo = (SemanticsInfo) listA.get(i2);
                if (!semanticsInfo.getIsDeactivated() && semanticsInfo.nr() && semanticsInfo.HI()) {
                    SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
                    if (semanticsConfigurationD == null || !AndroidAutofillManager_androidKt.J2(semanticsConfigurationD)) {
                        mutableObjectListKN.ty(semanticsInfo);
                        mutableObjectListKN.ty(viewStructure);
                    } else {
                        ViewStructure viewStructureUo = autofillApi26Helper.Uo(viewStructure, autofillApi26Helper.n(viewStructure, 1));
                        PopulateViewStructure_androidKt.n(viewStructureUo, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                        mutableObjectListKN.ty(semanticsInfo);
                        mutableObjectListKN.ty(viewStructureUo);
                    }
                }
            }
        }
    }

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        AutofillId autofillIdN;
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillIdCompatN = ViewCompatShims.n(view);
        if (autofillIdCompatN != null) {
            autofillIdN = autofillIdCompatN.n();
        } else {
            autofillIdN = null;
        }
        if (autofillIdN != null) {
            this.rootAutofillId = autofillIdN;
            this.currentlyDisplayedIDs = new MutableIntSet(0, 1, null);
        } else {
            InlineClassHelperKt.nr("Required value was null.");
            throw new KotlinNothingValueException();
        }
    }

    public final void gh(SparseArray values) {
        SemanticsConfiguration semanticsConfigurationD;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        int size = values.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = values.keyAt(i2);
            AutofillValue autofillValueN = Ml.n(values.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f31121n;
            if (autofillApi26Helper.O(autofillValueN)) {
                SemanticsInfo semanticsInfoN = this.semanticsOwner.n(iKeyAt);
                if (semanticsInfoN != null && (semanticsConfigurationD = semanticsInfoN.D()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsConfigurationD, SemanticsActions.f33251n.gh())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            } else if (autofillApi26Helper.t(autofillValueN)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.nr(autofillValueN)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.J2(autofillValueN)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    @Override // androidx.compose.ui.semantics.SemanticsListener
    public void rl(SemanticsInfo semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        String text;
        String text2;
        boolean z2;
        Boolean bool;
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
        final int semanticsId = semanticsInfo.getSemanticsId();
        Boolean bool2 = null;
        if (previousSemanticsConfiguration != null && (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.n(previousSemanticsConfiguration, SemanticsProperties.f33276n.HI())) != null) {
            text = annotatedString2.getText();
        } else {
            text = null;
        }
        if (semanticsConfigurationD != null && (annotatedString = (AnnotatedString) SemanticsConfigurationKt.n(semanticsConfigurationD, SemanticsProperties.f33276n.HI())) != null) {
            text2 = annotatedString.getText();
        } else {
            text2 = null;
        }
        boolean z3 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.nr(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.nr(this.view, semanticsId, false);
            } else if (Intrinsics.areEqual((ContentDataType) SemanticsConfigurationKt.n(semanticsConfigurationD, SemanticsProperties.f33276n.t()), ContentDataType.INSTANCE.n())) {
                this.platformAutofillManager.n(this.view, semanticsId, AutofillApi26Helper.f31121n.rl(text2.toString()));
            }
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            if (previousSemanticsConfiguration != null) {
                bool = (Boolean) SemanticsConfigurationKt.n(previousSemanticsConfiguration, SemanticsProperties.f33276n.xMQ());
            } else {
                bool = null;
            }
            if (semanticsConfigurationD != null) {
                bool2 = (Boolean) SemanticsConfigurationKt.n(semanticsConfigurationD, SemanticsProperties.f33276n.xMQ());
            }
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, bool3) && AndroidAutofillManager_androidKt.nr(semanticsConfigurationD)) {
                this.rectManager.getRects().qie(semanticsId, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onSemanticsChanged$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                        n(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void n(int i2, int i3, int i5, int i7) {
                        this.f31116n.getPlatformAutofillManager().O(this.f31116n.view, semanticsId, new Rect(i2, i3, i5, i7));
                    }
                });
            }
            if (Intrinsics.areEqual(bool, bool3) && !Intrinsics.areEqual(bool2, bool3) && AndroidAutofillManager_androidKt.nr(previousSemanticsConfiguration)) {
                this.platformAutofillManager.rl(this.view, semanticsId);
            }
        }
        if (previousSemanticsConfiguration != null && AndroidAutofillManager_androidKt.O(previousSemanticsConfiguration)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (semanticsConfigurationD != null && AndroidAutofillManager_androidKt.O(semanticsConfigurationD)) {
            z3 = true;
        }
        if (z2 != z3) {
            if (z3) {
                this.currentlyDisplayedIDs.Uo(semanticsId);
            } else {
                this.currentlyDisplayedIDs.r(semanticsId);
            }
        }
    }

    public final void xMQ(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfigurationD = semanticsInfo.D();
        if (semanticsConfigurationD != null && AndroidAutofillManager_androidKt.O(semanticsConfigurationD)) {
            this.currentlyDisplayedIDs.Uo(semanticsInfo.getSemanticsId());
            this.platformAutofillManager.nr(this.view, semanticsInfo.getSemanticsId(), true);
        }
    }
}
