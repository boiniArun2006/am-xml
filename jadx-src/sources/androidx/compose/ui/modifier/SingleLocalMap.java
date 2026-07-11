package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R/\u0010\u0007\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "", "t", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "rl", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "", c.f62177j, "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", "Landroidx/compose/ui/modifier/ModifierLocal;", "", "<set-?>", "Landroidx/compose/runtime/MutableState;", "nr", "()Ljava/lang/Object;", "O", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,235:1\n85#2:236\n113#2,2:237\n65#3,5:239\n65#3,5:244\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:236\n44#1:237,2\n51#1:239,5\n57#1:244,5\n*E\n"})
public final class SingleLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ModifierLocal key;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableState value;

    public SingleLocalMap(ModifierLocal modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
    }

    private final void O(Object obj) {
        this.value.setValue(obj);
    }

    private final Object nr() {
        return this.value.getValue();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean n(ModifierLocal key) {
        return key == this.key;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public Object rl(ModifierLocal key) {
        if (!(key == this.key)) {
            InlineClassHelperKt.t("Check failed.");
        }
        Object objNr = nr();
        if (objNr == null) {
            return null;
        }
        return objNr;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public void t(ModifierLocal key, Object value) {
        if (!(key == this.key)) {
            InlineClassHelperKt.t("Check failed.");
        }
        O(value);
    }
}
