package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 \n2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "", "<init>", "()V", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "", "rl", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "Landroidx/compose/foundation/content/ReceiveContentListener;", c.f62177j, "()Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ReceiveContentConfiguration {
    public abstract ReceiveContentListener n();

    public final boolean rl(TransferableContent transferableContent) {
        return !Intrinsics.areEqual(n().O(transferableContent), transferableContent);
    }
}
