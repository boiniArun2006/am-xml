package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/ClipEntry;", "", c.f62177j, "(Landroidx/compose/ui/platform/ClipEntry;)Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferableContent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferableContent.android.kt\nandroidx/compose/foundation/content/TransferableContent_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class TransferableContent_androidKt {
    public static final String n(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount; i2++) {
            if (!z2 && clipEntry.getClipData().getItemAt(i2).getText() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipEntry.getClipData().getItemCount();
            boolean z3 = false;
            for (int i3 = 0; i3 < itemCount2; i3++) {
                CharSequence text = clipEntry.getClipData().getItemAt(i3).getText();
                if (text != null) {
                    if (z3) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z3 = true;
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        return null;
    }
}
