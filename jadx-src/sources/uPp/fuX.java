package uPp;

import com.google.android.exoplayer2.Format;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import uPp.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class fuX {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(String str) {
        return StringsKt.startsWith$default(str, "video", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(String str) {
        return StringsKt.startsWith$default(str, "audio", false, 2, (Object) null);
    }

    public static final CN3 O(Format format, int i2) {
        Intrinsics.checkNotNullParameter(format, "<this>");
        String str = format.sampleMimeType;
        if (str == null) {
            return null;
        }
        if (nr(str)) {
            return CN3.n.qie.n(format, i2);
        }
        if (t(str)) {
            return CN3.j.Uo.n(format, i2);
        }
        return null;
    }
}
