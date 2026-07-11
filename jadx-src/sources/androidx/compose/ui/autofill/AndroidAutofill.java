package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroid/view/View;", "view", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/view/View;", "nr", "()Landroid/view/View;", "rl", "Landroidx/compose/ui/autofill/AutofillTree;", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroid/view/autofill/AutofillManager;", "t", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "rootAutofillId", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,148:1\n89#2,7:149\n26#3:156\n26#3:157\n26#3:158\n26#3:159\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill\n*L\n53#1:149,7\n67#1:156\n68#1:157\n69#1:158\n70#1:159\n*E\n"})
public final class AndroidAutofill implements Autofill {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private AutofillId rootAutofillId;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final AutofillTree autofillTree;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final android.view.autofill.AutofillManager autofillManager;

    /* JADX INFO: renamed from: n, reason: from getter */
    public final android.view.autofill.AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    public AndroidAutofill(View view, AutofillTree autofillTree) {
        AutofillId autofillIdN;
        this.view = view;
        this.autofillTree = autofillTree;
        android.view.autofill.AutofillManager autofillManagerN = n.n(view.getContext().getSystemService(j.n()));
        if (autofillManagerN != null) {
            this.autofillManager = autofillManagerN;
            view.setImportantForAutofill(1);
            AutofillIdCompat autofillIdCompatN = ViewCompatShims.n(view);
            if (autofillIdCompatN != null) {
                autofillIdN = autofillIdCompatN.n();
            } else {
                autofillIdN = null;
            }
            if (autofillIdN != null) {
                this.rootAutofillId = autofillIdN;
                return;
            } else {
                InlineClassHelperKt.nr("Required value was null.");
                throw new KotlinNothingValueException();
            }
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
