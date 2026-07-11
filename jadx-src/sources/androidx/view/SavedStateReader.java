package androidx.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b%\u0010&J-\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\"*\u00020'2\u0006\u0010\b\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u001b\u00104\u001a\b\u0012\u0004\u0012\u00020\u001b032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0012032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b6\u00105J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u0007032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u00105J\u001d\u00107\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b7\u00105J3\u00108\u001a\b\u0012\u0004\u0012\u00028\u000003\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020:2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00120@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020F2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020I2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020L2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bM\u0010NJ\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00070@2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bO\u0010PJ3\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000@\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\bQ\u0010RJ5\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010@\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\bS\u0010RJ3\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000T\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\bU\u0010VJ5\u0010W\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010T\"\b\b\u0000\u0010\"*\u00020!2\u0006\u0010\b\u001a\u00020\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\bW\u0010VJ\u0019\u0010X\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010YJ\r\u0010[\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\f¢\u0006\u0004\b]\u0010^J\u0015\u0010_\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b_\u0010\u000eJ\u0018\u0010`\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b`\u0010\u000eJ\u001b\u0010b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010a¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bf\u0010\\J\u001a\u0010h\u001a\u00020\f2\b\u0010g\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bh\u0010iR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010j\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006k"}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", c.f62177j, "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "nr", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;", "", "O", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "", "Uo", "(Landroid/os/Bundle;Ljava/lang/String;)C", "", "xMQ", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/CharSequence;", "", "qie", "(Landroid/os/Bundle;Ljava/lang/String;)D", "", "ty", "(Landroid/os/Bundle;Ljava/lang/String;)F", "", "ck", "(Landroid/os/Bundle;Ljava/lang/String;)I", "", "Z", "(Landroid/os/Bundle;Ljava/lang/String;)J", "Landroid/os/Parcelable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/reflect/KClass;", "parcelableClass", "S", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/os/Parcelable;", "Ljava/io/Serializable;", "serializableClass", "o", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/io/Serializable;", "Landroid/util/Size;", "te", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/Size;", "Landroid/util/SizeF;", "iF", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SizeF;", "e", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "", "r", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "gh", "N", "ViF", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/util/List;", "", "J2", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "", "KN", "(Landroid/os/Bundle;Ljava/lang/String;)[C", "", "mUb", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/CharSequence;", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;)[D", "", "HI", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "", "Ik", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "", "XQ", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "X", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "WPU", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)[Landroid/os/Parcelable;", "aYN", "Landroid/util/SparseArray;", "fD", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/util/SparseArray;", "E2", "nY", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "g", "v", "(Landroid/os/Bundle;)I", "s7N", "(Landroid/os/Bundle;)Z", "wTp", "rl", "", "rV9", "(Landroid/os/Bundle;)Ljava/util/Map;", "bzg", "(Landroid/os/Bundle;)Ljava/lang/String;", "nHg", InneractiveMediationNameConsts.OTHER, "t", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nSavedStateReader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,915:1\n653#1:916\n689#1:917\n510#1:918\n545#1:919\n1#2:920\n*S KotlinDebug\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n421#1:916\n426#1:917\n456#1:918\n461#1:919\n*E\n"})
public final class SavedStateReader {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Bundle source;

    public static String bzg(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public static Bundle n(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static int nHg(Bundle bundle) {
        return bundle.hashCode();
    }

    public static boolean t(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && Intrinsics.areEqual(bundle, ((SavedStateReader) obj).getSource());
    }

    /* JADX INFO: renamed from: Xw, reason: from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }

    public boolean equals(Object obj) {
        return t(this.source, obj);
    }

    public int hashCode() {
        return nHg(this.source);
    }

    public String toString() {
        return bzg(this.source);
    }

    public static final SparseArray E2(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        return BundleCompat.O(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
    }

    public static final float[] HI(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final int[] Ik(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final boolean[] J2(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final char[] KN(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final List N(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean O(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z2 = bundle.getBoolean(key, false);
        if (z2 || !bundle.getBoolean(key, true)) {
            return z2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable S(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable parcelable = (Parcelable) BundleCompat.n(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (parcelable != null) {
            return parcelable;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final List T(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final char Uo(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char c2 = bundle.getChar(key, (char) 0);
        if (c2 != 0 || bundle.getChar(key, CharCompanionObject.MAX_VALUE) != 65535) {
            return c2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final List ViF(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList arrayListT = BundleCompat.t(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (arrayListT != null) {
            return arrayListT;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable[] WPU(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable[] parcelableArrAYN = aYN(bundle, key, parcelableClass);
        if (parcelableArrAYN != null) {
            return parcelableArrAYN;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final String[] X(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final long[] XQ(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final long Z(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long j2 = bundle.getLong(key, Long.MIN_VALUE);
        if (j2 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Parcelable[] aYN(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        Parcelable[] parcelableArrRl = BundleCompat.rl(bundle, key, JvmClassMappingKt.getJavaClass(parcelableClass));
        if (parcelableArrRl != null) {
            return parcelableArrRl;
        }
        return null;
    }

    public static final double[] az(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final int ck(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i2 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i2 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final String e(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final SparseArray fD(Bundle bundle, String key, KClass parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        SparseArray sparseArrayE2 = E2(bundle, key, parcelableClass);
        if (sparseArrayE2 != null) {
            return sparseArrayE2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Bundle g(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    public static final List gh(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final SizeF iF(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final CharSequence[] mUb(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Bundle nY(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final IBinder nr(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Serializable o(Bundle bundle, String key, KClass serializableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        Serializable serializableNr = BundleCompat.nr(bundle, key, JvmClassMappingKt.getJavaClass(serializableClass));
        if (serializableNr != null) {
            return serializableNr;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final double qie(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double d2 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d2 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d2;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final List r(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final boolean rl(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static final Size te(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final float ty(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float f3 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f3 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f3;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final boolean wTp(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return rl(bundle, key) && bundle.get(key) == null;
    }

    public static final CharSequence xMQ(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.n(key);
        throw new KotlinNothingValueException();
    }

    public static final Map rV9(Bundle bundle) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            mapCreateMapBuilder.put(str, bundle.get(str));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    public static final boolean s7N(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final int v(Bundle bundle) {
        return bundle.size();
    }
}
