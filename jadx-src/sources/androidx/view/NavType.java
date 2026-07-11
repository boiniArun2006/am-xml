package androidx.view;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import cS.Zv.SzFNXybiSxdx;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b!\b&\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006'()*+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010 ¨\u0006-"}, d2 = {"Landroidx/navigation/NavType;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "isNullableAllowed", "<init>", "(Z)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "KN", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", c.f62177j, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "J2", "(Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "Uo", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "nr", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "O", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "xMQ", "(Ljava/lang/Object;)Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "mUb", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Z", "t", "()Z", "rl", "Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Companion", "EnumType", "ParcelableArrayType", "ParcelableType", "SerializableArrayType", "SerializableType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class NavType<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullableAllowed;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String name = "nav_type";

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final NavType nr = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$IntType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Number) obj).intValue());
        }

        public void az(Bundle bundle, String key, int value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Integer n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.view.NavType
        public Integer qie(String value) {
            int i2;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                i2 = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i2 = Integer.parseInt(value);
            }
            return Integer.valueOf(i2);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "integer";
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final NavType f40154O = new NavType<Integer>() { // from class: androidx.navigation.NavType$Companion$ReferenceType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Number) obj).intValue());
        }

        public void az(Bundle bundle, String key, int value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Integer n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.view.NavType
        public Integer qie(String value) {
            int i2;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                i2 = Integer.parseInt(strSubstring, CharsKt.checkRadix(16));
            } else {
                i2 = Integer.parseInt(value);
            }
            return Integer.valueOf(i2);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "reference";
        }
    };
    public static final NavType J2 = new CollectionNavType<int[]>() { // from class: androidx.navigation.NavType$Companion$IntArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public int[] gh() {
            return new int[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(int[] value, int[] other) {
            return ArraysKt.contentDeepEquals(value != null ? ArraysKt.toTypedArray(value) : null, other != null ? ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public int[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new int[]{((Number) NavType.nr.qie(value)).intValue()};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, int[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public int[] Uo(String value, int[] previousValue) {
            int[] iArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (iArrPlus = ArraysKt.plus(previousValue, qie(value))) == null) ? qie(value) : iArrPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(int[] value) {
            List<Integer> list;
            if (value == null || (list = ArraysKt.toList(value)) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "integer[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public int[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (int[]) bundle.get(key);
        }
    };
    public static final NavType Uo = new CollectionNavType<List<? extends Integer>>() { // from class: androidx.navigation.NavType$Companion$IntListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (Integer[]) value.toArray(new Integer[0]) : null, other != null ? (Integer[]) other.toArray(new Integer[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(NavType.nr.qie(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, value != null ? CollectionsKt.toIntArray(value) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(List value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "List<Int>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            int[] iArr = (int[]) bundle.get(key);
            if (iArr != null) {
                return ArraysKt.toList(iArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };
    public static final NavType KN = new NavType<Long>() { // from class: androidx.navigation.NavType$Companion$LongType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Number) obj).longValue());
        }

        public void az(Bundle bundle, String key, long value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLong(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Long n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.view.NavType
        public Long qie(String value) {
            String strSubstring;
            long j2;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt.endsWith$default(value, "L", false, 2, (Object) null)) {
                strSubstring = value.substring(0, value.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = value;
            }
            if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
                String strSubstring2 = strSubstring.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                j2 = Long.parseLong(strSubstring2, CharsKt.checkRadix(16));
            } else {
                j2 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j2);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "long";
        }
    };
    public static final NavType xMQ = new CollectionNavType<long[]>() { // from class: androidx.navigation.NavType$Companion$LongArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public long[] gh() {
            return new long[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(long[] value, long[] other) {
            return ArraysKt.contentDeepEquals(value != null ? ArraysKt.toTypedArray(value) : null, other != null ? ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public long[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new long[]{((Number) NavType.KN.qie(value)).longValue()};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, long[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public long[] Uo(String value, long[] previousValue) {
            long[] jArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (jArrPlus = ArraysKt.plus(previousValue, qie(value))) == null) ? qie(value) : jArrPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(long[] value) {
            List<Long> list;
            if (value == null || (list = ArraysKt.toList(value)) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "long[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public long[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (long[]) bundle.get(key);
        }
    };
    public static final NavType mUb = new CollectionNavType<List<? extends Long>>() { // from class: androidx.navigation.NavType$Companion$LongListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (Long[]) value.toArray(new Long[0]) : null, other != null ? (Long[]) other.toArray(new Long[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(NavType.KN.qie(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, value != null ? CollectionsKt.toLongArray(value) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(List value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "List<Long>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            long[] jArr = (long[]) bundle.get(key);
            if (jArr != null) {
                return ArraysKt.toList(jArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };
    public static final NavType gh = new NavType<Float>() { // from class: androidx.navigation.NavType$Companion$FloatType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Number) obj).floatValue());
        }

        public void az(Bundle bundle, String key, float value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloat(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Float n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.view.NavType
        public Float qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "float";
        }
    };
    public static final NavType qie = new CollectionNavType<float[]>() { // from class: androidx.navigation.NavType$Companion$FloatArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public float[] gh() {
            return new float[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(float[] value, float[] other) {
            return ArraysKt.contentDeepEquals(value != null ? ArraysKt.toTypedArray(value) : null, other != null ? ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public float[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new float[]{((Number) NavType.gh.qie(value)).floatValue()};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, float[] value) {
            Intrinsics.checkNotNullParameter(bundle, obbPUqyhtS.eHYKAApZ);
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public float[] Uo(String value, float[] previousValue) {
            float[] fArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (fArrPlus = ArraysKt.plus(previousValue, qie(value))) == null) ? qie(value) : fArrPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(float[] value) {
            List<Float> list;
            if (value == null || (list = ArraysKt.toList(value)) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "float[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public float[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (float[]) bundle.get(key);
        }
    };
    public static final NavType az = new CollectionNavType<List<? extends Float>>() { // from class: androidx.navigation.NavType$Companion$FloatListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (Float[]) value.toArray(new Float[0]) : null, other != null ? (Float[]) other.toArray(new Float[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(NavType.gh.qie(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, value != null ? CollectionsKt.toFloatArray(value) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(List value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "List<Float>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            float[] fArr = (float[]) bundle.get(key);
            if (fArr != null) {
                return ArraysKt.toList(fArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };
    public static final NavType ty = new NavType<Boolean>() { // from class: androidx.navigation.NavType$Companion$BoolType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Boolean) obj).booleanValue());
        }

        public void az(Bundle bundle, String key, boolean value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Boolean n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // androidx.view.NavType
        public Boolean qie(String value) {
            boolean z2;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "true")) {
                z2 = true;
            } else {
                if (!Intrinsics.areEqual(value, V8ValueBoolean.FALSE)) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "boolean";
        }
    };
    public static final NavType HI = new CollectionNavType<boolean[]>() { // from class: androidx.navigation.NavType$Companion$BoolArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public boolean[] gh() {
            return new boolean[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(boolean[] value, boolean[] other) {
            return ArraysKt.contentDeepEquals(value != null ? ArraysKt.toTypedArray(value) : null, other != null ? ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public boolean[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new boolean[]{((Boolean) NavType.ty.qie(value)).booleanValue()};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, boolean[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public boolean[] Uo(String value, boolean[] previousValue) {
            boolean[] zArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (zArrPlus = ArraysKt.plus(previousValue, qie(value))) == null) ? qie(value) : zArrPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(boolean[] value) {
            List<Boolean> list;
            if (value == null || (list = ArraysKt.toList(value)) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "boolean[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public boolean[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (boolean[]) bundle.get(key);
        }
    };
    public static final NavType ck = new CollectionNavType<List<? extends Boolean>>() { // from class: androidx.navigation.NavType$Companion$BoolListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (Boolean[]) value.toArray(new Boolean[0]) : null, other != null ? (Boolean[]) other.toArray(new Boolean[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(NavType.ty.qie(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, SzFNXybiSxdx.ZeruZPqLfou);
            bundle.putBooleanArray(key, value != null ? CollectionsKt.toBooleanArray(value) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(List value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "List<Boolean>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            boolean[] zArr = (boolean[]) bundle.get(key);
            if (zArr != null) {
                return ArraysKt.toList(zArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };
    public static final NavType Ik = new NavType<String>() { // from class: androidx.navigation.NavType$Companion$StringType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putString(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public String n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String) bundle.get(key);
        }

        @Override // androidx.view.NavType
        public String qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            return value;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "string";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public String xMQ(String value) {
            String strEncode = value != null ? Uri.encode(value) : null;
            return strEncode == null ? V8ValueNull.NULL : strEncode;
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final NavType f40156r = new CollectionNavType<String[]>() { // from class: androidx.navigation.NavType$Companion$StringArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public String[] gh() {
            return new String[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public String[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{value};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, String[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public String[] Uo(String value, String[] previousValue) {
            String[] strArr;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (strArr = (String[]) ArraysKt.plus((Object[]) previousValue, (Object[]) qie(value))) == null) ? qie(value) : strArr;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(String[] value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(value.length);
            for (String str : value) {
                arrayList.add(Uri.encode(str));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "string[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public String[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(String[] value, String[] other) {
            return ArraysKt.contentDeepEquals(value, other);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final NavType f40155o = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.NavType$Companion$StringListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, value != null ? (String[]) value.toArray(new String[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(List value) {
            if (value == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.encode((String) it.next()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            return "List<String>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            String[] strArr = (String[]) bundle.get(key);
            if (strArr != null) {
                return ArraysKt.toList(strArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0017R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010+0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00180\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "<init>", "()V", "", "type", "packageName", "Landroidx/navigation/NavType;", c.f62177j, "(Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "Ljava/lang/Class;", "clazz", "", "isArray", "nr", "(Ljava/lang/Class;Z)Landroidx/navigation/NavType;", "value", "rl", "(Ljava/lang/String;)Landroidx/navigation/NavType;", "t", "(Ljava/lang/Object;)Landroidx/navigation/NavType;", "", "BoolArrayType", "Landroidx/navigation/NavType;", "", "BoolListType", "BoolType", "", "FloatArrayType", "", "FloatListType", "FloatType", "", "IntArrayType", "", "IntListType", "IntType", "", "LongArrayType", "", "LongListType", "LongType", "ReferenceType", "", "StringArrayType", "StringListType", "StringType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public NavType n(String type, String packageName) {
            String strSubstring;
            NavType navType = NavType.nr;
            if (Intrinsics.areEqual(navType.getName(), type)) {
                return navType;
            }
            NavType navType2 = NavType.J2;
            if (Intrinsics.areEqual(navType2.getName(), type)) {
                return navType2;
            }
            NavType navType3 = NavType.Uo;
            if (Intrinsics.areEqual(navType3.getName(), type)) {
                return navType3;
            }
            NavType navType4 = NavType.KN;
            if (Intrinsics.areEqual(navType4.getName(), type)) {
                return navType4;
            }
            NavType navType5 = NavType.xMQ;
            if (Intrinsics.areEqual(navType5.getName(), type)) {
                return navType5;
            }
            NavType navType6 = NavType.mUb;
            if (Intrinsics.areEqual(navType6.getName(), type)) {
                return navType6;
            }
            NavType navType7 = NavType.ty;
            if (Intrinsics.areEqual(navType7.getName(), type)) {
                return navType7;
            }
            NavType navType8 = NavType.HI;
            if (Intrinsics.areEqual(navType8.getName(), type)) {
                return navType8;
            }
            NavType navType9 = NavType.ck;
            if (Intrinsics.areEqual(navType9.getName(), type)) {
                return navType9;
            }
            NavType navType10 = NavType.Ik;
            if (Intrinsics.areEqual(navType10.getName(), type)) {
                return navType10;
            }
            NavType navType11 = NavType.f40156r;
            if (Intrinsics.areEqual(navType11.getName(), type)) {
                return navType11;
            }
            NavType navType12 = NavType.f40155o;
            if (Intrinsics.areEqual(navType12.getName(), type)) {
                return navType12;
            }
            NavType navType13 = NavType.gh;
            if (Intrinsics.areEqual(navType13.getName(), type)) {
                return navType13;
            }
            NavType navType14 = NavType.qie;
            if (Intrinsics.areEqual(navType14.getName(), type)) {
                return navType14;
            }
            NavType navType15 = NavType.az;
            if (Intrinsics.areEqual(navType15.getName(), type)) {
                return navType15;
            }
            NavType navType16 = NavType.f40154O;
            if (Intrinsics.areEqual(navType16.getName(), type)) {
                return navType16;
            }
            if (type == null || type.length() == 0) {
                return navType10;
            }
            try {
                if (!StringsKt.startsWith$default(type, ".", false, 2, (Object) null) || packageName == null) {
                    strSubstring = type;
                } else {
                    strSubstring = packageName + type;
                }
                boolean zEndsWith$default = StringsKt.endsWith$default(type, "[]", false, 2, (Object) null);
                if (zEndsWith$default) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                }
                Class<?> clazz = Class.forName(strSubstring);
                Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
                NavType navTypeNr = nr(clazz, zEndsWith$default);
                if (navTypeNr != null) {
                    return navTypeNr;
                }
                throw new IllegalArgumentException((strSubstring + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        public final NavType nr(Class clazz, boolean isArray) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                return isArray ? new ParcelableArrayType(clazz) : new ParcelableType(clazz);
            }
            if (Enum.class.isAssignableFrom(clazz) && !isArray) {
                return new EnumType(clazz);
            }
            if (Serializable.class.isAssignableFrom(clazz)) {
                return isArray ? new SerializableArrayType(clazz) : new SerializableType(clazz);
            }
            return null;
        }

        public final NavType rl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                try {
                    try {
                        try {
                            NavType navType = NavType.nr;
                            navType.qie(value);
                            Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType;
                        } catch (IllegalArgumentException unused) {
                            NavType navType2 = NavType.ty;
                            navType2.qie(value);
                            Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        NavType navType3 = NavType.KN;
                        navType3.qie(value);
                        Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType3;
                    }
                } catch (IllegalArgumentException unused3) {
                    NavType navType4 = NavType.Ik;
                    Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType4;
                }
            } catch (IllegalArgumentException unused4) {
                NavType navType5 = NavType.gh;
                navType5.qie(value);
                Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
        }

        public final NavType t(Object value) {
            if (value instanceof Integer) {
                NavType navType = NavType.nr;
                Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            }
            if (value instanceof int[]) {
                NavType navType2 = NavType.J2;
                Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            }
            if (value instanceof Long) {
                NavType navType3 = NavType.KN;
                Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            }
            if (value instanceof long[]) {
                NavType navType4 = NavType.xMQ;
                Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            }
            if (value instanceof Float) {
                NavType navType5 = NavType.gh;
                Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            }
            if (value instanceof float[]) {
                NavType navType6 = NavType.qie;
                Intrinsics.checkNotNull(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            }
            if (value instanceof Boolean) {
                NavType navType7 = NavType.ty;
                Intrinsics.checkNotNull(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            }
            if (value instanceof boolean[]) {
                NavType navType8 = NavType.HI;
                Intrinsics.checkNotNull(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            }
            if ((value instanceof String) || value == null) {
                NavType navType9 = NavType.Ik;
                Intrinsics.checkNotNull(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType9;
            }
            if ((value instanceof Object[]) && (((Object[]) value) instanceof String[])) {
                NavType navType10 = NavType.f40156r;
                Intrinsics.checkNotNull(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType10;
            }
            if (value.getClass().isArray()) {
                Class<?> componentType = value.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Class<?> componentType2 = value.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    return new ParcelableArrayType(componentType2);
                }
            }
            if (value.getClass().isArray()) {
                Class<?> componentType3 = value.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType3);
                if (Serializable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = value.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    return new SerializableArrayType(componentType4);
                }
            }
            if (value instanceof Parcelable) {
                return new ParcelableType(value.getClass());
            }
            if (value instanceof Enum) {
                return new EnumType(value.getClass());
            }
            if (value instanceof Serializable) {
                return new SerializableType(value.getClass());
            }
            throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "", "D", "Landroidx/navigation/NavType$SerializableType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "ty", "(Ljava/lang/String;)Ljava/lang/Enum;", "XQ", "Ljava/lang/Class;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1212:1\n1#2:1213\n1282#3,2:1214\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n1135#1:1214,2\n*E\n"})
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
        private final Class type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumType(Class type) {
            super(false, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.NavType.SerializableType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum qie(String value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] enumConstants = this.type.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i2];
                if (StringsKt.equals(((Enum) obj).name(), value, true)) {
                    break;
                }
                i2++;
            }
            Enum r3 = (Enum) obj;
            if (r3 != null) {
                return r3;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "Landroid/os/Parcelable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "gh", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "qie", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ty", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "Z", "Ljava/lang/Class;", "arrayType", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Class arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Parcelable[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(ParcelableArrayType.class, other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((ParcelableArrayType) other).arrayType);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Parcelable[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.view.NavType
        public Parcelable[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public boolean mUb(Parcelable[] value, Parcelable[] other) {
            return ArraysKt.contentDeepEquals(value, other);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "KN", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", c.f62177j, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "J2", "(Ljava/lang/String;)Ljava/lang/Object;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "Ljava/lang/Class;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParcelableType<D> extends NavType<D> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Class type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: J2 */
        public Object qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.view.NavType
        public void KN(Bundle bundle, String key, Object value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(ParcelableType.class, other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.type, ((ParcelableType) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.view.NavType
        public Object n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return bundle.get(key);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "gh", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "qie", "(Ljava/lang/String;)[Ljava/io/Serializable;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ty", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "Z", "Ljava/lang/Class;", "arrayType", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Class arrayType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.arrayType = cls;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Serializable[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(SerializableArrayType.class, other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((SerializableArrayType) other).arrayType);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Serializable[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.view.NavType
        public Serializable[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public boolean mUb(Serializable[] value, Serializable[] other) {
            return ArraysKt.contentDeepEquals(value, other);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "nullableAllowed", "(ZLjava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "gh", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "qie", "(Ljava/lang/String;)Ljava/io/Serializable;", "", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "Ljava/lang/Class;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1212:1\n1#2:1213\n*E\n"})
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Class type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Serializable value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof SerializableType) {
                return Intrinsics.areEqual(this.type, ((SerializableType) other).type);
            }
            return false;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Serializable n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable) bundle.get(key);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @Override // androidx.view.NavType
        public Serializable qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean z2, Class type) {
            super(z2);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }

    /* JADX INFO: renamed from: J2 */
    public abstract Object qie(String value);

    public abstract void KN(Bundle bundle, String key, Object value);

    public abstract Object n(Bundle bundle, String key);

    public final Object O(Bundle bundle, String key, String value, Object previousValue) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (value == null) {
            return previousValue;
        }
        Object objUo = Uo(value, previousValue);
        KN(bundle, key, objUo);
        return objUo;
    }

    public Object Uo(String value, Object previousValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        return qie(value);
    }

    public final Object nr(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object objQie = qie(value);
        KN(bundle, key, objQie);
        return objQie;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public boolean getIsNullableAllowed() {
        return this.isNullableAllowed;
    }

    public NavType(boolean z2) {
        this.isNullableAllowed = z2;
    }

    public boolean mUb(Object value, Object other) {
        return Intrinsics.areEqual(value, other);
    }

    public String toString() {
        return getName();
    }

    public String xMQ(Object value) {
        return String.valueOf(value);
    }
}
