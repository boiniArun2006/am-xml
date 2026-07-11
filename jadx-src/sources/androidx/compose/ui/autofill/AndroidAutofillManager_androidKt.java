package androidx.compose.ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "nr", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "O", "J2", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidAutofillManager_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J2(SemanticsConfiguration semanticsConfiguration) {
        if (!semanticsConfiguration.getProps().rl(SemanticsActions.f33251n.gh())) {
            MutableScatterMap props = semanticsConfiguration.getProps();
            SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
            if (!props.rl(semanticsProperties.O()) && !semanticsConfiguration.getProps().rl(semanticsProperties.t())) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps().rl(SemanticsProperties.f33276n.O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps().rl(SemanticsActions.f33251n.gh());
    }
}
