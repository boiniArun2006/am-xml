package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000eR+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/PasswordInputTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Lkotlin/Function0;", "", "scheduleHide", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "B", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "rl", "()V", "Lkotlin/jvm/functions/Function0;", "getScheduleHide", "()Lkotlin/jvm/functions/Function0;", "", "<set-?>", "t", "Landroidx/compose/runtime/MutableIntState;", c.f62177j, "()I", "(I)V", "revealCodepointIndex", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,373:1\n78#2:374\n107#2,2:375\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text/PasswordInputTransformation\n*L\n266#1:374\n266#1:375,2\n*E\n"})
public final class PasswordInputTransformation implements InputTransformation {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 scheduleHide;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState revealCodepointIndex = SnapshotIntStateKt.n(-1);

    public final void rl() {
        t(-1);
    }

    private final void t(int i2) {
        this.revealCodepointIndex.KN(i2);
    }

    public final int n() {
        return this.revealCodepointIndex.J2();
    }

    public PasswordInputTransformation(Function0 function0) {
        this.scheduleHide = function0;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public void B(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.J2().rl() == 1 && TextRange.mUb(textFieldBuffer.J2().t(0)) == 1 && TextRange.mUb(textFieldBuffer.J2().n(0)) == 0 && !textFieldBuffer.ty()) {
            int iQie = TextRange.qie(textFieldBuffer.J2().t(0));
            if (n() != iQie) {
                this.scheduleHide.invoke();
                t(iQie);
                return;
            }
            return;
        }
        t(-1);
    }
}
