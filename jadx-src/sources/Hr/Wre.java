package Hr;

import Hr.Dsr;
import android.media.MediaExtractor;
import android.util.Log;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre implements Dsr {
    private boolean Uo;
    private boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MediaExtractor f3967n = new MediaExtractor();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f3968t = new LinkedHashMap();
    private final Map nr = new LinkedHashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f3966O = new LinkedHashMap();
    private final j J2 = new j();
    private final Lazy KN = LazyKt.lazy(new Function0() { // from class: Hr.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.J(this.f3972n);
        }
    });
    private final Lazy xMQ = LazyKt.lazy(new Function0() { // from class: Hr.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.p5(this.f3973n);
        }
    });
    private final Lazy mUb = LazyKt.lazy(new Function0() { // from class: Hr.w6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Wre.D(this.f3980n);
        }
    });

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class n implements Dsr.j {
        final /* synthetic */ Dsr.n rl;

        n(Dsr.n nVar) {
            this.rl = nVar;
        }

        @Override // Hr.Dsr.j
        public o read(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            return Wre.this.eF(this.rl.n(), byteBuffer);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class j {
        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FX(long j2, Wre wre) {
        return "seek extractor to " + j2 + YjqZUJsVmhcjko.ltbatZKrbyXL + wre.f3967n.getSampleTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List J(Wre wre) {
        if (wre.rl) {
            return CN3.O(wre.f3967n);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M(long j2, Wre wre) {
        return "seek extractor after " + j2 + " // actual " + wre.f3967n.getSampleTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o eF(int i2, ByteBuffer byteBuffer) {
        boolean z2;
        ByteBuffer byteBufferAllocate;
        synchronized (this.J2) {
            try {
                List list = (List) this.nr.get(Integer.valueOf(i2));
                Pair pair = list != null ? (Pair) XoT.qz.t(list) : null;
                if (pair != null) {
                    C c2 = (C) pair.component1();
                    ByteBuffer byteBuffer2 = (ByteBuffer) pair.component2();
                    byteBuffer.rewind();
                    byteBuffer.put(byteBuffer2);
                    byteBuffer.limit(c2.rl());
                    List list2 = (List) this.f3968t.get(Integer.valueOf(i2));
                    if (list2 != null) {
                        list2.add(byteBuffer2);
                    }
                    Log.d(Wre.class.getName(), "Read(" + i2 + ") -> FROM CACHE : " + c2.rl() + " bytes @ " + c2.n());
                    return c2;
                }
                if (this.Uo) {
                    Log.d(Wre.class.getName(), "Read(" + i2 + ") -> EOS[1]");
                    return fuX.f3971n;
                }
                do {
                    z2 = true;
                    if (i2 == this.f3967n.getSampleTrackIndex()) {
                        int sampleData = this.f3967n.readSampleData(byteBuffer, 0);
                        if (sampleData >= 0) {
                            C c4 = new C(this.f3967n.getSampleTime(), sampleData, this.f3967n.getSampleFlags());
                            if (!this.Uo && this.f3967n.advance()) {
                                z2 = false;
                            }
                            this.Uo = z2;
                            return c4;
                        }
                        Log.d(Wre.class.getName(), "Read(" + i2 + ") -> EOS[4]");
                        return fuX.f3971n;
                    }
                    List list3 = (List) this.f3968t.get(Integer.valueOf(this.f3967n.getSampleTrackIndex()));
                    ByteBuffer byteBuffer3 = list3 != null ? (ByteBuffer) XoT.qz.t(list3) : null;
                    if (byteBuffer3 == null) {
                        Object obj = this.f3966O.get(Integer.valueOf(i2));
                        Intrinsics.checkNotNull(obj);
                        byteBufferAllocate = ByteBuffer.allocate(((Number) obj).intValue());
                    } else {
                        byteBufferAllocate = byteBuffer3;
                    }
                    if (byteBuffer3 == null) {
                        Log.d(Wre.class.getName(), "Read(" + i2 + ") -> MADE NEW BUFFER : " + this.f3966O.get(Integer.valueOf(i2)));
                    }
                    int sampleData2 = this.f3967n.readSampleData(byteBufferAllocate, 0);
                    if (sampleData2 < 0) {
                        List list4 = (List) this.f3968t.get(Integer.valueOf(i2));
                        if (list4 != null) {
                            Intrinsics.checkNotNull(byteBufferAllocate);
                            list4.add(byteBufferAllocate);
                        }
                        Log.d(Wre.class.getName(), "Read(" + i2 + ") -> EOS[2]");
                        return fuX.f3971n;
                    }
                    C c5 = new C(this.f3967n.getSampleTime(), sampleData2, this.f3967n.getSampleFlags());
                    Log.d(Wre.class.getName(), "Read(" + i2 + ") -> CACHE(" + this.f3967n.getSampleTrackIndex() + ")");
                    Object obj2 = this.nr.get(Integer.valueOf(this.f3967n.getSampleTrackIndex()));
                    Intrinsics.checkNotNull(obj2);
                    ((List) obj2).add(new Pair(c5, byteBufferAllocate));
                    if (!this.Uo && this.f3967n.advance()) {
                        z2 = false;
                    }
                    this.Uo = z2;
                } while (!z2);
                Log.d(Wre.class.getName(), "Read(" + i2 + ") -> EOS[3]");
                return fuX.f3971n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(FileDescriptor fd, long j2, long j3) throws IOException {
        Intrinsics.checkNotNullParameter(fd, "fd");
        if (this.rl) {
            throw new IllegalStateException("Check failed.");
        }
        this.rl = true;
        this.f3967n.setDataSource(fd, j2, j3);
    }

    public long E(final long j2) {
        this.f3967n.seekTo(j2, 1);
        XoT.C.Uo(this, new Function0() { // from class: Hr.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wre.M(j2, this);
            }
        });
        this.Uo = false;
        return this.f3967n.getSampleTime();
    }

    @Override // Hr.Dsr
    public Dsr.j Ik(Dsr.n track, int i2) {
        Intrinsics.checkNotNullParameter(track, "track");
        if (!nHg().contains(track)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int trackCount = this.f3967n.getTrackCount();
        try {
            this.f3967n.selectTrack(track.n());
            this.nr.put(Integer.valueOf(track.n()), new ArrayList());
            this.f3968t.put(Integer.valueOf(track.n()), new ArrayList());
            this.f3966O.put(Integer.valueOf(track.n()), Integer.valueOf(i2));
            return new n(track);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("Failed to select track " + track.n() + "; trackCount=" + trackCount + " mime=" + track.rl(), e2);
        }
    }

    @Override // Hr.Dsr
    public List nHg() {
        return (List) this.KN.getValue();
    }

    @Override // Cp.j
    public void release() {
        this.f3967n.release();
    }

    @Override // Hr.Dsr
    public long te(final long j2) {
        this.f3967n.seekTo(j2, 0);
        XoT.C.Uo(this, new Function0() { // from class: Hr.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wre.FX(j2, this);
            }
        });
        this.Uo = false;
        return this.f3967n.getSampleTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D(Wre wre) {
        Dsr.n.Ml ml;
        List<Dsr.n> listNHg = wre.nHg();
        ArrayList arrayList = new ArrayList();
        for (Dsr.n nVar : listNHg) {
            if (nVar instanceof Dsr.n.Ml) {
                ml = (Dsr.n.Ml) nVar;
            } else {
                ml = null;
            }
            if (ml != null) {
                arrayList.add(ml);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p5(Wre wre) {
        Dsr.n.j jVar;
        List<Dsr.n> listNHg = wre.nHg();
        ArrayList arrayList = new ArrayList();
        for (Dsr.n nVar : listNHg) {
            if (nVar instanceof Dsr.n.j) {
                jVar = (Dsr.n.j) nVar;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return arrayList;
    }
}
