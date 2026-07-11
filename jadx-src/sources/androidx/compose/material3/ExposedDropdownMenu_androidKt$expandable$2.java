package androidx.compose.material3;

import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", c.f62177j, "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V"}, k = 3, mv = {1, 8, 0})
final class ExposedDropdownMenu_androidKt$expandable$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ String f25837O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ SoftwareKeyboardController f25838Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f25839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Function0 f25840o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f25841r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f25842t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        n(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (MenuAnchorType.Uo(this.f25839n, MenuAnchorType.INSTANCE.t())) {
            SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.n());
            SemanticsPropertiesKt.ul(semanticsPropertyReceiver, this.f25842t ? this.f25837O : this.J2);
            SemanticsPropertiesKt.I(semanticsPropertyReceiver, this.f25841r);
        } else {
            SemanticsPropertiesKt.C(semanticsPropertyReceiver, Role.INSTANCE.nr());
        }
        final Function0 function0 = this.f25840o;
        final String str = this.f25839n;
        final SoftwareKeyboardController softwareKeyboardController = this.f25838Z;
        SemanticsPropertiesKt.te(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$expandable$2.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                SoftwareKeyboardController softwareKeyboardController2;
                function0.invoke();
                if (MenuAnchorType.Uo(str, MenuAnchorType.INSTANCE.n()) && (softwareKeyboardController2 = softwareKeyboardController) != null) {
                    softwareKeyboardController2.show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
    }
}
