package androidx.view.serialization;

import EJn.Wre;
import XA.eO;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.view.serialization.serializers.CharSequenceArraySerializer;
import androidx.view.serialization.serializers.CharSequenceListSerializer;
import androidx.view.serialization.serializers.CharSequenceSerializer;
import androidx.view.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.view.serialization.serializers.DefaultParcelableSerializer;
import androidx.view.serialization.serializers.IBinderSerializer;
import androidx.view.serialization.serializers.ParcelableArraySerializer;
import androidx.view.serialization.serializers.ParcelableListSerializer;
import androidx.view.serialization.serializers.SparseParcelableArraySerializer;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/savedstate/serialization/SavedStateEncoder;", "LXA/eO;", "strategy", "value", "", c.f62177j, "(Landroidx/savedstate/serialization/SavedStateEncoder;LXA/eO;Ljava/lang/Object;)Z", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateEncoder_androidKt {
    public static final boolean n(SavedStateEncoder savedStateEncoder, eO strategy, Object obj) {
        Intrinsics.checkNotNullParameter(savedStateEncoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Wre descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.Uo())) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f41909n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            charSequenceSerializer.serialize(savedStateEncoder, (CharSequence) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.qie())) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.rl;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize(savedStateEncoder, (Parcelable) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.mUb())) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.rl;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize(savedStateEncoder, (Serializable) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.xMQ())) {
            IBinderSerializer iBinderSerializer = IBinderSerializer.f41910n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.os.IBinder");
            iBinderSerializer.serialize(savedStateEncoder, (IBinder) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.n()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.J2())) {
            CharSequenceArraySerializer charSequenceArraySerializer = CharSequenceArraySerializer.f41907n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            charSequenceArraySerializer.serialize(savedStateEncoder, (CharSequence[]) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.rl()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.KN())) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.f41908n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize(savedStateEncoder, (List) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.nr()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.gh())) {
            ParcelableArraySerializer parcelableArraySerializer = ParcelableArraySerializer.f41913n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            parcelableArraySerializer.serialize(savedStateEncoder, (Parcelable[]) obj);
            return true;
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.O()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.az())) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.f41914n;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize(savedStateEncoder, (List) obj);
            return true;
        }
        if (!Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.HI()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.ty()) && !Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.t())) {
            return false;
        }
        SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.f41923n;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
        sparseParcelableArraySerializer.serialize(savedStateEncoder, (SparseArray) obj);
        return true;
    }
}
