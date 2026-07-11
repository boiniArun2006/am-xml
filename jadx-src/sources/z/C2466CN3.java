package z;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z.CN3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2466CN3 extends psW {
    private final Map J2;
    private final boolean KN;
    private final Map Uo;

    @Override // z.psW
    public long Uo(Uri mediaId, long j2, int i2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        return j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2466CN3(KH gctx, DC textureFormat) {
        super(gctx, 0, 0, textureFormat, true);
        Intrinsics.checkNotNullParameter(gctx, "gctx");
        Intrinsics.checkNotNullParameter(textureFormat, "textureFormat");
        this.J2 = new LinkedHashMap();
        this.Uo = new LinkedHashMap();
        this.KN = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(C2466CN3 c2466cn3) {
        return "ExportCache : removeAll newSize=" + c2466cn3.J2.size() + "/" + c2466cn3.Uo.size() + " ";
    }

    @Override // z.psW
    public AbstractC2481w6 nr(long j2) {
        android.support.v4.media.j.n(this.J2.get(Long.valueOf(j2)));
        return null;
    }

    @Override // z.cA
    public void rl() {
        final List list = CollectionsKt.toList(this.J2.keySet());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                android.support.v4.media.j.n(this.J2.remove(Long.valueOf(jLongValue)));
                this.Uo.remove(Long.valueOf(jLongValue));
            }
            XoT.C.Uo(this, new Function0() { // from class: z.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2466CN3.mUb(list, this);
                }
            });
        }
        XoT.C.Uo(this, new Function0() { // from class: z.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C2466CN3.gh(this.f76286n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(List list, C2466CN3 c2466cn3) {
        return "ExportCache : removeAll/Removed " + list.size() + " newSize=" + c2466cn3.J2.size() + "/" + c2466cn3.Uo.size() + " ";
    }
}
