package Ec7;

import FjR.C;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 implements n {
    @Override // Ec7.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public String n(Uri uri, C c2) {
        if (Intrinsics.areEqual(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            sb.append(kYF.C.gh(c2.Uo().getResources().getConfiguration()));
            return sb.toString();
        }
        return uri.toString();
    }
}
