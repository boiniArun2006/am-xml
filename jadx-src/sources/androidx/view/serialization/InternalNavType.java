package androidx.view.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.database.Kr.FlTC;
import androidx.view.CollectionNavType;
import androidx.view.NavType;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003)*+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0012\u0010\tR\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001a\u0010\tR'\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u001c0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR'\u0010\"\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010 0\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b\u001d\u0010\tR\u001f\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b\u0006\u0010\tR%\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010 0\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0007\u001a\u0004\b'\u0010\t¨\u0006,"}, d2 = {"Landroidx/navigation/serialization/InternalNavType;", "", "<init>", "()V", "Landroidx/navigation/NavType;", "", "rl", "Landroidx/navigation/NavType;", "J2", "()Landroidx/navigation/NavType;", "IntNullableType", "", "t", c.f62177j, "BoolNullableType", "", "nr", "DoubleType", "O", "DoubleNullableType", "", "FloatNullableType", "", "Uo", "LongNullableType", "", "KN", "StringNonNullableType", "", "xMQ", "getStringNullableArrayType", "StringNullableArrayType", "", "mUb", "StringNullableListType", "", "gh", "DoubleArrayType", "qie", "getDoubleListType", "DoubleListType", "EnumListType", "EnumNullableType", "SerializableNullableType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InternalNavType {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InternalNavType f40450n = new InternalNavType();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final NavType IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Integer value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.nr.KN(bundle, key, value);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Integer n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public Integer qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            return (Integer) NavType.nr.qie(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "integer_nullable";
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final NavType BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Boolean value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.ty.KN(bundle, key, value);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Boolean n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public Boolean qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, FlTC.EjNEiWJShbKq)) {
                return null;
            }
            return (Boolean) NavType.ty.qie(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "boolean_nullable";
        }
    };

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final NavType DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        @Override // androidx.view.NavType
        public /* bridge */ /* synthetic */ void KN(Bundle bundle, String str, Object obj) {
            az(bundle, str, ((Number) obj).doubleValue());
        }

        public void az(Bundle bundle, String key, double value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putDouble(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Double n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
            return (Double) obj;
        }

        @Override // androidx.view.NavType
        public Double qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Double.valueOf(Double.parseDouble(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "double";
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final NavType DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Double value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                bundle.putSerializable(key, null);
            } else {
                InternalNavType.f40450n.nr().KN(bundle, key, value);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Double n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public Double qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            return (Double) InternalNavType.f40450n.nr().qie(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "double_nullable";
        }
    };

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final NavType FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Float value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.gh.KN(bundle, key, value);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Float n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Float) {
                return (Float) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public Float qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            return (Float) NavType.gh.qie(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "float_nullable";
        }
    };

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final NavType LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Long value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                bundle.putSerializable(key, null);
            } else {
                NavType.KN.KN(bundle, key, value);
            }
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Long n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Long) {
                return (Long) obj;
            }
            return null;
        }

        @Override // androidx.view.NavType
        public Long qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            return (Long) NavType.KN.qie(value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "long_nullable";
        }
    };

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final NavType StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.view.NavType
        public String qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public String n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            String string = bundle.getString(key);
            return string == null ? V8ValueNull.NULL : string;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "string_non_nullable";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public String xMQ(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String strEncode = Uri.encode(value);
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(value)");
            return strEncode;
        }
    };

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final NavType StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public String[] gh() {
            return new String[0];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public String[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{NavType.Ik.qie(value)};
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
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "string_nullable[]";
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

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final NavType StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(NavType.Ik.qie(value));
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
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "List<String?>";
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

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final NavType DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public double[] gh() {
            return new double[0];
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(double[] value, double[] other) {
            return ArraysKt.contentDeepEquals(value != null ? ArraysKt.toTypedArray(value) : null, other != null ? ArraysKt.toTypedArray(other) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public double[] qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new double[]{((Number) InternalNavType.f40450n.nr().qie(value)).doubleValue()};
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, double[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putDoubleArray(key, value);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public double[] Uo(String value, double[] previousValue) {
            double[] dArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (dArrPlus = ArraysKt.plus(previousValue, qie(value))) == null) ? qie(value) : dArrPlus;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public List qie(double[] value) {
            List<Double> list;
            if (value == null || (list = ArraysKt.toList(value)) == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "double[]";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public double[] n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (double[]) bundle.get(key);
        }
    };

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final NavType DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return ArraysKt.contentDeepEquals(value != null ? (Double[]) value.toArray(new Double[0]) : null, other != null ? (Double[]) other.toArray(new Double[0]) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(InternalNavType.f40450n.nr().qie(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putDoubleArray(key, value != null ? CollectionsKt.toDoubleArray(value) : null);
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
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "List<Double>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            double[] dArr = obj instanceof double[] ? (double[]) obj : null;
            if (dArr != null) {
                return ArraysKt.toList(dArr);
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    };

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000b2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00020\u00192\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Landroidx/navigation/serialization/InternalNavType$EnumListType;", "", "D", "Landroidx/navigation/CollectionNavType;", "", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "Ik", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "ty", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "HI", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "ck", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", InneractiveMediationNameConsts.OTHER, "", "o", "(Ljava/util/List;Ljava/util/List;)Z", "r", "(Ljava/util/List;)Ljava/util/List;", "az", "()Ljava/util/List;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/navigation/NavType$EnumType;", "Z", "Landroidx/navigation/NavType$EnumType;", "enumNavType", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n1#2:578\n1549#3:579\n1620#3,3:580\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumListType\n*L\n496#1:579\n496#1:580,3\n*E\n"})
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final NavType.EnumType enumNavType;

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean mUb(List value, List other) {
            return Intrinsics.areEqual(value != null ? new ArrayList(value) : null, other != null ? new ArrayList(other) : null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            this.enumNavType = new NavType.EnumType(type);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
        public List qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(this.enumNavType.J2(value));
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, List value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putSerializable(key, value != null ? new ArrayList(value) : null);
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public List Uo(String value, List previousValue) {
            List listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (previousValue == null || (listPlus = CollectionsKt.plus((Collection) previousValue, (Iterable) qie(value))) == null) ? qie(value) : listPlus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof EnumListType) {
                return Intrinsics.areEqual(this.enumNavType, ((EnumListType) other).enumNavType);
            }
            return false;
        }

        public int hashCode() {
            return this.enumNavType.hashCode();
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
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            return "List<" + this.enumNavType.getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() + "}>";
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public List n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.view.CollectionNavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public List gh() {
            return CollectionsKt.emptyList();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/navigation/serialization/InternalNavType$EnumNullableType;", "", "D", "Landroidx/navigation/serialization/InternalNavType$SerializableNullableType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "", "value", "ty", "(Ljava/lang/String;)Ljava/lang/Enum;", "XQ", "Ljava/lang/Class;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavTypeConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,577:1\n1#2:578\n1282#3,2:579\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.kt\nandroidx/navigation/serialization/InternalNavType$EnumNullableType\n*L\n527#1:579,2\n*E\n"})
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {

        /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
        private final Class type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(Class type) {
            super(type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.type = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType, androidx.view.NavType
        /* JADX INFO: renamed from: rl */
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public Enum qie(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = null;
            if (Intrinsics.areEqual(value, V8ValueNull.NULL)) {
                return null;
            }
            Object[] enumConstants = this.type.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Object obj2 = enumConstants[i2];
                Enum r52 = (Enum) obj2;
                Intrinsics.checkNotNull(r52);
                if (StringsKt.equals(r52.name(), value, true)) {
                    obj = obj2;
                    break;
                }
                i2++;
            }
            Enum r12 = (Enum) obj;
            if (r12 != null) {
                return r12;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/navigation/serialization/InternalNavType$SerializableNullableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "type", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "bundle", "", "key", "value", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "gh", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "qie", "(Ljava/lang/String;)Ljava/io/Serializable;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "Ljava/lang/Class;", "rl", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private final Class type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void KN(Bundle bundle, String key, Serializable value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putSerializable(key, (Serializable) this.type.cast(value));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof SerializableNullableType) {
                return Intrinsics.areEqual(this.type, ((SerializableNullableType) other).type);
            }
            return false;
        }

        @Override // androidx.view.NavType
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Serializable n(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (Serializable) obj;
            }
            return null;
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
        public String getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }
    }

    public final NavType J2() {
        return IntNullableType;
    }

    public final NavType KN() {
        return StringNonNullableType;
    }

    public final NavType O() {
        return FloatNullableType;
    }

    public final NavType Uo() {
        return LongNullableType;
    }

    public final NavType n() {
        return BoolNullableType;
    }

    public final NavType nr() {
        return DoubleType;
    }

    public final NavType rl() {
        return DoubleArrayType;
    }

    public final NavType t() {
        return DoubleNullableType;
    }

    public final NavType xMQ() {
        return StringNullableListType;
    }

    private InternalNavType() {
    }
}
