package androidx.view.serialization.serializers;

import EJn.Wre;
import EJn.qz;
import XA.Ml;
import android.os.Parcelable;
import androidx.view.SavedStateReader;
import androidx.view.SavedStateWriter;
import androidx.view.serialization.SavedStateDecoder;
import androidx.view.serialization.SavedStateEncoder;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.I28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/savedstate/serialization/serializers/ParcelableSerializer;", "Landroid/os/Parcelable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/Ml;", "<init>", "()V", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;Landroid/os/Parcelable;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)Landroid/os/Parcelable;", "LEJn/Wre;", c.f62177j, "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/ParcelableSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 4 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n252#4:425\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/ParcelableSerializer\n*L\n186#1:423\n194#1:424\n194#1:425\n*E\n"})
public abstract class ParcelableSerializer<T extends Parcelable> implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Wre descriptor = qz.O("android.os.Parcelable", new Wre[0], null, 4, null);

    @Override // XA.Ml, XA.eO, XA.w6
    public final Wre getDescriptor() {
        return this.descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final Parcelable deserialize(I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.n(this.descriptor.KN(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        Parcelable parcelableS = SavedStateReader.S(SavedStateReader.n(savedStateDecoder.getSavedState()), savedStateDecoder.getKey(), Reflection.getOrCreateKotlinClass(Parcelable.class));
        Intrinsics.checkNotNull(parcelableS, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.ParcelableSerializer");
        return parcelableS;
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void serialize(gi.Wre encoder, Parcelable value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.rl(this.descriptor.KN(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.aYN(SavedStateWriter.n(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }
}
