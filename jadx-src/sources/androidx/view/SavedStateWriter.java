package androidx.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J'\u0010'\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u00020%2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u00020)2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020/¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J#\u00105\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001d04¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001404¢\u0006\u0004\b7\u00106J#\u00108\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000704¢\u0006\u0004\b8\u00106J-\u00109\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u00020%2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u000004¢\u0006\u0004\b9\u00106J\u001d\u0010;\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020=¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00140@¢\u0006\u0004\bA\u0010BJ\u001d\u0010D\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020F¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u001d\u0010M\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020L¢\u0006\u0004\bM\u0010NJ#\u0010O\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070@¢\u0006\u0004\bO\u0010PJ-\u0010Q\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u00020%2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0004\bQ\u0010RJ-\u0010T\u001a\u00020\u000b\"\b\b\u0000\u0010&*\u00020%2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000S¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bV\u0010WJ\u0019\u0010Y\u001a\u00020\u000b2\n\u0010X\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\bY\u0010ZJ\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010$J\u0010\u0010[\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b]\u0010^J\u001a\u0010`\u001a\u00020\u000e2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b`\u0010aR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010b\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006c"}, d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "source", c.f62177j, "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "Landroid/os/IBinder;", "value", "", "O", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V", "", "J2", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "", "KN", "(Landroid/os/Bundle;Ljava/lang/String;C)V", "", "mUb", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/CharSequence;)V", "", "az", "(Landroid/os/Bundle;Ljava/lang/String;D)V", "", "HI", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "", "Ik", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "", "XQ", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "WPU", "(Landroid/os/Bundle;Ljava/lang/String;)V", "Landroid/os/Parcelable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "aYN", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "Ljava/io/Serializable;", "Z", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "Landroid/util/Size;", "te", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "Landroid/util/SizeF;", "iF", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "E2", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "", "o", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "qie", "X", "nY", "", "Uo", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "", "xMQ", "(Landroid/os/Bundle;Ljava/lang/String;[C)V", "", "gh", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/CharSequence;)V", "", "ty", "(Landroid/os/Bundle;Ljava/lang/String;[D)V", "", "ck", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "", "r", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "", "S", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "e", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "ViF", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "Landroid/util/SparseArray;", "fD", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SparseArray;)V", "g", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "from", "nr", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "N", "(Landroid/os/Bundle;)Ljava/lang/String;", "t", "(Landroid/os/Bundle;)I", InneractiveMediationNameConsts.OTHER, "rl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class SavedStateWriter {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Bundle source;

    public static String N(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public static Bundle n(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static boolean rl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.areEqual(bundle, ((SavedStateWriter) obj).getSource());
    }

    public static int t(Bundle bundle) {
        return bundle.hashCode();
    }

    public boolean equals(Object obj) {
        return rl(this.source, obj);
    }

    public int hashCode() {
        return t(this.source);
    }

    /* JADX INFO: renamed from: nHg, reason: from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }

    public String toString() {
        return N(this.source);
    }

    public static final void E2(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putString(key, value);
    }

    public static final void HI(Bundle bundle, String key, float f3) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putFloat(key, f3);
    }

    public static final void Ik(Bundle bundle, String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putInt(key, i2);
    }

    public static final void J2(Bundle bundle, String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBoolean(key, z2);
    }

    public static final void KN(Bundle bundle, String key, char c2) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putChar(key, c2);
    }

    public static final void O(Bundle bundle, String key, IBinder value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBinder(key, value);
    }

    public static final void S(Bundle bundle, String key, long[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putLongArray(key, value);
    }

    public static final void T(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }

    public static final void Uo(Bundle bundle, String key, boolean[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBooleanArray(key, value);
    }

    public static final void ViF(Bundle bundle, String key, Parcelable[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArray(key, value);
    }

    public static final void WPU(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    public static final void X(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, SavedStateWriterKt.n(value));
    }

    public static final void XQ(Bundle bundle, String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putLong(key, j2);
    }

    public static final void Z(Bundle bundle, String key, Serializable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSerializable(key, value);
    }

    public static final void aYN(Bundle bundle, String key, Parcelable value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelable(key, value);
    }

    public static final void az(Bundle bundle, String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putDouble(key, d2);
    }

    public static final void ck(Bundle bundle, String key, float[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putFloatArray(key, value);
    }

    public static final void e(Bundle bundle, String key, String[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArray(key, value);
    }

    public static final void fD(Bundle bundle, String key, SparseArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    public static final void g(Bundle bundle, String key, Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void gh(Bundle bundle, String key, CharSequence[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    public static final void iF(Bundle bundle, String key, SizeF value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSizeF(key, value);
    }

    public static final void mUb(Bundle bundle, String key, CharSequence value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequence(key, value);
    }

    public static final void nY(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArrayList(key, SavedStateWriterKt.n(value));
    }

    public static final void nr(Bundle bundle, Bundle from) {
        Intrinsics.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    public static final void o(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntegerArrayList(key, SavedStateWriterKt.n(value));
    }

    public static final void qie(Bundle bundle, String key, List value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArrayList(key, SavedStateWriterKt.n(value));
    }

    public static final void r(Bundle bundle, String key, int[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntArray(key, value);
    }

    public static final void te(Bundle bundle, String key, Size value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSize(key, value);
    }

    public static final void ty(Bundle bundle, String key, double[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putDoubleArray(key, value);
    }

    public static final void xMQ(Bundle bundle, String key, char[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharArray(key, value);
    }
}
