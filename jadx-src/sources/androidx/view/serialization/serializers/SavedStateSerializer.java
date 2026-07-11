package androidx.view.serialization.serializers;

import EJn.Wre;
import EJn.qz;
import XA.Ml;
import android.os.Bundle;
import androidx.view.SavedStateReader;
import androidx.view.SavedStateWriter;
import androidx.view.serialization.SavedStateDecoder;
import androidx.view.serialization.SavedStateEncoder;
import gi.I28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/serialization/serializers/SavedStateSerializer;", "LXA/Ml;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "<init>", "()V", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;Landroid/os/Bundle;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)Landroid/os/Bundle;", "LEJn/Wre;", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,87:1\n106#2:88\n106#2:89\n90#2:90\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.kt\nandroidx/savedstate/serialization/serializers/SavedStateSerializer\n*L\n55#1:88\n57#1:89\n70#1:90\n*E\n"})
public final class SavedStateSerializer implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SavedStateSerializer f41916n = new SavedStateSerializer();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final Wre descriptor = qz.O("androidx.savedstate.SavedState", new Wre[0], null, 4, null);

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Bundle deserialize(I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.n(f41916n.getDescriptor().KN(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return Intrinsics.areEqual(savedStateDecoder.getKey(), "") ? savedStateDecoder.getSavedState() : SavedStateReader.nY(SavedStateReader.n(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, Bundle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.rl(f41916n.getDescriptor().KN(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        if (Intrinsics.areEqual(savedStateEncoder.getKey(), "")) {
            SavedStateWriter.nr(SavedStateWriter.n(savedStateEncoder.getSavedState()), value);
        } else {
            SavedStateWriter.g(SavedStateWriter.n(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
        }
    }

    private SavedStateSerializer() {
    }
}
