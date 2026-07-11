package androidx.view.serialization;

import DGv.Ml;
import EJn.Wre;
import EJn.Xo;
import XA.eO;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.view.SavedStateReader;
import androidx.view.SavedStateWriter;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.j;
import gi.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0002¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u000200\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010MJ\u001f\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020S2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bT\u0010UJ+\u0010V\u001a\u00020\u000b\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\bV\u0010WR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\\R$\u0010a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010f\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bX\u0010e¨\u0006g"}, d2 = {"Landroidx/savedstate/serialization/SavedStateEncoder;", "Lgi/n;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.f63190c, "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "", "elementName", "", "s7N", "(Landroid/os/Bundle;Ljava/lang/String;)V", "", "", "value", "U", "(Ljava/util/List;)V", "p5", "", "wTp", "([Z)V", "", "v", "([C)V", "", "rV9", "([D)V", "", "bzg", "([F)V", "", "jB", "([I)V", "", "P5", "([J)V", "", "M7", "([Ljava/lang/String;)V", "LEJn/Wre;", "descriptor", "M", "(Landroidx/savedstate/serialization/SavedStateConfiguration;LEJn/Wre;Landroid/os/Bundle;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/eO;", "serializer", "", "Xw", "(LXA/eO;Ljava/lang/Object;)Z", "index", "r", "(LEJn/Wre;I)Z", "N", "XQ", "(Z)V", "", "KN", "(B)V", "", "o", "(S)V", "E2", "(I)V", "", "az", "(J)V", "", "aYN", "(F)V", "", "Uo", "(D)V", "", "nY", "(C)V", "(Ljava/lang/String;)V", "enumDescriptor", "HI", "(LEJn/Wre;I)V", "Ik", "()V", "Lgi/Ml;", "rl", "(LEJn/Wre;)Lgi/Ml;", "ViF", "(LXA/eO;Ljava/lang/Object;)V", c.f62177j, "Landroid/os/Bundle;", "E", "()Landroid/os/Bundle;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "t", "Ljava/lang/String;", "eF", "()Ljava/lang/String;", "key", "LDGv/Ml;", "nr", "LDGv/Ml;", "()LDGv/Ml;", "serializersModule", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n90#2:282\n90#2:283\n106#2:284\n106#2:285\n106#2:286\n106#2:287\n106#2:288\n106#2:289\n106#2:290\n106#2:291\n106#2:292\n106#2:293\n106#2:294\n106#2:295\n106#2:296\n106#2:297\n106#2:298\n106#2:299\n106#2:300\n106#2:301\n106#2:302\n106#2:303\n106#2:324\n106#2:326\n90#2:327\n106#2:328\n27#3:304\n46#3:305\n32#3,4:306\n31#3,7:316\n126#4:310\n153#4,3:311\n37#5,2:314\n1#6:323\n46#7:325\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n*L\n108#1:282\n111#1:283\n122#1:284\n126#1:285\n130#1:286\n134#1:287\n138#1:288\n142#1:289\n146#1:290\n150#1:291\n154#1:292\n158#1:293\n162#1:294\n166#1:295\n170#1:296\n174#1:297\n178#1:298\n182#1:299\n186#1:300\n190#1:301\n194#1:302\n198#1:303\n211#1:324\n212#1:326\n229#1:327\n234#1:328\n211#1:304\n211#1:305\n211#1:306,4\n211#1:316,7\n211#1:310\n211#1:311,3\n211#1:314,2\n211#1:323\n211#1:325\n*E\n"})
public final class SavedStateEncoder extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final Ml serializersModule;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SavedStateConfiguration configuration;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String key;

    public SavedStateEncoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final void M7(String[] value) {
        SavedStateWriter.e(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void P5(long[] value) {
        SavedStateWriter.S(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void U(List value) {
        SavedStateWriter.o(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void bzg(float[] value) {
        SavedStateWriter.ck(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void jB(int[] value) {
        SavedStateWriter.r(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void p5(List value) {
        SavedStateWriter.X(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void rV9(double[] value) {
        SavedStateWriter.ty(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void s7N(Bundle savedState, String elementName) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean zRl = SavedStateReader.rl(SavedStateReader.n(savedState), "type");
            boolean zAreEqual = Intrinsics.areEqual(elementName, "type");
            if (zRl && zAreEqual) {
                throw new IllegalArgumentException("SavedStateEncoder for " + SavedStateReader.e(SavedStateReader.n(savedState), "type") + " has property '" + elementName + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    private final void v(char[] value) {
        SavedStateWriter.xMQ(SavedStateWriter.n(this.savedState), this.key, value);
    }

    private final void wTp(boolean[] value) {
        SavedStateWriter.Uo(SavedStateWriter.n(this.savedState), this.key, value);
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // gi.n, gi.Wre
    public void E2(int value) {
        SavedStateWriter.Ik(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n, gi.Wre
    public void HI(Wre enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        SavedStateWriter.Ik(SavedStateWriter.n(this.savedState), this.key, index);
    }

    @Override // gi.n, gi.Wre
    public void Ik() {
        SavedStateWriter.WPU(SavedStateWriter.n(this.savedState), this.key);
    }

    @Override // gi.n, gi.Wre
    public void KN(byte value) {
        SavedStateWriter.Ik(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n
    public boolean N(Wre descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strO = descriptor.O(index);
        this.key = strO;
        s7N(this.savedState, strO);
        return true;
    }

    @Override // gi.n, gi.Wre
    public void T(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SavedStateWriter.E2(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n, gi.Wre
    public void Uo(double value) {
        SavedStateWriter.az(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.Wre
    public void ViF(eO serializer, Object value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (Xw(serializer, value)) {
            return;
        }
        super.ViF(serializer, value);
    }

    @Override // gi.n, gi.Wre
    public void XQ(boolean value) {
        SavedStateWriter.J2(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n, gi.Wre
    public void aYN(float value) {
        SavedStateWriter.HI(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n, gi.Wre
    public void az(long value) {
        SavedStateWriter.XQ(SavedStateWriter.n(this.savedState), this.key, value);
    }

    /* JADX INFO: renamed from: eF, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // gi.Wre
    /* JADX INFO: renamed from: n, reason: from getter */
    public Ml getSerializersModule() {
        return this.serializersModule;
    }

    @Override // gi.n, gi.Wre
    public void nY(char value) {
        SavedStateWriter.KN(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.n, gi.Wre
    public void o(short value) {
        SavedStateWriter.Ik(SavedStateWriter.n(this.savedState), this.key, value);
    }

    @Override // gi.Ml
    public boolean r(Wre descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // gi.n, gi.Wre
    public gi.Ml rl(Wre descriptor) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(this.key, "")) {
            M(this.configuration, descriptor, this.savedState);
            return this;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleN = BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.n(bundleN);
        SavedStateWriter.g(SavedStateWriter.n(this.savedState), this.key, bundleN);
        M(this.configuration, descriptor, bundleN);
        return new SavedStateEncoder(bundleN, this.configuration);
    }

    private final void M(SavedStateConfiguration configuration, Wre descriptor, Bundle savedState) {
        if (configuration.getClassDiscriminatorMode() == 1 && !SavedStateReader.rl(SavedStateReader.n(savedState), "type")) {
            if (!Intrinsics.areEqual(descriptor.getKind(), Xo.j.f2283n) && !Intrinsics.areEqual(descriptor.getKind(), Xo.Ml.f2282n)) {
                return;
            }
            SavedStateWriter.E2(SavedStateWriter.n(savedState), "type", descriptor.KN());
        }
    }

    private final boolean Xw(eO serializer, Object value) {
        if (!SavedStateEncoder_androidKt.n(this, serializer, value)) {
            Wre descriptor = serializer.getDescriptor();
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.J2())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                U((List) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.xMQ())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                p5((List) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.n())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.BooleanArray");
                wTp((boolean[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.rl())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.CharArray");
                v((char[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.t())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.DoubleArray");
                rV9((double[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.nr())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.FloatArray");
                bzg((float[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.O())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.IntArray");
                jB((int[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.Uo())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.LongArray");
                P5((long[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.KN())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                M7((String[]) value);
                return true;
            }
            return false;
        }
        return true;
    }
}
