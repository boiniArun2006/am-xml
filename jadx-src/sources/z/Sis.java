package z;

import android.net.Uri;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Sis implements cA {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cA[] f76281n;

    public Sis(cA... caches) {
        Intrinsics.checkNotNullParameter(caches, "caches");
        this.f76281n = caches;
        if (caches.length == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // z.cA
    public g9s n(Uri mediaId, long j2, int i2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        for (cA cAVar : this.f76281n) {
            g9s g9sVarN = cAVar.n(mediaId, j2, i2);
            if (g9sVarN != null) {
                return g9sVarN;
            }
        }
        return null;
    }

    @Override // z.cA
    public void rl() {
        for (cA cAVar : this.f76281n) {
            cAVar.rl();
        }
    }

    public String toString() {
        cA[] cAVarArr = this.f76281n;
        return "<MultiTextureCache(" + cAVarArr.length + ")> : " + ArraysKt.joinToString$default(cAVarArr, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }
}
