package androidx.view.serialization;

import EJn.Wre;
import WY.j;
import XA.fuX;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.view.serialization.serializers.CharSequenceSerializer;
import androidx.view.serialization.serializers.DefaultParcelableSerializer;
import androidx.view.serialization.serializers.SparseArraySerializer;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b&\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\" \u0010\u0012\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004\"\u001a\u0010\u0017\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000f\u0010\u0004\"\u001a\u0010\u001a\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\" \u0010\u001c\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0002\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0001\u0010\u0004\" \u0010\u001e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0002\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u001f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010%\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\t\u0010\u0004¨\u0006&"}, d2 = {"LEJn/Wre;", c.f62177j, "LEJn/Wre;", "Uo", "()LEJn/Wre;", "polymorphicCharSequenceDescriptor", "rl", "qie", "polymorphicParcelableDescriptor", "t", "mUb", "polymorphicJavaSerializableDescriptor", "nr", "xMQ", "polymorphicIBinderDescriptor", "O", "getParcelableArrayDescriptor$annotations", "()V", "parcelableArrayDescriptor", "J2", "gh", "getPolymorphicParcelableArrayDescriptor$annotations", "polymorphicParcelableArrayDescriptor", "parcelableListDescriptor", "KN", "az", "polymorphicParcelableListDescriptor", "getCharSequenceArrayDescriptor$annotations", "charSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "charSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "HI", "sparseParcelableArrayDescriptor", "ty", "polymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,67:1\n194#2:68\n194#2:69\n194#2:70\n194#2:71\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n*L\n42#1:68\n45#1:69\n52#1:70\n55#1:71\n*E\n"})
public final class SavedStateCodecUtils_androidKt {
    private static final Wre HI;
    private static final Wre J2;
    private static final Wre KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Wre f41892O;
    private static final Wre Uo;
    private static final Wre az;
    private static final Wre gh;
    private static final Wre mUb;
    private static final Wre qie;
    private static final Wre ty;
    private static final Wre xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Wre f41893n = new fuX(Reflection.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();
    private static final Wre rl = new fuX(Reflection.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Wre f41894t = new fuX(Reflection.getOrCreateKotlinClass(Serializable.class)).getDescriptor();
    private static final Wre nr = new fuX(Reflection.getOrCreateKotlinClass(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.rl;
        f41892O = j.n(Reflection.getOrCreateKotlinClass(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        J2 = j.n(Reflection.getOrCreateKotlinClass(Parcelable.class), new fuX(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        Uo = j.KN(defaultParcelableSerializer).getDescriptor();
        KN = j.KN(new fuX(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f41909n;
        xMQ = j.n(Reflection.getOrCreateKotlinClass(CharSequence.class), charSequenceSerializer).getDescriptor();
        mUb = j.n(Reflection.getOrCreateKotlinClass(CharSequence.class), new fuX(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        gh = j.KN(charSequenceSerializer).getDescriptor();
        qie = j.KN(new fuX(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        az = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        ty = new SparseArraySerializer(new fuX(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        HI = new SparseArraySerializer(j.Z(new fuX(Reflection.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }

    public static final Wre HI() {
        return az;
    }

    public static final Wre J2() {
        return mUb;
    }

    public static final Wre KN() {
        return qie;
    }

    public static final Wre O() {
        return Uo;
    }

    public static final Wre Uo() {
        return f41893n;
    }

    public static final Wre az() {
        return KN;
    }

    public static final Wre gh() {
        return J2;
    }

    public static final Wre mUb() {
        return f41894t;
    }

    public static final Wre n() {
        return xMQ;
    }

    public static final Wre nr() {
        return f41892O;
    }

    public static final Wre qie() {
        return rl;
    }

    public static final Wre rl() {
        return gh;
    }

    public static final Wre t() {
        return HI;
    }

    public static final Wre ty() {
        return ty;
    }

    public static final Wre xMQ() {
        return nr;
    }
}
