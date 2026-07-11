package androidx.view.serialization.serializers;

import Du.DC;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import androidx.view.serialization.serializers.SparseArraySerializer;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import gi.I28;
import gi.w6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LDu/vd;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "LXA/Ml;", "typeSerial0", "(LXA/Ml;)V", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "", "childSerializers", "()[LXA/Ml;", "typeParametersSerializers", "LEJn/Wre;", "descriptor", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements vd {
    private final Wre descriptor;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Ml f41922n;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        DC dc = new DC("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        dc.HI(IV8ValueMap.FUNCTION_KEYS, false);
        dc.HI(IV8ValueMap.FUNCTION_VALUES, false);
        this.descriptor = dc;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(Ml typeSerial0) {
        this();
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        this.f41922n = typeSerial0;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public final Wre getDescriptor() {
        return this.descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public final SparseArraySerializer.SparseArraySurrogate deserialize(I28 decoder) {
        List list;
        List list2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre wre = this.descriptor;
        w6 w6VarRl = decoder.rl(wre);
        Lazy[] lazyArr = SparseArraySerializer.SparseArraySurrogate.f41920t;
        if (w6VarRl.HI()) {
            list = (List) w6VarRl.fD(wre, 0, (XA.w6) lazyArr[0].getValue(), null);
            list2 = (List) w6VarRl.fD(wre, 1, new Du.Wre(this.f41922n), null);
            i2 = 3;
        } else {
            boolean z2 = true;
            int i3 = 0;
            List list3 = null;
            List list4 = null;
            while (z2) {
                int iNY = w6VarRl.nY(wre);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    list3 = (List) w6VarRl.fD(wre, 0, (XA.w6) lazyArr[0].getValue(), list3);
                    i3 |= 1;
                } else {
                    if (iNY != 1) {
                        throw new UnknownFieldException(iNY);
                    }
                    list4 = (List) w6VarRl.fD(wre, 1, new Du.Wre(this.f41922n), list4);
                    i3 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i2 = i3;
        }
        w6VarRl.t(wre);
        return new SparseArraySerializer.SparseArraySurrogate(i2, list, list2, null);
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void serialize(gi.Wre encoder, SparseArraySerializer.SparseArraySurrogate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre wre = this.descriptor;
        gi.Ml mlRl = encoder.rl(wre);
        SparseArraySerializer.SparseArraySurrogate.J2(value, mlRl, wre, this.f41922n);
        mlRl.t(wre);
    }

    @Override // Du.vd
    public final Ml[] typeParametersSerializers() {
        return new Ml[]{this.f41922n};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Du.vd
    public final Ml[] childSerializers() {
        return new Ml[]{SparseArraySerializer.SparseArraySurrogate.f41920t[0].getValue(), new Du.Wre(this.f41922n)};
    }
}
