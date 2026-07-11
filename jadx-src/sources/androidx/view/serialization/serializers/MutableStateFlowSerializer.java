package androidx.view.serialization.serializers;

import EJn.Wre;
import TFv.Lu;
import TFv.SPz;
import XA.Ml;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.I28;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0017\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/Ml;", "LTFv/SPz;", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;LTFv/SPz;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)LTFv/SPz;", c.f62177j, "LXA/Ml;", "valueSerializer", "LEJn/Wre;", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "getDescriptor$annotations", "()V", "descriptor", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MutableStateFlowSerializer<T> implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ml valueSerializer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Wre descriptor;

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return this.descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public SPz deserialize(I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Lu.n(decoder.qie(this.valueSerializer));
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, SPz value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.ViF(this.valueSerializer, value.getValue());
    }
}
