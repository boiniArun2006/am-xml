package Bn1;

import B7.fuX;
import B7.s4;
import GJW.yg;
import LQ.fuX;
import LQ.j;
import android.media.AudioFormat;
import android.media.AudioTrack;
import as.Pl;
import as.aC;
import as.eO;
import as.qz;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements s4 {
    private static int gh;
    public static final j mUb = new j(null);
    private boolean J2;
    private DD.n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f595O;
    private DD.n Uo;
    private final Function1 nr;
    private final B7.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f596t;
    private boolean xMQ;

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f597O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f598S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f600n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f601o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f602r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f603t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f601o = obj;
            this.f598S |= Integer.MIN_VALUE;
            return I28.this.t(null, this);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final s4 rl(as.CN3 streamProperties) {
            int i2;
            Intrinsics.checkNotNullParameter(streamProperties, "streamProperties");
            int iRl = streamProperties.rl();
            int iT = streamProperties.t();
            if (qz.nr(iRl, Pl.n(1))) {
                i2 = 4;
            } else {
                if (!qz.nr(iRl, Pl.n(2))) {
                    throw new IllegalArgumentException("Channel count not supported: " + ((Object) qz.J2(iRl)));
                }
                i2 = 12;
            }
            int iN = n(iT, i2, 2) * 5;
            try {
                AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(iT).setChannelMask(i2).build()).setBufferSizeInBytes(iN).setTransferMode(1).build();
                Intrinsics.checkNotNullExpressionValue(audioTrackBuild, "try {\n                Au…          )\n            }");
                I28.gh++;
                return new I28(new Bn1.j(audioTrackBuild), false, null, 6, null);
            } catch (UnsupportedOperationException e2) {
                throw new UnsupportedOperationException("channel count: " + ((Object) qz.J2(iRl)) + ", sample rate: " + ((Object) eO.xMQ(iT)) + ", buffer size: " + iN + ", number of audio track creations: " + I28.gh + ", ", e2);
            }
        }

        private final int n(int i2, int i3, int i5) {
            int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i5);
            if (minBufferSize != -2) {
                if (minBufferSize != -1 && minBufferSize >= 0) {
                    return minBufferSize;
                }
                throw new IllegalStateException(("An error occurred while querying the system min buffer size: size = " + minBufferSize).toString());
            }
            throw new IllegalArgumentException(("An invalid value was passed to getMinBufferSize: (" + ((Object) eO.xMQ(i2)) + ", " + i3 + ", " + i5 + ')').toString());
        }
    }

    static final class n extends Lambda implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return Unit.INSTANCE;
        }

        n() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            I28.this.ty();
            if (I28.this.r()) {
                throw new IllegalStateException("Trying to flush while playing");
            }
            I28.this.rl.flush();
            Function1 function1 = I28.this.nr;
            if (function1 != null) {
                function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Flushed"));
            }
            I28.this.f595O = w9.w6.f74806t.n();
            I28.this.J2 = true;
        }
    }

    static final class w6 extends Lambda implements Function0 {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return Unit.INSTANCE;
        }

        w6() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            I28.this.ty();
            I28.this.rl.release();
            I28.this.xMQ = true;
            Function1 function1 = I28.this.nr;
            if (function1 != null) {
                function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Released"));
            }
        }
    }

    public I28(B7.Dsr audioTrack, boolean z2, Function1 function1) {
        Intrinsics.checkNotNullParameter(audioTrack, "audioTrack");
        this.rl = audioTrack;
        this.f596t = z2;
        this.nr = function1;
        if (!Intrinsics.areEqual(audioTrack.getPlaybackState(), fuX.w6.f265n)) {
            throw new IllegalArgumentException(("Play state of audio track must be stopped, got: " + audioTrack.getPlaybackState()).toString());
        }
        this.f595O = w9.w6.f74806t.n();
        this.J2 = true;
        this.Uo = new DD.n();
        this.KN = new DD.n();
    }

    private final Object HI(Function0 function0) {
        DD.n nVar = this.KN;
        nVar.rl();
        try {
            DD.n nVar2 = this.Uo;
            nVar2.rl();
            try {
                return function0.invoke();
            } finally {
                nVar2.n();
            }
        } finally {
            nVar.n();
        }
    }

    private final LQ.j Z(as.n nVar) throws fuX.j {
        int iHI;
        LQ.fuX fux = new LQ.fuX();
        try {
            o(nVar);
            if (this.J2) {
                int iKN = v9.n.KN(nVar.O());
                Function1 function1 = this.nr;
                if (function1 != null) {
                    function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Trying to write " + iKN + " number of bytes"));
                }
                iHI = ((w9.w6) fux.O(this.rl.write(nVar.O()))).HI();
                if (this.f596t && this.rl.rl() != 0) {
                    throw new IllegalStateException(("Underruns are prohibited. Current underrun count: " + this.rl.rl()).toString());
                }
                this.f595O = w9.w6.qie(this.f595O, iHI);
                Function1 function12 = this.nr;
                if (function12 != null) {
                    function12.invoke(new Pair("FELLINI_AUDIO_TRACK", "Wrote " + iHI + " number of bytes, " + w9.w6.gh(iKN, iHI) + " less than desired"));
                }
                if (w9.w6.mUb(iHI)) {
                    this.J2 = r();
                }
            } else {
                iHI = w9.w6.f74806t.n();
            }
            return new j.w6(w9.w6.rl(iHI));
        } catch (fuX.j e2) {
            if (e2.rl() == fux) {
                return new j.n(e2.n());
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r() {
        return Intrinsics.areEqual(this.rl.getPlaybackState(), fuX.n.f264n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ty() {
        if (this.xMQ) {
            throw new IllegalStateException("Instance has already been released. Make sure to not invoke any method of the instance after the release");
        }
    }

    @Override // B7.s4
    public void flush() {
        HI(new n());
    }

    @Override // B7.CN3
    public B7.fuX getPlaybackState() {
        return this.rl.getPlaybackState();
    }

    @Override // B7.CN3
    public as.CN3 n() {
        return this.rl.n();
    }

    @Override // B7.CN3
    public long nr() {
        return aC.rl(as.I28.n(as.Ml.f43088n, this.f595O, ck(), s4.f273n.n()), Ik());
    }

    @Override // B7.s4
    public void pause() {
        DD.n nVar = this.Uo;
        nVar.rl();
        try {
            ty();
            if (Intrinsics.areEqual(this.rl.getPlaybackState(), fuX.j.f263n)) {
                throw new IllegalStateException("Must not be invoked while audio track is paused");
            }
            this.rl.pause();
            Function1 function1 = this.nr;
            if (function1 != null) {
                function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Paused"));
            }
            Unit unit = Unit.INSTANCE;
            nVar.n();
        } catch (Throwable th) {
            nVar.n();
            throw th;
        }
    }

    @Override // B7.s4
    public void play() {
        DD.n nVar = this.Uo;
        nVar.rl();
        try {
            ty();
            if (r()) {
                throw new IllegalStateException("Must not be invoked while audio track is playing");
            }
            this.rl.play();
            Function1 function1 = this.nr;
            if (function1 != null) {
                function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Started playing"));
            }
            this.J2 = true;
            Unit unit = Unit.INSTANCE;
            nVar.n();
        } catch (Throwable th) {
            nVar.n();
            throw th;
        }
    }

    @Override // B7.s4
    public void release() {
        HI(new w6());
    }

    @Override // B7.CN3
    public long rl() {
        return aC.rl(this.rl.t(), Ik());
    }

    @Override // B7.s4
    public void stop() {
        DD.n nVar = this.Uo;
        nVar.rl();
        try {
            ty();
            if (Intrinsics.areEqual(this.rl.getPlaybackState(), fuX.w6.f265n)) {
                throw new IllegalStateException("Must not be invoked while audio track is stopped");
            }
            this.rl.stop();
            Function1 function1 = this.nr;
            if (function1 != null) {
                function1.invoke(new Pair("FELLINI_AUDIO_TRACK", "Stopped"));
            }
            this.f595O = w9.w6.f74806t.n();
            this.J2 = true;
            Unit unit = Unit.INSTANCE;
            nVar.n();
        } catch (Throwable th) {
            nVar.n();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B7.s4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(as.n nVar, Continuation continuation) throws Throwable {
        Ml ml;
        LQ.fuX fux;
        DD.n nVar2;
        I28 i28;
        LQ.CN3 cn3;
        Throwable th;
        DD.n nVar3;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f598S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f598S = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f601o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f598S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            fux = new LQ.fuX();
            try {
                nVar2 = this.KN;
                nVar2.rl();
                try {
                    ty();
                    i28 = this;
                    cn3 = fux;
                } catch (Throwable th2) {
                    DD.n nVar4 = nVar2;
                    th = th2;
                    nVar3 = nVar4;
                    nVar3.n();
                    throw th;
                }
            } catch (fuX.j e2) {
                if (e2.rl() == fux) {
                    return new j.n(e2.n());
                }
                throw e2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar3 = (DD.n) ml.f602r;
            cn3 = (LQ.CN3) ml.J2;
            fux = (LQ.fuX) ml.f597O;
            as.n nVar5 = (as.n) ml.f603t;
            i28 = (I28) ml.f600n;
            try {
                ResultKt.throwOnFailure(obj);
                nVar2 = nVar3;
                nVar = nVar5;
            } catch (Throwable th3) {
                th = th3;
                nVar3.n();
                throw th;
            }
        }
        while (nVar.O().hasRemaining()) {
            if (w9.w6.mUb(((w9.w6) cn3.O(i28.Z(nVar))).HI())) {
                long jTy = d2n.j.ty(d2n.j.xMQ(aC.rl(as.Ml.KN(as.I28.n(as.Ml.f43088n, i28.f595O, i28.ck(), s4.f273n.n()), i28.rl.t()), i28.Ik()), 2));
                ml.f600n = i28;
                ml.f603t = nVar;
                ml.f597O = fux;
                ml.J2 = cn3;
                ml.f602r = nVar2;
                ml.f598S = 1;
                if (yg.rl(jTy, ml) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        nVar2.n();
        return new j.w6(Unit.INSTANCE);
    }

    private final int Ik() {
        return n().t();
    }

    private final int ck() {
        return n().rl();
    }

    private final void o(as.n nVar) {
        if (qz.nr(nVar.nr(), ck())) {
            if (eO.Uo(nVar.J2(), Ik())) {
                return;
            }
            throw new IllegalArgumentException(("The fragment must have a sample rate of " + ((Object) eO.xMQ(Ik())) + ", found " + ((Object) eO.xMQ(nVar.J2()))).toString());
        }
        throw new IllegalArgumentException(("The fragment must have " + ((Object) qz.J2(ck())) + " channels, found " + ((Object) qz.J2(nVar.nr()))).toString());
    }

    public /* synthetic */ I28(B7.Dsr dsr, boolean z2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsr, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : function1);
    }
}
