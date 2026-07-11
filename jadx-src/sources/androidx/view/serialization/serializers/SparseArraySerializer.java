package androidx.view.serialization.serializers;

import Du.DC;
import Du.g9;
import Du.i;
import Du.iF;
import EJn.Wre;
import XA.Ml;
import XA.Xo;
import XA.eO;
import android.util.SparseArray;
import androidx.view.serialization.serializers.SparseArraySerializer;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import gi.I28;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/Ml;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(LXA/Ml;)V", "Lgi/Wre;", "encoder", "value", "", "t", "(Lgi/Wre;Landroid/util/SparseArray;)V", "Lgi/I28;", "decoder", "rl", "(Lgi/I28;)Landroid/util/SparseArray;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", c.f62177j, "LXA/Ml;", "surrogateSerializer", "LEJn/Wre;", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "SparseArraySurrogate", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SparseArraySerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class SparseArraySerializer<T> implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ml surrogateSerializer;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Wre descriptor;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001d*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001e\u001dB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0015\u001a\u00020\u0014\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "", IV8ValueMap.FUNCTION_KEYS, IV8ValueMap.FUNCTION_VALUES, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "LDu/i;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;LDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "LXA/Ml;", "typeSerial0", "", "J2", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lgi/Ml;LEJn/Wre;LXA/Ml;)V", c.f62177j, "Ljava/util/List;", "nr", "()Ljava/util/List;", "rl", "O", "Companion", "$serializer", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Xo
    static final class SparseArraySurrogate<T> {
        private static final Wre nr;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final List keys;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final List values;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Lazy[] f41920t = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: androidx.savedstate.serialization.serializers.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate.rl();
            }
        }), null};

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/Ml;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(LXA/Ml;)LXA/Ml;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <T> Ml serializer(Ml typeSerial0) {
                Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }
        }

        public /* synthetic */ SparseArraySurrogate(int i2, List list, List list2, i iVar) {
            if (3 != (i2 & 3)) {
                g9.n(i2, 3, nr);
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Ml rl() {
            return new Du.Wre(iF.f2020n);
        }

        static {
            DC dc = new DC("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            dc.HI(IV8ValueMap.FUNCTION_KEYS, false);
            dc.HI(IV8ValueMap.FUNCTION_VALUES, false);
            nr = dc;
        }

        public SparseArraySurrogate(List keys, List values) {
            Intrinsics.checkNotNullParameter(keys, "keys");
            Intrinsics.checkNotNullParameter(values, "values");
            this.keys = keys;
            this.values = values;
        }

        public static final /* synthetic */ void J2(SparseArraySurrogate self, gi.Ml output, Wre serialDesc, Ml typeSerial0) {
            output.S(serialDesc, 0, (eO) f41920t[0].getValue(), self.keys);
            output.S(serialDesc, 1, new Du.Wre(typeSerial0), self.values);
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final List getValues() {
            return this.values;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final List getKeys() {
            return this.keys;
        }
    }

    public SparseArraySerializer(Ml elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        Ml mlSerializer = SparseArraySurrogate.INSTANCE.serializer(elementSerializer);
        this.surrogateSerializer = mlSerializer;
        this.descriptor = mlSerializer.getDescriptor();
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return this.descriptor;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public SparseArray deserialize(I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.qie(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SparseArray sparseArray = new SparseArray(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.append(((Number) sparseArraySurrogate.getKeys().get(i2)).intValue(), sparseArraySurrogate.getValues().get(i2));
        }
        return sparseArray;
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, SparseArray value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(value.keyAt(i2)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(value.valueAt(i3));
        }
        encoder.ViF(this.surrogateSerializer, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
