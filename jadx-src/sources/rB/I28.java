package rB;

import ajd.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {
    public static final void n(Ml ml, List category, j.EnumC0481j severity, String str, String str2, pq.Ml info) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(info, "info");
        ml.t(new ajd.j(category, severity, str, str2, info));
    }

    public static /* synthetic */ void rl(Ml ml, List list, j.EnumC0481j enumC0481j, String str, String str2, pq.Ml ml2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            enumC0481j = j.EnumC0481j.f13105t;
        }
        j.EnumC0481j enumC0481j2 = enumC0481j;
        String str3 = (i2 & 4) != 0 ? null : str;
        String str4 = (i2 & 8) != 0 ? null : str2;
        if ((i2 & 16) != 0) {
            ml2 = new pq.Ml();
        }
        n(ml, list, enumC0481j2, str3, str4, ml2);
    }
}
