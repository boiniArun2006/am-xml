package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorValueInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Stable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0002\b\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalConsumerImpl;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "scope", "", "Lp6", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "t", "Lkotlin/jvm/functions/Function1;", "getConsumer", "()Lkotlin/jvm/functions/Function1;", "consumer", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Function1 consumer;

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void Lp6(ModifierLocalReadScope scope) {
        this.consumer.invoke(scope);
    }

    public boolean equals(Object other) {
        return (other instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) other).consumer == this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }
}
