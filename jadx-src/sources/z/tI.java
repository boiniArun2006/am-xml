package z;

import android.net.Uri;
import android.util.LruCache;
import com.safedk.android.analytics.brandsafety.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import z.tI;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class tI extends psW {
    private final mz J2;
    private final int KN;
    private final int Uo;
    private final j mUb;
    private final int xMQ;

    public static final class j extends LruCache {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f76341n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z2, int i2) {
            super(i2);
            this.f76341n = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(boolean z2, Long l2) {
            return "entryRemoved : evicted=" + z2 + " key=" + l2;
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
            android.support.v4.media.j.n(obj2);
            android.support.v4.media.j.n(obj3);
            rl(z2, (Long) obj, null, null);
        }

        protected int nr(Long l2, AbstractC2481w6 abstractC2481w6) {
            return this.f76341n ? 1 : 0;
        }

        @Override // android.util.LruCache
        public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
            android.support.v4.media.j.n(obj2);
            return nr((Long) obj, null);
        }

        protected void rl(final boolean z2, final Long l2, AbstractC2481w6 abstractC2481w6, AbstractC2481w6 abstractC2481w62) {
            super.entryRemoved(z2, l2, abstractC2481w6, abstractC2481w62);
            XoT.C.az(this, new Function0() { // from class: z.lS
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return tI.j.t(z2, l2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tI(mz gctx, int i2, int i3, int i5, DC textureFormat, boolean z2) {
        super(gctx.rl(), i2, i3, textureFormat, z2);
        Intrinsics.checkNotNullParameter(gctx, "gctx");
        Intrinsics.checkNotNullParameter(textureFormat, "textureFormat");
        this.J2 = gctx;
        this.Uo = i2;
        this.KN = i3;
        this.xMQ = i5;
        this.mUb = new j(z2, z2 ? 16 : i5);
        synchronized (Ogx.f76271t) {
            Ogx.f76271t.add(new WeakReference(this));
            CollectionsKt.removeAll(Ogx.f76271t, new Function1() { // from class: z.T
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(tI.qie((WeakReference) obj));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Ik(int i2, int i3) {
        return "handleOOM : Resized " + i2 + " -> " + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(int i2, int i3) {
        return "handleOOM : IN " + i2 + " -> " + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(List list) {
        return "removeAll OUT : (removed: " + list + ")";
    }

    public static boolean qie(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r() {
        return "removeAll IN";
    }

    public final boolean HI(final int i2, final int i3) {
        XoT.C.Uo(this, new Function0() { // from class: z.U4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tI.ck(i2, i3);
            }
        });
        if (J2() || !this.J2.xMQ()) {
            return false;
        }
        final int iMaxSize = this.mUb.maxSize();
        final int iMax = Math.max((i3 * iMaxSize) / i2, this.Uo * this.KN * 16);
        if (iMax >= iMaxSize) {
            return false;
        }
        this.mUb.resize(iMax);
        XoT.C.Uo(this, new Function0() { // from class: z.h6y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tI.Ik(iMaxSize, iMax);
            }
        });
        return true;
    }

    @Override // z.psW
    public long Uo(Uri mediaId, long j2, int i2) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        return (((long) Ogx.J2(mediaId).intValue()) << 24) + ((long) i2);
    }

    @Override // z.psW
    public AbstractC2481w6 nr(long j2) {
        android.support.v4.media.j.n(this.mUb.get(Long.valueOf(j2)));
        return null;
    }

    @Override // z.cA
    public void rl() {
        XoT.C.az(this, new Function0() { // from class: z.V1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tI.r();
            }
        });
        final List listFilterNotNull = CollectionsKt.filterNotNull(this.mUb.snapshot().keySet());
        if (!listFilterNotNull.isEmpty()) {
            Iterator it = listFilterNotNull.iterator();
            while (it.hasNext()) {
                this.mUb.remove(Long.valueOf(((Number) it.next()).longValue()));
            }
        }
        XoT.C.az(this, new Function0() { // from class: z.oXP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tI.o(listFilterNotNull);
            }
        });
    }

    public String toString() {
        Map mapSnapshot = this.mUb.snapshot();
        Intrinsics.checkNotNullExpressionValue(mapSnapshot, "snapshot(...)");
        ArrayList arrayList = new ArrayList(mapSnapshot.size());
        for (Map.Entry entry : mapSnapshot.entrySet()) {
            Long l2 = (Long) entry.getKey();
            android.support.v4.media.j.n(entry.getValue());
            Intrinsics.checkNotNull(l2);
            String string = Long.toString(l2.longValue(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add("0x" + string + l.ae + ((Object) null));
        }
        return "<TextureCache " + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + ">";
    }

    public final int az() {
        if (J2()) {
            return 0;
        }
        return this.mUb.maxSize();
    }

    public final int ty() {
        if (J2()) {
            return 0;
        }
        return this.mUb.size();
    }
}
