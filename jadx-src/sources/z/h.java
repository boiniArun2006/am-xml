package z;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h extends AbstractC2473c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String code, String tag, boolean z2) {
        super(35633, code, tag, z2);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    public /* synthetic */ h(String str, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z2);
    }
}
