package Ouh;

import GJW.AbstractC1363t;
import GJW.Lu;
import GJW.V1;
import GJW.vd;
import GJW.yg;
import ILs.r;
import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import cS.Zv.SzFNXybiSxdx;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.video.MediaCodecVideoRenderer;
import com.google.common.collect.o7q;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import uPp.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements VoG.w6 {
    private static final w6 E2 = new w6(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f7495e = d2n.j.f63374t.O(2.0d);
    private final Lazy J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Lazy f7496O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Oe.w6 f7497S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f7498Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ouh.j f7499g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f7500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f7501o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7502r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f7503t;

    static final class C extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C f7504n = new C();

        C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("VideoDecoderThread");
            handlerThread.start();
            return handlerThread;
        }
    }

    public static final class CN3 implements LQ.n {
        final /* synthetic */ long rl;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f7506O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f7507n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f7508t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f7508t = obj;
                this.f7506O |= Integer.MIN_VALUE;
                return CN3.this.n(null, this);
            }
        }

        /* JADX INFO: renamed from: Ouh.n$CN3$n, reason: collision with other inner class name */
        public static final class C0254n extends SuspendLambda implements Function2 {
            final /* synthetic */ n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f7509O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f7510n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ long f7511r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f7512t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0254n(LQ.CN3 cn3, Continuation continuation, n nVar, long j2) {
                super(2, continuation);
                this.f7509O = cn3;
                this.J2 = nVar;
                this.f7511r = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0254n c0254n = new C0254n(this.f7509O, continuation, this.J2, this.f7511r);
                c0254n.f7512t = obj;
                return c0254n;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f7510n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LQ.Ml ml = new LQ.Ml(this.f7509O, (TFv.CN3) this.f7512t);
                    if (!this.J2.f7498Z) {
                        if (this.J2.isInitialized()) {
                            Wre wre = this.J2.new Wre(ml, this.f7511r, null);
                            this.f7510n = 1;
                            if (Lu.J2(wre, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new IllegalStateException("The decoder is not initialized");
                        }
                    } else {
                        throw new IllegalStateException("The decoder is released");
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((C0254n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public CN3(long j2) {
            this.rl = j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j jVar2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f7506O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f7506O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f7508t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f7506O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new C0254n(fux2, null, n.this, this.rl));
                    jVar.f7507n = fux2;
                    jVar.f7506O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    jVar2 = e2;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                        return new j.n(jVar2.n());
                    }
                    throw jVar2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) jVar.f7507n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    jVar2 = e3;
                    if (jVar2.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    static final class Dsr extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7514n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7515t;

        Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7515t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.xMQ(null, null, null, this);
        }
    }

    static final class I28 extends Lambda implements Function0 {
        I28() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final YF.I28 invoke() {
            Function1 function1 = n.this.f7500n;
            Looper looper = n.this.te().getLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "thread.looper");
            return YF.Wre.t((Handler) function1.invoke(looper), null, 1, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private final class Ml extends MediaCodecVideoRenderer {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final o7q f7517O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f7518n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ n f7519r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f7520t;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        private final class j implements VoG.j {
            final /* synthetic */ Ml J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private boolean f7521O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f7522n;
            private final int nr;
            private final RK.j rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final MediaCodecAdapter f7523t;

            /* JADX INFO: renamed from: Ouh.n$Ml$j$j, reason: collision with other inner class name */
            static final class C0255j extends SuspendLambda implements Function2 {
                final /* synthetic */ n J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Ml f7524O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f7525n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0255j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0255j(Ml ml, n nVar, Continuation continuation) {
                    super(2, continuation);
                    this.f7524O = ml;
                    this.J2 = nVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return j.this.new C0255j(this.f7524O, this.J2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws InterruptedException {
                    Object nVar;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7525n == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!j.this.f7521O) {
                            j.this.f7521O = true;
                            if (this.f7524O.f7518n != j.this.nr) {
                                return new j.w6(Boxing.boxBoolean(false));
                            }
                            n nVar2 = this.J2;
                            nVar2.f7501o--;
                            if (j.this.f7523t != this.f7524O.getCodec()) {
                                return new j.w6(Boxing.boxBoolean(false));
                            }
                            j.C0208j c0208j = LQ.j.f6082n;
                            Ml ml = this.f7524O;
                            j jVar = j.this;
                            try {
                                ml.renderOutputBufferV21(jVar.f7523t, jVar.f7522n, d2n.Ml.xMQ(jVar.n().rl()), jVar.n().rl());
                                nVar = new j.w6(Boxing.boxBoolean(true));
                            } catch (InterruptedException e2) {
                                throw e2;
                            } catch (CancellationException e3) {
                                throw e3;
                            } catch (Exception e4) {
                                nVar = new j.n(e4);
                            }
                            if (nVar instanceof j.n) {
                                return new j.n(new uPp.C((Exception) ((j.n) nVar).n()));
                            }
                            if (nVar instanceof j.w6) {
                                return nVar;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("The output frame can be rendered only once");
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            public j(Ml ml, int i2, RK.j info, MediaCodecAdapter bufferCodec, int i3) {
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(bufferCodec, "bufferCodec");
                this.J2 = ml;
                this.f7522n = i2;
                this.rl = info;
                this.f7523t = bufferCodec;
                this.nr = i3;
            }

            @Override // VoG.j
            public RK.j n() {
                return this.rl;
            }

            @Override // VoG.j
            public Object rl(Continuation continuation) {
                CoroutineContext coroutineContextPlus = this.J2.f7519r.g().plus(V1.f3456n);
                Ml ml = this.J2;
                return GJW.Dsr.Uo(coroutineContextPlus, new C0255j(ml, ml.f7519r, null), continuation);
            }

            public String toString() {
                return "OutputFrameImpl[codec=" + this.J2.getCodec() + ", index=" + this.f7522n + ", info=" + n() + ']';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(n nVar, Context context, MediaCodecAdapter.Factory mediaCodecAdapterFactory, MediaCodecSelector mediaCodecSelector) {
            super(context, mediaCodecAdapterFactory, mediaCodecSelector, 0L, true, null, null, 0);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mediaCodecAdapterFactory, "mediaCodecAdapterFactory");
            Intrinsics.checkNotNullParameter(mediaCodecSelector, SzFNXybiSxdx.BmQ);
            this.f7519r = nVar;
            this.f7517O = o7q.o();
        }

        public final void J2(Format format) throws ExoPlaybackException {
            Intrinsics.checkNotNullParameter(format, "format");
            FormatHolder formatHolder = new FormatHolder();
            formatHolder.format = format;
            DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = onInputFormatChanged(formatHolder);
            if (decoderReuseEvaluationOnInputFormatChanged == null) {
                if (getCodec() == null) {
                    throw new IllegalStateException("The codec was not initialized");
                }
            } else {
                throw new IllegalStateException(("The codec is already initialized, reuse evaluation: " + decoderReuseEvaluationOnInputFormatChanged).toString());
            }
        }

        public final void KN(Surface surface) throws ExoPlaybackException {
            Intrinsics.checkNotNullParameter(surface, "surface");
            handleMessage(1, surface);
        }

        public final boolean O() {
            return this.f7520t;
        }

        public final void Uo() throws ExoPlaybackException {
            render(0L, 0L);
        }

        public final void nr() throws ExoPlaybackException {
            handleMessage(5, Integer.MIN_VALUE);
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected void onCodecError(Exception codecError) {
            Intrinsics.checkNotNullParameter(codecError, "codecError");
            Ouh.j jVar = this.f7519r.f7499g;
            if (jVar != null) {
                jVar.n(new uPp.C(codecError));
            }
            super.onCodecError(codecError);
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected void onOutputFormatChanged(Format format, MediaFormat mediaFormat) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.f7519r.f7497S = new Oe.w6(format.width, format.height);
            super.onOutputFormatChanged(format, mediaFormat);
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
        protected void onPositionReset(long j2, boolean z2) throws ExoPlaybackException {
            this.f7517O.clear();
            this.J2 = false;
            this.f7520t = false;
            super.onPositionReset(j2, z2);
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected void onQueueInputBuffer(DecoderInputBuffer buffer) throws ExoPlaybackException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            super.onQueueInputBuffer(buffer);
            this.f7517O.add(d2n.Ml.rl(d2n.Ml.f63370t.n(buffer.timeUs)));
            o7q queuedFrameTimestamps = this.f7517O;
            Intrinsics.checkNotNullExpressionValue(queuedFrameTimestamps, "queuedFrameTimestamps");
            if (queuedFrameTimestamps.size() > 64) {
                this.f7519r.iF().n(new o.n("Decoder failed to produce any output after receiving more than 64 frames.\nFrames missing: " + this.f7517O));
            }
            this.f7520t = true;
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected boolean processOutputBuffer(long j2, long j3, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i2, int i3, int i5, long j4, boolean z2, boolean z3, Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (mediaCodecAdapter == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Ouh.j jVarIF = this.f7519r.iF();
            if (!jVarIF.nr()) {
                return false;
            }
            this.J2 = true;
            long jN = d2n.Ml.f63370t.n(j4);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f7517O.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queuedFrameTimestamps.iterator()");
            while (it.hasNext()) {
                d2n.Ml time = (d2n.Ml) it.next();
                Intrinsics.checkNotNullExpressionValue(time, "time");
                if (d2n.Ml.nr(time.Ik(), jN) >= 0) {
                    break;
                }
                arrayList.add(time);
                it.remove();
            }
            if (arrayList.size() > 32) {
                jVarIF.n(new o.n("Decoder dropped too many frames!Dropped frames timestamps: " + arrayList));
                return false;
            }
            int i7 = this.f7519r.f7502r + 1;
            Oe.w6 w6Var = this.f7519r.f7497S;
            if (w6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentFrameSize");
                w6Var = null;
            }
            if (!ILs.C.gh(jVarIF.rl().nr(new j(this, i2, new RK.j(jN, w6Var, i7, null), mediaCodecAdapter, this.f7518n)))) {
                return false;
            }
            this.f7517O.remove(d2n.Ml.rl(jN));
            this.f7519r.f7502r++;
            this.f7519r.f7501o++;
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected void renderToEndOfStream() throws ExoPlaybackException {
            Ouh.j jVarIF = this.f7519r.iF();
            o7q queuedFrameTimestamps = this.f7517O;
            Intrinsics.checkNotNullExpressionValue(queuedFrameTimestamps, "queuedFrameTimestamps");
            if (queuedFrameTimestamps.size() > 64 || !this.J2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoder failed to produce an output for some frames received in input.\nThere are ");
                o7q queuedFrameTimestamps2 = this.f7517O;
                Intrinsics.checkNotNullExpressionValue(queuedFrameTimestamps2, "queuedFrameTimestamps");
                sb.append(queuedFrameTimestamps2.size());
                sb.append(" frames missing with timestamps ");
                sb.append(this.f7517O);
                jVarIF.n(new o.n(sb.toString()));
            }
            this.f7517O.clear();
            super.renderToEndOfStream();
        }

        @Override // com.google.android.exoplayer2.video.MediaCodecVideoRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
        protected void resetCodecStateForFlush() {
            this.f7518n++;
            this.f7519r.f7501o = 0;
            super.resetCodecStateForFlush();
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.w6 J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7528n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f7529r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f7530t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ n f7531O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f7532n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ ILs.CN3 f7533o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ LQ.w6 f7534r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f7535t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(n nVar, long j2, LQ.w6 w6Var, ILs.CN3 cn3, Continuation continuation) {
                super(2, continuation);
                this.f7531O = nVar;
                this.J2 = j2;
                this.f7534r = w6Var;
                this.f7533o = cn3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f7531O, this.J2, this.f7534r, this.f7533o, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LQ.w6 w6Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f7535t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w6Var = (LQ.w6) this.f7532n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f7531O.fD(this.J2);
                    LQ.w6 w6Var2 = this.f7534r;
                    n nVar = this.f7531O;
                    Ouh.j jVar = new Ouh.j(AbstractC1363t.az(get$context()), this.f7533o);
                    this.f7532n = w6Var2;
                    this.f7535t = 1;
                    Object objNY = nVar.nY(jVar, this);
                    if (objNY == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w6Var = w6Var2;
                    obj = objNY;
                }
                w6Var.O((LQ.j) obj);
                r.j.n(this.f7533o, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(LQ.w6 w6Var, long j2, Continuation continuation) {
            super(2, continuation);
            this.J2 = w6Var;
            this.f7529r = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Wre wre = n.this.new Wre(this.J2, this.f7529r, continuation);
            wre.f7530t = obj;
            return wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7528n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f7530t;
                ILs.CN3 cn3Rl = ILs.aC.rl(Integer.MAX_VALUE, null, null, 6, null);
                GJW.C.nr(vdVar, n.this.g(), null, new j(n.this, this.f7529r, this.J2, cn3Rl, null), 2, null);
                LQ.w6 w6Var = this.J2;
                this.f7528n = 1;
                if (TFv.fuX.XQ(w6Var, cn3Rl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class aC extends SuspendLambda implements Function2 {
        final /* synthetic */ Format J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Surface f7536O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7537n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SampleStream f7538r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((aC) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        aC(Surface surface, Format format, SampleStream sampleStream, Continuation continuation) {
            super(2, continuation);
            this.f7536O = surface;
            this.J2 = format;
            this.f7538r = sampleStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new aC(this.f7536O, this.J2, this.f7538r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ExoPlaybackException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7537n == 0) {
                ResultKt.throwOnFailure(obj);
                n.this.f7503t.init(0, PlayerId.UNSET);
                n.this.f7503t.KN(this.f7536O);
                n.this.f7503t.nr();
                n.this.f7503t.enable(RendererConfiguration.DEFAULT, new Format[]{this.J2}, new C0256n(n.this, this.f7538r), 0L, true, false, 0L, 0L);
                n.this.f7503t.start();
                n.this.f7503t.setCurrentStreamFinal();
                n.this.f7503t.J2(this.J2);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class fuX extends ContinuationImpl {
        long E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7540O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f7541S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        int f7542T;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f7544Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f7545e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7546g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7547n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f7548o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7549r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7550t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7545e = obj;
            this.f7542T |= Integer.MIN_VALUE;
            return n.this.nY(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f7551n = new j();

        j() {
            super(1, Handler.class, "<init>", "<init>(Landroid/os/Looper;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Handler invoke(Looper p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new Handler(p0);
        }
    }

    /* JADX INFO: renamed from: Ouh.n$n, reason: collision with other inner class name */
    private final class C0256n implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SampleStream f7552n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ n f7553t;

        public C0256n(n nVar, SampleStream sampleStream) {
            Intrinsics.checkNotNullParameter(sampleStream, "sampleStream");
            this.f7553t = nVar;
            this.f7552n = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.f7552n.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.f7552n.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int i2) {
            Intrinsics.checkNotNullParameter(formatHolder, "formatHolder");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            if (this.f7553t.iF().nr()) {
                return this.f7552n.readData(formatHolder, buffer, i2);
            }
            return -3;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            return this.f7552n.skipData(j2);
        }
    }

    private static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }
    }

    public n(Context context, MediaCodecAdapter.Factory mediaCodecAdapterFactory, MediaCodecSelector mediaCodecSelector, Function1 handlerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCodecAdapterFactory, "mediaCodecAdapterFactory");
        Intrinsics.checkNotNullParameter(mediaCodecSelector, "mediaCodecSelector");
        Intrinsics.checkNotNullParameter(handlerFactory, "handlerFactory");
        this.f7500n = handlerFactory;
        this.f7503t = new Ml(this, context, mediaCodecAdapterFactory, mediaCodecSelector);
        this.f7496O = LazyKt.lazy(C.f7504n);
        this.J2 = LazyKt.lazy(new I28());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LQ.j fD(long j2) {
        try {
            if (this.f7503t.O()) {
                this.f7503t.resetPosition(d2n.Ml.xMQ(j2));
            }
            this.f7503t.setCurrentStreamFinal();
            return new j.w6(Unit.INSTANCE);
        } catch (MediaCodec.CodecException e2) {
            return new j.n(new uPp.C(e2));
        } catch (ExoPlaybackException e3) {
            return new j.n(new uPp.C(e3));
        } catch (CancellationException e4) {
            throw e4;
        } catch (IllegalStateException e5) {
            return new j.n(new uPp.C(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final YF.I28 g() {
        return (YF.I28) this.J2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ouh.j iF() {
        Ouh.j jVar = this.f7499g;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("No current request available");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0195: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:406), block:B:87:0x0195 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0196: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:407), block:B:87:0x0195 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0197: MOVE (r12 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:408), block:B:87:0x0195 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[Catch: all -> 0x0057, CancellationException -> 0x005f, IllegalStateException -> 0x0124, CodecException -> 0x0128, ExoPlaybackException -> 0x012c, TryCatch #0 {CancellationException -> 0x005f, blocks: (B:12:0x004f, B:33:0x0091, B:35:0x0097, B:37:0x009f, B:40:0x00ab, B:52:0x00fa, B:54:0x010c, B:56:0x0117, B:43:0x00c0, B:44:0x00e2, B:51:0x00f2, B:67:0x0130), top: B:110:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x011e -> B:60:0x0120). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nY(Ouh.j jVar, Continuation continuation) throws Throwable {
        fuX fux;
        LQ.CN3 cn3;
        LQ.CN3 fux2;
        LQ.CN3 cn32;
        LQ.CN3 cn33;
        LQ.CN3 cn34;
        LQ.CN3 fux3;
        LQ.CN3 cn35;
        LQ.j nVar;
        fuX.j e2;
        Ouh.j jVar2;
        n nVar2;
        LQ.CN3 cn36;
        long jRl;
        n nVar3;
        LQ.CN3 cn37;
        LQ.CN3 cn38;
        LQ.j nVar4;
        LQ.CN3 cn39;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.f7542T;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.f7542T = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object obj = fux.f7545e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.f7542T;
        try {
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    fux3 = new LQ.fuX();
                    try {
                        fux2 = new LQ.fuX();
                        try {
                            if (this.f7499g != null) {
                                throw new IllegalStateException("Cannot overwrite an existing request");
                            }
                            jVar2 = jVar;
                            this.f7499g = jVar2;
                            try {
                                jRl = Ouh.w6.rl();
                                nVar3 = this;
                                nVar2 = nVar3;
                                cn36 = fux2;
                                cn37 = cn36;
                                cn38 = fux3;
                                cn35 = cn38;
                                if (jVar2.nr()) {
                                }
                                LQ.CN3 cn310 = fux2;
                                AbstractC1363t.qie(fux.get$context());
                                nVar4 = new j.w6(Unit.INSTANCE);
                                fux2 = cn310;
                            } catch (MediaCodec.CodecException e3) {
                                e = e3;
                                nVar2 = this;
                                cn36 = fux2;
                                cn35 = fux3;
                                nVar4 = new j.n(new uPp.C(e));
                                fux2.O(nVar4);
                                cn36.O(jVar2.t());
                                Unit unit = Unit.INSTANCE;
                                nVar2.f7499g = null;
                                nVar = new j.w6(Unit.INSTANCE);
                                return new j.w6((Unit) fux3.O(nVar));
                            } catch (ExoPlaybackException e4) {
                                e = e4;
                                nVar2 = this;
                                cn36 = fux2;
                                cn35 = fux3;
                                nVar4 = new j.n(new uPp.C(e));
                                fux2.O(nVar4);
                                cn36.O(jVar2.t());
                                Unit unit2 = Unit.INSTANCE;
                                nVar2.f7499g = null;
                                nVar = new j.w6(Unit.INSTANCE);
                                return new j.w6((Unit) fux3.O(nVar));
                            } catch (CancellationException e5) {
                                throw e5;
                            } catch (IllegalStateException e6) {
                                e = e6;
                                nVar2 = this;
                                cn36 = fux2;
                                cn35 = fux3;
                                nVar4 = new j.n(new uPp.C(e));
                                fux2.O(nVar4);
                                cn36.O(jVar2.t());
                                Unit unit22 = Unit.INSTANCE;
                                nVar2.f7499g = null;
                                nVar = new j.w6(Unit.INSTANCE);
                                return new j.w6((Unit) fux3.O(nVar));
                            } catch (Throwable th) {
                                th = th;
                                this.f7499g = null;
                                throw th;
                            }
                        } catch (fuX.j e7) {
                            e = e7;
                            cn33 = fux3;
                            if (e.rl() != fux2) {
                                throw e;
                            }
                            cn35 = fux3;
                            fux3 = cn33;
                            nVar = new j.n(e.n());
                        }
                    } catch (fuX.j e8) {
                        e2 = e8;
                        if (e2.rl() != fux3) {
                            return new j.n(e2.n());
                        }
                        throw e2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jRl = fux.E2;
                    fux2 = (LQ.CN3) fux.f7546g;
                    nVar2 = (n) fux.f7541S;
                    cn36 = (LQ.CN3) fux.f7544Z;
                    cn37 = (LQ.fuX) fux.f7548o;
                    fux3 = (LQ.CN3) fux.f7549r;
                    cn38 = (LQ.CN3) fux.J2;
                    cn35 = (LQ.fuX) fux.f7540O;
                    Ouh.j jVar3 = (Ouh.j) fux.f7550t;
                    n nVar5 = (n) fux.f7547n;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            nVar3 = nVar5;
                            jVar2 = jVar3;
                            Object obj2 = coroutine_suspended;
                            coroutine_suspended = obj2;
                            try {
                                if (jVar2.nr() || nVar3.f7503t.isEnded()) {
                                    LQ.CN3 cn3102 = fux2;
                                    AbstractC1363t.qie(fux.get$context());
                                    nVar4 = new j.w6(Unit.INSTANCE);
                                    fux2 = cn3102;
                                } else {
                                    nVar3.f7503t.Uo();
                                    if (nVar3.f7501o == 0) {
                                        obj2 = coroutine_suspended;
                                        cn39 = fux2;
                                        try {
                                            long jAz = d2n.Ml.az(Ouh.w6.rl(), jRl);
                                            long j2 = jRl;
                                            if (d2n.j.nr(jAz, f7495e) > 0) {
                                                cn38.n(new o.j("The decoder didn't produce any output frame for " + ((Object) d2n.j.S(jAz))));
                                                throw new KotlinNothingValueException();
                                            }
                                            jRl = j2;
                                        } catch (MediaCodec.CodecException e9) {
                                            e = e9;
                                            fux2 = cn39;
                                            nVar4 = new j.n(new uPp.C(e));
                                            fux2.O(nVar4);
                                            cn36.O(jVar2.t());
                                            Unit unit222 = Unit.INSTANCE;
                                            nVar2.f7499g = null;
                                            nVar = new j.w6(Unit.INSTANCE);
                                            return new j.w6((Unit) fux3.O(nVar));
                                        } catch (ExoPlaybackException e10) {
                                            e = e10;
                                            fux2 = cn39;
                                            nVar4 = new j.n(new uPp.C(e));
                                            fux2.O(nVar4);
                                            cn36.O(jVar2.t());
                                            Unit unit2222 = Unit.INSTANCE;
                                            nVar2.f7499g = null;
                                            nVar = new j.w6(Unit.INSTANCE);
                                            return new j.w6((Unit) fux3.O(nVar));
                                        } catch (IllegalStateException e11) {
                                            e = e11;
                                            fux2 = cn39;
                                            nVar4 = new j.n(new uPp.C(e));
                                            fux2.O(nVar4);
                                            cn36.O(jVar2.t());
                                            Unit unit22222 = Unit.INSTANCE;
                                            nVar2.f7499g = null;
                                            nVar = new j.w6(Unit.INSTANCE);
                                            return new j.w6((Unit) fux3.O(nVar));
                                        }
                                    } else {
                                        obj2 = coroutine_suspended;
                                        cn39 = fux2;
                                        jRl = Ouh.w6.rl();
                                    }
                                    fux.f7547n = nVar3;
                                    fux.f7550t = jVar2;
                                    fux.f7540O = cn35;
                                    fux.J2 = cn38;
                                    fux.f7549r = fux3;
                                    fux.f7548o = cn37;
                                    fux.f7544Z = cn36;
                                    fux.f7541S = nVar2;
                                    LQ.CN3 cn311 = cn39;
                                    fux.f7546g = cn311;
                                    fux.E2 = jRl;
                                    fux.f7542T = 1;
                                    if (yg.rl(1L, fux) == obj2) {
                                        return obj2;
                                    }
                                    fux2 = cn311;
                                    coroutine_suspended = obj2;
                                    if (jVar2.nr()) {
                                    }
                                    LQ.CN3 cn31022 = fux2;
                                    AbstractC1363t.qie(fux.get$context());
                                    nVar4 = new j.w6(Unit.INSTANCE);
                                    fux2 = cn31022;
                                }
                            } catch (MediaCodec.CodecException e12) {
                                e = e12;
                            } catch (ExoPlaybackException e13) {
                                e = e13;
                            } catch (IllegalStateException e14) {
                                e = e14;
                            }
                        } catch (CancellationException e15) {
                            throw e15;
                        }
                    } catch (MediaCodec.CodecException e16) {
                        e = e16;
                        jVar2 = jVar3;
                        nVar4 = new j.n(new uPp.C(e));
                        fux2.O(nVar4);
                        cn36.O(jVar2.t());
                        Unit unit222222 = Unit.INSTANCE;
                        nVar2.f7499g = null;
                        nVar = new j.w6(Unit.INSTANCE);
                        return new j.w6((Unit) fux3.O(nVar));
                    } catch (ExoPlaybackException e17) {
                        e = e17;
                        jVar2 = jVar3;
                        nVar4 = new j.n(new uPp.C(e));
                        fux2.O(nVar4);
                        cn36.O(jVar2.t());
                        Unit unit2222222 = Unit.INSTANCE;
                        nVar2.f7499g = null;
                        nVar = new j.w6(Unit.INSTANCE);
                        return new j.w6((Unit) fux3.O(nVar));
                    } catch (IllegalStateException e18) {
                        e = e18;
                        jVar2 = jVar3;
                        nVar4 = new j.n(new uPp.C(e));
                        fux2.O(nVar4);
                        cn36.O(jVar2.t());
                        Unit unit22222222 = Unit.INSTANCE;
                        nVar2.f7499g = null;
                        nVar = new j.w6(Unit.INSTANCE);
                        return new j.w6((Unit) fux3.O(nVar));
                    }
                }
                fux2.O(nVar4);
                cn36.O(jVar2.t());
                Unit unit222222222 = Unit.INSTANCE;
                nVar2.f7499g = null;
                nVar = new j.w6(Unit.INSTANCE);
            } catch (fuX.j e19) {
                e = e19;
                fux2 = cn3;
                cn33 = cn32;
                fux3 = cn34;
            }
            try {
                return new j.w6((Unit) fux3.O(nVar));
            } catch (fuX.j e20) {
                e2 = e20;
                fux3 = cn35;
                if (e2.rl() != fux3) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandlerThread te() {
        return (HandlerThread) this.f7496O.getValue();
    }

    @Override // VoG.w6
    public long KN() {
        long readingPositionUs = this.f7503t.getReadingPositionUs();
        return readingPositionUs == Long.MIN_VALUE ? d2n.Ml.f63370t.nr() : d2n.Ml.f63370t.n(readingPositionUs);
    }

    @Override // VoG.w6
    public boolean isInitialized() {
        return this.f7503t.getState() == 2;
    }

    @Override // VoG.w6
    public LQ.n t(long j2) {
        if (this.f7498Z) {
            throw new IllegalStateException("The decoder is released");
        }
        if (isInitialized()) {
            return new CN3(j2);
        }
        throw new IllegalStateException("The decoder is not initialized");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // VoG.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object xMQ(SampleStream sampleStream, Format format, Surface surface, Continuation continuation) {
        Dsr dsr;
        n nVar;
        ExoPlaybackException exoPlaybackException;
        n nVar2;
        YF.I28 i28G;
        Object nVar3;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object obj = dsr.f7515t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f7498Z) {
                throw new IllegalStateException("The decoder is released");
            }
            if (isInitialized()) {
                throw new IllegalStateException("The decoder is already initialized");
            }
            try {
                i28G = g();
                nVar = this;
            } catch (ExoPlaybackException e2) {
                e = e2;
                nVar = this;
            }
            try {
                aC aCVar = nVar.new aC(surface, format, sampleStream, null);
                dsr.f7514n = nVar;
                dsr.J2 = 1;
                if (GJW.Dsr.Uo(i28G, aCVar, dsr) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar2 = nVar;
                nVar3 = new j.w6(Unit.INSTANCE);
            } catch (ExoPlaybackException e3) {
                e = e3;
                exoPlaybackException = e;
                nVar2 = nVar;
                nVar3 = new j.n(VH.j.n(exoPlaybackException));
                if (nVar3 instanceof j.n) {
                }
                return nVar3;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (n) dsr.f7514n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (ExoPlaybackException e4) {
                exoPlaybackException = e4;
                nVar3 = new j.n(VH.j.n(exoPlaybackException));
                if (nVar3 instanceof j.n) {
                }
                return nVar3;
            }
            try {
                nVar3 = new j.w6(Unit.INSTANCE);
            } catch (ExoPlaybackException e5) {
                exoPlaybackException = e5;
                nVar3 = new j.n(VH.j.n(exoPlaybackException));
            }
        }
        if (nVar3 instanceof j.n) {
            nVar2.release();
        } else {
            boolean z2 = nVar3 instanceof j.w6;
        }
        return nVar3;
    }

    @Override // w9.fuX
    public void release() {
        Object objM313constructorimpl;
        Object objM313constructorimpl2;
        Object objM313constructorimpl3;
        te().quitSafely();
        this.f7498Z = true;
        if (isInitialized()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                this.f7503t.stop();
                objM313constructorimpl2 = Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl2);
            if (thM316exceptionOrNullimpl != null) {
                Log.e("VideoDecoder", "Renderer stop failed during release", thM316exceptionOrNullimpl);
            }
            try {
                this.f7503t.disable();
                objM313constructorimpl3 = Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM313constructorimpl3 = Result.m313constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM316exceptionOrNullimpl2 = Result.m316exceptionOrNullimpl(objM313constructorimpl3);
            if (thM316exceptionOrNullimpl2 != null) {
                Log.e("VideoDecoder", "Renderer disable failed during release", thM316exceptionOrNullimpl2);
            }
        }
        try {
            Result.Companion companion4 = Result.INSTANCE;
            this.f7503t.reset();
            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion5 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM316exceptionOrNullimpl3 = Result.m316exceptionOrNullimpl(objM313constructorimpl);
        if (thM316exceptionOrNullimpl3 != null) {
            Log.e("VideoDecoder", "Renderer reset failed during release", thM316exceptionOrNullimpl3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector DEFAULT, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        factory = (i2 & 2) != 0 ? new DefaultMediaCodecAdapterFactory() : factory;
        if ((i2 & 4) != 0) {
            DEFAULT = MediaCodecSelector.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        this(context, factory, DEFAULT, (i2 & 8) != 0 ? j.f7551n : function1);
    }
}
