package androidx.view.serialization.serializers;

import EJn.Wre;
import EJn.qz;
import XA.Ml;
import android.util.SizeF;
import androidx.view.SavedStateReader;
import androidx.view.SavedStateWriter;
import androidx.view.serialization.SavedStateDecoder;
import androidx.view.serialization.SavedStateEncoder;
import gi.I28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/savedstate/serialization/serializers/SizeFSerializer;", "LXA/Ml;", "Landroid/util/SizeF;", "<init>", "()V", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;Landroid/util/SizeF;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)Landroid/util/SizeF;", "LEJn/Wre;", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SizeFSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SizeFSerializer\n*L\n89#1:423\n96#1:424\n*E\n"})
public final class SizeFSerializer implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SizeFSerializer f41917n = new SizeFSerializer();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Wre descriptor = qz.O("android.util.SizeF", new Wre[0], null, 4, null);

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public SizeF deserialize(I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.n(f41917n.getDescriptor().KN(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return SavedStateReader.iF(SavedStateReader.n(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, SizeF value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.rl(f41917n.getDescriptor().KN(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.iF(SavedStateWriter.n(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }

    private SizeFSerializer() {
    }
}
