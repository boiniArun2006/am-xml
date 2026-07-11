package qcD;

import XoT.C;
import android.media.MediaCodec;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f72470n = new CN3();
    private static final WeakHashMap rl = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f72471t = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(String str) {
        return "registerVideoCodec[" + str + "] IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az(String str) {
        return "registerVideoCodec     CODEC:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(String str, int i2) {
        return "registerVideoCodec[" + str + "] : count=" + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qie() {
        return "unregisterVideoCodec IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty(Ref.ObjectRef objectRef, int i2) {
        return "unregisterVideoCodec[" + objectRef.element + "] : count=" + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(String str) {
        return "registerVideoCodec     CODEC:" + str;
    }

    public final void Uo(MediaCodec codec, final String tag) {
        final int size;
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(tag, "tag");
        C.Uo(this, new Function0() { // from class: qcD.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.KN(tag);
            }
        });
        WeakHashMap weakHashMap = rl;
        synchronized (weakHashMap) {
            try {
                weakHashMap.put(codec, tag);
                Iterator it = weakHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    final String str = (String) ((Map.Entry) it.next()).getValue();
                    C.Uo(f72470n, new Function0() { // from class: qcD.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CN3.xMQ(str);
                        }
                    });
                }
                size = rl.size();
            } catch (Throwable th) {
                throw th;
            }
        }
        FirebaseCrashlytics.getInstance().setCustomKey("videoCodecCount", size);
        C.Uo(this, new Function0() { // from class: qcD.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.mUb(tag, size);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    public final void gh(MediaCodec codec) {
        final int size;
        Intrinsics.checkNotNullParameter(codec, "codec");
        C.Uo(this, new Function0() { // from class: qcD.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.qie();
            }
        });
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        WeakHashMap weakHashMap = rl;
        synchronized (weakHashMap) {
            try {
                objectRef.element = weakHashMap.remove(codec);
                Iterator it = weakHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    final String str = (String) ((Map.Entry) it.next()).getValue();
                    C.Uo(f72470n, new Function0() { // from class: qcD.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CN3.az(str);
                        }
                    });
                }
                size = rl.size();
            } catch (Throwable th) {
                throw th;
            }
        }
        FirebaseCrashlytics.getInstance().setCustomKey("videoCodecCount", size);
        C.Uo(this, new Function0() { // from class: qcD.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CN3.ty(objectRef, size);
            }
        });
    }

    private CN3() {
    }
}
