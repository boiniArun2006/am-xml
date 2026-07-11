package androidx.view.serialization;

import EJn.Wre;
import XA.w6;
import android.os.Parcelable;
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
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/savedstate/serialization/SavedStateDecoder;", "LXA/w6;", "strategy", c.f62177j, "(Landroidx/savedstate/serialization/SavedStateDecoder;LXA/w6;)Ljava/lang/Object;", "referenceArraySerializer", "Lkotlin/reflect/KClass;", "", "", "rl", "(LXA/w6;)Lkotlin/reflect/KClass;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoder_androidKt {
    public static final Object n(SavedStateDecoder savedStateDecoder, w6 strategy) {
        Intrinsics.checkNotNullParameter(savedStateDecoder, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Wre descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.Uo())) {
            return CharSequenceSerializer.f41909n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.qie())) {
            return DefaultParcelableSerializer.rl.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.mUb())) {
            return DefaultJavaSerializableSerializer.rl.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.xMQ())) {
            return IBinderSerializer.f41910n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.n()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.J2())) {
            return CharSequenceArraySerializer.f41907n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.rl()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.KN())) {
            return CharSequenceListSerializer.f41908n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.nr())) {
            Parcelable[] parcelableArrRl = ParcelableArraySerializer.f41913n.deserialize(savedStateDecoder);
            return Arrays.copyOf(parcelableArrRl, parcelableArrRl.length, JvmClassMappingKt.getJavaClass(rl(strategy)));
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.gh())) {
            return ParcelableArraySerializer.f41913n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.O()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.az())) {
            return ParcelableListSerializer.f41914n.deserialize(savedStateDecoder);
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.HI()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.ty()) || Intrinsics.areEqual(descriptor, SavedStateCodecUtils_androidKt.t())) {
            return SparseParcelableArraySerializer.f41923n.deserialize(savedStateDecoder);
        }
        return null;
    }

    private static final KClass rl(w6 w6Var) {
        Object objDeserialize = w6Var.deserialize(EmptyArrayDecoder.rl);
        Intrinsics.checkNotNull(objDeserialize);
        return Reflection.getOrCreateKotlinClass(objDeserialize.getClass());
    }
}
