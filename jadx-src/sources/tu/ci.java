package tu;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Trmy.yioUaKMByL;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.RedirectEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KMutableProperty1;
import kotlin.text.StringsKt;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class ci {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap f73918n = new HashMap();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class qf implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ tu.g9s f73956n;

        public qf(tu.g9s g9sVar) {
            this.f73956n = g9sVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long jRl;
            long jRl2;
            tu.Z z2 = (tu.Z) obj;
            tu.afx afxVarO = this.f73956n.O();
            int[] iArr = j.$EnumSwitchMapping$1;
            int i2 = iArr[afxVarO.ordinal()];
            if (i2 == 1) {
                jRl = ci.rl(z2.az() <= 0 ? z2.gh() : z2.az());
            } else if (i2 != 2) {
                jRl = ci.rl(z2.az() <= 0 ? z2.gh() : z2.az());
            } else {
                jRl = ci.rl(z2.gh() <= 0 ? z2.az() : z2.gh());
            }
            Long lValueOf = Long.valueOf(jRl);
            tu.Z z3 = (tu.Z) obj2;
            int i3 = iArr[this.f73956n.O().ordinal()];
            if (i3 == 1) {
                jRl2 = ci.rl(z3.az() <= 0 ? z3.gh() : z3.az());
            } else if (i3 != 2) {
                jRl2 = ci.rl(z3.az() <= 0 ? z3.gh() : z3.az());
            } else {
                jRl2 = ci.rl(z3.gh() <= 0 ? z3.az() : z3.gh());
            }
            return ComparisonsKt.compareValues(lValueOf, Long.valueOf(jRl2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class u implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ tu.g9s f73961n;

        public u(tu.g9s g9sVar) {
            this.f73961n = g9sVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long jRl;
            long jRl2;
            tu.Z z2 = (tu.Z) obj2;
            tu.afx afxVarO = this.f73961n.O();
            int[] iArr = j.$EnumSwitchMapping$1;
            int i2 = iArr[afxVarO.ordinal()];
            if (i2 == 1) {
                jRl = ci.rl(z2.az() <= 0 ? z2.gh() : z2.az());
            } else if (i2 != 2) {
                jRl = ci.rl(z2.az() <= 0 ? z2.gh() : z2.az());
            } else {
                jRl = ci.rl(z2.gh() <= 0 ? z2.az() : z2.gh());
            }
            Long lValueOf = Long.valueOf(jRl);
            tu.Z z3 = (tu.Z) obj;
            int i3 = iArr[this.f73961n.O().ordinal()];
            if (i3 == 1) {
                jRl2 = ci.rl(z3.az() <= 0 ? z3.gh() : z3.az());
            } else if (i3 != 2) {
                jRl2 = ci.rl(z3.az() <= 0 ? z3.gh() : z3.az());
            } else {
                jRl2 = ci.rl(z3.gh() <= 0 ? z3.az() : z3.gh());
            }
            return ComparisonsKt.compareValues(lValueOf, Long.valueOf(jRl2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[tu.Ew.values().length];
            try {
                iArr[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[tu.afx.values().length];
            try {
                iArr2[tu.afx.f73914n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[tu.afx.f73917t.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[tu.afx.f73911O.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[tu.afx.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[tu.afx.f73916r.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[tu.afx.f73915o.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[tu.Wre.values().length];
            try {
                iArr3[tu.Wre.f73897n.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[tu.Wre.f73899t.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[tu.Wre.f73896O.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final List KN(Context context, Set mediaTypes, tu.g9s queryParams) {
        List listUo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaTypes, "mediaTypes");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        ArrayList arrayList = new ArrayList();
        Iterator it = mediaTypes.iterator();
        while (it.hasNext()) {
            int i2 = j.$EnumSwitchMapping$0[((tu.Ew) it.next()).ordinal()];
            if (i2 == 1) {
                listUo = Uo(context, queryParams);
            } else if (i2 == 2) {
                listUo = mUb(context, queryParams);
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new UnsupportedOperationException();
                }
                listUo = O(context, queryParams);
            }
            CollectionsKt.addAll(arrayList, listUo);
        }
        List<tu.Z> listSortedWith = queryParams.nr() ? CollectionsKt.sortedWith(arrayList, new u(queryParams)) : CollectionsKt.sortedWith(arrayList, new qf(queryParams));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        for (tu.Z z2 : listSortedWith) {
            arrayList2.add(tu.Z.rl(z2, null, null, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 0, rl(z2.az() <= 0 ? z2.gh() : z2.az()), z2.gh() <= 0 ? z2.az() : z2.gh(), 0L, 0, 0, 0, 0, 0, null, 0L, 1070596095, null));
        }
        return arrayList2;
    }

    private static final List O(Context context, tu.g9s g9sVar) {
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        tu.Ew ew = tu.Ew.f73883o;
        aC aCVar = new MutablePropertyReference1Impl() { // from class: tu.ci.aC
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).Z());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).M(((Number) obj2).longValue());
            }
        };
        tu.Wre wre = tu.Wre.f73899t;
        tu.I28 i28 = new tu.I28("_id", aCVar, wre);
        C c2 = new MutablePropertyReference1Impl() { // from class: tu.ci.C
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).XQ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).FX((String) obj2);
            }
        };
        tu.Wre wre2 = tu.Wre.f73897n;
        tu.I28 i282 = new tu.I28("mime_type", c2, wre2);
        tu.I28 i283 = new tu.I28("title", new MutablePropertyReference1Impl() { // from class: tu.ci.o
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).aYN();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Nxk((String) obj2);
            }
        }, wre2);
        tu.I28 i284 = new tu.I28("_display_name", new MutablePropertyReference1Impl() { // from class: tu.ci.qz
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).HI();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).P5((String) obj2);
            }
        }, wre2);
        tu.I28 i285 = new tu.I28("album", new MutablePropertyReference1Impl() { // from class: tu.ci.Pl
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).t();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).T((String) obj2);
            }
        }, wre2);
        tu.I28 i286 = new tu.I28("album_id", new MutablePropertyReference1Impl() { // from class: tu.ci.Xo
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).O());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).nHg(((Number) obj2).longValue());
            }
        }, wre);
        tu.I28 i287 = new tu.I28("artist", new MutablePropertyReference1Impl() { // from class: tu.ci.eO
            {
                String str = yioUaKMByL.RxpyGaEOJvlk;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).J2();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).s7N((String) obj2);
            }
        }, wre2);
        tu.I28 i288 = new tu.I28("composer", new MutablePropertyReference1Impl() { // from class: tu.ci.z
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).mUb();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).rV9((String) obj2);
            }
        }, wre2);
        tu.I28 i289 = new tu.I28("duration", new MutablePropertyReference1Impl() { // from class: tu.ci.QJ
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).ck());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).M7(((Number) obj2).longValue());
            }
        }, wre);
        tu.I28 i2810 = new tu.I28("_size", new MutablePropertyReference1Impl() { // from class: tu.ci.n
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).WPU());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).GR(((Number) obj2).longValue());
            }
        }, wre);
        w6 w6Var = new MutablePropertyReference1Impl() { // from class: tu.ci.w6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).te());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).X(((Number) obj2).intValue());
            }
        };
        tu.Wre wre3 = tu.Wre.f73896O;
        String str = "artist";
        List listListOf = CollectionsKt.listOf((Object[]) new tu.I28[]{i28, i282, i283, i284, i285, i286, i287, i288, i289, i2810, new tu.I28("is_alarm", w6Var, wre3), new tu.I28("is_music", new MutablePropertyReference1Impl() { // from class: tu.ci.Ml
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).iF());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).B(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("is_notification", new MutablePropertyReference1Impl() { // from class: tu.ci.I28
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).fD());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).J(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("is_podcast", new MutablePropertyReference1Impl() { // from class: tu.ci.Wre
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).E2());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).a(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("is_ringtone", new MutablePropertyReference1Impl() { // from class: tu.ci.CN3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).e());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).I(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("date_added", new MutablePropertyReference1Impl() { // from class: tu.ci.fuX
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).gh());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).bzg(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("date_modified", new MutablePropertyReference1Impl() { // from class: tu.ci.Dsr
            {
                String str2 = inFlMLxL.kLblsg;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).qie());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Xw(((Number) obj2).longValue());
            }
        }, wre)});
        switch (j.$EnumSwitchMapping$1[g9sVar.O().ordinal()]) {
            case 1:
            case 2:
                str = "date_added";
                break;
            case 3:
            case 6:
                str = "title";
                break;
            case 4:
                break;
            case 5:
                str = "album";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(uri);
        return J2(context, ew, g9sVar, str, uri, listListOf);
    }

    private static final List Uo(Context context, tu.g9s g9sVar) {
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        tu.Ew ew = tu.Ew.J2;
        r rVar = new MutablePropertyReference1Impl() { // from class: tu.ci.r
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).Z());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).M(((Number) obj2).longValue());
            }
        };
        tu.Wre wre = tu.Wre.f73899t;
        tu.I28 i28 = new tu.I28("_id", rVar, wre);
        SPz sPz = new MutablePropertyReference1Impl() { // from class: tu.ci.SPz
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).XQ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).FX((String) obj2);
            }
        };
        tu.Wre wre2 = tu.Wre.f73897n;
        tu.I28 i282 = new tu.I28("mime_type", sPz, wre2);
        tu.I28 i283 = new tu.I28("title", new MutablePropertyReference1Impl() { // from class: tu.ci.ci
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).aYN();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Nxk((String) obj2);
            }
        }, wre2);
        tu.I28 i284 = new tu.I28("_display_name", new MutablePropertyReference1Impl() { // from class: tu.ci.g9s
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).HI();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).P5((String) obj2);
            }
        }, wre2);
        tu.I28 i285 = new tu.I28("description", new MutablePropertyReference1Impl() { // from class: tu.ci.afx
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).ty();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).U((String) obj2);
            }
        }, wre2);
        Z z2 = new MutablePropertyReference1Impl() { // from class: tu.ci.Z
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).S());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).D(((Number) obj2).intValue());
            }
        };
        tu.Wre wre3 = tu.Wre.f73896O;
        List listListOf = CollectionsKt.listOf((Object[]) new tu.I28[]{i28, i282, i283, i284, i285, new tu.I28("orientation", z2, wre3), new tu.I28("bucket_display_name", new MutablePropertyReference1Impl() { // from class: tu.ci.Ew
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).Uo();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).wTp((String) obj2);
            }
        }, wre2), new tu.I28("bucket_id", new MutablePropertyReference1Impl() { // from class: tu.ci.nKK
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).KN();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).v((String) obj2);
            }
        }, wre2), new tu.I28("width", new MutablePropertyReference1Impl() { // from class: tu.ci.DAz
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).k(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("height", new MutablePropertyReference1Impl() { // from class: tu.ci.l3D
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).o());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).E(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28("_size", new MutablePropertyReference1Impl() { // from class: tu.ci.c
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).WPU());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).GR(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("datetaken", new MutablePropertyReference1Impl() { // from class: tu.ci.s4
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).az());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).jB(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("date_added", new MutablePropertyReference1Impl() { // from class: tu.ci.UGc
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).gh());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).bzg(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("date_modified", new MutablePropertyReference1Impl() { // from class: tu.ci.Q
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).qie());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Xw(((Number) obj2).longValue());
            }
        }, wre)});
        int i2 = j.$EnumSwitchMapping$1[g9sVar.O().ordinal()];
        String str = (i2 == 1 || i2 != 2) ? "datetaken" : "date_added";
        List listNr = kPg.fuX.f69922n.nr(kPg.Dsr.f69908n);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listNr, 10));
        int i3 = 0;
        for (Object obj : listNr) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            kPg.n nVar = (kPg.n) obj;
            long j2 = (-100000000) - ((long) i3);
            arrayList.add(new tu.Z(nVar.O(), tu.Ew.J2, j2, MimeTypes.IMAGE_WEBP, nVar.n().n(), nVar.n().n(), kPg.Wre.Uo(nVar), null, 0L, null, null, null, "Sample Media", "sample", 0, nVar.J2(), nVar.rl(), 0L, 1024L, 0, ((long) ((nVar.J2() * 10000) / nVar.rl())) + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, ((long) ((nVar.J2() * 10000) / nVar.rl())) + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, ((long) ((nVar.J2() * 10000) / nVar.rl())) + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 0, 0, 0, 0, 0, null, 0L, 1066028928, null));
            i3 = i5;
        }
        Intrinsics.checkNotNull(uri);
        return CollectionsKt.plus((Collection) J2(context, ew, g9sVar, str, uri, listListOf), (Iterable) arrayList);
    }

    private static final List mUb(Context context, tu.g9s g9sVar) {
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        tu.Ew ew = tu.Ew.f73884r;
        rv6 rv6Var = new MutablePropertyReference1Impl() { // from class: tu.ci.rv6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).Z());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).M(((Number) obj2).longValue());
            }
        };
        tu.Wre wre = tu.Wre.f73899t;
        tu.I28 i28 = new tu.I28("_id", rv6Var, wre);
        vd vdVar = new MutablePropertyReference1Impl() { // from class: tu.ci.vd
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).XQ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).FX((String) obj2);
            }
        };
        tu.Wre wre2 = tu.Wre.f73897n;
        tu.I28 i282 = new tu.I28("mime_type", vdVar, wre2);
        tu.I28 i283 = new tu.I28("title", new MutablePropertyReference1Impl() { // from class: tu.ci.Lu
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).aYN();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Nxk((String) obj2);
            }
        }, wre2);
        tu.I28 i284 = new tu.I28("_display_name", new MutablePropertyReference1Impl() { // from class: tu.ci.h
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).HI();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).P5((String) obj2);
            }
        }, wre2);
        tu.I28 i285 = new tu.I28("bucket_display_name", new MutablePropertyReference1Impl() { // from class: tu.ci.K
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).Uo();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).wTp((String) obj2);
            }
        }, wre2);
        tu.I28 i286 = new tu.I28("bucket_id", new MutablePropertyReference1Impl() { // from class: tu.ci.psW
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((tu.Z) obj).KN();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).v((String) obj2);
            }
        }, wre2);
        Md md = new MutablePropertyReference1Impl() { // from class: tu.ci.Md
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).g());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).k(((Number) obj2).intValue());
            }
        };
        tu.Wre wre3 = tu.Wre.f73896O;
        List listListOf = CollectionsKt.listOf((Object[]) new tu.I28[]{i28, i282, i283, i284, i285, i286, new tu.I28("width", md, wre3), new tu.I28("height", new MutablePropertyReference1Impl() { // from class: tu.ci.Zs
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((tu.Z) obj).o());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).E(((Number) obj2).intValue());
            }
        }, wre3), new tu.I28(dpcnwfoVOnrtRA.HjyyowfoIo, new MutablePropertyReference1Impl() { // from class: tu.ci.P
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).ck());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).M7(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("_size", new MutablePropertyReference1Impl() { // from class: tu.ci.Ln
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).WPU());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).GR(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("datetaken", new MutablePropertyReference1Impl() { // from class: tu.ci.lej
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).az());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).jB(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("date_added", new MutablePropertyReference1Impl() { // from class: tu.ci.iwV
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).gh());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).bzg(((Number) obj2).longValue());
            }
        }, wre), new tu.I28("date_modified", new MutablePropertyReference1Impl() { // from class: tu.ci.M
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((tu.Z) obj).qie());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((tu.Z) obj).Xw(((Number) obj2).longValue());
            }
        }, wre)});
        int i2 = j.$EnumSwitchMapping$1[g9sVar.O().ordinal()];
        String str = (i2 == 1 || i2 != 2) ? "datetaken" : "date_added";
        Intrinsics.checkNotNull(uri);
        return J2(context, ew, g9sVar, str, uri, listListOf);
    }

    public static final void nr(List list, Context context) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<tu.w6> arrayList = new ArrayList();
        String[] strArr = {"_display_name"};
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI, new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "_id"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.NAME));
                        if (string == null) {
                            string = "";
                        }
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_id"));
                        if (string2 == null) {
                            string2 = "0";
                        }
                        long j2 = Long.parseLong(string2);
                        cursorQuery = context.getContentResolver().query(MediaStore.Audio.Genres.Members.getContentUri(RedirectEvent.f62800h, j2), strArr, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    do {
                                        arrayList.add(new tu.w6(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name")), j2, string));
                                    } while (cursorQuery.moveToNext());
                                }
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(cursorQuery, null);
                            } finally {
                            }
                        }
                    } while (cursorQuery.moveToNext());
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tu.Z z2 = (tu.Z) it.next();
            for (tu.w6 w6Var : arrayList) {
                if (StringsKt.equals$default(z2.HI(), w6Var.n(), false, 2, null)) {
                    z2.eF(w6Var.t());
                    z2.p5(w6Var.rl());
                }
            }
            if (z2.r() == null) {
                z2.eF(context.getString(2132020367));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rl(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        return j2 < 157680000000L ? j2 * 1000 : j2;
    }

    public static final void t(List list, Context context) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tu.Z z2 = (tu.Z) it.next();
            HashMap map = f73918n;
            if (map.containsKey(Long.valueOf(z2.O()))) {
                z2.N((String) map.get(Long.valueOf(z2.O())));
            } else if (z2.ViF() == tu.Ew.f73883o && z2.nr() == null && z2.O() != 0 && (cursorQuery = context.getContentResolver().query(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album_art"}, "_id=?", new String[]{String.valueOf(z2.O())}, null)) != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        z2.N(cursorQuery.getString(cursorQuery.getColumnIndex("album_art")));
                        map.put(Long.valueOf(z2.O()), z2.nr());
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } finally {
                }
            }
        }
    }

    public static /* synthetic */ List xMQ(Context context, Set set, tu.g9s g9sVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            set = tu.Ew.f73882n.n();
        }
        if ((i2 & 4) != 0) {
            g9sVar = tu.g9s.f73966t.rl();
        }
        return KN(context, set, g9sVar);
    }

    private static final List J2(Context context, tu.Ew ew, tu.g9s g9sVar, String str, Uri uri, List list) {
        String str2;
        if (g9sVar.nr()) {
            str2 = " DESC";
        } else {
            str2 = " ASC";
        }
        String str3 = str + str2;
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((tu.I28) it.next()).n());
        }
        Cursor cursorQuery = contentResolver.query(uri, (String[]) arrayList2.toArray(new String[0]), null, null, str3);
        if (cursorQuery != null) {
            try {
                cursorQuery.moveToPosition(-1);
                while (cursorQuery.moveToNext()) {
                    tu.Z z2 = new tu.Z(null, ew, 0L, null, null, null, null, null, 0L, null, null, null, null, null, 0, 0, 0, 0L, 0L, 0, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, 0L, 1073741821, null);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        tu.I28 i28 = (tu.I28) it2.next();
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(i28.n());
                        int i2 = j.$EnumSwitchMapping$2[i28.t().ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    KMutableProperty1 kMutableProperty1Rl = i28.rl();
                                    Intrinsics.checkNotNull(kMutableProperty1Rl, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<com.alightcreative.mediacore.mediainfo.MediaSummaryInfo, kotlin.Int>");
                                    kMutableProperty1Rl.set(z2, Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow)));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                KMutableProperty1 kMutableProperty1Rl2 = i28.rl();
                                Intrinsics.checkNotNull(kMutableProperty1Rl2, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<com.alightcreative.mediacore.mediainfo.MediaSummaryInfo, kotlin.Long>");
                                kMutableProperty1Rl2.set(z2, Long.valueOf(cursorQuery.getLong(columnIndexOrThrow)));
                            }
                        } else {
                            KMutableProperty1 kMutableProperty1Rl3 = i28.rl();
                            Intrinsics.checkNotNull(kMutableProperty1Rl3, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<com.alightcreative.mediacore.mediainfo.MediaSummaryInfo, kotlin.String?>");
                            kMutableProperty1Rl3.set(z2, cursorQuery.getString(columnIndexOrThrow));
                        }
                    }
                    z2.Y(uri.buildUpon().appendPath(String.valueOf(z2.Z())).build());
                    arrayList.add(z2);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                return arrayList;
            } finally {
            }
        } else {
            return arrayList;
        }
    }
}
