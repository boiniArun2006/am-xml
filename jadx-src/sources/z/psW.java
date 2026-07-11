package z;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class psW implements cA {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f76326O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final KH f76327n;
    private final DC nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76328t;

    public abstract long Uo(Uri uri, long j2, int i2);

    public abstract AbstractC2481w6 nr(long j2);

    public psW(KH gctx, int i2, int i3, DC textureFormat, boolean z2) {
        Intrinsics.checkNotNullParameter(gctx, "gctx");
        Intrinsics.checkNotNullParameter(textureFormat, "textureFormat");
        this.f76327n = gctx;
        this.rl = i2;
        this.f76328t = i3;
        this.nr = textureFormat;
        this.f76326O = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(long j2, AbstractC2481w6 abstractC2481w6, g9s g9sVar, Uri uri) {
        String string = Long.toString(j2, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "Looking for key: 0x" + string + " entry=" + abstractC2481w6 + " result=" + g9sVar + " (for uri=" + uri + ")";
    }

    public final boolean J2() {
        return this.f76326O;
    }

    @Override // z.cA
    public g9s n(final Uri mediaId, long j2, int i2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        final long jUo = Uo(mediaId, j2, i2);
        nr(jUo);
        final AbstractC2481w6 abstractC2481w6 = null;
        final g9s g9sVar = null;
        XoT.C.Uo(this, new Function0(jUo, abstractC2481w6, g9sVar, mediaId) { // from class: z.K

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public final /* synthetic */ Uri f76249O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ long f76250n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ g9s f76251t;

            {
                this.f76251t = g9sVar;
                this.f76249O = mediaId;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return psW.O(this.f76250n, null, this.f76251t, this.f76249O);
            }
        });
        return null;
    }
}
