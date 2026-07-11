package androidx.constraintlayout.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "layoutId", "tag", "t", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Measurable;", "", "rl", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutTag", c.f62177j, "constraintLayoutId", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConstraintLayoutTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,86:1\n135#2:87\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n*L\n46#1:87\n*E\n"})
public final class ConstraintLayoutTagKt {
    public static /* synthetic */ Modifier nr(Modifier modifier, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return t(modifier, str, str2);
    }

    public static final Modifier t(Modifier modifier, final String str, String str2) {
        if (str2 == null) {
            return LayoutIdKt.rl(modifier, str);
        }
        return modifier.Zmq(new ConstraintLayoutTag(str2, str, InspectableValueKt.rl() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                n(inspectorInfo);
                return Unit.INSTANCE;
            }

            public final void n(InspectorInfo inspectorInfo) {
                inspectorInfo.rl("constraintLayoutId");
                inspectorInfo.t(str);
            }
        } : InspectableValueKt.n()));
    }

    public static final Object n(Measurable measurable) {
        ConstraintLayoutTagParentData constraintLayoutTagParentData;
        Object objJ2 = measurable.J2();
        if (objJ2 instanceof ConstraintLayoutTagParentData) {
            constraintLayoutTagParentData = (ConstraintLayoutTagParentData) objJ2;
        } else {
            constraintLayoutTagParentData = null;
        }
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutId();
    }

    public static final Object rl(Measurable measurable) {
        ConstraintLayoutTagParentData constraintLayoutTagParentData;
        Object objJ2 = measurable.J2();
        if (objJ2 instanceof ConstraintLayoutTagParentData) {
            constraintLayoutTagParentData = (ConstraintLayoutTagParentData) objJ2;
        } else {
            constraintLayoutTagParentData = null;
        }
        if (constraintLayoutTagParentData == null) {
            return null;
        }
        return constraintLayoutTagParentData.getConstraintLayoutTag();
    }
}
