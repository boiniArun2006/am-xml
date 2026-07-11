package USj;

import FjR.C;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements Ml {
    private final boolean rl(int i2, Context context) {
        return context.getResources().getResourceEntryName(i2) != null;
    }

    @Override // USj.Ml
    public /* bridge */ /* synthetic */ Object n(Object obj, C c2) {
        return t(((Number) obj).intValue(), c2);
    }

    public Uri t(int i2, C c2) {
        if (!rl(i2, c2.Uo())) {
            return null;
        }
        return Uri.parse("android.resource://" + c2.Uo().getPackageName() + '/' + i2);
    }
}
