package androidx.view.serialization;

import DGv.Ml;
import EJn.Wre;
import EJn.Xo;
import XA.w6;
import android.os.Bundle;
import androidx.view.SavedStateReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.utils.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002¢\u0006\u0004\b\"\u0010#J%\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010,J\u0017\u0010I\u001a\u00020H2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010/J#\u0010L\u001a\u00028\u0000\"\u0004\b\u0000\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\bL\u0010(R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010V\u001a\u00020\r2\u0006\u0010R\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010ER\u0016\u0010Y\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "Lgi/j;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.f63190c, "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "", "", "M7", "()Ljava/util/List;", "", "E", "", "wTp", "()[Z", "", "v", "()[C", "", "rV9", "()[D", "", "jB", "()[F", "", "P5", "()[I", "", "p5", "()[J", "", "eF", "()[Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "LXA/w6;", "deserializer", "U", "(LXA/w6;)Ljava/lang/Object;", "LEJn/Wre;", "descriptor", "nY", "(LEJn/Wre;)I", "", "WPU", "()Z", "", "N", "()B", "", "r", "()S", "xMQ", "()I", "", "ty", "()J", "", "o", "()F", "", "Z", "()D", "", "aYN", "()C", "g", "()Ljava/lang/String;", "enumDescriptor", "S", "Lgi/w6;", "rl", "(LEJn/Wre;)Lgi/w6;", "E2", "qie", "Landroid/os/Bundle;", "FX", "()Landroid/os/Bundle;", "t", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "value", "nr", "Ljava/lang/String;", "M", "key", "O", "I", "index", "LDGv/Ml;", "J2", "LDGv/Ml;", c.f62177j, "()LDGv/Ml;", "serializersModule", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,215:1\n90#2:216\n90#2:217\n90#2:218\n90#2:219\n90#2:220\n90#2:221\n90#2:222\n90#2:223\n90#2:224\n90#2:225\n90#2:226\n90#2:227\n90#2:228\n90#2:229\n90#2:230\n90#2:231\n90#2:232\n90#2:233\n90#2:234\n90#2:235\n90#2:236\n90#2:237\n90#2:238\n*S KotlinDebug\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n*L\n92#1:216\n116#1:217\n118#1:218\n120#1:219\n122#1:220\n124#1:221\n126#1:222\n128#1:223\n130#1:224\n132#1:225\n134#1:226\n137#1:227\n141#1:228\n145#1:229\n149#1:230\n153#1:231\n157#1:232\n161#1:233\n165#1:234\n169#1:235\n177#1:236\n184#1:237\n100#1:238\n*E\n"})
public final class SavedStateDecoder extends gi.j {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Ml serializersModule;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private String key;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Bundle savedState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SavedStateConfiguration configuration;

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final List E() {
        return SavedStateReader.T(SavedStateReader.n(this.savedState), this.key);
    }

    private final List M7() {
        return SavedStateReader.r(SavedStateReader.n(this.savedState), this.key);
    }

    private final int[] P5() {
        return SavedStateReader.Ik(SavedStateReader.n(this.savedState), this.key);
    }

    private static final boolean Xw(SavedStateDecoder savedStateDecoder, Wre wre, int i2) {
        return SavedStateReader.rl(SavedStateReader.n(savedStateDecoder.savedState), wre.O(i2));
    }

    private final String[] eF() {
        return SavedStateReader.X(SavedStateReader.n(this.savedState), this.key);
    }

    private final float[] jB() {
        return SavedStateReader.HI(SavedStateReader.n(this.savedState), this.key);
    }

    private final long[] p5() {
        return SavedStateReader.XQ(SavedStateReader.n(this.savedState), this.key);
    }

    private final double[] rV9() {
        return SavedStateReader.az(SavedStateReader.n(this.savedState), this.key);
    }

    private final char[] v() {
        return SavedStateReader.KN(SavedStateReader.n(this.savedState), this.key);
    }

    private final boolean[] wTp() {
        return SavedStateReader.J2(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public boolean E2() {
        return !SavedStateReader.wTp(SavedStateReader.n(this.savedState), this.key);
    }

    /* JADX INFO: renamed from: FX, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // gi.j, gi.I28
    public byte N() {
        return (byte) SavedStateReader.ck(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public int S(Wre enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return SavedStateReader.ck(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public boolean WPU() {
        return SavedStateReader.O(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public double Z() {
        return SavedStateReader.qie(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public char aYN() {
        return SavedStateReader.Uo(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public String g() {
        return SavedStateReader.e(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.I28, gi.w6
    /* JADX INFO: renamed from: n, reason: from getter */
    public Ml getSerializersModule() {
        return this.serializersModule;
    }

    @Override // gi.w6
    public int nY(Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iV = (Intrinsics.areEqual(descriptor.getKind(), Xo.n.f2284n) || Intrinsics.areEqual(descriptor.getKind(), Xo.w6.f2285n)) ? SavedStateReader.v(SavedStateReader.n(this.savedState)) : descriptor.nr();
        while (true) {
            int i2 = this.index;
            if (i2 >= iV || !bzg(descriptor, i2) || Xw(this, descriptor, this.index)) {
                break;
            }
            this.index++;
        }
        int i3 = this.index;
        if (i3 >= iV) {
            return -1;
        }
        this.key = descriptor.O(i3);
        int i5 = this.index;
        this.index = i5 + 1;
        return i5;
    }

    @Override // gi.j, gi.I28
    public float o() {
        return SavedStateReader.ty(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.I28
    public Object qie(w6 deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Object objU = U(deserializer);
        return objU == null ? super.qie(deserializer) : objU;
    }

    @Override // gi.j, gi.I28
    public short r() {
        return (short) SavedStateReader.ck(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public gi.w6 rl(Wre descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.nY(SavedStateReader.n(this.savedState), this.key), this.configuration);
    }

    @Override // gi.j, gi.I28
    public long ty() {
        return SavedStateReader.Z(SavedStateReader.n(this.savedState), this.key);
    }

    @Override // gi.j, gi.I28
    public int xMQ() {
        return SavedStateReader.ck(SavedStateReader.n(this.savedState), this.key);
    }

    private final Object U(w6 deserializer) {
        Object objN = SavedStateDecoder_androidKt.n(this, deserializer);
        if (objN == null) {
            Wre descriptor = deserializer.getDescriptor();
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.J2())) {
                return M7();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.xMQ())) {
                return E();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.n())) {
                return wTp();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.rl())) {
                return v();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.t())) {
                return rV9();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.nr())) {
                return jB();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.O())) {
                return P5();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.Uo())) {
                return p5();
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.KN())) {
                return eF();
            }
            return null;
        }
        return objN;
    }

    private static final boolean bzg(Wre wre, int i2) {
        return wre.xMQ(i2);
    }
}
